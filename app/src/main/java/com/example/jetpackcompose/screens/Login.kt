package com.example.jetpackcompose.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme

@Composable
fun LoginScreen(
    navigateToSignUp: () -> Unit, navigateToHome: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Login Screen", fontSize = 52.sp
        )
        Spacer(
            modifier = Modifier.height(100.dp)
        )
        Row {
            Button(
                onClick = navigateToHome
            ) {
                Text(
                    text = "Login", fontSize = 24.sp
                )
            }
            Spacer(
                modifier = Modifier.width(24.dp)
            )
            Button(
                onClick = navigateToSignUp
            ) {
                Text(
                    text = "Sign Up", fontSize = 24.sp
                )
            }
        }
    }

}

@Preview
@Composable
fun previewLoginScreen() {
    JetpackComposeTheme {
        LoginScreen(
            navigateToSignUp = {},
            navigateToHome = {}
        )
    }
}