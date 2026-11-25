package com.example.renchityourstartupautoguide.repository

import com.example.renchityourstartupautoguide.model.GarageVehicle
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await

class GarageRepository {

    private val db = FirebaseFirestore.getInstance()
    private val collectionPath = "coll_garage"

    fun getVehicles(
        onResult: (List<GarageVehicle>) -> Unit
    ) {

        db.collection(collectionPath)
            .addSnapshotListener { snapshots, error ->

                if (error != null) {
                    println("Listen failed: ${error.message}")
                    onResult(emptyList())
                    return@addSnapshotListener
                }

                if (snapshots != null) {

                    val vehicles = snapshots.documents.map { document ->

                        GarageVehicle(
                            id = document.id,
                            nickname = document.getString("nickname") ?: "",
                            vehicleTypeId = document.getString("vehicleTypeId") ?: "",
                            make = document.getString("make") ?: "",
                            model = document.getString("model") ?: "",
                            year = document.getLong("year")?.toInt() ?: 0,
                            odometer = document.getLong("odometer")?.toInt() ?: 0,
                            createdAt = document.getLong("createdAt")
                                ?: System.currentTimeMillis(),
                            isArchived = document.getLong("isArchived")?.toInt() ?: 0
                        )

                    }.filter { it.isArchived == 0 }
                        .sortedByDescending { it.createdAt }

                    onResult(vehicles)
                }
            }
    }

    suspend fun addVehicle(vehicle: GarageVehicle) {

        val document = db.collection(collectionPath)
            .document()

        val data = hashMapOf<String, Any>(
            "nickname" to vehicle.nickname,
            "vehicleTypeId" to vehicle.vehicleTypeId,
            "make" to vehicle.make,
            "model" to vehicle.model,
            "year" to vehicle.year,
            "odometer" to vehicle.odometer,
            "createdAt" to vehicle.createdAt,
            "isArchived" to vehicle.isArchived
        )

        document.set(data).await()

    }

    fun updateVehicle(
        id: String,
        updates: Map<String, Any>
    ) {

        db.collection(collectionPath)
            .document(id)
            .update(updates)

    }

    fun deleteVehicle(id: String) {
        db.collection(collectionPath)
            .document(id)
            .update("isArchived", 1)
    }
}