package com.example.renchityourstartupautoguide.model

object EngineSystemsData {

    val groups = listOf(
        LearnGroup(
            id = "engine_forced_induction",
            systemId = "engine",
            title = "Forced induction",
            intro = "Parts that push extra air into the engine for more power."
        ),
        LearnGroup(
            id = "engine_lubrication",
            systemId = "engine",
            title = "Lubrication system",
            intro = "Keeps moving parts coated in oil so they do not wear out or overheat."
        )
    )

    val parts = listOf(

        // ---------- Forced induction ----------
        LearnPart(
            id = "turbocharger",
            systemId = "engine",
            groupId = "engine_forced_induction",
            name = "Turbocharger",
            summary = "Uses exhaust gas to push more air in",
            whatIs = "A device powered by exhaust gas that forces extra air into the engine.",
            whatItDoes = listOf(
                "Spins a turbine with the hot exhaust leaving the engine.",
                "Uses that spin to compress the incoming air.",
                "More air means more fuel can burn, so the engine makes more power."
            ),
            location = "Attached to the exhaust manifold, with pipes running to the air intake.",
            relatedIds = listOf("turbine_wheel", "compressor_wheel", "wastegate", "intercooler", "turbocharged_engine"),
            ifItFails = "Loss of power, whistling or grinding noises, blue or black smoke, or oil use going up.",
            maintenance = "Regular oil changes with the right oil are the best protection. Let a hot turbo engine idle briefly before switching off, if your manual says so.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What powers a turbocharger?",
                options = listOf("Exhaust gas", "The battery", "The fuel pump"),
                answerIndex = 0,
                explanation = "Exhaust gas spins the turbine, which drives the compressor."
            )
        ),

