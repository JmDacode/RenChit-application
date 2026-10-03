package com.example.renchityourstartupautoguide.viewmodel

fun displayVehicleType(value: String): String = when (value) {
    "PickupTruck" -> "Pickup Truck"
    else -> value
}

fun displayCategory(value: String): String = when (value) {
    "CoolingSystem" -> "Cooling System"
    "BatteryElectrical" -> "Battery & Electrical"
    else -> value
}