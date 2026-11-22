package com.example.danyaigorapp.schedulegame.successfulpublisced

import android.media.Image
import android.service.carrier.MessagePdu
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScrollModifierNode
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.danyaigorapp.R
import com.example.diuikit.components.AppButton
import com.example.diuikit.ui.theme.CaptionRegular
import com.example.diuikit.ui.theme.PinkGradient


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SPR() {
    SuccessfulMessage(navController = rememberNavController())
}



@Composable
fun SuccessfulMessage(
    navController: NavController
){


    Column(
        modifier = Modifier
            .fillMaxSize()

    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 68.dp, start = 205.dp)
                .clickable(onClick = {navController.navigate("ScheduleScreen")}),
            contentAlignment = Alignment.Center
        ){
            Icon(
                painter = painterResource(R.drawable.close_icon),
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier.size(26.dp)
            )
        }

        Spacer(modifier = Modifier.height(59.dp))


        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ){
            Box(
                modifier = Modifier
                    .size(138.dp)
                    .clip(CircleShape)
                    .border(
                        5.dp, Color.White, CircleShape
                    )
                    .background(brush = PinkGradient),
                contentAlignment = Alignment.Center


            ) {
                Icon(
                    painter = painterResource(id = R.drawable.checkmark),
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier
                        .size(width = 47.dp, height = 37.dp)

                )
            }
        }

        Spacer(modifier = Modifier.height(28.dp))

        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ){
            Text(
                "Published\nSuccessful",
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.headlineLarge,
                fontSize = 22.sp,
                color = Color.White
                )
        }

        Spacer(modifier = Modifier.height(21.dp))

        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ){
            Text(
                "Wanna change/edit your \nscheduled game before it \nbegins?",
                textAlign = TextAlign.Center,
                style = CaptionRegular,
                color = Color.White

            )
        }

        Spacer(Modifier.height(33.dp))

        AppButton(
            text = "Statistics",
            onClick = {},
            modifier = Modifier.padding(horizontal = 76.dp),
        )




    }

}