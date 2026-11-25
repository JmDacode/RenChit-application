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
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
import com.example.renchityourstartupautoguide.model.VehicleData
import com.example.renchityourstartupautoguide.ui.theme.CardWhite
import com.example.renchityourstartupautoguide.ui.theme.DividerTaupe
import com.example.renchityourstartupautoguide.ui.theme.OxideBronze
import com.example.renchityourstartupautoguide.ui.theme.PrimaryText
import com.example.renchityourstartupautoguide.ui.theme.WarmIvory
import com.example.renchityourstartupautoguide.viewmodel.GarageViewModel
import java.util.Calendar

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun AddEditVehicleScreen(
    viewModel: GarageViewModel,
    vehicleId: String?,
    onDone: () -> Unit
) {
    val context = LocalContext.current
    val existing = remember(vehicleId) { vehicleId?.let { viewModel.getVehicle(it) } }

    var nickname by remember { mutableStateOf(existing?.nickname ?: "") }
    var typeId by remember { mutableStateOf(existing?.vehicleTypeId ?: "") }
    var make by remember { mutableStateOf(existing?.make ?: "") }
    var model by remember { mutableStateOf(existing?.model ?: "") }
    var year by remember {
        mutableStateOf(existing?.year?.takeIf { it > 0 }?.toString() ?: "")
    }
    var odometer by remember {
        mutableStateOf(existing?.odometer?.toString() ?: "")
    }
    var error by remember { mutableStateOf<String?>(null) }

    val fieldColors = OutlinedTextFieldDefaults.colors(
        focusedBorderColor = OxideBronze,
        focusedLabelColor = OxideBronze,
        cursorColor = OxideBronze
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(WarmIvory)
    ) {
        WarningTopBar(
            title = if (existing == null) "Add vehicle" else "Edit vehicle",
            onBack = onDone
        )

        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 16.dp)
        ) {
            Text(
                text = "VEHICLE DETAILS",
                style = MaterialTheme.typography.labelSmall,
                fontWeight = FontWeight.Bold,
                letterSpacing = 1.sp,
                color = OxideBronze
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Vehicle type",
                style = MaterialTheme.typography.titleSmall,
                fontWeight = FontWeight.Bold,
                color = PrimaryText
            )

            Spacer(modifier = Modifier.height(8.dp))

            FlowRow(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                VehicleData.types.forEach { type ->
                    val selected = typeId == type.id

                    Text(
                        text = type.name,
                        style = MaterialTheme.typography.bodyMedium,
                        fontWeight = FontWeight.SemiBold,
                        color = if (selected) Color.White else OxideBronze,
                        modifier = Modifier
                            .clip(RoundedCornerShape(22.dp))
                            .background(if (selected) OxideBronze else CardWhite)
                            .border(1.5.dp, DividerTaupe, RoundedCornerShape(22.dp))
                            .clickable { typeId = type.id }
                            .padding(horizontal = 16.dp, vertical = 10.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(
                value = nickname,
                onValueChange = { nickname = it },
                label = { Text("Nickname (optional)") },
                singleLine = true,
                colors = fieldColors,
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(12.dp))

            OutlinedTextField(
                value = make,
                onValueChange = { make = it },
                label = { Text("Manufacturer (for example Toyota)") },
                singleLine = true,
                colors = fieldColors,
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(12.dp))

            OutlinedTextField(
                value = model,
                onValueChange = { model = it },
                label = { Text("Model (for example Vios)") },
                singleLine = true,
                colors = fieldColors,
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(12.dp))

            OutlinedTextField(
                value = year,
                onValueChange = { year = it.filter { c -> c.isDigit() }.take(4) },
                label = { Text("Year") },
                singleLine = true,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                colors = fieldColors,
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(12.dp))

            OutlinedTextField(
                value = odometer,
                onValueChange = { odometer = it.filter { c -> c.isDigit() }.take(7) },
                label = { Text("Odometer in km (optional)") },
                singleLine = true,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                colors = fieldColors,
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
                    val yearInt = year.trim().toIntOrNull()
                    val odometerInt = odometer.trim().ifEmpty { "0" }.toIntOrNull()
                    val maxYear = Calendar.getInstance().get(Calendar.YEAR) + 1

                    when {
                        typeId.isEmpty() ->
                            error = "Please choose a vehicle type."

                        make.isBlank() || model.isBlank() ->
                            error = "Please enter the make and model."

                        yearInt == null || yearInt !in 1950..maxYear ->
                            error = "Please enter a valid year."

                        odometerInt == null ->
                            error = "Please enter a valid odometer reading."

                        else -> {
                            error = null

                            val onResult: (Boolean) -> Unit = { success ->
                                if (success) {
                                    onDone()
                                } else {
                                    Toast.makeText(
                                        context,
                                        "Could not save the vehicle",
                                        Toast.LENGTH_SHORT
                                    ).show()
                                }
                            }

                            if (existing == null) {
                                viewModel.addVehicle(
                                    nickname = nickname.trim(),
                                    vehicleTypeId = typeId,
                                    make = make.trim(),
                                    model = model.trim(),
                                    year = yearInt,
                                    odometer = odometerInt,
                                    onResult = onResult
                                )
                            } else {
                                viewModel.updateVehicle(
                                    existing.copy(
                                        nickname = nickname.trim(),
                                        vehicleTypeId = typeId,
                                        make = make.trim(),
                                        model = model.trim(),
                                        year = yearInt,
                                        odometer = odometerInt
                                    ),
                                    onResult
                                )
                            }
                        }
                    }
                },
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(containerColor = OxideBronze)
            ) {
                Text(if (existing == null) "Save vehicle" else "Save changes")
            }

            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}