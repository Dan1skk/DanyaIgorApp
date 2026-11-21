package com.example.danyaigorapp.discovercombats

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.overscroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.movableContentWithReceiverOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.isTraversalGroup
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.traversalIndex
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.danyaigorapp.R
import androidx.compose.runtime.setValue
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
//import com.example.danyaigorapp.landing.LandingBottomBar
import com.example.danyaigorapp.schedulegame.ScheduleScreen
import com.example.danyaigorapp.schedulegame.successfulpublisced.SuccessfulMessage

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

        bottomBar = {DiscoverCombatsBottomBar(navController = navController)},
        contentWindowInsets = WindowInsets(0.dp),
        containerColor = Color.Transparent,

        ) {innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .systemBarsPadding()
        ) {

            SearchPlace()

            LazyColumn(
                Modifier.fillMaxWidth().padding(innerPadding)
            ) { }
        }


    }



}