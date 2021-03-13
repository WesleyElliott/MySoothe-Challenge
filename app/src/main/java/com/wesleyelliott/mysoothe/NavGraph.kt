/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.wesleyelliott.mysoothe

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import com.wesleyelliott.mysoothe.ui.home.HomeScreen
import com.wesleyelliott.mysoothe.ui.login.LoginScreen
import com.wesleyelliott.mysoothe.ui.welcome.WelcomeScreen

object Destinations {
    const val WELCOME = "welcome"
    const val LOGIN = "login"
    const val HOME = "home"
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
            WelcomeScreen(onLoginClick = actions.welcomeToLogin)
        }
        composable(Destinations.LOGIN) {
            LoginScreen(onLoginClick = actions.loginToHome)
        }
        composable(Destinations.HOME) {
            HomeScreen()
        }
    }
}
