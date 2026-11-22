package com.example.renchityourstartupautoguide.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
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
import com.example.renchityourstartupautoguide.model.MaintenanceData
import com.example.renchityourstartupautoguide.ui.theme.CardWhite
import com.example.renchityourstartupautoguide.ui.theme.DividerTaupe
import com.example.renchityourstartupautoguide.ui.theme.OxideBronze
import com.example.renchityourstartupautoguide.ui.theme.PrimaryText
import com.example.renchityourstartupautoguide.ui.theme.SecondaryText
import com.example.renchityourstartupautoguide.ui.theme.TrailSage
import com.example.renchityourstartupautoguide.ui.theme.WarmIvory

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun MaintenanceGuideScreen(
    guideId: String,
    onSelectPart: (String) -> Unit,
    onBack: () -> Unit
) {
    val guide = MaintenanceData.getGuide(guideId)
    val topic = guide?.let { MaintenanceData.getTopic(it.topicId) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(WarmIvory)
    ) {
        WarningTopBar(title = topic?.title ?: "Essential Maintenance", onBack = onBack)

        if (guide == null) {
            Text(
                text = "This guide could not be found.",
                style = MaterialTheme.typography.bodyMedium,
                color = SecondaryText,
                modifier = Modifier.padding(16.dp)
            )
        } else {
            val relatedParts = guide.relatedPartIds.mapNotNull { LearnData.getPart(it) }

            Column(
                modifier = Modifier
                    .verticalScroll(rememberScrollState())
                    .padding(horizontal = 16.dp)
            ) {

                // Title card
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(16.dp))
                        .background(CardWhite)
                        .padding(20.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    MaintenanceIconTile(topicId = guide.topicId, size = 52.dp)

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = guide.title,
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        color = PrimaryText
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        MaintenanceLevelChip(guide.level)
                        MaintenanceChip(
                            text = "About ${guide.minutes} min",
                            background = WarmIvory,
                            textColor = OxideBronze
                        )
                    }
                }

                Spacer(modifier = Modifier.height(20.dp))

                MaintenanceHeading("What is it?")
                Spacer(modifier = Modifier.height(6.dp))
                Text(
                    text = guide.overview,
                    style = MaterialTheme.typography.bodyLarge,
                    color = PrimaryText
                )

                Spacer(modifier = Modifier.height(20.dp))

                MaintenanceHeading("Why it matters")
                Spacer(modifier = Modifier.height(6.dp))
                Text(
                    text = guide.whyItMatters,
                    style = MaterialTheme.typography.bodyLarge,
                    color = PrimaryText
                )

                Spacer(modifier = Modifier.height(20.dp))

                MaintenanceHeading("When to do it")
                Spacer(modifier = Modifier.height(6.dp))
                Text(
                    text = guide.whenToDo,
                    style = MaterialTheme.typography.bodyLarge,
                    color = PrimaryText
                )

                if (guide.safety != null) {
                    Spacer(modifier = Modifier.height(20.dp))
                    MaintenanceNotice(
                        title = "Safety reminder",
                        lines = listOf(guide.safety),
                        background = Color(0xFFFDE3E1),
                        accent = Color(0xFFB3261E)
                    )
                }

                Spacer(modifier = Modifier.height(20.dp))

                MaintenanceHeading("Tools you need")
                Spacer(modifier = Modifier.height(10.dp))
                guide.tools.forEach { tool ->
                    MaintenanceBullet(text = tool)
                    Spacer(modifier = Modifier.height(8.dp))
                }

                Spacer(modifier = Modifier.height(12.dp))

                MaintenanceHeading("Step by step")
                Spacer(modifier = Modifier.height(10.dp))
                guide.steps.forEachIndexed { index, step ->
                    MaintenanceStep(number = index + 1, text = step)
                    Spacer(modifier = Modifier.height(12.dp))
                }

                Spacer(modifier = Modifier.height(8.dp))

                MaintenanceHeading("What to watch for")
                Spacer(modifier = Modifier.height(10.dp))
                guide.watchFor.forEach { item ->
                    MaintenanceBullet(text = item)
                    Spacer(modifier = Modifier.height(8.dp))
                }

                Spacer(modifier = Modifier.height(12.dp))

                MaintenanceNotice(
                    title = "See a mechanic if",
                    lines = guide.seeMechanic,
                    background = Color(0xFFFBE5D8),
                    accent = Color(0xFF9A4A14)
                )

                if (relatedParts.isNotEmpty()) {
                    Spacer(modifier = Modifier.height(20.dp))

                    MaintenanceHeading("Related parts")
                    Spacer(modifier = Modifier.height(10.dp))

                    FlowRow(
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        relatedParts.forEach { part ->
                            Text(
                                text = part.name,
                                style = MaterialTheme.typography.bodyMedium,
                                fontWeight = FontWeight.SemiBold,
                                color = OxideBronze,
                                modifier = Modifier
                                    .clip(RoundedCornerShape(22.dp))
                                    .background(CardWhite)
                                    .border(1.5.dp, DividerTaupe, RoundedCornerShape(22.dp))
                                    .clickable { onSelectPart(part.id) }
                                    .padding(horizontal = 14.dp, vertical = 12.dp)
                            )
                        }
                    }
                }

                val quiz = guide.quiz
                if (quiz != null) {
                    Spacer(modifier = Modifier.height(24.dp))
                    MaintenanceQuiz(quiz = quiz)
                }

                Spacer(modifier = Modifier.height(24.dp))
            }
        }
    }
}

