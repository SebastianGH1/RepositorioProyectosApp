package com.utc.repositorios.design

import android.util.Log
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.utc.repositorios.R

@Preview
@Composable
private fun LoginDesignPreview() {
    LoginDesign()
}

@Composable
fun LoginDesign() {
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
            value = "",
            onValueChange = {},
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
            value = "miPassword123#",
            onValueChange = {},
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
                Log.i("AppUtc", "Click Login")
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