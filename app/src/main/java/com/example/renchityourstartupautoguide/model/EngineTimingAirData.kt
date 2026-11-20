package com.example.renchityourstartupautoguide.model

object EngineTimingAirData {

    val groups = listOf(
        LearnGroup(
            id = "engine_timing",
            systemId = "engine",
            title = "Timing system",
            intro = "Keeps the crankshaft and camshaft in step, so the valves open and close at the right moment."
        ),
        LearnGroup(
            id = "engine_air_fuel",
            systemId = "engine",
            title = "Air intake and fuel",
            intro = "Supplies the air and fuel the engine needs for combustion."
        )
    )

    val parts = listOf(

        // ---------- Timing system ----------
        LearnPart(
            id = "timing_belt",
            systemId = "engine",
            groupId = "engine_timing",
            name = "Timing belt",
            summary = "A rubber belt that keeps engine parts in step",
            whatIs = "A toothed belt, reinforced with rubber and cords, that synchronizes the crankshaft and the camshaft.",
            whatItDoes = listOf(
                "Keeps the valves opening and closing at the right time compared with the pistons.",
                "In some engines, also drives other parts such as the water pump."
            ),
            location = "At the front or side of the engine, usually behind a plastic cover.",
            relatedIds = listOf("crankshaft_sprocket", "camshaft_sprocket", "timing_tensioner", "timing_chain"),
            ifItFails = "If it breaks, the engine stops at once. In an interference engine, the pistons and valves can hit each other and cause severe damage.",
            maintenance = "It must be replaced at the distance or time in your owner's manual. Do not stretch the interval.",
            whyItMatters = "Wrong timing causes poor performance, and in some engines, serious damage.",
            quiz = LearnQuiz(
                question = "What does the timing belt keep in step?",
                options = listOf(
                    "The crankshaft and the camshaft",
                    "The radiator and the fan",
                    "The oil pump and the filter"
                ),
                answerIndex = 0,
                explanation = "It synchronizes the crankshaft and the camshaft."
            )
        ),

        LearnPart(
            id = "timing_chain",
            systemId = "engine",
            groupId = "engine_timing",
            name = "Timing chain",
            summary = "A metal chain that keeps engine parts in step",
            whatIs = "A metal chain that does the same job as a timing belt.",
            whatItDoes = listOf(
                "Keeps the crankshaft and camshaft synchronized.",
                "Is often built to last longer than a belt."
            ),
            location = "Inside the engine, behind a cover at the front or side. Engine oil lubricates it.",
            relatedIds = listOf("timing_belt", "timing_tensioner", "timing_guides", "camshaft_sprocket"),
            ifItFails = "A stretched or worn chain can rattle, especially at start-up, and cause rough running or a check engine light. A broken chain can damage the engine.",
            maintenance = "Many cars have no fixed replacement interval, but regular oil changes help it last. Do not ignore a rattle.",
            quiz = LearnQuiz(
                question = "What lubricates the timing chain?",
                options = listOf("Engine oil", "Coolant", "Brake fluid"),
                answerIndex = 0,
                explanation = "The chain runs inside the engine and is lubricated by engine oil."
            )
        ),

        LearnPart(
            id = "timing_gears",
            systemId = "engine",
            groupId = "engine_timing",
            name = "Timing gears",
            summary = "Gears that pass rotation along",
            whatIs = "Gears that transfer rotation between the engine's timing parts.",
            whatItDoes = listOf(
                "Link the crankshaft and camshaft directly in some engines.",
                "Are used instead of a belt or chain in some designs."
            ),
            location = "At the front of the engine, behind the cover.",
            relatedIds = listOf("timing_belt", "timing_chain", "crankshaft_sprocket"),
            ifItFails = "Whining or rattling noises, or timing problems if the teeth wear.",
            maintenance = "Clean oil protects them. They are not a routine service.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What can timing gears replace in some engines?",
                options = listOf("A belt or chain", "The oil pan", "The radiator"),
                answerIndex = 0,
                explanation = "Some engines drive the camshaft directly with gears."
            )
        ),

