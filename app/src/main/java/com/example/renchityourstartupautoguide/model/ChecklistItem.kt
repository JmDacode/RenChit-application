package com.example.renchityourstartupautoguide.model

data class ChecklistItem(
    val id: String,
    val categoryId: String,
    val title: String,
    val hint: String,
    val why: String,
    val steps: List<String>,
    val tip: String,
    val minutes: Int = 1,
    val level: String = "Easy"
)