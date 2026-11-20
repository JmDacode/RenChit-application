package com.example.renchityourstartupautoguide.model

data class WarningItem(
    val id: String,
    val categoryId: String,
    val title: String,
    val detailTitle: String,
    val typeLabel: String,
    val summary: String,
    val severity: String,
    val causes: List<String>,
    val action: String,
    val causesHeading: String = "Possible causes"
)
