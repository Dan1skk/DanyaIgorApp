package com.example.cleanarchitecture.domain.usecase

import com.example.cleanarchitecture.domain.model.UserDataModel
import com.example.cleanarchitecture.domain.repository.AuthRepository
import kotlin.String

class SignUpUseCase (
    private val repository: AuthRepository
){
    suspend operator fun invoke(
        fullName: String,
        userName: String,
        phone: String,
        email: String,
        password: String,
        confirmPassword: String
    ): UserDataModel {
        if (fullName.isBlank() || userName.isBlank() || email.isBlank() || phone.isBlank() || password.isBlank() || confirmPassword.isBlank()) {
            throw IllegalArgumentException("Поле не может быть пустым")
        }

        if (!email.contains("@")) {
            throw IllegalArgumentException("Некорректная электронная почта")
        }

        if (password.length < 6) {
            throw IllegalArgumentException("Пароль должен быть больше 6 символов")
        }

        if (password != confirmPassword) {
            throw IllegalArgumentException("Пароли не совпадают")
        }

        return repository.signUp(
            name = fullName,
            userName = userName,
            phone = phone,
            email = email,
            password = password
        )
    }
}