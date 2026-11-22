package com.example.danyaigorapp.discovercombats

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onPlaced
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.danyaigorapp.R
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.TextStyle
import com.example.diuikit.ui.theme.PinkGradient

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DPR() {
    SearchPlace()
}

@Composable
fun SearchPlace(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(266.dp)
            .background(brush = PinkGradient)

    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 30.dp)
        ) {
            Spacer(modifier = Modifier.height(60.dp))

            Icon(
                painter = painterResource(R.drawable.back_icon),
                contentDescription = null,
                tint = Color.White,
            )

            Spacer(modifier = Modifier.height(35.dp))

            Row(
                modifier = Modifier.fillMaxWidth()
            ){
                Text(
                    "Discover \nCombats",
                    style = MaterialTheme.typography.headlineLarge,
                    color = Color.White

                )

                Spacer(modifier = Modifier.weight(1f))

                Text(
                    "FILTER",
                    style = MaterialTheme.typography.headlineMedium,
                    color = Color.White,
                    modifier = Modifier.padding(top = 40.dp)

                )
            }



            Spacer(modifier = Modifier.height(20.dp))

            var searchText by remember{mutableStateOf("")}



            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(100.dp))
                    .background(color = Color.White)
                    .height(41.dp),
                contentAlignment = Alignment.CenterStart
            ){
                Row(
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 18.dp),
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Icon(
                        painter = painterResource(R.drawable.search_icon),
                        contentDescription = null,
                        tint = Color(0xFFFA5075)
                    )
                    Spacer(modifier = Modifier.width(9.dp))
                    BasicTextField(
                        value = searchText,
                        onValueChange = {searchText = it},
                        modifier = Modifier.fillMaxWidth(),
                        textStyle = TextStyle(
                            fontSize = 12.sp,
                            color = Color.Black
                        ),
                        singleLine = true,
                        decorationBox = { innerTextField->
                            if(searchText.isEmpty()){
                                Text(
                                    "Search Combat",
                                    style = MaterialTheme.typography.bodyMedium,
                                    color = Color(0xFFC9C9C9)
                                )
                            }
                            innerTextField()
                        }




                    )
                }

            }

        }






    }
}