package com.example.danyaigorapp.landing

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.danyaigorapp.R

@Composable
fun LandingBottomBar(){
    Box(
        modifier = Modifier
            .fillMaxWidth()
    ){
        Image(
            painter = painterResource(R.drawable.buttombar),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .size(width = 375.dp, height = 109.dp )
        )



        Box(
            modifier = Modifier
                .padding(top = 15.dp, start = 152.dp)
                .size(width = 56.dp, height = 56.dp)
                .clip(CircleShape)
                .border(
                    5.dp, Color.White, CircleShape
                )
                .clickable { },
            contentAlignment = Alignment.Center


        ) {
            Icon(
                painter = painterResource(id = R.drawable.schedule),
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier
                    .size(width = 24.dp, height = 29.dp)

            )


        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 45.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Row(
                modifier =  Modifier
                    .padding(start = 20.dp)
            ){
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.statistics_icon),
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier.clickable(onClick = {})
                    )

                    Spacer(modifier = Modifier.padding(top = 0.dp))

                    Text(
                        "Statistics",
                        fontSize = 10.sp,
                        color = Color.White
                    )
                }

                Spacer(modifier = Modifier.width(26.dp))

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center

                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.location_pin),
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier.clickable(onClick = {})
                    )

                    Spacer(modifier = Modifier.padding(top = 0.dp))

                    Text(
                        "Discover",
                        fontSize = 10.sp,
                        color = Color.White
                    )
                }
            }

            Spacer(modifier = Modifier.weight(1f))

            Row(
                modifier =  Modifier
                    .padding(end = 22.dp)
            ){
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.chat),
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier.clickable(onClick = {})
                    )

                    Spacer(modifier = Modifier.padding(top = 0.dp))

                    Text(
                        "Chat",
                        fontSize = 10.sp,
                        color = Color.White
                    )
                }

                Spacer(modifier = Modifier.width(38.dp))

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center

                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.profile),
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier.clickable(onClick = {})
                    )

                    Spacer(modifier = Modifier.padding(top = 0.dp))

                    Text(
                        "Profile",
                        fontSize = 10.sp,
                        color = Color.White
                    )
                }
            }

        }

    }

}