package com.example.renchityourstartupautoguide.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.renchityourstartupautoguide.R

// Soft tile behind the category icons
val IconTileColor = Color(0xFFF0E8DA)

@Composable
fun ChecklistProgressBar(
    fraction: Float,
    trackColor: Color,
    fillColor: Color,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(8.dp)
            .clip(RoundedCornerShape(4.dp))
            .background(trackColor)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth(fraction.coerceIn(0f, 1f))
                .fillMaxHeight()
                .background(fillColor)
        )
    }
}

fun checklistIconFor(categoryId: String): Int = when (categoryId) {
    "before_drive" -> R.drawable.ic_cl_car
    "weekly" -> R.drawable.ic_cl_calendar
    "monthly" -> R.drawable.ic_cl_calendar_check
    "long_trip" -> R.drawable.ic_cl_trip
    "after_parking" -> R.drawable.ic_cl_parking
    else -> R.drawable.ic_cl_kit
}