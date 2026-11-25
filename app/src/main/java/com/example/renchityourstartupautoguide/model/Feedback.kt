package com.example.renchityourstartupautoguide.model

data class Feedback(
    val id: String = "",
    val email: String = "",
    val rating: Int = 0,
    val category: String = "",
    val message: String = "",
    val createdAt: Long = System.currentTimeMillis(),
    val isArchived: Int = 0
)