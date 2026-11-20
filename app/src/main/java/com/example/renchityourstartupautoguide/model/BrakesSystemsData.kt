package com.example.renchityourstartupautoguide.model

object BrakesSystemsData {

    val groups = listOf(
        LearnGroup(
            id = "brake_hydraulic",
            systemId = "brakes",
            title = "Hydraulic brake parts",
            intro = "How your foot's push travels as fluid pressure to the brakes."
        ),
        LearnGroup(
            id = "brake_electronic",
            systemId = "brakes",
            title = "Electronic brake parts",
            intro = "The sensors and computers behind ABS and the electronic parking brake."
        ),
        LearnGroup(
            id = "brake_problems",
            systemId = "brakes",
            title = "Maintenance and problems",
            intro = "What wears out, what goes wrong, and what the warning signs feel like."
        )
    )

    val parts = listOf(

        // ---------- Hydraulic brake parts ----------
        LearnPart(
            id = "brake_pedal",
            systemId = "brakes",
            groupId = "brake_hydraulic",
            name = "Brake pedal",
            summary = "Where braking starts",
            whatIs = "The pedal you press with your foot to slow the car down.",
            whatItDoes = listOf(
                "Pushes on the brake booster and master cylinder.",
                "Gives you feedback about how the brakes feel."
            ),
            location = "Inside the cabin, in the driver's footwell, to the left of the accelerator.",
            relatedIds = listOf("brake_booster", "master_cylinder", "spongy_pedal"),
            ifItFails = "A pedal that feels soft, sinks to the floor, or is very hard is a warning sign. Get it checked right away.",
            maintenance = "Pay attention to how it feels. Any change is worth checking.",
            whyItMatters = "The pedal is the quickest way to notice a brake problem.",
            quiz = LearnQuiz(
                question = "What should you do if the pedal suddenly sinks to the floor?",
                options = listOf(
                    "Stop safely and get it checked",
                    "Keep driving",
                    "Add engine oil"
                ),
                answerIndex = 0,
                explanation = "A sinking pedal can mean fluid loss or a failing part."
            )
        ),

        LearnPart(
            id = "brake_booster",
            systemId = "brakes",
            groupId = "brake_hydraulic",
            name = "Brake booster",
            summary = "Makes the pedal easy to press",
            whatIs = "A device that multiplies your foot's force so the brakes need only a light push. Most use engine vacuum, and some use an electric pump.",
            whatItDoes = listOf(
                "Adds force to your pedal push.",
                "Sits between the pedal and the master cylinder."
            ),
            location = "On the firewall behind the engine bay, directly in front of the brake pedal.",
            relatedIds = listOf("brake_pedal", "master_cylinder", "brake_assist"),
            ifItFails = "The pedal becomes hard to press. The brakes still work, but you need much more effort.",
            maintenance = "Not a routine service. A hissing sound when you press the pedal can mean a leak.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What does a failed booster make the pedal feel like?",
                options = listOf("Very hard to press", "Very light", "Normal"),
                answerIndex = 0,
                explanation = "Without the boost, you must supply all the force yourself."
            )
        ),

