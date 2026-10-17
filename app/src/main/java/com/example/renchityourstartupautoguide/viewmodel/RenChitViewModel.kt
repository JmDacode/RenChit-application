package com.example.renchityourstartupautoguide.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class RenChitViewModel(
    private val repository: SavedRepairRepository
) : ViewModel() {

    val savedRepairs = repository.savedRepairs
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5_000),
            initialValue = emptyList()
        )

    val repairGuides = listOf(
        RepairGuide(
            id = 1,
            vehicleType = "PickupTruck",
            category = "Engine",
            problemTask = "Engine won't start",
            description = "The engine does not start when you turn the key.",
            possibleCauses = "Weak battery, loose battery connection, fuel-related issue",
            basicChecks = "Check battery terminals, check if engine cranks, check fuel level",
            recommendedAction = "Inspect the battery and connections. Seek help if the issue continues."
        ),
        RepairGuide(
            id = 2,
            vehicleType = "PickupTruck",
            category = "Engine",
            problemTask = "Engine Overheating.",
            description = "The engine temperature rises above normal while driving.",
            possibleCauses = "Low coolant, faulty thermostat, radiator blockage",
            basicChecks = "Check coolant level, check for leaks, check radiator fan",
            recommendedAction = "Let the engine cool down before checking coolant. Seek help if it continues."
        ),
        RepairGuide(
            id = 3,
            vehicleType = "PickupTruck",
            category = "Engine",
            problemTask = "Rough engine",
            description = "The engine runs unevenly or shakes at idle.",
            possibleCauses = "Dirty air filter, worn spark plugs, vacuum leak",
            basicChecks = "Check air filter, check spark plug condition, listen for hissing sounds",
            recommendedAction = "Replace air filter or spark plugs if worn. Seek help if it continues."
        ),
        RepairGuide(
            id = 4,
            vehicleType = "PickupTruck",
            category = "Brakes",
            problemTask = "Squeaking brakes",
            description = "The brakes make a squeaking or grinding noise when pressed.",
            possibleCauses = "Worn brake pads, dirty rotors",
            basicChecks = "Check brake pad thickness, listen for grinding sounds",
            recommendedAction = "Replace worn brake pads. Seek help if grinding continues."
        ),
        RepairGuide(
            id = 5,
            vehicleType = "Sedan",
            category = "CoolingSystem",
            problemTask = "Coolant leak",
            description = "Coolant is visibly leaking under the vehicle.",
            possibleCauses = "Cracked hose, damaged radiator, loose clamp",
            basicChecks = "Check under the vehicle for puddles, inspect hoses and clamps",
            recommendedAction = "Top up coolant temporarily and seek help soon."
        ),
        RepairGuide(
            id = 6,
            vehicleType = "SUV",
            category = "Engine",
            problemTask = "SUV won't start",
            description = "The SUV does not start when you turn the key or press the start button.",
            possibleCauses = "Weak battery, loose battery connection, starter-related issue, fuel-related issue",
            basicChecks = "Check battery terminals, check dashboard lights, check if the engine cranks, check fuel level",
            recommendedAction = "Inspect the battery and connections. If the SUV still does not start, seek professional assistance."
        )
    )

    fun getGuide(id: Int) =
        repairGuides.find { it.id == id }

    fun categoriesFor(vehicleType: String) =
        repairGuides.filter { it.vehicleType == vehicleType }
            .map { it.category }
            .distinct()

    fun guidesFor(vehicleType: String, category: String) =
        repairGuides.filter {
            it.vehicleType == vehicleType && it.category == category
        }

    fun getSavedRepair(id: Int): SavedRepairEntity? =
        savedRepairs.value.find { it.id == id }

    fun addSavedRepair(
        guideId: Int,
        vehicleType: String,
        category: String,
        problemTask: String,
        userNote: String
    ) {
        viewModelScope.launch {
            repository.addSavedRepair(
                SavedRepairEntity(
                    guideId = guideId,
                    vehicleType = vehicleType,
                    category = category,
                    problemTask = problemTask,
                    userNote = userNote
                )
            )
        }
    }

    fun updateSavedRepair(
        id: Int,
        vehicleType: String,
        category: String,
        problemTask: String,
        userNote: String
    ) {
        viewModelScope.launch {
            val existing = repository.getSavedRepair(id)
                ?: return@launch

            repository.updateSavedRepair(
                existing.copy(
                    vehicleType = vehicleType,
                    category = category,
                    problemTask = problemTask,
                    userNote = userNote
                )
            )
        }
    }

    fun deleteSavedRepair(id: Int) {
        viewModelScope.launch {
            val existing = repository.getSavedRepair(id)
                ?: return@launch

            repository.deleteSavedRepair(existing)
        }
    }
}