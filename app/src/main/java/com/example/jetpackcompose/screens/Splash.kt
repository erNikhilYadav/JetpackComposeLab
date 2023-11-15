package com.example.jetpackcompose.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme
import kotlinx.coroutines.delay

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(
    navigateAfterAnimation: () -> Unit
) {
    val proceed = true
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Splash \n Screen",
            fontSize = 52.sp
        )
    }

    LaunchedEffect(key1 = proceed, block = {
        delay(2000)
        navigateAfterAnimation.invoke()
    })

}


@Preview()
@Composable
fun SignInPreview() {
    JetpackComposeTheme {
        SplashScreen {}
    }
}