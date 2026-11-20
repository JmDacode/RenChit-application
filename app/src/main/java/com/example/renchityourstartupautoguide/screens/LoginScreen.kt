package com.example.renchityourstartupautoguide.screens

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.renchityourstartupautoguide.viewmodel.AuthViewModel
import androidx.compose.foundation.background
import com.example.renchityourstartupautoguide.ui.theme.LightText
import com.example.renchityourstartupautoguide.ui.theme.OxideBronze
import com.example.renchityourstartupautoguide.ui.theme.PrimaryText
import com.example.renchityourstartupautoguide.ui.theme.WarmIvory
import com.example.renchityourstartupautoguide.ui.theme.renChitFieldColors

@Composable
fun LoginScreen(
    navController: NavController,
    viewModel: AuthViewModel
) {
    val context = LocalContext.current

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(WarmIvory)
            .padding(24.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "RenChit Login",
            style = MaterialTheme.typography.headlineMedium,
            color = PrimaryText
        )

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email") },
            colors = renChitFieldColors(),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(12.dp))

        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Password") },
            visualTransformation = PasswordVisualTransformation(),
            colors = renChitFieldColors(),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {
                if (email.isBlank() || password.isBlank()) {
                    Toast.makeText(
                        context,
                        "Please complete all fields",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    viewModel.login(email.trim(), password) { success, result ->
                        if (success) {
                            navController.navigate("home") {
                                popUpTo("login") {
                                    inclusive = true
                                }
                            }
                        } else {
                            Toast.makeText(
                                context,
                                result,
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    }
                }
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = OxideBronze,
                contentColor = LightText
            ),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Login")
        }

        TextButton(
            onClick = {
                navController.navigate("register")
            },
            colors = ButtonDefaults.textButtonColors(contentColor = OxideBronze),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Create an account")
        }
    }
}
