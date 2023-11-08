package com.example.jetpackcompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcompose.utils.Constants.HOME
import com.example.jetpackcompose.utils.Constants.LOGIN
import com.example.jetpackcompose.utils.Constants.SIGN_UP
import com.example.jetpackcompose.utils.Constants.SPLASH
import com.example.jetpackcompose.screens.HomeScreen
import com.example.jetpackcompose.screens.LoginScreen
import com.example.jetpackcompose.screens.SignupScreen
import com.example.jetpackcompose.screens.SplashScreen

@Composable
fun AppNavigation() {

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = SPLASH) {

        composable(route = SPLASH) {
            SplashScreen(navController)
        }

        composable(route = LOGIN) {
            LoginScreen(navController)
        }

        composable(route = SIGN_UP) {
            SignupScreen(navController)
        }

        composable(route = HOME) {
            HomeScreen(navController)
        }
    }
}