package com.example.renchityourstartupautoguide.viewmodel

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class SavedRepairEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val guideId: Int = 0,
    val vehicleType: String,
    val category: String,
    val problemTask: String,
    val userNote: String
)