package com.example.renchityourstartupautoguide.model

object ElectricalSystemsData {

    val groups = listOf(
        LearnGroup(
            id = "elec_components",
            systemId = "electrical",
            title = "Electrical components",
            intro = "The parts that protect, connect, control and monitor the car's circuits."
        ),
        LearnGroup(
            id = "elec_lighting",
            systemId = "electrical",
            title = "Lighting and accessories",
            intro = "The lights and signals that help you see and be seen."
        ),
        LearnGroup(
            id = "elec_diagnostics",
            systemId = "electrical",
            title = "Diagnostics",
            intro = "Common electrical problems, what causes them, and what to check first."
        )
    )

    val parts = listOf(

        // ---------- Electrical components ----------
        LearnPart(
            id = "fuses",
            systemId = "electrical",
            groupId = "elec_components",
            name = "Fuses",
            summary = "Cheap protection for each circuit",
            whatIs = "A small part with a thin strip of metal that melts if too much current flows.",
            whatItDoes = listOf(
                "Cuts off a circuit before wires overheat.",
                "Protects expensive parts and prevents fires."
            ),
            location = "In fuse boxes, usually one under the hood and one inside the cabin near the driver's footwell. Your manual has a diagram.",
            relatedIds = listOf("blown_fuse", "relays", "current"),
            ifItFails = "When a fuse blows, whatever it protects stops working, such as the radio or the power windows.",
            maintenance = "Always replace a blown fuse with the same amp rating. Keep a few spares and a fuse puller in the car.",
            whyItMatters = "A bigger fuse can let wires overheat. Never use a higher rating, and never use foil or wire.",
            quiz = LearnQuiz(
                question = "What should you replace a blown fuse with?",
                options = listOf(
                    "The same amp rating",
                    "A higher amp rating",
                    "A piece of wire"
                ),
                answerIndex = 0,
                explanation = "The rating is chosen to protect the wiring. A bigger one defeats the purpose."
            )
        ),

        LearnPart(
            id = "relays",
            systemId = "electrical",
            groupId = "elec_components",
            name = "Relays",
            summary = "A small switch that controls a big one",
            whatIs = "An electromagnetic switch. A small current flips it, which then switches a much bigger current.",
            whatItDoes = listOf(
                "Lets a thin wire and a small switch control heavy loads such as headlights, the horn or the fuel pump.",
                "Keeps heavy current away from dashboard switches."
            ),
            location = "In the fuse and relay boxes.",
            relatedIds = listOf("fuses", "starter_relay", "switches"),
            ifItFails = "The part it controls stops working, even when the fuse is fine. You may hear a click, or hear nothing.",
            maintenance = "A suspect relay can often be swapped with an identical one from a less important circuit to test it.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What does a relay let a small current do?",
                options = listOf(
                    "Switch a much larger current",
                    "Store energy",
                    "Cool the wires"
                ),
                answerIndex = 0,
                explanation = "A small signal flips the relay, and the relay carries the heavy load."
            )
        ),

