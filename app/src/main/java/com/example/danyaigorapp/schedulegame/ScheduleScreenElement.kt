package com.example.danyaigorapp.schedulegame

import android.service.carrier.MessagePdu
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.R

@Composable
fun ScheduleScreenElement(
    header: String,
    value: String,
    onValueChange: (String) -> Unit
){


    BasicTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = Modifier
            .fillMaxWidth(),
        decorationBox = { innerTextField ->
            if (value.isEmpty()) {
                Text(header,
//                    color = Color.Black,
                    fontSize =  12.sp)
            }
            innerTextField()
        }
    )
    Spacer(modifier = Modifier.height(8.dp))
    Box(
        modifier = Modifier
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

@Composable
fun ScheduleScreenCategory(
    header: String,
    value: String,
    onValueChange: (String) -> Unit
){


    Row(
        modifier = Modifier
            .fillMaxWidth()
    ){
        BasicTextField(
            value = value,
            onValueChange = onValueChange,
            modifier = Modifier
                .fillMaxWidth(),
            decorationBox = { innerTextField ->
                if (value.isEmpty()) {
                    Text(header,
//                    color = Color.Black,
                        fontSize =  18.sp)
                }
                innerTextField()
            }
        )

        Spacer(modifier = Modifier.weight(1f))


    }

    Spacer(modifier = Modifier.height(8.dp))
    Box(
        modifier = Modifier
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
