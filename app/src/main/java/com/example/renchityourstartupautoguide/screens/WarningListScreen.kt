package com.example.renchityourstartupautoguide.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.renchityourstartupautoguide.model.WarningData
import com.example.renchityourstartupautoguide.model.WarningItem
import com.example.renchityourstartupautoguide.ui.theme.CardWhite
import com.example.renchityourstartupautoguide.ui.theme.OxideBronze
import com.example.renchityourstartupautoguide.ui.theme.PrimaryText
import com.example.renchityourstartupautoguide.ui.theme.SecondaryText
import com.example.renchityourstartupautoguide.ui.theme.WarmIvory

@Composable
fun WarningListScreen(
    categoryId: String,
    onSelectItem: (String) -> Unit,
    onBack: () -> Unit
) {
    val category = WarningData.getCategory(categoryId)
    val items = WarningData.itemsFor(categoryId)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(WarmIvory)
    ) {
        WarningTopBar(
            title = category?.title ?: "Warning Signs",
            onBack = onBack
        )

        LazyColumn(
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            item {
                Column {
                    Text(
                        text = category?.listTitle ?: "",
                        style = MaterialTheme.typography.headlineSmall,
                        fontWeight = FontWeight.Bold,
                        color = PrimaryText
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = category?.listIntro ?: "",
                        style = MaterialTheme.typography.bodyMedium,
                        color = SecondaryText
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                }
            }

            items(items) { warning ->
                WarningItemCard(
                    item = warning,
                    onClick = { onSelectItem(warning.id) }
                )
            }
        }
    }
}

@Composable
private fun WarningItemCard(
    item: WarningItem,
    onClick: () -> Unit
) {
    val shape = RoundedCornerShape(16.dp)

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clip(shape)
            .clickable(onClick = onClick),
        shape = shape,
        colors = CardDefaults.cardColors(containerColor = CardWhite)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = item.title,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.SemiBold,
                    color = PrimaryText,
                    modifier = Modifier.weight(1f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                SeverityBadge(severity = item.severity)
            }

            Spacer(modifier = Modifier.height(6.dp))

            Text(
                text = item.summary,
                style = MaterialTheme.typography.bodyMedium,
                color = SecondaryText
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "View explanation",
                style = MaterialTheme.typography.labelLarge,
                fontWeight = FontWeight.SemiBold,
                color = OxideBronze
            )
        }
    }
}