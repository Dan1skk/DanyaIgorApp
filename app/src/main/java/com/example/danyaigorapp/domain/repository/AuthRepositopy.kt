package com.example.cleanarchitecture.domain.repository

import com.example.cleanarchitecture.domain.model.UserDataModel

interface AuthRepository{

    suspend fun signUp(
        name: String,
        userName: String,
        phone: String,
        email: String,
        password: String
    ): UserDataModel

    suspend fun signIn(
        email: String,
        password: String
    ): UserDataModel

    suspend fun signWithGoogle(
        email: String
    ): UserDataModel

    suspend fun signWithFacebook(
        email: String
    ): UserDataModel

}