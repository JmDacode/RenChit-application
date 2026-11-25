package com.example.renchityourstartupautoguide.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.renchityourstartupautoguide.model.MaintenanceLog
import com.example.renchityourstartupautoguide.ui.theme.CardWhite
import com.example.renchityourstartupautoguide.ui.theme.OxideBronze
import com.example.renchityourstartupautoguide.ui.theme.PrimaryText
import com.example.renchityourstartupautoguide.ui.theme.SecondaryText
import com.example.renchityourstartupautoguide.ui.theme.WarmIvory
import com.example.renchityourstartupautoguide.viewmodel.GarageViewModel
import com.example.renchityourstartupautoguide.viewmodel.MaintenanceLogViewModel

@Composable
fun MaintenanceLogScreen(
    vehicleId: String,
    garageViewModel: GarageViewModel,
    logViewModel: MaintenanceLogViewModel,
    onAddLog: () -> Unit,
    onEditLog: (String) -> Unit,
    onBack: () -> Unit
) {
    val allLogs by logViewModel.logs.collectAsState()
    val logs = allLogs.filter { it.vehicleId == vehicleId }

    val vehicle = garageViewModel.getVehicle(vehicleId)
    val vehicleName = vehicle?.let { v ->
        v.nickname.ifBlank { "${v.make} ${v.model}" }
    } ?: "This vehicle"

    var logToDelete by remember { mutableStateOf<MaintenanceLog?>(null) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(WarmIvory)
    ) {
        WarningTopBar(title = "Service history", onBack = onBack)

        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 16.dp)
        ) {
            Text(
                text = "MAINTENANCE LOG",
                style = MaterialTheme.typography.labelSmall,
                fontWeight = FontWeight.Bold,
                letterSpacing = 1.sp,
                color = OxideBronze
            )

            Spacer(modifier = Modifier.height(6.dp))

            Text(
                text = vehicleName,
                style = MaterialTheme.typography.headlineSmall,
                fontWeight = FontWeight.Bold,
                color = PrimaryText
            )

            Spacer(modifier = Modifier.height(6.dp))

            Text(
                text = "Keep a record of the service and maintenance done on this vehicle.",
                style = MaterialTheme.typography.bodyMedium,
                color = SecondaryText
            )

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = onAddLog,
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(containerColor = OxideBronze)
            ) {
                Text("Add service log")
            }

            Spacer(modifier = Modifier.height(16.dp))

            if (logs.isEmpty()) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(16.dp))
                        .background(CardWhite)
                        .padding(20.dp)
                ) {
                    Text(
                        text = "No service logs yet",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = PrimaryText
                    )

                    Spacer(modifier = Modifier.height(4.dp))

                    Text(
                        text = "Tap Add service log, or use Log this service on any maintenance guide.",
                        style = MaterialTheme.typography.bodyMedium,
                        color = SecondaryText
                    )
                }
            } else {
                logs.forEach { log ->
                    MaintenanceLogCard(
                        log = log,
                        onEdit = { onEditLog(log.id) },
                        onDelete = { logToDelete = log }
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                }
            }

            Spacer(modifier = Modifier.height(12.dp))
        }
    }

    logToDelete?.let { log ->
        AlertDialog(
            onDismissRequest = { logToDelete = null },
            title = { Text("Delete log?") },
            text = { Text("This removes \"${log.title}\" from the service history.") },
            confirmButton = {
                TextButton(
                    onClick = {
                        logViewModel.deleteLog(log.id)
                        logToDelete = null
                    }
                ) {
                    Text("Delete", color = Color(0xFFB3261E))
                }
            },
            dismissButton = {
                TextButton(onClick = { logToDelete = null }) {
                    Text("Cancel", color = OxideBronze)
                }
            }
        )
    }
}

@Composable
private fun MaintenanceLogCard(
    log: MaintenanceLog,
    onEdit: () -> Unit,
    onDelete: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .background(CardWhite)
            .padding(16.dp)
    ) {
        Text(
            text = log.title,
            style = MaterialTheme.typography.titleSmall,
            fontWeight = FontWeight.Bold,
            color = PrimaryText
        )

        Spacer(modifier = Modifier.height(2.dp))

        Text(
            text = "${log.date}, ${"%,d".format(log.odometer)} km",
            style = MaterialTheme.typography.bodyMedium,
            color = SecondaryText
        )

        if (log.notes.isNotBlank()) {
            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = log.notes,
                style = MaterialTheme.typography.bodyMedium,
                color = PrimaryText
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            TextButton(onClick = onEdit) {
                Text("Edit", color = OxideBronze)
            }
            TextButton(onClick = onDelete) {
                Text("Delete", color = Color(0xFFB3261E))
            }
        }
    }
}