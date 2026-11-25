package com.example.renchityourstartupautoguide.screens

import android.widget.Toast
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
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.renchityourstartupautoguide.model.Feedback
import com.example.renchityourstartupautoguide.ui.theme.CardWhite
import com.example.renchityourstartupautoguide.ui.theme.DividerTaupe
import com.example.renchityourstartupautoguide.ui.theme.OxideBronze
import com.example.renchityourstartupautoguide.ui.theme.PrimaryText
import com.example.renchityourstartupautoguide.ui.theme.SecondaryText
import com.example.renchityourstartupautoguide.ui.theme.WarmIvory
import com.example.renchityourstartupautoguide.ui.theme.renChitFieldColors
import com.example.renchityourstartupautoguide.viewmodel.FeedbackViewModel
import com.google.firebase.auth.FirebaseAuth
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

private val feedbackCategories = listOf("Suggestion", "Bug", "Content request", "Other")

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun FeedbackScreen(
    viewModel: FeedbackViewModel,
    onBack: () -> Unit
) {
    val context = LocalContext.current
    val myEmail = FirebaseAuth.getInstance().currentUser?.email ?: ""

    val allFeedbacks by viewModel.feedbacks.collectAsState()
    val myFeedbacks = allFeedbacks.filter { it.email == myEmail }

    var editingId by remember { mutableStateOf<String?>(null) }
    var rating by remember { mutableStateOf(0) }
    var category by remember { mutableStateOf("Suggestion") }
    var message by remember { mutableStateOf("") }
    var error by remember { mutableStateOf<String?>(null) }
    var feedbackToDelete by remember { mutableStateOf<Feedback?>(null) }

    fun clearForm() {
        editingId = null
        rating = 0
        category = "Suggestion"
        message = ""
        error = null
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(WarmIvory)
    ) {
        WarningTopBar(title = "Send feedback", onBack = onBack)

        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 16.dp)
        ) {
            Text(
                text = "YOUR FEEDBACK",
                style = MaterialTheme.typography.labelSmall,
                fontWeight = FontWeight.Bold,
                letterSpacing = 1.sp,
                color = OxideBronze
            )

            Spacer(modifier = Modifier.height(6.dp))

            Text(
                text = "Tell us what works and what doesn't. It helps make RenChit better.",
                style = MaterialTheme.typography.bodyMedium,
                color = SecondaryText
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Rating",
                style = MaterialTheme.typography.titleSmall,
                fontWeight = FontWeight.Bold,
                color = PrimaryText
            )

            Spacer(modifier = Modifier.height(8.dp))

            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                (1..5).forEach { value ->
                    val selected = rating == value

                    Text(
                        text = "$value",
                        style = MaterialTheme.typography.bodyMedium,
                        fontWeight = FontWeight.SemiBold,
                        color = if (selected) Color.White else OxideBronze,
                        modifier = Modifier
                            .clip(RoundedCornerShape(22.dp))
                            .background(if (selected) OxideBronze else CardWhite)
                            .border(1.5.dp, DividerTaupe, RoundedCornerShape(22.dp))
                            .clickable { rating = value }
                            .padding(horizontal = 18.dp, vertical = 10.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = "1 is poor, 5 is great",
                style = MaterialTheme.typography.bodySmall,
                color = SecondaryText
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Category",
                style = MaterialTheme.typography.titleSmall,
                fontWeight = FontWeight.Bold,
                color = PrimaryText
            )

            Spacer(modifier = Modifier.height(8.dp))

            FlowRow(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                feedbackCategories.forEach { item ->
                    val selected = category == item

                    Text(
                        text = item,
                        style = MaterialTheme.typography.bodyMedium,
                        fontWeight = FontWeight.SemiBold,
                        color = if (selected) Color.White else OxideBronze,
                        modifier = Modifier
                            .clip(RoundedCornerShape(22.dp))
                            .background(if (selected) OxideBronze else CardWhite)
                            .border(1.5.dp, DividerTaupe, RoundedCornerShape(22.dp))
                            .clickable { category = item }
                            .padding(horizontal = 16.dp, vertical = 10.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(
                value = message,
                onValueChange = { message = it },
                label = { Text("Your message") },
                minLines = 4,
                colors = renChitFieldColors(),
                modifier = Modifier.fillMaxWidth()
            )

            if (error != null) {
                Spacer(modifier = Modifier.height(12.dp))

                Text(
                    text = error ?: "",
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color(0xFFB3261E)
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = {
                    when {
                        rating == 0 ->
                            error = "Please choose a rating."

                        message.isBlank() ->
                            error = "Please write a message."

                        else -> {
                            val id = editingId

                            if (id == null) {
                                viewModel.addFeedback(
                                    Feedback(
                                        email = myEmail,
                                        rating = rating,
                                        category = category,
                                        message = message.trim(),
                                        createdAt = System.currentTimeMillis()
                                    )
                                )
                                Toast.makeText(
                                    context,
                                    "Thanks for your feedback",
                                    Toast.LENGTH_SHORT
                                ).show()
                            } else {
                                viewModel.updateFeedback(
                                    id,
                                    mapOf<String, Any>(
                                        "rating" to rating,
                                        "category" to category,
                                        "message" to message.trim()
                                    )
                                )
                                Toast.makeText(
                                    context,
                                    "Feedback updated",
                                    Toast.LENGTH_SHORT
                                ).show()
                            }

                            clearForm()
                        }
                    }
                },
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(containerColor = OxideBronze)
            ) {
                Text(if (editingId == null) "Send feedback" else "Save changes")
            }

            if (editingId != null) {
                TextButton(
                    onClick = { clearForm() },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("Cancel edit", color = OxideBronze)
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = "MY FEEDBACK",
                style = MaterialTheme.typography.labelSmall,
                fontWeight = FontWeight.Bold,
                letterSpacing = 1.sp,
                color = OxideBronze
            )

            Spacer(modifier = Modifier.height(8.dp))

            if (myFeedbacks.isEmpty()) {
                Text(
                    text = "You haven't sent any feedback yet.",
                    style = MaterialTheme.typography.bodyMedium,
                    color = SecondaryText
                )
            } else {
                myFeedbacks.forEach { item ->
                    FeedbackCard(
                        feedback = item,
                        onEdit = {
                            editingId = item.id
                            rating = item.rating
                            category = item.category
                            message = item.message
                            error = null
                        },
                        onDelete = { feedbackToDelete = item }
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                }
            }

            Spacer(modifier = Modifier.height(12.dp))
        }
    }

    feedbackToDelete?.let { item ->
        AlertDialog(
            onDismissRequest = { feedbackToDelete = null },
            title = { Text("Delete feedback?") },
            text = { Text("This removes your feedback from the list.") },
            confirmButton = {
                TextButton(
                    onClick = {
                        viewModel.deleteFeedback(item.id)
                        if (editingId == item.id) clearForm()
                        feedbackToDelete = null
                    }
                ) {
                    Text("Delete", color = Color(0xFFB3261E))
                }
            },
            dismissButton = {
                TextButton(onClick = { feedbackToDelete = null }) {
                    Text("Cancel", color = OxideBronze)
                }
            }
        )
    }
}

@Composable
private fun FeedbackCard(
    feedback: Feedback,
    onEdit: () -> Unit,
    onDelete: () -> Unit
) {
    val dateText = SimpleDateFormat("MMM d, yyyy", Locale.US)
        .format(Date(feedback.createdAt))

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .background(CardWhite)
            .padding(16.dp)
    ) {
        Text(
            text = "${feedback.category}, rated ${feedback.rating} out of 5",
            style = MaterialTheme.typography.titleSmall,
            fontWeight = FontWeight.Bold,
            color = PrimaryText
        )

        Spacer(modifier = Modifier.height(2.dp))

        Text(
            text = dateText,
            style = MaterialTheme.typography.bodySmall,
            color = SecondaryText
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = feedback.message,
            style = MaterialTheme.typography.bodyMedium,
            color = PrimaryText
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            TextButton(onClick = onEdit) {
                Text("Edit", color = OxideBronze)
            }
            TextButton(onClick = onDelete) {
                Text("Delete", color = Color(0xFFB3261E))
            }
        }
    }
}