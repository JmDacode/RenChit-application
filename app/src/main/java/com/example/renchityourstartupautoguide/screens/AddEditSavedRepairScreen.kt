package com.example.renchityourstartupautoguide.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.renchityourstartupautoguide.viewmodel.RenChitViewModel

@Composable
fun AddEditSavedRepairScreen(
    viewModel: RenChitViewModel,
    savedRepairId: Int?,
    onDone: () -> Unit
) {
    val existing = remember(savedRepairId) { savedRepairId?.let { viewModel.getSavedRepair(it) } }

    var vehicleType by remember { mutableStateOf(existing?.vehicleType ?: "") }
    var category by remember { mutableStateOf(existing?.category ?: "") }
    var problemTask by remember { mutableStateOf(existing?.problemTask ?: "") }
    var note by remember { mutableStateOf(existing?.userNote ?: "") }

    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text(
            if (existing == null) "Add Repair" else "Edit Repair",
            style = MaterialTheme.typography.headlineSmall
        )
        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = vehicleType, onValueChange = { vehicleType = it },
            label = { Text("Vehicle Type") }, modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = category, onValueChange = { category = it },
            label = { Text("Category") }, modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = problemTask, onValueChange = { problemTask = it },
            label = { Text("Problem / Task") }, modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = note, onValueChange = { note = it },
            label = { Text("Note") }, modifier = Modifier.fillMaxWidth().height(100.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))

        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            OutlinedButton(onClick = onDone) { Text("Cancel") }
            Button(onClick = {
                if (existing == null) {

                    viewModel.addSavedRepair(0, vehicleType, category, problemTask, note)
                } else {
                    viewModel.updateSavedRepair(existing.id, vehicleType, category, problemTask, note)
                }
                onDone()
            }) { Text("Save Repair") }
        }
    }
}