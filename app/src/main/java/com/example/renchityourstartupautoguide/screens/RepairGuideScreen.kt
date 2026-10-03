package com.example.renchityourstartupautoguide.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.renchityourstartupautoguide.viewmodel.displayCategory
import com.example.renchityourstartupautoguide.viewmodel.displayVehicleType
import com.example.renchityourstartupautoguide.viewmodel.RenChitViewModel

@Composable
fun RepairGuideScreen(
    viewModel: RenChitViewModel,
    guideId: Int,
    onSaved: () -> Unit,
    onBack: () -> Unit
) {
    val guide = viewModel.getGuide(guideId)

    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        OutlinedButton(onClick = onBack) { Text("Back") }
        Spacer(modifier = Modifier.height(8.dp))

        if (guide == null) {
            Text("Repair guide not found.")
            return@Column
        }

        Text(guide.problemTask, style = MaterialTheme.typography.headlineSmall)
        Text(
            "${displayVehicleType(guide.vehicleType)} \u00b7 ${displayCategory(guide.category)}",
            style = MaterialTheme.typography.bodySmall
        )
        Spacer(modifier = Modifier.height(12.dp))

        InfoCard("Possible Causes", guide.possibleCauses)
        Spacer(modifier = Modifier.height(8.dp))
        InfoCard("Basic Checks", guide.basicChecks)
        Spacer(modifier = Modifier.height(8.dp))
        InfoCard("Recommended Action", guide.recommendedAction)
        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                viewModel.addSavedRepair(
                    guideId = guide.id,
                    vehicleType = guide.vehicleType,
                    category = guide.category,
                    problemTask = guide.problemTask,
                    userNote = ""
                )
                onSaved()
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Save to My Repairs")
        }
    }
}

@Composable
private fun InfoCard(title: String, body: String) {
    Card(modifier = Modifier.fillMaxWidth()) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(title, style = MaterialTheme.typography.titleSmall)
            Text(body, style = MaterialTheme.typography.bodySmall)
        }
    }
}