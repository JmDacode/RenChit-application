package com.example.renchityourstartupautoguide.model

object CoolingData {

    val groups = listOf(
        LearnGroup(
            id = "cooling_components",
            systemId = "cooling",
            title = "Components",
            intro = "The parts that move heat out of the engine and into the air."
        ),
        LearnGroup(
            id = "cooling_types",
            systemId = "cooling",
            title = "Types and designs",
            intro = "The different ways engines are kept cool."
        ),
        LearnGroup(
            id = "cooling_lessons",
            systemId = "cooling",
            title = "Lessons and problems",
            intro = "How the system works as a whole, what goes wrong, and how to check it."
        )
    )

    val parts = listOf(

        // ---------- Components ----------
        LearnPart(
            id = "radiator",
            systemId = "cooling",
            groupId = "cooling_components",
            name = "Radiator",
            summary = "Gets rid of the engine's heat",
            whatIs = "A heat exchanger that cools the hot coolant coming from the engine.",
            whatItDoes = listOf(
                "Lets air pass over thin fins and tubes full of coolant.",
                "Sends cooled coolant back to the engine."
            ),
            location = "At the very front of the engine bay, behind the grille.",
            relatedIds = listOf("water_pump", "radiator_cap", "cooling_fan", "radiator_hoses"),
            ifItFails = "Leaks, overheating, or low coolant.",
            maintenance = "Keep coolant at the right level, flush it on schedule, and keep the fins clear of dirt.",
            whyItMatters = "An overheated engine can warp parts and blow a head gasket.",
            quiz = LearnQuiz(
                question = "What does the radiator do?",
                options = listOf("Cools the coolant", "Heats the oil", "Stores the fuel"),
                answerIndex = 0,
                explanation = "It releases the engine's heat into the passing air."
            )
        ),

        LearnPart(
            id = "radiator_cap",
            systemId = "cooling",
            groupId = "cooling_components",
            name = "Radiator cap",
            summary = "Holds the pressure in",
            whatIs = "A spring-loaded cap that keeps the cooling system under pressure.",
            whatItDoes = listOf(
                "Raises the boiling point of the coolant.",
                "Releases extra pressure safely."
            ),
            location = "On the radiator or the coolant reservoir.",
            relatedIds = listOf("radiator", "coolant_reservoir", "pressurized_cooling"),
            ifItFails = "A weak cap can cause coolant loss and overheating.",
            maintenance = "Never open it when the engine is hot. Hot coolant can spray out and burn you.",
            quiz = LearnQuiz(
                question = "When is it safe to open the radiator cap?",
                options = listOf("When the engine is cold", "While driving", "Right after a long drive"),
                answerIndex = 0,
                explanation = "A hot, pressurized system can spray scalding coolant."
            )
        ),

        LearnPart(
            id = "water_pump",
            systemId = "cooling",
            groupId = "cooling_components",
            name = "Water pump",
            summary = "Circulates the coolant",
            whatIs = "A pump that moves coolant around the engine and radiator.",
            whatItDoes = listOf(
                "Pushes coolant through the engine passages.",
                "Is driven by a belt or by the timing belt, depending on the engine."
            ),
            location = "On the front of the engine block.",
            relatedIds = listOf("radiator", "thermostat", "water_jackets", "timing_belt", "water_pump_failure"),
            ifItFails = "Coolant leaks, a whining noise, or overheating.",
            maintenance = "On many engines it is replaced together with the timing belt.",
            quiz = LearnQuiz(
                question = "What does the water pump move?",
                options = listOf("Coolant", "Fuel", "Oil"),
                answerIndex = 0,
                explanation = "It circulates coolant through the engine and radiator."
            )
        ),

        LearnPart(
            id = "thermostat",
            systemId = "cooling",
            groupId = "cooling_components",
            name = "Thermostat",
            summary = "Opens when the engine is warm",
            whatIs = "A temperature-controlled valve in the cooling system.",
            whatItDoes = listOf(
                "Stays closed when the engine is cold so it warms up quickly.",
                "Opens when the engine is hot so coolant flows to the radiator."
            ),
            location = "In a housing where the upper radiator hose meets the engine.",
            relatedIds = listOf("radiator", "water_pump", "coolant_temp_sensor", "thermostat_regulation"),
            ifItFails = "Stuck closed: overheating. Stuck open: the engine takes a long time to warm up.",
            maintenance = "Replace it if the temperature gauge acts strangely.",
            quiz = LearnQuiz(
                question = "What does a stuck-closed thermostat cause?",
                options = listOf("Overheating", "Flat tires", "A dead battery"),
                answerIndex = 0,
                explanation = "Coolant cannot reach the radiator, so the engine overheats."
            )
        ),

        LearnPart(
            id = "cooling_fan",
            systemId = "cooling",
            groupId = "cooling_components",
            name = "Cooling fan",
            summary = "Pulls air through the radiator",
            whatIs = "A fan that moves air across the radiator, especially when the car is slow or stopped.",
            whatItDoes = listOf(
                "Cools the radiator when there is little natural airflow.",
                "Is usually electric, and turns on when needed."
            ),
            location = "Directly behind the radiator.",
            relatedIds = listOf("radiator", "coolant_temp_sensor", "electric_fan", "mechanical_fan"),
            ifItFails = "The engine overheats in traffic but is fine at highway speed.",
            maintenance = "Listen for it running when the engine is hot and the car is stopped.",
            quiz = LearnQuiz(
                question = "When does a failed cooling fan usually show up?",
                options = listOf("In slow traffic", "On a fast highway", "When parked"),
                answerIndex = 0,
                explanation = "At low speed there is not enough natural airflow."
            )
        ),

        LearnPart(
            id = "coolant_reservoir",
            systemId = "cooling",
            groupId = "cooling_components",
            name = "Coolant reservoir",
            summary = "The coolant top-up tank",
            whatIs = "A plastic tank that holds extra coolant for the system.",
            whatItDoes = listOf(
                "Catches coolant that expands when hot.",
                "Gives you an easy place to check the coolant level."
            ),
            location = "In the engine bay, near the radiator, with MIN and MAX marks.",
            relatedIds = listOf("radiator", "radiator_cap", "coolant_inspection"),
            ifItFails = "Cracks cause coolant leaks and low levels.",
            maintenance = "Check the level when the engine is cold, and top up with the coolant type your manual lists.",
            whyItMatters = "It is one of the easiest checks you can do yourself.",
            quiz = LearnQuiz(
                question = "When should you check the coolant level?",
                options = listOf("When the engine is cold", "When it is boiling", "Only at the shop"),
                answerIndex = 0,
                explanation = "A cold engine gives an accurate reading and is safe to handle."
            )
        ),

        LearnPart(
            id = "radiator_hoses",
            systemId = "cooling",
            groupId = "cooling_components",
            name = "Radiator hoses",
            summary = "Carry coolant to and from the radiator",
            whatIs = "Rubber hoses that connect the engine to the radiator.",
            whatItDoes = listOf(
                "The upper hose carries hot coolant to the radiator.",
                "The lower hose brings cooled coolant back."
            ),
            location = "Between the engine and the radiator.",
            relatedIds = listOf("radiator", "water_pump", "thermostat", "coolant_leaks"),
            ifItFails = "Soft, cracked or bulging hoses can burst and drain the coolant.",
            maintenance = "Squeeze them (when cold) and look for cracks, swelling or leaks.",
            quiz = LearnQuiz(
                question = "What can a bulging radiator hose mean?",
                options = listOf("It may burst soon", "The oil is fresh", "The tires are fine"),
                answerIndex = 0,
                explanation = "A weak hose can burst and cause overheating."
            )
        ),

        LearnPart(
            id = "heater_core",
            systemId = "cooling",
            groupId = "cooling_components",
            name = "Heater core",
            summary = "Makes the cabin heat",
            whatIs = "A small radiator inside the dashboard that uses hot coolant to warm the cabin air.",
            whatItDoes = listOf(
                "Takes heat from the coolant.",
                "Lets the fan blow warm air into the cabin."
            ),
            location = "Behind or under the dashboard.",
            relatedIds = listOf("radiator_hoses", "water_pump"),
            ifItFails = "A sweet smell, foggy windows, damp carpet, or no heat.",
            maintenance = "Keep coolant fresh and at the right level.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What warms the heater core?",
                options = listOf("Hot coolant", "Exhaust gas", "The battery"),
                answerIndex = 0,
                explanation = "Hot engine coolant flows through it."
            )
        ),

