package com.example.danyaigorapp.presentation.landing

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.DrawerValue
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.danyaigorapp.R
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.NavController
import com.example.danyaigorapp.appnavigation.Routes
import com.example.danyaigorapp.presentation.landing.side.SideMenu
import com.example.diuikit.components.LandingBottomBar
import kotlinx.coroutines.launch


@Composable
fun LandingScreen(
    navController: NavController
){
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            SideMenu(
                navController = navController,
                onLogoutClick = {
                    scope.launch { drawerState.close() }
                    navController.navigate("LandingScreen"){
                        popUpTo(0)
                    }
                }
            )
        }
    ) {
        Scaffold(
            topBar = {LandingTopBar(onMenuClick = {
                scope.launch { drawerState.open() }
            })},

            bottomBar = {LandingBottomBar(
                navController = navController)}


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
                    route = { navController.navigate(Routes.ScheduleGame.route) }
                )

                Spacer(modifier = Modifier.height(10.dp))

                LandingCard(header = "Statistics",
                    description = "All data from previous and upcoming games can be found here ",
                    image = R.drawable.image_6,
                    route = { navController.navigate(Routes.LandingScreen.route) }
                )

                Spacer(modifier = Modifier.height(10.dp))

                LandingCard(header = "Discover  Combats",
                    description = "Find out what’s new and compete among players with new challenges and earn cash with game points ",
                    image = R.drawable.image_7,
                    route = { navController.navigate(Routes.DiscoverCombats.route) }
                )

                Spacer(modifier = Modifier.height(10.dp))

                LandingCard(header = "Message Players",
                    description = "Found the profile of a player that interests you? Start a conversation",
                    image = R.drawable.image_8,
                    route = { navController.navigate(Routes.LandingScreen.route) }
                )

                Spacer(modifier = Modifier.height(10.dp))

            }



        }


    }


}