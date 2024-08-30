package com.utc.repositorios.design

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.utc.repositorios.R
import com.utc.repositorios.navigation.AppScreens

@Preview
@Composable
private fun LoginDesignPreview() {
    LoginDesign(navController = rememberNavController())
}

@Composable
fun LoginDesign(navController: NavController) {
    var txtNombre by remember {
        mutableStateOf("")
    }
    var txtMatricula by remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "UTC\nRepositorios",
            modifier = Modifier
                .fillMaxWidth(),
            fontSize = 25.sp,
            textAlign = TextAlign.Center
        )

        OutlinedTextField(
            modifier = Modifier
                .padding(horizontal = 16.dp),
            value = txtNombre,
            onValueChange = { text ->
                txtNombre = text

            },
            placeholder = {
                Text(text = "Matricula")
            },
            supportingText = {
                Text(text = "Aqui escribe tu matricula de la escuela.")
            }
        )

        OutlinedTextField(
            modifier = Modifier
                .padding(horizontal = 16.dp),
            value = txtMatricula,
            onValueChange = { text ->
                txtMatricula = text
            },
            placeholder = {
                Text(text = "Contraseña")
            },
            supportingText = {
                Text(text = "La contraseña debe de tener 6 caracteres.")
            },
            visualTransformation = PasswordVisualTransformation()
        )

        Button(
            onClick = {
                navController.navigate(route = AppScreens.Dashboard.ruta)
            },
            content = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_login),
                    contentDescription = null
                )
                Spacer(modifier = Modifier.size(10.dp))
                Text(
                    text = "Ingresar"
                )
            }
        )


    }
}