@Composable
private fun MaintenanceNotice(
    title: String,
    lines: List<String>,
    background: Color,
    accent: Color
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .background(background)
            .padding(16.dp)
    ) {
        Text(
            text = title,
            style = MaterialTheme.typography.titleSmall,
            fontWeight = FontWeight.Bold,
            color = accent
        )

        Spacer(modifier = Modifier.height(8.dp))

        lines.forEach { line ->
            MaintenanceBullet(text = line, dotColor = accent)
            Spacer(modifier = Modifier.height(6.dp))
        }
    }
}

@Composable
private fun MaintenanceQuiz(quiz: LearnQuiz) {
    var picked by remember(quiz) { mutableStateOf(-1) }
    var checked by remember(quiz) { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .background(CardWhite)
            .padding(16.dp)
    ) {
        Text(
            text = "KNOWLEDGE CHECK",
            style = MaterialTheme.typography.labelSmall,
            fontWeight = FontWeight.Bold,
            letterSpacing = 1.sp,
            color = OxideBronze
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = quiz.question,
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.SemiBold,
            color = PrimaryText
        )

        Spacer(modifier = Modifier.height(12.dp))

        quiz.options.forEachIndexed { index, option ->
            val isPicked = picked == index
            val borderColor = when {
                checked && isPicked && index == quiz.answerIndex -> TrailSage
                checked && isPicked -> Color(0xFFB3261E)
                isPicked -> OxideBronze
                else -> DividerTaupe
            }

            Text(
                text = option,
                style = MaterialTheme.typography.bodyLarge,
                color = PrimaryText,
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(12.dp))
                    .border(2.dp, borderColor, RoundedCornerShape(12.dp))
                    .clickable {
                        picked = index
                        checked = false
                    }
                    .padding(14.dp)
            )

            Spacer(modifier = Modifier.height(8.dp))
        }

        Button(
            onClick = { if (picked >= 0) checked = true },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = OxideBronze)
        ) {
            Text("Check answer")
        }

        if (checked) {
            val correct = picked == quiz.answerIndex

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = if (correct) {
                    "Correct. ${quiz.explanation}"
                } else {
                    "Not quite. ${quiz.explanation} Try again."
                },
                style = MaterialTheme.typography.bodyMedium,
                color = if (correct) Color(0xFF3F5648) else Color(0xFF8C1D18),
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(12.dp))
                    .background(if (correct) Color(0xFFDDE8E0) else Color(0xFFFDE3E1))
                    .padding(12.dp)
            )
        }
    }
}