package com.example.renchityourstartupautoguide.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.renchityourstartupautoguide.viewmodel.displayVehicleType

@Composable
fun VehicleTypeScreen(
    onSelect: (String) -> Unit,
    onBack: () -> Unit
) {
    val vehicleTypes = listOf("Sedan", "SUV", "PickupTruck")

    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        OutlinedButton(onClick = onBack) { Text("Back") }
        Spacer(modifier = Modifier.height(8.dp))
        Text("Choose Your Vehicle", style = MaterialTheme.typography.headlineSmall)
        Text("Select the type of vehicle", style = MaterialTheme.typography.bodySmall)
        Spacer(modifier = Modifier.height(16.dp))

        vehicleTypes.forEach { vehicleType ->
            Button(
                onClick = { onSelect(vehicleType) },
                modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp)
            ) {
                Text(displayVehicleType(vehicleType))
            }
        }
    }
}
