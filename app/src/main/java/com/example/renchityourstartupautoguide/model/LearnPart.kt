package com.example.renchityourstartupautoguide.model

data class LearnPart(
    val id: String,
    val systemId: String,
    val groupId: String,
    val name: String,
    val summary: String,
    val whatIs: String,
    val whatItDoes: List<String>,
    val location: String? = null,
    val relatedIds: List<String> = emptyList(),
    val ifItFails: String? = null,
    val maintenance: String? = null,
    val whyItMatters: String? = null,
    val quiz: LearnQuiz? = null,
    val level: String = "Beginner",
    val minutes: Int = 2
)