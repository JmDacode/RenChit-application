package com.example.renchityourstartupautoguide.viewmodel

import com.google.firebase.firestore.DocumentId

data class SavedRepair(
    @DocumentId
    val id: String = "",
    val guideId: Int = 0,
    val vehicleType: String = "",
    val category: String = "",
    val problemTask: String = "",
    val userNote: String = "",
    val createdAt: Long = System.currentTimeMillis(),
    val isArchived: Int = 0
)