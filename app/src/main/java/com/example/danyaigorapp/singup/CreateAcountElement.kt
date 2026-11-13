package com.example.danyaigorapp.singup

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel


@Composable
fun CreateAccountElement(
    header: String,
    value: String,
    onValueChange: (String) -> Unit
){


    BasicTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = Modifier
            .padding(top = 37.dp, start = 52.dp, end = 176.dp)
            .fillMaxWidth(),
        decorationBox = { innerTextField ->
            if (value.isEmpty()) {
                Text(header,
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
}
