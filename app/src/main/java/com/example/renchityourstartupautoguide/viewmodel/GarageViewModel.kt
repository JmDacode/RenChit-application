package com.example.renchityourstartupautoguide.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.renchityourstartupautoguide.model.GarageVehicle
import com.example.renchityourstartupautoguide.repository.GarageRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class GarageViewModel(
    private val repository: GarageRepository
) : ViewModel() {

    private val _vehicles = MutableStateFlow<List<GarageVehicle>>(emptyList())
    val vehicles: StateFlow<List<GarageVehicle>> = _vehicles.asStateFlow()

    init {
        repository.getVehicles { list ->
            _vehicles.value = list
        }
    }

    fun getVehicle(id: String): GarageVehicle? =
        _vehicles.value.find { it.id == id }

    fun addVehicle(vehicle: GarageVehicle) {
        viewModelScope.launch {
            try {
                repository.addVehicle(vehicle)
            } catch (e: Exception) {
                println("Add vehicle failed: ${e.message}")
            }
        }
    }

    fun updateVehicle(id: String, updates: Map<String, Any>) {
        repository.updateVehicle(id, updates)
    }

    fun deleteVehicle(id: String) {
        repository.deleteVehicle(id)
    }
}