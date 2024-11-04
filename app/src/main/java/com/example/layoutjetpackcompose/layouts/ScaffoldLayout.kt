package com.example.layoutjetpackcompose.layouts

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldLayout() {

    //Modificamos el nombre it por paddingValues
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.largeTopAppBarColors(
                    containerColor = Color.Magenta
                ),
                title = {
                    Text(text = "App Bar")
                }
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                containerColor = Color.Magenta,
                shape = CircleShape,
                onClick = { }
            ) {
                Text(
                    text = "+",
                    fontSize = 32.sp,
                    color = Color.White
                )
            }
        }
    ) { paddingValues ->
        //Crearemos dentro un Box y en padding, enviaremos los valores que nos devuelve el Scaffold
        Box(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
        ) {

            Column {
                ItemContacto(name = "Carlos Ventas", phoneNumber = "660859713")
                ItemContacto(name = "Daniel Ventas", phoneNumber = "660859714")
                ItemContacto(name = "Pablo Palomino", phoneNumber = "660859715")
                ItemContacto(name = "Pilar Galvez", phoneNumber = "660859716")
            }
        }

    }

}

