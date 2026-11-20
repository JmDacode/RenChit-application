package com.example.renchityourstartupautoguide.model

object BodySafetyData {

    val groups = listOf(
        LearnGroup(
            id = "body_chassis",
            systemId = "body_safety",
            title = "Chassis and structure",
            intro = "The skeleton that everything else bolts onto."
        ),
        LearnGroup(
            id = "body_components",
            systemId = "body_safety",
            title = "Body components",
            intro = "The panels, glass and mirrors you see and use every day."
        ),
        LearnGroup(
            id = "body_safety_systems",
            systemId = "body_safety",
            title = "Safety systems",
            intro = "What protects you in a crash, and what helps you avoid one."
        )
    )

    val parts = listOf(

        // ---------- Chassis and structure ----------
        LearnPart(
            id = "ladder_frame",
            systemId = "body_safety",
            groupId = "body_chassis",
            name = "Ladder frame",
            summary = "A strong steel ladder under the body",
            whatIs = "A frame made of two long steel rails joined by cross beams, like a ladder. The body sits on top of it.",
            whatItDoes = listOf(
                "Carries the weight of the engine, body and load.",
                "Handles towing, heavy loads and rough roads well."
            ),
            location = "Under the body of pickup trucks and large, rugged SUVs.",
            relatedIds = listOf("frame_rails", "crossmembers", "body_mounts", "unibody"),
            ifItFails = "Rust or a bent frame causes steering problems, uneven tire wear and a car that does not track straight.",
            maintenance = "Check for rust, cracks and bends, especially if you drive on salty, muddy or flooded roads, or after an accident.",
            quiz = LearnQuiz(
                question = "Which vehicles commonly use a ladder frame?",
                options = listOf("Pickup trucks and big SUVs", "Small city cars", "Motorcycles only"),
                answerIndex = 0,
                explanation = "They need strength for loads, towing and rough ground."
            )
        ),

        LearnPart(
            id = "unibody",
            systemId = "body_safety",
            groupId = "body_chassis",
            name = "Unibody construction",
            summary = "The body is the frame",
            whatIs = "A design where the body and frame are built as one piece, with no separate ladder frame.",
            whatItDoes = listOf(
                "Makes the car lighter, which helps fuel economy and handling.",
                "Lets engineers design crumple zones and a strong cabin together."
            ),
            location = "The whole structure of most modern passenger cars and many SUVs.",
            relatedIds = listOf("ladder_frame", "subframes", "crumple_zones", "reinforced_pillars"),
            ifItFails = "After a serious crash, a unibody needs professional measuring and straightening. Poor repairs weaken it.",
            maintenance = "Use a repair shop that works to the maker's repair procedures after any structural damage.",
            quiz = LearnQuiz(
                question = "What is special about a unibody?",
                options = listOf(
                    "Body and frame are one structure",
                    "It has two engines",
                    "It has no doors"
                ),
                answerIndex = 0,
                explanation = "The body itself provides the strength."
            )
        ),

        LearnPart(
            id = "crossmembers",
            systemId = "body_safety",
            groupId = "body_chassis",
            name = "Crossmembers",
            summary = "Beams that tie the sides together",
            whatIs = "Beams that run across the car from one side to the other.",
            whatItDoes = listOf(
                "Add strength and stiffness.",
                "Often support the engine, the transmission or parts of the suspension."
            ),
            location = "Under the car, at several points between the frame rails.",
            relatedIds = listOf("frame_rails", "subframes", "ladder_frame"),
            ifItFails = "Rust or damage can loosen what they support, causing noises and poor handling.",
            maintenance = "Look for rust, cracks and bends during underbody checks.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "In which direction do crossmembers run?",
                options = listOf("Side to side", "Front to back only", "Straight up"),
                answerIndex = 0,
                explanation = "They span across the car, linking the two sides."
            )
        ),

