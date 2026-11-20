package com.example.renchityourstartupautoguide.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.renchityourstartupautoguide.model.ChecklistData
import com.example.renchityourstartupautoguide.ui.theme.CardWhite
import com.example.renchityourstartupautoguide.ui.theme.LightText
import com.example.renchityourstartupautoguide.ui.theme.OxideBronze
import com.example.renchityourstartupautoguide.ui.theme.PrimaryText
import com.example.renchityourstartupautoguide.ui.theme.SecondaryText
import com.example.renchityourstartupautoguide.ui.theme.WarmIvory
import com.example.renchityourstartupautoguide.viewmodel.ChecklistViewModel

@Composable
fun ChecklistItemScreen(
    itemId: String,
    viewModel: ChecklistViewModel,
    onBack: () -> Unit
) {
    val item = ChecklistData.getItem(itemId)
    val category = item?.let { ChecklistData.getCategory(it.categoryId) }
    val doneIds by viewModel.doneIds.collectAsStateWithLifecycle()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(WarmIvory)
    ) {
        WarningTopBar(
            title = item?.title ?: "Checklist",
            onBack = onBack
        )

        if (item == null) {
            Text(
                text = "This check could not be found.",
                color = SecondaryText,
                modifier = Modifier.padding(16.dp)
            )
            return@Column
        }

        val isDone = item.id in doneIds

        Column(
            modifier = Modifier
                .fillMaxSize()
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
                        .padding(vertical = 20.dp, horizontal = 16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Box(
                        modifier = Modifier
                            .size(52.dp)
                            .clip(RoundedCornerShape(14.dp))
                            .background(IconTileColor),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            painter = painterResource(id = checklistIconFor(item.categoryId)),
                            contentDescription = null,
                            tint = OxideBronze,
                            modifier = Modifier.size(28.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = item.title,
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.Bold,
                        color = PrimaryText,
                        textAlign = TextAlign.Center
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        Pill(text = item.level, background = Color(0xFFDDE8E0), textColor = Color(0xFF3F5648))
                        Pill(text = "About ${item.minutes} min", background = Color(0xFFF5F1E9), textColor = OxideBronze)
                        if (isDone) {
                            Pill(text = "Done", background = Color(0xFFDDE8E0), textColor = Color(0xFF3F5648))
                        }
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = "Part of: ${category?.title ?: ""}",
                        style = MaterialTheme.typography.bodySmall,
                        color = SecondaryText
                    )
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "Why it matters",
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold,
                color = PrimaryText
            )
            Spacer(modifier = Modifier.height(6.dp))
            Text(
                text = item.why,
                style = MaterialTheme.typography.bodyMedium,
                color = PrimaryText
            )

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "How to check",
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold,
                color = PrimaryText
            )
            Spacer(modifier = Modifier.height(10.dp))

            item.steps.forEachIndexed { index, step ->
                Row(
                    modifier = Modifier.padding(bottom = 10.dp),
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
                            text = "${index + 1}",
                            style = MaterialTheme.typography.labelLarge,
                            fontWeight = FontWeight.Bold,
                            color = LightText
                        )
                    }
                    Spacer(modifier = Modifier.width(12.dp))
                    Text(
                        text = step,
                        style = MaterialTheme.typography.bodyMedium,
                        color = PrimaryText,
                        modifier = Modifier.padding(top = 3.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            // Good to know
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = ActionCardColor)
            ) {
                Row(modifier = Modifier.padding(16.dp), verticalAlignment = Alignment.Top) {
                    Icon(
                        imageVector = Icons.Filled.Info,
                        contentDescription = null,
                        tint = OxideBronze,
                        modifier = Modifier
                            .size(20.dp)
                            .padding(top = 1.dp)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Column {
                        Text(
                            text = "Good to know",
                            style = MaterialTheme.typography.titleSmall,
                            fontWeight = FontWeight.Bold,
                            color = PrimaryText
                        )
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = item.tip,
                            style = MaterialTheme.typography.bodyMedium,
                            color = PrimaryText
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            if (isDone) {
                OutlinedButton(
                    onClick = {
                        viewModel.setDone(item.id, false)
                        onBack()
                    },
                    shape = RoundedCornerShape(12.dp),
                    border = BorderStroke(1.5.dp, OxideBronze),
                    colors = ButtonDefaults.outlinedButtonColors(contentColor = OxideBronze),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(52.dp)
                ) {
                    Text("Mark as not done", fontWeight = FontWeight.SemiBold)
                }
            } else {
                Button(
                    onClick = {
                        viewModel.setDone(item.id, true)
                        onBack()
                    },
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = OxideBronze,
                        contentColor = LightText
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(52.dp)
                ) {
                    Text("Mark as done", fontWeight = FontWeight.SemiBold)
                }
            }

            TextButton(
                onClick = onBack,
                colors = ButtonDefaults.textButtonColors(contentColor = OxideBronze),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Back to checklist", fontWeight = FontWeight.SemiBold)
            }

            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Composable
private fun Pill(text: String, background: Color, textColor: Color) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(50))
            .background(background)
            .padding(horizontal = 10.dp, vertical = 4.dp)
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.labelMedium,
            fontWeight = FontWeight.SemiBold,
            color = textColor
        )
    }
}