        LearnPart(
            id = "camshaft_sprocket",
            systemId = "engine",
            groupId = "engine_timing",
            name = "Camshaft sprocket",
            summary = "Connects the belt or chain to the camshaft",
            whatIs = "A toothed wheel that connects the timing belt or chain to the camshaft.",
            whatItDoes = listOf(
                "Is turned by the belt or chain.",
                "Turns the camshaft at half the speed of the crankshaft."
            ),
            location = "On the end of the camshaft.",
            relatedIds = listOf("camshaft", "timing_belt", "timing_chain", "crankshaft_sprocket"),
            ifItFails = "A damaged sprocket or a loose bolt can throw the timing off.",
            maintenance = "It is checked whenever the timing belt or chain is replaced.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "Which part does the camshaft sprocket turn?",
                options = listOf("The camshaft", "The piston", "The flywheel"),
                answerIndex = 0,
                explanation = "It sits on the end of the camshaft and turns it."
            )
        ),

        LearnPart(
            id = "crankshaft_sprocket",
            systemId = "engine",
            groupId = "engine_timing",
            name = "Crankshaft sprocket",
            summary = "Starts the timing drive",
            whatIs = "A toothed wheel that passes the crankshaft's rotation to the timing belt or chain.",
            whatItDoes = listOf(
                "Is the driving side of the timing system.",
                "Turns twice as fast as the camshaft sprocket."
            ),
            location = "On the front end of the crankshaft.",
            relatedIds = listOf("crankshaft", "timing_belt", "timing_chain", "camshaft_sprocket"),
            ifItFails = "A worn or loose sprocket can throw the timing off or damage the belt or chain.",
            maintenance = "It is checked whenever the timing belt or chain is replaced.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "Which part does the crankshaft sprocket send rotation to?",
                options = listOf("The timing belt or chain", "The fuel tank", "The air filter"),
                answerIndex = 0,
                explanation = "It passes the crankshaft's rotation to the timing belt or chain."
            )
        ),

        LearnPart(
            id = "timing_tensioner",
            systemId = "engine",
            groupId = "engine_timing",
            name = "Timing tensioner",
            summary = "Keeps the belt or chain tight",
            whatIs = "A spring or oil-pressure part that keeps the right tension in the timing belt or chain.",
            whatItDoes = listOf(
                "Takes up slack as the belt or chain wears.",
                "Stops the belt or chain from jumping teeth."
            ),
            location = "Pressed against the timing belt or chain, behind the timing cover.",
            relatedIds = listOf("timing_belt", "timing_chain", "timing_guides"),
            ifItFails = "A weak tensioner can cause slack, noise, and skipped teeth.",
            maintenance = "It is usually replaced together with the timing belt.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What does the tensioner do?",
                options = listOf(
                    "Keeps the belt or chain tight",
                    "Cools the oil",
                    "Cleans the air"
                ),
                answerIndex = 0,
                explanation = "It keeps the right tension so the belt or chain does not slip."
            )
        ),

        LearnPart(
            id = "timing_guides",
            systemId = "engine",
            groupId = "engine_timing",
            name = "Timing guides",
            summary = "Steady the chain",
            whatIs = "Rails that guide and support the timing chain.",
            whatItDoes = listOf(
                "Control how the chain moves.",
                "Reduce unwanted vibration."
            ),
            location = "Alongside the timing chain, behind the timing cover.",
            relatedIds = listOf("timing_chain", "timing_tensioner"),
            ifItFails = "Worn guides cause chain rattle and noise. Plastic guides can crack.",
            maintenance = "They are normally replaced when the chain is replaced.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What do timing guides do?",
                options = listOf(
                    "Steady the timing chain",
                    "Light the spark plug",
                    "Filter the fuel"
                ),
                answerIndex = 0,
                explanation = "They support the chain and reduce vibration."
            )
        ),

        // ---------- Air intake and fuel ----------
        LearnPart(
            id = "air_filter",
            systemId = "engine",
            groupId = "engine_air_fuel",
            name = "Air filter",
            summary = "Cleans the air going in",
            whatIs = "A filter that removes dust, dirt and other particles from the air before it enters the engine.",
            whatItDoes = listOf(
                "Stops dirt from reaching the cylinders.",
                "Lets enough clean air through for good combustion."
            ),
            location = "In a box near the front of the engine bay, connected to the intake.",
            relatedIds = listOf("maf_sensor", "throttle_body", "intake_manifold"),
            ifItFails = "A clogged filter can make the engine feel weak and use more fuel.",
            maintenance = "Check it regularly and replace it at the interval in your manual, sooner if you drive on dusty roads.",
            quiz = LearnQuiz(
                question = "What does the air filter remove?",
                options = listOf("Dust and dirt", "Heat", "Fuel"),
                answerIndex = 0,
                explanation = "It cleans the air before it enters the engine."
            )
        ),

        LearnPart(
            id = "intake_manifold",
            systemId = "engine",
            groupId = "engine_air_fuel",
            name = "Intake manifold",
            summary = "Shares air among the cylinders",
            whatIs = "A set of pipes that spreads incoming air to each of the engine's cylinders.",
            whatItDoes = listOf(
                "Delivers air to each intake valve.",
                "Helps every cylinder get a similar amount of air."
            ),
            location = "On the side of the cylinder head, between the throttle body and the intake valves.",
            relatedIds = listOf("throttle_body", "intake_valve", "map_sensor", "fuel_injectors"),
            ifItFails = "Cracks or leaks cause a rough idle, loss of power, and sometimes a hissing sound.",
            maintenance = "It is not a routine service. A mechanic checks it if idle problems appear.",
            quiz = LearnQuiz(
                question = "What does the intake manifold do?",
                options = listOf(
                    "Spreads air to the cylinders",
                    "Stores the fuel",
                    "Cools the coolant"
                ),
                answerIndex = 0,
                explanation = "It distributes the incoming air to each cylinder."
            )
        ),

        LearnPart(
            id = "throttle_body",
            systemId = "engine",
            groupId = "engine_air_fuel",
            name = "Throttle body",
            summary = "Controls how much air gets in",
            whatIs = "A valve that controls how much air enters many gasoline engines.",
            whatItDoes = listOf(
                "Opens wider when you press the accelerator.",
                "Most diesel engines control power mainly through fuel instead."
            ),
            location = "Between the air filter box and the intake manifold.",
            relatedIds = listOf("air_filter", "intake_manifold", "maf_sensor"),
            ifItFails = "Dirt buildup can cause a rough idle or hesitation.",
            maintenance = "Some need occasional cleaning. Follow your manual or ask a mechanic.",
            quiz = LearnQuiz(
                question = "What does pressing the accelerator do at the throttle body?",
                options = listOf("Lets more air in", "Adds oil", "Turns on the fan"),
                answerIndex = 0,
                explanation = "The throttle opens wider so more air enters the engine."
            )
        ),

        LearnPart(
            id = "maf_sensor",
            systemId = "engine",
            groupId = "engine_air_fuel",
            name = "Mass airflow sensor",
            summary = "Measures the air coming in",
            whatIs = "A sensor that measures how much air enters the engine, in cars that have one. It is also called the MAF sensor.",
            whatItDoes = listOf(
                "Tells the engine computer how much air is coming in.",
                "Helps the computer decide how much fuel to add."
            ),
            location = "In the air intake pipe, between the air filter and the throttle body.",
            relatedIds = listOf("air_filter", "throttle_body", "map_sensor"),
            ifItFails = "A rough idle, poor fuel economy, hesitation, or a check engine light.",
            maintenance = "It can be cleaned with a special MAF cleaner. Do not touch the sensing element.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What does a MAF sensor measure?",
                options = listOf("Air entering the engine", "Oil level", "Tire pressure"),
                answerIndex = 0,
                explanation = "It measures the amount of air entering the engine."
            )
        ),

        LearnPart(
            id = "map_sensor",
            systemId = "engine",
            groupId = "engine_air_fuel",
            name = "Manifold pressure sensor",
            summary = "Reads the pressure in the intake",
            whatIs = "A sensor that measures the pressure inside the intake manifold. It is also called the MAP sensor.",
            whatItDoes = listOf(
                "Helps the engine computer work out how hard the engine is working.",
                "Helps it adjust the fuel and spark."
            ),
            location = "On or near the intake manifold.",
            relatedIds = listOf("intake_manifold", "maf_sensor"),
            ifItFails = "A poor idle, bad fuel economy, and a check engine light.",
            maintenance = "It is replaced if faulty. It is not a routine service.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What does a MAP sensor measure?",
                options = listOf(
                    "Pressure in the intake manifold",
                    "Coolant color",
                    "Speed of the car"
                ),
                answerIndex = 0,
                explanation = "It reads the pressure inside the intake manifold."
            )
        )
    )
}