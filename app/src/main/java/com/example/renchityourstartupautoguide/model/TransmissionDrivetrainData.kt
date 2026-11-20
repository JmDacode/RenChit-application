package com.example.renchityourstartupautoguide.model

object TransmissionDrivetrainData {

    val groups = listOf(
        LearnGroup(
            id = "transmission_automatic",
            systemId = "transmission",
            title = "Automatic transmission parts",
            intro = "What happens inside an automatic gearbox to change gears for you."
        ),
        LearnGroup(
            id = "transmission_drivetrain",
            systemId = "transmission",
            title = "Drivetrain",
            intro = "The parts that carry power from the transmission to the wheels."
        ),
        LearnGroup(
            id = "transmission_4wd",
            systemId = "transmission",
            title = "4WD and AWD",
            intro = "How power is shared between the front and rear wheels."
        )
    )

    val parts = listOf(

        // ---------- Automatic transmission parts ----------
        LearnPart(
            id = "torque_converter",
            systemId = "transmission",
            groupId = "transmission_automatic",
            name = "Torque converter",
            summary = "Links the engine to an automatic",
            whatIs = "A fluid coupling that connects the engine to an automatic transmission. It takes the place of the clutch.",
            whatItDoes = listOf(
                "Lets the engine keep running while the car is stopped in gear.",
                "Passes engine power to the transmission through fluid.",
                "Can multiply torque when pulling away."
            ),
            location = "Between the engine and the automatic transmission, inside the bell housing.",
            relatedIds = listOf("automatic_transmission", "flexplate", "transmission_fluid", "planetary_gearset"),
            ifItFails = "Shuddering when you accelerate, slipping, overheating, or strange whining noises.",
            maintenance = "Fresh transmission fluid on schedule is the best protection.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What does the torque converter replace in an automatic?",
                options = listOf("The clutch pedal and clutch", "The radiator", "The fuel pump"),
                answerIndex = 0,
                explanation = "It lets the engine and transmission connect through fluid, so you do not need a clutch pedal."
            )
        ),

        LearnPart(
            id = "planetary_gearset",
            systemId = "transmission",
            groupId = "transmission_automatic",
            name = "Planetary gear sets",
            summary = "The gears inside an automatic",
            whatIs = "A compact set of gears made of a center sun gear, planet gears around it, and an outer ring gear.",
            whatItDoes = listOf(
                "Create the different gear ratios in an automatic.",
                "Change ratio by holding or releasing different parts of the set."
            ),
            location = "Inside the automatic transmission.",
            relatedIds = listOf("clutch_packs", "torque_converter", "valve_body"),
            ifItFails = "Grinding or whining noises, slipping, or a gear that does not engage.",
            maintenance = "Clean fluid on schedule keeps them lubricated.",
            level = "Advanced",
            quiz = LearnQuiz(
                question = "Which of these is part of a planetary gear set?",
                options = listOf("Sun gear", "Spark plug", "Radiator cap"),
                answerIndex = 0,
                explanation = "A planetary gear set has a sun gear, planet gears and a ring gear."
            )
        ),

        LearnPart(
            id = "clutch_packs",
            systemId = "transmission",
            groupId = "transmission_automatic",
            name = "Clutch packs",
            summary = "Hold or release the gear parts",
            whatIs = "Stacks of thin friction plates and steel plates inside an automatic transmission.",
            whatItDoes = listOf(
                "Are squeezed by fluid pressure to lock parts of the gear sets together.",
                "Choose which gear the transmission is in."
            ),
            location = "Inside the automatic transmission, around the planetary gear sets.",
            relatedIds = listOf("planetary_gearset", "valve_body", "transmission_fluid"),
            ifItFails = "Slipping, delayed shifts, or a burnt smell from the fluid.",
            maintenance = "Do not tow beyond the limit. Keep the fluid fresh and at the right level.",
            level = "Advanced",
            quiz = LearnQuiz(
                question = "What squeezes the clutch packs together?",
                options = listOf("Fluid pressure", "Spark plugs", "The radiator"),
                answerIndex = 0,
                explanation = "Hydraulic pressure presses the plates together to lock a gear."
            )
        ),

