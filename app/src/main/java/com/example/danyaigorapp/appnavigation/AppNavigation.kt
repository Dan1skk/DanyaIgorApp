package com.example.danyaigorapp.appnavigation

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.danyaigorapp.landing.LandingScreen
import com.example.danyaigorapp.signin.Login
import com.example.danyaigorapp.signin.LoginVM
import com.example.danyaigorapp.singup.CreateAccount
import com.example.danyaigorapp.singup.CreateAccountVM
import com.example.danyaigorapp.splashscreen.SplashScreen

@SuppressLint("ViewModelConstructorInComposable")
@Composable
fun AppNavigation(){

    val navController = rememberNavController()
    NavHost(navController, startDestination = Routes.SplashScreen.route){

        composable(Routes.Login.route) {
            Login(navController, LoginVM())
        }

        composable(Routes.LandingScreen.route) {
            LandingScreen(navController)
        }

        composable(Routes.CreateAccount.route){
            CreateAccount(navController, CreateAccountVM())
        }

        composable(Routes.SplashScreen.route){
            SplashScreen(navController)
        }





    }
}