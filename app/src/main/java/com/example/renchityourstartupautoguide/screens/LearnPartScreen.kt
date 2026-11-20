package com.example.renchityourstartupautoguide.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.renchityourstartupautoguide.model.LearnData
import com.example.renchityourstartupautoguide.model.LearnQuiz
import com.example.renchityourstartupautoguide.ui.theme.CardWhite
import com.example.renchityourstartupautoguide.ui.theme.DividerTaupe
import com.example.renchityourstartupautoguide.ui.theme.LightText
import com.example.renchityourstartupautoguide.ui.theme.OxideBronze
import com.example.renchityourstartupautoguide.ui.theme.PrimaryText
import com.example.renchityourstartupautoguide.ui.theme.SecondaryText
import com.example.renchityourstartupautoguide.ui.theme.TrailSage
import com.example.renchityourstartupautoguide.ui.theme.WarmIvory

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun LearnPartScreen(
    partId: String,
    onSelectPart: (String) -> Unit,
    onBack: () -> Unit
) {
    val part = LearnData.getPart(partId)
    val system = part?.let { LearnData.getSystem(it.systemId) }
    val group = part?.let { LearnData.getGroup(it.groupId) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(WarmIvory)
    ) {
        WarningTopBar(title = part?.name ?: "Learn Your Car", onBack = onBack)

        if (part == null) {
            Text(
                text = "This part could not be found.",
                color = SecondaryText,
                modifier = Modifier.padding(16.dp)
            )
            return@Column
        }

        // Only show related parts that already exist in the data
        val related = part.relatedIds.mapNotNull { LearnData.getPart(it) }

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
                        LearnPartIcon(
                            partId = part.id,
                            size = 28.dp
                        )
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = part.name,
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.Bold,
                        color = PrimaryText,
                        textAlign = TextAlign.Center
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        LearnPill(text = part.level, background = Color(0xFFDDE8E0), textColor = Color(0xFF3F5648))
                        LearnPill(text = "About ${part.minutes} min", background = Color(0xFFF5F1E9), textColor = OxideBronze)
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = "${system?.title ?: ""} · ${group?.title ?: ""}",
                        style = MaterialTheme.typography.bodySmall,
                        color = SecondaryText
                    )
                }
            }

            // What is it
            LearnSectionTitle("What is it?")
            Text(
                text = part.whatIs,
                style = MaterialTheme.typography.bodyMedium,
                color = PrimaryText
            )

            // What does it do
            LearnSectionTitle("What does it do?")
            part.whatItDoes.forEach { line ->
                Row(
                    modifier = Modifier.padding(bottom = 8.dp),
                    verticalAlignment = Alignment.Top
                ) {
                    Box(
                        modifier = Modifier
                            .padding(top = 8.dp)
                            .size(8.dp)
                            .clip(CircleShape)
                            .background(TrailSage)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = line,
                        style = MaterialTheme.typography.bodyMedium,
                        color = PrimaryText
                    )
                }
            }

            // Where is it
            if (part.location != null) {
                LearnSectionTitle("Where is it?")
                Text(
                    text = part.location,
                    style = MaterialTheme.typography.bodyMedium,
                    color = PrimaryText
                )
            }

            // Related parts
            if (related.isNotEmpty()) {
                LearnSectionTitle("Related parts")
                FlowRow(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    related.forEach { relatedPart ->
                        Box(
                            modifier = Modifier
                                .heightIn(min = 44.dp)
                                .clip(RoundedCornerShape(22.dp))
                                .background(CardWhite)
                                .border(1.5.dp, DividerTaupe, RoundedCornerShape(22.dp))
                                .clickable { onSelectPart(relatedPart.id) }
                                .padding(horizontal = 14.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = relatedPart.name,
                                style = MaterialTheme.typography.labelLarge,
                                fontWeight = FontWeight.SemiBold,
                                color = OxideBronze
                            )
                        }
                    }
                }
            }

            // If it fails
            if (part.ifItFails != null) {
                Spacer(modifier = Modifier.height(20.dp))
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(containerColor = Color(0xFFFBE5D8))
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                imageVector = Icons.Filled.Warning,
                                contentDescription = null,
                                tint = Color(0xFF9A4A14),
                                modifier = Modifier.size(20.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = "If it fails",
                                style = MaterialTheme.typography.titleSmall,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xFF9A4A14)
                            )
                        }
                        Spacer(modifier = Modifier.height(6.dp))
                        Text(
                            text = part.ifItFails,
                            style = MaterialTheme.typography.bodyMedium,
                            color = PrimaryText
                        )
                    }
                }
            }

            // Maintenance
            if (part.maintenance != null) {
                Spacer(modifier = Modifier.height(16.dp))
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
                                text = "Maintenance",
                                style = MaterialTheme.typography.titleSmall,
                                fontWeight = FontWeight.Bold,
                                color = PrimaryText
                            )
                            Spacer(modifier = Modifier.height(2.dp))
                            Text(
                                text = part.maintenance,
                                style = MaterialTheme.typography.bodyMedium,
                                color = PrimaryText
                            )
                        }
                    }
                }
            }

            // Why it matters
            if (part.whyItMatters != null) {
                LearnSectionTitle("Why it matters")
                Text(
                    text = part.whyItMatters,
                    style = MaterialTheme.typography.bodyMedium,
                    color = PrimaryText
                )
            }

            // Knowledge check (restarts for every part)
            if (part.quiz != null) {
                Spacer(modifier = Modifier.height(24.dp))
                QuizCard(quiz = part.quiz, partId = part.id)
            }

            Spacer(modifier = Modifier.height(12.dp))

            TextButton(
                onClick = onBack,
                colors = ButtonDefaults.textButtonColors(contentColor = OxideBronze),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Go back", fontWeight = FontWeight.SemiBold)
            }

            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Composable
