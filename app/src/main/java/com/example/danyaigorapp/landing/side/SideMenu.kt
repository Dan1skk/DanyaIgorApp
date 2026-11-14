package com.example.danyaigorapp.landing.side

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.danyaigorapp.R
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.CompositingStrategy
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.navigation.NavController


@Composable
fun SideMenu(
    navController: NavController,
    onLogoutClick: () -> Unit
){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Icon(
            painter = painterResource(R.drawable.close_icon),
            contentDescription = null,
            tint = Color(0xFFFA5075),
            modifier = Modifier
                .padding(top = 68.dp, start = 305.dp)
                .clickable(onClick = {onLogoutClick()})

        )

        Spacer(modifier = Modifier.height(21.dp))

        Row(
            modifier = Modifier.fillMaxWidth().padding(start = 60.dp)
        ){
            Box(
                modifier = Modifier
                    .size(56.dp)
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

            Spacer(modifier = Modifier.width(11.dp))

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 3.dp),

                ) {
                Text(
                    "Stone Stellar",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFFA5075),
                        platformStyle = PlatformTextStyle(includeFontPadding = false)
                    ),


                    )

                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Icon(
                        painter = painterResource(R.drawable.group),
                        contentDescription = null,
                        tint = Color(0xFFF4C73E),
                        modifier = Modifier
                            .size(10.dp)
                    )

                    Spacer(modifier = Modifier.width(3.dp))

                    Text("Gold Player",
                        fontSize = 10.sp,
                        color = Color(0xFFF4C73E))
                }
            }
        }

        Spacer(modifier = Modifier.height(53.dp))

        SideMenuList(navController = navController, route = "CreateAccount",R.drawable.profile, "My Profile")

        Spacer(modifier = Modifier.height(34.4.dp))

        SideMenuList(navController = navController, route = "CreateAccount",R.drawable.schedule, "Shedule")

        Spacer(modifier = Modifier.height(34.4.dp))

        SideMenuList(navController = navController, route = "CreateAccount",R.drawable.statistics_icon, "Statistics")

        Spacer(modifier = Modifier.height(34.4.dp))

        SideMenuList(navController = navController, route = "CreateAccount",R.drawable.logout_icon, "Discover Combat")

        Spacer(modifier = Modifier.height(34.4.dp))

        SideMenuList(navController = navController, route = "CreateAccount",R.drawable.chat, "Chat")

        Spacer(modifier = Modifier.height(34.4.dp))

        SideMenuList(navController = navController, route = "CreateAccount",R.drawable.language_icon, "Change Language")

        Spacer(modifier = Modifier.height(34.4.dp))

        SideMenuList(navController = navController, route = "CreateAccount",R.drawable.change_skin, "Change App Skin")


        Spacer(modifier = Modifier.height(101.25.dp))

        Row(
            modifier = Modifier.fillMaxWidth().padding(start = 143.dp),
            verticalAlignment = Alignment.CenterVertically
        ){


            Icon(
                painter = painterResource(id = R.drawable.logout_icon),
                contentDescription = null,
                tint = Color(0xFFFA5075),
                modifier = Modifier.size(width =  18.dp, height = 18.dp).clickable(onClick = {onLogoutClick()})
            )

            Spacer(modifier = Modifier.width(18.dp))

            Text("Logout",
                fontSize = 16.sp,
            )

        }




    }
}