package com.example.renchityourstartupautoguide.model

object AirConData {

    val groups = listOf(
        LearnGroup(
            id = "ac_components",
            systemId = "aircon",
            title = "Components",
            intro = "The parts that move heat out of the cabin and push cool air at you."
        ),
        LearnGroup(
            id = "ac_topics",
            systemId = "aircon",
            title = "Topics",
            intro = "How air-con works as a whole, and what common symptoms mean."
        )
    )

    val parts = listOf(

        // ---------- Components ----------
        LearnPart(
            id = "ac_compressor",
            systemId = "aircon",
            groupId = "ac_components",
            name = "AC compressor",
            summary = "The pump of the AC system",
            whatIs = "A pump driven by the engine's drive belt that squeezes refrigerant gas and keeps it moving around the system.",
            whatItDoes = listOf(
                "Compresses cool, low-pressure gas into hot, high-pressure gas.",
                "Switches on and off with an electromagnetic clutch on its pulley."
            ),
            location = "On the front of the engine, driven by the drive belt.",
            relatedIds = listOf("drive_belt", "pressure_sensors", "refrigerant_lines", "compressor_operation"),
            ifItFails = "No cold air, a grinding or rattling noise when the AC is on, or a clutch that will not engage.",
            maintenance = "Run the AC for a few minutes every week or two, even in cool weather, so the seals and oil keep circulating.",
            whyItMatters = "It is the most expensive AC part. A failing one can also spread metal debris through the whole system.",
            quiz = LearnQuiz(
                question = "What does the AC compressor do?",
                options = listOf(
                    "Squeezes the refrigerant and keeps it moving",
                    "Filters the cabin air",
                    "Cools the engine oil"
                ),
                answerIndex = 0,
                explanation = "It is the pump that drives the refrigerant around the loop."
            )
        ),

        LearnPart(
            id = "condenser",
            systemId = "aircon",
            groupId = "ac_components",
            name = "Condenser",
            summary = "Gets rid of the heat outside",
            whatIs = "A radiator-like heat exchanger at the front of the car where hot refrigerant gives up its heat to the passing air.",
            whatItDoes = listOf(
                "Cools the hot gas until it turns into a liquid.",
                "Relies on airflow from driving or from the cooling fan."
            ),
            location = "In front of the engine radiator, behind the grille.",
            relatedIds = listOf("radiator", "cooling_fan", "receiver_drier", "ac_compressor"),
            ifItFails = "A blocked or damaged condenser makes the AC weak, especially in traffic. Stones can puncture it and cause a leak.",
            maintenance = "Keep the fins clear of leaves and insects. Rinse gently with low-pressure water from behind if you can, and do not bend the fins.",
            quiz = LearnQuiz(
                question = "Where is the condenser usually found?",
                options = listOf(
                    "In front of the radiator",
                    "Inside the glovebox",
                    "In the fuel tank"
                ),
                answerIndex = 0,
                explanation = "It sits at the front so air flowing in can cool it."
            )
        ),

        LearnPart(
            id = "receiver_drier",
            systemId = "aircon",
            groupId = "ac_components",
            name = "Receiver-drier",
            summary = "Removes moisture from the refrigerant",
            whatIs = "A small canister that filters the liquid refrigerant and absorbs moisture. Some systems use a similar part called an accumulator on the low-pressure side.",
            whatItDoes = listOf(
                "Protects the system from water, which causes corrosion and ice.",
                "Acts as a small storage tank for the refrigerant."
            ),
            location = "On the high-pressure line, near the condenser.",
            relatedIds = listOf("condenser", "expansion_valve", "refrigerant_leaks"),
            ifItFails = "A saturated or clogged one makes cooling poor and can damage other parts.",
            maintenance = "It should be replaced whenever the system is opened for a repair.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What does the receiver-drier remove from the refrigerant?",
                options = listOf("Moisture", "Heat from the cabin", "Dust from the air"),
                answerIndex = 0,
                explanation = "Water inside the system causes corrosion and freezing."
            )
        ),

