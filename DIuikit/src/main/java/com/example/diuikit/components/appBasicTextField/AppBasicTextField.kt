package com.example.diuikit.components.appBasicTextField

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun PRBasicTextField(){
    BasicTextFieldBlya(
        header = "Full Name",
        value = "",
        onValueChange = {},
        Modifier.then(Modifier)
    )
}

@Composable
fun BasicTextFieldBlya(
    header: String,
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier,
){
    BasicTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = Modifier.fillMaxWidth().then(modifier),
        decorationBox = {innerTextField ->
            if(value.isEmpty()){
                Text(header, style = MaterialTheme.typography.bodyLarge)
            }
            innerTextField()
        }


    )
    Spacer(modifier = Modifier.height(8.dp))
    Box(
        modifier = Modifier
            .then(modifier)
            .fillMaxWidth()
            .height(1.dp)
            .background(brush = Brush.linearGradient(
                colors = listOf(Color(0xFFFF6480), Color(0xFFF22E63))
            ))

    )
}