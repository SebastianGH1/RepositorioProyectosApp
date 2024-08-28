package com.utc.repositorios.design

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsIgnoringVisibility
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.windowInsetsBottomHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.utc.repositorios.R

@Preview
@Composable
fun DashboardUserDesignPreview() {
    DashboardUserDesign()
}

@OptIn(ExperimentalFoundationApi::class, ExperimentalLayoutApi::class)
@Composable
fun DashboardUserDesign() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
        ) {

            Toolbar()
            Spacer(modifier = Modifier.size(8.dp))

            val listaImagenes: List<Int> = listOf(R.drawable.banner, R.drawable.banner2)
            CarruselBanners(listaImagenes = listaImagenes)

            Spacer(modifier = Modifier.size(16.dp))
            val listaMaterias =
                listOf("Ing. Sistemas", "Arquitectura", "Administracion", "Pedagogia ")
            SelectorMaterias(listaMaterias)
            Spacer(modifier = Modifier.size(16.dp))
            ContenedorPublicaciones(modifier = Modifier.padding(bottom = 120.dp))
        }
        Column(modifier = Modifier.align(Alignment.BottomCenter)) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFFF9900))
                    .padding(16.dp)
                    .padding(top = 25.dp)
            ) {
                Row(
                    modifier = Modifier
                        .background(Color.White, shape = RoundedCornerShape(8.dp))
                        .weight(0.5F)
                        .padding(16.dp)
                ) {
                    Text(
                        modifier = Modifier.weight(0.8f),
                        text = "Tu proyecto tambien puedes subirlo"
                    )
                    Icon(
                        modifier = Modifier.weight(0.2f),
                        imageVector = Icons.Filled.Add,
                        contentDescription = null
                    )
                }
                Spacer(modifier = Modifier.size(8.dp))
                Row(
                    modifier = Modifier
                        .background(Color.White, shape = RoundedCornerShape(8.dp))
                        .weight(0.5F)
                        .padding(16.dp)
                ) {
                    Text(
                        modifier = Modifier.weight(0.8f),
                        text = "Puedes participar y ser parte de la comunidad"
                    )
                    Icon(
                        modifier = Modifier.weight(0.2f),
                        imageVector = Icons.Filled.AccountCircle,
                        contentDescription = null,
                        tint = Color.Black
                    )
                }
            }
            Spacer(
                modifier = Modifier.windowInsetsBottomHeight(
                    WindowInsets.navigationBarsIgnoringVisibility
                )
            )
        }

    }
}

