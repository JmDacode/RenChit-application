package com.example.renchityourstartupautoguide.model

object BrakesBasicsData {

    val groups = listOf(
        LearnGroup(
            id = "brake_types",
            systemId = "brakes",
            title = "Brake system types",
            intro = "The main ways a car slows down, and the safety systems that help."
        ),
        LearnGroup(
            id = "brake_disc",
            systemId = "brakes",
            title = "Disc brake parts",
            intro = "The most common brake design, used on the front wheels of almost every modern car."
        ),
        LearnGroup(
            id = "brake_drum",
            systemId = "brakes",
            title = "Drum brake parts",
            intro = "An older design that is still common on the rear wheels of many cars."
        )
    )

    val parts = listOf(

        // ---------- Brake system types ----------
        LearnPart(
            id = "disc_brakes",
            systemId = "brakes",
            groupId = "brake_types",
            name = "Disc brakes",
            summary = "Pads squeeze a spinning disc",
            whatIs = "A brake design where pads clamp onto a metal disc that spins with the wheel.",
            whatItDoes = listOf(
                "Turns the car's movement into heat by friction.",
                "Handles heat well, so it stops strongly and fades less."
            ),
            location = "Behind the wheel, usually on the front wheels, and on the rear wheels of many newer cars.",
            relatedIds = listOf("brake_rotor", "brake_pads", "brake_caliper", "drum_brakes"),
            ifItFails = "Longer stopping distances, noise, or vibration when braking.",
            maintenance = "Pads wear out and need replacing. Rotors are checked at each pad change.",
            quiz = LearnQuiz(
                question = "What squeezes the disc in a disc brake?",
                options = listOf("The brake pads", "The radiator", "The spark plugs"),
                answerIndex = 0,
                explanation = "The caliper presses the pads against the spinning disc."
            )
        ),

        LearnPart(
            id = "drum_brakes",
            systemId = "brakes",
            groupId = "brake_types",
            name = "Drum brakes",
            summary = "Shoes push outward inside a drum",
            whatIs = "A brake design where curved shoes push outward against the inside of a spinning drum.",
            whatItDoes = listOf(
                "Slows the wheel by rubbing against the drum.",
                "Is cheaper to build and works well as a parking brake."
            ),
            location = "Inside the wheel, usually on the rear wheels of cheaper or older cars.",
            relatedIds = listOf("brake_drum", "brake_shoes", "wheel_cylinder", "disc_brakes"),
            ifItFails = "Weak braking, a pedal that goes too low, or scraping noises from the rear.",
            maintenance = "Shoes wear out over time and need replacing. The drum is checked at the same time.",
            quiz = LearnQuiz(
                question = "Where do the shoes of a drum brake press?",
                options = listOf("Against the inside of the drum", "Against the tire", "Against the engine"),
                answerIndex = 0,
                explanation = "They push outward against the inner surface of the drum."
            )
        ),

        LearnPart(
            id = "hydraulic_braking",
            systemId = "brakes",
            groupId = "brake_types",
            name = "Hydraulic braking",
            summary = "Fluid carries your foot's force",
            whatIs = "A system that uses brake fluid under pressure to carry force from the pedal to the brakes at each wheel.",
            whatItDoes = listOf(
                "Turns a push on the pedal into pressure in the fluid.",
                "Sends that pressure to all four wheels at once."
            ),
            location = "Runs from the pedal under the dashboard, through the engine bay, to each wheel.",
            relatedIds = listOf("master_cylinder", "brake_lines", "brake_fluid", "brake_pedal"),
            ifItFails = "A soft pedal, a pedal that sinks, or poor braking. A leak is an emergency.",
            maintenance = "Keep the fluid clean and at the right level, and replace it on schedule.",
            whyItMatters = "Fluid cannot be squashed, so it passes force instantly.",
            quiz = LearnQuiz(
                question = "What carries force from the brake pedal to the wheels?",
                options = listOf("Brake fluid", "A belt", "Engine oil"),
                answerIndex = 0,
                explanation = "Pressure in the brake fluid does the work."
            )
        ),

        LearnPart(
            id = "electronic_braking",
            systemId = "brakes",
            groupId = "brake_types",
            name = "Electronic braking systems",
            summary = "Computers that help the brakes",
            whatIs = "The sensors, computers and controls that work with the basic brakes to make braking safer.",
            whatItDoes = listOf(
                "Include ABS, EBD and Brake Assist.",
                "May also include stability control and an electronic parking brake."
            ),
            relatedIds = listOf("abs", "ebd", "brake_assist", "abs_module"),
            ifItFails = "Warning lights on the dashboard. The basic brakes usually still work, but you lose the extra help.",
            maintenance = "A warning light means have it scanned by a mechanic soon.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What does an electronic braking warning light usually mean?",
                options = listOf(
                    "A safety system needs checking",
                    "The tank is full",
                    "The oil is fresh"
                ),
                answerIndex = 0,
                explanation = "The computer found a problem with one of the helper systems."
            )
        ),

