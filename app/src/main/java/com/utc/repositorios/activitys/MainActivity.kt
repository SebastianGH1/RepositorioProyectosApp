package com.utc.repositorios.activitys

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.utc.repositorios.design.BannerAdm
import com.utc.repositorios.design.RegistrarAumno


import com.utc.repositorios.ui.theme.RepositorioProyectosAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RepositorioProyectosAppTheme {
                BannerAdm()
            }
        }
    }
}