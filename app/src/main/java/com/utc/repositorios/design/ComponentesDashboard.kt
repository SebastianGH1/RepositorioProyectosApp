package com.utc.repositorios.design

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.utc.repositorios.R


@Preview
@Composable
private fun CarruselBannersPreview() {
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
private fun SelectorMateriasPreview() {
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

@Preview
@Composable
private fun ContenedorPublicacionesPreview() {
    ContenedorPublicaciones()
}

@Composable
fun ContenedorPublicaciones() {
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth(),
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) {
        items(2) {
            Publicacion()
        }
    }
}


@Composable
fun Publicacion() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .height(150.dp)
            .fillMaxWidth()
            .padding(bottom = 8.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.banner), contentDescription = null,
            modifier = Modifier.size(150.dp),
            contentScale = ContentScale.Crop
        )
        Box(
            modifier = Modifier
                .padding(vertical = 16.dp)
                .fillMaxWidth()
        ) {
            Row(
                modifier = Modifier
                    .background(
                        Color(0xFFFFBB71),
                        shape = RoundedCornerShape(topEnd = 30.dp, bottomEnd = 30.dp)
                    )
                    .fillMaxSize(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Column(
                    modifier = Modifier.fillMaxHeight(),
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(text = "Titulo Proyecto ")
                    Text(text = "Descripcion Proyecto")
                }
                Icon(
                    modifier = Modifier.padding(top = 14.dp),
                    imageVector = Icons.Filled.Favorite,
                    contentDescription = null
                )
            }
        }
    }

}