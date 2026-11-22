package com.example.renchityourstartupautoguide.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.renchityourstartupautoguide.model.VehicleData
import com.example.renchityourstartupautoguide.ui.theme.OxideBronze
import com.example.renchityourstartupautoguide.ui.theme.PrimaryText
import com.example.renchityourstartupautoguide.ui.theme.SecondaryText
import com.example.renchityourstartupautoguide.ui.theme.WarmIvory
import androidx.compose.foundation.layout.aspectRatio

@Composable
fun VehicleDetailScreen(
    typeId: String,
    onBack: () -> Unit
) {
    val type = VehicleData.getType(typeId)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(WarmIvory)
    ) {
        WarningTopBar(title = "Explore Guide", onBack = onBack)

        if (type == null) {
            Text(
                text = "This vehicle type could not be found.",
                style = MaterialTheme.typography.bodyMedium,
                color = SecondaryText,
                modifier = Modifier.padding(16.dp)
            )
        } else {
            Column(
                modifier = Modifier
                    .verticalScroll(rememberScrollState())
                    .padding(horizontal = 16.dp)
            ) {

                Text(
                    text = "VEHICLE OVERVIEW",
                    style = MaterialTheme.typography.labelSmall,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 1.sp,
                    color = OxideBronze
                )

                Spacer(modifier = Modifier.height(10.dp))

                VehiclePhoto(
                    imageName = type.imageName,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .clip(RoundedCornerShape(16.dp))
                )

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = type.name,
                    style = MaterialTheme.typography.headlineSmall,
                    fontWeight = FontWeight.Bold,
                    color = PrimaryText
                )

                Spacer(modifier = Modifier.height(6.dp))

                Text(
                    text = type.definition,
                    style = MaterialTheme.typography.bodyLarge,
                    color = PrimaryText
                )

                Spacer(modifier = Modifier.height(20.dp))

                MaintenanceHeading("What makes it a ${type.name}?")
                Spacer(modifier = Modifier.height(10.dp))
                type.whatMakesIt.forEach { item ->
                    MaintenanceBullet(text = item)
                    Spacer(modifier = Modifier.height(8.dp))
                }

                Spacer(modifier = Modifier.height(12.dp))

                MaintenanceHeading("Common uses")
                Spacer(modifier = Modifier.height(10.dp))
                type.commonUses.forEach { item ->
                    MaintenanceBullet(text = item)
                    Spacer(modifier = Modifier.height(8.dp))
                }

                Spacer(modifier = Modifier.height(12.dp))

                // Delete this card to remove "Good for"
                VehicleInfoCard(
                    title = "Good for",
                    lines = type.goodFor,
                    background = Color(0xFFDDE8E0),
                    accent = Color(0xFF3F5648)
                )

                Spacer(modifier = Modifier.height(12.dp))

                // Delete this card to remove "Keep in mind"
                VehicleInfoCard(
                    title = "Keep in mind",
                    lines = type.keepInMind,
                    background = Color(0xFFFBE5D8),
                    accent = Color(0xFF9A4A14)
                )

                Spacer(modifier = Modifier.height(20.dp))

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(16.dp))
                        .background(Color(0xFFF3E6CC))
                        .padding(16.dp)
                ) {
                    Text(
                        text = "Did you know?",
                        style = MaterialTheme.typography.titleSmall,
                        fontWeight = FontWeight.Bold,
                        color = OxideBronze
                    )

                    Spacer(modifier = Modifier.height(6.dp))

                    Text(
                        text = type.didYouKnow,
                        style = MaterialTheme.typography.bodyLarge,
                        color = PrimaryText
                    )
                }

                Spacer(modifier = Modifier.height(24.dp))
            }
        }
    }
}

@Composable
private fun VehicleInfoCard(
    title: String,
    lines: List<String>,
    background: Color,
    accent: Color
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .background(background)
            .padding(16.dp)
    ) {
        Text(
            text = title,
            style = MaterialTheme.typography.titleSmall,
            fontWeight = FontWeight.Bold,
            color = accent
        )

        Spacer(modifier = Modifier.height(8.dp))

        lines.forEach { line ->
            MaintenanceBullet(text = line, dotColor = accent)
            Spacer(modifier = Modifier.height(6.dp))
        }
    }
}