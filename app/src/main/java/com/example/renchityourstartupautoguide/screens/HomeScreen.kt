package com.example.renchityourstartupautoguide.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(
    username: String,
    onFindRepair: () -> Unit,
    onViewSaved: () -> Unit,
    onLogout: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text("RenChit", style = MaterialTheme.typography.headlineLarge)
        Text("Your Start-Up Auto Guide", style = MaterialTheme.typography.bodyMedium)
        Spacer(modifier = Modifier.height(12.dp))
        Text(
            "Beginner-friendly guides for common vehicle problems.",
            style = MaterialTheme.typography.bodySmall
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text("Logged in as $username", style = MaterialTheme.typography.bodySmall)
        Spacer(modifier = Modifier.height(24.dp))
        Button(onClick = onFindRepair, modifier = Modifier.fillMaxWidth()) {
            Text("Find a Repair Guide")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = onViewSaved, modifier = Modifier.fillMaxWidth()) {
            Text("My Saved Repairs")
        }
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedButton(onClick = onLogout, modifier = Modifier.fillMaxWidth()) {
            Text("Log Out")
        }
    }
}