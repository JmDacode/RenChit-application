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
fun ProblemTaskListScreen(
    viewModel: RenChitViewModel,
    vehicleType: String,
    category: String,
    onSelectGuide: (Int) -> Unit,
    onBack: () -> Unit
) {
    val guides = viewModel.guidesFor(vehicleType, category)

    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        OutlinedButton(onClick = onBack) { Text("Back") }
        Spacer(modifier = Modifier.height(8.dp))
        Text(displayCategory(category), style = MaterialTheme.typography.headlineSmall)
        Text("Vehicle: ${displayVehicleType(vehicleType)}", style = MaterialTheme.typography.bodySmall)
        Text("Select a problem or task", style = MaterialTheme.typography.bodySmall)
        Spacer(modifier = Modifier.height(12.dp))

        if (guides.isEmpty()) {
            Text("No problems or tasks available yet.")
        } else {
            LazyColumn(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                items(guides) { guide ->
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable { onSelectGuide(guide.id) }
                    ) {
                        Column(modifier = Modifier.padding(16.dp)) {
                            Text(guide.problemTask, style = MaterialTheme.typography.titleMedium)
                            Text(guide.description, style = MaterialTheme.typography.bodySmall)
                        }
                    }
                }
            }
        }
    }
}