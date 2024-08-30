package com.utc.repositorios.navigation

sealed class AppScreens(val ruta: String) {

    object Login : AppScreens("LoginDesing")
    object Dashboard : AppScreens("DashboardUserDesing")
    object Salir : AppScreens("LoginDesing")
    object PublicacionesUser : AppScreens("CargarPublicacionesDesing")

}
