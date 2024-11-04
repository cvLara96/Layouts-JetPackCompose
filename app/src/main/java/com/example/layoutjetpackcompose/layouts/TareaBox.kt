package com.example.layoutjetpackcompose.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun WorkoutBox(){

    //Caja rosa
    Box (modifier = Modifier
        .fillMaxSize()
    ){
        Box(modifier = Modifier
            .background(Color.Magenta)
            .size(100.dp)
        )
    }

    //Caja negra
    Box (modifier = Modifier
        .fillMaxSize(),
        contentAlignment = Alignment.TopEnd
    ){
        Box(modifier = Modifier
            .background(Color.Black)
            .size(100.dp)
        )
    }

    //Caja Azul
    Box (modifier = Modifier
        .fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Box(modifier = Modifier
            .background(Color.Blue)
            .size(100.dp)
        )
    }

    //Caja amarilla
    Box (modifier = Modifier
        .fillMaxSize(),
        contentAlignment = Alignment.BottomStart
    ){
        Box(modifier = Modifier
            .background(Color.Yellow)
            .size(100.dp)
        )
    }

    //Caja verde
    Box (modifier = Modifier
        .fillMaxSize(),
        contentAlignment = Alignment.BottomEnd
    ){
        Box(modifier = Modifier
            .background(Color.Green)
            .size(100.dp)
        )
    }

}