package com.example.stradat_1504.ui.bottom_navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavGraph (
    navHostController: NavHostController
) {
    NavHost(navController = navHostController, startDestination = "screen_1") {
        composable("screen_1") {
            Screen1()
        }
        composable("screen_2") {
            Screen2()
        }
    }
}