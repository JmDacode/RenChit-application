package com.example.renchityourstartupautoguide.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.BatteryChargingFull
import androidx.compose.material.icons.outlined.Build
import androidx.compose.material.icons.outlined.Cable
import androidx.compose.material.icons.outlined.DonutLarge
import androidx.compose.material.icons.outlined.FilterAlt
import androidx.compose.material.icons.outlined.Lightbulb
import androidx.compose.material.icons.outlined.WaterDrop
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.renchityourstartupautoguide.ui.theme.OxideBronze
import com.example.renchityourstartupautoguide.ui.theme.PrimaryText
import com.example.renchityourstartupautoguide.ui.theme.TrailSage

fun maintenanceTopicIcon(topicId: String): ImageVector = when (topicId) {
    "fluids" -> Icons.Outlined.WaterDrop
    "tires" -> Icons.Outlined.DonutLarge
    "battery" -> Icons.Outlined.BatteryChargingFull
    "filters" -> Icons.Outlined.FilterAlt
    "belts_hoses" -> Icons.Outlined.Cable
    "exterior" -> Icons.Outlined.Lightbulb
    else -> Icons.Outlined.Build
}

@Composable
fun MaintenanceIconTile(topicId: String, size: Dp = 44.dp) {
    Box(
        modifier = Modifier
            .size(size)
            .clip(RoundedCornerShape(12.dp))
            .background(IconTileColor),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            imageVector = maintenanceTopicIcon(topicId),
            contentDescription = null,
            tint = OxideBronze,
            modifier = Modifier.size(size * 0.5f)
        )
    }
}

@Composable
fun MaintenanceChip(text: String, background: Color, textColor: Color) {
    Text(
        text = text,
        style = MaterialTheme.typography.labelMedium,
        fontWeight = FontWeight.SemiBold,
        color = textColor,
        modifier = Modifier
            .clip(RoundedCornerShape(50))
            .background(background)
            .padding(horizontal = 10.dp, vertical = 4.dp)
    )
}

@Composable
fun MaintenanceLevelChip(level: String) {
    when (level) {
        "Intermediate" -> MaintenanceChip(level, Color(0xFFF3E6CC), OxideBronze)
        "Professional" -> MaintenanceChip(level, Color(0xFFFDE3E1), Color(0xFFB3261E))
        else -> MaintenanceChip(level, Color(0xFFDDE8E0), Color(0xFF3F5648))
    }
}

@Composable
fun MaintenanceHeading(text: String) {
    Text(
        text = text,
        style = MaterialTheme.typography.titleMedium,
        fontWeight = FontWeight.Bold,
        color = PrimaryText
    )
}

@Composable
fun MaintenanceBullet(text: String, dotColor: Color = TrailSage, textColor: Color = PrimaryText) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        verticalAlignment = Alignment.Top
    ) {
        Box(
            modifier = Modifier
                .padding(top = 8.dp)
                .size(8.dp)
                .clip(CircleShape)
                .background(dotColor)
        )
        Text(
            text = text,
            style = MaterialTheme.typography.bodyLarge,
            color = textColor
        )
    }
}

@Composable
fun MaintenanceStep(number: Int, text: String) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        verticalAlignment = Alignment.Top
    ) {
        Box(
            modifier = Modifier
                .size(28.dp)
                .clip(CircleShape)
                .background(OxideBronze),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = number.toString(),
                style = MaterialTheme.typography.labelLarge,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }
        Text(
            text = text,
            style = MaterialTheme.typography.bodyLarge,
            color = PrimaryText,
            modifier = Modifier.padding(top = 2.dp)
        )
    }
}