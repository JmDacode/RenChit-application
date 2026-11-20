package com.example.renchityourstartupautoguide.model

object EngineBasicsData {

    val groups = listOf(
        LearnGroup(
            id = "engine_fundamentals",
            systemId = "engine",
            title = "Engine fundamentals",
            intro = "The basic ideas behind how an engine works."
        ),
        LearnGroup(
            id = "engine_types",
            systemId = "engine",
            title = "Engine types",
            intro = "The different ways engines are built."
        )
    )

    val parts = listOf(

        // ---------- Engine fundamentals ----------
        LearnPart(
            id = "engine_displacement",
            systemId = "engine",
            groupId = "engine_fundamentals",
            name = "Engine displacement",
            summary = "How big the engine is",
            whatIs = "The total volume swept by all the pistons as they move from the top to the bottom of their stroke. It is measured in liters (L) or cubic centimeters (cc).",
            whatItDoes = listOf(
                "Is the number in names like a 1.5L or a 1500cc engine.",
                "A bigger number usually means more air and fuel per cycle, so more power potential.",
                "A bigger engine often also uses more fuel."
            ),
            relatedIds = listOf("piston", "cylinder", "compression_ratio"),
            whyItMatters = "It is the quickest way to compare how large two engines are.",
            quiz = LearnQuiz(
                question = "Engine displacement is usually measured in what?",
                options = listOf("Liters or cubic centimeters", "Kilograms", "Kilometers per hour"),
                answerIndex = 0,
                explanation = "It is a volume, so it is measured in liters (L) or cubic centimeters (cc)."
            )
        ),

        LearnPart(
            id = "compression_ratio",
            systemId = "engine",
            groupId = "engine_fundamentals",
            name = "Compression ratio",
            summary = "How tightly the mix is squeezed",
            whatIs = "The ratio between the cylinder's volume with the piston at the bottom and its volume with the piston at the top.",
            whatItDoes = listOf(
                "Shows how much the air or the air-fuel mix is squeezed before it burns.",
                "A higher ratio can make the engine more efficient.",
                "Diesel engines use higher ratios than most gasoline engines."
            ),
            relatedIds = listOf("piston", "cylinder", "diesel_engine"),
            whyItMatters = "An engine with high compression needs the fuel grade the maker recommends.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What does the compression ratio describe?",
                options = listOf(
                    "How much the air or mix is squeezed",
                    "How hot the coolant gets",
                    "How much oil the engine holds"
                ),
                answerIndex = 0,
                explanation = "It compares the cylinder's volume at the bottom and at the top of the piston's travel."
            )
        ),

        LearnPart(
            id = "horsepower",
            systemId = "engine",
            groupId = "engine_fundamentals",
            name = "Horsepower",
            summary = "How fast the engine can do work",
            whatIs = "A measurement of the rate at which an engine does work.",
            whatItDoes = listOf(
                "Describes how quickly an engine can deliver power.",
                "Matters for top speed and for fast acceleration at higher speeds."
            ),
            relatedIds = listOf("torque", "engine_displacement"),
            whyItMatters = "Think of it as how hard the engine can work at a given moment.",
            quiz = LearnQuiz(
                question = "What does horsepower describe?",
                options = listOf(
                    "How quickly an engine can do work",
                    "How much fuel the tank holds",
                    "How big the tires are"
                ),
                answerIndex = 0,
                explanation = "Horsepower is the rate at which the engine performs work."
            )
        ),

        LearnPart(
            id = "torque",
            systemId = "engine",
            groupId = "engine_fundamentals",
            name = "Torque",
            summary = "The twisting force",
            whatIs = "The rotational force the engine produces.",
            whatItDoes = listOf(
                "Helps the car accelerate.",
                "Matters for towing and carrying heavy loads.",
                "Diesel engines are known for strong torque at low engine speeds."
            ),
            relatedIds = listOf("horsepower", "crankshaft", "diesel_engine"),
            whyItMatters = "It is the pulling strength you feel when you pull away or climb a hill.",
            quiz = LearnQuiz(
                question = "Which job depends the most on torque?",
                options = listOf("Pulling a heavy load", "Cooling the engine", "Cleaning the air"),
                answerIndex = 0,
                explanation = "Torque is the twisting force that helps overcome resistance, like a heavy load."
            )
        ),

        LearnPart(
            id = "combustion",
            systemId = "engine",
            groupId = "engine_fundamentals",
            name = "Combustion",
            summary = "Burning fuel to make force",
            whatIs = "The process of burning fuel to release energy that pushes the piston downward.",
            whatItDoes = listOf(
                "Happens in every cylinder, thousands of times a minute.",
                "Needs air, fuel, and a way to ignite them.",
                "Gasoline engines use a spark. Diesel engines use the heat of compression."
            ),
            relatedIds = listOf("piston", "cylinder", "four_stroke_cycle"),
            whyItMatters = "It is where all of the engine's power starts.",
            quiz = LearnQuiz(
                question = "What does combustion push downward?",
                options = listOf("The piston", "The oil filter", "The radiator cap"),
                answerIndex = 0,
                explanation = "The burning gas pushes the piston down, which creates power."
            )
        ),

