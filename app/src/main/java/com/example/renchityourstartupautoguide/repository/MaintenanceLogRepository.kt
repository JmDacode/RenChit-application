package com.example.renchityourstartupautoguide.repository

import com.example.renchityourstartupautoguide.model.MaintenanceLog
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await

class MaintenanceLogRepository {

    private val db = FirebaseFirestore.getInstance()
    private val collectionPath = "coll_maintenance_log"

    fun getLogs(
        onResult: (List<MaintenanceLog>) -> Unit
    ) {

        db.collection(collectionPath)
            .addSnapshotListener { snapshots, error ->

                if (error != null) {
                    println("Listen failed: ${error.message}")
                    onResult(emptyList())
                    return@addSnapshotListener
                }

                if (snapshots != null) {

                    val logs = snapshots.documents.map { document ->

                        MaintenanceLog(
                            id = document.id,
                            vehicleId = document.getString("vehicleId") ?: "",
                            vehicleName = document.getString("vehicleName") ?: "",
                            title = document.getString("title") ?: "",
                            guideId = document.getString("guideId") ?: "",
                            date = document.getString("date") ?: "",
                            odometer = document.getLong("odometer")?.toInt() ?: 0,
                            notes = document.getString("notes") ?: "",
                            createdAt = document.getLong("createdAt")
                                ?: System.currentTimeMillis(),
                            isArchived = document.getLong("isArchived")?.toInt() ?: 0
                        )

                    }.filter { it.isArchived == 0 }
                        .sortedWith(
                            compareByDescending<MaintenanceLog> { it.date }
                                .thenByDescending { it.createdAt }
                        )

                    onResult(logs)
                }
            }
    }

    suspend fun addLog(log: MaintenanceLog) {

        val document = db.collection(collectionPath)
            .document()

        val data = hashMapOf<String, Any>(
            "vehicleId" to log.vehicleId,
            "vehicleName" to log.vehicleName,
            "title" to log.title,
            "guideId" to log.guideId,
            "date" to log.date,
            "odometer" to log.odometer,
            "notes" to log.notes,
            "createdAt" to log.createdAt,
            "isArchived" to log.isArchived
        )

        document.set(data).await()

    }

    fun updateLog(
        id: String,
        updates: Map<String, Any>
    ) {

        db.collection(collectionPath)
            .document(id)
            .update(updates)

    }

    fun deleteLog(id: String) {
        db.collection(collectionPath)
            .document(id)
            .update("isArchived", 1)
    }
}