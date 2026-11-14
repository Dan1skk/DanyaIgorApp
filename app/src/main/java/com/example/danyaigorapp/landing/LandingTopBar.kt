package com.example.danyaigorapp.landing

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.danyaigorapp.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LandingTopBar(
    onMenuClick: () -> Unit
){
    TopAppBar(
        title = { },
        navigationIcon = {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, end = 27.dp)
            ){
                Box(
                    modifier = Modifier
                        .padding(top = 7.dp)
                        .clickable { onMenuClick()}
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.hamburger),
                        contentDescription = null,
                        tint = Color(0xFFF22E63),
                        modifier = Modifier.size(width = 17.5.dp, height = 10.dp)

                    )
                }

                Spacer(modifier = Modifier.weight(1f))

                Box(
                    modifier = Modifier
                        .size(24.dp)
                        .clip(CircleShape)
                        .border(
                            2.dp, brush = Brush.linearGradient(
                                colors = listOf(
                                    Color(0xFFFF6480),
                                    Color(0xFFF22E63)

                                )
                            ), CircleShape
                        )
                        .clickable { }
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.fon_prof),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxSize()

                    )


                }

                Spacer(modifier = Modifier.width(2.dp))

                Text("Stone Stellar",
                    fontSize = 10.sp)


            }
        }
    )
}