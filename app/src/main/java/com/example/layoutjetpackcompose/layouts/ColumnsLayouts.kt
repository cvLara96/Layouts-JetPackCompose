package com.example.layoutjetpackcompose.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun SaludoColumn() {

    Column(
        modifier = Modifier
            .padding(vertical = 36.dp)
            .padding(horizontal = 8.dp)
            .background(Color.Red)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Hola"
        )

        Text(
            text = "Mi nombre es Carlos Ventas"
        )

        Text(
            text = "Adios"
        )
    }

}