package com.example.renchityourstartupautoguide.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.renchityourstartupautoguide.viewmodel.displayCategory
import com.example.renchityourstartupautoguide.viewmodel.displayVehicleType
import com.example.renchityourstartupautoguide.viewmodel.RenChitViewModel

@Composable
fun RepairCategoriesScreen(
    viewModel: RenChitViewModel,
    vehicleType: String,
    onSelectCategory: (String) -> Unit,
    onBack: () -> Unit
) {
    val categories = viewModel.categoriesFor(vehicleType)

    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        OutlinedButton(onClick = onBack) { Text("Back") }
        Spacer(modifier = Modifier.height(8.dp))
        Text("Repair Categories", style = MaterialTheme.typography.headlineSmall)
        Text("Vehicle: ${displayVehicleType(vehicleType)}", style = MaterialTheme.typography.bodySmall)
        Spacer(modifier = Modifier.height(12.dp))

        if (categories.isEmpty()) {
            Text("No repair categories available for this vehicle yet.")
        } else {
            LazyColumn(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                items(categories) { category ->
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable { onSelectCategory(category) }
                    ) {
                        Text(
                            displayCategory(category),
                            modifier = Modifier.padding(16.dp),
                            style = MaterialTheme.typography.titleMedium
                        )
                    }
                }
            }
        }
    }
}