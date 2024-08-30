package com.utc.repositorios.design

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
private fun MenuPreview() {
Menu()
}

@Composable
fun Menu() {
    Box(
        modifier = Modifier
            .wrapContentSize()
            .padding(top = 64.dp)
            .background(Color(0xFFFF9900))
    ) {
        Column(
            modifier = Modifier
                .wrapContentSize()
                .padding(8.dp)
                .background(Color(0xFFFF9900))
        ) {
            Button(onClick = { /*TODO*/ }, modifier = Modifier) {
                Text(text = "Cargar Publicacion ")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Salir")
            }

        }
    }
}

@Composable
fun MenuPublicaciones() {
    Box(
        modifier = Modifier
            .wrapContentSize()
            .padding(top = 64.dp)
            .background(Color(0xFFFF9900))
    ) {
        Column(
            modifier = Modifier
                .wrapContentSize()
                .padding(8.dp)
                .background(Color(0xFFFF9900))
        ) {
            Button(onClick = { /*TODO*/ }, modifier = Modifier) {
                Text(text = "Inicio  ")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Salir")
            }

        }
    }
}

