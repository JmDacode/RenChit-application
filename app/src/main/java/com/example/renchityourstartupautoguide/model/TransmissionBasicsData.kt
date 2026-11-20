package com.example.renchityourstartupautoguide.model

object TransmissionBasicsData {

    val groups = listOf(
        LearnGroup(
            id = "transmission_types",
            systemId = "transmission",
            title = "Transmission types",
            intro = "The different ways a car can change gears."
        ),
        LearnGroup(
            id = "transmission_manual",
            systemId = "transmission",
            title = "Manual transmission parts",
            intro = "What is inside a gearbox you shift yourself."
        )
    )

    val parts = listOf(

        // ---------- Transmission types ----------
        LearnPart(
            id = "manual_transmission",
            systemId = "transmission",
            groupId = "transmission_types",
            name = "Manual transmission",
            summary = "You change gears yourself",
            whatIs = "A gearbox where the driver picks the gear with a shifter and a clutch pedal.",
            whatItDoes = listOf(
                "Lets you choose a gear that suits your speed.",
                "Low gears give strong pulling power. High gears keep the engine calm at speed.",
                "Needs the clutch to disconnect the engine while you shift."
            ),
            location = "Attached to the back or side of the engine, depending on the car.",
            relatedIds = listOf("clutch", "transmission_gears", "synchronizers", "flywheel"),
            ifItFails = "Hard shifting, grinding when changing gear, popping out of gear, or a slipping clutch.",
            maintenance = "Change the gear oil at the interval in your owner's manual and check for leaks.",
            quiz = LearnQuiz(
                question = "What do you need to change gears in a manual car?",
                options = listOf("A clutch pedal and shifter", "A torque converter", "A second battery"),
                answerIndex = 0,
                explanation = "You press the clutch pedal and move the shifter to pick the gear."
            )
        ),

        LearnPart(
            id = "automatic_transmission",
            systemId = "transmission",
            groupId = "transmission_types",
            name = "Automatic transmission",
            summary = "The car changes gears for you",
            whatIs = "A gearbox that picks and changes gears by itself, using fluid pressure and a set of gears.",
            whatItDoes = listOf(
                "Shifts up and down without a clutch pedal.",
                "Uses a torque converter to link the engine to the gearbox.",
                "Uses fluid pressure and clutch packs to select gears."
            ),
            location = "Attached to the back or side of the engine, depending on the car.",
            relatedIds = listOf("flexplate", "torque_converter", "cvt", "dct"),
            ifItFails = "Delayed or harsh shifts, slipping, a burning smell, red fluid leaking under the car, or a warning light.",
            maintenance = "Check and change the transmission fluid at the interval in your owner's manual. Some gearboxes are called sealed but still need servicing.",
            quiz = LearnQuiz(
                question = "What does an automatic transmission do for the driver?",
                options = listOf("Changes gears by itself", "Cools the engine", "Filters the fuel"),
                answerIndex = 0,
                explanation = "It selects and changes gears automatically."
            )
        ),

        LearnPart(
            id = "cvt",
            systemId = "transmission",
            groupId = "transmission_types",
            name = "CVT",
            summary = "No fixed gears, just a smooth range",
            whatIs = "A continuously variable transmission. It uses a belt or chain between two pulleys that change width, instead of fixed gears.",
            whatItDoes = listOf(
                "Changes the ratio smoothly, with no noticeable shift points.",
                "Keeps the engine at an efficient speed.",
                "Is common in small and economy cars."
            ),
            location = "Attached to the front or side of the engine, depending on the car.",
            relatedIds = listOf("automatic_transmission", "dct"),
            ifItFails = "Shuddering, a whining noise, hesitation, or a feeling that the engine revs without the car speeding up.",
            maintenance = "Use the exact CVT fluid your manual calls for and change it on schedule.",
            quiz = LearnQuiz(
                question = "What does a CVT use instead of fixed gears?",
                options = listOf("A belt or chain between two pulleys", "A clutch pedal", "A drive shaft"),
                answerIndex = 0,
                explanation = "Pulleys that change width give it a smooth, endless range of ratios."
            )
        ),

        LearnPart(
            id = "dct",
            systemId = "transmission",
            groupId = "transmission_types",
            name = "Dual-clutch transmission",
            summary = "Two clutches for quick shifts",
            whatIs = "A gearbox with two clutches. One handles the odd gears and the other handles the even gears.",
            whatItDoes = listOf(
                "Gets the next gear ready while you are still in the current one.",
                "Shifts very quickly, with little loss of power.",
                "Works automatically, like an automatic car."
            ),
            location = "Attached to the back or side of the engine, depending on the car.",
            relatedIds = listOf("clutch", "automatic_transmission", "amt"),
            ifItFails = "Jerky movement at low speed, hesitation, or shuddering when pulling away.",
            maintenance = "Follow the fluid and service schedule in your manual. On a slope, hold the car with the brake and not by blipping the throttle.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "Why is a dual-clutch gearbox quick?",
                options = listOf(
                    "It readies the next gear in advance",
                    "It has no gears at all",
                    "It uses a bigger engine"
                ),
                answerIndex = 0,
                explanation = "One clutch holds the current gear while the other prepares the next one."
            )
        ),

