package com.example.danyaigorapp.singup

data class CreateAccountState(

    var full_name: String = "",
    var user_name: String = "",
    var phone: String = "",
    var email: String = "",
    var password: String = "",
    var conf_password: String = ""
)