package com.utc.repositorios.design

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
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

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun DashboardUserDesign() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {

        Spacer(modifier = Modifier.size(60.dp))

        val listaImagenes: List<Int> = listOf(R.drawable.banner, R.drawable.banner2)
        CarruselBanners(listaImagenes = listaImagenes)

        Spacer(modifier = Modifier.size(16.dp))
        val listaMaterias = listOf("Ing. Sistemas", "Arquitectura", "Administracion", "Pedagogia ")
        SelectorMaterias(listaMaterias)
        Spacer(modifier = Modifier.size(16.dp))
        ContenedorPublicaciones()
    }
}

