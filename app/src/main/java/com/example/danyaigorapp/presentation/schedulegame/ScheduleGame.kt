package com.example.danyaigorapp.presentation.schedulegame

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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.danyaigorapp.R
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.draw.blur
import com.example.danyaigorapp.appnavigation.Routes
import com.example.danyaigorapp.presentation.schedulegame.successfulpublisced.SuccessfulMessage
import com.example.diuikit.components.AppButton
import com.example.diuikit.components.Checkbox
import com.example.diuikit.components.appBasicTextField.BasicTextFieldBlya


@Composable
fun ScheduleScreen(
    navController: NavController,
    vm: ScheduleScreenVM = viewModel()
){

    val state = vm.state.collectAsState()
    var showSuccess by remember { mutableStateOf(false) }
    Column(
        modifier = Modifier.fillMaxSize().blur(if(showSuccess) 14.dp else 0.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 30.dp)
                .verticalScroll(rememberScrollState())


        ) {

            Box(
                modifier = Modifier
                    .padding(top = 60.dp)
                    .size(20.dp, 14.dp)
                    .clickable(onClick = {navController.navigate(Routes.LandingScreen.route)})
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

            BasicTextFieldBlya(
                "Game Name",
                state.value.game_name,
                onValueChange = {vm.Game_Name(it)},
                modifier = Modifier
            )

            Spacer(modifier = Modifier.height(24.dp))

            BasicTextFieldBlya(
                "Category",
                state.value.category,
                onValueChange = {vm.Category(it)},
                modifier = Modifier
            )

            Spacer(modifier = Modifier.height(18.dp))

            BasicTextFieldBlya(
                "Winning Price",
                state.value.winning_price,
                onValueChange = {vm.Winning_Price(it)},
                modifier = Modifier
            )

            Spacer(modifier = Modifier.height(251.dp))

            BasicTextFieldBlya(
                "Description",
                state.value.description,
                onValueChange = {vm.Description(it)},
                modifier = Modifier
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

                Checkbox()

                Text(
                    "Notification",
                    fontSize = 12.sp
                )
            }



            Spacer(modifier = Modifier.height(40.dp))

            AppButton(
                text = "Publish",
                onClick = {showSuccess = true},
                modifier = Modifier.padding(horizontal = 60.dp)
            )

            Spacer(modifier = Modifier.height(67.dp))



        }
    }
    if(showSuccess){
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFA5075).copy(alpha = 0.8f)),
            contentAlignment = Alignment.Center
        ){SuccessfulMessage(navController = navController)}

    }


}