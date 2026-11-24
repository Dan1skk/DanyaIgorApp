package com.example.networklayer

interface AuthHttpClient{
    suspend fun login(email: String, password: String) : String

    suspend fun logout()
}