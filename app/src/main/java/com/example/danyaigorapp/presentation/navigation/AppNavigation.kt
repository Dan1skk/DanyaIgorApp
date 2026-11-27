package com.example.danyaigorapp.appnavigation

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.cleanarchitecture.domain.repository.AuthRepository
import com.example.cleanarchitecture.domain.usecase.SignUpUseCase
import com.example.danyaigorapp.presentation.landing.LandingScreen
import com.example.danyaigorapp.presentation.schedulegame.ScheduleScreen
import com.example.danyaigorapp.feature.signin.Login
import com.example.danyaigorapp.feature.signin.LoginVM
import com.example.danyaigorapp.feature.singup.presentation.CreateAccount
import com.example.danyaigorapp.feature.singup.presentation.CreateAccountVM
import com.example.danyaigorapp.presentation.splashscreen.SplashScreen
import com.example.danyaigorapp.presentation.discovercombats.DiscoverCombatsScreen

@SuppressLint("ViewModelConstructorInComposable")
@Composable
fun AppNavigation(){

    val navController = rememberNavController()
    NavHost(navController, startDestination = Routes.SplashScreen.route){

        composable(Routes.Login.route) {
            Login(navController)
        }

        composable(Routes.LandingScreen.route) {
            LandingScreen(navController)
        }

        composable(Routes.CreateAccount.route){
            CreateAccount(navController)
        }

        composable(Routes.SplashScreen.route){
            SplashScreen(navController)
        }

        composable(Routes.ScheduleGame.route){
            ScheduleScreen(navController)
        }

        composable(Routes.DiscoverCombats.route) {
            DiscoverCombatsScreen(navController)
        }




    }
}