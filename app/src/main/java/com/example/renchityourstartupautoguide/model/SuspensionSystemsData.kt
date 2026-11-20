package com.example.renchityourstartupautoguide.model

object SuspensionSystemsData {

    val groups = listOf(
        LearnGroup(
            id = "steer_components",
            systemId = "suspension",
            title = "Steering components",
            intro = "The chain of parts that turns your hands on the wheel into the front wheels turning."
        ),
        LearnGroup(
            id = "steer_alignment",
            systemId = "suspension",
            title = "Wheel alignment",
            intro = "The angles that decide how the tires meet the road."
        ),
        LearnGroup(
            id = "susp_problems",
            systemId = "suspension",
            title = "Common problems",
            intro = "Noises, shakes and pulls, and what usually causes them."
        )
    )

    val parts = listOf(

        // ---------- Steering components ----------
        LearnPart(
            id = "steering_wheel",
            systemId = "suspension",
            groupId = "steer_components",
            name = "Steering wheel",
            summary = "Where you steer from",
            whatIs = "The wheel you hold to turn the car.",
            whatItDoes = listOf(
                "Sends your turning input down the steering column.",
                "Holds the airbag and many controls, such as the horn and cruise control."
            ),
            location = "In front of the driver.",
            relatedIds = listOf("steering_column", "steering_rack", "steering_vibration"),
            ifItFails = "Too much play, a crooked wheel when driving straight, or shaking at speed all deserve a check.",
            maintenance = "Do not use a wheel with a damaged airbag cover. Have any play or vibration inspected.",
            quiz = LearnQuiz(
                question = "What can a crooked steering wheel while driving straight point to?",
                options = listOf(
                    "An alignment problem",
                    "Too much fuel",
                    "A full battery"
                ),
                answerIndex = 0,
                explanation = "The wheels are not pointing quite the way the wheel says."
            )
        ),

        LearnPart(
            id = "steering_column",
            systemId = "suspension",
            groupId = "steer_components",
            name = "Steering column",
            summary = "The shaft behind the wheel",
            whatIs = "The shaft that connects the steering wheel to the steering rack. It often carries the ignition switch, turn signal stalk and wiper controls.",
            whatItDoes = listOf(
                "Passes your turning force down to the rack.",
                "Is built to collapse in a crash to protect the driver."
            ),
            location = "Behind the dashboard, from the steering wheel toward the front of the car.",
            relatedIds = listOf("steering_wheel", "steering_rack", "pinion_gear"),
            ifItFails = "Clunking or clicking when you turn, a loose wheel, or stiffness.",
            maintenance = "Have any play or noise checked, especially in the joints near the rack.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What does the steering column connect?",
                options = listOf(
                    "The steering wheel and the steering rack",
                    "The engine and the radiator",
                    "The brake and the tire"
                ),
                answerIndex = 0,
                explanation = "It carries your turning input to the rack."
            )
        ),

        LearnPart(
            id = "steering_rack",
            systemId = "suspension",
            groupId = "steer_components",
            name = "Steering rack",
            summary = "Turns rotation into side-to-side motion",
            whatIs = "A toothed bar that slides left and right to steer the wheels. Most modern cars use a rack and pinion.",
            whatItDoes = listOf(
                "Moves the tie rods when the pinion turns.",
                "Often includes power assist, hydraulic or electric."
            ),
            location = "Across the front of the car, behind the engine or under the dashboard area.",
            relatedIds = listOf("pinion_gear", "tie_rods", "power_steering_pump", "eps_motor"),
            ifItFails = "Fluid leaks, heavy or loose steering, clunks when turning, or a whining sound.",
            maintenance = "Look for leaking fluid or torn rubber boots at each end. Replacing a rack is costly, so catch leaks early.",
            whyItMatters = "A torn boot lets in dirt and water that wears out the rack.",
            quiz = LearnQuiz(
                question = "What does the steering rack do?",
                options = listOf(
                    "Slides side to side to steer the wheels",
                    "Pumps coolant",
                    "Filters oil"
                ),
                answerIndex = 0,
                explanation = "It converts the pinion's rotation into sideways motion."
            )
        ),

