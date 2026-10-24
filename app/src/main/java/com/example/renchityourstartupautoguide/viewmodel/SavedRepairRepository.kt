package com.example.renchityourstartupautoguide.viewmodel

import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await

class SavedRepairRepository {

    private val db = FirebaseFirestore.getInstance()
    private val collectionPath = "coll_saved_repairs"

    fun getSavedRepairs(
        onResult: (List<SavedRepair>) -> Unit
    ) {

        db.collection(collectionPath)
            .addSnapshotListener { snapshots, error ->

                if (error != null) {
                    println("Listen failed: ${error.message}")
                    onResult(emptyList())
                    return@addSnapshotListener
                }

                if (snapshots != null) {

                    val repairs = snapshots.documents.map { document ->

                        SavedRepair(
                            id = document.id,
                            guideId = document.getLong("guideId")?.toInt() ?: 0,
                            vehicleType = document.getString("vehicleType") ?: "",
                            category = document.getString("category") ?: "",
                            problemTask = document.getString("problemTask") ?: "",
                            userNote = document.getString("userNote") ?: "",
                            createdAt = document.getLong("createdAt")
                                ?: System.currentTimeMillis(),
                            isArchived = document.getLong("isArchived")?.toInt() ?: 0
                        )

                    }.filter { it.isArchived == 0 }

                    onResult(repairs)
                }
            }
    }

    suspend fun addSavedRepair(repair: SavedRepair) {

        val document = db.collection(collectionPath)
            .document()

        val data = hashMapOf<String, Any>(
            "guideId" to repair.guideId,
            "vehicleType" to repair.vehicleType,
            "category" to repair.category,
            "problemTask" to repair.problemTask,
            "userNote" to repair.userNote,
            "createdAt" to repair.createdAt,
            "isArchived" to repair.isArchived
        )

        document.set(data).await()

    }

    fun updateSavedRepair(
        id: String,
        updates: Map<String, Any>
    ) {

        db.collection(collectionPath)
            .document(id)
            .update(updates)

    }

    fun deleteSavedRepair(id: String) {
        db.collection(collectionPath)
            .document(id)
            .update("isArchived", 1)
    }
}