        LearnPart(
            id = "expansion_valve",
            systemId = "aircon",
            groupId = "ac_components",
            name = "Expansion valve",
            summary = "Where the refrigerant turns cold",
            whatIs = "A tiny valve, or in some cars a fixed orifice tube, that drops the pressure of the liquid refrigerant sharply.",
            whatItDoes = listOf(
                "Lets the refrigerant expand and get very cold.",
                "Controls how much refrigerant enters the evaporator."
            ),
            location = "At the inlet of the evaporator, near the firewall.",
            relatedIds = listOf("evaporator", "receiver_drier", "refrigeration_cycle"),
            ifItFails = "Stuck closed: weak or no cooling. Stuck open or blocked: ice on the lines, or cooling that comes and goes.",
            maintenance = "Not a routine service. A technician checks it with pressure gauges.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What happens to refrigerant as it passes the expansion valve?",
                options = listOf("It drops in pressure and gets cold", "It gets hotter", "It turns to metal"),
                answerIndex = 0,
                explanation = "The sudden pressure drop makes it very cold."
            )
        ),

        LearnPart(
            id = "evaporator",
            systemId = "aircon",
            groupId = "ac_components",
            name = "Evaporator",
            summary = "The cold part inside the dash",
            whatIs = "A small radiator-like core inside the dashboard where cold refrigerant absorbs heat from the cabin air.",
            whatItDoes = listOf(
                "Cools and dries the air blown across it.",
                "Collects water, which drains out under the car."
            ),
            location = "Inside the dashboard, next to the blower and the heater core.",
            relatedIds = listOf("blower_motor", "cabin_air_filter", "heater_core", "unusual_ac_smells"),
            ifItFails = "Leaks, a musty smell from mold, or a blocked drain that leaves the carpet wet.",
            maintenance = "A clean cabin filter helps keep it clean. Water dripping under the car on a hot day is normal.",
            whyItMatters = "It is hard to reach, so replacing it means taking the dashboard apart, which is expensive.",
            quiz = LearnQuiz(
                question = "Is it normal to see a puddle of clear water under the car after using the AC?",
                options = listOf("Yes, it is condensation", "No, it is a fuel leak", "No, it is brake fluid"),
                answerIndex = 0,
                explanation = "The evaporator collects water from the air, and it drains out."
            )
        ),

        LearnPart(
            id = "blower_motor",
            systemId = "aircon",
            groupId = "ac_components",
            name = "Blower motor",
            summary = "The fan that pushes air at you",
            whatIs = "An electric fan inside the dashboard that pushes air through the vents.",
            whatItDoes = listOf(
                "Moves air over the evaporator or heater core and into the cabin.",
                "Is controlled by the fan speed dial or buttons."
            ),
            location = "Behind or under the dashboard, often on the passenger side.",
            relatedIds = listOf("evaporator", "cabin_air_filter", "weak_airflow", "fuses"),
            ifItFails = "No air at some or all speeds, squealing, or a rattle from leaves or debris inside.",
            maintenance = "A clogged cabin filter makes the motor work harder, so replace it on time.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What can a bad blower motor cause?",
                options = listOf("Little or no air from the vents", "A flat tire", "Hard starting"),
                answerIndex = 0,
                explanation = "The fan is what pushes the air out."
            )
        ),

        LearnPart(
            id = "cabin_air_filter",
            systemId = "aircon",
            groupId = "ac_components",
            name = "Cabin air filter",
            summary = "Cleans the air you breathe",
            whatIs = "A filter that catches dust, pollen and other particles from the air going into the cabin.",
            whatItDoes = listOf(
                "Keeps the air you breathe cleaner.",
                "Protects the blower and evaporator from dirt."
            ),
            location = "Usually behind the glovebox, or under the hood near the windshield.",
            relatedIds = listOf("blower_motor", "evaporator", "weak_airflow", "air_filter"),
            ifItFails = "A clogged filter means weak airflow, musty smells and fogged windows.",
            maintenance = "Replace about once a year or at the interval in your manual, sooner in dusty or polluted areas. It is one of the easiest jobs you can do yourself.",
            whyItMatters = "It is different from the engine air filter. Both need changing.",
            quiz = LearnQuiz(
                question = "What can a clogged cabin air filter cause?",
                options = listOf("Weak airflow from the vents", "Engine overheating", "Weak brakes"),
                answerIndex = 0,
                explanation = "Air cannot pass through easily, so less reaches the cabin."
            )
        ),

        LearnPart(
            id = "refrigerant_lines",
            systemId = "aircon",
            groupId = "ac_components",
            name = "Refrigerant lines",
            summary = "The pipes between AC parts",
            whatIs = "Aluminum pipes and rubber hoses that connect the AC parts. One side is high pressure and hot, the other is low pressure and cold.",
            whatItDoes = listOf(
                "Carry refrigerant around the closed loop.",
                "Have service ports where a technician attaches gauges."
            ),
            location = "From the compressor, through the condenser and firewall, to the evaporator.",
            relatedIds = listOf("ac_compressor", "condenser", "evaporator", "refrigerant_leaks"),
            ifItFails = "Leaks at joints, O-rings and hoses are the most common reason AC loses its cool. Oily, dirty spots on a line point to a leak.",
            maintenance = "Look for oily residue on the lines during checks. Leave repairs to a technician.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What can an oily dirty spot on an AC line mean?",
                options = listOf("A refrigerant leak", "A new part", "Low brake fluid"),
                answerIndex = 0,
                explanation = "Refrigerant carries oil, which leaves residue where it leaks."
            )
        ),

        LearnPart(
            id = "pressure_sensors",
            systemId = "aircon",
            groupId = "ac_components",
            name = "Pressure sensors",
            summary = "Protect the system from bad pressure",
            whatIs = "Switches or sensors that watch the refrigerant pressure on the high and low sides.",
            whatItDoes = listOf(
                "Turn the compressor off if pressure is too low or too high.",
                "Tell the computer when to run the cooling fan."
            ),
            location = "On the refrigerant lines, near the compressor, condenser or receiver-drier.",
            relatedIds = listOf("ac_compressor", "ecu", "refrigerant_leaks"),
            ifItFails = "The AC will not turn on, or it cuts out for no clear reason.",
            maintenance = "A technician checks them with a scan tool and gauges. Low refrigerant can also trip them.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What do AC pressure sensors protect?",
                options = listOf("The compressor", "The windshield", "The tires"),
                answerIndex = 0,
                explanation = "They shut it off before bad pressure damages it."
            )
        ),

        // ---------- Topics ----------
        LearnPart(
            id = "how_ac_works",
            systemId = "aircon",
            groupId = "ac_topics",
            name = "How automotive AC works",
            summary = "It moves heat, it does not make cold",
            whatIs = "A car's air-con does not create cold. It moves heat from inside the cabin to the outside air.",
            whatItDoes = listOf(
                "A special fluid called refrigerant circulates in a sealed loop.",
                "It picks up heat inside the dashboard, then drops it off at the front of the car.",
                "The blower pushes cabin air across the cold evaporator to cool and dry it."
            ),
            relatedIds = listOf("refrigeration_cycle", "ac_compressor", "evaporator", "condenser"),
            whyItMatters = "Because it is a sealed loop, refrigerant is never 'used up'. If it is low, there is a leak.",
            quiz = LearnQuiz(
                question = "What does the AC system actually do?",
                options = listOf(
                    "Moves heat out of the cabin",
                    "Burns fuel to make cold air",
                    "Freezes the engine"
                ),
                answerIndex = 0,
                explanation = "It carries heat from the cabin to the outside."
            )
        ),

        LearnPart(
            id = "refrigeration_cycle",
            systemId = "aircon",
            groupId = "ac_topics",
            name = "The refrigeration cycle",
            summary = "Four steps that repeat",
            whatIs = "The loop the refrigerant follows, in four main steps.",
            whatItDoes = listOf(
                "1. Compress: the compressor makes hot, high-pressure gas.",
                "2. Condense: the condenser cools it into a liquid and releases the heat outside.",
                "3. Expand: the expansion valve drops the pressure, so it turns very cold.",
                "4. Evaporate: the evaporator lets it absorb heat from the cabin air and turn back into gas."
            ),
            relatedIds = listOf("ac_compressor", "condenser", "expansion_valve", "evaporator"),
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "Which part is the first step of the cycle?",
                options = listOf("The compressor", "The evaporator", "The cabin air filter"),
                answerIndex = 0,
                explanation = "The compressor starts the loop by squeezing the gas."
            )
        ),

        LearnPart(
            id = "compressor_operation",
            systemId = "aircon",
            groupId = "ac_topics",
            name = "Compressor operation",
            summary = "How the compressor switches on and off",
            whatIs = "A short guide to how the compressor behaves.",
            whatItDoes = listOf(
                "It runs only when you press the AC button and the pressure is within a safe range.",
                "A click and a small dip in engine speed means the clutch has engaged.",
                "It cycles on and off to stop the evaporator from freezing. A slow cycle is normal. Very rapid clicking can mean low refrigerant."
            ),
            relatedIds = listOf("ac_compressor", "pressure_sensors", "refrigerant_leaks"),
            ifItFails = "If the clutch never clicks, check the fuse and relay first, then the pressure sensors.",
            maintenance = "Listen for new noises when the AC is switched on.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What can very rapid on and off clicking of the compressor suggest?",
                options = listOf("Low refrigerant", "A full tank", "New tires"),
                answerIndex = 0,
                explanation = "Pressure drops too low, so the system keeps tripping off."
            )
        ),

        LearnPart(
            id = "cooling_performance",
            systemId = "aircon",
            groupId = "ac_topics",
            name = "Cooling performance",
            summary = "Why the AC feels weak sometimes",
            whatIs = "How well the system cools depends on many things.",
            whatItDoes = listOf(
                "Refrigerant level, condenser airflow and a clean cabin filter all matter.",
                "Hot parked cars need time. Open the windows for a minute first, then close them and use recirculation mode.",
                "AC always works harder in slow traffic, because there is less airflow over the condenser."
            ),
            relatedIds = listOf("condenser", "cabin_air_filter", "refrigerant_leaks", "cooling_fan"),
            maintenance = "Park in the shade when you can. If the AC slowly gets worse over weeks, suspect a leak.",
            quiz = LearnQuiz(
                question = "What helps cool a very hot parked car quickly?",
                options = listOf(
                    "Open the windows briefly, then use recirculation",
                    "Close everything and wait",
                    "Turn the heater on"
                ),
                answerIndex = 0,
                explanation = "Letting out the hottest air first, then recirculating, is faster."
            )
        ),

        LearnPart(
            id = "weak_airflow",
            systemId = "aircon",
            groupId = "ac_topics",
            name = "Weak airflow",
            summary = "Cold air, but not much of it",
            whatIs = "The vents blow cold, but very little air comes out.",
            whatItDoes = listOf(
                "Most common cause: a clogged cabin air filter.",
                "Other causes: a failing blower motor, an evaporator that is iced up, blocked ducts or stuck flaps."
            ),
            relatedIds = listOf("cabin_air_filter", "blower_motor", "evaporator"),
            ifItFails = "If airflow comes and goes, or the vents blow only on high speed, the blower resistor or motor may be failing.",
            maintenance = "Check and replace the cabin filter first. It is cheap and easy.",
            quiz = LearnQuiz(
                question = "What should you check first for weak airflow?",
                options = listOf("The cabin air filter", "The engine oil", "The brake pads"),
                answerIndex = 0,
                explanation = "A clogged filter is the most common cause."
            )
        ),

        LearnPart(
            id = "unusual_ac_smells",
            systemId = "aircon",
            groupId = "ac_topics",
            name = "Unusual AC smells",
            summary = "What different smells point to",
            whatIs = "Smells from the vents can hint at the cause.",
            whatItDoes = listOf(
                "Musty or sour, like old socks: mold or bacteria on the evaporator.",
                "Sweet and syrupy: possibly coolant leaking from the heater core. This is not an AC fault but needs attention.",
                "Burning or hot plastic: an electrical problem or a slipping belt. Stop and have it checked."
            ),
            relatedIds = listOf("evaporator", "cabin_air_filter", "heater_core", "coolant_leaks"),
            maintenance = "To prevent mold, switch off the AC a minute or two before arriving and let the fan run to dry the evaporator. Replace the cabin filter on time.",
            whyItMatters = "A burning smell can be a fire risk, so do not ignore it.",
            quiz = LearnQuiz(
                question = "What does a musty smell from the vents usually mean?",
                options = listOf(
                    "Mold on the evaporator",
                    "A fuel leak",
                    "Low brake fluid"
                ),
                answerIndex = 0,
                explanation = "Damp, dark places inside the dash grow mold."
            )
        ),

        LearnPart(
            id = "refrigerant_leaks",
            systemId = "aircon",
            groupId = "ac_topics",
            name = "Refrigerant leaks",
            summary = "Why the AC slowly stops being cold",
            whatIs = "Refrigerant escaping from the sealed loop through hoses, joints, seals or a damaged part.",
            whatItDoes = listOf(
                "Signs: cooling that gets weaker over time, an oily dirty spot on a line, or a compressor that clicks on and off quickly.",
                "Refrigerant is never used up, so low refrigerant always means a leak somewhere."
            ),
            relatedIds = listOf("refrigerant_lines", "condenser", "ac_compressor", "pressure_sensors"),
            ifItFails = "Topping up without finding the leak only buys a little time and wastes money.",
            maintenance = "Have a technician find and fix the leak. Refrigerant should be handled by licensed technicians and never vented. Cars use different types, so check the label under the hood.",
            whyItMatters = "Refrigerant harms the environment, and some newer types are mildly flammable.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What does low refrigerant mean?",
                options = listOf(
                    "There is a leak somewhere",
                    "It got used up like fuel",
                    "The cabin filter is new"
                ),
                answerIndex = 0,
                explanation = "It circulates in a sealed loop, so it only goes down if it leaks."
            )
        )
    )
}