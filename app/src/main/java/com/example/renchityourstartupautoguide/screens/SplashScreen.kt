package com.example.renchityourstartupautoguide.screens

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavController
import com.example.renchityourstartupautoguide.viewmodel.AuthViewModel

@Composable
fun SplashScreen(
    navController: NavController,
    viewModel: AuthViewModel
) {
    LaunchedEffect(Unit) {
        if (viewModel.isLogin()) {
            navController.navigate("home") {
                popUpTo("splash") {
                    inclusive = true
                }
            }
        } else {
            navController.navigate("login") {
                popUpTo("splash") {
                    inclusive = true
                }
            }
        }
    }
}