        LearnPart(
            id = "pinion_gear",
            systemId = "suspension",
            groupId = "steer_components",
            name = "Pinion gear",
            summary = "The small gear that moves the rack",
            whatIs = "A small gear at the end of the steering shaft that meshes with the teeth on the rack.",
            whatItDoes = listOf(
                "Turns with the steering wheel.",
                "Pushes the rack left or right as it rotates."
            ),
            location = "Inside the steering rack housing.",
            relatedIds = listOf("steering_rack", "steering_column"),
            ifItFails = "Wear causes play in the steering and notchy or loose feel.",
            maintenance = "It is part of the rack and is not serviced by itself.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What does the pinion mesh with?",
                options = listOf("The rack", "The piston", "The clutch"),
                answerIndex = 0,
                explanation = "The pinion teeth engage with the rack teeth."
            )
        ),

        LearnPart(
            id = "tie_rods",
            systemId = "suspension",
            groupId = "steer_components",
            name = "Tie rods",
            summary = "Link the rack to the wheels",
            whatIs = "Rods with a joint at each end that connect the steering rack to the steering knuckles. There is an inner and an outer tie rod on each side.",
            whatItDoes = listOf(
                "Push and pull the wheels to steer them.",
                "Set the toe angle when adjusted."
            ),
            location = "From each end of the steering rack out to the wheel.",
            relatedIds = listOf("steering_rack", "steering_knuckles", "toe", "ball_joints"),
            ifItFails = "Loose or wandering steering, a clunk when turning, and fast tire wear. A tie rod that separates means loss of steering.",
            maintenance = "Have them checked at service. Get an alignment after replacing one.",
            whyItMatters = "A worn tie rod is a safety issue and also eats tires.",
            quiz = LearnQuiz(
                question = "What should you do after replacing a tie rod?",
                options = listOf("Get a wheel alignment", "Change the oil", "Nothing"),
                answerIndex = 0,
                explanation = "Tie rods set the toe angle, so it must be re-aligned."
            )
        ),

        LearnPart(
            id = "steering_knuckles",
            systemId = "suspension",
            groupId = "steer_components",
            name = "Steering knuckles",
            summary = "Where the wheel is mounted",
            whatIs = "A solid piece that holds the wheel hub and bearing, and pivots as you steer.",
            whatItDoes = listOf(
                "Connects to the control arms through ball joints.",
                "Connects to the tie rod, so the wheel can be steered."
            ),
            location = "Behind each front wheel.",
            relatedIds = listOf("ball_joints", "tie_rods", "wheel_hubs", "wheel_bearings"),
            ifItFails = "A bent knuckle, often after hitting a curb or pothole, causes pulling, poor alignment and tire wear.",
            maintenance = "Have the suspension checked after a hard impact.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What can bend a steering knuckle?",
                options = listOf(
                    "A hard impact, like a curb or pothole",
                    "Cold weather",
                    "Fresh oil"
                ),
                answerIndex = 0,
                explanation = "Strong impacts can bend suspension parts out of position."
            )
        ),

        LearnPart(
            id = "power_steering_pump",
            systemId = "suspension",
            groupId = "steer_components",
            name = "Power steering pump",
            summary = "Makes hydraulic steering light",
            whatIs = "A pump, usually driven by a belt, that pushes fluid to the steering rack to help you turn.",
            whatItDoes = listOf(
                "Provides the pressure that makes steering easy.",
                "Draws fluid from a small reservoir."
            ),
            location = "On the front of the engine, driven by the drive belt.",
            relatedIds = listOf("steering_rack", "drive_belt", "eps_motor"),
            ifItFails = "A whining noise when turning, heavy steering, or low fluid from a leak.",
            maintenance = "Check the fluid level and use the type your manual lists. Fix leaks early so the pump does not run dry.",
            quiz = LearnQuiz(
                question = "What is a common sign of a failing power steering pump?",
                options = listOf(
                    "A whine when turning",
                    "A hot cabin",
                    "A flat tire"
                ),
                answerIndex = 0,
                explanation = "Low fluid or a worn pump whines, especially at full lock."
            )
        ),

        LearnPart(
            id = "eps_motor",
            systemId = "suspension",
            groupId = "steer_components",
            name = "Electric power steering motor",
            summary = "An electric motor helps you steer",
            whatIs = "An electric motor, controlled by a computer, that assists steering without any hydraulic fluid.",
            whatItDoes = listOf(
                "Adds turning force based on speed and how hard you turn.",
                "Saves fuel, because it only uses power when you steer."
            ),
            location = "On the steering column or on the steering rack.",
            relatedIds = listOf("steering_rack", "power_steering_pump", "sensors"),
            ifItFails = "A steering warning light and steering that suddenly becomes heavy. You can still steer, but it takes much more effort.",
            maintenance = "No fluid to check. Have warning lights scanned, and keep the battery healthy.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What does an electric power steering system not need?",
                options = listOf("Hydraulic fluid", "A steering wheel", "A battery"),
                answerIndex = 0,
                explanation = "An electric motor replaces the fluid and pump."
            )
        ),

        // ---------- Wheel alignment ----------
        LearnPart(
            id = "camber",
            systemId = "suspension",
            groupId = "steer_alignment",
            name = "Camber",
            summary = "The tilt of the wheel, seen from the front",
            whatIs = "How far the top of the wheel leans in or out when you look at the car from the front.",
            whatItDoes = listOf(
                "Negative camber: the top leans inward.",
                "Positive camber: the top leans outward.",
                "Affects grip in corners and where the tire wears."
            ),
            relatedIds = listOf("caster", "toe", "uneven_tire_wear"),
            ifItFails = "Too much camber wears one edge of the tire, either the inside or the outside.",
            maintenance = "Have the alignment checked once a year, after hitting something hard, or when you fit new tires or suspension parts.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What does too much camber wear?",
                options = listOf(
                    "One edge of the tire",
                    "The brake fluid",
                    "The oil filter"
                ),
                answerIndex = 0,
                explanation = "The tire presses harder on the inner or outer edge."
            )
        ),

        LearnPart(
            id = "caster",
            systemId = "suspension",
            groupId = "steer_alignment",
            name = "Caster",
            summary = "The tilt of the steering axis, seen from the side",
            whatIs = "The forward or backward tilt of the line the wheel pivots around.",
            whatItDoes = listOf(
                "Helps the steering wheel return to center after a turn.",
                "Keeps the car stable when driving straight."
            ),
            relatedIds = listOf("camber", "toe", "vehicle_pulling"),
            ifItFails = "Unequal caster between the sides makes the car pull to one side. Too little makes the steering feel light and wander.",
            maintenance = "Checked together with the rest of the alignment.",
            level = "Advanced",
            quiz = LearnQuiz(
                question = "What does caster help the steering wheel do?",
                options = listOf(
                    "Return to center after a turn",
                    "Heat up",
                    "Make noise"
                ),
                answerIndex = 0,
                explanation = "Positive caster makes the wheels self-center."
            )
        ),

        LearnPart(
            id = "toe",
            systemId = "suspension",
            groupId = "steer_alignment",
            name = "Toe",
            summary = "Whether the wheels point in or out",
            whatIs = "How much the front of the tires point toward each other (toe-in) or away from each other (toe-out), seen from above.",
            whatItDoes = listOf(
                "Has a small, carefully set value.",
                "Is the setting that wears tires fastest when wrong."
            ),
            relatedIds = listOf("camber", "tie_rods", "uneven_tire_wear"),
            ifItFails = "Wrong toe scrubs the tire sideways and leaves a feathered pattern across the tread.",
            maintenance = "Set during an alignment. Always re-check after replacing tie rods.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "How can you picture toe?",
                options = listOf(
                    "Pigeon-toed or duck-footed wheels",
                    "How tall the tire is",
                    "How hot the brakes are"
                ),
                answerIndex = 0,
                explanation = "It is whether the fronts of the tires point inward or outward."
            )
        ),

        LearnPart(
            id = "thrust_angle",
            systemId = "suspension",
            groupId = "steer_alignment",
            name = "Thrust angle",
            summary = "Where the rear wheels point",
            whatIs = "The direction the rear wheels are heading compared with the centerline of the car.",
            whatItDoes = listOf(
                "Should be straight ahead.",
                "If off, the car may steer slightly sideways, known as dog tracking."
            ),
            relatedIds = listOf("toe", "camber", "steering_wheel"),
            ifItFails = "A steering wheel that sits off-center even after a front alignment, or a car that seems to drive crooked.",
            maintenance = "A four-wheel alignment checks it. A two-wheel alignment may miss it.",
            level = "Advanced",
            quiz = LearnQuiz(
                question = "What is dog tracking?",
                options = listOf(
                    "The car travels slightly sideways",
                    "The engine runs hot",
                    "The brakes squeal"
                ),
                answerIndex = 0,
                explanation = "The rear wheels do not follow the front wheels in a straight line."
            )
        ),

        LearnPart(
            id = "wheel_balancing",
            systemId = "suspension",
            groupId = "steer_alignment",
            name = "Wheel balancing",
            summary = "Even weight around the wheel",
            whatIs = "Adding small weights to a wheel so it spins smoothly without wobbling.",
            whatItDoes = listOf(
                "Removes vibration at certain speeds, often around 80 to 110 km/h.",
                "Is done whenever tires are fitted, and when you feel a shake."
            ),
            relatedIds = listOf("steering_vibration", "uneven_tire_wear"),
            ifItFails = "An unbalanced wheel makes the steering wheel or seat shake, and wears tires and suspension parts faster.",
            maintenance = "Balance is separate from alignment. Alignment is about angles, balancing is about weight.",
            quiz = LearnQuiz(
                question = "What does wheel balancing fix?",
                options = listOf(
                    "Vibration from uneven weight",
                    "A pull to one side",
                    "A dead battery"
                ),
                answerIndex = 0,
                explanation = "It evens out the weight so the wheel spins smoothly."
            )
        ),

        // ---------- Common problems ----------
        LearnPart(
            id = "clunking_sounds",
            systemId = "suspension",
            groupId = "susp_problems",
            name = "Clunking sounds",
            summary = "A knock over bumps",
            whatIs = "A knocking or thudding noise from the suspension, often over bumps or when turning.",
            whatItDoes = listOf(
                "Common causes: worn stabilizer links, ball joints, bushings, shock mounts or tie rods.",
                "Noises on small, sharp bumps are often links or bushings."
            ),
            relatedIds = listOf("stabilizer_links", "ball_joints", "bushings", "tie_rods"),
            ifItFails = "A new clunk is a warning. Some causes, like ball joints and tie rods, are safety critical.",
            maintenance = "Have a mechanic lift the car and check the joints. Do not just turn up the radio.",
            whyItMatters = "A cheap link is easy to fix, but a worn ball joint can leave you stranded.",
            quiz = LearnQuiz(
                question = "What is a common cause of a clunk over small bumps?",
                options = listOf(
                    "Worn stabilizer links",
                    "A full gas tank",
                    "New wiper blades"
                ),
                answerIndex = 0,
                explanation = "Loose links knock easily over small bumps."
            )
        ),

        LearnPart(
            id = "steering_vibration",
            systemId = "suspension",
            groupId = "susp_problems",
            name = "Steering vibration",
            summary = "A shaky wheel",
            whatIs = "The steering wheel shakes while driving or braking.",
            whatItDoes = listOf(
                "At highway speed: usually unbalanced wheels.",
                "Only when braking: usually warped rotors.",
                "Shake and looseness: worn tie rods, ball joints or a bent wheel."
            ),
            relatedIds = listOf("wheel_balancing", "warped_rotors", "tie_rods", "ball_joints"),
            ifItFails = "Ignoring a shake wears tires and suspension, and may hide a loose part.",
            maintenance = "Start with a wheel balance, then inspect the brakes and suspension if it continues.",
            quiz = LearnQuiz(
                question = "What most often causes shaking at highway speed?",
                options = listOf(
                    "Unbalanced wheels",
                    "Old coolant",
                    "A dirty air filter"
                ),
                answerIndex = 0,
                explanation = "Uneven weight in a wheel makes it vibrate at certain speeds."
            )
        ),

        LearnPart(
            id = "uneven_tire_wear",
            systemId = "suspension",
            groupId = "susp_problems",
            name = "Uneven tire wear",
            summary = "The tire tells you what is wrong",
            whatIs = "Tread that wears faster in some places than others.",
            whatItDoes = listOf(
                "Wear on one edge: camber problem.",
                "Feathered across the tread: toe problem.",
                "Patchy scalloped spots, called cupping: worn shocks or struts.",
                "Both edges worn: low tire pressure. Center worn: too high."
            ),
            relatedIds = listOf("camber", "toe", "shock_absorbers", "wheel_balancing"),
            ifItFails = "Tires wear out early and grip drops, especially in the wet.",
            maintenance = "Check the pressure monthly, rotate tires on schedule, and get an alignment if you see uneven wear.",
            whyItMatters = "Fixing the cause is cheaper than replacing tires over and over.",
            quiz = LearnQuiz(
                question = "Patchy, scalloped wear on a tire often points to what?",
                options = listOf(
                    "Worn shocks or struts",
                    "A dirty air filter",
                    "A cold engine"
                ),
                answerIndex = 0,
                explanation = "The tire bounces on the road instead of staying pressed down."
            )
        ),

        LearnPart(
            id = "excessive_body_roll",
            systemId = "suspension",
            groupId = "susp_problems",
            name = "Excessive body roll",
            summary = "Leaning too much in corners",
            whatIs = "The car leans heavily to the outside of a turn.",
            whatItDoes = listOf(
                "Common causes: worn shocks or struts, weak springs, a loose or broken stabilizer bar or links, or a heavy load.",
                "Makes the car feel unstable and slower to respond."
            ),
            relatedIds = listOf("stabilizer_bar", "stabilizer_links", "shock_absorbers", "coil_springs"),
            ifItFails = "A car that sways and wallows is less safe in emergency maneuvers.",
            maintenance = "Have the shocks, springs and stabilizer parts checked, and avoid overloading.",
            quiz = LearnQuiz(
                question = "Which part is designed to reduce body roll?",
                options = listOf("The stabilizer bar", "The oil filter", "The radiator"),
                answerIndex = 0,
                explanation = "It resists the car leaning in turns."
            )
        ),

        LearnPart(
            id = "vehicle_pulling",
            systemId = "suspension",
            groupId = "susp_problems",
            name = "Vehicle pulling to one side",
            summary = "The car drifts when you let go",
            whatIs = "The car drifts left or right on a flat road when you hold the wheel lightly.",
            whatItDoes = listOf(
                "Check tire pressure first. A soft tire pulls to its side.",
                "Next: alignment, uneven tires, a sticking brake caliper, or worn suspension parts."
            ),
            relatedIds = listOf("camber", "caster", "brake_caliper", "uneven_tire_wear"),
            ifItFails = "If it pulls only while braking, think brakes. If it pulls all the time, think tires and alignment.",
            maintenance = "Check tire pressures, then get an alignment. Note that some roads slope sideways, so test on a flat road.",
            quiz = LearnQuiz(
                question = "What should you check first if the car pulls to one side?",
                options = listOf("Tire pressure", "The radio", "The wiper fluid"),
                answerIndex = 0,
                explanation = "It is the quickest and cheapest check."
            )
        ),

        LearnPart(
            id = "worn_bushings",
            systemId = "suspension",
            groupId = "susp_problems",
            name = "Worn bushings",
            summary = "Cracked rubber, loose suspension",
            whatIs = "Rubber cushions that have cracked, torn or gone soft with age.",
            whatItDoes = listOf(
                "Let parts move more than they should.",
                "Cause clunks, vague steering, vibration and alignment that will not hold."
            ),
            relatedIds = listOf("bushings", "lower_control_arm", "stabilizer_bar", "clunking_sounds"),
            ifItFails = "Left alone, the loose parts wear other components, and tires wear unevenly.",
            maintenance = "A mechanic can see cracks and play when the car is lifted. Replace bushings and align afterward.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What does a worn bushing allow?",
                options = listOf(
                    "Extra movement in the suspension",
                    "More engine power",
                    "Cooler brakes"
                ),
                answerIndex = 0,
                explanation = "The soft cushion no longer holds parts firmly in place."
            )
        ),

        LearnPart(
            id = "shock_absorber_leaks",
            systemId = "suspension",
            groupId = "susp_problems",
            name = "Shock absorber leaks",
            summary = "An oily shock is a worn shock",
            whatIs = "Oil seeping from a shock or strut, leaving it wet and dirty.",
            whatItDoes = listOf(
                "A light film can be normal. Oil running down the body means the seal has failed.",
                "Bounce test: push down hard on a corner and let go. More than one or two bounces means it is worn."
            ),
            relatedIds = listOf("shock_absorbers", "struts", "uneven_tire_wear"),
            ifItFails = "A leaking shock loses damping, so the car bounces, dives under braking and wears tires unevenly.",
            maintenance = "Replace shocks and struts in pairs on the same axle, and align after replacing struts.",
            quiz = LearnQuiz(
                question = "What does oil running down a shock mean?",
                options = listOf(
                    "The seal has failed and it needs replacing",
                    "It is freshly lubricated",
                    "The tire is new"
                ),
                answerIndex = 0,
                explanation = "A leaking shock has lost fluid and damping ability."
            )
        )
    )
}