        LearnPart(
            id = "frame_rails",
            systemId = "body_safety",
            groupId = "body_chassis",
            name = "Frame rails",
            summary = "The long beams down each side",
            whatIs = "Long steel beams that run front to back along each side of the car.",
            whatItDoes = listOf(
                "Carry the load and the crash forces.",
                "On many cars, the front sections are built to crumple in a crash."
            ),
            location = "Under the car, along both sides.",
            relatedIds = listOf("crossmembers", "ladder_frame", "crumple_zones"),
            ifItFails = "Bent or rusted rails cause alignment that will not hold and a car that drifts or crab-walks.",
            maintenance = "Inspect after any accident and in rust-prone areas.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "Which way do frame rails run?",
                options = listOf("Front to back", "Side to side", "In circles"),
                answerIndex = 0,
                explanation = "They run along the length of the car."
            )
        ),

        LearnPart(
            id = "subframes",
            systemId = "body_safety",
            groupId = "body_chassis",
            name = "Subframes",
            summary = "Bolt-on frames for the engine and suspension",
            whatIs = "Smaller frames bolted under the front or rear of a unibody car to hold the engine, steering or suspension.",
            whatItDoes = listOf(
                "Carry heavy parts away from the main body.",
                "Often sit on rubber mounts to reduce noise and vibration."
            ),
            location = "Under the front and sometimes the rear of the car.",
            relatedIds = listOf("unibody", "crossmembers", "bushings", "lower_control_arm"),
            ifItFails = "Rusted, loose or bent subframes cause clunks, steering vibration and alignment problems.",
            maintenance = "Look for rust and worn mounts. A bent subframe after a crash must be repaired or replaced.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What do subframes often carry?",
                options = listOf(
                    "The engine and suspension parts",
                    "The spare tire only",
                    "The rear seats"
                ),
                answerIndex = 0,
                explanation = "They hold heavy mechanical parts under a unibody car."
            )
        ),

        LearnPart(
            id = "body_mounts",
            systemId = "body_safety",
            groupId = "body_chassis",
            name = "Body mounts",
            summary = "Rubber cushions between body and frame",
            whatIs = "Rubber mounts that sit between the body and the frame on a ladder-frame vehicle.",
            whatItDoes = listOf(
                "Reduce noise and vibration reaching the cabin.",
                "Hold the body firmly on the frame."
            ),
            location = "Along the frame, where the body bolts down.",
            relatedIds = listOf("ladder_frame", "bushings"),
            ifItFails = "Cracked or collapsed mounts cause clunks, extra vibration, and a body that shifts over bumps.",
            maintenance = "Look for cracked, crushed or missing mounts when the vehicle is lifted.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What do body mounts help reduce?",
                options = listOf("Noise and vibration", "Tire wear", "Fuel use"),
                answerIndex = 0,
                explanation = "The rubber absorbs vibration between frame and body."
            )
        ),

        // ---------- Body components ----------
        LearnPart(
            id = "hood",
            systemId = "body_safety",
            groupId = "body_components",
            name = "Hood",
            summary = "The lid over the engine",
            whatIs = "The panel that covers the engine bay. It is also called the bonnet.",
            whatItDoes = listOf(
                "Protects the engine from weather and dirt.",
                "Is designed to fold in a crash instead of entering the cabin."
            ),
            location = "At the front of the car.",
            relatedIds = listOf("fenders", "bumpers", "crumple_zones"),
            ifItFails = "A faulty latch can let the hood open while driving. Always check that the safety catch is secured.",
            maintenance = "Close it firmly from a small height and make sure it is latched. Check the struts or prop rod.",
            whyItMatters = "A hood flying up at speed blocks your view and is very dangerous.",
            quiz = LearnQuiz(
                question = "What should you check before driving after opening the hood?",
                options = listOf("That it is fully latched", "That the engine is off only", "Nothing"),
                answerIndex = 0,
                explanation = "A loose hood can fly open at speed."
            )
        ),

        LearnPart(
            id = "fenders",
            systemId = "body_safety",
            groupId = "body_components",
            name = "Fenders",
            summary = "The panels over the wheels",
            whatIs = "The body panels around the wheel arches.",
            whatItDoes = listOf(
                "Block mud, water and stones thrown up by the tires.",
                "Shape the car's look."
            ),
            location = "Over each wheel, between the doors and the front bumper, and at the rear.",
            relatedIds = listOf("hood", "bumpers", "tread"),
            ifItFails = "Rust often starts at the edges of wheel arches. Cracks and dents are mostly cosmetic, unless they rub the tire.",
            maintenance = "Wash the wheel arches, especially after muddy or salty driving, and fix paint chips early.",
            quiz = LearnQuiz(
                question = "Where does rust often start on a car body?",
                options = listOf("Wheel arch edges", "The steering wheel", "The radio"),
                answerIndex = 0,
                explanation = "Water, mud and salt collect there."
            )
        ),

        LearnPart(
            id = "doors",
            systemId = "body_safety",
            groupId = "body_components",
            name = "Doors",
            summary = "More than a way in",
            whatIs = "The panels that let you in and out. They hold locks, windows, speakers and side-impact beams.",
            whatItDoes = listOf(
                "Keep you safe in a side impact with steel beams inside.",
                "Seal out water, wind and noise with rubber seals."
            ),
            relatedIds = listOf("glass_windows", "reinforced_pillars", "mirrors"),
            ifItFails = "Sagging hinges, worn seals or faulty latches cause wind noise, water leaks and doors that do not close properly.",
            maintenance = "Lubricate hinges and latches now and then, and check the seals for tears. Use the child locks when children ride in the back.",
            quiz = LearnQuiz(
                question = "What is inside a door to help in a side crash?",
                options = listOf("Steel side-impact beams", "The engine", "The battery"),
                answerIndex = 0,
                explanation = "Beams in the door absorb side-impact forces."
            )
        ),

        LearnPart(
            id = "bumpers",
            systemId = "body_safety",
            groupId = "body_components",
            name = "Bumpers",
            summary = "Soak up low-speed knocks",
            whatIs = "The front and rear parts of the car designed to take light impacts. A plastic cover hides a strong beam and energy-absorbing foam.",
            whatItDoes = listOf(
                "Protect the car and others in low-speed crashes.",
                "Often hold parking sensors and radar behind the cover."
            ),
            location = "At the very front and rear.",
            relatedIds = listOf("crumple_zones", "parking_sensors", "collision_warning", "fenders"),
            ifItFails = "A cover that looks fine can hide a broken beam or damaged sensors behind it.",
            maintenance = "After even a small bump, have the structure and sensors behind the cover checked.",
            quiz = LearnQuiz(
                question = "What may be hidden behind a bumper cover?",
                options = listOf("A beam, foam and sensors", "The fuel tank", "The engine"),
                answerIndex = 0,
                explanation = "The cover hides the real structure and often sensors."
            )
        ),

        LearnPart(
            id = "tailgate",
            systemId = "body_safety",
            groupId = "body_components",
            name = "Tailgate",
            summary = "The rear opening",
            whatIs = "The rear door or lid that opens to the cargo area, also called a liftgate or trunk lid.",
            whatItDoes = listOf(
                "Gives access to the cargo area.",
                "Is held up by gas struts, and sealed by rubber."
            ),
            location = "At the back of the car.",
            relatedIds = listOf("bumpers", "glass_windows"),
            ifItFails = "Weak struts let it drop on you. Bad seals let in water and exhaust fumes.",
            maintenance = "Replace weak struts. Never drive with the tailgate open, because exhaust gas can enter the cabin.",
            whyItMatters = "Exhaust fumes can be drawn into the cabin if you drive with the rear open.",
            quiz = LearnQuiz(
                question = "Why avoid driving with the tailgate open?",
                options = listOf(
                    "Exhaust fumes can enter the cabin",
                    "It cools the engine too much",
                    "It breaks the radio"
                ),
                answerIndex = 0,
                explanation = "Air flowing past can pull exhaust gas into the cabin."
            )
        ),

        LearnPart(
            id = "glass_windows",
            systemId = "body_safety",
            groupId = "body_components",
            name = "Glass and windows",
            summary = "Part of the car's safety structure",
            whatIs = "The windshield, side windows and rear window.",
            whatItDoes = listOf(
                "The windshield is laminated: two layers of glass with a plastic film between, so it cracks rather than shatters.",
                "It also helps hold up the roof and lets passenger airbags work properly.",
                "Side and rear windows are tempered, and break into small pieces."
            ),
            relatedIds = listOf("doors", "airbags", "collision_warning"),
            ifItFails = "A small chip can spread into a crack. Cracks in your line of sight are a safety and legal problem.",
            maintenance = "Repair chips early. After a windshield replacement, cameras and sensors may need recalibrating.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "Why repair a small windshield chip quickly?",
                options = listOf(
                    "It can spread into a large crack",
                    "It improves fuel use",
                    "It makes the engine quieter"
                ),
                answerIndex = 0,
                explanation = "Temperature changes and bumps make chips grow."
            )
        ),

        LearnPart(
            id = "mirrors",
            systemId = "body_safety",
            groupId = "body_components",
            name = "Mirrors",
            summary = "Your view of what is behind",
            whatIs = "The rear-view mirror inside, and the side mirrors outside.",
            whatItDoes = listOf(
                "Show traffic behind and beside you.",
                "Many have heating, folding, and blind-spot warning lights."
            ),
            relatedIds = listOf("doors", "parking_sensors"),
            ifItFails = "A cracked or loose mirror reduces visibility and may be illegal.",
            maintenance = "Adjust them before you drive so that you can just see the side of your car. Check the blind spot over your shoulder too.",
            quiz = LearnQuiz(
                question = "When should you adjust your mirrors?",
                options = listOf("Before you start driving", "While overtaking", "Never"),
                answerIndex = 0,
                explanation = "Set them up while parked, so you do not need to adjust on the move."
            )
        ),

        // ---------- Safety systems ----------
        LearnPart(
            id = "seat_belts",
            systemId = "body_safety",
            groupId = "body_safety_systems",
            name = "Seat belts",
            summary = "The most important safety device",
            whatIs = "Straps that hold you in your seat during a crash or hard braking.",
            whatItDoes = listOf(
                "Spread crash forces across the strongest parts of your body.",
                "Keep you in the right position so airbags can work."
            ),
            relatedIds = listOf("pretensioners", "airbags"),
            ifItFails = "Frayed, cut or stuck belts must be replaced. A belt that has been in a serious crash should be replaced.",
            maintenance = "Wear it every trip, in every seat. The lap belt goes low across your hips, and the shoulder belt across your chest, not under your arm or behind your back.",
            whyItMatters = "Airbags are designed to work together with seat belts, not replace them.",
            quiz = LearnQuiz(
                question = "Where should the lap part of the belt sit?",
                options = listOf("Low across the hips", "Across the stomach", "Behind your back"),
                answerIndex = 0,
                explanation = "The hips are strong enough to take crash forces."
            )
        ),

        LearnPart(
            id = "airbags",
            systemId = "body_safety",
            groupId = "body_safety_systems",
            name = "Airbags",
            summary = "Cushions that inflate in a crash",
            whatIs = "Bags that inflate in a fraction of a second during a serious crash. Cars may have front, side and curtain airbags.",
            whatItDoes = listOf(
                "Cushion your head and chest.",
                "Work together with the seat belt."
            ),
            location = "In the steering wheel, dashboard, seats, door panels and along the roof edge.",
            relatedIds = listOf("seat_belts", "pretensioners", "glass_windows"),
            ifItFails = "If the airbag warning light stays on, the system may not work. Have it checked.",
            maintenance = "Sit at least about 25 cm from the steering wheel. Never put a rear-facing child seat in front of an active front airbag. After deployment, the airbags and related parts must be replaced. Check if your car has an airbag recall.",
            whyItMatters = "An airbag deploys very fast and can injure someone who sits too close.",
            quiz = LearnQuiz(
                question = "Where should a rear-facing child seat go?",
                options = listOf(
                    "Not in front of an active airbag",
                    "On the dashboard",
                    "Anywhere"
                ),
                answerIndex = 0,
                explanation = "An inflating airbag can seriously injure a small child."
            )
        ),

        LearnPart(
            id = "pretensioners",
            systemId = "body_safety",
            groupId = "body_safety_systems",
            name = "Seat-belt pretensioners",
            summary = "Pull the belt tight in a crash",
            whatIs = "Devices that tighten the seat belt in the first instant of a crash.",
            whatItDoes = listOf(
                "Remove slack from the belt.",
                "Hold you firmly in the best position for the airbag."
            ),
            location = "At the buckle or at the belt reel, in the seat or pillar.",
            relatedIds = listOf("seat_belts", "airbags"),
            ifItFails = "After they fire, they must be replaced. The belt then feels tighter or stays locked.",
            maintenance = "Have the belts and pretensioners checked after any crash, even a minor one.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "When do pretensioners work?",
                options = listOf("At the start of a crash", "Every time you brake lightly", "Only at night"),
                answerIndex = 0,
                explanation = "They tighten the belt within a split second of an impact."
            )
        ),

        LearnPart(
            id = "crumple_zones",
            systemId = "body_safety",
            groupId = "body_safety_systems",
            name = "Crumple zones",
            summary = "The car crushes so you do not",
            whatIs = "Parts of the car at the front and rear that are designed to fold in a controlled way in a crash.",
            whatItDoes = listOf(
                "Absorb crash energy.",
                "Slow the car down more gently, so less force reaches the passengers."
            ),
            location = "The front and rear structure, ahead of and behind the passenger cabin.",
            relatedIds = listOf("frame_rails", "bumpers", "unibody", "reinforced_pillars"),
            ifItFails = "Poor repairs after a crash can stop a crumple zone from working next time.",
            maintenance = "Have structural repairs done by a shop that follows the maker's procedures, with proper welding and measuring.",
            whyItMatters = "A car that crumples can be safer than one that stays rigid.",
            quiz = LearnQuiz(
                question = "What is the purpose of a crumple zone?",
                options = listOf(
                    "Absorb crash energy",
                    "Save fuel",
                    "Make the car heavier"
                ),
                answerIndex = 0,
                explanation = "It crushes in a controlled way, so the cabin stays safer."
            )
        ),

        LearnPart(
            id = "reinforced_pillars",
            systemId = "body_safety",
            groupId = "body_safety_systems",
            name = "Reinforced pillars",
            summary = "A strong cage around you",
            whatIs = "The A, B and C pillars hold up the roof around the windows. They are made from very strong steel.",
            whatItDoes = listOf(
                "Protect the cabin in a rollover and a side crash.",
                "Form a safety cage around the passengers."
            ),
            location = "Beside the windshield (A), between the doors (B), and behind the rear doors (C).",
            relatedIds = listOf("crumple_zones", "doors", "unibody"),
            ifItFails = "Cutting, heating or badly welding them can weaken them.",
            maintenance = "Do not modify the pillars. After roof or pillar damage, use a qualified repairer.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What do the pillars hold up?",
                options = listOf("The roof", "The engine", "The bumper"),
                answerIndex = 0,
                explanation = "They carry the roof and protect the cabin."
            )
        ),

        LearnPart(
            id = "esc",
            systemId = "body_safety",
            groupId = "body_safety_systems",
            name = "Electronic Stability Control (ESC)",
            summary = "Helps stop a skid",
            whatIs = "A system that helps keep the car going where you steer, if it begins to slide.",
            whatItDoes = listOf(
                "Compares where you steer with where the car is going.",
                "Brakes individual wheels and reduces power to bring the car back in line."
            ),
            relatedIds = listOf("tcs", "abs", "wheel_speed_sensors", "ecu"),
            ifItFails = "A steady ESC warning light means it may be off or faulty. A flashing light means it is working right now.",
            maintenance = "Leave it on for normal driving. Fix any sensor or warning issue.",
            whyItMatters = "It cuts the risk of a skid-related crash and is required on new cars in many countries.",
            quiz = LearnQuiz(
                question = "What does a flashing ESC light usually mean?",
                options = listOf(
                    "The system is working to stop a skid",
                    "The tank is full",
                    "The oil is old"
                ),
                answerIndex = 0,
                explanation = "It flashes while it is actively correcting the car."
            )
        ),

        LearnPart(
            id = "tcs",
            systemId = "body_safety",
            groupId = "body_safety_systems",
            name = "Traction Control System (TCS)",
            summary = "Stops the wheels spinning",
            whatIs = "A system that stops the drive wheels from spinning when you accelerate on a slippery surface.",
            whatItDoes = listOf(
                "Cuts engine power or brakes a spinning wheel.",
                "Uses the same wheel speed sensors as ABS."
            ),
            relatedIds = listOf("esc", "abs", "wheel_speed_sensors"),
            ifItFails = "A TCS light stays on, and the car may spin its wheels easily on a wet or loose surface.",
            maintenance = "Keep it on normally. In deep mud or snow, a short time off can help you get moving, and you should turn it back on afterward.",
            quiz = LearnQuiz(
                question = "What does TCS prevent?",
                options = listOf("Wheelspin when accelerating", "Overheating", "Flat tires"),
                answerIndex = 0,
                explanation = "It keeps the driven wheels from losing grip under power."
            )
        ),

        LearnPart(
            id = "parking_sensors",
            systemId = "body_safety",
            groupId = "body_safety_systems",
            name = "Parking sensors",
            summary = "Beep when you get close",
            whatIs = "Small sensors in the bumpers that detect nearby objects, usually with sound waves, and beep faster as you get closer.",
            whatItDoes = listOf(
                "Help you park and reverse in tight spaces.",
                "Work best at low speed."
            ),
            location = "In the front and rear bumpers, shown as small round dots.",
            relatedIds = listOf("bumpers", "mirrors", "collision_warning"),
            ifItFails = "Dirt, ice, mud or damage can cause false alarms or silence. They can miss thin or low objects.",
            maintenance = "Keep the sensors clean, and do not rely on them alone. Look around, and use your mirrors.",
            quiz = LearnQuiz(
                question = "What can stop parking sensors from working well?",
                options = listOf("Dirt or ice on them", "A full tank", "New tires"),
                answerIndex = 0,
                explanation = "A covered sensor cannot send or receive properly."
            )
        ),

        LearnPart(
            id = "collision_warning",
            systemId = "body_safety",
            groupId = "body_safety_systems",
            name = "Collision warning systems",
            summary = "An alert before a crash",
            whatIs = "Systems that use radar or a camera to spot a vehicle or person ahead and warn you if you are getting too close.",
            whatItDoes = listOf(
                "Beep or flash if a collision looks likely.",
                "Some can brake the car automatically. This is called automatic emergency braking."
            ),
            location = "A camera behind the windshield, and radar in the grille or bumper.",
            relatedIds = listOf("bumpers", "glass_windows", "parking_sensors", "abs"),
            ifItFails = "Dirt, snow, heavy rain or damage can make it unavailable, and a warning message appears.",
            maintenance = "Keep the camera area of the windshield and the radar cover clean. After a windshield or bumper repair, the system may need recalibrating.",
            whyItMatters = "It helps, but it does not replace paying attention. It may not detect everything.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What might be needed after replacing the windshield on a car with a camera?",
                options = listOf("Recalibrating the camera", "A new battery", "A coolant change"),
                answerIndex = 0,
                explanation = "The camera must be re-aimed so its readings are accurate."
            )
        )
    )
}