package com.utc.repositorios.design

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.utc.repositorios.R

@Preview
@Composable
private fun BannerAdmPreview() {
    BannerAdm(navController = rememberNavController())
}

@Composable
fun BannerAdm(navController: NavController) {
    var isShowMenuPublicaciones by remember {
        mutableStateOf(false)
    }

    Box(modifier = Modifier) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
        ) {

            Toolbar(onClick = {
                isShowMenuPublicaciones = isShowMenuPublicaciones != true
            })
            Image(
                painter = painterResource(id = R.drawable.banner),
                contentDescription = "Amor de mi Vida ",
                modifier = Modifier
                    .size(350.dp)
                    .padding(15.dp)
            )

            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(onClick = {

                }, modifier = Modifier, colors = ButtonDefaults.buttonColors(Color.Blue)) {
                    Text(text = "Cargar Imagen")
                }
                Button(
                    onClick = {

                    },
                    modifier = Modifier.padding(top = 8.dp),
                    colors = ButtonDefaults.buttonColors(Color.Blue)
                ) {
                    Text(text = "Subir Imagen")
                }
            }

        }
    }
    if (isShowMenuPublicaciones) {
        MenuPublicaciones(navController)
    }
}