package com.example.danyaigorapp.data.repository

import com.example.cleanarchitecture.domain.model.UserDataModel
import com.example.cleanarchitecture.domain.repository.AuthRepository
import com.example.danyaigorapp.data.model.UserProfileDto
import com.example.danyaigorapp.data.network.SupaBase
import io.github.jan.supabase.auth.OtpType
import io.github.jan.supabase.auth.auth
import io.github.jan.supabase.auth.providers.builtin.Email
import io.github.jan.supabase.postgrest.from


class AuthRepositoryIml : AuthRepository {
    private val supabase = SupaBase.supabase

    private suspend fun isUserAuth(): String? {
        supabase.auth.awaitInitialization()
        return supabase.auth.currentUserOrNull()?.id
    }

    override suspend fun signUp(
        name: String,
        userName: String,
        phone: String,
        email: String,
        password: String
    ): UserDataModel {
        try {
            supabase.auth.signUpWith(Email) {
                this.email = email
                this.password = password
            }

            val userId = isUserAuth() ?: throw IllegalArgumentException("Пользователь не найден")

            val userData = UserProfileDto(
                id = userId,
                name = name,
                userName = userName,
                phone = phone,
                email = email
            )
            supabase.from("profiles").insert(userData)

            return UserDataModel(
                id = userId,
                name = name,
                userName = userName,
                phone = phone,
                email = email
            )


        } catch (e: Exception) {
            throw Exception(mapAuthError(e))
        }

    }

    override suspend fun signIn(
        email: String,
        password: String
    ): UserDataModel {
        try {
            supabase.auth.signInWith(Email) {
                this.email = email
                this.password = password
            }

            val userId = isUserAuth() ?: throw IllegalArgumentException("Пользоватаель не найден")

            val userData = supabase.from("profiles")
                .select {
                    filter {
                        eq("id", userId)
                    }
                }
                .decodeSingle<UserProfileDto>()

            return UserDataModel(
                id = userData.id,
                name = userData.name,
                userName = userData.userName,
                phone = userData.phone,
                email = userData.email
            )

        }catch(e: Exception) {
            throw Exception(mapAuthError(e))
        }

    }

    override suspend fun signWithFacebook(email: String): UserDataModel {
        TODO("Пока не реализовано")
    }

    override suspend fun signWithGoogle(email: String): UserDataModel {
        TODO("Пока не реализовано")
    }

    private fun mapAuthError(e: Exception): String {
        val rawMessage = e.message.orEmpty()
        return when {
            rawMessage.contains("invalid_credentials", ignoreCase = true) -> "Неверный email или пароль"
            rawMessage.contains("user_already_exists", ignoreCase = true) || rawMessage.contains("already registered", ignoreCase = true) -> "Пользователь с такой почтой уже зарегистрирован"
            rawMessage.contains("weak_password", ignoreCase = true) -> "Пароль слишком простой (минимум 6 символов)"
            rawMessage.contains("Unable to resolve host", ignoreCase = true) || rawMessage.contains("timeout", ignoreCase = true) -> "Нет подключения к интернету"
            else ->
                "Ошибка сервера. Попробуйте позже"
        }
    }


}



