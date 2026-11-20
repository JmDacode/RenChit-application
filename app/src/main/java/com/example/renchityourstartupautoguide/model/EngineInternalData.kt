package com.example.renchityourstartupautoguide.model

object EngineInternalData {

    val groups = listOf(
        LearnGroup(
            id = "engine_internal",
            systemId = "engine",
            title = "Internal components",
            intro = "The major parts that produce and control engine power."
        )
    )

    val parts = listOf(

        LearnPart(
            id = "engine_block",
            systemId = "engine",
            groupId = "engine_internal",
            name = "Engine block",
            summary = "The main body of the engine",
            whatIs = "The big metal casting that forms the main body of the engine.",
            whatItDoes = listOf(
                "Holds the cylinders where combustion happens.",
                "Supports the crankshaft and other moving parts.",
                "Has passages inside for oil and coolant."
            ),
            location = "At the center of the engine, under the cylinder head.",
            relatedIds = listOf("cylinder_head", "cylinder", "crankshaft", "head_gasket"),
            ifItFails = "Cracks are rare but serious. Look for coolant or oil leaking from the block and for overheating.",
            maintenance = "There is nothing to service on it directly. Regular oil changes and a healthy cooling system protect it.",
            quiz = LearnQuiz(
                question = "Which part holds the cylinders?",
                options = listOf("Oil pan", "Engine block", "Flywheel"),
                answerIndex = 1,
                explanation = "The engine block is the main body that houses the cylinders."
            )
        ),

        LearnPart(
            id = "cylinder_head",
            systemId = "engine",
            groupId = "engine_internal",
            name = "Cylinder head",
            summary = "The lid that holds the valves",
            whatIs = "A metal part that bolts onto the top of the engine block and closes off the cylinders.",
            whatItDoes = listOf(
                "Holds the intake and exhaust valves.",
                "In many engines, also holds the camshaft and fuel injectors.",
                "Forms the top of each combustion chamber."
            ),
            location = "On top of the engine block, with the head gasket in between.",
            relatedIds = listOf("head_gasket", "engine_block", "intake_valve", "exhaust_valve", "camshaft"),
            ifItFails = "A warped or cracked head can cause overheating, coolant loss, rough running, and loss of power.",
            maintenance = "It is not a service item. Overheating is what damages it most, so watch the temperature gauge and keep the coolant topped up.",
            quiz = LearnQuiz(
                question = "What sits between the cylinder head and the engine block?",
                options = listOf("Head gasket", "Piston ring", "Oil filter"),
                answerIndex = 0,
                explanation = "The head gasket seals the gap between the cylinder head and the engine block."
            )
        ),

        LearnPart(
            id = "head_gasket",
            systemId = "engine",
            groupId = "engine_internal",
            name = "Head gasket",
            summary = "The seal between the block and the head",
            whatIs = "A thin seal that sits between the engine block and the cylinder head.",
            whatItDoes = listOf(
                "Keeps the pressure of the explosion inside the cylinders.",
                "Stops engine oil and coolant from mixing.",
                "Seals the paths that carry fluids through the engine."
            ),
            location = "Between the engine block and the cylinder head.",
            relatedIds = listOf("cylinder_head", "engine_block", "piston", "water_jackets"),
            ifItFails = "The engine overheats, coolant goes missing, white smoke comes from the exhaust, and oil can look milky. Stop driving and have it checked.",
            maintenance = "It is not a routine replacement part. A mechanic checks it only when symptoms show up. Keeping the coolant topped up helps protect it.",
            quiz = LearnQuiz(
                question = "What is the main job of a head gasket?",
                options = listOf(
                    "To circulate engine oil",
                    "To seal the engine block and cylinder head",
                    "To control when the valves open"
                ),
                answerIndex = 1,
                explanation = "It seals the gap between the engine block and the cylinder head."
            )
        ),

        LearnPart(
            id = "cylinder",
            systemId = "engine",
            groupId = "engine_internal",
            name = "Cylinder",
            summary = "Where the piston moves and fuel burns",
            whatIs = "The round chamber inside the engine block where the piston moves up and down.",
            whatItDoes = listOf(
                "Gives the piston a smooth path to travel.",
                "Is where air and fuel burn to make power.",
                "A car has several of them, such as 4, 6, or 8."
            ),
            location = "Inside the engine block.",
            relatedIds = listOf("piston", "cylinder_liner", "piston_rings", "cylinder_head"),
            ifItFails = "Worn or scratched cylinder walls cause loss of compression, oil burning, blue smoke, and weak power.",
            maintenance = "Regular oil changes keep the walls lubricated and slow down wear.",
            quiz = LearnQuiz(
                question = "What happens inside a cylinder?",
                options = listOf(
                    "Fuel is stored",
                    "Air and fuel burn and push the piston",
                    "Coolant is filtered"
                ),
                answerIndex = 1,
                explanation = "Combustion happens in the cylinder and pushes the piston down."
            )
        ),

        LearnPart(
            id = "cylinder_liner",
            systemId = "engine",
            groupId = "engine_internal",
            name = "Cylinder liner",
            summary = "A wear surface inside the cylinder",
            whatIs = "A sleeve that lines the inside of the cylinder in some engines. In others, the block's own surface does this job.",
            whatItDoes = listOf(
                "Gives the piston a hard, durable surface to slide against.",
                "Can be replaced in some engines when it wears out."
            ),
            location = "Inside the cylinder, against the engine block wall.",
            relatedIds = listOf("cylinder", "piston", "piston_rings", "engine_block"),
            ifItFails = "Wear or cracks can cause oil burning, loss of compression, and coolant leaking into the cylinder.",
            maintenance = "It is not a routine service. Clean oil and proper cooling protect it.",
            quiz = LearnQuiz(
                question = "What is a cylinder liner for?",
                options = listOf(
                    "To give the piston a durable surface to slide on",
                    "To cool the exhaust",
                    "To filter the fuel"
                ),
                answerIndex = 0,
                explanation = "The liner is a tough wear surface for the piston."
            )
        ),

        LearnPart(
            id = "piston",
            systemId = "engine",
            groupId = "engine_internal",
            name = "Piston",
            summary = "Pushed down by each small explosion",
            whatIs = "A metal plug that moves up and down inside the cylinder.",
            whatItDoes = listOf(
                "Is pushed down by the force of combustion.",
                "Squeezes the air or air-fuel mix when it moves up.",
                "Passes its force to the crankshaft through the connecting rod."
            ),
            location = "Inside the cylinder, attached to the connecting rod.",
            relatedIds = listOf("cylinder", "piston_rings", "connecting_rod", "crankshaft"),
            ifItFails = "A damaged piston can cause knocking sounds, loss of power, blue smoke, and in bad cases serious engine damage.",
            maintenance = "It is not serviced directly. Clean oil, the right fuel, and a cool engine keep it healthy.",
            quiz = LearnQuiz(
                question = "What pushes the piston down?",
                options = listOf("The force of combustion", "The oil pump", "The radiator"),
                answerIndex = 0,
                explanation = "Combustion pushes the piston down, which creates the engine's power."
            )
        ),

        LearnPart(
            id = "piston_rings",
            systemId = "engine",
            groupId = "engine_internal",
            name = "Piston rings",
            summary = "Seal the piston and control oil",
            whatIs = "Thin metal rings that fit into grooves around the piston.",
            whatItDoes = listOf(
                "Seal the gap between the piston and the cylinder wall so pressure stays in.",
                "Wipe extra oil off the cylinder wall.",
                "Pass heat from the piston to the cylinder wall."
            ),
            location = "Around the piston, inside the cylinder.",
            relatedIds = listOf("piston", "cylinder", "cylinder_liner", "engine_oil"),
            ifItFails = "Worn rings cause blue smoke, oil burning, a low oil level, and weaker power.",
            maintenance = "Regular oil changes slow down ring wear.",
            quiz = LearnQuiz(
                question = "What is one job of the piston rings?",
                options = listOf(
                    "To seal combustion pressure",
                    "To open the valves",
                    "To cool the coolant"
                ),
                answerIndex = 0,
                explanation = "The rings seal the piston against the cylinder wall so pressure stays inside."
            )
        ),

        LearnPart(
            id = "connecting_rod",
            systemId = "engine",
            groupId = "engine_internal",
            name = "Connecting rod",
            summary = "Links the piston to the crankshaft",
            whatIs = "A strong metal arm that connects each piston to the crankshaft.",
            whatItDoes = listOf(
                "Carries the piston's force down to the crankshaft.",
                "Helps turn the up-and-down motion into rotation."
            ),
            location = "Between the piston and the crankshaft, inside the engine block.",
            relatedIds = listOf("piston", "crankshaft", "engine_bearings"),
            ifItFails = "A worn rod bearing causes a deep knocking sound. A broken rod can destroy the engine.",
            maintenance = "It depends on good oil pressure and regular oil changes. Do not ignore a knocking sound.",
            quiz = LearnQuiz(
                question = "What does the connecting rod link together?",
                options = listOf(
                    "The piston and the crankshaft",
                    "The radiator and the fan",
                    "The camshaft and the valve"
                ),
                answerIndex = 0,
                explanation = "It connects each piston to the crankshaft."
            )
        ),

        LearnPart(
            id = "crankshaft",
            systemId = "engine",
            groupId = "engine_internal",
            name = "Crankshaft",
            summary = "Turns up and down into spinning",
            whatIs = "A rotating shaft connected to the pistons through the connecting rods.",
            whatItDoes = listOf(
                "Changes the pistons' up-and-down movement into spinning.",
                "Sends that spin on to the transmission through the flywheel or flexplate."
            ),
            location = "Inside the lower part of the engine block.",
            relatedIds = listOf("connecting_rod", "piston", "engine_bearings", "flywheel", "crankshaft_sprocket"),
            ifItFails = "Bearing wear or a lack of oil can cause knocking, vibration, and a drop in oil pressure.",
            maintenance = "It relies on correct oil pressure, clean oil, and scheduled servicing.",
            whyItMatters = "Without it, the engine's power could not reach the wheels.",
            quiz = LearnQuiz(
                question = "What does the crankshaft do?",
                options = listOf(
                    "Turns up-and-down motion into spinning",
                    "Filters the engine oil",
                    "Cools the cylinder head"
                ),
                answerIndex = 0,
                explanation = "The crankshaft changes the pistons' movement into rotation."
            )
        ),

        LearnPart(
            id = "camshaft",
            systemId = "engine",
            groupId = "engine_internal",
            name = "Camshaft",
            summary = "Opens and closes the engine's doors",
            whatIs = "A rotating shaft with egg-shaped bumps called lobes.",
            whatItDoes = listOf(
                "Pushes the intake and exhaust valves open at the right moment.",
                "Is timed to the crankshaft by a belt, chain, or gears."
            ),
            location = "In the cylinder head in many engines. Some older designs have it in the block.",
            relatedIds = listOf("crankshaft", "intake_valve", "exhaust_valve", "valve_spring", "timing_chain"),
            ifItFails = "Worn lobes cause ticking noises, rough running, and loss of power.",
            maintenance = "Clean oil is the key. Skipping oil changes wears it out faster.",
            quiz = LearnQuiz(
                question = "What does the camshaft control?",
                options = listOf(
                    "When the valves open and close",
                    "How much oil is in the pan",
                    "How hot the coolant gets"
                ),
                answerIndex = 0,
                explanation = "Its lobes push the valves open at the right moment."
            )
        ),

        LearnPart(
            id = "intake_valve",
            systemId = "engine",
            groupId = "engine_internal",
            name = "Intake valve",
            summary = "Lets air in",
            whatIs = "A valve that opens to let air into the cylinder. In some engines it lets in an air-fuel mix.",
            whatItDoes = listOf(
                "Opens during the intake stroke.",
                "Closes tightly during compression and combustion."
            ),
            location = "In the cylinder head, on the intake side of each cylinder.",
            relatedIds = listOf("camshaft", "valve_spring", "exhaust_valve", "cylinder_head"),
            ifItFails = "A leaking or burnt valve causes a rough idle, misfires, and loss of power.",
            maintenance = "Some engines need valve clearance checks at set intervals. Check your owner's manual.",
            quiz = LearnQuiz(
                question = "What does the intake valve let into the cylinder?",
                options = listOf("Air", "Burnt gases", "Engine oil"),
                answerIndex = 0,
                explanation = "It lets air in. Burnt gases leave through the exhaust valve."
            )
        ),

        LearnPart(
            id = "exhaust_valve",
            systemId = "engine",
            groupId = "engine_internal",
            name = "Exhaust valve",
            summary = "Lets burnt gas out",
            whatIs = "A valve that opens to let burnt gases leave the cylinder.",
            whatItDoes = listOf(
                "Opens at the end of the power stroke.",
                "Lets the burnt gas flow out toward the exhaust system."
            ),
            location = "In the cylinder head, on the exhaust side of each cylinder.",
            relatedIds = listOf("camshaft", "valve_spring", "intake_valve", "cylinder_head"),
            ifItFails = "A burnt exhaust valve causes misfires, rough running, and loss of compression.",
            maintenance = "It runs hotter than the intake valve. Keeping the engine cool and the timing correct protects it.",
            quiz = LearnQuiz(
                question = "Which valve lets burnt gas leave the cylinder?",
                options = listOf("Intake valve", "Exhaust valve", "Oil valve"),
                answerIndex = 1,
                explanation = "The exhaust valve opens to let burnt gases out."
            )
        ),

        LearnPart(
            id = "valve_spring",
            systemId = "engine",
            groupId = "engine_internal",
            name = "Valve spring",
            summary = "Closes the valve again",
            whatIs = "A coiled spring that sits around each valve stem.",
            whatItDoes = listOf(
                "Pushes the valve shut after the camshaft stops pushing it open.",
                "Keeps the valve following the camshaft at high engine speeds."
            ),
            location = "In the cylinder head, around each valve.",
            relatedIds = listOf("intake_valve", "exhaust_valve", "camshaft", "rocker_arm"),
            ifItFails = "A weak or broken spring can cause misfires, a ticking noise, and loss of power.",
            maintenance = "It is not a routine service. A mechanic checks it if valve problems show up.",
            quiz = LearnQuiz(
                question = "What does a valve spring do?",
                options = listOf(
                    "Pushes the valve back closed",
                    "Pumps the oil",
                    "Starts the engine"
                ),
                answerIndex = 0,
                explanation = "It pushes the valve shut once the camshaft lobe moves away."
            )
        ),

        LearnPart(
            id = "rocker_arm",
            systemId = "engine",
            groupId = "engine_internal",
            name = "Rocker arm",
            summary = "Passes camshaft movement to a valve",
            whatIs = "A small lever that pivots to push a valve open. Not every engine has them.",
            whatItDoes = listOf(
                "Takes movement from the camshaft or valve train and presses on the valve.",
                "Can multiply that movement so the valve opens wider."
            ),
            location = "In the cylinder head, above the valves, in engines that use them.",
            relatedIds = listOf("camshaft", "lifter", "intake_valve", "exhaust_valve"),
            ifItFails = "Worn rocker arms cause ticking or tapping noises and uneven running.",
            maintenance = "Clean oil and correct valve clearance protect them.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What does a rocker arm do?",
                options = listOf(
                    "Pushes a valve open",
                    "Cools the coolant",
                    "Filters the air"
                ),
                answerIndex = 0,
                explanation = "It acts as a lever that presses a valve open."
            )
        ),

