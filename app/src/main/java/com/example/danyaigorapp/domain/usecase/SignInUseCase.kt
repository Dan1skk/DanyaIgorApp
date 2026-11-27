package com.example.cleanarchitecture.domain.usecase

import com.example.cleanarchitecture.domain.model.UserDataModel
import com.example.cleanarchitecture.domain.repository.AuthRepository

class SignInUseCase (
    private val repository: AuthRepository
){
    suspend operator fun invoke(
        email: String,
        password: String
    ): UserDataModel{
        if (email.isBlank()){
            throw IllegalArgumentException("Почта не может быть пустой")
        }
        if (!email.contains("@")){
            throw IllegalArgumentException("Введите корруктную почту")
        }
        if (password.length < 6){
            throw IllegalArgumentException("Пароль должен бфть минимум 6 символов")
        }

        return repository.signIn(email, password)
    }
}