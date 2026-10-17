package com.example.renchityourstartupautoguide.viewmodel

data class SavedRepair(
    val id: Int,
    val guideId: Int,
    val vehicleType: String,
    val category: String,
    val problemTask: String,
    val userNote: String,
)