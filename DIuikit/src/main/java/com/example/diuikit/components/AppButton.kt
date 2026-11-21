package com.example.diuikit.components

import android.text.Layout
import android.text.style.LineBackgroundSpan
import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun PRAppButton(){
    AppButton(
        text = "Let's Combat!",
        onClick = {},
        modifier = Modifier
    )
}

@Composable
fun AppButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier,
    backgroundBrush: Brush = Brush.linearGradient(
        colors = listOf(Color(0xFFFF6480), Color(0xFFF22E63))
    ),


){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(58.dp)
            .then(modifier)
            .clip(RoundedCornerShape(100))
            .clickable {
                Log.i("AppButton", "Клик по кнопке - Текст: $text")
                onClick()
            }
            .background(brush = backgroundBrush),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = text,
            color = Color.White,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold
        )
    }

}
