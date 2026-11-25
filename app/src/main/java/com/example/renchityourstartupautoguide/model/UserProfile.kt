package com.example.renchityourstartupautoguide.model

data class UserProfile(
    val id: String = "",
    val email: String = "",
    val createdAt: Long = System.currentTimeMillis(),
    val isArchived: Int = 0
)