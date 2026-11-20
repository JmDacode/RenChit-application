package com.example.renchityourstartupautoguide.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.renchityourstartupautoguide.R
import com.example.renchityourstartupautoguide.model.WarningCategory
import com.example.renchityourstartupautoguide.model.WarningData
import com.example.renchityourstartupautoguide.ui.theme.CardWhite
import com.example.renchityourstartupautoguide.ui.theme.DeepCharcoal
import com.example.renchityourstartupautoguide.ui.theme.LightText
import com.example.renchityourstartupautoguide.ui.theme.OxideBronze
import com.example.renchityourstartupautoguide.ui.theme.PrimaryText
import com.example.renchityourstartupautoguide.ui.theme.SandGold
import com.example.renchityourstartupautoguide.ui.theme.SecondaryText
import com.example.renchityourstartupautoguide.ui.theme.WarmIvory

@Composable
fun WarningSignsScreen(
    onSelectCategory: (String) -> Unit,
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
                text = "LEARN YOUR CAR",
                style = MaterialTheme.typography.labelSmall,
                fontWeight = FontWeight.Bold,
                letterSpacing = 1.sp,
                color = OxideBronze
            )

            Spacer(modifier = Modifier.height(6.dp))

            Text(
                text = "Warning Signs Explained",
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.Bold,
                color = PrimaryText
            )

            Spacer(modifier = Modifier.height(6.dp))

            Text(
                text = "Learn to recognize common vehicle problems and know what to do when they happen.",
                style = MaterialTheme.typography.bodyMedium,
                color = SecondaryText
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Safety reminder
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = DeepCharcoal)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = Icons.Filled.Warning,
                            contentDescription = null,
                            tint = SandGold,
                            modifier = Modifier.size(20.dp)
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = "Important safety reminder",
                            style = MaterialTheme.typography.titleSmall,
                            fontWeight = FontWeight.SemiBold,
                            color = LightText
                        )
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "Some warning signs require you to stop driving as soon as it is safe. Never ignore serious warnings.",
                        style = MaterialTheme.typography.bodyMedium,
                        color = LightText
                    )
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "Explore warning signs",
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.SemiBold,
                color = PrimaryText
            )

            Spacer(modifier = Modifier.height(12.dp))

            // 2 x 3 grid of categories
            WarningData.categories.chunked(2).forEach { rowItems ->
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    rowItems.forEach { category ->
                        CategoryCard(
                            category = category,
                            onClick = { onSelectCategory(category.id) },
                            modifier = Modifier.weight(1f)
                        )
                    }
                }
                Spacer(modifier = Modifier.height(12.dp))
            }

            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}

@Composable
private fun CategoryCard(
    category: WarningCategory,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val shape = RoundedCornerShape(16.dp)

    Card(
        modifier = modifier
            .heightIn(min = 136.dp)
            .clip(shape)
            .clickable(onClick = onClick),
        shape = shape,
        colors = CardDefaults.cardColors(containerColor = CardWhite)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Icon(
                painter = painterResource(id = iconFor(category.id)),
                contentDescription = null,
                tint = OxideBronze,
                modifier = Modifier.size(24.dp)
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = category.title,
                style = MaterialTheme.typography.titleSmall,
                fontWeight = FontWeight.SemiBold,
                color = PrimaryText
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = category.subtitle,
                style = MaterialTheme.typography.bodySmall,
                color = SecondaryText
            )

            Spacer(modifier = Modifier.weight(1f))
        }
    }
}

private fun iconFor(categoryId: String): Int = when (categoryId) {
    "dashboard" -> R.drawable.ic_ws_dashboard
    "sounds" -> R.drawable.ic_ws_sound
    "smells" -> R.drawable.ic_ws_smell
    "performance" -> R.drawable.ic_ws_performance
    "leaks" -> R.drawable.ic_ws_leak
    else -> R.drawable.ic_ws_urgency
}