        LearnPart(
            id = "valve_body",
            systemId = "transmission",
            groupId = "transmission_automatic",
            name = "Valve body",
            summary = "The hydraulic brain",
            whatIs = "A maze of channels and valves that directs fluid to the right places in an automatic.",
            whatItDoes = listOf(
                "Sends fluid to the clutch packs so the transmission shifts.",
                "Works with the solenoids to control shift timing."
            ),
            location = "Usually at the bottom of the automatic transmission, above the pan.",
            relatedIds = listOf("solenoids", "clutch_packs", "transmission_oil_pump"),
            ifItFails = "Harsh, late or missed shifts, or the car stuck in one gear.",
            maintenance = "Clean fluid helps keep the tiny valves from sticking.",
            level = "Advanced",
            quiz = LearnQuiz(
                question = "What does the valve body do?",
                options = listOf("Directs fluid to shift gears", "Cools the engine", "Stores fuel"),
                answerIndex = 0,
                explanation = "It routes pressurized fluid to the parts that change gear."
            )
        ),

        LearnPart(
            id = "solenoids",
            systemId = "transmission",
            groupId = "transmission_automatic",
            name = "Transmission solenoids",
            summary = "Electric switches for the fluid",
            whatIs = "Small electric valves that open and close fluid passages when the computer tells them to.",
            whatItDoes = listOf(
                "Turn the computer's signals into fluid movement.",
                "Control when the transmission shifts."
            ),
            location = "Mounted on the valve body inside the transmission.",
            relatedIds = listOf("valve_body", "clutch_packs"),
            ifItFails = "Shifting problems, being stuck in one gear, or a warning light.",
            maintenance = "A mechanic diagnoses them with a scan tool. Fresh fluid helps.",
            level = "Advanced",
            quiz = LearnQuiz(
                question = "What tells the solenoids when to act?",
                options = listOf("The computer", "The tires", "The radiator"),
                answerIndex = 0,
                explanation = "The control computer switches them on and off."
            )
        ),

        LearnPart(
            id = "transmission_oil_pump",
            systemId = "transmission",
            groupId = "transmission_automatic",
            name = "Transmission oil pump",
            summary = "Builds the transmission's pressure",
            whatIs = "A pump that pushes fluid through an automatic transmission.",
            whatItDoes = listOf(
                "Creates the fluid pressure needed to shift.",
                "Keeps the parts lubricated and cooled."
            ),
            location = "At the front of the automatic transmission, driven by the torque converter.",
            relatedIds = listOf("valve_body", "transmission_fluid", "torque_converter"),
            ifItFails = "Whining, slipping, no movement in gear, or overheating.",
            maintenance = "Clean fluid at the right level protects it.",
            level = "Advanced",
            quiz = LearnQuiz(
                question = "What does this pump create?",
                options = listOf("Fluid pressure for shifting", "Spark", "Tire pressure"),
                answerIndex = 0,
                explanation = "The automatic depends on this pressure to change gears."
            )
        ),

