package com.example.renchityourstartupautoguide.model

object ElectricalBasicsData {

    val groups = listOf(
        LearnGroup(
            id = "elec_fundamentals",
            systemId = "electrical",
            title = "Electrical fundamentals",
            intro = "The basic ideas behind every wire and switch in your car."
        ),
        LearnGroup(
            id = "elec_battery",
            systemId = "electrical",
            title = "Battery system",
            intro = "The battery stores the energy that starts the car and runs things when the engine is off."
        ),
        LearnGroup(
            id = "elec_starting",
            systemId = "electrical",
            title = "Starting system",
            intro = "What happens between turning the key and the engine running."
        ),
        LearnGroup(
            id = "elec_charging",
            systemId = "electrical",
            title = "Charging system",
            intro = "Keeps the battery topped up and powers the car while the engine runs."
        )
    )

    val parts = listOf(

        // ---------- Electrical fundamentals ----------
        LearnPart(
            id = "voltage",
            systemId = "electrical",
            groupId = "elec_fundamentals",
            name = "Voltage",
            summary = "The push behind the electricity",
            whatIs = "Voltage is the electrical pressure that pushes current through a circuit. It is measured in volts (V).",
            whatItDoes = listOf(
                "Most cars use a 12-volt system.",
                "A healthy battery rests at about 12.6 volts.",
                "With the engine running, the charging system should show roughly 13.5 to 14.5 volts."
            ),
            relatedIds = listOf("current", "resistance", "electrical_power", "alternator"),
            whyItMatters = "Voltage is the first number a mechanic checks when something electrical acts up.",
            quiz = LearnQuiz(
                question = "What voltage do most cars use?",
                options = listOf("12 volts", "120 volts", "1.5 volts"),
                answerIndex = 0,
                explanation = "Most cars run a 12-volt electrical system."
            )
        ),

        LearnPart(
            id = "current",
            systemId = "electrical",
            groupId = "elec_fundamentals",
            name = "Current",
            summary = "The flow of electricity",
            whatIs = "Current is the amount of electricity flowing through a wire. It is measured in amps (A).",
            whatItDoes = listOf(
                "More current flows when a device needs more power, such as the starter motor.",
                "Wires and fuses are sized to handle a certain current."
            ),
            relatedIds = listOf("voltage", "resistance", "fuses"),
            ifItFails = "Too much current overheats wires. That is why fuses exist.",
            whyItMatters = "A starter motor can pull hundreds of amps, which is why starter cables are so thick.",
            quiz = LearnQuiz(
                question = "In what unit is current measured?",
                options = listOf("Amps", "Volts", "Ohms"),
                answerIndex = 0,
                explanation = "Current is measured in amperes, or amps."
            )
        ),

        LearnPart(
            id = "resistance",
            systemId = "electrical",
            groupId = "elec_fundamentals",
            name = "Resistance",
            summary = "What slows the flow down",
            whatIs = "Resistance is how much something opposes the flow of current. It is measured in ohms.",
            whatItDoes = listOf(
                "Every wire, switch and device has some resistance.",
                "Corroded or loose connections add unwanted resistance, which makes heat and weak performance."
            ),
            relatedIds = listOf("voltage", "current", "loose_connections", "ground_connections"),
            ifItFails = "Dim lights, slow cranking, or a hot connector can point to extra resistance.",
            quiz = LearnQuiz(
                question = "What can a corroded connection cause?",
                options = listOf("Extra resistance", "More fuel", "A cooler engine"),
                answerIndex = 0,
                explanation = "Corrosion blocks the flow of current and creates heat."
            )
        ),

        LearnPart(
            id = "electrical_power",
            systemId = "electrical",
            groupId = "elec_fundamentals",
            name = "Power",
            summary = "How much work the electricity does",
            whatIs = "Electrical power is how much energy a device uses each second. It is measured in watts (W), and equals volts times amps.",
            whatItDoes = listOf(
                "A 60-watt bulb on a 12-volt system draws about 5 amps.",
                "The alternator must supply enough watts for everything that is switched on."
            ),
            relatedIds = listOf("voltage", "current", "alternator"),
            whyItMatters = "Adding lots of extra accessories can overload the charging system.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "How do you find power in watts?",
                options = listOf("Volts times amps", "Volts plus amps", "Amps minus volts"),
                answerIndex = 0,
                explanation = "Watts equal volts multiplied by amps."
            )
        ),

