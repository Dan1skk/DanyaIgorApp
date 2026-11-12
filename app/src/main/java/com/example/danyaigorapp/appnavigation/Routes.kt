package com.example.danyaigorapp.appnavigation

sealed class Routes(

    val route:String
) {

    object Login : Routes("Login")
    object LandingScreen : Routes("LandingScreen")
}