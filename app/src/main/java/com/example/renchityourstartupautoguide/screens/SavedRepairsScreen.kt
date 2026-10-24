package com.example.renchityourstartupautoguide.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.renchityourstartupautoguide.viewmodel.RenChitViewModel
import com.example.renchityourstartupautoguide.viewmodel.displayCategory
import com.example.renchityourstartupautoguide.viewmodel.displayVehicleType
import com.example.renchityourstartupautoguide.ui.theme.DeepCharcoal
import com.example.renchityourstartupautoguide.ui.theme.SandGold

@Composable
fun SavedRepairsScreen(
    viewModel: RenChitViewModel,
    onAddRepair: () -> Unit,
    onView: (String) -> Unit,
    onEdit: (String) -> Unit,
    onBack: () -> Unit
) {
    val savedRepairs by viewModel.savedRepairs.collectAsStateWithLifecycle()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        OutlinedButton(onClick = onBack) {
            Text("Back")
        }

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            "My Saved Repairs",
            style = MaterialTheme.typography.headlineSmall
        )

        Spacer(modifier = Modifier.height(12.dp))

        if (savedRepairs.isEmpty()) {
            Text("No saved repairs yet.")
        } else {
            LazyColumn(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                items(savedRepairs, key = { it.id }) { saved ->
                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        colors = CardDefaults.cardColors(
                            containerColor = DeepCharcoal
                        )
                    ) {
                        Column(
                            modifier = Modifier.padding(16.dp)
                        ) {
                            Text(
                                "${displayVehicleType(saved.vehicleType)} · " +
                                        displayCategory(saved.category),
                                style = MaterialTheme.typography.bodySmall,
                                color = Color.White
                            )

                            Text(
                                text = saved.problemTask,
                                style = MaterialTheme.typography.titleMedium,
                                color = SandGold
                            )

                            if (saved.userNote.isNotBlank()) {
                                Text(
                                    text = "Note: ${saved.userNote}",
                                    style = MaterialTheme.typography.bodySmall,
                                    color = Color.White
                                )
                            }

                            Spacer(modifier = Modifier.height(8.dp))

                            Row(
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                Button(
                                    onClick = { onView(saved.id) }
                                ) {
                                    Text("View")
                                }

                                Button(
                                    onClick = { onEdit(saved.id) }
                                ) {
                                    Text("Edit")
                                }

                                Button(
                                    onClick = {
                                        viewModel.deleteSavedRepair(saved.id)
                                    }
                                ) {
                                    Text("Delete")
                                }
                            }
                        }
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(12.dp))

        Button(
            onClick = onAddRepair,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("+ Add Repair")
        }
    }
}
