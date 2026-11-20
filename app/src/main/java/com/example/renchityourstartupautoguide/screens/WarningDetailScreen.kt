package com.example.renchityourstartupautoguide.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.renchityourstartupautoguide.model.WarningData
import com.example.renchityourstartupautoguide.ui.theme.CardWhite
import com.example.renchityourstartupautoguide.ui.theme.OxideBronze
import com.example.renchityourstartupautoguide.ui.theme.PrimaryText
import com.example.renchityourstartupautoguide.ui.theme.SecondaryText
import com.example.renchityourstartupautoguide.ui.theme.WarmIvory

@Composable
fun WarningDetailScreen(
    itemId: String,
    onBack: () -> Unit
) {
    val item = WarningData.getItem(itemId)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(WarmIvory)
    ) {
        WarningTopBar(
            title = item?.title ?: "Warning Sign",
            onBack = onBack
        )

        if (item == null) {
            Text(
                text = "This warning sign could not be found.",
                color = SecondaryText,
                modifier = Modifier.padding(16.dp)
            )
            return@Column
        }

        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 16.dp, vertical = 8.dp)
        ) {

            // Title card
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = CardWhite)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = item.detailTitle,
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.Bold,
                        color = PrimaryText,
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    SeverityBadge(severity = item.severity)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = item.typeLabel,
                        style = MaterialTheme.typography.bodySmall,
                        color = SecondaryText
                    )
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "What does it mean?",
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold,
                color = PrimaryText
            )
            Spacer(modifier = Modifier.height(6.dp))
            Text(
                text = item.summary,
                style = MaterialTheme.typography.bodyMedium,
                color = PrimaryText
            )

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = item.causesHeading,
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold,
                color = PrimaryText
            )
            Spacer(modifier = Modifier.height(6.dp))
            item.causes.forEach { cause ->
                Row(modifier = Modifier.padding(vertical = 3.dp)) {
                    Text(
                        text = "•",
                        style = MaterialTheme.typography.bodyLarge,
                        color = PrimaryText
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = cause,
                        style = MaterialTheme.typography.bodyLarge,
                        color = PrimaryText
                    )
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            // What should you do?
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = ActionCardColor)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = Icons.Filled.Warning,
                            contentDescription = null,
                            tint = OxideBronze,
                            modifier = Modifier.size(20.dp)
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = "What should you do?",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold,
                            color = PrimaryText
                        )
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = item.action,
                        style = MaterialTheme.typography.bodyMedium,
                        color = PrimaryText
                    )
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = "General guidance only. Check your owner's manual or ask a mechanic if you are unsure.",
                style = MaterialTheme.typography.bodySmall,
                color = SecondaryText
            )

            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}