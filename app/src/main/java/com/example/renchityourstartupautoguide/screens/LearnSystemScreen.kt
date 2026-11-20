package com.example.renchityourstartupautoguide.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.renchityourstartupautoguide.model.LearnData
import com.example.renchityourstartupautoguide.model.LearnPart
import com.example.renchityourstartupautoguide.ui.theme.CardWhite
import com.example.renchityourstartupautoguide.ui.theme.DeepCharcoal
import com.example.renchityourstartupautoguide.ui.theme.OxideBronze
import com.example.renchityourstartupautoguide.ui.theme.PrimaryText
import com.example.renchityourstartupautoguide.ui.theme.SandGold
import com.example.renchityourstartupautoguide.ui.theme.SecondaryText
import com.example.renchityourstartupautoguide.ui.theme.WarmIvory

@Composable
fun LearnSystemScreen(
    systemId: String,
    onSelectPart: (String) -> Unit,
    onBack: () -> Unit
) {
    val system = LearnData.getSystem(systemId)
    val groups = LearnData.groupsFor(systemId)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(WarmIvory)
    ) {
        WarningTopBar(title = "Learn Your Car", onBack = onBack)

        if (system == null) {
            Text(
                text = "This system could not be found.",
                color = SecondaryText,
                modifier = Modifier.padding(16.dp)
            )
            return@Column
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 16.dp)
        ) {
            Text(
                text = "SYSTEM",
                style = MaterialTheme.typography.labelSmall,
                fontWeight = FontWeight.Bold,
                letterSpacing = 1.sp,
                color = OxideBronze
            )

            Spacer(modifier = Modifier.height(6.dp))

            Text(
                text = system.title,
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.Bold,
                color = PrimaryText
            )

            Spacer(modifier = Modifier.height(6.dp))

            Text(
                text = system.overview,
                style = MaterialTheme.typography.bodyMedium,
                color = SecondaryText
            )

            // The four strokes only make sense for the engine
            if (system.id == "engine") {
                Spacer(modifier = Modifier.height(16.dp))
                FourStrokeCard()
            }

            groups.forEach { group ->
                val groupParts = LearnData.partsFor(group.id)

                Spacer(modifier = Modifier.height(22.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.Bottom
                ) {
                    Text(
                        text = group.title,
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.SemiBold,
                        color = PrimaryText,
                        modifier = Modifier.weight(1f)
                    )
                    Text(
                        text = "${groupParts.size} parts",
                        style = MaterialTheme.typography.bodySmall,
                        color = SecondaryText
                    )
                }

                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    text = group.intro,
                    style = MaterialTheme.typography.bodySmall,
                    color = SecondaryText
                )

                Spacer(modifier = Modifier.height(10.dp))

                groupParts.forEach { part ->
                    PartRow(part = part, onClick = { onSelectPart(part.id) })
                    Spacer(modifier = Modifier.height(10.dp))
                }
            }

            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Composable
private fun FourStrokeCard() {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(containerColor = DeepCharcoal)
    ) {
        Column(modifier = Modifier.padding(18.dp)) {
            Text(
                text = "HOW IT MAKES POWER",
                style = MaterialTheme.typography.labelSmall,
                fontWeight = FontWeight.Bold,
                letterSpacing = 1.sp,
                color = SandGold
            )

            Spacer(modifier = Modifier.height(12.dp))

            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                StrokeBox(number = "1", label = "Intake", modifier = Modifier.weight(1f))
                StrokeBox(number = "2", label = "Compression", modifier = Modifier.weight(1.4f))
                StrokeBox(number = "3", label = "Power", modifier = Modifier.weight(1f))
                StrokeBox(number = "4", label = "Exhaust", modifier = Modifier.weight(1f))
            }

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = "Every cylinder repeats these four steps, thousands of times a minute.",
                style = MaterialTheme.typography.bodyMedium,
                color = WarmIvory
            )
        }
    }
}

@Composable
private fun StrokeBox(
    number: String,
    label: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .clip(RoundedCornerShape(12.dp))
            .background(WarmIvory.copy(alpha = 0.1f))
            .padding(vertical = 10.dp, horizontal = 3.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = number,
            style = MaterialTheme.typography.labelMedium,
            fontWeight = FontWeight.Bold,
            color = SandGold
        )

        Spacer(modifier = Modifier.height(4.dp))

        Text(
            text = label,
            fontSize = 11.sp,
            lineHeight = 14.sp,
            fontWeight = FontWeight.SemiBold,
            color = WarmIvory,
            textAlign = TextAlign.Center,
            softWrap = true,
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Composable
private fun PartRow(part: LearnPart, onClick: () -> Unit) {
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
                .padding(horizontal = 14.dp, vertical = 12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(IconTileColor),
                contentAlignment = Alignment.Center
            ) {
                LearnPartIcon(
                    partId = part.id,
                    size = 28.dp
                )
            }

            Spacer(modifier = Modifier.width(12.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = part.name,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.SemiBold,
                    color = PrimaryText
                )
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = part.summary,
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