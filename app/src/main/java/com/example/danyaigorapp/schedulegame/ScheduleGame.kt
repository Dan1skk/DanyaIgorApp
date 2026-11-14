package com.example.danyaigorapp.schedulegame

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxColors
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.danyaigorapp.R
import com.example.danyaigorapp.singup.CreateAccountVM
import androidx.compose.runtime.getValue
import androidx.compose.runtime.movableContentWithReceiverOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import com.example.danyaigorapp.appnavigation.Routes



@Composable
fun ScheduleScreen(
    navController: NavController,
    vm: ScheduleScreenVM = viewModel()
){

    val state = vm.state.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 30.dp)
    ) {

        Box(
            modifier = Modifier
                .padding(top = 60.dp)
                .size(20.dp, 14.dp)
                .clickable(onClick = {})
        ){

            Icon(
                painter = painterResource(R.drawable.back_icon),
                contentDescription = null,
                tint = Color(0xFFF22E63)
            )

        }

        Spacer(modifier = Modifier.height(35.dp))

        Text(
            "Schedule Game",
            fontSize = 22.sp,
            fontWeight = FontWeight(700),
            color = Color(0xFFF22E63),
        )

        Spacer(modifier = Modifier.height(30.dp))

        ScheduleScreenElement(
            "Game Name",
            state.value.game_name,
            onValueChange = {vm.Game_Name(it)}
        )

        Spacer(modifier = Modifier.height(24.dp))

        ScheduleScreenElement(
            "Category",
            state.value.category,
            onValueChange = {vm.Category(it)}
        )

        Spacer(modifier = Modifier.height(18.dp))

        ScheduleScreenElement(
            "Winning Price",
            state.value.winning_price,
            onValueChange = {vm.Winning_Price(it)}
        )

        Spacer(modifier = Modifier.height(251.dp))

        ScheduleScreenElement(
            "Description",
            state.value.description,
            onValueChange = {vm.Description(it)}
        )

        Spacer(modifier = Modifier.height(55.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically

        ){
            Text(
                "REMINDERS",
                fontSize = 12.sp,
                color = Color(0xFFF22E63)
            )

            Spacer(modifier = Modifier.weight(1f))

            var checked by remember { mutableStateOf(false) }

            Checkbox(
                checked = checked,
                onCheckedChange = { checked = it },
                colors = CheckboxDefaults.colors(
                    checkedColor = Color(0xFFF22E63),
                    checkmarkColor = Color.White,
                    uncheckedColor = Color(0xFFF22E63)
                ),

            )

            Text(
                "Notification",
                fontSize = 12.sp
            )
        }

        val ButtonGradient = Brush.linearGradient(
            colors = listOf(
                Color(0xFFFF6480),
                Color(0xFFF22E63)
            )
        )
        Button(
            onClick = {  },
            shape = CircleShape,
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent

            ),
            contentPadding = PaddingValues(0.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp, start = 66.dp, end = 75.dp)
                .size(width = 224.dp, height = 58.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(CircleShape)
                    .background(ButtonGradient)
                    .padding(vertical = 16.dp),
                contentAlignment = Alignment.Center,

                ) {
                Text(
                    text = "Publish",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )
            }

        }







    }

}