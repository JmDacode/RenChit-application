package com.example.renchityourstartupautoguide.model

object MaintenanceBatteryData {

    val guides = listOf(

        MaintenanceGuide(
            id = "battery_visual_check",
            topicId = "battery",
            title = "Inspecting your battery",
            summary = "A two-minute look under the hood",
            overview = "A battery inspection is a quick visual check of the battery case, the terminals and the cables. You are looking for damage, leaks, corrosion and anything loose.",
            whyItMatters = "A weak or damaged battery is one of the most common reasons a car will not start. Most problems show up as visible warning signs well before the battery fails.",
            whenToDo = "Once a month, before long trips, and before hot or cold seasons, since extreme weather is hard on batteries.",
            tools = listOf(
                "A flashlight",
                "A rag",
                "Gloves and eye protection"
            ),
            steps = listOf(
                "Park, switch the engine off and open the hood.",
                "Find the battery. It is usually near the front corner of the engine bay, though some cars hide it in the trunk or under a seat.",
                "Look at the case. It should not be cracked, bulging or leaking.",
                "Look at the two terminals, the metal posts with the cables attached. They should be clean and free of white, blue or green crust.",
                "Gently try to wiggle each cable clamp by hand. They should not move at all.",
                "Check that the battery is held down firmly by its bracket and does not slide around.",
                "Look at the cables for cracks, fraying or melted insulation.",
                "If your battery has a built-in indicator window, check the color against the label on the battery."
            ),
            watchFor = listOf(
                "A swollen or cracked battery case",
                "Crusty buildup on the terminals",
                "Loose cable clamps",
                "A battery that moves in its tray",
                "A rotten egg smell near the battery",
                "A battery that is several years old"
            ),
            seeMechanic = listOf(
                "The case is bulging, cracked or leaking",
                "You smell rotten eggs near the battery",
                "Cables are frayed, melted or badly corroded",
                "The car is slow to start even though the battery looks fine",
                "The battery is older than a few years and you are not sure of its health"
            ),
            safety = "Batteries contain acid and give off flammable gas. Keep sparks, flames and cigarettes away. Wear eye protection and gloves, and never lean over the battery while working near it. Take off rings and metal jewelry, because metal across the terminals can cause burns.",
            relatedPartIds = listOf("battery", "battery_terminals", "battery_cables", "alternator"),
            quiz = LearnQuiz(
                question = "You see a swollen battery case. What should you do?",
                options = listOf(
                    "Have it checked and replaced, and avoid jump starting it",
                    "Ignore it, because swelling is normal",
                    "Keep using it until it stops working"
                ),
                answerIndex = 0,
                explanation = "A swollen case means the battery is damaged inside and can leak or fail dangerously."
            ),
            level = "Beginner",
            minutes = 5
        ),

        MaintenanceGuide(
            id = "clean_battery_terminals",
            topicId = "battery",
            title = "Cleaning battery terminals",
            summary = "Remove the crust for a good connection",
            overview = "Over time, a white, blue or green crust can build up on the battery terminals. It blocks electricity from flowing well. Cleaning it takes a little time and a few basic items.",
            whyItMatters = "Corroded terminals can cause slow starting, dim lights and a battery that does not charge properly, even when the battery itself is healthy.",
            whenToDo = "Whenever you see buildup on the terminals, and as part of a monthly look at the battery.",
            tools = listOf(
                "Baking soda and water",
                "An old toothbrush or a terminal brush",
                "A wrench or socket that fits the terminal clamps",
                "Clean rags",
                "Petroleum jelly or terminal protector spray",
                "Gloves and eye protection"
            ),
            steps = listOf(
                "Switch the engine off, remove the key and make sure everything electrical is off.",
                "Loosen the clamp on the negative terminal first. It is marked with a minus sign and is often black. Lift the cable off and tuck it away from the terminal.",
                "Loosen and remove the positive clamp, which has a plus sign and is often red.",
                "Mix a spoonful of baking soda with a little water to make a paste.",
                "Scrub the terminals and the insides of the clamps with the brush and paste. It will fizz as it reacts with the crust.",
                "Wipe everything clean with a damp rag, then dry with a fresh rag.",
                "Reconnect the positive clamp first and tighten it.",
                "Reconnect the negative clamp last and tighten it.",
                "Apply a thin coat of petroleum jelly or terminal spray to slow future buildup.",
                "Check that both clamps are firm and cannot be twisted by hand."
            ),
            watchFor = listOf(
                "Corrosion that returns quickly",
                "A clamp that will not tighten",
                "A cracked or stretched cable end",
                "Clamps that touch the wrong terminal or the metal around it",
                "Radio or clock settings that reset after reconnecting, which is normal on many cars"
            ),
            seeMechanic = listOf(
                "The terminals or clamps are badly eaten away",
                "Corrosion keeps coming back fast, which can mean the battery is leaking or overcharging",
                "The car will not start after you reconnect the battery",
                "Your car has a battery monitoring system or needs a reset after disconnecting"
            ),
            safety = "Always disconnect the negative terminal first and reconnect it last. This lowers the chance of sparks and short circuits. Never let a wrench touch both terminals at once. Keep baking soda paste out of your eyes, and wear gloves, since the crust can irritate skin.",
            relatedPartIds = listOf("battery_terminals", "battery", "battery_cables"),
            quiz = LearnQuiz(
                question = "Which cable do you disconnect first when working on a battery?",
                options = listOf(
                    "The negative cable",
                    "The positive cable",
                    "It does not matter"
                ),
                answerIndex = 0,
                explanation = "Taking the negative off first means a slipped wrench cannot complete a circuit through the car's body."
            ),
            level = "Beginner",
            minutes = 15
        ),

        MaintenanceGuide(
            id = "battery_warning_signs",
            topicId = "battery",
            title = "Signs of a weak battery",
            summary = "What the car tells you before it fails",
            overview = "Batteries usually give hints before they stop working. Knowing these signs helps you replace the battery on your own schedule instead of being stranded.",
            whyItMatters = "A battery that dies while you are away from home can leave you stuck. Catching it early is cheaper and far less stressful.",
            whenToDo = "Pay attention every time you start the car, and run through this list if the car acts differently on cold mornings or after sitting for a few days.",
            tools = listOf(
                "Your eyes, ears and a little attention",
                "A multimeter, if you want to measure voltage (see the voltage guide)"
            ),
            steps = listOf(
                "Listen to the engine when you start it. A slow, dragging crank is the most common early sign.",
                "Watch the headlights and dashboard lights when you turn the key. If they dim a lot while cranking, the battery may be weak.",
                "Notice if you hear clicking instead of the engine turning over.",
                "Look at the dashboard for the battery or charging warning light.",
                "Check how old the battery is. The date is often on a sticker on the battery. Many batteries last a few years, but heat and short trips shorten that.",
                "Look at the terminals and case for corrosion or swelling.",
                "Notice whether electrical items, such as the radio, windows or lights, act weak or reset on their own.",
                "If you suspect a problem, have the battery tested at a shop. Many do it for free."
            ),
            watchFor = listOf(
                "Slow cranking when starting",
                "Clicking sound and no start",
                "Dim headlights, especially at idle",
                "The battery or charging light on the dashboard",
                "A battery older than a few years",
                "Frequent need to jump start the car",
                "Corrosion or a swollen case"
            ),
            seeMechanic = listOf(
                "The car needs a jump start more than once",
                "The battery warning light stays on while driving, which can point to the alternator",
                "The car starts fine, then dies soon after",
                "You are not sure whether it is the battery, starter or alternator"
            ),
            safety = "If the battery light comes on while you drive, the car is running on battery power only. Turn off extra electrical items and head straight to a safe place or a shop, because the engine can stall when the battery runs out.",
            relatedPartIds = listOf("battery", "alternator", "starter_motor", "battery_terminals"),
            quiz = LearnQuiz(
                question = "Which of these is a common early sign of a weakening battery?",
                options = listOf(
                    "A slow, dragging crank when starting",
                    "Tires wearing evenly",
                    "A clean windshield"
                ),
                answerIndex = 0,
                explanation = "As a battery weakens, it cannot turn the starter motor as quickly, so the engine cranks slowly."
            ),
            level = "Beginner",
            minutes = 5
        ),

        MaintenanceGuide(
            id = "jump_start_car",
            topicId = "battery",
            title = "Jump starting a car",
            summary = "Safely start a dead battery",
            overview = "Jump starting uses a second car's battery, and a pair of jumper cables, to give your dead battery enough power to start the engine. Done correctly it is safe and quick.",
            whyItMatters = "A flat battery is common, and knowing the right order of cables avoids sparks, damage to electronics and injury.",
            whenToDo = "Only when the car will not start because the battery is flat and the battery itself is not damaged.",
            tools = listOf(
                "Jumper cables in good condition",
                "A second car with a healthy battery of the same voltage",
                "Gloves and eye protection",
                "Your owner's manual, for the jump start points"
            ),
            steps = listOf(
                "Read your manual. Some cars have special jump start terminals under the hood.",
                "Park the helper car close enough for the cables to reach, but do not let the cars touch. Switch both engines off and apply the parking brakes.",
                "Connect one red clamp to the positive terminal, marked with a plus, on the dead battery.",
                "Connect the other red clamp to the positive terminal of the good battery.",
                "Connect one black clamp to the negative terminal of the good battery.",
                "Connect the last black clamp to a clean, unpainted metal part of the dead car's engine or frame, away from the battery. Do not connect it to the dead battery's negative terminal.",
                "Start the helper car and let it run for a few minutes.",
                "Try to start the dead car. If it does not start, wait a few more minutes and try again.",
                "Once it starts, remove the clamps in the reverse order: black from the metal part, black from the good battery, red from the good battery, red from the dead battery.",
                "Keep the engine running or drive for a while so the alternator can recharge the battery, then get the battery tested."
            ),
            watchFor = listOf(
                "Clamps touching each other while connected",
                "Cables connected in the wrong order",
                "A battery that is leaking, cracked or frozen",
                "The car starting and then dying again soon",
                "Warning lights that stay on after the jump"
            ),
            seeMechanic = listOf(
                "The battery is cracked, swollen or leaking, so do not jump start it",
                "The car still will not start after several tries",
                "The car dies again right after you remove the cables",
                "Your car is a hybrid or electric vehicle, or the manual says not to jump start it",
                "You are not sure of the right terminals"
            ),
            safety = "Batteries can release explosive gas, so never connect the final clamp to the dead battery's negative terminal, and keep sparks and flames away. Wear eye protection. Never jump start a frozen, cracked or leaking battery. Do not let the clamps touch each other or any moving parts.",
            relatedPartIds = listOf("battery", "alternator", "battery_terminals", "starter_motor"),
            quiz = LearnQuiz(
                question = "Where should the last black clamp be attached on the dead car?",
                options = listOf(
                    "A clean, unpainted metal part away from the battery",
                    "The negative terminal of the dead battery",
                    "The positive terminal of the dead battery"
                ),
                answerIndex = 0,
                explanation = "Any spark from the final connection should happen away from the battery, where gas can collect."
            ),
            level = "Intermediate",
            minutes = 15
        ),

        MaintenanceGuide(
            id = "battery_voltage_test",
            topicId = "battery",
            title = "Testing battery voltage",
            summary = "Use a multimeter to see its health",
            overview = "A multimeter measures the voltage of the battery. A quick reading with the engine off, and another with the engine running, tells you whether the battery is holding a charge and the alternator is charging it.",
            whyItMatters = "A voltage test turns a guess into a number, so you know whether to charge, clean or replace the battery.",
            whenToDo = "When the car is slow to start, before a long trip, or if you want to track the battery's health once or twice a year.",
            tools = listOf(
                "A digital multimeter",
                "Gloves and eye protection",
                "A rag"
            ),
            steps = listOf(
                "Switch the engine off and, if you can, let the car sit for a few hours, so the reading is not skewed by a recent drive.",
                "Set the multimeter to DC volts, at a range above 15 volts. Some meters mark this as 20V.",
                "Touch the red probe to the positive terminal and the black probe to the negative terminal.",
                "Read the number. A healthy, fully charged battery usually reads about 12.6 volts.",
                "A reading around 12.4 is partly charged. At about 12.0 or lower, the battery is quite flat.",
                "Start the car and read the voltage again with the engine running. It typically sits between about 13.7 and 14.7 volts, which shows the alternator is charging.",
                "Switch the engine off and remove the probes."
            ),
            watchFor = listOf(
                "A resting reading well below about 12.4 volts",
                "A reading with the engine running that is no higher than the resting one",
                "A reading above about 15 volts, which can mean overcharging",
                "A voltage that drops a lot when you start the car",
                "Probes touching each other or the wrong terminals"
            ),
            seeMechanic = listOf(
                "The resting voltage stays low even after the battery has been charged",
                "The voltage with the engine running is too low or too high",
                "The numbers look fine but the car still struggles to start",
                "You are not comfortable using a multimeter"
            ),
            safety = "Keep the probes from touching each other while they are on the battery, and never touch both terminals with metal tools. Wear eye protection and keep flames and sparks away from the battery.",
            relatedPartIds = listOf("battery", "alternator", "battery_terminals", "voltage_regulator"),
            quiz = LearnQuiz(
                question = "About what voltage does a healthy, fully charged battery show with the engine off?",
                options = listOf(
                    "About 12.6 volts",
                    "About 5 volts",
                    "About 24 volts"
                ),
                answerIndex = 0,
                explanation = "A car battery is rated at 12 volts but rests at about 12.6 volts when full."
            ),
            level = "Intermediate",
            minutes = 10
        )
    )
}