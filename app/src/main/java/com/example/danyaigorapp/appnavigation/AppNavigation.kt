package com.example.danyaigorapp.appnavigation

import android.annotation.SuppressLint
import android.app.appfunctions.AppFunctionName
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.danyaigorapp.landing.LandingScreen
import com.example.danyaigorapp.signin.Login
import com.example.danyaigorapp.signin.SingInVM

@SuppressLint("ViewModelConstructorInComposable")
@Composable
fun AppNavigation(){

    val navController = rememberNavController()
    NavHost(navController, startDestination = Routes.Login.route){

        composable(Routes.Login.route) {
            Login(navController, SingInVM())
        }

        composable(Routes.LandingScreen.route) {
            LandingScreen(navController)
        }

        

    }
}