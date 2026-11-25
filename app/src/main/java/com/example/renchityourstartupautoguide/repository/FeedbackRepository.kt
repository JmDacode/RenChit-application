package com.example.renchityourstartupautoguide.repository

import com.example.renchityourstartupautoguide.model.Feedback
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await

class FeedbackRepository {

    private val db = FirebaseFirestore.getInstance()
    private val collectionPath = "coll_feedback"

    fun getFeedbacks(
        onResult: (List<Feedback>) -> Unit
    ) {

        db.collection(collectionPath)
            .addSnapshotListener { snapshots, error ->

                if (error != null) {
                    println("Listen failed: ${error.message}")
                    onResult(emptyList())
                    return@addSnapshotListener
                }

                if (snapshots != null) {

                    val feedbacks = snapshots.documents.map { document ->

                        Feedback(
                            id = document.id,
                            email = document.getString("email") ?: "",
                            rating = document.getLong("rating")?.toInt() ?: 0,
                            category = document.getString("category") ?: "",
                            message = document.getString("message") ?: "",
                            createdAt = document.getLong("createdAt")
                                ?: System.currentTimeMillis(),
                            isArchived = document.getLong("isArchived")?.toInt() ?: 0
                        )

                    }.filter { it.isArchived == 0 }
                        .sortedByDescending { it.createdAt }

                    onResult(feedbacks)
                }
            }
    }

    suspend fun addFeedback(feedback: Feedback) {

        val document = db.collection(collectionPath)
            .document()

        val data = hashMapOf<String, Any>(
            "email" to feedback.email,
            "rating" to feedback.rating,
            "category" to feedback.category,
            "message" to feedback.message,
            "createdAt" to feedback.createdAt,
            "isArchived" to feedback.isArchived
        )

        document.set(data).await()

    }

    fun updateFeedback(
        id: String,
        updates: Map<String, Any>
    ) {

        db.collection(collectionPath)
            .document(id)
            .update(updates)

    }

    fun deleteFeedback(id: String) {
        db.collection(collectionPath)
            .document(id)
            .update("isArchived", 1)
    }
}