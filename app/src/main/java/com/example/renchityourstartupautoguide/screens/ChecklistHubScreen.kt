package com.example.renchityourstartupautoguide.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.renchityourstartupautoguide.model.ChecklistCategory
import com.example.renchityourstartupautoguide.model.ChecklistData
import com.example.renchityourstartupautoguide.ui.theme.CardWhite
import com.example.renchityourstartupautoguide.ui.theme.DeepCharcoal
import com.example.renchityourstartupautoguide.ui.theme.OxideBronze
import com.example.renchityourstartupautoguide.ui.theme.PrimaryText
import com.example.renchityourstartupautoguide.ui.theme.SandGold
import com.example.renchityourstartupautoguide.ui.theme.SecondaryText
import com.example.renchityourstartupautoguide.ui.theme.WarmIvory
import com.example.renchityourstartupautoguide.viewmodel.ChecklistViewModel

@Composable
fun ChecklistHubScreen(
    viewModel: ChecklistViewModel,
    onSelectCategory: (String) -> Unit,
    onBack: () -> Unit
) {
    val doneIds by viewModel.doneIds.collectAsStateWithLifecycle()

    val totalCount = ChecklistData.items.size
    val doneCount = ChecklistData.items.count { it.id in doneIds }
    val fraction = if (totalCount == 0) 0f else doneCount.toFloat() / totalCount

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
                text = "Beginner's Checklist",
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.Bold,
                color = PrimaryText
            )

            Spacer(modifier = Modifier.height(6.dp))

            Text(
                text = "Simple checks that keep your car safe and running well. Tick them off as you go.",
                style = MaterialTheme.typography.bodyMedium,
                color = SecondaryText
            )

            Spacer(modifier = Modifier.height(18.dp))

            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(20.dp),
                colors = CardDefaults.cardColors(containerColor = DeepCharcoal)
            ) {
                Column(modifier = Modifier.padding(18.dp)) {
                    Text(
                        text = "YOUR PROGRESS",
                        style = MaterialTheme.typography.labelSmall,
                        fontWeight = FontWeight.Bold,
                        letterSpacing = 1.sp,
                        color = SandGold
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Row(verticalAlignment = Alignment.Bottom) {
                        Text(
                            text = "$doneCount of $totalCount",
                            fontSize = 32.sp,
                            fontWeight = FontWeight.Bold,
                            color = WarmIvory
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = "checks done",
                            style = MaterialTheme.typography.bodyMedium,
                            color = WarmIvory,
                            modifier = Modifier.padding(bottom = 4.dp)
                        )
                    }
                    Spacer(modifier = Modifier.height(12.dp))
                    ChecklistProgressBar(
                        fraction = fraction,
                        trackColor = WarmIvory.copy(alpha = 0.2f),
                        fillColor = SandGold
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                    Text(
                        text = "Keep going. Each check takes about a minute.",
                        style = MaterialTheme.typography.bodyMedium,
                        color = WarmIvory
                    )
                }
            }

            Spacer(modifier = Modifier.height(22.dp))

            Text(
                text = "Choose a checklist",
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.SemiBold,
                color = PrimaryText
            )

            Spacer(modifier = Modifier.height(10.dp))

            ChecklistData.categories.forEach { category ->
                val categoryItems = ChecklistData.itemsFor(category.id)
                CategoryRow(
                    category = category,
                    total = categoryItems.size,
                    done = categoryItems.count { it.id in doneIds },
                    minutes = categoryItems.sumOf { it.minutes },
                    onClick = { onSelectCategory(category.id) }
                )
                Spacer(modifier = Modifier.height(10.dp))
            }

            Spacer(modifier = Modifier.height(6.dp))

            Text(
                text = "General guidance only. Check your owner's manual for the exact numbers for your car.",
                style = MaterialTheme.typography.bodySmall,
                color = SecondaryText
            )

            Spacer(modifier = Modifier.height(20.dp))
        }
    }
}

@Composable
private fun CategoryRow(
    category: ChecklistCategory,
    total: Int,
    done: Int,
    minutes: Int,
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
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(14.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(44.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(IconTileColor),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    painter = painterResource(id = checklistIconFor(category.id)),
                    contentDescription = null,
                    tint = OxideBronze,
                    modifier = Modifier.size(24.dp)
                )
            }

            Spacer(modifier = Modifier.width(14.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = category.title,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.SemiBold,
                    color = PrimaryText
                )
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = "$total checks · about $minutes min",
                    style = MaterialTheme.typography.bodySmall,
                    color = SecondaryText
                )
            }

            Spacer(modifier = Modifier.width(8.dp))

            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(50))
                    .background(Color(0xFFF5F1E9))
                    .padding(horizontal = 10.dp, vertical = 4.dp)
            ) {
                Text(
                    text = "$done of $total",
                    style = MaterialTheme.typography.labelMedium,
                    fontWeight = FontWeight.SemiBold,
                    color = OxideBronze
                )
            }

            Icon(
                imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                contentDescription = null,
                tint = PrimaryText,
                modifier = Modifier.size(20.dp)
            )
        }
    }
}