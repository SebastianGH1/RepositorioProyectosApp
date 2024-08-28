package com.utc.repositorios.design

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.utc.repositorios.R


@Preview
@Composable
fun CarruselBannersPreview() {
    val listaImagenes: List<Int> = listOf(R.drawable.banner, R.drawable.banner2)
    CarruselBanners(listaImagenes)
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CarruselBanners(listaImagenes: List<Int>) {
    HorizontalPager(
        modifier = Modifier.fillMaxWidth(),
        state = rememberPagerState { listaImagenes.size },
        pageSpacing = 5.dp,
        contentPadding = PaddingValues(start = 10.dp, end = 20.dp)
    ) { index ->

        DashboardBanner(listaImagenes[index])
    }
}


@Composable
fun DashboardBanner(recursoImagenId: Int) {
    Box {
        Image(
            painter = painterResource(id = recursoImagenId),
            contentDescription = "bannerUtc"
        )
    }
}

@Preview
@Composable
fun SelectorMateriasPreview() {
    val listaMaterias = listOf("Ing. Sistemas", "Arquitectura", "Administracion", "Pedagogia ")
    SelectorMaterias(listaMaterias)
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun SelectorMaterias(listaMaterias: List<String>) {
    HorizontalPager(
        modifier = Modifier.fillMaxWidth(),
        state = rememberPagerState { listaMaterias.size },
        pageSpacing = 8.dp,
        pageSize = PageSize.Fixed(140.dp)
    ) { index ->
        Button(
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Red,
                contentColor = Color.White
            ),
            contentPadding = PaddingValues(0.dp),
            modifier = Modifier.fillMaxWidth(),
            onClick = {}) {
            Text(
                text = listaMaterias[index],
                fontSize = 11.sp
            )
        }
    }
}