        LearnPart(
            id = "abs",
            systemId = "brakes",
            groupId = "brake_types",
            name = "Anti-lock Braking System (ABS)",
            summary = "Stops the wheels from locking up",
            whatIs = "A system that stops the wheels from locking when you brake hard.",
            whatItDoes = listOf(
                "Releases and reapplies brake pressure many times a second.",
                "Lets you keep steering while braking hard."
            ),
            relatedIds = listOf("abs_module", "wheel_speed_sensors", "hydraulic_control_unit", "ebd"),
            ifItFails = "The ABS light comes on. Normal brakes work, but the wheels can lock in an emergency stop.",
            maintenance = "If the ABS light stays on, have it checked. Wheel speed sensors are a common cause.",
            whyItMatters = "A pulsing pedal during hard braking is normal. Keep pressing, do not pump the pedal.",
            quiz = LearnQuiz(
                question = "What should you do when the pedal pulses during a hard stop in an ABS car?",
                options = listOf(
                    "Keep pressing firmly",
                    "Pump the pedal",
                    "Let go of the pedal"
                ),
                answerIndex = 0,
                explanation = "The pulsing is ABS working. Keep firm pressure and steer."
            )
        ),

        LearnPart(
            id = "ebd",
            systemId = "brakes",
            groupId = "brake_types",
            name = "Electronic Brakeforce Distribution (EBD)",
            summary = "Shares braking force wisely",
            whatIs = "A system that adjusts how much braking force goes to each wheel.",
            whatItDoes = listOf(
                "Sends more or less force to the front or rear depending on load and grip.",
                "Helps the car stop straight, even when heavily loaded."
            ),
            relatedIds = listOf("abs", "proportioning_valve", "wheel_speed_sensors"),
            ifItFails = "Usually shows with the ABS or brake light. The car may feel less stable under hard braking.",
            maintenance = "Have any warning light diagnosed.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What does EBD adjust?",
                options = listOf(
                    "How much braking force each wheel gets",
                    "The air-fuel mix",
                    "The tire pressure"
                ),
                answerIndex = 0,
                explanation = "It balances braking force between wheels."
            )
        ),

        LearnPart(
            id = "brake_assist",
            systemId = "brakes",
            groupId = "brake_types",
            name = "Brake Assist",
            summary = "Adds force in an emergency",
            whatIs = "A system that notices an emergency stop and adds braking force.",
            whatItDoes = listOf(
                "Detects a very fast push on the pedal.",
                "Applies full braking power even if you did not press all the way."
            ),
            relatedIds = listOf("abs", "brake_booster"),
            ifItFails = "You may need to press the pedal harder in an emergency.",
            maintenance = "Not a routine service. Warning lights should be checked.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "When does Brake Assist step in?",
                options = listOf("In an emergency stop", "When parked", "When the engine is off"),
                answerIndex = 0,
                explanation = "It reacts when you slam the pedal quickly."
            )
        ),

        // ---------- Disc brake parts ----------
        LearnPart(
            id = "brake_rotor",
            systemId = "brakes",
            groupId = "brake_disc",
            name = "Brake rotor (disc)",
            summary = "The disc the pads squeeze",
            whatIs = "A heavy metal disc bolted to the wheel hub that spins with the wheel.",
            whatItDoes = listOf(
                "Gives the pads a surface to grip.",
                "Soaks up and releases the heat created by braking."
            ),
            location = "Behind each wheel, with the caliper around its edge.",
            relatedIds = listOf("brake_pads", "brake_caliper", "warped_rotors"),
            ifItFails = "A shaking steering wheel or pedal when braking, scraping, or deep grooves you can see.",
            maintenance = "Replace or resurface when too thin, warped, or heavily grooved. Always check them when changing pads.",
            quiz = LearnQuiz(
                question = "What can a warped rotor cause?",
                options = listOf("Vibration when braking", "A flat tire", "Hard starting"),
                answerIndex = 0,
                explanation = "The uneven surface makes the pedal or steering wheel shake."
            )
        ),

        LearnPart(
            id = "brake_pads",
            systemId = "brakes",
            groupId = "brake_disc",
            name = "Brake pads",
            summary = "The part that wears out",
            whatIs = "Flat blocks of friction material that clamp onto the rotor.",
            whatItDoes = listOf(
                "Create the friction that slows the car.",
                "Wear down a little every time you brake."
            ),
            location = "On each side of the rotor, inside the caliper.",
            relatedIds = listOf("brake_rotor", "brake_caliper", "brake_pad_wear"),
            ifItFails = "Squealing or grinding, longer stopping distances, or a brake warning light.",
            maintenance = "Check regularly and replace when thin. Do not wait for grinding, because that damages the rotors.",
            whyItMatters = "Worn pads are the most common brake repair.",
            quiz = LearnQuiz(
                question = "What does a grinding noise from the brakes often mean?",
                options = listOf("The pads are worn out", "The oil is low", "The tank is empty"),
                answerIndex = 0,
                explanation = "Metal on metal means the pad material is gone."
            )
        ),

        LearnPart(
            id = "brake_caliper",
            systemId = "brakes",
            groupId = "brake_disc",
            name = "Brake caliper",
            summary = "The clamp around the disc",
            whatIs = "A clamp that holds the pads and squeezes them onto the rotor.",
            whatItDoes = listOf(
                "Holds the pads in place.",
                "Uses fluid pressure to push the pads against the rotor."
            ),
            location = "Over the edge of the rotor, behind the wheel.",
            relatedIds = listOf("caliper_piston", "brake_pads", "brake_hose"),
            ifItFails = "A sticking caliper can make the car pull to one side, smell hot, or wear one pad quickly.",
            maintenance = "Have the slide pins cleaned and greased when the pads are changed.",
            quiz = LearnQuiz(
                question = "What does a sticking caliper often cause?",
                options = listOf("The car pulls to one side", "A dead battery", "Low coolant"),
                answerIndex = 0,
                explanation = "One wheel keeps braking more than the other."
            )
        ),

        LearnPart(
            id = "caliper_piston",
            systemId = "brakes",
            groupId = "brake_disc",
            name = "Caliper piston",
            summary = "Pushes the pad onto the rotor",
            whatIs = "A round piston inside the caliper that moves when brake fluid pushes on it.",
            whatItDoes = listOf(
                "Pushes the brake pad against the rotor.",
                "Pulls back slightly when you release the pedal."
            ),
            location = "Inside the brake caliper.",
            relatedIds = listOf("brake_caliper", "brake_pads", "brake_fluid"),
            ifItFails = "A seized piston causes dragging brakes, heat, and uneven pad wear. A leaking seal loses brake fluid.",
            maintenance = "Clean fluid helps protect the seals and the piston.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What pushes on the caliper piston?",
                options = listOf("Brake fluid", "Engine oil", "Exhaust gas"),
                answerIndex = 0,
                explanation = "Fluid pressure from the pedal moves the piston."
            )
        ),

        LearnPart(
            id = "brake_hose",
            systemId = "brakes",
            groupId = "brake_disc",
            name = "Brake hose",
            summary = "The flexible line to the caliper",
            whatIs = "A strong rubber hose that carries brake fluid to the caliper.",
            whatItDoes = listOf(
                "Bends so the wheel can move up, down and steer.",
                "Handles high fluid pressure."
            ),
            location = "Between the hard brake line on the body and each caliper.",
            relatedIds = listOf("brake_lines", "brake_caliper"),
            ifItFails = "Cracks, bulges or leaks. A burst hose means very weak braking.",
            maintenance = "Look for cracks, rubbing, wet spots, or swelling. Replace if it looks old or damaged.",
            quiz = LearnQuiz(
                question = "What should you do if a brake hose is cracked or leaking?",
                options = listOf("Have it replaced right away", "Ignore it", "Top up the oil"),
                answerIndex = 0,
                explanation = "A failed hose can cause the loss of braking."
            )
        ),

        LearnPart(
            id = "dust_shield",
            systemId = "brakes",
            groupId = "brake_disc",
            name = "Dust shield",
            summary = "A thin plate behind the rotor",
            whatIs = "A thin metal plate behind the rotor.",
            whatItDoes = listOf(
                "Blocks water, dirt and stones from the brake parts.",
                "Helps direct heat and dust away."
            ),
            location = "Behind each rotor, against the wheel hub.",
            relatedIds = listOf("brake_rotor", "wheel_hubs"),
            ifItFails = "A bent shield can scrape against the rotor with a light, metallic noise.",
            maintenance = "A mechanic can bend it back or remove the damaged part.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What does a bent dust shield often cause?",
                options = listOf("A scraping noise", "A dead battery", "A warm cabin"),
                answerIndex = 0,
                explanation = "It rubs against the rotor as it spins."
            )
        ),

        // ---------- Drum brake parts ----------
        LearnPart(
            id = "brake_drum",
            systemId = "brakes",
            groupId = "brake_drum",
            name = "Brake drum",
            summary = "The hollow drum that spins",
            whatIs = "A hollow metal drum that spins with the wheel.",
            whatItDoes = listOf(
                "Gives the shoes a surface to press against.",
                "Covers and protects the parts inside."
            ),
            location = "Behind the rear wheels on cars with drum brakes.",
            relatedIds = listOf("brake_shoes", "wheel_cylinder", "drum_brakes"),
            ifItFails = "A worn or out-of-round drum can cause shaking, noise, and weak braking.",
            maintenance = "It is inspected when the shoes are replaced, and replaced if worn past its limit.",
            quiz = LearnQuiz(
                question = "Where is the brake drum in the car?",
                options = listOf("Behind the wheel", "Under the hood", "In the tank"),
                answerIndex = 0,
                explanation = "It sits behind the wheel and spins with it."
            )
        ),

        LearnPart(
            id = "brake_shoes",
            systemId = "brakes",
            groupId = "brake_drum",
            name = "Brake shoes",
            summary = "Curved pads inside the drum",
            whatIs = "Curved pieces with friction material that press outward against the inside of the drum.",
            whatItDoes = listOf(
                "Create the friction that slows the wheel.",
                "Wear down gradually, like disc brake pads."
            ),
            location = "Inside the brake drum.",
            relatedIds = listOf("brake_drum", "wheel_cylinder", "return_springs"),
            ifItFails = "Weak braking, a low pedal, or scraping from the rear.",
            maintenance = "Replace when the friction material is thin. They usually last longer than front pads.",
            quiz = LearnQuiz(
                question = "Which part of a drum brake has friction material?",
                options = listOf("The shoes", "The drum cover", "The wheel nut"),
                answerIndex = 0,
                explanation = "The shoes carry the friction lining."
            )
        ),

        LearnPart(
            id = "wheel_cylinder",
            systemId = "brakes",
            groupId = "brake_drum",
            name = "Wheel cylinder",
            summary = "Pushes the shoes outward",
            whatIs = "A small hydraulic cylinder with two pistons that push the brake shoes apart.",
            whatItDoes = listOf(
                "Takes fluid pressure from the brake line.",
                "Moves the shoes against the drum."
            ),
            location = "At the top of the drum brake, between the shoes.",
            relatedIds = listOf("brake_shoes", "brake_lines", "brake_fluid"),
            ifItFails = "A leak coats the shoes in fluid, causing weak braking and a low pedal.",
            maintenance = "Look for wetness around the drum when checking the brakes.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What moves the brake shoes outward?",
                options = listOf("The wheel cylinder", "The fan", "The alternator"),
                answerIndex = 0,
                explanation = "Fluid pressure moves its pistons, which push the shoes."
            )
        ),

        LearnPart(
            id = "return_springs",
            systemId = "brakes",
            groupId = "brake_drum",
            name = "Return springs",
            summary = "Pull the shoes back",
            whatIs = "Springs that pull the brake shoes back to rest after braking.",
            whatItDoes = listOf(
                "Keep the shoes from dragging on the drum.",
                "Hold the shoes in the right position."
            ),
            location = "Inside the brake drum, attached to the shoes.",
            relatedIds = listOf("brake_shoes", "drum_adjuster"),
            ifItFails = "Weak or broken springs cause dragging brakes, heat, and fast wear.",
            maintenance = "They are usually replaced together with the shoes.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What do return springs do?",
                options = listOf("Pull the shoes back", "Pump the fluid", "Cool the drum"),
                answerIndex = 0,
                explanation = "They retract the shoes when you release the pedal."
            )
        ),

        LearnPart(
            id = "drum_adjuster",
            systemId = "brakes",
            groupId = "brake_drum",
            name = "Adjuster mechanism",
            summary = "Keeps the shoes close to the drum",
            whatIs = "A small mechanism that keeps the right gap between the shoes and the drum as the shoes wear.",
            whatItDoes = listOf(
                "Moves the shoes closer as they wear.",
                "Keeps the pedal from sinking low over time."
            ),
            location = "Inside the brake drum, between the shoes.",
            relatedIds = listOf("brake_shoes", "return_springs"),
            ifItFails = "A pedal that goes too low, or weak rear braking.",
            maintenance = "A mechanic sets or cleans it when servicing the drums.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What does the adjuster keep right?",
                options = listOf("The gap between shoes and drum", "The oil level", "The air pressure"),
                answerIndex = 0,
                explanation = "It takes up the slack as the shoes wear."
            )
        )
    )
}