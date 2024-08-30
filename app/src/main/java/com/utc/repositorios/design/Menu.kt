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
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.utc.repositorios.navigation.AppScreens

@Preview
@Composable
private fun MenuPreview() {
    Menu(navController = rememberNavController())
}

@Composable
fun Menu(navController: NavController) {
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
            Button(onClick = {
                navController.navigate(route = AppScreens.PublicacionesUser.ruta)
            }, modifier = Modifier) {
                Text(text = "Cargar Publicacion ")
            }
            Button(onClick = {
                navController.navigate(route = AppScreens.Login.ruta)
            }) {
                Text(text = "Salir")
            }

        }
    }
}

@Composable
fun MenuPublicaciones(navController: NavController) {
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
            Button(onClick = {
                navController.navigate(route = AppScreens.Dashboard.ruta)
            }, modifier = Modifier) {
                Text(text = "Inicio  ")
            }
            Button(onClick = {
                navController.navigate(route = AppScreens.Login.ruta)
            }) {
                Text(text = "Salir")
            }

        }
    }
}

