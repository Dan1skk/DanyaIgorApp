package com.example.danyaigorapp.landing

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.danyaigorapp.R

@Composable
fun LandingCard(
    header: String,
    description: String,
    image: Int

){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 30.dp, end = 30.dp)
            .size(width = 315.dp, height = 169.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(
                        Color(0xFFFF6480),
                        Color(0xFFF22E63)

                    )
                )
            )
    ){
        Column(
            modifier = Modifier.padding(top = 30.dp, start = 24.dp, end = 126.dp)
        ) {
            Text(header,
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(description,
                fontSize = 10.sp,
                lineHeight = 15.sp,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(33.dp))

            Icon(
                painter = painterResource(R.drawable.forward_arrow),
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier.clickable(onClick = {})

            )


        }


        Image(
            painter = painterResource(image),
            contentDescription = null,
            modifier =  Modifier
                .padding(top = 43.dp, start = 181.dp)
                .size(width = 112.dp, height = 107.dp)
        )


    }

}