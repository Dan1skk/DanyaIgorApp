package com.example.danyaigorapp.landing

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.danyaigorapp.R
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.ui.layout.ContentScale
import androidx.navigation.NavController
import com.example.danyaigorapp.appnavigation.Routes


@Composable
fun LandingScreen(
    navController: NavController
){

    Scaffold(
        topBar = {LandingTopBar()},

        bottomBar = {LandingBottomBar()}


    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(innerPadding)
        ) {

            LandingCard(header = "Schedule",
                description = "Easily schedule event/games then find like minded players for battle. You up for it?",
                image = R.drawable.image_5,
                route = { navController.navigate(Routes.Login.route) }
            )

            Spacer(modifier = Modifier.height(10.dp))

            LandingCard(header = "Statistics",
                description = "All data from previous and upcoming games can be found here ",
                image = R.drawable.image_6,
                route = { navController.navigate(Routes.Login.route) }
            )

            Spacer(modifier = Modifier.height(10.dp))

            LandingCard(header = "Discover  Combats",
                description = "Find out what’s new and compete among players with new challenges and earn cash with game points ",
                image = R.drawable.image_7,
                route = { navController.navigate(Routes.Login.route) }
            )

            Spacer(modifier = Modifier.height(10.dp))

            LandingCard(header = "Message Players",
                description = "Found the profile of a player that interests you? Start a conversation",
                image = R.drawable.image_8,
                route = { navController.navigate(Routes.Login.route) }
            )

            Spacer(modifier = Modifier.height(10.dp))

        }



    }

}