package com.example.renchityourstartupautoguide.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.renchityourstartupautoguide.model.MaintenanceData
import com.example.renchityourstartupautoguide.model.MaintenanceTopic
import com.example.renchityourstartupautoguide.ui.theme.CardWhite
import com.example.renchityourstartupautoguide.ui.theme.DividerTaupe
import com.example.renchityourstartupautoguide.ui.theme.OxideBronze
import com.example.renchityourstartupautoguide.ui.theme.PrimaryText
import com.example.renchityourstartupautoguide.ui.theme.SecondaryText
import com.example.renchityourstartupautoguide.ui.theme.WarmIvory
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.fillMaxHeight

@Composable
fun MaintenanceHubScreen(
    onSelectTopic: (String) -> Unit,
    onBack: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(WarmIvory)
            .verticalScroll(rememberScrollState())
    ) {
        WarningTopBar(title = "RenChit", onBack = onBack)

        Column(modifier = Modifier.padding(horizontal = 16.dp)) {

            Text(
                text = "ESSENTIAL MAINTENANCE",
                style = MaterialTheme.typography.labelSmall,
                fontWeight = FontWeight.Bold,
                letterSpacing = 1.sp,
                color = OxideBronze
            )

            Spacer(modifier = Modifier.height(6.dp))

            Text(
                text = "Take care of your car",
                style = MaterialTheme.typography.headlineSmall,
                fontWeight = FontWeight.Bold,
                color = PrimaryText
            )

            Spacer(modifier = Modifier.height(6.dp))

            Text(
                text = "Understand routine maintenance, inspect important parts, and build good vehicle-care habits.",
                style = MaterialTheme.typography.bodyMedium,
                color = SecondaryText
            )

            Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = "Explore maintenance topics",
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold,
                color = PrimaryText
            )

            Spacer(modifier = Modifier.height(12.dp))

            MaintenanceData.topics.chunked(2).forEach { rowTopics ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(IntrinsicSize.Min),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    rowTopics.forEach { topic ->
                        MaintenanceTopicCard(
                            topic = topic,
                            count = MaintenanceData.guideCount(topic.id),
                            onClick = { onSelectTopic(topic.id) },
                            modifier = Modifier.weight(1f)
                        )
                    }
                    if (rowTopics.size == 1) {
                        Spacer(modifier = Modifier.weight(1f))
                    }
                }
                Spacer(modifier = Modifier.height(12.dp))
            }

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = "Maintenance schedule",
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold,
                color = PrimaryText
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = "What is commonly done at different intervals.",
                style = MaterialTheme.typography.bodyMedium,
                color = SecondaryText
            )

            Spacer(modifier = Modifier.height(12.dp))

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(16.dp))
                    .background(CardWhite)
                    .padding(16.dp)
            ) {
                ScheduleRow("Every month", "Basic inspections")
                HorizontalDivider(
                    modifier = Modifier.padding(vertical = 10.dp),
                    color = DividerTaupe
                )
                ScheduleRow("Every 6 months", "Routine servicing")
                HorizontalDivider(
                    modifier = Modifier.padding(vertical = 10.dp),
                    color = DividerTaupe
                )
                ScheduleRow("By mileage", "Manufacturer service intervals")
            }

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Illustrative categories only. Actual intervals depend on your owner's manual and how you drive.",
                style = MaterialTheme.typography.bodySmall,
                color = SecondaryText
            )

            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}

@Composable
private fun MaintenanceTopicCard(
    topic: MaintenanceTopic,
    count: Int,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val available = count > 0

    Column(
        modifier = modifier
            .fillMaxHeight()
            .clip(RoundedCornerShape(16.dp))
            .background(CardWhite)
            .clickable(enabled = available, onClick = onClick)
            .padding(16.dp)
    ) {
        MaintenanceIconTile(topicId = topic.id)

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = topic.title,
            style = MaterialTheme.typography.titleSmall,
            fontWeight = FontWeight.Bold,
            color = PrimaryText
        )

        Spacer(modifier = Modifier.height(4.dp))

        Text(
            text = topic.tagline,
            style = MaterialTheme.typography.bodySmall,
            color = SecondaryText
        )

        Spacer(modifier = Modifier.height(10.dp))
        Spacer(modifier = Modifier.weight(1f))

        Text(
            text = when {
                count == 1 -> "1 guide"
                else -> "$count guides"
            },
            style = MaterialTheme.typography.labelMedium,
            fontWeight = FontWeight.Bold,
            color = OxideBronze
        )
    }
}

@Composable
private fun ScheduleRow(title: String, detail: String) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = title,
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.SemiBold,
            color = PrimaryText
        )
        Text(
            text = detail,
            style = MaterialTheme.typography.bodyMedium,
            color = SecondaryText
        )
    }
}