        LearnPart(
            id = "turbine_wheel",
            systemId = "engine",
            groupId = "engine_forced_induction",
            name = "Turbine wheel",
            summary = "The exhaust side of the turbo",
            whatIs = "The wheel inside the turbocharger that exhaust gas spins.",
            whatItDoes = listOf(
                "Catches the flow of hot exhaust gas.",
                "Turns the shaft that drives the compressor wheel."
            ),
            location = "Inside the hot side of the turbocharger.",
            relatedIds = listOf("turbocharger", "compressor_wheel"),
            ifItFails = "Damaged blades cause noise, vibration and loss of boost.",
            maintenance = "It is not serviced on its own. Clean oil and a healthy engine protect it.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What spins the turbine wheel?",
                options = listOf("Exhaust gas", "Coolant", "Engine oil"),
                answerIndex = 0,
                explanation = "Hot exhaust gas flows over its blades and spins it."
            )
        ),

        LearnPart(
            id = "compressor_wheel",
            systemId = "engine",
            groupId = "engine_forced_induction",
            name = "Compressor wheel",
            summary = "The air side of the turbo",
            whatIs = "The wheel inside the turbocharger that compresses the incoming air.",
            whatItDoes = listOf(
                "Is connected to the turbine wheel by a shaft.",
                "Squeezes fresh air and sends it toward the engine."
            ),
            location = "Inside the cool side of the turbocharger.",
            relatedIds = listOf("turbocharger", "turbine_wheel", "intercooler"),
            ifItFails = "A whining or scraping noise and weak acceleration. Dirt getting past a damaged air filter can chew up the blades.",
            maintenance = "Keep the air filter in good shape so dirt does not reach it.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What does the compressor wheel do?",
                options = listOf("Squeezes incoming air", "Cools the oil", "Burns the fuel"),
                answerIndex = 0,
                explanation = "It compresses the air before it goes to the engine."
            )
        ),

        LearnPart(
            id = "wastegate",
            systemId = "engine",
            groupId = "engine_forced_induction",
            name = "Wastegate",
            summary = "Stops the turbo from over-boosting",
            whatIs = "A valve that lets some exhaust gas bypass the turbine.",
            whatItDoes = listOf(
                "Limits how fast the turbine spins.",
                "Keeps boost pressure at a safe level."
            ),
            location = "On or next to the turbocharger's exhaust side.",
            relatedIds = listOf("turbocharger", "vgt"),
            ifItFails = "Too much boost can harm the engine. Stuck open, the car feels weak.",
            maintenance = "It is not a routine service. A mechanic checks it if boost problems show up.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What is the wastegate's job?",
                options = listOf("Limit boost pressure", "Filter the oil", "Cool the air"),
                answerIndex = 0,
                explanation = "It lets exhaust bypass the turbine so boost stays safe."
            )
        ),

        LearnPart(
            id = "vgt",
            systemId = "engine",
            groupId = "engine_forced_induction",
            name = "Variable geometry turbo (VGT)",
            summary = "A turbo that adjusts itself",
            whatIs = "A turbocharger with adjustable vanes that change how exhaust flows over the turbine.",
            whatItDoes = listOf(
                "Gives good boost at low engine speed.",
                "Avoids too much boost at high speed."
            ),
            location = "Same place as a regular turbocharger, on the exhaust manifold.",
            relatedIds = listOf("turbocharger", "wastegate"),
            ifItFails = "Sticking vanes can cause weak power, black smoke, or a warning light.",
            maintenance = "Good oil and regular driving at proper speeds help keep the vanes from sticking.",
            level = "Advanced",
            quiz = LearnQuiz(
                question = "What makes a VGT different from a regular turbo?",
                options = listOf("Adjustable vanes", "No turbine", "It uses a belt"),
                answerIndex = 0,
                explanation = "Its vanes change how exhaust flows across the turbine."
            )
        ),

        LearnPart(
            id = "intercooler",
            systemId = "engine",
            groupId = "engine_forced_induction",
            name = "Intercooler",
            summary = "Cools the compressed air",
            whatIs = "A heat exchanger that cools the air after it has been compressed.",
            whatItDoes = listOf(
                "Squeezed air gets hot, and hot air holds less oxygen.",
                "Cooling it lets more oxygen into each cylinder."
            ),
            location = "Usually behind the front bumper or on top of the engine.",
            relatedIds = listOf("turbocharger", "supercharger", "boost_pipes"),
            ifItFails = "Leaks or blockages cause power loss and higher fuel use.",
            maintenance = "Keep the fins clear of debris, and check hoses for oil or cracks.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "Why cool the air after compressing it?",
                options = listOf(
                    "Cooler air holds more oxygen",
                    "To make it quieter",
                    "To save oil"
                ),
                answerIndex = 0,
                explanation = "Cooler, denser air gives the engine more oxygen to burn."
            )
        ),

        LearnPart(
            id = "boost_pipes",
            systemId = "engine",
            groupId = "engine_forced_induction",
            name = "Boost pipes",
            summary = "Carry the pressurized air",
            whatIs = "The pipes and hoses that carry compressed air between the turbo, the intercooler and the engine.",
            whatItDoes = listOf(
                "Handle higher pressure than a normal intake pipe.",
                "Link the parts of the forced induction system."
            ),
            location = "Between the turbocharger, intercooler and intake manifold.",
            relatedIds = listOf("turbocharger", "intercooler", "intake_manifold"),
            ifItFails = "A split or loose pipe leaks air, causing a hissing sound and less power.",
            maintenance = "Check the clamps and hoses for cracks and oil leaks.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What do boost pipes carry?",
                options = listOf("Compressed air", "Coolant", "Fuel"),
                answerIndex = 0,
                explanation = "They carry pressurized air through the forced induction system."
            )
        ),

        LearnPart(
            id = "supercharger",
            systemId = "engine",
            groupId = "engine_forced_induction",
            name = "Supercharger",
            summary = "A belt-driven air compressor",
            whatIs = "A compressor driven by the engine itself, usually through a belt, that forces extra air in.",
            whatItDoes = listOf(
                "Gives extra power from low engine speeds.",
                "Takes a little engine power to run, unlike a turbo that uses exhaust."
            ),
            location = "On top of or beside the engine, driven by a belt.",
            relatedIds = listOf("supercharged_engine", "turbocharger", "intercooler"),
            ifItFails = "Whining noises, a slipping belt, or lost power.",
            maintenance = "Check the drive belt, and follow the service schedule for its oil if it has one.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What drives a supercharger?",
                options = listOf("The engine, usually by a belt", "Exhaust gas", "The alternator"),
                answerIndex = 0,
                explanation = "It is driven mechanically by the engine."
            )
        ),

        // ---------- Lubrication ----------
        LearnPart(
            id = "engine_oil",
            systemId = "engine",
            groupId = "engine_lubrication",
            name = "Engine oil",
            summary = "The engine's lifeblood",
            whatIs = "The fluid that coats the engine's moving parts.",
            whatItDoes = listOf(
                "Reduces friction and wear.",
                "Carries heat away from hot parts.",
                "Helps carry dirt to the oil filter."
            ),
            location = "Stored in the oil pan, then pumped around the engine.",
            relatedIds = listOf("oil_pump", "oil_filter", "oil_pan", "engine_bearings"),
            ifItFails = "Low or old oil leads to overheating, noise, and engine damage. The oil warning light means stop and check.",
            maintenance = "Check the level regularly and change the oil and filter on schedule, using the grade your manual lists.",
            whyItMatters = "Skipping oil changes is one of the fastest ways to ruin an engine.",
            quiz = LearnQuiz(
                question = "What is a main job of engine oil?",
                options = listOf("Reduce friction", "Make spark", "Store fuel"),
                answerIndex = 0,
                explanation = "It coats moving parts so they slide instead of grind."
            )
        ),

        LearnPart(
            id = "oil_pump",
            systemId = "engine",
            groupId = "engine_lubrication",
            name = "Oil pump",
            summary = "Pushes oil around the engine",
            whatIs = "A pump that sends oil from the oil pan through the engine.",
            whatItDoes = listOf(
                "Builds the oil pressure the engine needs.",
                "Feeds oil to the bearings, camshaft and other parts."
            ),
            location = "Inside or at the front of the engine, near the oil pan or crankshaft.",
            relatedIds = listOf("oil_pickup_tube", "oil_filter", "oil_galleries", "oil_pressure_sensor"),
            ifItFails = "Low oil pressure, an oil warning light, and fast engine wear.",
            maintenance = "Clean oil and regular changes protect it.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What does the oil pump create?",
                options = listOf("Oil pressure", "Spark", "Coolant flow"),
                answerIndex = 0,
                explanation = "It builds the pressure that pushes oil through the engine."
            )
        ),

        LearnPart(
            id = "oil_filter",
            systemId = "engine",
            groupId = "engine_lubrication",
            name = "Oil filter",
            summary = "Cleans the oil",
            whatIs = "A filter that traps dirt and metal particles in the engine oil.",
            whatItDoes = listOf(
                "Keeps the oil clean as it circulates.",
                "Protects bearings and other parts from grit."
            ),
            location = "Screwed onto the side of the engine, or in a housing on top.",
            relatedIds = listOf("engine_oil", "oil_pump"),
            ifItFails = "A clogged filter can starve the engine of clean oil.",
            maintenance = "Replace it at every oil change, or as the manual says.",
            quiz = LearnQuiz(
                question = "When should you normally replace the oil filter?",
                options = listOf("At each oil change", "Every 10 years", "Never"),
                answerIndex = 0,
                explanation = "A fresh filter goes in with fresh oil."
            )
        ),

        LearnPart(
            id = "oil_pickup_tube",
            systemId = "engine",
            groupId = "engine_lubrication",
            name = "Oil pickup tube",
            summary = "Draws oil from the pan",
            whatIs = "A tube that reaches into the oil pan so the oil pump can draw oil from it.",
            whatItDoes = listOf(
                "Carries oil from the pan to the oil pump.",
                "Has a screen on the end to stop large debris."
            ),
            location = "Inside the oil pan.",
            relatedIds = listOf("oil_strainer", "oil_pump", "oil_pan"),
            ifItFails = "A blocked or loose tube lets oil pressure drop.",
            maintenance = "Not serviced on its own. Sludge from skipped oil changes can clog it.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "Where does the pickup tube take oil from?",
                options = listOf("The oil pan", "The radiator", "The fuel tank"),
                answerIndex = 0,
                explanation = "It reaches into the oil pan and feeds the pump."
            )
        ),

        LearnPart(
            id = "oil_strainer",
            systemId = "engine",
            groupId = "engine_lubrication",
            name = "Oil strainer",
            summary = "A screen for big debris",
            whatIs = "A mesh screen at the end of the pickup tube.",
            whatItDoes = listOf(
                "Stops large pieces of debris before they reach the pump.",
                "Works before the oil filter does its finer job."
            ),
            location = "At the end of the oil pickup tube, inside the oil pan.",
            relatedIds = listOf("oil_pickup_tube", "oil_pump", "oil_filter"),
            ifItFails = "A clogged strainer starves the pump and drops oil pressure.",
            maintenance = "It is only reached when the oil pan is removed.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What does the oil strainer stop?",
                options = listOf("Large debris", "Heat", "Exhaust gas"),
                answerIndex = 0,
                explanation = "It screens out big particles before the pump."
            )
        ),

        LearnPart(
            id = "oil_galleries",
            systemId = "engine",
            groupId = "engine_lubrication",
            name = "Oil galleries",
            summary = "Passages that carry oil inside",
            whatIs = "Small passages drilled inside the engine block and cylinder head.",
            whatItDoes = listOf(
                "Carry pressurized oil to the parts that need it.",
                "Reach the crankshaft bearings, camshaft and valve parts."
            ),
            location = "Inside the engine block, crankshaft and cylinder head.",
            relatedIds = listOf("oil_pump", "engine_block", "engine_bearings"),
            ifItFails = "Blocked passages starve parts of oil and cause wear.",
            maintenance = "Clean oil and on-time changes keep them clear.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What do oil galleries do?",
                options = listOf("Carry oil inside the engine", "Hold the fuel", "Cool the cabin"),
                answerIndex = 0,
                explanation = "They are the passages that deliver oil to engine parts."
            )
        ),

        LearnPart(
            id = "oil_cooler",
            systemId = "engine",
            groupId = "engine_lubrication",
            name = "Oil cooler",
            summary = "Keeps the oil from getting too hot",
            whatIs = "A small heat exchanger that cools the engine oil.",
            whatItDoes = listOf(
                "Lowers the oil temperature using coolant or air.",
                "Helps the oil last when the engine works hard."
            ),
            location = "Near the oil filter, or in front of the radiator.",
            relatedIds = listOf("engine_oil", "oil_filter", "radiator"),
            ifItFails = "A leak can let oil and coolant mix, or lose oil entirely.",
            maintenance = "Look for leaks and milky oil during checks.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What does an oil cooler do?",
                options = listOf("Lowers oil temperature", "Raises oil pressure", "Filters the fuel"),
                answerIndex = 0,
                explanation = "It removes heat from the oil."
            )
        ),

        LearnPart(
            id = "oil_pressure_sensor",
            systemId = "engine",
            groupId = "engine_lubrication",
            name = "Oil pressure sensor",
            summary = "Watches the oil pressure",
            whatIs = "A sensor that checks the pressure of the engine oil.",
            whatItDoes = listOf(
                "Turns on the oil warning light when pressure is too low.",
                "Sends the reading to a gauge in some cars."
            ),
            location = "Screwed into the engine block, near the oil filter.",
            relatedIds = listOf("oil_pump", "engine_oil"),
            ifItFails = "The oil light may come on, or stay off when it should not.",
            maintenance = "Not routine. If the oil light comes on, stop and check the oil level first.",
            quiz = LearnQuiz(
                question = "What should you do if the oil light stays on while driving?",
                options = listOf(
                    "Stop safely and check the oil",
                    "Ignore it",
                    "Drive faster"
                ),
                answerIndex = 0,
                explanation = "Low oil pressure can wreck an engine within minutes."
            )
        )
    )
}