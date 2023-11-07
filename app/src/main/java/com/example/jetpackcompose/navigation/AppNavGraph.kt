package com.example.jetpackcompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcompose.screens.HomeScreen
import com.example.jetpackcompose.screens.LoginScreen
import com.example.jetpackcompose.screens.SignupScreen
import com.example.jetpackcompose.screens.SplashScreen

@Composable
fun Nav(){

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "splash"){

        composable(route = "splash"){
            SplashScreen(navController)
        }

        composable(route = "login"){
            LoginScreen(navController)
        }

        composable(route = "signup"){
            SignupScreen(navController)
        }

        composable(route = "home"){
            HomeScreen(navController)
        }
    }
}