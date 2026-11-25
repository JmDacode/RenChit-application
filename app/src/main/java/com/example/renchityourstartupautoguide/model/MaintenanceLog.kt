package com.example.renchityourstartupautoguide.model

data class MaintenanceLog(
    val id: String = "",
    val vehicleId: String = "",
    val vehicleName: String = "",
    val title: String = "",
    val guideId: String = "",
    val date: String = "",
    val odometer: Int = 0,
    val notes: String = "",
    val createdAt: Long = System.currentTimeMillis(),
    val isArchived: Int = 0
)