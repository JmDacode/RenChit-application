package com.example.renchityourstartupautoguide.model

data class VehicleType(
    val id: String,
    val name: String,
    val tagline: String,
    val imageName: String,
    val definition: String,
    val whatMakesIt: List<String>,
    val commonUses: List<String>,
    val goodFor: List<String>,
    val keepInMind: List<String>,
    val didYouKnow: String
)