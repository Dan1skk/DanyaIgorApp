package com.example.danyaigorapp.singup

import com.example.danyaigorapp.R


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
import androidx.compose.foundation.layout.width
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

import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.input.pointer.stylusHoverIcon
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.danyaigorapp.appnavigation.Routes
import com.example.diuikit.components.AppButton
import com.example.diuikit.components.appBasicTextField.BasicTextFieldBlya
import com.example.diuikit.components.appBasicTextField.BasicTextFieldPassword
import com.example.diuikit.ui.theme.Caption2Bold
import com.example.diuikit.ui.theme.Caption2Regular


@Composable
fun CreateAccount(
    navController: NavController,
    vm: CreateAccountVM = viewModel()
) {

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
                    painter = painterResource(R.drawable.image_3),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 21.dp, start = 27.dp)
                        .size(width = 321.dp, height = 247.dp)
                )
            }

            Text(
                "Create Account",
                color = MaterialTheme.colorScheme.primary,
                style = MaterialTheme.typography.headlineLarge,
                textAlign = TextAlign.Start,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 26.dp, start = 52.dp, end = 99.dp)


            )

            Text(
                "Hi, kindly fill in the form to proceed combat",
                style = Caption2Regular,
                fontWeight = FontWeight(400),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 12.dp, start = 52.dp, end = 99.dp)


            )

            Spacer(modifier = Modifier.height(37.dp))

            BasicTextFieldBlya(
                header = "Full Name",
                value = state.value.full_name,
                onValueChange = {vm.Full_Nmae(it)},
                modifier = Modifier.padding(start = 52.dp, end = 60.dp)
            )

//            CreateAccountElement(
//                "Full Name",
//                value = state.value.full_name,
//                onValueChange = { vm.Full_Nmae(it) })

            Spacer(modifier = Modifier.height(24.dp))


            BasicTextFieldBlya(
                header = "User Name",
                value = state.value.user_name,
                onValueChange = {vm.User_Nmae(it)},
                modifier = Modifier.padding(start = 52.dp, end = 60.dp)
            )
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 24.dp, start = 52.dp, end = 60.dp)
            ) {

                Row(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Text("+234", style = Caption2Regular)

                    Spacer(modifier = Modifier.width(25.dp))

                    var phone by remember { mutableStateOf("") }
                    BasicTextFieldBlya(
                        header = "Your Phone",
                        value = state.value.phone,
                        onValueChange = {vm.Phone(it)},
                        modifier = Modifier.padding(start = 0.dp, end = 60.dp)
                    )
                }

                Row(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Box(
                        modifier = Modifier
                            .padding(start = 0.dp)
                            .width(40.dp)
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

                    Spacer(modifier = Modifier.width(18.dp))
                    Box(
                        modifier = Modifier
                            .padding(start = 0.dp, end = 0.dp)
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
                }


            }

            Spacer(modifier = Modifier.height(24.dp))


            BasicTextFieldBlya(
                header = "Email",
                value = state.value.email,
                onValueChange = {vm.Email(it)},
                modifier = Modifier.padding(start = 52.dp, end = 60.dp)
            )

            BasicTextFieldPassword(
                "Password",
                value = state.value.password,
                onValueChange = {vm.PasswordUpdate(it)},
                R.drawable.eye
            )

            BasicTextFieldPassword(
                "Config Password",
                value = state.value.conf_password,
                onValueChange = {vm.Conf_PasswordUpdate(it)},
                R.drawable.eye
            )

            Spacer(modifier = Modifier.height(44.dp))

            AppButton(
                text = "Create Account",
                onClick = {navController.navigate("LandingScreen")},
                modifier = Modifier.padding(horizontal = 83.dp)
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
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    "Already have an account?",
                    style = Caption2Regular,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 60.dp)
                        .align(Alignment.CenterHorizontally)
                )

                Text(
                    "Login",
                    color = Color(0xFFFA5075),
                    style = Caption2Bold,
                    modifier = Modifier
                        .clickable(onClick = { navController.navigate(Routes.Login.route) }
                        )
                        .align(Alignment.CenterHorizontally)
                )

            }


        }
    }

}