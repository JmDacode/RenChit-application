package com.example.renchityourstartupautoguide.screens

import androidx.compose.foundation.BorderStroke
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.renchityourstartupautoguide.model.ChecklistData
import com.example.renchityourstartupautoguide.model.ChecklistItem
import com.example.renchityourstartupautoguide.ui.theme.CardWhite
import com.example.renchityourstartupautoguide.ui.theme.DividerTaupe
import com.example.renchityourstartupautoguide.ui.theme.LightText
import com.example.renchityourstartupautoguide.ui.theme.OxideBronze
import com.example.renchityourstartupautoguide.ui.theme.PrimaryText
import com.example.renchityourstartupautoguide.ui.theme.SecondaryText
import com.example.renchityourstartupautoguide.ui.theme.TrailSage
import com.example.renchityourstartupautoguide.ui.theme.WarmIvory
import com.example.renchityourstartupautoguide.viewmodel.ChecklistViewModel
import kotlin.math.roundToInt

@Composable
fun ChecklistScreen(
    categoryId: String,
    viewModel: ChecklistViewModel,
    onSelectItem: (String) -> Unit,
    onBack: () -> Unit
) {
    val category = ChecklistData.getCategory(categoryId)
    val items = ChecklistData.itemsFor(categoryId)
    val doneIds by viewModel.doneIds.collectAsStateWithLifecycle()

    val total = items.size
    val doneCount = items.count { it.id in doneIds }
    val fraction = if (total == 0) 0f else doneCount.toFloat() / total
    val percent = (fraction * 100).roundToInt()
    val allDone = total > 0 && doneCount == total

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(WarmIvory)
    ) {
        WarningTopBar(title = "Beginner's Checklist", onBack = onBack)

        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 16.dp)
        ) {
            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = category?.title ?: "Checklist",
                style = MaterialTheme.typography.headlineSmall,
                fontWeight = FontWeight.Bold,
                color = PrimaryText
            )

            Spacer(modifier = Modifier.height(6.dp))

            Text(
                text = category?.intro ?: "",
                style = MaterialTheme.typography.bodyMedium,
                color = SecondaryText
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Progress for this checklist
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = CardWhite)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "$doneCount of $total done",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.SemiBold,
                            color = PrimaryText,
                            modifier = Modifier.weight(1f)
                        )
                        Text(
                            text = "$percent%",
                            style = MaterialTheme.typography.titleSmall,
                            fontWeight = FontWeight.SemiBold,
                            color = OxideBronze
                        )
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    ChecklistProgressBar(
                        fraction = fraction,
                        trackColor = DividerTaupe,
                        fillColor = TrailSage
                    )
                }
            }

            Spacer(modifier = Modifier.height(14.dp))

            items.forEach { item ->
                ChecklistRow(
                    item = item,
                    done = item.id in doneIds,
                    onToggle = { viewModel.toggle(item.id) },
                    onOpen = { onSelectItem(item.id) }
                )
                Spacer(modifier = Modifier.height(10.dp))
            }

            if (allDone) {
                Spacer(modifier = Modifier.height(4.dp))
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(14.dp))
                        .background(Color(0xFFDDE8E0))
                        .padding(16.dp)
                ) {
                    Text(
                        text = "All done. You are ready to drive.",
                        style = MaterialTheme.typography.titleSmall,
                        fontWeight = FontWeight.SemiBold,
                        color = Color(0xFF3F5648)
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))
            }

            Spacer(modifier = Modifier.height(6.dp))

            OutlinedButton(
                onClick = { viewModel.reset(items.map { it.id }) },
                shape = RoundedCornerShape(12.dp),
                border = BorderStroke(1.5.dp, OxideBronze),
                colors = ButtonDefaults.outlinedButtonColors(contentColor = OxideBronze),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp)
            ) {
                Text("Reset checklist", fontWeight = FontWeight.SemiBold)
            }

            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}

@Composable
private fun ChecklistRow(
    item: ChecklistItem,
    done: Boolean,
    onToggle: () -> Unit,
    onOpen: () -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = CardWhite)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 4.dp, end = 10.dp, top = 6.dp, bottom = 6.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(
                checked = done,
                onCheckedChange = { onToggle() },
                colors = CheckboxDefaults.colors(
                    checkedColor = TrailSage,
                    uncheckedColor = Color(0xFF8A8274),
                    checkmarkColor = LightText
                )
            )

            Row(
                modifier = Modifier
                    .weight(1f)
                    .clip(RoundedCornerShape(12.dp))
                    .clickable(onClick = onOpen)
                    .padding(vertical = 8.dp, horizontal = 4.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = item.title,
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.SemiBold,
                        color = if (done) SecondaryText else PrimaryText,
                        textDecoration = if (done) TextDecoration.LineThrough else TextDecoration.None
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = item.hint,
                        style = MaterialTheme.typography.bodySmall,
                        color = SecondaryText
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
}