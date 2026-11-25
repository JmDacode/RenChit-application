package com.example.renchityourstartupautoguide.model

data class UserProfile(
    val email: String = "",
    val status: String = "active",
    val createdAt: Long = 0L
)