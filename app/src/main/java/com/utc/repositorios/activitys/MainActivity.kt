package com.utc.repositorios.activitys

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.utc.repositorios.design.DashboardUserDesign
import com.utc.repositorios.ui.theme.RepositorioProyectosAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RepositorioProyectosAppTheme {
                DashboardUserDesign()
            }
        }
    }
}