        LearnPart(
            id = "ground_connections",
            systemId = "electrical",
            groupId = "elec_fundamentals",
            name = "Ground connections",
            summary = "The return path for the current",
            whatIs = "Instead of running two wires to every part, a car uses its metal body and engine as the return path back to the battery. That path is called the ground.",
            whatItDoes = listOf(
                "Completes every circuit.",
                "Connects to the battery's negative terminal with heavy cables or straps."
            ),
            location = "Bolted points on the body and engine, plus a strap between the battery and the body.",
            relatedIds = listOf("battery_terminals", "loose_connections", "resistance"),
            ifItFails = "A bad ground causes strange problems: dim lights, a slow starter, flickering gauges, or parts that work only sometimes.",
            maintenance = "Keep ground points clean and tight. Many odd electrical faults are just a bad ground.",
            quiz = LearnQuiz(
                question = "What can a bad ground connection cause?",
                options = listOf(
                    "Odd electrical problems",
                    "A bigger fuel tank",
                    "Cooler brakes"
                ),
                answerIndex = 0,
                explanation = "Without a good return path, parts misbehave in confusing ways."
            )
        ),

        LearnPart(
            id = "series_parallel",
            systemId = "electrical",
            groupId = "elec_fundamentals",
            name = "Series and parallel circuits",
            summary = "How parts are wired together",
            whatIs = "In a series circuit, parts are wired in one line, so current passes through each. In a parallel circuit, parts have their own branches off the same supply.",
            whatItDoes = listOf(
                "Series: if one part breaks, the whole line stops.",
                "Parallel: each part works on its own, which is how most car lights are wired."
            ),
            relatedIds = listOf("fuses", "relays", "wiring_harnesses"),
            whyItMatters = "It is why one burnt bulb does not turn off every light in your car.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "Why do most car lights keep working if one bulb burns out?",
                options = listOf(
                    "They are wired in parallel",
                    "They are wired in series",
                    "They do not need power"
                ),
                answerIndex = 0,
                explanation = "Each light has its own branch, so one failure does not stop the others."
            )
        ),

        // ---------- Battery system ----------
        LearnPart(
            id = "lead_acid_battery",
            systemId = "electrical",
            groupId = "elec_battery",
            name = "Lead-acid battery",
            summary = "The standard car battery",
            whatIs = "The common 12-volt car battery. It stores energy in lead plates sitting in acid.",
            whatItDoes = listOf(
                "Supplies the big burst of power to start the engine.",
                "Powers the lights and electronics when the engine is off.",
                "Evens out voltage while the engine runs."
            ),
            location = "Usually in the engine bay, sometimes in the trunk or under a seat.",
            relatedIds = listOf("agm_battery", "battery_terminals", "battery_capacity_cca", "alternator"),
            ifItFails = "Slow cranking, clicking, dim lights, or a car that will not start.",
            maintenance = "Typically lasts around 3 to 5 years. Keep it clean and the terminals tight. On non-sealed types, check the water level.",
            whyItMatters = "Heat, short trips, and leaving things on all shorten battery life.",
            quiz = LearnQuiz(
                question = "What is a main job of the battery?",
                options = listOf(
                    "Supply power to start the engine",
                    "Cool the engine",
                    "Filter the air"
                ),
                answerIndex = 0,
                explanation = "It delivers the big burst of power the starter needs."
            )
        ),

        LearnPart(
            id = "agm_battery",
            systemId = "electrical",
            groupId = "elec_battery",
            name = "AGM battery",
            summary = "A sealed, tougher battery",
            whatIs = "An Absorbent Glass Mat battery. It is a type of lead-acid battery where the acid is soaked into glass mats instead of being loose liquid.",
            whatItDoes = listOf(
                "Is sealed and spill-resistant.",
                "Handles frequent restarts and heavy electrical loads better, as in start-stop cars."
            ),
            relatedIds = listOf("lead_acid_battery", "battery_sensors"),
            maintenance = "Replace it with the same type your car came with. Charging an AGM battery needs a charger that has an AGM setting.",
            whyItMatters = "Putting a standard battery in a car designed for AGM can shorten its life.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What does AGM stand for?",
                options = listOf(
                    "Absorbent Glass Mat",
                    "Automatic Gear Motor",
                    "Alternator Ground Module"
                ),
                answerIndex = 0,
                explanation = "The acid is held in glass mats."
            )
        ),

        LearnPart(
            id = "battery_terminals",
            systemId = "electrical",
            groupId = "elec_battery",
            name = "Battery terminals",
            summary = "Where the cables connect",
            whatIs = "The two metal posts on the battery. The positive (+) is usually red, the negative (-) black.",
            whatItDoes = listOf(
                "Connect the battery to the car's cables.",
                "Need to be clean and tight to pass lots of current."
            ),
            location = "On top or on the front of the battery.",
            relatedIds = listOf("charging_cables", "ground_connections", "loose_connections"),
            ifItFails = "A white or blue-green crust means corrosion. It can cause slow starts or no start at all.",
            maintenance = "Clean the crust with a baking soda and water mix and a brush. When disconnecting, remove the negative first. When reconnecting, attach the negative last.",
            whyItMatters = "A loose or dirty terminal is a very common cause of a car that will not start.",
            quiz = LearnQuiz(
                question = "Which terminal do you disconnect first?",
                options = listOf("Negative", "Positive", "It does not matter"),
                answerIndex = 0,
                explanation = "Removing the negative first reduces the risk of sparks and shorts."
            )
        ),

        LearnPart(
            id = "battery_sensors",
            systemId = "electrical",
            groupId = "elec_battery",
            name = "Battery sensors",
            summary = "Watch the battery's health",
            whatIs = "Sensors on many newer cars that measure the battery's voltage, current and temperature.",
            whatItDoes = listOf(
                "Tell the computer how charged the battery is.",
                "Help the car decide how hard to charge, and when to turn off the start-stop system."
            ),
            location = "Clamped to the negative battery terminal on many cars.",
            relatedIds = listOf("agm_battery", "ecu", "alternator"),
            ifItFails = "A battery warning light, or start-stop that stops working.",
            maintenance = "Some cars need the new battery to be registered with the computer after replacement. Ask the shop or check your manual.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What can happen on some cars after a battery swap?",
                options = listOf(
                    "The new battery needs to be registered",
                    "The tires change size",
                    "The oil turns blue"
                ),
                answerIndex = 0,
                explanation = "The computer adjusts its charging for the new battery."
            )
        ),

        LearnPart(
            id = "battery_capacity_cca",
            systemId = "electrical",
            groupId = "elec_battery",
            name = "Battery capacity and cold cranking amps",
            summary = "How to read a battery's label",
            whatIs = "Capacity is how much energy a battery stores, shown in amp-hours (Ah). Cold Cranking Amps (CCA) is how much current it can deliver for starting in cold weather.",
            whatItDoes = listOf(
                "Higher Ah means it can run things longer.",
                "Higher CCA means stronger starting in the cold.",
                "Your manual lists the minimum you need."
            ),
            relatedIds = listOf("lead_acid_battery", "starter_motor"),
            maintenance = "Pick a battery that meets or beats the CCA in your manual, and fits the tray.",
            whyItMatters = "Bigger numbers are not always better if the battery does not fit your car.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What does CCA measure?",
                options = listOf(
                    "Starting power in cold weather",
                    "Tire grip",
                    "Fuel economy"
                ),
                answerIndex = 0,
                explanation = "It is the current a battery can supply for starting at low temperature."
            )
        ),

        // ---------- Starting system ----------
        LearnPart(
            id = "starter_motor",
            systemId = "electrical",
            groupId = "elec_starting",
            name = "Starter motor",
            summary = "Turns the engine over to start it",
            whatIs = "A powerful electric motor that spins the engine until it can run on its own.",
            whatItDoes = listOf(
                "Pushes a small gear into the ring gear on the flywheel or flexplate.",
                "Spins the engine for a few seconds, then disengages."
            ),
            location = "On the side of the engine, where it meets the transmission.",
            relatedIds = listOf("starter_solenoid", "flywheel", "flexplate", "lead_acid_battery"),
            ifItFails = "A single click and nothing, a grinding noise, or slow cranking.",
            maintenance = "Not a routine service. A weak battery makes the starter work harder, so keep the battery healthy.",
            quiz = LearnQuiz(
                question = "What does the starter motor spin?",
                options = listOf("The engine", "The wheels", "The fan only"),
                answerIndex = 0,
                explanation = "It cranks the engine until combustion takes over."
            )
        ),

        LearnPart(
            id = "starter_solenoid",
            systemId = "electrical",
            groupId = "elec_starting",
            name = "Starter solenoid",
            summary = "A heavy-duty switch on the starter",
            whatIs = "An electromagnet that does two jobs when you start the car.",
            whatItDoes = listOf(
                "Pushes the starter gear forward to meet the engine.",
                "Closes a big switch so battery power flows to the starter motor."
            ),
            location = "Mounted on or inside the starter motor.",
            relatedIds = listOf("starter_motor", "starter_relay", "starter_wiring"),
            ifItFails = "One loud click and no cranking, or no sound at all.",
            maintenance = "Often replaced with the starter. Check the battery and connections first.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What does the solenoid do when you start the car?",
                options = listOf(
                    "Connects battery power to the starter",
                    "Pumps fuel",
                    "Cools the oil"
                ),
                answerIndex = 0,
                explanation = "It acts as a heavy-duty switch and pushes the gear in."
            )
        ),

        LearnPart(
            id = "ignition_switch",
            systemId = "electrical",
            groupId = "elec_starting",
            name = "Ignition switch or start button",
            summary = "Where starting begins",
            whatIs = "The key switch or push button that tells the car you want to start.",
            whatItDoes = listOf(
                "Turns on the accessories and the main power.",
                "Sends the signal to start the engine."
            ),
            location = "On the steering column or dashboard.",
            relatedIds = listOf("starter_relay", "starter_solenoid", "ecu"),
            ifItFails = "The engine does not crank, or the car loses power while driving. Push-button cars may also need the key fob nearby.",
            maintenance = "Do not hang heavy things on the key. If the key is hard to turn, have it looked at.",
            quiz = LearnQuiz(
                question = "What does the ignition switch do?",
                options = listOf(
                    "Starts the starting process",
                    "Cools the coolant",
                    "Cleans the oil"
                ),
                answerIndex = 0,
                explanation = "It sends the start signal and turns on power."
            )
        ),

        LearnPart(
            id = "starter_relay",
            systemId = "electrical",
            groupId = "elec_starting",
            name = "Starter relay",
            summary = "A small switch that controls a big one",
            whatIs = "A relay that lets the ignition switch's small current control the starter's large current.",
            whatItDoes = listOf(
                "Protects the ignition switch from heavy current.",
                "Passes the start signal on to the solenoid."
            ),
            location = "In a fuse and relay box, under the hood or inside the cabin.",
            relatedIds = listOf("relays", "starter_solenoid", "ignition_switch"),
            ifItFails = "A click from the fuse box but no start, or the engine not cranking.",
            maintenance = "It is usually cheap and easy to swap. Your manual shows the relay box layout.",
            quiz = LearnQuiz(
                question = "Why does a car use a starter relay?",
                options = listOf(
                    "To let a small current control a large one",
                    "To pump fuel",
                    "To cool the starter"
                ),
                answerIndex = 0,
                explanation = "It saves the ignition switch from carrying heavy current."
            )
        ),

        LearnPart(
            id = "starter_wiring",
            systemId = "electrical",
            groupId = "elec_starting",
            name = "Starter wiring",
            summary = "The cables that feed the starter",
            whatIs = "The thick cable from the battery to the starter, and the thin wire that carries the start signal.",
            whatItDoes = listOf(
                "Carries very high current for a few seconds.",
                "Needs clean, tight connections at both ends."
            ),
            relatedIds = listOf("battery_terminals", "starter_motor", "ground_connections"),
            ifItFails = "Slow cranking or clicking can come from corroded or loose starter cables even if the battery is fine.",
            maintenance = "Look for corrosion, cracked insulation or loose nuts. Always disconnect the battery's negative cable before working here.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What should you do before working on starter wiring?",
                options = listOf(
                    "Disconnect the battery negative",
                    "Rev the engine",
                    "Pour water on the cable"
                ),
                answerIndex = 0,
                explanation = "It avoids sparks and shorts around heavy current."
            )
        ),

        // ---------- Charging system ----------
        LearnPart(
            id = "alternator",
            systemId = "electrical",
            groupId = "elec_charging",
            name = "Alternator",
            summary = "Makes electricity while the engine runs",
            whatIs = "A generator driven by the engine that produces electricity.",
            whatItDoes = listOf(
                "Recharges the battery.",
                "Powers the lights, radio and other electronics while you drive.",
                "Makes AC power inside, then converts it to DC for the car."
            ),
            location = "On the front or side of the engine, turned by the drive belt.",
            relatedIds = listOf("voltage_regulator", "drive_belt", "charging_cables", "faulty_alternator"),
            ifItFails = "A battery warning light, dim headlights, a whining noise, or a battery that keeps going flat.",
            maintenance = "Keep the belt in good shape. Never disconnect the battery while the engine is running.",
            whyItMatters = "If the alternator fails, the car runs only on the battery until it dies.",
            quiz = LearnQuiz(
                question = "What does the alternator do while the engine runs?",
                options = listOf(
                    "Makes electricity and recharges the battery",
                    "Cools the engine",
                    "Pumps oil"
                ),
                answerIndex = 0,
                explanation = "It powers the car and keeps the battery charged."
            )
        ),

        LearnPart(
            id = "voltage_regulator",
            systemId = "electrical",
            groupId = "elec_charging",
            name = "Voltage regulator",
            summary = "Keeps the charging voltage in range",
            whatIs = "A part that controls how much voltage the alternator produces. On most cars it is built into the alternator.",
            whatItDoes = listOf(
                "Keeps the output around 13.5 to 14.5 volts.",
                "Prevents overcharging and undercharging."
            ),
            location = "Inside or on the back of the alternator, or part of the car's computer.",
            relatedIds = listOf("alternator", "voltage", "lead_acid_battery"),
            ifItFails = "Overcharging can boil the battery and blow bulbs. Undercharging leaves the battery flat.",
            maintenance = "A mechanic tests the charging voltage with a meter.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What can a failed voltage regulator cause?",
                options = listOf(
                    "Overcharging or undercharging",
                    "A flat tire",
                    "Cold air from the heater"
                ),
                answerIndex = 0,
                explanation = "It controls how much voltage the alternator makes."
            )
        ),

        LearnPart(
            id = "drive_belt",
            systemId = "electrical",
            groupId = "elec_charging",
            name = "Drive belt",
            summary = "Turns the alternator",
            whatIs = "A rubber belt, often called the serpentine belt, that runs from the crankshaft to the alternator and other accessories.",
            whatItDoes = listOf(
                "Turns the alternator.",
                "Often also drives the water pump, power steering pump and air-conditioning compressor."
            ),
            location = "At the front or side of the engine, in view when you open the hood.",
            relatedIds = listOf("alternator", "water_pump", "timing_belt"),
            ifItFails = "A squeal at start-up or when turning, visible cracks, or fraying. A broken belt stops charging and can cause overheating.",
            maintenance = "Inspect it regularly and replace it at the interval in your manual, or when it looks cracked or glazed.",
            whyItMatters = "A snapped drive belt can leave you stranded quickly.",
            quiz = LearnQuiz(
                question = "What can a broken drive belt stop?",
                options = listOf(
                    "The alternator, and sometimes the water pump",
                    "Only the radio",
                    "Only the horn"
                ),
                answerIndex = 0,
                explanation = "Several parts depend on this belt."
            )
        ),

        LearnPart(
            id = "charging_cables",
            systemId = "electrical",
            groupId = "elec_charging",
            name = "Charging cables",
            summary = "Link the alternator to the battery",
            whatIs = "The heavy cable that carries the alternator's output to the battery and the rest of the car, along with the ground cable.",
            whatItDoes = listOf(
                "Delivers the charging current.",
                "Complete the circuit back to the alternator."
            ),
            relatedIds = listOf("alternator", "battery_terminals", "ground_connections"),
            ifItFails = "A corroded or loose cable can cause weak charging even if the alternator is fine.",
            maintenance = "Check both ends for corrosion and heat damage, and keep them tight.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What can a corroded charging cable cause?",
                options = listOf(
                    "Weak charging",
                    "More horsepower",
                    "A quieter engine"
                ),
                answerIndex = 0,
                explanation = "It restricts the current flowing to the battery."
            )
        )
    )
}