        LearnPart(
            id = "amt",
            systemId = "transmission",
            groupId = "transmission_types",
            name = "Automated manual transmission",
            summary = "A manual gearbox that shifts itself",
            whatIs = "A manual gearbox with a computer and small motors that work the clutch and shift the gears for you.",
            whatItDoes = listOf(
                "Removes the clutch pedal.",
                "Costs less than a full automatic.",
                "Shifts can feel slower or jerkier than an automatic."
            ),
            location = "Attached to the back or side of the engine, depending on the car.",
            relatedIds = listOf("manual_transmission", "clutch", "dct"),
            ifItFails = "Slow or jerky shifts, a clutch that wears quickly, or the car refusing to shift.",
            maintenance = "Service the gear oil and clutch as your manual says.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What does an automated manual have that a normal manual does not?",
                options = listOf(
                    "Motors that work the clutch and shifts",
                    "A torque converter",
                    "A second engine"
                ),
                answerIndex = 0,
                explanation = "A computer and actuators do the clutch and gear changes."
            )
        ),

        // ---------- Manual transmission parts ----------
        LearnPart(
            id = "clutch",
            systemId = "transmission",
            groupId = "transmission_manual",
            name = "Clutch",
            summary = "Connects and disconnects the engine",
            whatIs = "A set of parts that links the engine to the manual gearbox, and lets you disconnect them when you press the clutch pedal.",
            whatItDoes = listOf(
                "Lets the car stop without stalling the engine.",
                "Lets you change gear smoothly.",
                "Takes up the drive gently when you pull away."
            ),
            location = "Between the engine and the transmission, inside the bell housing.",
            relatedIds = listOf("clutch_disc", "pressure_plate", "release_bearing", "flywheel"),
            ifItFails = "The engine revs but the car does not speed up (slipping), a burning smell, a stiff or sticky pedal, or hard shifting.",
            maintenance = "It is a wear part. It wears faster with riding the pedal, heavy towing, and holding the car on a hill with the clutch.",
            quiz = LearnQuiz(
                question = "What is the clutch for?",
                options = listOf(
                    "Connecting and disconnecting the engine from the gearbox",
                    "Cooling the engine",
                    "Storing fuel"
                ),
                answerIndex = 0,
                explanation = "It links the engine to the gearbox, and breaks that link when you press the pedal."
            )
        ),

        LearnPart(
            id = "clutch_disc",
            systemId = "transmission",
            groupId = "transmission_manual",
            name = "Clutch disc",
            summary = "The friction disc that grips the flywheel",
            whatIs = "A round plate covered in friction material that sits between the flywheel and the pressure plate.",
            whatItDoes = listOf(
                "Grips the flywheel to pass the engine's power to the gearbox.",
                "Slips a little to give a smooth start.",
                "Lets go when you press the clutch pedal."
            ),
            location = "On the input shaft, between the flywheel and the pressure plate.",
            relatedIds = listOf("flywheel", "pressure_plate", "input_shaft", "clutch"),
            ifItFails = "Slipping, shuddering when pulling away, a burning smell, or a clutch that bites very high up.",
            maintenance = "It is a wear part. It is usually replaced together with the pressure plate and release bearing as a kit.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "Which part does the clutch disc grip?",
                options = listOf("The flywheel", "The radiator", "The oil pan"),
                answerIndex = 0,
                explanation = "The disc is pressed against the flywheel to carry the engine's power."
            )
        ),

        LearnPart(
            id = "pressure_plate",
            systemId = "transmission",
            groupId = "transmission_manual",
            name = "Pressure plate",
            summary = "Squeezes the disc against the flywheel",
            whatIs = "A spring-loaded plate that clamps the clutch disc against the flywheel.",
            whatItDoes = listOf(
                "Holds the clutch disc tight so the drive does not slip.",
                "Releases the disc when you press the clutch pedal."
            ),
            location = "Bolted to the flywheel, on the other side of the clutch disc.",
            relatedIds = listOf("clutch_disc", "flywheel", "release_bearing", "clutch"),
            ifItFails = "A heavy or uneven pedal, slipping, or chattering when you pull away.",
            maintenance = "It is usually replaced together with the clutch disc.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What does the pressure plate do?",
                options = listOf(
                    "Clamps the clutch disc against the flywheel",
                    "Pumps the oil",
                    "Turns the wheels"
                ),
                answerIndex = 0,
                explanation = "Its springs squeeze the disc against the flywheel."
            )
        ),

        LearnPart(
            id = "release_bearing",
            systemId = "transmission",
            groupId = "transmission_manual",
            name = "Release bearing",
            summary = "Pushed by the pedal to free the clutch",
            whatIs = "A bearing that presses on the pressure plate when you push the clutch pedal. It is also called a throw-out bearing.",
            whatItDoes = listOf(
                "Passes the pedal's movement to the pressure plate.",
                "Lets a non-moving part press on a spinning one."
            ),
            location = "Around the input shaft, inside the bell housing.",
            relatedIds = listOf("pressure_plate", "input_shaft", "clutch"),
            ifItFails = "A whirring or squealing noise when the pedal is pressed in, or a rough pedal feel.",
            maintenance = "It is replaced together with the clutch kit.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "When does the release bearing work?",
                options = listOf(
                    "When you press the clutch pedal",
                    "When you turn the steering wheel",
                    "When you open the hood"
                ),
                answerIndex = 0,
                explanation = "Pressing the pedal pushes it against the pressure plate."
            )
        ),

        LearnPart(
            id = "input_shaft",
            systemId = "transmission",
            groupId = "transmission_manual",
            name = "Input shaft",
            summary = "Takes power in from the engine",
            whatIs = "The shaft that brings the engine's power into the gearbox.",
            whatItDoes = listOf(
                "Is turned by the clutch disc.",
                "Drives the gears inside the gearbox."
            ),
            location = "At the front of the gearbox, reaching into the bell housing.",
            relatedIds = listOf("clutch_disc", "output_shaft", "transmission_gears"),
            ifItFails = "Failures are rare. Worn bearings can cause whining or hard shifting.",
            maintenance = "Clean gear oil at the right level protects it.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "Which shaft takes power into the gearbox?",
                options = listOf("Input shaft", "Output shaft", "Camshaft"),
                answerIndex = 0,
                explanation = "The input shaft receives the engine's power through the clutch."
            )
        ),

        LearnPart(
            id = "output_shaft",
            systemId = "transmission",
            groupId = "transmission_manual",
            name = "Output shaft",
            summary = "Sends power out of the gearbox",
            whatIs = "The shaft that carries power out of the gearbox toward the driveshaft or axles.",
            whatItDoes = listOf(
                "Carries the gears that you select.",
                "Passes the power on to the rest of the drivetrain."
            ),
            location = "Inside the gearbox, at the rear or side, depending on the car.",
            relatedIds = listOf("input_shaft", "transmission_gears", "synchronizers", "driveshaft"),
            ifItFails = "Rare. Worn parts cause whining, vibration, or grinding.",
            maintenance = "Change the gear oil at the interval in your manual.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "Where does the output shaft send the power?",
                options = listOf(
                    "Toward the driveshaft or axles",
                    "Back to the engine",
                    "Into the radiator"
                ),
                answerIndex = 0,
                explanation = "It carries power out of the gearbox to the rest of the drivetrain."
            )
        ),

        LearnPart(
            id = "transmission_gears",
            systemId = "transmission",
            groupId = "transmission_manual",
            name = "Gears",
            summary = "Different sizes for different jobs",
            whatIs = "Toothed wheels of different sizes inside the gearbox.",
            whatItDoes = listOf(
                "Low gears provide more pulling power, making it easier for the vehicle to climb hills, carry heavy loads, and move from a stop.",
                "High gears allow the engine to run at lower RPMs while driving fast, helping the vehicle travel smoothly and save fuel",
                "Reverse gear allows the car to move backward by changing the direction of power sent from the engine to the wheels."
            ),
            location = "Inside the transmission, on the input and output shafts.",
            relatedIds = listOf("input_shaft", "output_shaft", "synchronizers", "shift_forks"),
            ifItFails = "Whining, grinding, or popping out of gear.",
            maintenance = "Clean gear oil at the right level slows down wear.",
            quiz = LearnQuiz(
                question = "What do low gears give you?",
                options = listOf("Strong pulling power", "Better fuel economy on the highway", "A cooler engine"),
                answerIndex = 0,
                explanation = "Low gears multiply the engine's force, which helps when starting or climbing."
            )
        ),

        LearnPart(
            id = "synchronizers",
            systemId = "transmission",
            groupId = "transmission_manual",
            name = "Synchronizers",
            summary = "Make shifting smooth",
            whatIs = "Rings that match the speed of a gear to the shaft before the two lock together.",
            whatItDoes = listOf(
                "Prevent grinding when you change gear.",
                "Let the gear and shaft spin at the same speed before they connect."
            ),
            location = "On the shafts, next to each gear.",
            relatedIds = listOf("transmission_gears", "shift_forks", "output_shaft"),
            ifItFails = "Grinding when shifting into a certain gear, especially in quick shifts.",
            maintenance = "Use the right gear oil, and press the clutch pedal fully before every shift.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What do synchronizers prevent?",
                options = listOf("Grinding when shifting", "Overheating", "Oil leaks"),
                answerIndex = 0,
                explanation = "They match speeds so the gear can lock smoothly."
            )
        ),

        LearnPart(
            id = "shift_forks",
            systemId = "transmission",
            groupId = "transmission_manual",
            name = "Shift forks",
            summary = "Move the parts that select a gear",
            whatIs = "Fork-shaped arms that slide the synchronizers along the shaft when you move the shifter.",
            whatItDoes = listOf(
                "Connect the shifter to the gears.",
                "Slide a gear into place when you pick it."
            ),
            location = "Inside the gearbox, connected to the shift rails.",
            relatedIds = listOf("synchronizers", "transmission_gears", "manual_transmission"),
            ifItFails = "Hard shifting, getting stuck in gear, or popping out of gear.",
            maintenance = "Not a routine service. Avoid resting your hand on the shifter while driving.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What do shift forks do?",
                options = listOf(
                    "Slide the gear selection parts",
                    "Pump the fuel",
                    "Cool the oil"
                ),
                answerIndex = 0,
                explanation = "They move the synchronizers so the gear you chose engages."
            )
        )
    )
}