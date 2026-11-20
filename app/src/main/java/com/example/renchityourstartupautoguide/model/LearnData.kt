package com.example.renchityourstartupautoguide.model

object LearnData {

    val systems = listOf(
        LearnSystem(
            id = "engine",
            title = "Engine",
            tagline = "Where the power starts",
            overview = "The engine burns fuel to make the power that moves the car. Learn what is inside it and how the parts work together."
        ),
        LearnSystem(
            id = "transmission",
            title = "Transmission",
            tagline = "and drivetrain",
            overview = "The transmission takes the engine's power and sends it to the wheels. Learn how gears and the parts around them work."
        ),
        LearnSystem(
            id = "brakes",
            title = "Brakes",
            tagline = "Stopping your vehicle",
            overview = "Learn how the braking system works, understand its key components, and discover how they work together to slow down and stop your vehicle."
        ),
        LearnSystem(
            id = "cooling",
            title = "Cooling",
            tagline = "Keeping it cool",
            overview = "Learn how the cooling system regulates engine temperature and how its components work together."
        ),
        LearnSystem(
            id = "electrical",
            title = "Electrical",
            tagline = "Battery and lights",
            overview = "Learn how the electrical system powers the vehicle's battery, lights, and other electrical components."
        ),
        LearnSystem(
            id = "suspension",
            title = "Suspension and steering",
            tagline = "Suspension and steering",
            overview = "Learn how the suspension and steering systems provide vehicle stability, handling, and ride comfort."
        ),
        LearnSystem(
            id = "fuel_exhaust",
            title = "Fuel and Exhaust",
            tagline = "Fuel in, gas out",
            overview = "Learn how the fuel system delivers fuel to the engine and how the exhaust system removes harmful gases produced during combustion."
        ),
        LearnSystem(
            id = "aircon",
            title = "Air Conditioning",
            tagline = "Climate control",
            overview = "Learn how the air conditioning system cools the cabin, controls airflow, and keeps passengers comfortable."
        ),
        LearnSystem(
            id = "wheels",
            title = "Wheels and Tires",
            tagline = "Where it meets the road",
            overview = "Learn how wheels and tires support the vehicle, provide traction, absorb road impacts, and help maintain safe handling."
        ),
        LearnSystem(
            id = "body_safety",
            title = "Body and Safety",
            tagline = "Frame, belts, airbags",
            overview = "Learn how the vehicle's body, frame, seat belts, and airbags protect passengers and help keep the vehicle structurally safe."
        ),
    )

    val groups: List<LearnGroup> = EngineBasicsData.groups +
            EngineInternalData.groups +
            EngineTimingAirData.groups +
            EngineSystemsData.groups +
            TransmissionBasicsData.groups +
            TransmissionDrivetrainData.groups +
            BrakesBasicsData.groups +
            BrakesSystemsData.groups +
            CoolingData.groups +
            ElectricalBasicsData.groups +
            ElectricalSystemsData.groups +
            SuspensionBasicsData.groups +
            SuspensionSystemsData.groups +
            FuelExhaustData.groups +
            AirConData.groups +
            WheelsTiresData.groups +
            BodySafetyData.groups

    val parts: List<LearnPart> = EngineBasicsData.parts +
            EngineInternalData.parts +
            EngineTimingAirData.parts +
            EngineSystemsData.parts +
            TransmissionBasicsData.parts +
            TransmissionDrivetrainData.parts +
            BrakesBasicsData.parts +
            BrakesSystemsData.parts +
            CoolingData.parts +
            ElectricalBasicsData.parts +
            ElectricalSystemsData.parts +
            SuspensionBasicsData.parts +
            SuspensionSystemsData.parts +
            FuelExhaustData.parts +
            AirConData.parts +
            WheelsTiresData.parts +
            BodySafetyData.parts

    fun getSystem(id: String): LearnSystem? = systems.find { it.id == id }

    fun groupsFor(systemId: String): List<LearnGroup> = groups.filter { it.systemId == systemId }

    fun partsFor(groupId: String): List<LearnPart> = parts.filter { it.groupId == groupId }

    fun partCount(systemId: String): Int = parts.count { it.systemId == systemId }

    fun getPart(id: String): LearnPart? = parts.find { it.id == id }

    fun getGroup(id: String): LearnGroup? = groups.find { it.id == id }
}