        LearnPart(
            id = "wiring_harnesses",
            systemId = "electrical",
            groupId = "elec_components",
            name = "Wiring harnesses",
            summary = "The car's nervous system",
            whatIs = "Bundles of wires wrapped together that run through the car.",
            whatItDoes = listOf(
                "Carry power and signals between parts.",
                "Keep wires neat, protected and in the right place."
            ),
            location = "Throughout the car: engine bay, under the dash, along the body and into the doors.",
            relatedIds = listOf("connectors", "fuses", "ecu"),
            ifItFails = "Chafed or rodent-chewed wires cause shorts, blown fuses, and problems that come and go.",
            maintenance = "Keep wires clipped away from hot or moving parts. Fix damaged insulation right away.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What is a wiring harness?",
                options = listOf(
                    "A bundle of wires that runs through the car",
                    "A type of fuse",
                    "A seat belt"
                ),
                answerIndex = 0,
                explanation = "It organizes the many wires that connect parts."
            )
        ),

        LearnPart(
            id = "connectors",
            systemId = "electrical",
            groupId = "elec_components",
            name = "Connectors",
            summary = "Plugs that join wires and parts",
            whatIs = "Plastic plugs with metal pins that link wires to each other and to sensors, lights and modules.",
            whatItDoes = listOf(
                "Make parts easy to replace.",
                "Use seals and locks to keep out water and stay in place."
            ),
            relatedIds = listOf("wiring_harnesses", "loose_connections", "sensors"),
            ifItFails = "Corroded or loose pins cause on and off problems, warning lights, and sensor faults.",
            maintenance = "Press until the lock clicks. Never pull on the wires. Use a little electrical contact cleaner if there is corrosion.",
            quiz = LearnQuiz(
                question = "How should you unplug a connector?",
                options = listOf(
                    "Release the lock and pull the plug, not the wires",
                    "Yank the wires",
                    "Cut it"
                ),
                answerIndex = 0,
                explanation = "Pulling on the wires can break them inside the insulation."
            )
        ),

        LearnPart(
            id = "switches",
            systemId = "electrical",
            groupId = "elec_components",
            name = "Switches",
            summary = "Let you turn things on and off",
            whatIs = "Controls that open or close a circuit, such as the headlight switch, window buttons and wiper stalk.",
            whatItDoes = listOf(
                "Give you direct control of lights, wipers, windows and more.",
                "Some, like the brake light switch, work automatically."
            ),
            location = "On the dashboard, steering column, doors and pedals.",
            relatedIds = listOf("relays", "brake_lights", "ignition_switch"),
            ifItFails = "A function that works only sometimes, or not at all, even though the bulb or motor is fine.",
            maintenance = "Not a routine service. Replace the switch when it wears out.",
            quiz = LearnQuiz(
                question = "What does a switch do in a circuit?",
                options = listOf(
                    "Opens or closes it",
                    "Stores power",
                    "Cools it"
                ),
                answerIndex = 0,
                explanation = "It breaks or completes the path for current."
            )
        ),

        LearnPart(
            id = "sensors",
            systemId = "electrical",
            groupId = "elec_components",
            name = "Sensors",
            summary = "The car's eyes and ears",
            whatIs = "Small devices that measure things like temperature, pressure, speed, position and oxygen, and send the data as electrical signals.",
            whatItDoes = listOf(
                "Report conditions to the ECU.",
                "Help the car run efficiently and safely."
            ),
            location = "All over the car, from the engine and exhaust to the wheels and doors.",
            relatedIds = listOf("ecu", "maf_sensor", "coolant_temp_sensor", "wheel_speed_sensors"),
            ifItFails = "A check engine light, poor running, or bad fuel economy.",
            maintenance = "A scan tool reads the fault codes. Replace the sensor if it is faulty, and check the wiring first.",
            whyItMatters = "Modern cars use dozens of sensors, and many problems are sensor faults, not big repairs.",
            quiz = LearnQuiz(
                question = "Where do sensors send their information?",
                options = listOf("To the ECU", "To the fuel tank", "To the tires"),
                answerIndex = 0,
                explanation = "The ECU uses the readings to control the car."
            )
        ),

        LearnPart(
            id = "ecu",
            systemId = "electrical",
            groupId = "elec_components",
            name = "Electronic Control Unit (ECU)",
            summary = "The car's computer",
            whatIs = "A computer that reads the sensors and controls things like fuel injection, ignition timing and idle speed. Cars often have several control units.",
            whatItDoes = listOf(
                "Decides how much fuel to inject and when to spark.",
                "Turns on the check engine light and stores fault codes."
            ),
            location = "Usually in the engine bay or under the dashboard, in a protected box.",
            relatedIds = listOf("sensors", "fuel_injectors", "wiring_harnesses", "battery_sensors"),
            ifItFails = "Rare. Faults are more often caused by sensors, wiring or power problems than by the ECU itself.",
            maintenance = "Keep the battery healthy, because low voltage can cause strange ECU behaviour. Avoid jump-starting wrongly.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What does the ECU do?",
                options = listOf(
                    "Controls engine functions using sensor data",
                    "Stores fuel",
                    "Cools the cabin"
                ),
                answerIndex = 0,
                explanation = "It reads sensors and adjusts fuel and ignition."
            )
        ),

        // ---------- Lighting and accessories ----------
        LearnPart(
            id = "headlights",
            systemId = "electrical",
            groupId = "elec_lighting",
            name = "Headlights",
            summary = "Light the road ahead",
            whatIs = "The main lights at the front of the car, with a low beam for normal use and a high beam for dark, empty roads.",
            whatItDoes = listOf(
                "Let you see at night and in bad weather.",
                "Make you visible to others.",
                "Come as halogen, HID (xenon) or LED."
            ),
            location = "At the front corners of the car.",
            relatedIds = listOf("tail_lights", "fog_lights", "relays", "fuses"),
            ifItFails = "A dim, yellow or cloudy lens cuts visibility. A burnt bulb is a safety and legal problem.",
            maintenance = "Check both lights regularly. Replace bulbs in pairs when possible. Polish a foggy lens, and have the aim checked so you do not blind others.",
            whyItMatters = "Poor headlights are one of the easiest safety problems to fix.",
            quiz = LearnQuiz(
                question = "When should you use high beams?",
                options = listOf(
                    "On dark roads with no oncoming traffic",
                    "Always",
                    "In heavy traffic"
                ),
                answerIndex = 0,
                explanation = "High beams can dazzle other drivers, so use them only when it is clear."
            )
        ),

        LearnPart(
            id = "tail_lights",
            systemId = "electrical",
            groupId = "elec_lighting",
            name = "Tail lights",
            summary = "Make you visible from behind",
            whatIs = "The red lights at the rear that come on with your headlights.",
            whatItDoes = listOf(
                "Let drivers behind you see you at night.",
                "Share their housing with brake lights and turn signals on many cars."
            ),
            location = "At the rear corners of the car.",
            relatedIds = listOf("brake_lights", "turn_signals", "headlights"),
            ifItFails = "An unlit rear is hard to see in the dark. It is also a common reason for a traffic stop.",
            maintenance = "Check them whenever you check the other lights, and replace blown bulbs.",
            quiz = LearnQuiz(
                question = "What color are tail lights?",
                options = listOf("Red", "Blue", "Green"),
                answerIndex = 0,
                explanation = "Red is the standard color for rear lights."
            )
        ),

        LearnPart(
            id = "brake_lights",
            systemId = "electrical",
            groupId = "elec_lighting",
            name = "Brake lights",
            summary = "Tell others you are slowing",
            whatIs = "Bright red lights at the rear that come on when you press the brake pedal.",
            whatItDoes = listOf(
                "Warn drivers behind that you are slowing down.",
                "Are switched on by a small switch at the brake pedal."
            ),
            location = "At the rear, often with a third light high on the trunk or the back window.",
            relatedIds = listOf("brake_pedal", "switches", "tail_lights"),
            ifItFails = "A bulb, fuse or pedal switch problem. A failed pedal switch can also affect cruise control and the shift lock.",
            maintenance = "Ask a friend to watch while you press the pedal, or check the reflection in a wall or window at night.",
            whyItMatters = "Failed brake lights are a common cause of rear-end crashes.",
            quiz = LearnQuiz(
                question = "What turns the brake lights on?",
                options = listOf(
                    "A switch at the brake pedal",
                    "The radio",
                    "The fuel gauge"
                ),
                answerIndex = 0,
                explanation = "Pressing the pedal operates the switch."
            )
        ),

        LearnPart(
            id = "turn_signals",
            systemId = "electrical",
            groupId = "elec_lighting",
            name = "Turn signals",
            summary = "Show where you are going",
            whatIs = "Flashing amber lights at the front, rear and often the side of the car.",
            whatItDoes = listOf(
                "Tell others you plan to turn or change lanes.",
                "Also work together as hazard lights."
            ),
            relatedIds = listOf("headlights", "tail_lights", "relays"),
            ifItFails = "If a signal blinks much faster than normal, a bulb is usually burnt out.",
            maintenance = "Replace the bulb with the correct type. Fast blinking after an LED upgrade may need a resistor or a compatible flasher.",
            quiz = LearnQuiz(
                question = "What does very fast blinking of a turn signal often mean?",
                options = listOf("A bulb is burnt out", "The tank is full", "The tires are new"),
                answerIndex = 0,
                explanation = "A missing bulb changes the load, so the flasher blinks faster."
            )
        ),

        LearnPart(
            id = "fog_lights",
            systemId = "electrical",
            groupId = "elec_lighting",
            name = "Fog lights",
            summary = "Low, wide light for bad weather",
            whatIs = "Extra lights mounted low on the front of the car, with a wide, flat beam.",
            whatItDoes = listOf(
                "Light the road close to the car in fog, heavy rain or snow.",
                "Reduce glare back at you from the fog."
            ),
            location = "Low on the front bumper.",
            relatedIds = listOf("headlights", "switches"),
            ifItFails = "A burnt bulb, a blown fuse or a failed relay. They are not essential, but they help in bad conditions.",
            maintenance = "Use them only when visibility is poor. In clear weather they can annoy other drivers.",
            quiz = LearnQuiz(
                question = "When should you use fog lights?",
                options = listOf(
                    "In fog or heavy rain",
                    "On a clear sunny day",
                    "When parked"
                ),
                answerIndex = 0,
                explanation = "They are meant for poor visibility."
            )
        ),

        LearnPart(
            id = "interior_lights",
            systemId = "electrical",
            groupId = "elec_lighting",
            name = "Interior lights",
            summary = "Cabin and dome lights",
            whatIs = "The lights inside the car, such as the dome light, map lights and trunk light.",
            whatItDoes = listOf(
                "Help you see inside the car.",
                "Come on automatically when doors open on most cars."
            ),
            relatedIds = listOf("parasitic_drain", "switches"),
            ifItFails = "A light that stays on after you leave can drain the battery overnight.",
            maintenance = "Check that every light goes off when the door is closed. A stuck door switch is a common cause of a light staying on.",
            whyItMatters = "A small bulb left on for hours can flatten a weak battery.",
            quiz = LearnQuiz(
                question = "What can a dome light left on all night cause?",
                options = listOf("A dead battery", "A flat tire", "Low oil"),
                answerIndex = 0,
                explanation = "It slowly drains the battery while the engine is off."
            )
        ),

        LearnPart(
            id = "horn",
            systemId = "electrical",
            groupId = "elec_lighting",
            name = "Horn",
            summary = "A warning sound",
            whatIs = "An electric device that makes a loud sound when you press the horn button.",
            whatItDoes = listOf(
                "Warns other drivers and people of danger.",
                "Usually works through a relay and a fuse."
            ),
            location = "Behind the grille or in the front of the engine bay.",
            relatedIds = listOf("relays", "fuses", "switches"),
            ifItFails = "No sound can be a blown fuse, a bad relay, or a bad horn. A horn that will not stop is a stuck relay or button.",
            maintenance = "Test it from time to time. A working horn is part of a roadworthiness check in many places.",
            quiz = LearnQuiz(
                question = "What is the horn for?",
                options = listOf("Warning others", "Cooling the engine", "Measuring speed"),
                answerIndex = 0,
                explanation = "It gives a quick audible warning."
            )
        ),

        // ---------- Diagnostics ----------
        LearnPart(
            id = "dead_battery",
            systemId = "electrical",
            groupId = "elec_diagnostics",
            name = "Dead battery",
            summary = "The car will not crank",
            whatIs = "A battery with too little charge to start the engine.",
            whatItDoes = listOf(
                "Signs: slow cranking, rapid clicking, dim lights, or nothing at all.",
                "Causes: lights left on, an old battery, a failing alternator, or a power drain."
            ),
            relatedIds = listOf("lead_acid_battery", "parasitic_drain", "charging_failure", "battery_terminals"),
            ifItFails = "To jump-start: connect red to the dead battery's positive (+), red to the good battery's positive, black to the good battery's negative (-), and the last black clamp to bare metal on the dead car, away from the battery. Start the good car, then the dead one. Remove the cables in reverse order.",
            maintenance = "After a jump start, drive for a good while, or put the battery on a charger. If it dies again soon, test the battery and alternator.",
            whyItMatters = "Connecting jumper cables wrongly can damage electronics and cause sparks near the battery.",
            quiz = LearnQuiz(
                question = "Where does the last black jumper clamp go?",
                options = listOf(
                    "Bare metal on the dead car, away from the battery",
                    "On the dead battery's negative terminal",
                    "On the fuel tank"
                ),
                answerIndex = 0,
                explanation = "It keeps any spark away from battery gases."
            )
        ),

        LearnPart(
            id = "charging_failure",
            systemId = "electrical",
            groupId = "elec_diagnostics",
            name = "Charging failure",
            summary = "The battery is not being topped up",
            whatIs = "A fault where the charging system is not charging the battery while the engine runs.",
            whatItDoes = listOf(
                "Signs: battery warning light, dimming lights, a weak battery, or electronics acting up.",
                "Causes: a bad alternator, a worn belt, loose or corroded cables, or a failed regulator."
            ),
            relatedIds = listOf("alternator", "drive_belt", "voltage_regulator", "faulty_alternator"),
            ifItFails = "The car runs on battery power until it is empty, then stalls.",
            maintenance = "If the battery light comes on while driving, turn off extras like the air-con and radio, and head to a safe place or a shop. A mechanic can test the running voltage.",
            quiz = LearnQuiz(
                question = "What should you do if the battery light comes on while driving?",
                options = listOf(
                    "Turn off extras and get it checked soon",
                    "Ignore it",
                    "Turn the engine off right away on the highway"
                ),
                answerIndex = 0,
                explanation = "The car is running on the battery, so save power and stop somewhere safe."
            )
        ),

        LearnPart(
            id = "blown_fuse",
            systemId = "electrical",
            groupId = "elec_diagnostics",
            name = "Blown fuse",
            summary = "One thing stopped working",
            whatIs = "A fuse that has melted to protect a circuit.",
            whatItDoes = listOf(
                "Signs: a single function stops, such as the radio, a window or the cigarette lighter.",
                "Find it using the fuse diagram in your manual, then look for a broken strip or use a tester."
            ),
            relatedIds = listOf("fuses", "wiring_harnesses", "loose_connections"),
            ifItFails = "If a new fuse blows again straight away, there is a short circuit or a faulty part. Do not fit a bigger fuse.",
            maintenance = "Replace it with the same rating. If it keeps blowing, have the circuit checked.",
            quiz = LearnQuiz(
                question = "What does it mean if a new fuse blows again immediately?",
                options = listOf(
                    "There is a short or a faulty part",
                    "The fuse is too small, so use a bigger one",
                    "Nothing"
                ),
                answerIndex = 0,
                explanation = "Something is drawing too much current, and a bigger fuse would only hide it."
            )
        ),

        LearnPart(
            id = "loose_connections",
            systemId = "electrical",
            groupId = "elec_diagnostics",
            name = "Loose connections",
            summary = "The cause of many odd faults",
            whatIs = "Terminals, grounds or plugs that are loose or corroded.",
            whatItDoes = listOf(
                "Signs: problems that come and go, flickering lights, slow starts, or a hot connector.",
                "Often found at battery terminals, ground points and plugs."
            ),
            relatedIds = listOf("battery_terminals", "ground_connections", "connectors", "resistance"),
            ifItFails = "A loose connection adds resistance and heat, and can leave you stranded.",
            maintenance = "With the engine off, check that terminals are tight and clean. Clean corrosion and reseat plugs until they click.",
            whyItMatters = "It costs almost nothing to check, and fixes a surprising number of electrical faults.",
            quiz = LearnQuiz(
                question = "What is a typical sign of a loose connection?",
                options = listOf(
                    "Problems that come and go",
                    "Always working perfectly",
                    "A louder engine"
                ),
                answerIndex = 0,
                explanation = "Vibration makes the contact work and fail at random."
            )
        ),

        LearnPart(
            id = "parasitic_drain",
            systemId = "electrical",
            groupId = "elec_diagnostics",
            name = "Parasitic battery drain",
            summary = "Something drains power while parked",
            whatIs = "Electricity being used when the car is off, beyond the small amount the alarm and computers need.",
            whatItDoes = listOf(
                "Signs: the battery goes flat after a day or two, even though it is fairly new.",
                "Common causes: lights left on, a stuck relay, a faulty module, or badly installed accessories."
            ),
            relatedIds = listOf("dead_battery", "interior_lights", "relays", "fuses"),
            ifItFails = "The battery keeps dying and jump starts only help for a short time.",
            maintenance = "A mechanic measures the drain with a meter, then removes fuses one by one to find the circuit. Do not fit accessories wired straight to the battery without a proper fuse.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What is a parasitic drain?",
                options = listOf(
                    "Power used while the car is off",
                    "A fuel leak",
                    "A tire problem"
                ),
                answerIndex = 0,
                explanation = "Something keeps pulling current from the battery overnight."
            )
        ),

        LearnPart(
            id = "faulty_alternator",
            systemId = "electrical",
            groupId = "elec_diagnostics",
            name = "Faulty alternator",
            summary = "Signs the alternator is going",
            whatIs = "An alternator that is no longer making enough power.",
            whatItDoes = listOf(
                "Signs: battery warning light, dim or pulsing headlights, a whining or grinding noise, or a burning smell.",
                "A car that starts after a jump but dies again soon often has an alternator problem."
            ),
            relatedIds = listOf("alternator", "charging_failure", "drive_belt", "dead_battery"),
            ifItFails = "The battery drains, and the car eventually stops running.",
            maintenance = "A running voltage check can show a weak alternator. Check the belt and cables first, because they are cheaper to fix.",
            quiz = LearnQuiz(
                question = "A car runs after a jump start but dies soon after. What is a likely cause?",
                options = listOf(
                    "A failing alternator",
                    "Too much oil",
                    "A flat tire"
                ),
                answerIndex = 0,
                explanation = "If the alternator is not charging, the battery runs out again."
            )
        )
    )
}