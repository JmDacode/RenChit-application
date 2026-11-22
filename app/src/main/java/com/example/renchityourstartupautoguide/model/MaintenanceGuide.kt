package com.example.renchityourstartupautoguide.model

data class MaintenanceGuide(
    val id: String,
    val topicId: String,
    val title: String,
    val summary: String,
    val overview: String,
    val whyItMatters: String,
    val whenToDo: String,
    val tools: List<String>,
    val steps: List<String>,
    val watchFor: List<String>,
    val seeMechanic: List<String>,
    val safety: String? = null,
    val relatedPartIds: List<String> = emptyList(),
    val quiz: LearnQuiz? = null,
    val level: String = "Beginner",
    val minutes: Int = 5
)