        LearnPart(
            id = "master_cylinder",
            systemId = "brakes",
            groupId = "brake_hydraulic",
            name = "Master cylinder",
            summary = "Turns your push into pressure",
            whatIs = "A cylinder that turns the pedal's push into hydraulic pressure in the brake fluid.",
            whatItDoes = listOf(
                "Sends pressure out through the brake lines.",
                "Usually has two separate circuits, so one leak does not remove all braking."
            ),
            location = "On the brake booster, in the engine bay, under the fluid reservoir.",
            relatedIds = listOf("brake_booster", "brake_fluid_reservoir", "brake_lines"),
            ifItFails = "A pedal that slowly sinks while you hold it, a soft pedal, or fluid leaking near the booster.",
            maintenance = "Keep the fluid clean and topped up, and look for leaks.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "Why does the master cylinder usually have two circuits?",
                options = listOf(
                    "So one leak does not remove all braking",
                    "To save fluid",
                    "To make it louder"
                ),
                answerIndex = 0,
                explanation = "A second circuit keeps some brakes working if one fails."
            )
        ),

        LearnPart(
            id = "brake_fluid_reservoir",
            systemId = "brakes",
            groupId = "brake_hydraulic",
            name = "Brake fluid reservoir",
            summary = "The brake fluid tank",
            whatIs = "A plastic tank on top of the master cylinder that holds brake fluid.",
            whatItDoes = listOf(
                "Supplies fluid to the master cylinder.",
                "Lets you check the level at a glance with the MIN and MAX marks."
            ),
            location = "On top of the master cylinder in the engine bay.",
            relatedIds = listOf("master_cylinder", "brake_fluid"),
            ifItFails = "A level that drops quickly means a leak. A level that drops slowly is normal as pads wear.",
            maintenance = "Check the level regularly. Never fill past MAX. Use only the fluid type printed on the cap.",
            whyItMatters = "It is one of the easiest brake checks to do yourself.",
            quiz = LearnQuiz(
                question = "What does a quickly dropping brake fluid level suggest?",
                options = listOf("A leak", "Fresh fluid", "A strong engine"),
                answerIndex = 0,
                explanation = "Fluid does not get used up. If it disappears, it is leaking."
            )
        ),

        LearnPart(
            id = "brake_lines",
            systemId = "brakes",
            groupId = "brake_hydraulic",
            name = "Brake lines",
            summary = "The steel pipes for brake fluid",
            whatIs = "Thin steel pipes that carry brake fluid from the master cylinder to each wheel.",
            whatItDoes = listOf(
                "Carry high-pressure fluid along the underside of the car.",
                "Connect to flexible hoses near each wheel."
            ),
            location = "Under the car, running along the body to each wheel.",
            relatedIds = listOf("master_cylinder", "brake_hose", "proportioning_valve"),
            ifItFails = "Rust can eat through a line and cause a sudden loss of brakes.",
            maintenance = "Have them inspected for rust and leaks, especially in rainy, muddy or salty places.",
            quiz = LearnQuiz(
                question = "What is the biggest danger to steel brake lines?",
                options = listOf("Rust", "Too much oil", "Cool weather"),
                answerIndex = 0,
                explanation = "Rust can cause a hidden leak and sudden brake loss."
            )
        ),

        LearnPart(
            id = "proportioning_valve",
            systemId = "brakes",
            groupId = "brake_hydraulic",
            name = "Proportioning valve",
            summary = "Limits pressure to the rear",
            whatIs = "A valve that limits brake pressure to the rear wheels.",
            whatItDoes = listOf(
                "Stops the rear wheels from locking before the front.",
                "Is replaced by electronic control (EBD) in many newer cars."
            ),
            location = "In the brake line between the master cylinder and the rear brakes, or built into the ABS unit.",
            relatedIds = listOf("ebd", "brake_lines"),
            ifItFails = "The rear wheels may lock up, or the rear brakes may do too little.",
            maintenance = "Not a routine service. A mechanic checks it during brake diagnosis.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What does a proportioning valve limit?",
                options = listOf(
                    "Pressure to the rear brakes",
                    "Fuel to the engine",
                    "Air to the tires"
                ),
                answerIndex = 0,
                explanation = "It keeps the rear wheels from locking too early."
            )
        ),

        // ---------- Electronic brake parts ----------
        LearnPart(
            id = "abs_module",
            systemId = "brakes",
            groupId = "brake_electronic",
            name = "ABS module",
            summary = "The brain of the ABS",
            whatIs = "The computer that runs the anti-lock braking system.",
            whatItDoes = listOf(
                "Reads the wheel speed sensors.",
                "Controls the hydraulic unit to stop wheels from locking."
            ),
            location = "In the engine bay, usually attached to the hydraulic control unit.",
            relatedIds = listOf("abs", "hydraulic_control_unit", "wheel_speed_sensors"),
            ifItFails = "The ABS light turns on, and the system switches off. Normal brakes still work.",
            maintenance = "Have it scanned if the ABS light comes on.",
            level = "Advanced",
            quiz = LearnQuiz(
                question = "What does the ABS module read?",
                options = listOf("Wheel speed sensors", "The fuel gauge", "The radio"),
                answerIndex = 0,
                explanation = "It watches each wheel's speed to spot a lockup."
            )
        ),

        LearnPart(
            id = "hydraulic_control_unit",
            systemId = "brakes",
            groupId = "brake_electronic",
            name = "Hydraulic control unit",
            summary = "The valves and pump for ABS",
            whatIs = "A block of valves and a pump that can raise, hold or release the brake pressure at each wheel.",
            whatItDoes = listOf(
                "Follows commands from the ABS module.",
                "Causes the pulsing you feel in the pedal during ABS."
            ),
            location = "In the engine bay, between the master cylinder and the brake lines.",
            relatedIds = listOf("abs_module", "abs", "brake_lines"),
            ifItFails = "An ABS light, or brake pressure that does not behave properly.",
            maintenance = "Fresh brake fluid helps protect the tiny valves.",
            level = "Advanced",
            quiz = LearnQuiz(
                question = "What can the hydraulic control unit do at each wheel?",
                options = listOf(
                    "Raise, hold or release brake pressure",
                    "Change the oil",
                    "Charge the battery"
                ),
                answerIndex = 0,
                explanation = "Its valves adjust pressure for every wheel separately."
            )
        ),

        LearnPart(
            id = "wheel_speed_sensors",
            systemId = "brakes",
            groupId = "brake_electronic",
            name = "Wheel speed sensors",
            summary = "Tell the car how fast each wheel spins",
            whatIs = "Sensors at each wheel that measure how fast the wheel is turning.",
            whatItDoes = listOf(
                "Let ABS spot a wheel that is about to lock.",
                "Also feed traction control and the speedometer in many cars."
            ),
            location = "At each wheel hub or axle, near a toothed ring.",
            relatedIds = listOf("abs_module", "abs", "ebd"),
            ifItFails = "The ABS and traction control lights come on. Dirt or damaged wiring is a common cause.",
            maintenance = "A mechanic can clean or replace one. It is a common and fairly simple fix.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "Which light often comes on with a bad wheel speed sensor?",
                options = listOf("ABS", "Fuel", "Washer fluid"),
                answerIndex = 0,
                explanation = "ABS depends on these sensors, so it shuts off without them."
            )
        ),

        LearnPart(
            id = "epb_motor",
            systemId = "brakes",
            groupId = "brake_electronic",
            name = "Electronic parking brake motor",
            summary = "Applies the parking brake with a button",
            whatIs = "A small electric motor that applies the parking brake when you press a switch instead of pulling a lever.",
            whatItDoes = listOf(
                "Clamps the rear brakes when you park.",
                "Releases them when you drive off, on many cars automatically."
            ),
            location = "At the rear brakes, on or near the calipers.",
            relatedIds = listOf("brake_caliper", "brake_pads"),
            ifItFails = "The parking brake light stays on, or the brake will not apply or release.",
            maintenance = "Use the service mode of the car when changing rear pads. Never force the rear pistons back by hand.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What should be used when replacing rear pads on an electronic parking brake?",
                options = listOf("The service mode", "A hammer", "Nothing special"),
                answerIndex = 0,
                explanation = "The motor must be retracted properly or it can be damaged."
            )
        ),

        // ---------- Maintenance and problems ----------
        LearnPart(
            id = "brake_pad_wear",
            systemId = "brakes",
            groupId = "brake_problems",
            name = "Brake pad wear",
            summary = "Pads get thinner every time you brake",
            whatIs = "The slow loss of friction material from your brake pads.",
            whatItDoes = listOf(
                "Is normal and depends on how and where you drive.",
                "Is faster in heavy traffic, hilly areas, and with hard braking."
            ),
            relatedIds = listOf("brake_pads", "brake_rotor"),
            ifItFails = "Many pads have a metal tab that squeals when they are thin. Grinding means the pad is gone, and the rotor is being damaged.",
            maintenance = "Have the pads measured at each service. Replace them when thin, commonly around 3 mm.",
            whyItMatters = "Changing pads on time is cheaper than replacing rotors too.",
            quiz = LearnQuiz(
                question = "What does a metal squeal from the wheels often tell you?",
                options = listOf("The pads are getting thin", "The tank is full", "The oil is new"),
                answerIndex = 0,
                explanation = "A small metal tab scrapes the rotor when the pads are low."
            )
        ),

        LearnPart(
            id = "warped_rotors",
            systemId = "brakes",
            groupId = "brake_problems",
            name = "Warped or damaged rotors",
            summary = "Why the wheel shakes when braking",
            whatIs = "Rotors that have uneven thickness, deep grooves, cracks, or heat damage.",
            whatItDoes = listOf(
                "Cause shaking in the steering wheel or pedal when braking.",
                "Are often caused by heat, worn pads, or hard braking."
            ),
            relatedIds = listOf("brake_rotor", "brake_pads", "brake_noise"),
            ifItFails = "Vibration, pulsing, noise, and longer stopping distances.",
            maintenance = "A mechanic can measure the rotors, then resurface or replace them.",
            quiz = LearnQuiz(
                question = "What do warped rotors usually cause?",
                options = listOf("Shaking when braking", "Hard starting", "A noisy radio"),
                answerIndex = 0,
                explanation = "The pads grip a surface that is uneven as it spins."
            )
        ),

        LearnPart(
            id = "brake_fluid",
            systemId = "brakes",
            groupId = "brake_problems",
            name = "Brake fluid condition",
            summary = "Old fluid works worse",
            whatIs = "The state of the fluid in your brake system. It slowly absorbs moisture from the air.",
            whatItDoes = listOf(
                "Wet fluid boils at a lower temperature, which can cause a soft pedal.",
                "Old fluid can also rust parts from the inside."
            ),
            location = "In the reservoir, brake lines, calipers and wheel cylinders.",
            relatedIds = listOf("brake_fluid_reservoir", "brake_bleeding", "brake_fade"),
            ifItFails = "A soft pedal, poor braking on long downhills, or dark, dirty fluid.",
            maintenance = "Replace it on schedule, commonly every 2 to 3 years. Check your manual and use the type printed on the reservoir cap.",
            whyItMatters = "Many people never change it, but it is a safety item.",
            quiz = LearnQuiz(
                question = "What does old brake fluid absorb?",
                options = listOf("Moisture", "Fuel", "Dust only"),
                answerIndex = 0,
                explanation = "Moisture lowers its boiling point and hurts braking."
            )
        ),

        LearnPart(
            id = "brake_bleeding",
            systemId = "brakes",
            groupId = "brake_problems",
            name = "Brake bleeding",
            summary = "Removing air from the brake lines",
            whatIs = "A service that pushes fresh fluid through the brake system to force out air bubbles and old fluid.",
            whatItDoes = listOf(
                "Brings back a firm pedal after air gets in.",
                "Is done whenever the brake system is opened, and when changing the fluid."
            ),
            relatedIds = listOf("brake_fluid", "spongy_pedal"),
            ifItFails = "If air stays in, the pedal feels soft and braking is weaker.",
            maintenance = "Leave it to a trained mechanic or someone who knows how. A mistake here affects your safety.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What does bleeding the brakes remove?",
                options = listOf("Air from the lines", "Dust from the rotors", "Coolant"),
                answerIndex = 0,
                explanation = "Air compresses, so it makes the pedal feel soft."
            )
        ),

        LearnPart(
            id = "brake_fade",
            systemId = "brakes",
            groupId = "brake_problems",
            name = "Brake fade",
            summary = "Brakes weaken when they overheat",
            whatIs = "A loss of braking power caused by too much heat.",
            whatItDoes = listOf(
                "Happens on long downhills or after repeated hard braking.",
                "Makes the pedal feel soft or the car take longer to stop."
            ),
            relatedIds = listOf("brake_fluid", "brake_pads", "brake_rotor"),
            ifItFails = "If you notice it, slow down, pull over safely and let the brakes cool.",
            maintenance = "On long downhills, use a lower gear so the engine helps slow the car. Do not ride the brake pedal.",
            whyItMatters = "Knowing about fade can prevent a scary moment on a mountain road.",
            quiz = LearnQuiz(
                question = "What helps prevent brake fade on a long downhill?",
                options = listOf(
                    "Using a lower gear",
                    "Resting your foot on the pedal",
                    "Turning the engine off"
                ),
                answerIndex = 0,
                explanation = "Engine braking takes some load off the brakes. Never switch the engine off while driving."
            )
        ),

        LearnPart(
            id = "spongy_pedal",
            systemId = "brakes",
            groupId = "brake_problems",
            name = "Spongy brake pedal",
            summary = "A pedal that feels soft",
            whatIs = "A pedal that feels soft or squishy and sinks further than normal.",
            whatItDoes = listOf(
                "Is most often caused by air in the brake lines.",
                "Can also come from old fluid, a leak, or a worn hose."
            ),
            relatedIds = listOf("brake_bleeding", "brake_fluid", "brake_hose", "master_cylinder"),
            ifItFails = "A pedal that keeps getting worse needs attention right away, because the brakes may fail.",
            maintenance = "Have it checked soon. Do not wait for it to get worse.",
            whyItMatters = "It is an early warning that something in the system is off.",
            quiz = LearnQuiz(
                question = "What is the most common cause of a spongy pedal?",
                options = listOf("Air in the brake lines", "A full fuel tank", "New tires"),
                answerIndex = 0,
                explanation = "Air squishes under pressure, fluid does not."
            )
        ),

        LearnPart(
            id = "brake_noise",
            systemId = "brakes",
            groupId = "brake_problems",
            name = "Brake noise and vibration",
            summary = "What different sounds can mean",
            whatIs = "Sounds and shaking that come from the brakes.",
            whatItDoes = listOf(
                "A high squeal can be the wear indicator on thin pads.",
                "A deep grinding means the pad material is gone.",
                "Pulsing or shaking points to warped rotors.",
                "A clunk can mean a loose caliper or worn parts."
            ),
            relatedIds = listOf("brake_pad_wear", "warped_rotors", "brake_caliper"),
            ifItFails = "Some light squeal in damp weather is normal. A new, loud or grinding noise is not.",
            maintenance = "Have any new brake noise checked. Do not wait for grinding.",
            whyItMatters = "Brake noises are usually a cheap warning before an expensive repair.",
            quiz = LearnQuiz(
                question = "What does a deep grinding noise usually mean?",
                options = listOf(
                    "The pads are worn through",
                    "The car is cold",
                    "The fluid is fresh"
                ),
                answerIndex = 0,
                explanation = "Metal is rubbing on the rotor."
            )
        )
    )
}