package com.example.danyaigorapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.danyaigorapp.appnavigation.AppNavigation
import com.example.danyaigorapp.appnavigation.Routes
import com.example.danyaigorapp.schedulegame.ScheduleScreen
import com.example.danyaigorapp.singup.CreateAccount
import com.example.danyaigorapp.singup.CreateAccountVM
import com.example.danyaigorapp.ui.theme.DanyaIgorAppTheme

class MainActivity : ComponentActivity() {

    @SuppressLint("ViewModelConstructorInComposable")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DanyaIgorAppTheme {
                AppNavigation()

            }
        }
    }
}
