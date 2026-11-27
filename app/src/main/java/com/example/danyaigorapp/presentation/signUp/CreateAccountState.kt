package com.example.danyaigorapp.feature.singup.presentation

data class CreateAccountState(

    var full_name: String = "",
    var user_name: String = "",
    var phone: String = "",
    var email: String = "",
    var password: String = "",
    var conf_password: String = "",
    val isLoading: Boolean = false,
    val errorMessage: String? = null,
    val isSuccess: Boolean = false
)