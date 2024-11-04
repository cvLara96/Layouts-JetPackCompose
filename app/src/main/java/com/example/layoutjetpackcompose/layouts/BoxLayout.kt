package com.example.layoutjetpackcompose.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun BoxLayout(){

    Box(
        modifier = Modifier
            .padding(vertical = 36.dp, horizontal = 24.dp)
            //background(Color.Red)
            .fillMaxSize(),
        contentAlignment = Alignment.BottomStart
    ){
        Box (modifier = Modifier
            .size(100.dp)
            .background(Color.Green)
        )
        {
        }
    }
    Box(
        modifier = Modifier
            .padding(vertical = 36.dp, horizontal = 24.dp)
            //.background(Color.Red)
            .fillMaxSize(),
        contentAlignment = Alignment.TopEnd
    ){
        Box (modifier = Modifier
            .size(100.dp)
            .background(Color.Green)
        )
        {
        }
    }
}