        LearnPart(
            id = "four_stroke_cycle",
            systemId = "engine",
            groupId = "engine_fundamentals",
            name = "Four-stroke cycle",
            summary = "Intake, compression, power, exhaust",
            whatIs = "The four piston strokes that make up a typical combustion cycle.",
            whatItDoes = listOf(
                "Intake: the piston moves down and air comes in.",
                "Compression: the piston moves up and squeezes it.",
                "Power: combustion pushes the piston down.",
                "Exhaust: the piston moves up and pushes the burnt gas out."
            ),
            relatedIds = listOf("piston", "intake_valve", "exhaust_valve", "crankshaft"),
            whyItMatters = "Almost every part of the engine is there to help one of these four steps.",
            quiz = LearnQuiz(
                question = "Which is the correct order of the four strokes?",
                options = listOf(
                    "Intake, compression, power, exhaust",
                    "Power, intake, exhaust, compression",
                    "Exhaust, power, intake, compression"
                ),
                answerIndex = 0,
                explanation = "Air comes in, gets squeezed, burns to make power, then leaves as exhaust."
            )
        ),

        // ---------- Engine types ----------
        LearnPart(
            id = "gasoline_engine",
            systemId = "engine",
            groupId = "engine_types",
            name = "Gasoline engine",
            summary = "A spark lights the mix",
            whatIs = "An engine that uses spark plugs to ignite a compressed mixture of air and fuel inside the cylinders.",
            whatItDoes = listOf(
                "Mixes air and fuel, squeezes it, then lights it with a spark.",
                "Is very common in passenger cars."
            ),
            relatedIds = listOf("diesel_engine", "naturally_aspirated", "combustion"),
            quiz = LearnQuiz(
                question = "How does a gasoline engine light the fuel?",
                options = listOf("With a spark plug", "With heat from squeezing only", "With the battery directly"),
                answerIndex = 0,
                explanation = "Spark plugs ignite the compressed air-fuel mix."
            )
        ),

        LearnPart(
            id = "diesel_engine",
            systemId = "engine",
            groupId = "engine_types",
            name = "Diesel engine",
            summary = "Squeezing makes it hot enough to burn",
            whatIs = "An engine that squeezes air until it is hot enough for injected diesel fuel to ignite on its own. It generally uses compression ignition instead of spark plugs.",
            whatItDoes = listOf(
                "Injects diesel near the end of the compression stroke.",
                "Is known for strong torque and good fuel economy.",
                "Is common in trucks and heavy vehicles."
            ),
            relatedIds = listOf("gasoline_engine", "compression_ratio", "torque", "turbocharged_engine"),
            quiz = LearnQuiz(
                question = "What usually lights the fuel in a diesel engine?",
                options = listOf("The heat of compressed air", "A spark plug", "A pilot flame"),
                answerIndex = 0,
                explanation = "Squeezing the air makes it hot enough to ignite the injected diesel."
            )
        ),

        LearnPart(
            id = "naturally_aspirated",
            systemId = "engine",
            groupId = "engine_types",
            name = "Naturally aspirated engine",
            summary = "Breathes without any help",
            whatIs = "An engine that draws air in through atmospheric pressure and piston movement, without a turbocharger or supercharger.",
            whatItDoes = listOf(
                "Air is pulled in as the piston moves down.",
                "Is simple, with fewer parts that can fail.",
                "Makes less power than a turbo engine of the same size."
            ),
            relatedIds = listOf("turbocharged_engine", "supercharged_engine", "intake_valve"),
            quiz = LearnQuiz(
                question = "What does a naturally aspirated engine NOT have?",
                options = listOf("A turbocharger or supercharger", "Pistons", "A crankshaft"),
                answerIndex = 0,
                explanation = "It draws air in on its own, with no forced induction."
            )
        ),

        LearnPart(
            id = "turbocharged_engine",
            systemId = "engine",
            groupId = "engine_types",
            name = "Turbocharged engine",
            summary = "Exhaust spins a fan that forces air in",
            whatIs = "An engine that uses exhaust energy to spin a turbine connected to a compressor, which forces more air into the engine.",
            whatItDoes = listOf(
                "Uses exhaust gas that would otherwise be wasted.",
                "More air lets more fuel burn, so a small engine can make more power."
            ),
            relatedIds = listOf("turbocharger", "intercooler", "supercharged_engine", "naturally_aspirated"),
            quiz = LearnQuiz(
                question = "What spins the turbine in a turbocharger?",
                options = listOf("Exhaust gas", "The battery", "The fuel pump"),
                answerIndex = 0,
                explanation = "Exhaust energy spins the turbine, which drives the compressor."
            )
        ),

