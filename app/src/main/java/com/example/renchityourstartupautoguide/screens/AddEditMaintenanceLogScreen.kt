package com.example.renchityourstartupautoguide.screens

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.renchityourstartupautoguide.model.GarageVehicle
import com.example.renchityourstartupautoguide.model.MaintenanceData
import com.example.renchityourstartupautoguide.model.MaintenanceLog
import com.example.renchityourstartupautoguide.ui.theme.CardWhite
import com.example.renchityourstartupautoguide.ui.theme.DividerTaupe
import com.example.renchityourstartupautoguide.ui.theme.OxideBronze
import com.example.renchityourstartupautoguide.ui.theme.PrimaryText
import com.example.renchityourstartupautoguide.ui.theme.SecondaryText
import com.example.renchityourstartupautoguide.ui.theme.WarmIvory
import com.example.renchityourstartupautoguide.ui.theme.renChitFieldColors
import com.example.renchityourstartupautoguide.viewmodel.GarageViewModel
import com.example.renchityourstartupautoguide.viewmodel.MaintenanceLogViewModel
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun AddEditMaintenanceLogScreen(
    vehicleId: String?,
    guideId: String?,
    logId: String?,
    garageViewModel: GarageViewModel,
    logViewModel: MaintenanceLogViewModel,
    onOpenGarage: () -> Unit,
    onDone: () -> Unit
) {
    val context = LocalContext.current
    val vehicles by garageViewModel.vehicles.collectAsState()

    val existing = remember(logId) { logId?.let { logViewModel.getLog(it) } }
    val guide = remember(guideId) { guideId?.let { MaintenanceData.getGuide(it) } }

    var selectedVehicleId by remember {
        mutableStateOf(existing?.vehicleId ?: vehicleId ?: "")
    }
    var title by remember { mutableStateOf(existing?.title ?: guide?.title ?: "") }
    var date by remember { mutableStateOf(existing?.date ?: todayText()) }
    var odometer by remember {
        mutableStateOf(
            existing?.odometer?.toString()
                ?: garageViewModel.getVehicle(vehicleId ?: "")?.odometer?.toString()
                ?: ""
        )
    }
    var notes by remember { mutableStateOf(existing?.notes ?: "") }
    var error by remember { mutableStateOf<String?>(null) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(WarmIvory)
    ) {
        WarningTopBar(
            title = if (existing == null) "Log service" else "Edit log",
            onBack = onDone
        )

        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 16.dp)
        ) {
            Text(
                text = "SERVICE DETAILS",
                style = MaterialTheme.typography.labelSmall,
                fontWeight = FontWeight.Bold,
                letterSpacing = 1.sp,
                color = OxideBronze
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Vehicle",
                style = MaterialTheme.typography.titleSmall,
                fontWeight = FontWeight.Bold,
                color = PrimaryText
            )

            Spacer(modifier = Modifier.height(8.dp))

            if (existing != null) {
                Text(
                    text = existing.vehicleName,
                    style = MaterialTheme.typography.bodyLarge,
                    color = PrimaryText
                )
            } else if (vehicles.isEmpty()) {
                Text(
                    text = "You need to add a vehicle in My Garage first.",
                    style = MaterialTheme.typography.bodyMedium,
                    color = SecondaryText
                )

                Spacer(modifier = Modifier.height(8.dp))

                Button(
                    onClick = onOpenGarage,
                    colors = ButtonDefaults.buttonColors(containerColor = OxideBronze)
                ) {
                    Text("Go to My Garage")
                }
            } else {
                FlowRow(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    vehicles.forEach { vehicle ->
                        val selected = selectedVehicleId == vehicle.id

                        Text(
                            text = logVehicleName(vehicle),
                            style = MaterialTheme.typography.bodyMedium,
                            fontWeight = FontWeight.SemiBold,
                            color = if (selected) Color.White else OxideBronze,
                            modifier = Modifier
                                .clip(RoundedCornerShape(22.dp))
                                .background(if (selected) OxideBronze else CardWhite)
                                .border(1.5.dp, DividerTaupe, RoundedCornerShape(22.dp))
                                .clickable {
                                    selectedVehicleId = vehicle.id
                                    if (odometer.isBlank()) {
                                        odometer = vehicle.odometer.toString()
                                    }
                                }
                                .padding(horizontal = 16.dp, vertical = 10.dp)
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(
                value = title,
                onValueChange = { title = it },
                label = { Text("What was done (for example Oil change)") },
                singleLine = true,
                colors = renChitFieldColors(),
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(12.dp))

            OutlinedTextField(
                value = date,
                onValueChange = { date = it },
                label = { Text("Date (year-month-day)") },
                singleLine = true,
                colors = renChitFieldColors(),
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(12.dp))

            OutlinedTextField(
                value = odometer,
                onValueChange = { odometer = it.filter { c -> c.isDigit() }.take(7) },
                label = { Text("Odometer in km (optional)") },
                singleLine = true,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                colors = renChitFieldColors(),
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(12.dp))

            OutlinedTextField(
                value = notes,
                onValueChange = { notes = it },
                label = { Text("Notes (optional)") },
                minLines = 3,
                colors = renChitFieldColors(),
                modifier = Modifier.fillMaxWidth()
            )

            if (error != null) {
                Spacer(modifier = Modifier.height(12.dp))

                Text(
                    text = error ?: "",
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color(0xFFB3261E)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = {
                    val cleanDate = normalizeDate(date)
                    val odometerInt = odometer.trim().ifEmpty { "0" }.toIntOrNull()
                    val chosenVehicle = vehicles.find { it.id == selectedVehicleId }

                    when {
                        existing == null && selectedVehicleId.isEmpty() ->
                            error = "Please choose a vehicle."

                        title.isBlank() ->
                            error = "Please enter what was done."

                        cleanDate == null ->
                            error = "Please enter a valid date, like 2026-11-25."

                        odometerInt == null ->
                            error = "Please enter a valid odometer reading."

                        else -> {
                            error = null

                            if (existing == null) {
                                logViewModel.addLog(
                                    MaintenanceLog(
                                        vehicleId = selectedVehicleId,
                                        vehicleName = chosenVehicle?.let { logVehicleName(it) } ?: "",
                                        title = title.trim(),
                                        guideId = guide?.id ?: "",
                                        date = cleanDate,
                                        odometer = odometerInt,
                                        notes = notes.trim(),
                                        createdAt = System.currentTimeMillis()
                                    )
                                )
                            } else {
                                logViewModel.updateLog(
                                    existing.id,
                                    mapOf<String, Any>(
                                        "title" to title.trim(),
                                        "date" to cleanDate,
                                        "odometer" to odometerInt,
                                        "notes" to notes.trim()
                                    )
                                )
                            }

                            Toast.makeText(
                                context,
                                "Service log saved",
                                Toast.LENGTH_SHORT
                            ).show()
                            onDone()
                        }
                    }
                },
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(containerColor = OxideBronze)
            ) {
                Text(if (existing == null) "Save log" else "Save changes")
            }

            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}

private fun logVehicleName(vehicle: GarageVehicle): String =
    vehicle.nickname.ifBlank { "${vehicle.make} ${vehicle.model}" }

private fun todayText(): String =
    SimpleDateFormat("yyyy-MM-dd", Locale.US).format(Date())

// Returns the date in yyyy-MM-dd form, or null if it is not a real date
private fun normalizeDate(text: String): String? {
    val format = SimpleDateFormat("yyyy-MM-dd", Locale.US)
    format.isLenient = false

    return try {
        val parsed = format.parse(text.trim())
        if (parsed == null) null else format.format(parsed)
    } catch (e: Exception) {
        null
    }
}