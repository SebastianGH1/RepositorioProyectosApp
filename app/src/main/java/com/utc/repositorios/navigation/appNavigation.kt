package com.utc.repositorios.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.utc.repositorios.design.CargarPublicaciones
import com.utc.repositorios.design.DashboardUserDesign
import com.utc.repositorios.design.LoginDesign

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = AppScreens.Login.ruta) {
        composable(route = AppScreens.Login.ruta) {
            LoginDesign(navController)
        }
        composable(route=AppScreens.Dashboard.ruta){
            DashboardUserDesign(navController)
        }
        composable(route=AppScreens.Salir.ruta){
            LoginDesign(navController)
        }
        composable(route=AppScreens.PublicacionesUser.ruta){
            CargarPublicaciones(navController)
        }


    }
}