        LearnPart(
            id = "supercharged_engine",
            systemId = "engine",
            groupId = "engine_types",
            name = "Supercharged engine",
            summary = "An air pump driven by the engine",
            whatIs = "An engine that uses a mechanically driven compressor to force more air into the engine.",
            whatItDoes = listOf(
                "Is usually driven by a belt from the engine.",
                "Gives its extra power quickly, even at low engine speeds.",
                "Uses some of the engine's own power to run."
            ),
            relatedIds = listOf("supercharger", "turbocharged_engine", "naturally_aspirated"),
            quiz = LearnQuiz(
                question = "What drives a supercharger?",
                options = listOf("The engine itself, usually by a belt", "Exhaust gas", "The alternator only"),
                answerIndex = 0,
                explanation = "It is mechanically driven, unlike a turbo, which uses exhaust."
            )
        ),

        LearnPart(
            id = "inline_engine",
            systemId = "engine",
            groupId = "engine_types",
            name = "Inline engine",
            summary = "All cylinders in one straight row",
            whatIs = "An engine that arranges all the cylinders in a single straight row. Examples are the inline-four and inline-six.",
            whatItDoes = listOf(
                "Is simple and fairly compact.",
                "Is very common, especially the inline-four."
            ),
            relatedIds = listOf("v_engine", "boxer_engine", "cylinder"),
            quiz = LearnQuiz(
                question = "How are the cylinders arranged in an inline engine?",
                options = listOf("In one straight row", "In a V shape", "Facing each other"),
                answerIndex = 0,
                explanation = "All the cylinders sit in a single line."
            )
        ),

        LearnPart(
            id = "v_engine",
            systemId = "engine",
            groupId = "engine_types",
            name = "V-type engine",
            summary = "Two rows of cylinders in a V",
            whatIs = "An engine that arranges the cylinders in two banks that form a V shape, such as a V6 or V8.",
            whatItDoes = listOf(
                "Fits more cylinders into a shorter engine than an inline layout.",
                "Is common in larger cars and trucks."
            ),
            relatedIds = listOf("inline_engine", "boxer_engine", "cylinder"),
            quiz = LearnQuiz(
                question = "What does the V in V8 refer to?",
                options = listOf("The shape the cylinder banks make", "The voltage", "The valve count"),
                answerIndex = 0,
                explanation = "The two banks of cylinders form a V shape."
            )
        ),

        LearnPart(
            id = "boxer_engine",
            systemId = "engine",
            groupId = "engine_types",
            name = "Boxer engine",
            summary = "Pistons that punch toward each other",
            whatIs = "An engine with opposing cylinders laid flat, so the pistons move toward and away from each other. It is also called a flat engine.",
            whatItDoes = listOf(
                "Sits low in the car, which keeps the center of gravity low.",
                "Is used by some makers, such as Subaru and Porsche."
            ),
            relatedIds = listOf("inline_engine", "v_engine", "piston"),
            quiz = LearnQuiz(
                question = "How are the cylinders laid out in a boxer engine?",
                options = listOf("Opposing and horizontal", "In one straight row", "Stacked vertically"),
                answerIndex = 0,
                explanation = "They sit flat and face each other, so the pistons move toward and away from each other."
            )
        ),

        LearnPart(
            id = "rotary_engine",
            systemId = "engine",
            groupId = "engine_types",
            name = "Rotary engine",
            summary = "A spinning triangle instead of pistons",
            whatIs = "An engine that uses a rotating triangular rotor inside a specially shaped housing, instead of ordinary pistons.",
            whatItDoes = listOf(
                "Spins smoothly and is very compact.",
                "Is much less common today."
            ),
            relatedIds = listOf("piston", "inline_engine"),
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What does a rotary engine use instead of pistons?",
                options = listOf("A rotating triangular rotor", "A turbine only", "A belt"),
                answerIndex = 0,
                explanation = "A triangular rotor spins inside a shaped housing."
            )
        ),

        LearnPart(
            id = "two_stroke",
            systemId = "engine",
            groupId = "engine_types",
            name = "Two-stroke engine",
            summary = "A power stroke every turn",
            whatIs = "An engine that completes its operating cycle in two piston strokes, which is one turn of the crankshaft.",
            whatItDoes = listOf(
                "Makes power more often, so it can be light and simple.",
                "Is common in small engines, such as some scooters and chainsaws."
            ),
            relatedIds = listOf("four_stroke_engine", "four_stroke_cycle", "piston"),
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "How many piston strokes make up a two-stroke cycle?",
                options = listOf("Two", "Four", "Six"),
                answerIndex = 0,
                explanation = "It finishes the whole cycle in two strokes, in one crankshaft turn."
            )
        ),

        LearnPart(
            id = "four_stroke_engine",
            systemId = "engine",
            groupId = "engine_types",
            name = "Four-stroke engine",
            summary = "A power stroke every second turn",
            whatIs = "An engine that completes its operating cycle in four piston strokes, which is two turns of the crankshaft.",
            whatItDoes = listOf(
                "Is what most cars use.",
                "Is generally cleaner and more efficient than a two-stroke."
            ),
            relatedIds = listOf("two_stroke", "four_stroke_cycle", "crankshaft"),
            quiz = LearnQuiz(
                question = "How many crankshaft turns does one four-stroke cycle take?",
                options = listOf("Two", "One", "Four"),
                answerIndex = 0,
                explanation = "Four strokes take two full turns of the crankshaft."
            )
        )
    )
}