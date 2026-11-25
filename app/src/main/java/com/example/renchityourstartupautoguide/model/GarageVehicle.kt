package com.example.renchityourstartupautoguide.model

data class GarageVehicle(
    val id: String = "",
    val nickname: String = "",
    val vehicleTypeId: String = "",
    val make: String = "",
    val model: String = "",
    val year: Int = 0,
    val odometer: Int = 0,
    val status: String = "active",
    val createdAt: Long = 0L
)