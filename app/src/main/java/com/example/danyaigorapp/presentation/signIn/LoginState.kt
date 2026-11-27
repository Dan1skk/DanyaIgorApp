package com.example.danyaigorapp.feature.signin

data class LoginState(

    var email: String = "",
    var password: String = "",
    val isLoading: Boolean = false,
    val errorMessage: String? = null,
    val isSuccess: Boolean = false
)