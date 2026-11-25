package com.example.renchityourstartupautoguide.viewmodel

import androidx.lifecycle.ViewModel
import com.example.renchityourstartupautoguide.model.GarageVehicle
import com.example.renchityourstartupautoguide.repository.GarageRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class GarageViewModel(
    private val repository: GarageRepository
) : ViewModel() {

    private val _vehicles = MutableStateFlow<List<GarageVehicle>>(emptyList())
    val vehicles: StateFlow<List<GarageVehicle>> = _vehicles.asStateFlow()

    init {
        loadVehicles()
    }

    fun loadVehicles() {
        repository.getVehicles { list ->
            _vehicles.value = list
        }
    }

    fun getVehicle(id: String): GarageVehicle? =
        _vehicles.value.find { it.id == id }

    fun addVehicle(
        nickname: String,
        vehicleTypeId: String,
        make: String,
        model: String,
        year: Int,
        odometer: Int,
        onResult: (Boolean) -> Unit
    ) {
        val vehicle = GarageVehicle(
            nickname = nickname,
            vehicleTypeId = vehicleTypeId,
            make = make,
            model = model,
            year = year,
            odometer = odometer,
            status = "active",
            createdAt = System.currentTimeMillis()
        )

        repository.addVehicle(vehicle) { success ->
            if (success) loadVehicles()
            onResult(success)
        }
    }

    fun updateVehicle(vehicle: GarageVehicle, onResult: (Boolean) -> Unit) {
        repository.updateVehicle(vehicle) { success ->
            if (success) loadVehicles()
            onResult(success)
        }
    }

    fun archiveVehicle(vehicleId: String, onResult: (Boolean) -> Unit) {
        repository.archiveVehicle(vehicleId) { success ->
            if (success) loadVehicles()
            onResult(success)
        }
    }
}