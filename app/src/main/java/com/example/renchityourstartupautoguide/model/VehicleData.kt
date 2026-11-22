package com.example.renchityourstartupautoguide.model

object VehicleData {

    val types: List<VehicleType> = listOf(

        VehicleType(
            id = "sedan",
            name = "Sedan",
            tagline = "The classic everyday car",
            imageName = "photo_sedan",
            definition = "A passenger car with a separate trunk behind the cabin, usually with four doors.",
            whatMakesIt = listOf(
                "Three separate sections: engine, passenger cabin and trunk.",
                "Usually four doors and seating for four or five people.",
                "Sits lower to the ground than an SUV or pickup.",
                "Comes in sizes from compact to large."
            ),
            commonUses = listOf(
                "Daily commuting",
                "Family transportation",
                "Business and ride services",
                "Long highway drives"
            ),
            goodFor = listOf(
                "City and highway driving",
                "Fuel economy and a comfortable ride",
                "Easy parking"
            ),
            keepInMind = listOf(
                "Less cargo space than an SUV or pickup",
                "Lower ground clearance, so floods and rough roads are harder",
                "Tall or bulky items can be difficult to load"
            ),
            didYouKnow = "The word sedan describes the body shape, not the size, so sedans range from small city cars to large luxury cars."
        ),

        VehicleType(
            id = "suv",
            name = "SUV",
            tagline = "Taller, roomier, ready for more",
            imageName = "photo_suv",
            definition = "A sport utility vehicle with a taller body, higher ground clearance and one shared space for passengers and cargo.",
            whatMakesIt = listOf(
                "Taller body and a higher seating position.",
                "Passengers and cargo share one open space.",
                "Usually seats five to seven people.",
                "Often offered with front, rear, all wheel or four wheel drive."
            ),
            commonUses = listOf(
                "Family transportation",
                "Mixed city and rough road driving",
                "Carrying luggage and gear",
                "Light towing, depending on the model"
            ),
            goodFor = listOf(
                "A higher view of the road",
                "More cargo and passenger space than a sedan",
                "Rougher roads and uneven surfaces"
            ),
            keepInMind = listOf(
                "Usually uses more fuel than a similar sized sedan",
                "A taller body can feel less steady in corners",
                "Larger size can make parking harder"
            ),
            didYouKnow = "Many modern SUVs use a car-style one-piece body, while older and tougher ones are built on a separate frame."
        ),

        VehicleType(
            id = "pickup_truck",
            name = "Pickup Truck",
            tagline = "Passengers up front, cargo in back",
            imageName = "photo_pickup_truck",
            definition = "A vehicle designed to combine passenger transportation with cargo-carrying capability.",
            whatMakesIt = listOf(
                "Separate passenger cabin and cargo bed.",
                "Designed to carry people and heavier loads.",
                "Available in different cab configurations.",
                "Offered with different drivetrain options."
            ),
            commonUses = listOf(
                "Everyday transportation",
                "Carrying equipment and cargo",
                "Business and utility work",
                "Long-distance travel"
            ),
            goodFor = listOf(
                "Hauling cargo, tools and equipment",
                "Rough roads and work sites",
                "Towing, depending on the model"
            ),
            keepInMind = listOf(
                "A bigger body is harder to park and turn in tight streets",
                "An empty bed can make the ride bouncier",
                "Usually uses more fuel than a small car"
            ),
            didYouKnow = "Some pickup trucks are available with four-wheel drive, making them suitable for certain rough-road conditions."
        ),

        VehicleType(
            id = "van",
            name = "Van",
            tagline = "Big space for people or cargo",
            imageName = "photo_van",
            definition = "A box-shaped vehicle with a large shared interior, built to carry groups of people or lots of goods.",
            whatMakesIt = listOf(
                "A tall, boxy body that maximizes interior space.",
                "A large open interior with few dividers.",
                "Often has sliding or wide rear doors.",
                "Built in passenger and cargo versions."
            ),
            commonUses = listOf(
                "Group and shuttle transport",
                "Delivery and business use",
                "Tours and travel groups",
                "Moving equipment and goods"
            ),
            goodFor = listOf(
                "Carrying many passengers or a lot of cargo",
                "Flexible interior layouts",
                "Business and group needs"
            ),
            keepInMind = listOf(
                "Its size makes parking and tight turns harder",
                "A tall body can be affected by strong wind",
                "Handling is less sporty than a car"
            ),
            didYouKnow = "Vans come as passenger versions with seats and windows, and as cargo versions built mainly for carrying goods."
        ),

        VehicleType(
            id = "mpv",
            name = "MPV",
            tagline = "Family space with flexible seating",
            imageName = "photo_mpv",
            definition = "A multi-purpose vehicle, built mainly to carry passengers with flexible seating and a roomy interior.",
            whatMakesIt = listOf(
                "A spacious body with a tall roofline.",
                "Often has three rows of seats.",
                "Seats can usually fold or move to make cargo room.",
                "Built with a car-like ride and handling."
            ),
            commonUses = listOf(
                "Family trips",
                "Airport and group transfers",
                "Everyday passenger transport",
                "Carrying luggage on holidays"
            ),
            goodFor = listOf(
                "Seating six or more people",
                "Flexible seats for people or cargo",
                "A comfortable, easy-to-drive ride"
            ),
            keepInMind = listOf(
                "Lower ground clearance than an SUV",
                "With all rows in use, luggage space can be limited",
                "Not built for rough off-road use"
            ),
            didYouKnow = "MPV stands for multi-purpose vehicle, and it is a popular family vehicle in many countries."
        )
    )

    fun getType(id: String): VehicleType? = types.find { it.id == id }
}