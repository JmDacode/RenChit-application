package com.example.renchityourstartupautoguide.model

data class LearnSystem(
    val id: String,
    val title: String,
    val tagline: String,
    val overview: String,
    val available: Boolean = true
)