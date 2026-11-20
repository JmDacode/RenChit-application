package com.example.renchityourstartupautoguide.model

data class LearnQuiz(
    val question: String,
    val options: List<String>,
    val answerIndex: Int,
    val explanation: String
)