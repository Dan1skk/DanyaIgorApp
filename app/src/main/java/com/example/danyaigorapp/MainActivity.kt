package com.example.danyaigorapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.danyaigorapp.appnavigation.AppNavigation
import com.example.diuikit.ui.theme.DIuikitTheme

class MainActivity : ComponentActivity() {

    @SuppressLint("ViewModelConstructorInComposable")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DIuikitTheme{

                AppNavigation()

            }
        }
    }
}
