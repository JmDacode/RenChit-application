package com.example.renchityourstartupautoguide.model

object MaintenanceData {

    val topics: List<MaintenanceTopic> = listOf(
        MaintenanceTopic(
            id = "fluids",
            title = "Fluids",
            tagline = "Oil, coolant, brake fluid, washer fluid"
        ),
        MaintenanceTopic(
            id = "tires",
            title = "Tires",
            tagline = "Pressure, tread, rotation, wear"
        ),
        MaintenanceTopic(
            id = "battery",
            title = "Battery",
            tagline = "Terminals, condition, warning signs"
        ),
        MaintenanceTopic(
            id = "filters",
            title = "Filters",
            tagline = "Air filter, cabin filter"
        ),
        MaintenanceTopic(
            id = "belts_hoses",
            title = "Belts and Hoses",
            tagline = "Wear, cracks, leaks"
        ),
        MaintenanceTopic(
            id = "exterior",
            title = "Exterior Care",
            tagline = "Lights, wipers, cleaning"
        )
    )

    val guides: List<MaintenanceGuide> = MaintenanceFluidsData.guides +
            MaintenanceTiresData.guides +
            MaintenanceBatteryData.guides +
            MaintenanceFiltersData.guides +
            MaintenanceBeltsHosesData.guides +
            MaintenanceExteriorData.guides
    fun getTopic(id: String): MaintenanceTopic? = topics.find { it.id == id }

    fun guidesFor(topicId: String): List<MaintenanceGuide> =
        guides.filter { it.topicId == topicId }

    fun guideCount(topicId: String): Int = guides.count { it.topicId == topicId }

    fun getGuide(id: String): MaintenanceGuide? = guides.find { it.id == id }
}