        LearnPart(
            id = "lifter",
            systemId = "engine",
            groupId = "engine_internal",
            name = "Lifter or tappet",
            summary = "Follows the camshaft",
            whatIs = "A small part that rides on the camshaft lobe and passes the movement on. It is also called a tappet.",
            whatItDoes = listOf(
                "Passes camshaft movement to other valve parts, or directly to the valve.",
                "In many designs, uses oil pressure to keep the valve clearance correct."
            ),
            location = "Between the camshaft and the valve, in the cylinder head or block.",
            relatedIds = listOf("camshaft", "rocker_arm", "intake_valve", "engine_oil"),
            ifItFails = "A worn or dirty lifter makes a ticking sound, especially when the engine is cold.",
            maintenance = "Clean oil at the right level is key. Do not ignore a ticking sound that does not go away.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "Which part does a lifter ride on?",
                options = listOf("The camshaft lobe", "The oil pan", "The radiator"),
                answerIndex = 0,
                explanation = "The lifter follows the camshaft lobe and passes its movement on."
            )
        ),

        LearnPart(
            id = "engine_bearings",
            systemId = "engine",
            groupId = "engine_internal",
            name = "Engine bearings",
            summary = "Smooth surfaces for spinning parts",
            whatIs = "Thin, smooth metal shells that cushion rotating parts such as the crankshaft and connecting rods.",
            whatItDoes = listOf(
                "Reduce friction between moving parts.",
                "Work with a thin film of oil, so the parts never touch metal to metal."
            ),
            location = "Around the crankshaft and at the end of each connecting rod.",
            relatedIds = listOf("crankshaft", "connecting_rod", "engine_oil", "oil_pump"),
            ifItFails = "Worn bearings cause knocking, low oil pressure, and in bad cases engine failure.",
            maintenance = "Regular oil changes and the correct oil level protect them.",
            quiz = LearnQuiz(
                question = "What do engine bearings reduce?",
                options = listOf("Friction", "Fuel use", "Exhaust smoke"),
                answerIndex = 0,
                explanation = "They let parts spin smoothly by reducing friction."
            )
        ),

        LearnPart(
            id = "flywheel",
            systemId = "engine",
            groupId = "engine_internal",
            name = "Flywheel",
            summary = "Smooths the engine's spin",
            whatIs = "A heavy metal disc bolted to the end of the crankshaft.",
            whatItDoes = listOf(
                "Stores spinning energy to keep the engine turning smoothly between power strokes.",
                "In manual cars, gives the clutch a surface to grip.",
                "Has teeth that the starter motor uses to start the engine."
            ),
            location = "At the back of the engine, between the engine and the transmission.",
            relatedIds = listOf("crankshaft", "flexplate"),
            ifItFails = "Problems cause vibration, a shuddering clutch, or grinding noises when starting.",
            maintenance = "It is usually checked when the clutch is replaced.",
            quiz = LearnQuiz(
                question = "What does the flywheel help with?",
                options = listOf(
                    "Keeping the engine's spin smooth",
                    "Cooling the oil",
                    "Filtering the air"
                ),
                answerIndex = 0,
                explanation = "It stores spinning energy and smooths out the engine's rotation."
            )
        ),

        LearnPart(
            id = "flexplate",
            systemId = "engine",
            groupId = "engine_internal",
            name = "Flexplate",
            summary = "The flywheel's partner in automatics",
            whatIs = "A thin metal plate that connects the crankshaft to the torque converter in many automatic cars.",
            whatItDoes = listOf(
                "Passes the engine's spin into the automatic transmission.",
                "Has teeth for the starter motor, like a flywheel."
            ),
            location = "At the back of the engine, between the engine and the transmission.",
            relatedIds = listOf("crankshaft", "flywheel"),
            ifItFails = "A cracked flexplate can cause vibration, rattling, or a clunk when starting.",
            maintenance = "It is not routine. It is checked when the transmission is removed.",
            quiz = LearnQuiz(
                question = "Which kind of car usually has a flexplate?",
                options = listOf("Automatic", "Manual", "Bicycle"),
                answerIndex = 0,
                explanation = "Many automatic cars use a flexplate instead of a flywheel."
            )
        ),

        LearnPart(
            id = "oil_pan",
            systemId = "engine",
            groupId = "engine_internal",
            name = "Oil pan",
            summary = "Holds the engine oil",
            whatIs = "A metal pan bolted under the engine that holds the engine's oil.",
            whatItDoes = listOf(
                "Stores the oil the engine uses.",
                "Lets oil drain back to the bottom, ready to be pumped around again.",
                "Has a drain plug used for oil changes."
            ),
            location = "At the very bottom of the engine.",
            relatedIds = listOf("engine_oil", "oil_pump", "oil_pickup_tube", "engine_block"),
            ifItFails = "A leak or crack means oil loss. Look for oil drips under the car and a low oil warning. Stop driving if the oil is low.",
            maintenance = "Check it for leaks and damage. The drain plug is opened at each oil change.",
            quiz = LearnQuiz(
                question = "Where is the oil pan?",
                options = listOf(
                    "At the bottom of the engine",
                    "On top of the engine",
                    "Inside the radiator"
                ),
                answerIndex = 0,
                explanation = "It sits under the engine and holds the oil."
            )
        )
    )
}