package com.example.renchityourstartupautoguide.repository

import android.util.Log
import com.example.renchityourstartupautoguide.model.GarageVehicle
import com.google.firebase.firestore.FirebaseFirestore

class GarageRepository {

    private val db = FirebaseFirestore.getInstance()

    private val garageCollection = db.collection("coll_garage")

    // Read: fetch all active vehicles
    fun getVehicles(onResult: (List<GarageVehicle>) -> Unit) {
        garageCollection
            .whereEqualTo("status", "active")
            .get()
            .addOnSuccessListener { result ->
                val vehicles = result.documents
                    .mapNotNull { doc ->
                        doc.toObject(GarageVehicle::class.java)?.copy(id = doc.id)
                    }
                    .sortedByDescending { it.createdAt }

                onResult(vehicles)
            }
            .addOnFailureListener { error ->
                Log.e("GarageRepository", "Could not fetch vehicles", error)
                onResult(emptyList())
            }
    }

    // Create: add a vehicle
    fun addVehicle(vehicle: GarageVehicle, onResult: (Boolean) -> Unit) {
        garageCollection
            .add(vehicle)
            .addOnSuccessListener { onResult(true) }
            .addOnFailureListener { error ->
                Log.e("GarageRepository", "Could not add vehicle", error)
                onResult(false)
            }
    }

    // Update: change the fields of an existing vehicle
    fun updateVehicle(vehicle: GarageVehicle, onResult: (Boolean) -> Unit) {
        val updates = mapOf<String, Any>(
            "nickname" to vehicle.nickname,
            "vehicleTypeId" to vehicle.vehicleTypeId,
            "make" to vehicle.make,
            "model" to vehicle.model,
            "year" to vehicle.year,
            "odometer" to vehicle.odometer
        )

        garageCollection
            .document(vehicle.id)
            .update(updates)
            .addOnSuccessListener { onResult(true) }
            .addOnFailureListener { error ->
                Log.e("GarageRepository", "Could not update vehicle", error)
                onResult(false)
            }
    }

    // Archive: keep the document, just mark it archived
    fun archiveVehicle(vehicleId: String, onResult: (Boolean) -> Unit) {
        garageCollection
            .document(vehicleId)
            .update("status", "archived")
            .addOnSuccessListener { onResult(true) }
            .addOnFailureListener { error ->
                Log.e("GarageRepository", "Could not archive vehicle", error)
                onResult(false)
            }
    }
}