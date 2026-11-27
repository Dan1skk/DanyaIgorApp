package com.example.danyaigorapp.presentation.discovercombats

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
//import com.example.danyaigorapp.landing.LandingBottomBar
import com.example.diuikit.components.LandingBottomBar

//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun DPR() {
//    DiscoverCombatsScreen()
//}

@Composable
fun DiscoverCombatsScreen(
    navController: NavController
){
    Scaffold(

        bottomBar = { LandingBottomBar(navController = navController)},
        contentWindowInsets = WindowInsets(0.dp),
        containerColor = Color.Transparent,

        ) {innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxWidth()
        ) {

            SearchPlace()

            LazyColumn(
                Modifier.fillMaxWidth().padding(innerPadding)
            ) { }
        }


    }



}