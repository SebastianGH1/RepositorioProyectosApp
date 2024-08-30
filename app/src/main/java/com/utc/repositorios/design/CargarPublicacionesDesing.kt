package com.utc.repositorios.design

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
private fun CargarPublicacionesPreview() {
    CargarPublicaciones()

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CargarPublicaciones() {

    var isShowMenuPublicaciones by remember {
        mutableStateOf(false)
    }

    Box(modifier = Modifier) {


        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Toolbar(onClick = {
                isShowMenuPublicaciones = isShowMenuPublicaciones != true
            })
            Spacer(modifier = Modifier.padding(top = 10.dp))
            Text(text = "Cargar Publicacion ")
            Spacer(modifier = Modifier.padding(top = 10.dp))

            var txtTitulo by remember {
                mutableStateOf("")
            }
            var txtDes by remember {
                mutableStateOf("")
            }

            OutlinedTextField(
                modifier = Modifier
                    .padding(horizontal = 16.dp),
                value = txtTitulo,
                onValueChange = { text ->
                    txtTitulo = text

                },
                placeholder = {
                    Text(text = "Titulo")
                },
                supportingText = {
                    Text(text = "Escribe el Titulo de tu proyecto ")
                }
            )
            Spacer(modifier = Modifier.padding(top = 10.dp))
            OutlinedTextField(
                singleLine = false,
                maxLines = 5,
                modifier = Modifier.padding(horizontal = 16.dp),
                value = txtDes,
                onValueChange = { text ->
                    txtDes = text

                },
                placeholder = {
                    Text(text = "Descripcion de tu Proyecto ")

                },

                supportingText = {
                    Text(text = "Aqui escribe tu la descripcion del Proyecto .")
                }
            )
            Spacer(modifier = Modifier.padding(top = 10.dp))



            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(
                    onClick = {

                    }, modifier = Modifier,
                    colors = ButtonDefaults.buttonColors(Color.Blue)
                ) {
                    Text(text = "Cargar Imagen")
                }
                Button(
                    onClick = {

                    },
                    modifier = Modifier.padding(top = 8.dp),
                    colors = ButtonDefaults.buttonColors(Color.Blue)
                ) {
                    Text(text = "Subir Proyecto ")

                }
            }
        }
        if (isShowMenuPublicaciones) {
            MenuPublicaciones()
        }


    }
}