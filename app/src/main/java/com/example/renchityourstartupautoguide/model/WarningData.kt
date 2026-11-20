package com.example.renchityourstartupautoguide.model

object WarningData {

    val categories = listOf(
        WarningCategory(
            id = "dashboard",
            title = "Dashboard Lights",
            subtitle = "Understand warning symbols",
            listTitle = "Know your dashboard",
            listIntro = "Select a warning light to understand what it means and what action to take."
        ),
        WarningCategory(
            id = "sounds",
            title = "Unusual Sounds",
            subtitle = "Identify noises from your car",
            listTitle = "Listen to your car",
            listIntro = "Select a sound to learn what it may mean and what to do."
        ),
        WarningCategory(
            id = "smells",
            title = "Unusual Smells",
            subtitle = "Recognize suspicious odors",
            listTitle = "Trust your nose",
            listIntro = "Select a smell to learn what it may mean and what to do."
        ),
        WarningCategory(
            id = "performance",
            title = "Performance Changes",
            subtitle = "Notice changes while driving",
            listTitle = "Notice how it drives",
            listIntro = "Select a change to learn what it may mean and what to do."
        ),
        WarningCategory(
            id = "leaks",
            title = "Visible Signs & Leaks",
            subtitle = "Check what you can see",
            listTitle = "Look under and around the car",
            listIntro = "Select a sign to learn what it may mean and what to do."
        ),
        WarningCategory(
            id = "urgency",
            title = "Urgency Levels",
            subtitle = "Know how serious it is",
            listTitle = "How serious is it?",
            listIntro = "These three levels show how quickly you should act."
        )
    )

