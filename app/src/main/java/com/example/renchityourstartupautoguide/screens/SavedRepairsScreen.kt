package com.example.renchityourstartupautoguide.screens

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
fun SavedRepairsScreen(
    viewModel: RenChitViewModel,
    onAddRepair: () -> Unit,
    onView: (Int) -> Unit,
    onEdit: (Int) -> Unit,
    onBack: () -> Unit
) {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        OutlinedButton(onClick = onBack) { Text("Back") }
        Spacer(modifier = Modifier.height(8.dp))
        Text("My Saved Repairs", style = MaterialTheme.typography.headlineSmall)
        Spacer(modifier = Modifier.height(12.dp))

        if (viewModel.savedRepairs.isEmpty()) {
            Text("No saved repairs yet.")
        } else {
            LazyColumn(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                items(viewModel.savedRepairs, key = { it.id }) { saved ->
                    Card(modifier = Modifier.fillMaxWidth()) {
                        Column(modifier = Modifier.padding(16.dp)) {
                            Text(
                                "${displayVehicleType(saved.vehicleType)} \u00b7 ${displayCategory(saved.category)}",
                                style = MaterialTheme.typography.bodySmall
                            )
                            Text(saved.problemTask, style = MaterialTheme.typography.titleMedium)
                            if (saved.userNote.isNotBlank()) {
                                Text("Note: ${saved.userNote}", style = MaterialTheme.typography.bodySmall)
                            }
                            Spacer(modifier = Modifier.height(8.dp))
                            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                                Button(onClick = { onView(saved.id) }) { Text("View") }
                                OutlinedButton(onClick = { onEdit(saved.id) }) { Text("Edit") }
                                OutlinedButton(onClick = { viewModel.deleteSavedRepair(saved.id) }) { Text("Delete") }
                            }
                        }
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(12.dp))
        Button(onClick = onAddRepair, modifier = Modifier.fillMaxWidth()) {
            Text("+ Add Repair")
        }
    }
}