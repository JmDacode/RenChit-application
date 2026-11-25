package com.example.renchityourstartupautoguide.repository

import com.example.renchityourstartupautoguide.model.UserProfile
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await

class UserRepository {

    private val db = FirebaseFirestore.getInstance()
    private val collectionPath = "coll_users"

    fun getUsers(
        onResult: (List<UserProfile>) -> Unit
    ) {

        db.collection(collectionPath)
            .addSnapshotListener { snapshots, error ->

                if (error != null) {
                    println("Listen failed: ${error.message}")
                    onResult(emptyList())
                    return@addSnapshotListener
                }

                if (snapshots != null) {

                    val users = snapshots.documents.map { document ->

                        UserProfile(
                            id = document.id,
                            email = document.getString("email") ?: "",
                            createdAt = document.getLong("createdAt")
                                ?: System.currentTimeMillis(),
                            isArchived = document.getLong("isArchived")?.toInt() ?: 0
                        )

                    }.filter { it.isArchived == 0 }

                    onResult(users)
                }
            }
    }

    suspend fun addUser(user: UserProfile) {

        val document = db.collection(collectionPath)
            .document()

        val data = hashMapOf<String, Any>(
            "email" to user.email,
            "createdAt" to user.createdAt,
            "isArchived" to user.isArchived
        )

        document.set(data).await()

    }

    fun updateUser(
        id: String,
        updates: Map<String, Any>
    ) {

        db.collection(collectionPath)
            .document(id)
            .update(updates)

    }

    fun deleteUser(id: String) {
        db.collection(collectionPath)
            .document(id)
            .update("isArchived", 1)
    }
}