    val items = listOf(

        // ---------- Dashboard Lights ----------
        WarningItem(
            id = "oil_pressure",
            categoryId = "dashboard",
            title = "Oil Pressure",
            detailTitle = "Oil Pressure Warning Light",
            typeLabel = "Dashboard warning light",
            summary = "Engine oil pressure may be too low.",
            severity = "Stop safely",
            causes = listOf("Low oil level", "Oil pump issue", "Oil circulation problem"),
            action = "Safely stop and switch off the engine. Check the oil level when safe. Do not continue driving if the warning remains on."
        ),
        WarningItem(
            id = "engine_temperature",
            categoryId = "dashboard",
            title = "Engine Temperature",
            detailTitle = "Engine Temperature Warning Light",
            typeLabel = "Dashboard warning light",
            summary = "Engine temperature is too high.",
            severity = "Stop safely",
            causes = listOf("Low coolant level", "Coolant leak", "Faulty radiator fan or thermostat"),
            action = "Pull over safely and switch off the engine. Let it cool down before opening the hood. Never open the radiator cap while the engine is hot."
        ),
        WarningItem(
            id = "check_engine",
            categoryId = "dashboard",
            title = "Check Engine",
            detailTitle = "Check Engine Warning Light",
            typeLabel = "Dashboard warning light",
            summary = "The engine or emissions-control system has detected a fault.",
            severity = "Have it checked",
            causes = listOf("Loose or faulty fuel cap", "Faulty sensor", "Ignition or spark plug problem"),
            action = "If the light is steady, have the car checked soon. If it is flashing, slow down and stop driving as soon as it is safe, because the engine can be getting damaged."
        ),
        WarningItem(
            id = "battery",
            categoryId = "dashboard",
            title = "Battery / Charging",
            detailTitle = "Battery Warning Light",
            typeLabel = "Dashboard warning light",
            summary = "The battery may not be charging properly.",
            severity = "Have it checked",
            causes = listOf("Worn-out battery", "Loose or corroded battery terminals", "Faulty alternator or belt"),
            action = "Turn off extras like the air conditioner and radio, and head to a repair shop soon. The car may stop running once the battery drains."
        ),
        WarningItem(
            id = "brake_system",
            categoryId = "dashboard",
            title = "Brake System",
            detailTitle = "Brake Warning Light",
            typeLabel = "Dashboard warning light",
            summary = "There may be a problem with the brakes or the brake fluid.",
            severity = "Stop safely",
            causes = listOf("Parking brake still on", "Low brake fluid", "Worn brake pads"),
            action = "First check that the parking brake is released. If the light stays on, or the pedal feels soft, stop safely and do not keep driving. Get the brakes checked before using the car."
        ),
        WarningItem(
            id = "tire_pressure",
            categoryId = "dashboard",
            title = "Tire Pressure",
            detailTitle = "Tire Pressure Warning Light",
            typeLabel = "Dashboard warning light",
            summary = "One or more tires may be low on air.",
            severity = "Have it checked",
            causes = listOf("Slow leak or puncture", "Drop in temperature", "Valve problem"),
            action = "When it is safe, check all four tires and fill them to the pressure shown on the sticker inside the driver's door. If a tire keeps losing air, have it repaired."
        ),

        // ---------- Unusual Sounds ----------
        WarningItem(
            id = "squealing_brakes",
            categoryId = "sounds",
            title = "Squealing When Braking",
            detailTitle = "Squealing When Braking",
            typeLabel = "Unusual sound",
            summary = "A high-pitched squeal when you press the brake pedal.",
            severity = "Have it checked",
            causes = listOf("Worn brake pads", "Dirty or glazed brake surfaces", "Moisture on the brakes"),
            action = "A little squeal on a damp morning can be normal. If it keeps happening, have the pads checked soon before they wear down further."
        ),
        WarningItem(
            id = "grinding_brakes",
            categoryId = "sounds",
            title = "Grinding When Braking",
            detailTitle = "Grinding When Braking",
            typeLabel = "Unusual sound",
            summary = "A harsh metal-on-metal sound when stopping.",
            severity = "Stop safely",
            causes = listOf("Brake pads worn down completely", "Damaged brake rotor", "Stone or debris caught in the brakes"),
            action = "Avoid driving the car if you can. Metal on metal damages the brakes quickly and makes stopping less reliable. Have it inspected right away."
        ),
        WarningItem(
            id = "engine_knocking",
            categoryId = "sounds",
            title = "Engine Knocking",
            detailTitle = "Engine Knocking",
            typeLabel = "Unusual sound",
            summary = "A repeated tapping or knocking from the engine.",
            severity = "Stop safely",
            causes = listOf("Low oil level or pressure", "Worn engine parts", "Wrong or poor-quality fuel"),
            action = "Check the oil level when it is safe. If the knocking continues, stop driving and have the engine checked, since it can lead to serious damage."
        ),
        WarningItem(
            id = "clicking_start",
            categoryId = "sounds",
            title = "Clicking When Starting",
            detailTitle = "Clicking When Starting",
            typeLabel = "Unusual sound",
            summary = "Rapid clicking when you turn the key or press start.",
            severity = "Have it checked",
            causes = listOf("Weak or dead battery", "Loose battery terminals", "Starter problem"),
            action = "Check that the battery terminals are tight and clean. A jump start may get you going, but have the battery and charging system tested."
        ),

        // ---------- Unusual Smells ----------
        WarningItem(
            id = "burning_rubber",
            categoryId = "smells",
            title = "Burning Rubber",
            detailTitle = "Burning Rubber Smell",
            typeLabel = "Unusual smell",
            summary = "A smell like burning tires or rubber.",
            severity = "Have it checked",
            causes = listOf("Slipping or worn belt", "Hose touching a hot part", "Brakes or clutch dragging"),
            action = "Pull over when it is safe and check if the smell continues. If you see smoke, stop and switch off the engine. Have the belts, hoses, and brakes inspected."
        ),
        WarningItem(
            id = "sweet_smell",
            categoryId = "smells",
            title = "Sweet Syrupy Smell",
            detailTitle = "Sweet Syrupy Smell",
            typeLabel = "Unusual smell",
            summary = "A sweet smell, like syrup, from the hood or the vents.",
            severity = "Have it checked",
            causes = listOf("Coolant leak", "Leaking radiator or hose", "Heater core problem"),
            action = "Watch the temperature gauge. Check the coolant level only when the engine is cool, and get the cooling system checked soon, because overheating can damage the engine."
        ),
        WarningItem(
            id = "rotten_egg",
            categoryId = "smells",
            title = "Rotten Egg Smell",
            detailTitle = "Rotten Egg Smell",
            typeLabel = "Unusual smell",
            summary = "A sulfur smell coming from the exhaust.",
            severity = "Have it checked",
            causes = listOf("Failing catalytic converter", "Fuel system problem", "Poor-quality fuel"),
            action = "Have the exhaust and fuel system checked. It is not usually an emergency, but a failing catalytic converter can get worse and affect performance."
        ),
        WarningItem(
            id = "gasoline_smell",
            categoryId = "smells",
            title = "Gasoline Smell",
            detailTitle = "Gasoline Smell",
            typeLabel = "Unusual smell",
            summary = "A strong fuel smell around or inside the car.",
            severity = "Stop safely",
            causes = listOf("Fuel leak", "Loose or damaged fuel cap", "Leaking fuel line"),
            action = "Stop in a safe place, switch off the engine, and keep away from flames or sparks. Do not keep driving if the smell is strong. Have it checked before using the car again."
        ),

        // ---------- Performance Changes ----------
        WarningItem(
            id = "hard_starting",
            categoryId = "performance",
            title = "Hard to Start",
            detailTitle = "Hard to Start",
            typeLabel = "Performance change",
            summary = "The engine takes longer than usual to start.",
            severity = "Have it checked",
            causes = listOf("Weak battery", "Worn spark plugs", "Fuel delivery problem"),
            action = "Have the battery tested first, since it is the most common cause. If the problem keeps getting worse, get the ignition and fuel system checked."
        ),
        WarningItem(
            id = "vibration",
            categoryId = "performance",
            title = "Shaking or Vibration",
            detailTitle = "Shaking or Vibration",
            typeLabel = "Performance change",
            summary = "The steering wheel, pedals, or seats shake while driving.",
            severity = "Have it checked",
            causes = listOf("Unbalanced or damaged tires", "Worn suspension parts", "Warped brake discs"),
            action = "Check your tires for bulges or damage. If the shaking gets stronger or you feel it through the steering, slow down and have the car inspected soon."
        ),
        WarningItem(
            id = "pulling_side",
            categoryId = "performance",
            title = "Pulling to One Side",
            detailTitle = "Pulling to One Side",
            typeLabel = "Performance change",
            summary = "The car drifts to one side while driving straight.",
            severity = "Have it checked",
            causes = listOf("Uneven tire pressure", "Wheel alignment is off", "A brake that is dragging"),
            action = "Check the tire pressure first. If it still pulls, get the alignment and brakes checked to avoid uneven tire wear."
        ),
        WarningItem(
            id = "power_loss",
            categoryId = "performance",
            title = "Loss of Power",
            detailTitle = "Loss of Power",
            typeLabel = "Performance change",
            summary = "The car feels weak or slow when accelerating.",
            severity = "Have it checked",
            causes = listOf("Clogged air or fuel filter", "Faulty sensor", "Blocked exhaust"),
            action = "Avoid hard acceleration and have the car checked soon. If the check engine light is also on, tell the mechanic."
        ),

        // ---------- Visible Signs & Leaks ----------
        WarningItem(
            id = "oil_leak",
            categoryId = "leaks",
            title = "Oil Leak",
            detailTitle = "Oil Leak",
            typeLabel = "Visible sign",
            summary = "Dark brown or black fluid under the car.",
            severity = "Have it checked",
            causes = listOf("Worn gasket or seal", "Loose oil drain plug", "Damaged oil filter"),
            action = "Check the oil level and top up if it is low. Small drips can wait for a repair shop visit, but a large puddle means you should not drive the car."
        ),
        WarningItem(
            id = "coolant_leak",
            categoryId = "leaks",
            title = "Coolant Leak",
            detailTitle = "Coolant Leak",
            typeLabel = "Visible sign",
            summary = "Green, orange, or pink fluid under the front of the car.",
            severity = "Have it checked",
            causes = listOf("Cracked hose", "Leaking radiator", "Failing water pump"),
            action = "Do not open the radiator cap when it is hot. Check the coolant level once the engine is cool and watch the temperature gauge. Get the leak fixed before any long drive."
        ),
        WarningItem(
            id = "brake_fluid_leak",
            categoryId = "leaks",
            title = "Brake Fluid Leak",
            detailTitle = "Brake Fluid Leak",
            typeLabel = "Visible sign",
            summary = "Clear to light brown, slippery fluid near the wheels.",
            severity = "Stop safely",
            causes = listOf("Worn brake line or hose", "Leaking caliper or cylinder", "Loose connection"),
            action = "Do not drive the car if the brake pedal feels soft or sinks. A brake fluid leak can lead to brake failure, so have it towed or inspected right away."
        ),
        WarningItem(
            id = "water_under_car",
            categoryId = "leaks",
            title = "Water Under the Car",
            detailTitle = "Water Under the Car",
            typeLabel = "Visible sign",
            summary = "A clear puddle of water, often after using the air conditioner.",
            severity = "Monitor",
            causes = listOf("Normal air conditioner drip", "Clogged AC drain", "Condensation from the exhaust"),
            action = "Clear water with no smell is usually normal. If the fluid has a color or a smell, check the other fluids on this list."
        ),

        // ---------- Urgency Levels ----------
        WarningItem(
            id = "level_stop",
            categoryId = "urgency",
            title = "Stop Safely",
            detailTitle = "Stop Safely",
            typeLabel = "Urgency level",
            summary = "Stop driving as soon as it is safe to do so.",
            severity = "Stop safely",
            causes = listOf("Oil pressure or brake warning light", "Engine overheating", "Strong fuel smell"),
            action = "Find a safe place to pull over, switch off the engine, and turn on your hazard lights. Do not continue until the problem is checked.",
            causesHeading = "Common examples"
        ),
        WarningItem(
            id = "level_checked",
            categoryId = "urgency",
            title = "Have It Checked",
            detailTitle = "Have It Checked",
            typeLabel = "Urgency level",
            summary = "Get it inspected soon. You can usually still drive carefully.",
            severity = "Have it checked",
            causes = listOf("Steady check engine light", "Squealing brakes", "Low tire pressure"),
            action = "Book a visit to a repair shop within the next few days, and avoid long trips or heavy loads until then.",
            causesHeading = "Common examples"
        ),
        WarningItem(
            id = "level_monitor",
            categoryId = "urgency",
            title = "Monitor",
            detailTitle = "Monitor",
            typeLabel = "Urgency level",
            summary = "Keep an eye on it and watch for changes.",
            severity = "Monitor",
            causes = listOf("Clear water under the car after using the AC", "Slightly worse fuel economy", "Small changes in noise"),
            action = "Note when it happens and whether it gets worse. If it changes or new signs appear, treat it as a higher level.",
            causesHeading = "Common examples"
        )
    )

    fun getCategory(id: String): WarningCategory? = categories.find { it.id == id }

    fun itemsFor(categoryId: String): List<WarningItem> = items.filter { it.categoryId == categoryId }

    fun getItem(id: String): WarningItem? = items.find { it.id == id }
}