        LearnPart(
            id = "coolant_temp_sensor",
            systemId = "cooling",
            groupId = "cooling_components",
            name = "Coolant temperature sensor",
            summary = "Reads the engine's temperature",
            whatIs = "A sensor that measures the temperature of the coolant.",
            whatItDoes = listOf(
                "Sends the temperature to the dashboard gauge.",
                "Tells the engine computer when to turn on the fan and how to mix the fuel."
            ),
            location = "On the engine, near the thermostat housing.",
            relatedIds = listOf("thermostat", "cooling_fan"),
            ifItFails = "A wrong gauge reading, the fan running all the time, or hard cold starts.",
            maintenance = "Replace it if faulty. It is not a routine service.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What does this sensor measure?",
                options = listOf("Coolant temperature", "Tire pressure", "Fuel level"),
                answerIndex = 0,
                explanation = "It reports how hot the coolant is."
            )
        ),

        LearnPart(
            id = "water_jackets",
            systemId = "cooling",
            groupId = "cooling_components",
            name = "Engine water jackets",
            summary = "Coolant passages in the engine",
            whatIs = "Passages cast into the engine block and cylinder head that coolant flows through.",
            whatItDoes = listOf(
                "Carry coolant around the cylinders.",
                "Pull heat out of the hottest parts of the engine."
            ),
            location = "Inside the engine block and cylinder head, around the cylinders.",
            relatedIds = listOf("engine_block", "cylinder_head", "water_pump", "head_gasket"),
            ifItFails = "Blockages or cracks cause overheating and coolant leaks.",
            maintenance = "Fresh coolant on schedule keeps rust and deposits out.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What flows through the water jackets?",
                options = listOf("Coolant", "Engine oil", "Fuel"),
                answerIndex = 0,
                explanation = "Coolant flows through them to carry heat away."
            )
        ),

        // ---------- Types and designs ----------
        LearnPart(
            id = "liquid_cooled",
            systemId = "cooling",
            groupId = "cooling_types",
            name = "Liquid-cooled engines",
            summary = "Coolant carries the heat away",
            whatIs = "Engines that use liquid coolant pumped through passages and a radiator to remove heat. Most modern cars use this design.",
            whatItDoes = listOf(
                "Keeps the engine at a steady, efficient temperature.",
                "Lets the engine run quieter and cleaner than an air-cooled one."
            ),
            relatedIds = listOf("radiator", "water_pump", "air_cooled"),
            ifItFails = "Low coolant, leaks or a failed pump cause overheating.",
            maintenance = "Check the coolant level and replace the coolant on schedule.",
            quiz = LearnQuiz(
                question = "What carries heat away in a liquid-cooled engine?",
                options = listOf("Coolant", "Air only", "Engine oil only"),
                answerIndex = 0,
                explanation = "The coolant absorbs heat in the engine and releases it at the radiator."
            )
        ),

        LearnPart(
            id = "air_cooled",
            systemId = "cooling",
            groupId = "cooling_types",
            name = "Air-cooled engines",
            summary = "Metal fins and moving air",
            whatIs = "Engines with metal fins on the cylinders that release heat directly into the air. There is no radiator or coolant.",
            whatItDoes = listOf(
                "Use airflow, and sometimes a fan, to cool the fins.",
                "Are simpler and lighter, but harder to keep at a steady temperature."
            ),
            location = "Common on motorcycles, small engines, and some older cars.",
            relatedIds = listOf("liquid_cooled", "mechanical_fan"),
            ifItFails = "Blocked fins or a broken fan cause overheating.",
            maintenance = "Keep the fins clean and clear of mud and debris. Oil also helps cool these engines, so keep it fresh.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What does an air-cooled engine not have?",
                options = listOf("A radiator", "Cylinders", "Pistons"),
                answerIndex = 0,
                explanation = "It cools through fins in the air instead."
            )
        ),

        LearnPart(
            id = "mechanical_fan",
            systemId = "cooling",
            groupId = "cooling_types",
            name = "Mechanical cooling fans",
            summary = "A fan driven by the engine",
            whatIs = "A fan driven directly by the engine, usually by a belt, often with a fan clutch.",
            whatItDoes = listOf(
                "Spins faster as the engine speeds up.",
                "Uses a clutch that lets it slip when cool, saving power and noise."
            ),
            location = "On the front of the engine, behind the radiator. Common on trucks and older cars.",
            relatedIds = listOf("electric_fan", "cooling_fan"),
            ifItFails = "A failed clutch can cause overheating at idle, or a loud roar if it stays locked.",
            maintenance = "Check the belt. Spin the fan by hand with the engine off if it can be reached safely, and listen for roaring.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What drives a mechanical cooling fan?",
                options = listOf("The engine", "A switch only", "The battery alone"),
                answerIndex = 0,
                explanation = "It is turned by the engine, usually through a belt."
            )
        ),

        LearnPart(
            id = "electric_fan",
            systemId = "cooling",
            groupId = "cooling_types",
            name = "Electric cooling fans",
            summary = "A fan with its own motor",
            whatIs = "A fan driven by an electric motor and switched on by the car's computer or a temperature switch.",
            whatItDoes = listOf(
                "Runs even when the engine is idling or off, if it is hot.",
                "Only runs when needed."
            ),
            location = "Directly behind the radiator.",
            relatedIds = listOf("mechanical_fan", "cooling_fan", "coolant_temp_sensor"),
            ifItFails = "A blown fuse, a bad relay or a dead motor causes overheating in traffic.",
            maintenance = "If the engine overheats at idle, check that the fan comes on when hot. A mechanic can check the fuse, relay and sensor.",
            quiz = LearnQuiz(
                question = "What can an electric fan do that a belt-driven one cannot?",
                options = listOf(
                    "Run when the engine is idling or off",
                    "Make fuel",
                    "Charge the battery"
                ),
                answerIndex = 0,
                explanation = "It has its own motor, so it does not depend on engine speed."
            )
        ),

        LearnPart(
            id = "pressurized_cooling",
            systemId = "cooling",
            groupId = "cooling_types",
            name = "Pressurized cooling systems",
            summary = "Pressure raises the boiling point",
            whatIs = "A cooling system sealed with a pressure cap so the coolant stays liquid at temperatures above normal boiling.",
            whatItDoes = listOf(
                "Raises the coolant's boiling point.",
                "Lets the engine run hot enough to be efficient without boiling the coolant."
            ),
            relatedIds = listOf("radiator_cap", "coolant_reservoir", "coolant_leaks"),
            ifItFails = "A leak or a weak cap drops the pressure, and the coolant can boil and be lost.",
            maintenance = "Never open the cap on a hot engine. Wait until it is fully cool.",
            whyItMatters = "A hot pressurized system can spray scalding coolant.",
            quiz = LearnQuiz(
                question = "What does pressure do to the coolant's boiling point?",
                options = listOf("Raises it", "Lowers it", "Nothing"),
                answerIndex = 0,
                explanation = "Pressure lets coolant stay liquid at higher temperatures."
            )
        ),

        // ---------- Lessons ----------
        LearnPart(
            id = "coolant_circulation",
            systemId = "cooling",
            groupId = "cooling_lessons",
            name = "How coolant circulates",
            summary = "The path the coolant follows",
            whatIs = "The round trip coolant makes through the system.",
            whatItDoes = listOf(
                "The water pump pushes coolant into the engine's water jackets.",
                "The coolant soaks up heat and leaves through the thermostat.",
                "It flows to the radiator, where air cools it, then back to the pump."
            ),
            relatedIds = listOf("water_pump", "water_jackets", "thermostat", "radiator"),
            whyItMatters = "If any step is blocked, the engine overheats.",
            quiz = LearnQuiz(
                question = "Where does coolant go right after it leaves the thermostat when the engine is hot?",
                options = listOf("To the radiator", "To the fuel tank", "To the brakes"),
                answerIndex = 0,
                explanation = "The hot coolant goes to the radiator to lose its heat."
            )
        ),

        LearnPart(
            id = "thermostat_regulation",
            systemId = "cooling",
            groupId = "cooling_lessons",
            name = "How the thermostat regulates temperature",
            summary = "Keeps the engine in its comfort zone",
            whatIs = "How the thermostat decides how much coolant goes to the radiator.",
            whatItDoes = listOf(
                "Cold engine: stays closed, so the engine warms up fast.",
                "At working temperature, usually around 80 to 95 degrees Celsius: opens so coolant flows to the radiator.",
                "Opens more or less to hold the temperature steady."
            ),
            relatedIds = listOf("thermostat", "coolant_temp_sensor", "why_overheat"),
            ifItFails = "Stuck closed means overheating. Stuck open means slow warm-up and weak cabin heat.",
            whyItMatters = "An engine that runs too cold wastes fuel and wears faster too.",
            quiz = LearnQuiz(
                question = "What does a closed thermostat do on a cold engine?",
                options = listOf(
                    "Lets the engine warm up faster",
                    "Cools it faster",
                    "Stops the oil"
                ),
                answerIndex = 0,
                explanation = "Coolant stays inside the engine until it is warm."
            )
        ),

        LearnPart(
            id = "why_overheat",
            systemId = "cooling",
            groupId = "cooling_lessons",
            name = "Why engines overheat",
            summary = "The common causes",
            whatIs = "Overheating happens when the engine makes more heat than the system can remove.",
            whatItDoes = listOf(
                "Common causes: low coolant, a leak, a stuck thermostat, a failed fan, a bad water pump, or a blocked radiator.",
                "Warning signs: a rising temperature gauge, steam, a sweet smell, or a warning light."
            ),
            relatedIds = listOf("coolant_leaks", "radiator_blockage", "water_pump_failure", "thermostat"),
            ifItFails = "If it overheats, pull over safely, switch the engine off, and wait for it to cool before checking anything. Do not open the radiator cap while hot.",
            maintenance = "Turning the cabin heater to full hot and the fan high can help pull some heat out while you find a safe place to stop.",
            whyItMatters = "Driving on while overheated can warp the head and blow the head gasket.",
            quiz = LearnQuiz(
                question = "What should you do first if the engine overheats?",
                options = listOf(
                    "Pull over safely and switch off",
                    "Open the cap right away",
                    "Drive faster"
                ),
                answerIndex = 0,
                explanation = "Stop safely and let it cool. Opening the cap hot can burn you."
            )
        ),

        LearnPart(
            id = "coolant_specs",
            systemId = "cooling",
            groupId = "cooling_lessons",
            name = "Coolant specifications",
            summary = "Using the right coolant",
            whatIs = "Coolant, also called antifreeze, is usually a mix of about half coolant concentrate and half water.",
            whatItDoes = listOf(
                "Raises the boiling point and lowers the freezing point.",
                "Contains additives that stop rust and corrosion.",
                "Comes in different chemistries, so the right type matters."
            ),
            relatedIds = listOf("radiator", "coolant_reservoir", "coolant_inspection"),
            maintenance = "Use the type and mix your owner's manual lists. Do not rely on color alone, and do not mix different types. If you are mixing your own, use distilled water.",
            whyItMatters = "The wrong coolant can cause deposits, corrosion, and clogged passages.",
            quiz = LearnQuiz(
                question = "How should you choose the coolant for your car?",
                options = listOf(
                    "Follow the owner's manual",
                    "Pick the nicest color",
                    "Use plain tap water only"
                ),
                answerIndex = 0,
                explanation = "The manual lists the right type for your engine."
            )
        ),

        LearnPart(
            id = "coolant_leaks",
            systemId = "cooling",
            groupId = "cooling_lessons",
            name = "Coolant leaks",
            summary = "Where and how coolant escapes",
            whatIs = "Coolant escaping from the system, from hoses, the radiator, the water pump, the cap, or inside the engine.",
            whatItDoes = listOf(
                "Shows as puddles under the car, a sweet smell, or low coolant.",
                "Can be inside, with white exhaust smoke or milky oil, which can point to a head gasket problem."
            ),
            relatedIds = listOf("radiator_hoses", "radiator", "water_pump", "head_gasket"),
            ifItFails = "Driving with a leak lets the level fall and the engine overheat.",
            maintenance = "Do not just keep topping up. Find and fix the leak, and check the level often until you do.",
            quiz = LearnQuiz(
                question = "What smell is typical of a coolant leak?",
                options = listOf("Sweet", "Rotten eggs only", "Fresh bread"),
                answerIndex = 0,
                explanation = "Many coolants smell sweet when they leak or burn."
            )
        ),

        LearnPart(
            id = "radiator_blockage",
            systemId = "cooling",
            groupId = "cooling_lessons",
            name = "Radiator blockage",
            summary = "When the radiator cannot cool",
            whatIs = "The radiator can be blocked from the inside by rust and deposits, or from the outside by dirt, leaves and insects.",
            whatItDoes = listOf(
                "Cuts the amount of heat it can release.",
                "Often causes overheating when the engine works hard or on hot days."
            ),
            location = "Inside the radiator tubes, or on the fins at the front.",
            relatedIds = listOf("radiator", "coolant_specs", "why_overheat"),
            ifItFails = "Overheating in traffic, uphill, or with the air-con on, even with enough coolant.",
            maintenance = "Flush the system on schedule. Rinse the outside gently from the back with low-pressure water. Do not bend the fins.",
            quiz = LearnQuiz(
                question = "What can block a radiator from the inside?",
                options = listOf("Rust and deposits", "Fresh coolant", "Clean air"),
                answerIndex = 0,
                explanation = "Old coolant leaves deposits that clog the tubes."
            )
        ),

        LearnPart(
            id = "water_pump_failure",
            systemId = "cooling",
            groupId = "cooling_lessons",
            name = "Water pump failure",
            summary = "When coolant stops moving",
            whatIs = "A worn water pump cannot circulate coolant properly.",
            whatItDoes = listOf(
                "Common signs: a coolant leak from the pump, a whining or grinding noise, or overheating.",
                "A weep hole on the pump often leaks first as a warning."
            ),
            relatedIds = listOf("water_pump", "timing_belt", "why_overheat"),
            ifItFails = "If the belt-driven pump seizes, the belt can break too, which may stop other systems.",
            maintenance = "On many engines it is replaced together with the timing belt, which saves labor.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "Why replace the water pump with the timing belt on many engines?",
                options = listOf(
                    "They are in the same place, so you save labor",
                    "They are the same part",
                    "It makes the car faster"
                ),
                answerIndex = 0,
                explanation = "Reaching one means taking apart the other, so doing both together saves cost."
            )
        ),

        LearnPart(
            id = "coolant_inspection",
            systemId = "cooling",
            groupId = "cooling_lessons",
            name = "Proper coolant inspection",
            summary = "A quick check you can do yourself",
            whatIs = "A simple routine to catch cooling problems early.",
            whatItDoes = listOf(
                "Check the level in the reservoir, between MIN and MAX, with the engine cold.",
                "Look at the color. It should be clean, not rusty, oily or cloudy.",
                "Look at the hoses for cracks, bulges and wet spots.",
                "Look under the car for drips after parking."
            ),
            relatedIds = listOf("coolant_reservoir", "radiator_hoses", "coolant_specs"),
            maintenance = "Do this every month or two, and before long trips.",
            whyItMatters = "It takes two minutes and can save an engine.",
            quiz = LearnQuiz(
                question = "When should you check the coolant level?",
                options = listOf("With the engine cold", "With the engine boiling", "Only when it leaks"),
                answerIndex = 0,
                explanation = "A cold engine gives a correct reading and is safe to handle."
            )
        )
    )
}