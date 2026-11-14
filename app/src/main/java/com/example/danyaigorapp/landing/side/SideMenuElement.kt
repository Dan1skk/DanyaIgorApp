package com.example.danyaigorapp.landing.side

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.CompositingStrategy
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.danyaigorapp.R


@Composable
fun SideMenuList(
    navController: NavController,
    route: String,
    icon: Int,
    header: String
){
    Row(
        modifier = Modifier.fillMaxWidth().padding(start = 60.dp),
        verticalAlignment = Alignment.CenterVertically
    ){


        Box(
            modifier = Modifier
                .size(15.47.dp)
                .graphicsLayer(compositingStrategy = CompositingStrategy.Offscreen)
                .clickable(onClick = {navController.navigate(route)})
        ) {
            Icon(
                painter = painterResource(icon),
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier.fillMaxSize()
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .graphicsLayer {
                        blendMode = BlendMode.SrcIn
                    }
                    .background(
                        brush = Brush.linearGradient(
                            colors = listOf(Color(0xFFFFF6480), Color(0xFFFF22E63))
                        )
                    )
            )


        }

        Spacer(modifier = Modifier.width(24.1.dp))

        Text(header,
            fontSize = 16.sp,
        )



    }

}