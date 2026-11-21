package com.example.diuikit.components.appBasicTextField

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.lang.reflect.Modifier

@Composable
fun BasicTextFieldPassword(
    header: String,
    value: String,
    onValueChange: (String) -> Unit,
    icon:Int
){
    var isPasswordVisible by remember { mutableStateOf(false) }
    Column(
        modifier = androidx.compose.ui.Modifier
            .fillMaxSize()
    ) {
        Row(
            modifier = androidx.compose.ui.Modifier
                .fillMaxWidth()
                .padding(end = 60.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            BasicTextField(
                value = value,
                onValueChange = onValueChange,
                modifier = androidx.compose.ui.Modifier
                    .padding(start = 52.dp)
                    .fillMaxWidth()
                    .weight(1f),
                visualTransformation = if (isPasswordVisible) {
                    VisualTransformation.None
                } else {
                    PasswordVisualTransformation()
                },
                decorationBox = { innerTextField ->
                    if (value.isEmpty()) {
                        Text(
                            header,
                            style = MaterialTheme.typography.bodyLarge
                        )
                    }
                    innerTextField()
                }
            )
            IconButton(
                onClick = { isPasswordVisible = !isPasswordVisible }
            ) {
                Icon(
                    painter = painterResource(icon),
                    contentDescription = null,
                    modifier = androidx.compose.ui.Modifier.size(width = 12.dp, height = 8.dp)
                )
            }
        }
        Box(
            modifier = androidx.compose.ui.Modifier
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
}