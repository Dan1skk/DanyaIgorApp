package com.example.danyaigorapp.discovercombats

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.overscroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.ModalNavigationDrawer
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
import com.example.danyaigorapp.schedulegame.successfulpublisced.SuccessfulMessage

//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun DPR() {
//    DiscoverCombatsScreen()
//}

@Composable
fun DiscoverCombatsScreen(

){


    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(brush = Brush.linearGradient(
            colors = listOf(
                Color(0xFFFF6480),
                Color(0xFFF22E63)
            )))
            .size(266.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 30.dp)
        ) {
            Spacer(modifier = Modifier.height(60.dp))

            Icon(
                painter = painterResource(R.drawable.back_icon),
                contentDescription = null,
                tint = Color.White,
                )

            Spacer(modifier = Modifier.height(35.dp))

            Row(
                modifier = Modifier.fillMaxWidth()
            ){
                Text(
                    "Discover \nCombats",
                    fontSize = 22.sp,
                    fontWeight = FontWeight(700),
                    color = Color.White

                )

                Spacer(modifier = Modifier.weight(1f))

                Text(
                    "FILTER",
                    fontSize = 12.sp,
                    fontWeight = FontWeight(700),
                    color = Color.White,
                    modifier = Modifier.padding(top = 30.dp)

                )
            }

            Spacer(modifier = Modifier.height(20.dp))




        }




    }

}