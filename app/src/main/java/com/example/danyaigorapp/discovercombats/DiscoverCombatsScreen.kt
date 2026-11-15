package com.example.danyaigorapp.discovercombats

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.R
import androidx.navigation.compose.rememberNavController
import com.example.danyaigorapp.schedulegame.successfulpublisced.SuccessfulMessage

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DPR() {
    DiscoverCombatsScreen()
}

@Composable
fun DiscoverCombatsScreen(){

    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        val Gradient = Brush.linearGradient(
            colors = listOf(
                Color(0xFFFF6480),
                Color(0xFFF22E63)
            )
        )

        Box(
            modifier = Modifier.fillMaxWidth().background(Gradient),

        ){

        }

    }

}