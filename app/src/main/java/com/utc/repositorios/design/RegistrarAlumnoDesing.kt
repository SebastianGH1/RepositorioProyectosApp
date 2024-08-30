package com.utc.repositorios.design

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
private fun RegistarAlumnoPreview() {
    RegistrarAumno()
}

@Composable
fun RegistrarAumno() {

    var txtNombre by remember {
        mutableStateOf("")
    }
    var txtMatricula by remember {
        mutableStateOf("")
    }
    var txtPassword by remember {
        mutableStateOf("")
    }

    var isShowMenuPublicaciones by remember {
        mutableStateOf(false)
    }

    Box(modifier = Modifier)

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
        Text(text = "Registro De Alumno ")
        Spacer(modifier = Modifier.size(10.dp))

        OutlinedTextField(
            modifier = Modifier
                .padding(horizontal = 16.dp),
            value = txtNombre,
            onValueChange = { text ->
                txtNombre = text

            },
            placeholder = {
                Text(text = "Nombre Del Alumno ")
            },
            supportingText = {
                Text(text = "Nombre Completo")
            }
        )
        Spacer(modifier = Modifier.padding(top = 10.dp))

        OutlinedTextField(
            modifier = Modifier
                .padding(horizontal = 16.dp),
            value = txtMatricula,
            onValueChange = { text ->
                txtMatricula = text
            },
            placeholder = {
                Text(text = "Matricula del Alumno  ")
            },
            supportingText = {
                Text(text = "Matricula Escolar ")
            }
        )
        Spacer(modifier = Modifier.padding(top = 10.dp))

        OutlinedTextField(
            modifier = Modifier
                .padding(horizontal = 16.dp),
            value = txtPassword,
            onValueChange = { text ->
                txtPassword = text
            },
            placeholder = {
                Text(text = "Contraseña")
            },
            supportingText = {
                Text(text = "La contraseña debe de tener 6 caracteres.")
            },
            visualTransformation = PasswordVisualTransformation()
        )

        Spacer(modifier = Modifier.padding(top = 10.dp))

        Button(
            onClick = {  },
            colors = ButtonDefaults.buttonColors(Color.Blue)
        ) {
            Text(text = "Registrar Alumno")
        }

        if (isShowMenuPublicaciones) {
            MenuPublicaciones()
        }
    }
}