        LearnPart(
            id = "transmission_fluid_cooler",
            systemId = "transmission",
            groupId = "transmission_automatic",
            name = "Transmission fluid cooler",
            summary = "Keeps the fluid from overheating",
            whatIs = "A small heat exchanger that cools automatic transmission fluid.",
            whatItDoes = listOf(
                "Removes heat from the fluid.",
                "Matters most when towing, climbing hills, or driving in heat."
            ),
            location = "Often built into or beside the radiator, connected by two small lines.",
            relatedIds = listOf("transmission_fluid", "radiator"),
            ifItFails = "A leak can lose fluid or mix it with coolant. Overheating destroys the transmission.",
            maintenance = "Check the lines for leaks, and keep the fluid fresh.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "Why is an overheated transmission a problem?",
                options = listOf("Hot fluid wears parts out fast", "It makes the car lighter", "It saves fuel"),
                answerIndex = 0,
                explanation = "Heat breaks down the fluid and damages clutches and seals."
            )
        ),

        LearnPart(
            id = "transmission_fluid",
            systemId = "transmission",
            groupId = "transmission_automatic",
            name = "Transmission fluid",
            summary = "The oil of the gearbox",
            whatIs = "The special oil that lubricates the transmission. In an automatic it also builds hydraulic pressure.",
            whatItDoes = listOf(
                "Cuts friction and wear.",
                "Carries heat away.",
                "In an automatic, makes the shifts happen."
            ),
            location = "Inside the transmission, with a dipstick or a check plug.",
            relatedIds = listOf("torque_converter", "transmission_oil_pump", "transmission_fluid_cooler", "clutch_packs"),
            ifItFails = "Dark, burnt-smelling or low fluid causes slipping, rough shifts and overheating.",
            maintenance = "Use only the type in your manual. Check the level and replace it on schedule.",
            whyItMatters = "Wrong fluid is a common way to damage an automatic.",
            quiz = LearnQuiz(
                question = "What should you use to top up transmission fluid?",
                options = listOf("The type in your manual", "Any oil", "Water"),
                answerIndex = 0,
                explanation = "Different transmissions need different fluids, so follow the manual."
            )
        ),

        // ---------- Drivetrain ----------
        LearnPart(
            id = "driveshaft",
            systemId = "transmission",
            groupId = "transmission_drivetrain",
            name = "Driveshaft",
            summary = "Carries power to the rear",
            whatIs = "A long spinning tube that carries power from the transmission to the rear axle, in rear-wheel and four-wheel drive cars.",
            whatItDoes = listOf(
                "Transfers rotation along the length of the vehicle.",
                "Flexes with joints as the suspension moves."
            ),
            location = "Under the car, running from the transmission toward the rear differential.",
            relatedIds = listOf("universal_joints", "differential", "transfer_case"),
            ifItFails = "Vibration that grows with speed, clunking when shifting, or a squeak from the joints.",
            maintenance = "Have the joints and center support checked during service.",
            quiz = LearnQuiz(
                question = "What does the driveshaft carry?",
                options = listOf("Power to the wheels", "Coolant", "Fuel"),
                answerIndex = 0,
                explanation = "It carries rotation from the transmission to the axle."
            )
        ),

        LearnPart(
            id = "universal_joints",
            systemId = "transmission",
            groupId = "transmission_drivetrain",
            name = "Universal joints",
            summary = "Let the driveshaft bend",
            whatIs = "Cross-shaped joints that let a shaft keep spinning while it changes angle. Also called U-joints.",
            whatItDoes = listOf(
                "Let the driveshaft move with the suspension.",
                "Connect shafts that are not in a straight line."
            ),
            location = "At the ends of the driveshaft.",
            relatedIds = listOf("driveshaft", "cv_joints"),
            ifItFails = "A clunk when changing between drive and reverse, squeaking, or vibration.",
            maintenance = "Some have grease fittings. Others are sealed and replaced when worn.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What does a U-joint allow?",
                options = listOf("A shaft to spin at an angle", "Oil to flow", "Air to enter"),
                answerIndex = 0,
                explanation = "It lets power pass through a bend."
            )
        ),

        LearnPart(
            id = "cv_joints",
            systemId = "transmission",
            groupId = "transmission_drivetrain",
            name = "CV joints",
            summary = "Smooth turning for front wheels",
            whatIs = "Constant velocity joints that pass power smoothly through a wide range of angles. They are common on front-wheel-drive cars.",
            whatItDoes = listOf(
                "Let the wheels turn and move up and down while still being driven.",
                "Sit inside rubber boots filled with grease."
            ),
            location = "At each end of the front drive axles, behind the wheels.",
            relatedIds = listOf("axles", "wheel_hubs", "universal_joints"),
            ifItFails = "A clicking sound when turning, grease on the inside of the wheel, or vibration.",
            maintenance = "Check the rubber boots for tears. A torn boot lets the grease out and dirt in.",
            quiz = LearnQuiz(
                question = "What is a common sign of a worn CV joint?",
                options = listOf("Clicking when turning", "A hot engine", "A flat battery"),
                answerIndex = 0,
                explanation = "A clicking noise on turns is the classic warning."
            )
        ),

        LearnPart(
            id = "differential",
            systemId = "transmission",
            groupId = "transmission_drivetrain",
            name = "Differential",
            summary = "Lets the wheels turn at different speeds",
            whatIs = "A gearbox on the axle that splits power between the left and right wheels.",
            whatItDoes = listOf(
                "Lets the outer wheel spin faster than the inner wheel in a turn.",
                "Includes the final drive gears that reduce speed and add torque."
            ),
            location = "Between the drive wheels, at the front, rear, or both.",
            relatedIds = listOf("driveshaft", "axles", "locking_differentials"),
            ifItFails = "Whining or howling that changes with speed, clunking in turns, or oil leaks.",
            maintenance = "It has its own gear oil, which needs checking and replacing on schedule.",
            whyItMatters = "Without it, tires would scrub and hop in every turn.",
            quiz = LearnQuiz(
                question = "Why do we need a differential?",
                options = listOf(
                    "Wheels turn at different speeds in a turn",
                    "To cool the engine",
                    "To filter the oil"
                ),
                answerIndex = 0,
                explanation = "The outer wheel travels farther than the inner one in a corner."
            )
        ),

        LearnPart(
            id = "axles",
            systemId = "transmission",
            groupId = "transmission_drivetrain",
            name = "Axles",
            summary = "Send power to the wheels",
            whatIs = "Shafts that carry power from the differential to the wheels.",
            whatItDoes = listOf(
                "Turn the wheels.",
                "On some cars, also support part of the vehicle's weight."
            ),
            location = "Between the differential and each drive wheel.",
            relatedIds = listOf("differential", "cv_joints", "wheel_hubs"),
            ifItFails = "Vibration, clunking, or a wheel that does not drive.",
            maintenance = "Look for damage and leaks around the seals during service.",
            quiz = LearnQuiz(
                question = "What do axles connect?",
                options = listOf("The differential and the wheels", "The radiator and the fan", "The tank and the pump"),
                answerIndex = 0,
                explanation = "They carry power out to the wheels."
            )
        ),

        LearnPart(
            id = "wheel_hubs",
            systemId = "transmission",
            groupId = "transmission_drivetrain",
            name = "Wheel hubs",
            summary = "Where the wheel bolts on",
            whatIs = "The metal center that the wheel bolts onto and spins around.",
            whatItDoes = listOf(
                "Hold the wheel in place.",
                "Hold the wheel bearing and connect to the axle on driven wheels."
            ),
            location = "At the center of each wheel.",
            relatedIds = listOf("wheel_bearings", "axles"),
            ifItFails = "Wheel wobble, noises, or a loose wheel. This is a safety problem.",
            maintenance = "Have it checked whenever a wheel noise appears.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What bolts onto the wheel hub?",
                options = listOf("The wheel", "The radiator", "The battery"),
                answerIndex = 0,
                explanation = "The wheel mounts on the hub studs."
            )
        ),

        LearnPart(
            id = "wheel_bearings",
            systemId = "transmission",
            groupId = "transmission_drivetrain",
            name = "Wheel bearings",
            summary = "Let wheels spin freely",
            whatIs = "Rings of steel balls or rollers inside the hub.",
            whatItDoes = listOf(
                "Let the wheel spin with very little friction.",
                "Carry the weight of the vehicle."
            ),
            location = "Inside the wheel hub.",
            relatedIds = listOf("wheel_hubs", "axles"),
            ifItFails = "A humming or growling noise that gets louder with speed and may change when you turn.",
            maintenance = "Replace when worn. Do not ignore the noise, because a failed bearing can lock a wheel.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What does a bad wheel bearing sound like?",
                options = listOf("A hum or growl that rises with speed", "A tick at idle only", "A squeal when braking only"),
                answerIndex = 0,
                explanation = "The noise changes with road speed."
            )
        ),

        // ---------- 4WD and AWD ----------
        LearnPart(
            id = "transfer_case",
            systemId = "transmission",
            groupId = "transmission_4wd",
            name = "Transfer case",
            summary = "Splits power front and rear",
            whatIs = "A gearbox in four-wheel-drive vehicles that sends power from the transmission to both the front and rear axles.",
            whatItDoes = listOf(
                "Splits the drive between front and rear.",
                "Often has a low range for tough terrain."
            ),
            location = "Behind the transmission, under the vehicle.",
            relatedIds = listOf("front_driveshaft", "rear_driveshaft", "drive_modes"),
            ifItFails = "Grinding, trouble changing modes, fluid leaks, or loss of four-wheel drive.",
            maintenance = "It has its own fluid. Change it on the schedule in your manual.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What does the transfer case do?",
                options = listOf("Splits power front and rear", "Cools the engine", "Cleans the oil"),
                answerIndex = 0,
                explanation = "It sends drive to both axles."
            )
        ),

        LearnPart(
            id = "front_differential",
            systemId = "transmission",
            groupId = "transmission_4wd",
            name = "Front differential",
            summary = "Splits power between the front wheels",
            whatIs = "The differential at the front axle of a four-wheel-drive or all-wheel-drive vehicle.",
            whatItDoes = listOf(
                "Shares power between the left and right front wheels.",
                "Lets them turn at different speeds in corners."
            ),
            location = "Between the front wheels.",
            relatedIds = listOf("differential", "front_driveshaft", "rear_differential"),
            ifItFails = "Whining, clunking in turns, or leaks.",
            maintenance = "Check and change its gear oil on schedule.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "Which wheels does the front differential serve?",
                options = listOf("The front wheels", "The rear wheels", "The spare"),
                answerIndex = 0,
                explanation = "It splits power between the left and right front wheels."
            )
        ),

        LearnPart(
            id = "rear_differential",
            systemId = "transmission",
            groupId = "transmission_4wd",
            name = "Rear differential",
            summary = "Splits power between the rear wheels",
            whatIs = "The differential at the rear axle.",
            whatItDoes = listOf(
                "Shares power between the left and right rear wheels.",
                "Lets them turn at different speeds in corners."
            ),
            location = "Between the rear wheels.",
            relatedIds = listOf("differential", "rear_driveshaft", "front_differential"),
            ifItFails = "Whining, clunking, or leaks.",
            maintenance = "Check and change its gear oil on schedule.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "Which wheels does the rear differential serve?",
                options = listOf("The rear wheels", "The front wheels", "None"),
                answerIndex = 0,
                explanation = "It splits power between the left and right rear wheels."
            )
        ),

        LearnPart(
            id = "front_driveshaft",
            systemId = "transmission",
            groupId = "transmission_4wd",
            name = "Front driveshaft",
            summary = "Carries power to the front axle",
            whatIs = "The shaft that sends power from the transfer case to the front differential.",
            whatItDoes = listOf(
                "Delivers drive to the front wheels in 4WD.",
                "Uses joints to follow the suspension."
            ),
            location = "Under the vehicle, between the transfer case and the front axle.",
            relatedIds = listOf("transfer_case", "front_differential", "universal_joints"),
            ifItFails = "Vibration and clunking, mostly when 4WD is engaged.",
            maintenance = "Check the joints during service.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "Where does the front driveshaft get its power?",
                options = listOf("The transfer case", "The radiator", "The fuel tank"),
                answerIndex = 0,
                explanation = "The transfer case sends drive forward through it."
            )
        ),

        LearnPart(
            id = "rear_driveshaft",
            systemId = "transmission",
            groupId = "transmission_4wd",
            name = "Rear driveshaft",
            summary = "Carries power to the rear axle",
            whatIs = "The shaft that sends power from the transfer case to the rear differential.",
            whatItDoes = listOf(
                "Delivers drive to the rear wheels.",
                "Uses joints to follow the suspension."
            ),
            location = "Under the vehicle, between the transfer case and the rear axle.",
            relatedIds = listOf("transfer_case", "rear_differential", "driveshaft"),
            ifItFails = "Vibration that rises with speed, or a clunk when you accelerate.",
            maintenance = "Check the joints during service.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "Where does the rear driveshaft send power?",
                options = listOf("The rear differential", "The radiator", "The air filter"),
                answerIndex = 0,
                explanation = "It feeds the rear axle."
            )
        ),

        LearnPart(
            id = "drive_modes",
            systemId = "transmission",
            groupId = "transmission_4wd",
            name = "2H, 4H and 4L modes",
            summary = "What the 4WD settings mean",
            whatIs = "The settings on a part-time four-wheel-drive vehicle.",
            whatItDoes = listOf(
                "2H: two-wheel drive, high range. Normal everyday driving.",
                "4H: four-wheel drive, high range. For slippery roads such as mud, snow or loose gravel, at normal speeds.",
                "4L: four-wheel drive, low range. For slow, heavy work such as steep climbs or deep mud."
            ),
            location = "A lever, knob or buttons near the gear selector.",
            relatedIds = listOf("transfer_case", "part_time_4wd", "full_time_4wd"),
            ifItFails = "If a mode will not engage or a 4WD light flashes, have it checked.",
            maintenance = "Use 4WD from time to time so the system does not seize from lack of use, and follow your manual for when to shift.",
            whyItMatters = "Using 4WD on dry pavement can strain the drivetrain on a part-time system.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "Which mode is for normal dry-road driving?",
                options = listOf("2H", "4L", "4H on dry pavement"),
                answerIndex = 0,
                explanation = "2H is the normal everyday mode."
            )
        ),

        LearnPart(
            id = "part_time_4wd",
            systemId = "transmission",
            groupId = "transmission_4wd",
            name = "Part-time 4WD",
            summary = "4WD only when you choose it",
            whatIs = "A system that normally sends power to two wheels, and sends it to all four when the driver selects it.",
            whatItDoes = listOf(
                "Locks the front and rear shafts together in 4WD.",
                "Is meant for slippery surfaces, not dry pavement."
            ),
            location = "Built around the transfer case.",
            relatedIds = listOf("drive_modes", "transfer_case", "full_time_4wd"),
            ifItFails = "Difficulty engaging 4WD, or binding when turning on grippy ground.",
            maintenance = "Follow your manual about when to engage, and service the transfer case.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "When should you use part-time 4WD?",
                options = listOf("On slippery surfaces", "On dry highways", "Never"),
                answerIndex = 0,
                explanation = "Locked axles need some wheel slip in turns, so slippery ground is best."
            )
        ),

        LearnPart(
            id = "full_time_4wd",
            systemId = "transmission",
            groupId = "transmission_4wd",
            name = "Full-time 4WD and AWD",
            summary = "Always sends power to all wheels",
            whatIs = "Systems that drive all four wheels all the time, using a center differential or clutch to manage the speed difference.",
            whatItDoes = listOf(
                "Work on any surface, including dry roads.",
                "Share power between front and rear automatically."
            ),
            location = "Built around the transfer case or center coupling.",
            relatedIds = listOf("part_time_4wd", "differential", "transfer_case"),
            ifItFails = "Binding, noises, warning lights, or odd handling.",
            maintenance = "Keep all tires the same size and wear level. Mismatched tires can strain the system.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "Why should all four tires match on an AWD car?",
                options = listOf(
                    "Different sizes strain the drivetrain",
                    "It saves fuel only",
                    "It changes the paint"
                ),
                answerIndex = 0,
                explanation = "Different rolling distances make the system fight itself."
            )
        ),

        LearnPart(
            id = "locking_differentials",
            systemId = "transmission",
            groupId = "transmission_4wd",
            name = "Locking differentials",
            summary = "Forces both wheels to turn together",
            whatIs = "A differential that can be locked so both wheels on an axle turn at the same speed.",
            whatItDoes = listOf(
                "Keeps power going to the wheel with grip when the other is spinning in mud or air.",
                "Is used mostly for off-road driving."
            ),
            location = "Inside the front or rear axle, with a switch in the cab.",
            relatedIds = listOf("differential", "drive_modes"),
            ifItFails = "It will not lock or unlock, or it makes noise.",
            maintenance = "Unlock it on normal roads. Locked wheels do not like tight turns on pavement.",
            level = "Advanced",
            quiz = LearnQuiz(
                question = "What does locking a differential do?",
                options = listOf(
                    "Makes both wheels turn together",
                    "Locks the doors",
                    "Cools the axle"
                ),
                answerIndex = 0,
                explanation = "Both wheels get equal drive, which helps when one has no grip."
            )
        )
    )
}