private fun LearnSectionTitle(text: String) {
    Spacer(modifier = Modifier.height(20.dp))
    Text(
        text = text,
        style = MaterialTheme.typography.titleMedium,
        fontWeight = FontWeight.Bold,
        color = PrimaryText
    )
    Spacer(modifier = Modifier.height(8.dp))
}

@Composable
private fun LearnPill(text: String, background: Color, textColor: Color) {
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

@Composable
private fun QuizCard(quiz: LearnQuiz, partId: String) {
    // remember(partId) so the quiz starts fresh when you open a different part
    var picked by remember(partId) { mutableIntStateOf(-1) }
    var checked by remember(partId) { mutableStateOf(false) }

    val isCorrect = checked && picked == quiz.answerIndex

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = CardWhite)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = "KNOWLEDGE CHECK",
                style = MaterialTheme.typography.labelSmall,
                fontWeight = FontWeight.Bold,
                letterSpacing = 1.sp,
                color = OxideBronze
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = quiz.question,
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.SemiBold,
                color = PrimaryText
            )

            Spacer(modifier = Modifier.height(12.dp))

            quiz.options.forEachIndexed { index, optionText ->
                val isPicked = picked == index

                var borderColor = DividerTaupe
                var bgColor = CardWhite
                if (isPicked) {
                    borderColor = OxideBronze
                    bgColor = WarmIvory
                }
                if (checked && isPicked) {
                    if (index == quiz.answerIndex) {
                        borderColor = Color(0xFF3F5648)
                        bgColor = Color(0xFFDDE8E0)
                    } else {
                        borderColor = Color(0xFFB3261E)
                        bgColor = Color(0xFFFDE3E1)
                    }
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(min = 52.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .background(bgColor)
                        .border(2.dp, borderColor, RoundedCornerShape(12.dp))
                        .clickable {
                            picked = index
                            checked = false
                        }
                        .padding(horizontal = 14.dp, vertical = 10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(20.dp)
                            .clip(CircleShape)
                            .border(2.dp, if (isPicked) OxideBronze else Color(0xFF8A8274), CircleShape)
                            .background(if (isPicked) OxideBronze else CardWhite)
                    )
                    Spacer(modifier = Modifier.width(12.dp))
                    Text(
                        text = optionText,
                        style = MaterialTheme.typography.bodyMedium,
                        color = PrimaryText
                    )
                }

                Spacer(modifier = Modifier.height(8.dp))
            }

            Spacer(modifier = Modifier.height(4.dp))

            Button(
                onClick = { if (picked >= 0) checked = true },
                enabled = picked >= 0,
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = OxideBronze,
                    contentColor = LightText
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp)
            ) {
                Text("Check answer", fontWeight = FontWeight.SemiBold)
            }

            if (checked) {
                Spacer(modifier = Modifier.height(12.dp))
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp))
                        .background(if (isCorrect) Color(0xFFDDE8E0) else Color(0xFFFDE3E1))
                        .padding(14.dp)
                ) {
                    Text(
                        text = if (isCorrect) {
                            "Correct. ${quiz.explanation}"
                        } else {
                            "Not quite. ${quiz.explanation} Try again."
                        },
                        style = MaterialTheme.typography.bodyMedium,
                        color = if (isCorrect) Color(0xFF3F5648) else Color(0xFF8C1D18)
                    )
                }
            }
        }
    }
}