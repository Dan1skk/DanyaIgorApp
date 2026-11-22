package com.example.danyaigorapp.signin

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.danyaigorapp.R
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.IconButton
import androidx.compose.material3.TextButton
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.collectAsState
import androidx.navigation.NavController
import com.example.danyaigorapp.appnavigation.Routes
import com.example.diuikit.components.AppButton
import com.example.diuikit.components.appBasicTextField.BasicTextFieldBlya
import com.example.diuikit.components.appBasicTextField.BasicTextFieldPassword
import com.example.diuikit.ui.theme.Caption2Bold
import com.example.diuikit.ui.theme.Caption2Regular
import com.example.diuikit.ui.theme.Title1ExtraBold

//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun Login_PR() {
//    Login()
//
//}

@Composable
fun Login(

    navController: NavController,
    vm: LoginVM
){

    val state = vm.state.collectAsState()
    Scaffold() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
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
                        .padding(top = 0.dp, end = 27.dp)
                        .size(width =  321.dp, height = 247.dp)
                )
            }
            Spacer(modifier = Modifier.height(41.dp))
            Text(
                "Welcome Back!",
                color = Color(0xFFFA5075),
                style = Title1ExtraBold,
                textAlign = TextAlign.Start,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 52.dp, end = 99.dp)
            )
            Text(
                "Hi, Kindly login to continue battle",
                style = Caption2Regular,
                textAlign = TextAlign.Start,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 12.dp, start = 52.dp, end = 99.dp)


            )

            Spacer(modifier = Modifier.height(40.dp))

            BasicTextFieldBlya(
                header = "Email",
                value = state.value.email,
                onValueChange = {vm.EmailUpdate(it)},
                modifier = Modifier.padding(start = 52.dp, end = 60.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))

            var password by remember { mutableStateOf("") }
            BasicTextFieldPassword(
                "Password",
                value = state.value.password,
                onValueChange = {vm.PasswordUpdate(it)},
                R.drawable.eye
            )
            Text(
                "Forgot Password?",
                textAlign = TextAlign.Right,
                style = Caption2Regular,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp, start = 150.dp, end = 60.dp)
                    .clickable(onClick = {})

            )


            Spacer(modifier = Modifier.height(27.dp))

            AppButton(
                text = "Let's Combat",
                onClick = {navController.navigate("LandingScreen")},
                modifier = Modifier.padding(horizontal = 76.dp)
            )

            Text(
                "Connect With:",
                style = Caption2Bold,
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
                style = Caption2Regular,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 60.dp)

            )

            Text(
                "Create Account",
                color = Color(0xFFFA5075),
                style = Caption2Bold,
                modifier = Modifier
                    .clickable(onClick = { navController.navigate(Routes.CreateAccount.route) }
                    )
                    .align(Alignment.CenterHorizontally)
            )
        }
    }


}


