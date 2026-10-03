package com.example.renchityourstartupautoguide.viewmodel

data class RepairGuide(
    val id: Int,
    val vehicleType: String,
    val category: String,
    val problemTask: String,
    val description: String,
    val possibleCauses: String,
    val basicChecks: String,
    val recommendedAction: String,
)