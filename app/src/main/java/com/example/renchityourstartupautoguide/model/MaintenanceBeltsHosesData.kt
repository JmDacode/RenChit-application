package com.example.renchityourstartupautoguide.model

object MaintenanceBeltsHosesData {

    val guides = listOf(

        MaintenanceGuide(
            id = "drive_belt_inspection",
            topicId = "belts_hoses",
            title = "Inspecting the drive belt",
            summary = "Look for cracks, fraying and glazing",
            overview = "The drive belt, often called the serpentine belt, is a long rubber belt that runs from the engine to things like the alternator, water pump and air conditioning compressor. Inspecting it means looking at the surface for wear.",
            whyItMatters = "If the belt snaps, the battery stops charging, the engine can overheat and power steering may become heavy. A quick look can catch a worn belt before it fails.",
            whenToDo = "Every few months, at each service, and any time you hear squealing from the engine.",
            tools = listOf(
                "A flashlight",
                "A rag",
                "Your owner's manual, to find the belt and its routing"
            ),
            steps = listOf(
                "Switch the engine off, take the key out and let the engine cool.",
                "Open the hood and find the belt. It is usually at the side of the engine, running around several pulleys.",
                "Shine the flashlight along the belt and look at the ribbed side where it grips the pulleys.",
                "Look for cracks across the ribs. A few tiny cracks can be normal on older belts, but deep or many cracks mean it is worn.",
                "Look for fraying edges, missing chunks, peeling layers and shiny, smooth patches called glazing.",
                "Check for oil, coolant or grease on the belt, which can make it slip and break down faster.",
                "Press the belt gently between two pulleys. It should feel firm with only a little give, not loose and floppy.",
                "Look at the pulleys for wobble, rust or damage."
            ),
            watchFor = listOf(
                "Cracks across the ribs",
                "Frayed or split edges",
                "Shiny, glazed or hardened surface",
                "Oil or coolant on the belt",
                "A belt that looks loose or sags",
                "Squealing noises when starting or turning the steering wheel"
            ),
            seeMechanic = listOf(
                "The belt has deep cracks, missing ribs or frayed edges",
                "The belt is loose or the tensioner looks damaged",
                "There is oil or coolant on the belt, because the leak needs fixing too",
                "The battery light comes on, the engine overheats or the steering gets heavy",
                "You hear squealing that does not go away"
            ),
            safety = "Do the check with the engine off and the key out. A belt can start moving without warning if the engine is turned over, and some cooling fans can switch on by themselves even when the engine is off, so keep hands, hair and loose clothes away from the belt and fan.",
            relatedPartIds = listOf("serpentine_belt", "belt_tensioner", "alternator", "water_pump"),
            quiz = LearnQuiz(
                question = "Which of these is a sign that a drive belt is worn?",
                options = listOf(
                    "Cracks across the ribs or a shiny, glazed surface",
                    "A clean, matte surface with no marks",
                    "A belt that is slightly warm after driving"
                ),
                answerIndex = 0,
                explanation = "Cracks and glazing show the rubber has hardened and lost grip, so the belt is near the end of its life."
            ),
            level = "Beginner",
            minutes = 10
        ),

        MaintenanceGuide(
            id = "belt_squeal_causes",
            topicId = "belts_hoses",
            title = "Why a belt squeals",
            summary = "Making sense of engine bay noises",
            overview = "A squeal from the engine, especially when you start the car, turn the wheel or switch on the air conditioning, is often a belt slipping on a pulley. Knowing the common causes helps you decide what to do next.",
            whyItMatters = "A squeal is the car telling you something is off. Ignoring it can lead to a belt that wears out quickly or breaks.",
            whenToDo = "Any time you hear a squeal, chirp or whine from the front of the engine.",
            tools = listOf(
                "A flashlight",
                "Your ears",
                "Your owner's manual"
            ),
            steps = listOf(
                "Note when the sound happens: at cold start, when turning the steering wheel, when the air conditioning is on, or all the time.",
                "Switch the engine off and look at the belt for cracks, glazing, fraying or contamination with oil or coolant.",
                "Check that the belt looks tight and not sagging between pulleys.",
                "Look at the tensioner, the spring-loaded pulley that keeps the belt tight, for movement, leaks or damage.",
                "Check that the pulleys are lined up with the belt and spin smoothly when the engine is off. Do not turn them by hand while the engine is running.",
                "Notice if the noise gets worse in wet weather. A squeal that goes away when the belt warms up often points to a worn or glazed belt.",
                "Have the belt, tensioner and pulleys looked at, especially if the noise returns."
            ),
            watchFor = listOf(
                "A squeal at startup that fades after a minute",
                "A squeal when the steering is turned to full lock",
                "Noise that changes when the air conditioning turns on",
                "A grinding or rumbling sound from the pulleys",
                "Battery or temperature warning lights"
            ),
            seeMechanic = listOf(
                "The noise continues after a short drive",
                "The belt looks worn or loose",
                "You hear grinding or rumbling, which may be a failing pulley or bearing",
                "The battery or temperature light comes on",
                "You are not sure which part is making the noise"
            ),
            safety = "Never put your hands near the belt or pulleys while the engine is running. Do not spray belt dressing or lubricants on a running belt as a quick fix, because it hides the problem and can make the belt wear out faster.",
            relatedPartIds = listOf("serpentine_belt", "belt_tensioner", "alternator", "power_steering_pump"),
            quiz = LearnQuiz(
                question = "A squeal that only happens when you turn the steering wheel fully might point to what?",
                options = listOf(
                    "A slipping belt, as the power steering pump adds load",
                    "The tires being too new",
                    "A full washer fluid tank"
                ),
                answerIndex = 0,
                explanation = "Turning the wheel to full lock puts extra load on the belt, so a worn or loose belt slips and squeals."
            ),
            level = "Beginner",
            minutes = 10
        ),

        MaintenanceGuide(
            id = "timing_belt_awareness",
            topicId = "belts_hoses",
            title = "Timing belt basics",
            summary = "Know if you have one and when it is due",
            overview = "A timing belt keeps the engine's moving parts working in step. Some engines use a timing belt and others use a metal timing chain. This guide helps you find out which one you have and why it matters.",
            whyItMatters = "A timing belt that snaps can seriously damage the engine, and the repair can cost far more than replacing the belt on time. Many engines are affected, so it is worth knowing your car.",
            whenToDo = "Look up your timing belt interval in your owner's manual now, and keep track of it. Replacement is done by a mechanic at the interval listed, by distance or by time.",
            tools = listOf(
                "Your owner's manual or service book",
                "Your service records",
                "A phone, to ask a trusted shop"
            ),
            steps = listOf(
                "Open your owner's manual and find the section on the timing belt or timing chain.",
                "Check whether your engine has a belt or a chain. Chains usually last much longer and often need no scheduled replacement.",
                "If you have a belt, write down the replacement interval for distance and for time. Use whichever comes first.",
                "Check your service records for when the belt was last changed.",
                "If you bought the car used and there is no record, ask a shop to inspect it or assume it is due.",
                "Plan the replacement ahead of time. Ask the shop whether the water pump, tensioner and other parts should be changed with the belt.",
                "Keep a note in your phone or logbook with the next due date and mileage."
            ),
            watchFor = listOf(
                "A timing belt past its replacement interval",
                "No service records on a used car",
                "Ticking or rattling noises from the front of the engine",
                "Oil or coolant leaking near the timing cover",
                "An engine that suddenly misfires or will not start"
            ),
            seeMechanic = listOf(
                "You are not sure of your belt's age or history",
                "The interval is close or already passed",
                "You hear unusual noises from the timing area",
                "The engine stalls and will not restart, and do not keep cranking it"
            ),
            safety = "Do not try to inspect or replace a timing belt yourself unless you are trained. It is hidden behind covers, and a mistake can wreck the engine. If a timing belt is suspected of failing, stop driving and get the car checked.",
            relatedPartIds = listOf("timing_belt", "timing_chain", "water_pump", "belt_tensioner"),
            quiz = LearnQuiz(
                question = "Why is it important to change a timing belt on schedule?",
                options = listOf(
                    "If it breaks, the engine can be badly damaged",
                    "It makes the car look nicer",
                    "It only affects the radio"
                ),
                answerIndex = 0,
                explanation = "A snapped timing belt can leave pistons and valves out of step, which may cause expensive engine damage."
            ),
            level = "Beginner",
            minutes = 10
        ),

        MaintenanceGuide(
            id = "coolant_hose_inspection",
            topicId = "belts_hoses",
            title = "Inspecting radiator and coolant hoses",
            summary = "Squeeze, look and check for leaks",
            overview = "Rubber hoses carry coolant between the engine, radiator and heater. Over time they can crack, swell or go soft. Inspecting them means looking and gently feeling for problems, on a cold engine.",
            whyItMatters = "A hose that bursts can dump coolant quickly and cause the engine to overheat. Catching a weak hose early is much cheaper than a tow and engine repair.",
            whenToDo = "Every few months, before long trips and at each service.",
            tools = listOf(
                "A flashlight",
                "A rag",
                "Gloves",
                "Your owner's manual"
            ),
            steps = listOf(
                "Make sure the engine is completely cold and switched off.",
                "Open the hood and find the large hoses running from the radiator to the engine, plus the smaller heater hoses.",
                "Look along each hose for cracks, bulges, shiny worn spots or splits.",
                "Look at the ends where the hose meets a connection. Check the clamps for rust, looseness or crusty residue.",
                "Gently squeeze each hose by hand. It should feel firm but flexible. Very soft, spongy, hard or crunchy hoses are worn.",
                "Look for wet spots, drips or dried coolant stains on or around the hoses.",
                "Look under the car where you park for puddles.",
                "Check the coolant level in the reservoir while you are there."
            ),
            watchFor = listOf(
                "Cracks, bulges or soft spots",
                "White, green or colored crust at hose ends",
                "Wet spots or drips",
                "A sweet smell after driving",
                "Coolant level dropping over time",
                "Hoses that rub on other parts"
            ),
            seeMechanic = listOf(
                "Any hose is cracked, bulging or leaking",
                "A clamp is loose or rusted through",
                "You smell coolant or see steam",
                "The coolant keeps dropping",
                "The engine overheats"
            ),
            safety = "Only squeeze hoses when the engine is cold. Hot hoses are under pressure and can cause serious burns. Never open the radiator cap or the reservoir cap on a hot engine, and keep coolant away from pets and children because it is poisonous.",
            relatedPartIds = listOf("radiator_hose", "heater_hose", "radiator", "coolant_reservoir", "hose_clamp"),
            quiz = LearnQuiz(
                question = "When is it safe to squeeze and inspect coolant hoses?",
                options = listOf(
                    "When the engine is completely cold",
                    "Right after a long drive",
                    "While the engine is running hot"
                ),
                answerIndex = 0,
                explanation = "A hot cooling system is under pressure and can cause burns, so always wait until the engine has cooled."
            ),
            level = "Beginner",
            minutes = 10
        ),

        MaintenanceGuide(
            id = "hose_leak_check",
            topicId = "belts_hoses",
            title = "Finding hose and fluid leaks",
            summary = "Read the puddle under your car",
            overview = "Hoses carry coolant, fuel, air and other fluids around the car. A leak is often easy to spot if you know what to look for, and the color of the puddle gives a good clue about where it came from.",
            whyItMatters = "Small leaks often get bigger. Finding one early can prevent overheating, a fire risk or a breakdown.",
            whenToDo = "Whenever you notice a spot where you parked, a strange smell, or a low fluid level, and as part of your regular checks.",
            tools = listOf(
                "A flashlight",
                "A sheet of white paper or cardboard",
                "A rag",
                "Gloves"
            ),
            steps = listOf(
                "Park on a clean, dry surface and slide a sheet of white paper or cardboard under the engine area overnight.",
                "Look at the paper in the morning. Note the color, how much there is and where it is.",
                "Match the color to the likely source. Green, pink, orange or blue is often coolant. Brown or black is often engine oil. Red or pinkish can be transmission or power steering fluid. Clear and watery is often air conditioning condensation and is usually harmless.",
                "Open the hood and look around the hoses, clamps and connections for wet spots or residue.",
                "Check the fluid levels for the fluid you suspect is leaking.",
                "Smell for coolant, which is sweet, or fuel, which smells like gasoline.",
                "Take a photo of the leak and the paper, and show it to a mechanic if you are unsure."
            ),
            watchFor = listOf(
                "A puddle that grows over time",
                "A sweet smell, which suggests coolant",
                "A fuel smell, which is more urgent",
                "Fluid levels that drop between checks",
                "Steam or smoke from under the hood"
            ),
            seeMechanic = listOf(
                "You see or smell fuel leaking",
                "Brake fluid is leaking",
                "The leak is large or getting worse",
                "You cannot tell where it is coming from",
                "A warning light is on together with the leak"
            ),
            safety = "A fuel leak is a fire risk. Do not start the engine or smoke nearby, and get the car checked. Do not drive with a brake fluid leak. Keep any fluid away from your skin and eyes, and from pets and children.",
            relatedPartIds = listOf("radiator_hose", "heater_hose", "fuel_line", "hose_clamp", "coolant_reservoir"),
            quiz = LearnQuiz(
                question = "You find a sweet-smelling green puddle under the front of the car. What is it most likely to be?",
                options = listOf(
                    "Coolant",
                    "Washer fluid",
                    "Fresh water from the air conditioning"
                ),
                answerIndex = 0,
                explanation = "Coolant has a sweet smell and is often green, pink, orange or blue, so it points to a cooling system leak."
            ),
            level = "Beginner",
            minutes = 10
        )
    )
}