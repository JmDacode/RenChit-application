package com.example.renchityourstartupautoguide.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.renchityourstartupautoguide.R
import com.example.renchityourstartupautoguide.model.displayVehicleType
import androidx.compose.material.icons.automirrored.outlined.ArrowBack
import androidx.compose.material.icons.Icons

private data class VehicleOption(
    val id: String,
    val description: String,
    val imageRes: Int
)

@Composable
fun VehicleTypeScreen(
    onSelect: (String) -> Unit,
    onBack: () -> Unit
) {
    val vehicleTypes = listOf(
        VehicleOption(
            id = "Sedan",
            description = "Everyday passenger cars",
            imageRes = R.drawable.ic_vehicle_sedan
        ),
        VehicleOption(
            id = "SUV",
            description = "Sport utility vehicles",
            imageRes = R.drawable.ic_vehicle_suv
        ),
        VehicleOption(
            id = "PickupTruck",
            description = "Utility and work-oriented vehicles",
            imageRes = R.drawable.ic_vehicle_pickup
        )
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 20.dp)
    ) {
        Spacer(Modifier.height(12.dp))

        // HEADER
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = onBack) {
                Icon(
                    imageVector = Icons.AutoMirrored.Outlined.ArrowBack,
                    contentDescription = "Back",
                    tint = MaterialTheme.colorScheme.primary
                )
            }

            Spacer(Modifier.width(8.dp))

            Column {
                Text(
                    text = "RenChit",
                    style = MaterialTheme.typography.labelMedium,
                    color = MaterialTheme.colorScheme.primary,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = "Vehicle Selection",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.SemiBold
                )
            }
        }

        Spacer(Modifier.height(32.dp))

        // INTRODUCTION
        Text(
            text = "Choose your vehicle",
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onBackground
        )

        Spacer(Modifier.height(8.dp))

        Text(
            text = "What do you drive? Select a vehicle type to start exploring its systems and components.",
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )

        Spacer(Modifier.height(28.dp))

        // SECTION LABEL
        Text(
            text = "AVAILABLE VEHICLE TYPES",
            style = MaterialTheme.typography.labelLarge,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )

        Spacer(Modifier.height(14.dp))

        // VEHICLE CARDS
        vehicleTypes.forEach { vehicle ->
            Card(
                onClick = { onSelect(vehicle.id) },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 14.dp),
                shape = RoundedCornerShape(20.dp),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.surface
                ),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 2.dp
                )
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(18.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // VEHICLE IMAGE
                    Surface(
                        modifier = Modifier.size(width = 100.dp, height = 68.dp),
                        shape = RoundedCornerShape(14.dp),
                        color = MaterialTheme.colorScheme.primaryContainer
                    ) {
                        Box(
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(vehicle.imageRes),
                                contentDescription = vehicle.id,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 4.dp)
                                    .height(50.dp)
                            )
                        }
                    }

                    Spacer(Modifier.width(16.dp))

                    // VEHICLE INFORMATION
                    Column(
                        modifier = Modifier.weight(1f)
                    ) {
                        Text(
                            text = displayVehicleType(vehicle.id),
                            style = MaterialTheme.typography.titleLarge,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurface
                        )

                        Spacer(Modifier.height(5.dp))

                        Text(
                            text = vehicle.description,
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )

                        Spacer(Modifier.height(7.dp))

                        Text(
                            text = "Explore vehicle components",
                            style = MaterialTheme.typography.labelSmall,
                            color = MaterialTheme.colorScheme.primary,
                            fontWeight = FontWeight.SemiBold
                        )
                    }

                    Spacer(Modifier.width(8.dp))

                    // ARROW
                    Text(
                        text = "›",
                        style = MaterialTheme.typography.headlineMedium,
                        color = MaterialTheme.colorScheme.primary
                    )
                }
            }
        }

        Spacer(Modifier.height(8.dp))

        // FOOTER
        Text(
            text = "Learn your vehicle. Understand how it works.",
            modifier = Modifier.fillMaxWidth(),
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )
    }
}