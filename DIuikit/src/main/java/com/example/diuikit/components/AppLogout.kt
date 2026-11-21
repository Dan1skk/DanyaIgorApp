package com.example.diuikit.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Logout(
    navController: NavController,
    logout_icon: Int
){
    Row(
        modifier = Modifier.fillMaxWidth().padding(start = 143.dp),
        verticalAlignment = Alignment.CenterVertically
    ){


        Icon(
            painter = painterResource(logout_icon),
            contentDescription = null,
            tint = Color(0xFFFA5075),
            modifier = Modifier.size(width =  18.dp, height = 18.dp).clickable(onClick = {})
        )

        Spacer(modifier = Modifier.width(18.dp))

        Text("Logout",
            fontSize = 16.sp,
        )

    }
}