package com.example.renchityourstartupautoguide.viewmodel

data class User(
    val id: Int,
    val username: String,
    val email: String,
    val passwordHash: String,
    val createdAt: Long
)