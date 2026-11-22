package com.example.renchityourstartupautoguide.model

object MaintenanceExteriorData {

    val guides = listOf(

        MaintenanceGuide(
            id = "exterior_lights_check",
            topicId = "exterior",
            title = "Checking your lights",
            summary = "Headlights, brake lights and signals",
            overview = "A lights check means switching on each light on the car and making sure it works. It is easiest with a helper, or by using a wall or window reflection when you are alone.",
            whyItMatters = "Working lights help you see and let other drivers see you and know what you are about to do. A dead brake light or signal is a common cause of rear-end crashes, and may get you a fine.",
            whenToDo = "Once a month, before night or long trips, and any time a dashboard bulb warning appears.",
            tools = listOf(
                "A helper, if possible",
                "A reflective wall, garage door or shop window if you are alone",
                "Spare bulbs and fuses suited to your car",
                "Your owner's manual"
            ),
            steps = listOf(
                "Park facing a wall or with a helper standing behind the car.",
                "Switch on the ignition and turn on the low beam headlights. Check both come on and look equally bright.",
                "Switch to high beam and check both.",
                "Turn on the left and then the right turn signal. Check the front, rear and side lights flash at a normal speed.",
                "Switch on the hazard lights and check all four corners.",
                "Have your helper watch while you press the brake pedal, or look at the reflection behind you. Check both brake lights and the third brake light, if you have one.",
                "Put the car in reverse with the brake pressed, and check the reverse lights.",
                "Check the tail lights, fog lights and number plate light.",
                "Look at each lens for cracks, water inside or heavy yellowing."
            ),
            watchFor = listOf(
                "A bulb that is out or dim",
                "A turn signal that flashes very fast, which usually means a bulb is out",
                "A cracked lens with moisture inside",
                "Headlights that look yellow or cloudy",
                "A light that flickers"
            ),
            seeMechanic = listOf(
                "A new bulb does not fix the problem, which can be a fuse or wiring fault",
                "Several lights fail at once",
                "Water gets inside the light housing",
                "Your headlights look aimed too high or too low",
                "Your car needs special bulbs that are hard to reach"
            ),
            safety = "Do not drive at night or in bad weather with a headlight or brake light out. Switch the engine and lights off before touching a bulb, and never touch a halogen bulb with bare fingers, since skin oil shortens its life.",
            relatedPartIds = listOf("headlights", "tail_lights", "brake_lights", "turn_signals", "fuses"),
            quiz = LearnQuiz(
                question = "A turn signal suddenly flashes much faster than normal. What does that usually mean?",
                options = listOf(
                    "A bulb on that side is out",
                    "The tires are low",
                    "The oil needs changing"
                ),
                answerIndex = 0,
                explanation = "The flasher speeds up when a bulb is missing or dead, because the circuit has less load."
            ),
            level = "Beginner",
            minutes = 10
        ),

        MaintenanceGuide(
            id = "wiper_blade_inspection",
            topicId = "exterior",
            title = "Inspecting your wiper blades",
            summary = "Streaks and squeaks mean it is time",
            overview = "Wiper blades are rubber strips that clear water off the windshield. Inspecting them means checking the rubber and testing how well they clear the glass.",
            whyItMatters = "Worn wipers smear water and make it hard to see in heavy rain, especially at night when headlights reflect off the streaks.",
            whenToDo = "Every month or two, before the rainy season, and any time they streak, squeak or skip.",
            tools = listOf(
                "A clean rag",
                "Washer fluid or water",
                "A flashlight"
            ),
            steps = listOf(
                "Make sure the engine is off and the wipers are in their rest position.",
                "Lift each wiper arm gently away from the glass. It will stay up on its own.",
                "Run a finger along the rubber edge. It should feel smooth and flexible, not cracked, torn, hard or flat.",
                "Look at the metal frame and the joints for rust or bending.",
                "Wipe the rubber with a damp rag to remove dirt and road film.",
                "Lower the arms carefully back onto the glass. Do not let them snap down.",
                "Spray washer fluid and run the wipers. Watch for streaks, smears, skips or noise.",
                "Check the rear wiper too, if you have one."
            ),
            watchFor = listOf(
                "Streaks or smears across the glass",
                "Squeaking or chattering",
                "Rubber that is split, cracked or peeling away from the frame",
                "Blades that lift off the glass in places",
                "Rust on the arms or frame"
            ),
            seeMechanic = listOf(
                "A new blade still streaks, which can mean the arm is bent or the glass is dirty with film",
                "The wipers do not move or move slowly",
                "The wiper arm is loose or bent",
                "The washer jets do not spray"
            ),
            safety = "Never lift a wiper arm and let it snap back, because it can crack the windshield. Do not run the wipers on a dry or frozen windshield, since this can tear the rubber and strain the motor.",
            relatedPartIds = listOf("wiper_blades", "wiper_arms", "wiper_motor", "washer_nozzles"),
            quiz = LearnQuiz(
                question = "What should you avoid doing when you lift a wiper arm?",
                options = listOf(
                    "Letting it snap back onto the glass",
                    "Holding it gently",
                    "Wiping the blade with a damp rag"
                ),
                answerIndex = 0,
                explanation = "The spring pulls the arm down hard, and a snap can crack the windshield."
            ),
            level = "Beginner",
            minutes = 5
        ),

        MaintenanceGuide(
            id = "wiper_blade_replacement",
            topicId = "exterior",
            title = "Replacing wiper blades",
            summary = "A five-minute swap",
            overview = "Replacing wiper blades means taking off the old blades and clipping on new ones of the right size and type. It is one of the easiest jobs on a car.",
            whyItMatters = "New blades give a clear, quiet wipe and help you see clearly in heavy rain. They are cheap compared with the safety they give.",
            whenToDo = "When blades streak, squeak or skip, or when the rubber is cracked. Many people replace them about once a year, or before the rainy season.",
            tools = listOf(
                "New wiper blades of the correct length and connector type",
                "A towel to protect the windshield",
                "Your owner's manual or the shop's fitting guide"
            ),
            steps = listOf(
                "Check the right size for the driver side, passenger side and rear. They are often different lengths.",
                "Lay a towel on the windshield under the arm, in case the arm slips.",
                "Lift the wiper arm away from the glass until it stays up.",
                "Find the release tab or clip where the blade meets the arm. Press it and slide the blade off, following the instructions on the new pack.",
                "Slide the new blade onto the arm until you hear or feel it click into place.",
                "Gently tug the blade to make sure it is locked.",
                "Lower the arm carefully back onto the glass.",
                "Repeat for the other side and the rear, if needed.",
                "Spray washer fluid and test that the new blades sweep smoothly without streaks."
            ),
            watchFor = listOf(
                "A blade that is too long and hits the edge or the other wiper",
                "A blade that is not fully clicked in",
                "Streaks from a dirty windshield, not from the blade",
                "Chattering from new blades, which can mean waxy buildup on the glass",
                "A wiper arm that is bent or stiff"
            ),
            seeMechanic = listOf(
                "The connector does not match any blade you can find",
                "The wiper arm is damaged or will not stay up",
                "The new blades still do not clear the glass properly",
                "The wiper motor is slow or noisy"
            ),
            safety = "Always place a towel under the arm, or hold it, so it cannot spring back and crack the windshield. Make sure the wipers are off and the car is parked before you start.",
            relatedPartIds = listOf("wiper_blades", "wiper_arms", "wiper_motor"),
            quiz = LearnQuiz(
                question = "Why do you place a towel under the wiper arm when swapping blades?",
                options = listOf(
                    "To protect the windshield if the arm slips",
                    "To clean the car",
                    "To keep the blade warm"
                ),
                answerIndex = 0,
                explanation = "Without the blade, the bare metal arm can hit the glass hard and crack it."
            ),
            level = "Beginner",
            minutes = 10
        ),

        MaintenanceGuide(
            id = "washing_your_car",
            topicId = "exterior",
            title = "Washing your car",
            summary = "Clean it without scratching the paint",
            overview = "A proper wash removes dirt, bird droppings, bugs and road salt before they damage the paint. Using the right method keeps the finish smooth and helps prevent rust.",
            whyItMatters = "Dirt and grit act like sandpaper if you rub them across the paint, and some stains slowly eat into it. Regular washing protects the paint and helps the car keep its value.",
            whenToDo = "Every few weeks, or sooner after salt, bird droppings, tree sap, bugs or driving on muddy roads.",
            tools = listOf(
                "Car wash soap, not dish soap",
                "Two buckets, one for soapy water and one for rinsing",
                "A soft wash mitt or sponge",
                "A hose or pressure washer on a gentle setting",
                "A separate brush for wheels",
                "Soft microfiber towels for drying"
            ),
            steps = listOf(
                "Park in the shade and make sure the paint is cool to the touch.",
                "Rinse the whole car with water to remove loose dirt and grit.",
                "Mix car soap in one bucket and fill the other with clean water.",
                "Wash the wheels and tires first with their own brush, since they are the dirtiest.",
                "Wash the car from top to bottom using the mitt, working on one section at a time.",
                "Rinse the mitt in the clean bucket before putting it back in the soap.",
                "Rinse each section before the soap dries.",
                "Dry the car with soft microfiber towels to avoid water spots.",
                "Check that the windows, mirrors and lights are clean, and that the doors and trunk drain holes are clear."
            ),
            watchFor = listOf(
                "Bird droppings, tree sap or bug splatter left on the paint",
                "Chips and scratches that expose bare metal",
                "Rust starting around chips or edges",
                "Dirt stuck in door seals and drain holes",
                "A dull, rough or faded finish"
            ),
            seeMechanic = listOf(
                "You find rust, bubbling paint or deep scratches",
                "Water gets inside the car after washing",
                "Paint is peeling or fading badly",
                "A stain will not come off with normal washing"
            ),
            safety = "Do not use dish soap, harsh cleaners or a hard brush on the paint. Do not spray water directly into the engine bay electrics, door locks or air intake. Keep pressure washers a safe distance from the paint, seals and trim.",
            relatedPartIds = listOf("body_panels", "paint", "door_seals", "wheels"),
            quiz = LearnQuiz(
                question = "Why use two buckets when washing a car?",
                options = listOf(
                    "To rinse dirt off the mitt so it does not scratch the paint",
                    "To use more water",
                    "To make the wash take longer"
                ),
                answerIndex = 0,
                explanation = "Rinsing the mitt in a separate bucket keeps grit out of the soapy water and off the paint."
            ),
            level = "Beginner",
            minutes = 30
        ),

        MaintenanceGuide(
            id = "paint_and_rust_care",
            topicId = "exterior",
            title = "Protecting paint and preventing rust",
            summary = "Small steps that save big repairs",
            overview = "Paint protects the metal body from water and air, which cause rust. Caring for it means cleaning off harmful stuff quickly, touching up chips and adding a layer of protection like wax.",
            whyItMatters = "Rust spreads quietly and can be expensive to fix. A small chip repaired early costs very little, while rust that has spread through a panel costs a lot.",
            whenToDo = "Look the car over each time you wash it. Apply wax or sealant a few times a year, and touch up chips as soon as you find them.",
            tools = listOf(
                "Car wax or paint sealant",
                "Touch-up paint that matches your car's color code",
                "A soft applicator pad",
                "Soft microfiber towels",
                "Fine rust treatment, for small spots",
                "A flashlight"
            ),
            steps = listOf(
                "Wash and dry the car first, since wax and touch-up paint need a clean surface.",
                "Walk around the car and look for chips, scratches and bubbling paint, especially on door edges, wheel arches, the hood edge and the lower body.",
                "Look in the door bottoms and trunk edges, where water can collect.",
                "For a small chip, clean it with a bit of alcohol on a cloth and let it dry.",
                "Apply a small amount of matching touch-up paint, following the product's instructions.",
                "Apply wax or sealant with an applicator pad in thin, even layers.",
                "Let it dry as the product says, then buff it off with a clean microfiber towel.",
                "Clean out drain holes in the doors and under the trunk so water cannot sit inside.",
                "After driving through salt or sea air, rinse the underside of the car."
            ),
            watchFor = listOf(
                "Bubbles under the paint, which mean rust is starting",
                "Chips that show bare metal",
                "Orange or brown stains around seams and edges",
                "Faded or chalky paint",
                "Damp carpets or a musty smell, which can be a leak and a rust risk"
            ),
            seeMechanic = listOf(
                "Rust has spread beyond a small spot or has made a hole",
                "Paint is bubbling or flaking in large areas",
                "Rust on the frame, floor or suspension parts",
                "Water is getting into the cabin or trunk"
            ),
            safety = "Work in a well ventilated area and wear gloves and eye protection when using paint, rust treatment or solvents. Keep these products away from children and heat. Do not sand or treat suspected rust near brake lines or fuel lines yourself.",
            relatedPartIds = listOf("body_panels", "paint", "underbody", "chassis_frame"),
            quiz = LearnQuiz(
                question = "Why should you touch up a small paint chip quickly?",
                options = listOf(
                    "Bare metal can start to rust, and rust spreads",
                    "Chips make the car heavier",
                    "It improves fuel economy"
                ),
                answerIndex = 0,
                explanation = "Once bare metal is exposed to water and air, rust can start and slowly spread under the paint."
            ),
            level = "Beginner",
            minutes = 30
        )
    )
}