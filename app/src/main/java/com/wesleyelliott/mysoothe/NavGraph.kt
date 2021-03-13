package com.wesleyelliott.mysoothe

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController

object Destinations {
    const val WELCOME ="welcome"
    const val LOGIN = "login"
    const val HOME = "HOME"
}

class NavActions(navController: NavController) {
    val welcomeToLogin: () -> Unit = {
        navController.navigate(Destinations.LOGIN)
    }
    val loginToHome: () -> Unit = {
        navController.navigate(Destinations.HOME)
    }
}

@Composable
fun NavGraph(
    startDestination: String = Destinations.WELCOME
) {
    val navController = rememberNavController()
    val actions = remember(navController) {
        NavActions(navController = navController)
    }

    NavHost(
        navController = navController,
        startDestination = startDestination,
    ) {
        composable(Destinations.WELCOME) {

        }
        composable(Destinations.LOGIN) {

        }
        composable(Destinations.HOME) {

        }
    }
}