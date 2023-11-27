package com.example.jetpackcompose

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcompose.Destinations.HOME_ROUTE
import com.example.jetpackcompose.Destinations.LOGIN_ROUTE
import com.example.jetpackcompose.Destinations.SIGN_UP_ROUTE
import com.example.jetpackcompose.Destinations.SPLASH_ROUTE
import com.example.jetpackcompose.screens.HomeScreen
import com.example.jetpackcompose.screens.LoginScreen
import com.example.jetpackcompose.screens.SignupScreen
import com.example.jetpackcompose.screens.SplashScreen


object Destinations {
    const val SPLASH_ROUTE = "splash"
    const val LOGIN_ROUTE = "login"
    const val SIGN_UP_ROUTE = "signup"
    const val HOME_ROUTE = "home"
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = SPLASH_ROUTE
    ) {

        composable(route = SPLASH_ROUTE) {
            SplashScreen(
                navigateAfterAnimation = {
                    navController.navigate(
                        LOGIN_ROUTE
                    ) {
                        popUpTo(SPLASH_ROUTE) {
                            inclusive = true
                        }
                    }
                }
            )
        }

        composable(route = LOGIN_ROUTE) {
            LoginScreen(
                navigateToHome = {
                    navController.navigate(HOME_ROUTE) {
                        popUpTo(LOGIN_ROUTE) {
                            inclusive = true
                        }
                    }
                },
                navigateToSignUp = {
                    navController.navigate(SIGN_UP_ROUTE) {
                        popUpTo(LOGIN_ROUTE) {
                            inclusive = false
                        }
                    }
                }
            )
        }

        composable(route = SIGN_UP_ROUTE) {
            SignupScreen(navController)
        }

        composable(route = HOME_ROUTE) {
            HomeScreen(navController)
        }
    }
}