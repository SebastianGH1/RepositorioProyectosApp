package com.utc.repositorios.design

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.utc.repositorios.R

@Preview
@Composable
fun DashboardUserDesignPreview() {
    DashboardUserDesign(navController = rememberNavController())
}

@Composable
fun DashboardUserDesign(navController: NavController) {
    var isShowMenu by remember {
        mutableStateOf(false)
    }
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
            Toolbar(onClick = {
                isShowMenu = isShowMenu != true
            })
            Spacer(modifier = Modifier.size(8.dp))

            val listaImagenes: List<Int> = listOf(R.drawable.banner, R.drawable.banner2)
            CarruselBanners(listaImagenes = listaImagenes)

            Spacer(modifier = Modifier.size(16.dp))
            val listaMaterias =
                listOf("Ing. Sistemas", "Arquitectura", "Administracion", "Pedagogia ")
            SelectorMaterias(listaMaterias)
            Spacer(modifier = Modifier.size(16.dp))
            ContenedorPublicaciones()
        }
        if (isShowMenu) {
            Menu(navController)

        }
    }



}

