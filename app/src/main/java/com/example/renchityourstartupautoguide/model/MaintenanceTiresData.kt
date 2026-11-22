package com.example.renchityourstartupautoguide.model

object MaintenanceTiresData {

    val guides = listOf(

        MaintenanceGuide(
            id = "tire_pressure_check",
            topicId = "tires",
            title = "Checking tire pressure",
            summary = "The single most useful tire habit",
            overview = "Checking tire pressure means measuring the air inside each tire with a gauge and comparing it to the number the car maker recommends. It takes a few minutes and costs almost nothing.",
            whyItMatters = "Low pressure wears tires out faster, wastes fuel, makes the car feel sluggish and can lead to a blowout. Too much pressure reduces grip and gives a harsh ride.",
            whenToDo = "At least once a month, before long trips, and when the temperature changes a lot. Always check when the tires are cold.",
            tools = listOf(
                "A tire pressure gauge",
                "An air pump or a gas station air machine",
                "Your owner's manual or the sticker inside the driver's door frame",
                "A rag to wipe off the valve"
            ),
            steps = listOf(
                "Check the tires cold, meaning the car has been parked for a few hours or driven only a short distance.",
                "Find the recommended pressure on the sticker inside the driver's door frame or in your manual. Do not use the number printed on the tire sidewall, because that is the maximum the tire can take.",
                "Unscrew the valve cap on the first tire and keep it somewhere safe.",
                "Press the gauge firmly onto the valve stem until the hissing stops, then read the number.",
                "If the pressure is low, add a little air, then measure again.",
                "If it is too high, press the small pin in the middle of the valve briefly to let some air out, then measure again.",
                "Screw the valve cap back on.",
                "Repeat for the other three tires, and the spare if you have one."
            ),
            watchFor = listOf(
                "One tire that is lower than the others",
                "A tire that loses air again within a few days",
                "A tire that looks flat or bulging at the bottom",
                "A dashboard tire pressure warning light",
                "Missing valve caps"
            ),
            seeMechanic = listOf(
                "A tire keeps losing air after you fill it",
                "You can hear hissing or see a nail or screw in the tread",
                "The tire pressure light stays on even after you set the pressure right",
                "The valve is damaged or leaking"
            ),
            safety = "Never drive on a very flat tire. It can overheat, come apart and damage the wheel. If a tire is badly low, pump it up carefully and drive slowly to the nearest shop.",
            relatedPartIds = listOf("tire_pressure", "tpms", "valve_stem", "tire"),
            quiz = LearnQuiz(
                question = "Where do you find the pressure your tires should have?",
                options = listOf(
                    "On the sticker in the driver's door frame or in your manual",
                    "On the tire sidewall, because that is the correct number",
                    "It is always the same for every car"
                ),
                answerIndex = 0,
                explanation = "The sidewall number is the tire's maximum. The car maker's number for your car is on the door sticker and in the manual."
            ),
            level = "Beginner",
            minutes = 10
        ),

        MaintenanceGuide(
            id = "tread_depth_check",
            topicId = "tires",
            title = "Checking tread depth",
            summary = "Is there enough rubber left to grip?",
            overview = "Tread is the pattern of grooves on the tire that grips the road and pushes water out of the way. Checking tread depth tells you how much life the tire has left.",
            whyItMatters = "Worn tread cannot clear water well, so the car can slide or aquaplane in the rain. Stopping distances also get longer as tread wears down.",
            whenToDo = "Once a month together with your pressure check, and before any long trip or the rainy season.",
            tools = listOf(
                "A tread depth gauge, which is cheap and easy to find",
                "Or a coin, if you do not have a gauge",
                "A flashlight"
            ),
            steps = listOf(
                "Park on level ground and, if you can, turn the steering so the front tire tread faces out.",
                "Look for the wear bars. These are small raised bars in the bottom of the main grooves. If the tread is level with them, the tire is worn out.",
                "Push the gauge pin into a main groove until the base sits flat on the tread, then read the depth.",
                "Measure in a few places across the tire: inner edge, middle and outer edge.",
                "Compare the readings. If one side is lower than the rest, the tire is wearing unevenly.",
                "Repeat on all four tires.",
                "Rules differ between countries, and many places set the legal minimum at about 1.6 mm. Most experts suggest replacing tires sooner, especially for wet roads."
            ),
            watchFor = listOf(
                "Tread level with the wear bars",
                "One edge more worn than the other",
                "A worn patch in the middle",
                "Scalloped or cupped patches around the tire",
                "Cracks or cuts between the tread blocks"
            ),
            seeMechanic = listOf(
                "The tread is at or near the wear bars",
                "Wear is uneven, which often points to an alignment or suspension problem",
                "You feel vibration or the car pulls to one side",
                "You are unsure whether a tire is still safe to use"
            ),
            safety = "Do not keep driving on bald tires, especially in the rain. If the tread is gone, replace the tire before you drive further.",
            relatedPartIds = listOf("tread", "tread_wear_damage", "wheel_alignment", "wheel_balancing"),
            quiz = LearnQuiz(
                question = "Tread is worn more on the outer edge of one tire than the rest. What is a likely cause?",
                options = listOf(
                    "Alignment or suspension that is off",
                    "The tire is brand new",
                    "Nothing, this is normal"
                ),
                answerIndex = 0,
                explanation = "Uneven wear usually means the wheel is not sitting or rolling straight, so the alignment and suspension should be checked."
            ),
            level = "Beginner",
            minutes = 10
        ),

        MaintenanceGuide(
            id = "tire_rotation",
            topicId = "tires",
            title = "Rotating your tires",
            summary = "Move tires around so they wear evenly",
            overview = "Tire rotation means moving each tire to a different position on the car, for example front to back. Front and rear tires wear differently, so swapping them spreads the wear out.",
            whyItMatters = "Rotating helps all four tires wear at a similar rate, so they last longer and the car handles more evenly.",
            whenToDo = "At the interval in your owner's manual, and often at the same time as an oil change. Many shops also do it when they check your tires.",
            tools = listOf(
                "A jack that suits your car",
                "Jack stands, never just a jack",
                "A lug wrench or a breaker bar",
                "A torque wrench",
                "Wheel chocks",
                "Your owner's manual, for the rotation pattern and torque"
            ),
            steps = listOf(
                "Check your manual for the rotation pattern. It depends on whether the car is front wheel, rear wheel or all wheel drive, and on the type of tire.",
                "Park on firm, level ground. Apply the parking brake and chock the wheels that stay on the ground.",
                "Loosen the lug nuts on the wheels a little while the car is still on the ground. Do not remove them yet.",
                "Lift the car using the jacking points in your manual and support it on jack stands.",
                "Remove the wheels and swap them as the pattern says.",
                "Put each wheel back on and tighten the lug nuts by hand first.",
                "Lower the car and tighten the nuts in a star pattern to the torque in your manual.",
                "Check the tire pressure, because front and rear tires may need different pressures.",
                "Check the lug nuts again after the first short drive."
            ),
            watchFor = listOf(
                "Directional tires, which have an arrow showing rolling direction and must keep turning the same way",
                "Front and rear tires of different sizes, which cannot be swapped front to back",
                "A tire that has a bulge or cut when you take it off",
                "Rust or damage on the wheel studs or nuts",
                "Vibration after the rotation"
            ),
            seeMechanic = listOf(
                "You do not have a safe, flat place to lift the car",
                "A lug nut is stuck or the stud is damaged",
                "The car vibrates after rotation, which may mean the wheels need balancing",
                "Your car has a tire pressure system that needs to be reset"
            ),
            safety = "Never get under a car or put any part of your body under it while it is held up by a jack alone. Use jack stands on firm, level ground. Over or under tightened lug nuts can let a wheel come loose, so follow the torque in your manual.",
            relatedPartIds = listOf("tire_rotation", "lug_nuts", "wheel_balancing", "tread", "wheel_hub"),
            quiz = LearnQuiz(
                question = "In what order should you tighten the lug nuts?",
                options = listOf(
                    "In a star pattern, to the torque in your manual",
                    "Around the wheel in a circle, as tight as you can",
                    "Only one nut, because the rest do not matter"
                ),
                answerIndex = 0,
                explanation = "A star pattern pulls the wheel on evenly, and the right torque keeps the nuts from loosening or damaging the studs."
            ),
            level = "Intermediate",
            minutes = 45
        ),

        MaintenanceGuide(
            id = "tire_damage_inspection",
            topicId = "tires",
            title = "Spotting tire damage",
            summary = "Cuts, bulges, nails and cracks",
            overview = "A quick walk around the car lets you spot damage to the sidewall and tread before it turns into a flat or a blowout. You only need your eyes, your hands and a flashlight.",
            whyItMatters = "Tire damage often gets worse while you drive. Finding a nail, bulge or crack early can save the tire, or save you from a dangerous failure on the road.",
            whenToDo = "Whenever you check your pressure, after hitting a pothole or curb, and before long trips.",
            tools = listOf(
                "A flashlight",
                "A pen or small tool to point at objects, never to dig at them",
                "A rag"
            ),
            steps = listOf(
                "Park on level ground and walk slowly around the car.",
                "Look at each sidewall for cuts, scrapes, cracks, bumps or bulges.",
                "Run your hand gently over the tread and sidewall, being careful of sharp objects, and feel for anything unusual.",
                "Check the tread for nails, screws, stones or pieces of glass stuck in it.",
                "Look for cracks in the rubber, especially in the grooves and around the valve.",
                "Check each valve cap is in place and the valve is not bent or leaking.",
                "Look at the inside edge of the tires, which are easy to miss.",
                "If you find something, mark it with chalk or a photo and check the tire pressure."
            ),
            watchFor = listOf(
                "A bulge or bubble on the sidewall",
                "Deep cuts or cord showing through the rubber",
                "A nail or screw in the tread",
                "Cracks, dry rot or flaking rubber",
                "Uneven wear patterns",
                "A tire that keeps losing air"
            ),
            seeMechanic = listOf(
                "Any bulge or bubble in the sidewall, which means the tire is weak and should be replaced",
                "A cut deep enough to see fabric or cord",
                "A nail in the sidewall or near the edge of the tread, which often cannot be repaired",
                "Cracks or dry rot on an older tire",
                "You hit something hard and the car now pulls or vibrates"
            ),
            safety = "Do not remove a nail or screw if the tire is holding air and you have a way to get to a shop. Pulling it out can let the air out quickly. Never drive on a tire with a bulge.",
            relatedPartIds = listOf("sidewall", "tread", "tread_wear_damage", "tire_pressure"),
            quiz = LearnQuiz(
                question = "You find a bulge on the side of a tire. What should you do?",
                options = listOf(
                    "Stop using the tire and have it replaced",
                    "Ignore it, because it is only cosmetic",
                    "Add more air to make it go away"
                ),
                answerIndex = 0,
                explanation = "A bulge means the inside structure of the tire has failed and it can burst without warning."
            ),
            level = "Beginner",
            minutes = 10
        ),

        MaintenanceGuide(
            id = "spare_tire_check",
            topicId = "tires",
            title = "Checking your spare tire",
            summary = "Be ready before you need it",
            overview = "The spare tire is only useful if it is inflated and you have the tools to fit it. A quick check every few months means you are ready when you get a flat.",
            whyItMatters = "Many people find out their spare is flat only when they have a flat tire. Checking ahead saves a long wait on the roadside.",
            whenToDo = "Every few months, together with your pressure check, and before long trips.",
            tools = listOf(
                "A tire pressure gauge",
                "An air pump",
                "The jack, wheel wrench and any other tools that came with the car",
                "Your owner's manual"
            ),
            steps = listOf(
                "Find where the spare is kept. It is often under the trunk floor, under the car or on the back door.",
                "Take it out and look at it for cracks, cuts and dry rot.",
                "Check the pressure. Spares often need a higher pressure than normal tires, so follow the number on the spare or in your manual.",
                "Add air if it is low.",
                "Make sure the jack, wheel wrench and any locking wheel nut key are all there.",
                "Check that the jack works and that you know where the jacking points are.",
                "Put everything back neatly and make sure the spare is held tight so it does not rattle."
            ),
            watchFor = listOf(
                "A flat or soft spare",
                "A spare that is very old or cracked",
                "Missing jack or wrench",
                "A locking wheel nut with no key",
                "A temporary spare, which usually has a speed and distance limit"
            ),
            seeMechanic = listOf(
                "The spare is damaged or very old",
                "The jack or tools are missing or broken",
                "You cannot find the locking nut key",
                "You are not sure how to fit or lift the car safely"
            ),
            safety = "A temporary spare, often called a donut, is only meant for a short trip at a lower speed. Check the limits printed on it or in your manual, and get the real tire fixed or replaced soon. Change a tire only on firm, flat ground, well away from traffic.",
            relatedPartIds = listOf("spare_tire", "tire_pressure", "lug_nuts"),
            quiz = LearnQuiz(
                question = "When is the best time to find out your spare tire is flat?",
                options = listOf(
                    "During a routine check at home",
                    "When you get a flat on the highway",
                    "It does not matter"
                ),
                answerIndex = 0,
                explanation = "Checking ahead of time means a flat tire is an inconvenience, not a long wait."
            ),
            level = "Beginner",
            minutes = 10
        )
    )
}