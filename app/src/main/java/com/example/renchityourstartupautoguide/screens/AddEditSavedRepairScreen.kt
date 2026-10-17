package com.example.renchityourstartupautoguide.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.renchityourstartupautoguide.viewmodel.RenChitViewModel

@Composable
fun AddEditSavedRepairScreen(
    viewModel: RenChitViewModel,
    savedRepairId: Int?,
    onDone: () -> Unit
) {
    val savedRepairs by viewModel.savedRepairs.collectAsStateWithLifecycle()

    val existing = savedRepairId?.let { id ->
        savedRepairs.find { it.id == id }
    }

    var vehicleType by remember(savedRepairId) {
        mutableStateOf("")
    }
    var category by remember(savedRepairId) {
        mutableStateOf("")
    }
    var problemTask by remember(savedRepairId) {
        mutableStateOf("")
    }
    var note by remember(savedRepairId) {
        mutableStateOf("")
    }

    var initialized by remember(savedRepairId) {
        mutableStateOf(savedRepairId == null)
    }

    LaunchedEffect(savedRepairId, existing) {
        if (existing != null) {
            vehicleType = existing.vehicleType
            category = existing.category
            problemTask = existing.problemTask
            note = existing.userNote
            initialized = true
        }
    }

    if (!initialized) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            CircularProgressIndicator()
            Spacer(modifier = Modifier.height(8.dp))
            Text("Loading saved repair...")
        }
        return
    }

    if (savedRepairId != null && existing == null) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Text("Saved repair not found.")
            Spacer(modifier = Modifier.height(12.dp))
            OutlinedButton(onClick = onDone) {
                Text("Back")
            }
        }
        return
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            if (savedRepairId == null) "Add Repair" else "Edit Repair",
            style = MaterialTheme.typography.headlineSmall
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = vehicleType,
            onValueChange = { vehicleType = it },
            label = { Text("Vehicle Type") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = category,
            onValueChange = { category = it },
            label = { Text("Category") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = problemTask,
            onValueChange = { problemTask = it },
            label = { Text("Problem / Task") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = note,
            onValueChange = { note = it },
            label = { Text("Note") },
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            OutlinedButton(onClick = onDone) {
                Text("Cancel")
            }

            Button(
                onClick = {
                    if (savedRepairId == null) {
                        viewModel.addSavedRepair(
                            guideId = 0,
                            vehicleType = vehicleType.trim(),
                            category = category.trim(),
                            problemTask = problemTask.trim(),
                            userNote = note.trim()
                        )
                    } else {
                        viewModel.updateSavedRepair(
                            id = savedRepairId,
                            vehicleType = vehicleType.trim(),
                            category = category.trim(),
                            problemTask = problemTask.trim(),
                            userNote = note.trim()
                        )
                    }
                    onDone()
                },
                enabled = vehicleType.isNotBlank() &&
                        category.isNotBlank() &&
                        problemTask.isNotBlank()
            ) {
                Text("Save Repair")
            }
        }
    }
}