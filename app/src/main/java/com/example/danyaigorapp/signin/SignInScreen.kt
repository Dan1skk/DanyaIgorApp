package com.example.danyaigorapp.signin

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.danyaigorapp.R
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.IconButton
import androidx.compose.material3.TextButton
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.material3.Icon

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Login_PR() {
    Login()

}

@Composable
fun Login(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        Box(
            modifier = Modifier.fillMaxWidth()
        )
        {
            Image(
                painter = painterResource(R.drawable.image_4),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .fillMaxWidth()
                    .padding(top = 95.dp, end = 27.dp)
                    .size(width =  321.dp, height = 247.dp)
            )
        }

        Spacer(modifier = Modifier.height(41.dp))

        Text(
            "Welcome Back!",
            color = Color(0xFFFA5075),
            fontSize = 22.sp,
            fontWeight = FontWeight(700),
            textAlign = TextAlign.Start,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 52.dp, end = 99.dp)


        )

        Text(
            "Hi, Kindly login to continue battle",
            fontSize = 12.sp,
            textAlign = TextAlign.Start,
            fontWeight = FontWeight(400),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 12.dp, start = 52.dp, end = 99.dp)


        )


        var email by remember { mutableStateOf("") }

        BasicTextField(
            value = email,
            onValueChange = { email = it },
            modifier = Modifier
                .padding(top = 24.dp, start = 52.dp, end = 176.dp)
                .fillMaxWidth(),
            decorationBox = { innerTextField ->
                if (email.isEmpty()) {
                    Text("Email",
                        color = Color.Black,
                        fontSize =  12.sp)
                }
                innerTextField()
            }
        )
        Spacer(modifier = Modifier.height(8.dp))
        Box(
            modifier = Modifier
                .padding(start = 52.dp, end = 60.dp)
                .fillMaxWidth()
                .height(1.dp)
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Color(0xFFFF6480),
                            Color(0xFFF22E63)
                        )
                    )
                )


        )

        var password by remember { mutableStateOf("") }
        var isPasswordVisible by remember { mutableStateOf(false) }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 24.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 60.dp),
                verticalAlignment = Alignment.CenterVertically
            ){
                BasicTextField(
                    value = password,
                    onValueChange = { password = it },
                    modifier = Modifier
                        .padding(start = 52.dp)
                        .fillMaxWidth()
                        .weight(1f),


                    visualTransformation = if (isPasswordVisible) {
                        VisualTransformation.None
                    } else {
                        PasswordVisualTransformation()
                    },

                    decorationBox = { innerTextField ->
                        if (password.isEmpty()) {
                            Text("Password",
                                color = Color.Black,
                                fontSize = 12.sp)

                        }
                        innerTextField()
                    }
                )

                IconButton(
                    onClick = { isPasswordVisible = !isPasswordVisible }
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.visibility),
                        contentDescription = null,
                        modifier = Modifier.size(width =  12.dp, height = 8.dp)
                    )
                }
            }


            Box(
                modifier = Modifier
                    .padding(start = 52.dp, end = 60.dp)
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(
                        brush = Brush.linearGradient(
                            colors = listOf(
                                Color(0xFFFF6480),
                                Color(0xFFF22E63)
                            )
                        )
                    )

            )

            Text(
                "Forgot Password?",
                textAlign = TextAlign.Right,
                fontSize = 12.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp, start = 150.dp, end = 60.dp)
                    .clickable(onClick = {})

            )


        }

        Spacer(modifier = Modifier.height(27.dp))



        val ButtonGradient = Brush.linearGradient(
            colors = listOf(
                Color(0xFFFF6480),
                Color(0xFFF22E63)
            )
        )
        Button(
            onClick = { },
            shape = CircleShape,
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent

            ),
            contentPadding = PaddingValues(0.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 0.dp, start = 76.dp, end = 75.dp)
                .size(width = 224.dp, height = 58.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(CircleShape)
                    .background(ButtonGradient)
                    .padding(vertical = 16.dp),
                contentAlignment = Alignment.Center,

                ){
                Text(
                    text = "Create Account",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            }

        }


        Text(
            "Connect With:",
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFFA5075),
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 23.dp, start = 50.dp, end = 50.dp)
        )

        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Row(
                modifier = Modifier
                    .padding(top = 7.dp),

                horizontalArrangement = Arrangement.spacedBy((15.dp))
            ) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .size(45.dp)
                        .clip(CircleShape)
                        .background(Color(0xFFF34A38))
                        .clickable(onClick = {})
                ) {
                    Text(
                        "G+",
                        color = Color.White,
                        modifier = Modifier,
                        fontWeight = FontWeight.Bold

                    )

                }
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .size(45.dp)
                        .clip(CircleShape)
                        .background(Color(0xFF2672CB))
                        .clickable(onClick = {})
                ) {
                    Text(
                        "f",
                        color = Color.White,
                        modifier = Modifier,
                        fontWeight = FontWeight.Bold

                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(24.dp))
        Text(
            "Already have an account?",
            fontSize = 12.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 60.dp)

        )

        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            TextButton(
                onClick = { }
            ) {
                Text(
                    "Login",
                    color = Color(0xFFFA5075),
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }


    }
}


