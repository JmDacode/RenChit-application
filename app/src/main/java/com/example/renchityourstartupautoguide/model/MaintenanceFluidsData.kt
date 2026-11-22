package com.example.renchityourstartupautoguide.model

object MaintenanceFluidsData {

    val guides = listOf(

        MaintenanceGuide(
            id = "engine_oil_check",
            topicId = "fluids",
            title = "Checking your engine oil",
            summary = "Read the dipstick in five minutes",
            overview = "Checking your engine oil means reading the dipstick to see how much oil is in the engine and what condition it is in. It takes about five minutes and needs no special tools.",
            whyItMatters = "Too little oil causes friction, overheating and serious engine damage. Catching a low level early is far cheaper than a repair.",
            whenToDo = "Once a month, before long trips, and any time the oil warning light comes on.",
            tools = listOf(
                "A clean, lint-free rag or paper towel",
                "A small funnel, if you need to top up",
                "The oil type and grade listed in your owner's manual, if you need to top up"
            ),
            steps = listOf(
                "Park on level ground and switch the engine off.",
                "If the engine is warm, wait about five minutes so the oil drains back into the pan. Some manuals say to check cold, so follow yours.",
                "Pull out the dipstick, which usually has a bright yellow or orange handle, and wipe it clean.",
                "Push it all the way back in, then pull it out again.",
                "Read the level. The oil should sit between the MIN and MAX marks, or inside the cross-hatched area.",
                "Look at the oil. Fresh oil is amber. Dark is normal as it ages, but it should not be gritty, milky or smell of fuel.",
                "If the level is low, add a little oil at a time through the filler cap. Wait a minute, then check again. Never go above MAX.",
                "Push the dipstick fully back in and close the filler cap."
            ),
            watchFor = listOf(
                "A level below MIN, or oil you need to top up often",
                "Milky or foamy oil, which can mean coolant is getting in",
                "Very thick, gritty or black oil",
                "A fuel smell on the dipstick",
                "Oil spots under the car where you park"
            ),
            seeMechanic = listOf(
                "The level keeps dropping between oil changes",
                "The oil looks milky or has metal glitter in it",
                "The oil warning light stays on",
                "Your car has no dipstick and shows an oil warning on the dashboard"
            ),
            safety = "Do not touch the exhaust manifold or other hot engine parts. Never run the engine with the filler cap off.",
            relatedPartIds = listOf("engine_oil", "oil_pan", "oil_pump", "oil_pressure_sensor"),
            quiz = LearnQuiz(
                question = "Where should the oil level sit on the dipstick?",
                options = listOf(
                    "Between the MIN and MAX marks",
                    "Above the MAX mark",
                    "Below the MIN mark"
                ),
                answerIndex = 0,
                explanation = "Too little oil risks damage, and too much can foam and also harm the engine."
            ),
            level = "Beginner",
            minutes = 5
        ),

        MaintenanceGuide(
            id = "oil_filter_change",
            topicId = "fluids",
            title = "Oil and filter change",
            summary = "Replace the old oil and the filter",
            overview = "An oil change replaces the old engine oil and the oil filter. It matters a lot, but it also means lifting the car and handling hot oil. Learn the steps even if you let a shop do it.",
            whyItMatters = "Oil breaks down and fills with dirt over time. Fresh oil and a new filter keep the engine clean, cool and well lubricated.",
            whenToDo = "At the interval in your owner's manual, by distance or time, whichever comes first. Hard driving, dust, towing and lots of short trips call for shorter intervals.",
            tools = listOf(
                "The correct engine oil and a new oil filter for your car",
                "A drain pan",
                "A socket or wrench that fits the drain plug",
                "An oil filter wrench",
                "A new drain plug washer",
                "A funnel",
                "Jack stands or ramps rated for your car, never just a jack",
                "A torque wrench",
                "Gloves and rags"
            ),
            steps = listOf(
                "Run the engine for a couple of minutes so the oil flows well, then switch it off. Do not start when the engine is very hot.",
                "Lift the car on a flat surface and support it on ramps or jack stands. Apply the parking brake and chock the wheels that stay on the ground.",
                "Place the drain pan under the drain plug.",
                "Loosen and remove the drain plug, then let the oil drain fully.",
                "Fit a new washer and refit the drain plug. Tighten to the torque in your manual.",
                "Move the pan under the oil filter, then unscrew the old filter. Some oil will spill.",
                "Wipe the mounting surface. Rub a thin film of fresh oil on the new filter's rubber gasket.",
                "Screw on the new filter by hand until the gasket touches, then tighten as the filter instructions say. Do not overtighten.",
                "Lower the car, open the filler cap, and pour in the amount of oil your manual lists.",
                "Check the dipstick and adjust to the right level.",
                "Start the engine for about 30 seconds and look under the car for leaks. Switch off, wait a few minutes, and check the level again.",
                "Take the old oil to a recycling point. Never pour it down a drain or on the ground."
            ),
            watchFor = listOf(
                "Oil dripping from the drain plug or filter",
                "A level that is too low or too high after the change",
                "The oil warning light staying on",
                "A drain plug thread that feels stripped"
            ),
            seeMechanic = listOf(
                "You do not have a safe, flat place to lift the car",
                "The drain plug or filter will not come off",
                "The drain plug thread is stripped",
                "There is still a leak after the change",
                "Your car needs a service light reset or a special oil spec"
            ),
            safety = "Never work under a car supported only by a jack. Use jack stands or ramps on firm, level ground. Hot oil can burn, so let the engine cool a little first.",
            relatedPartIds = listOf("engine_oil", "oil_filter", "oil_pan", "oil_pump"),
            quiz = LearnQuiz(
                question = "What should support the car while you work underneath it?",
                options = listOf(
                    "Jack stands or ramps",
                    "Only the jack",
                    "A stack of bricks"
                ),
                answerIndex = 0,
                explanation = "A jack can slip or fail. Stands and ramps are built to hold the weight."
            ),
            level = "Intermediate",
            minutes = 45
        ),

        MaintenanceGuide(
            id = "coolant_level_check",
            topicId = "fluids",
            title = "Checking your coolant",
            summary = "A quick look at the reservoir",
            overview = "The coolant carries heat away from the engine. Checking it means looking at the level and the color in the reservoir tank, with the engine cold.",
            whyItMatters = "Low coolant is a leading cause of overheating, and overheating can wreck an engine.",
            whenToDo = "Once a month, before long trips, and any time the temperature gauge climbs higher than normal.",
            tools = listOf(
                "A flashlight, if the tank is hard to see",
                "A rag",
                "The coolant type and mix listed in your owner's manual, if you need to top up"
            ),
            steps = listOf(
                "Park on level ground and let the engine cool completely.",
                "Open the hood and find the coolant reservoir, a plastic tank with MIN and MAX marks.",
                "Read the level on the side of the tank. It should be between MIN and MAX.",
                "Look at the color. Clean coolant is bright and clear, and may be green, pink, orange or blue depending on the type.",
                "If it is low, unscrew the reservoir cap slowly, only when the engine is cold, and add the coolant mix your manual lists. Stop at MAX.",
                "Close the cap firmly.",
                "Look at the hoses and under the car for leaks, wet spots or crusty residue."
            ),
            watchFor = listOf(
                "A level that keeps falling",
                "Rusty brown, oily or sludgy coolant",
                "A sweet smell near the engine",
                "White or colored crust around hose joints",
                "A temperature gauge that climbs higher than usual"
            ),
            seeMechanic = listOf(
                "The level keeps dropping after you top it up",
                "The engine overheats or steam comes from under the hood",
                "The oil looks milky",
                "The heater stops blowing warm air"
            ),
            safety = "Never open the radiator or reservoir cap on a hot engine. The system is under pressure, and hot coolant can spray out and cause serious burns. Keep coolant away from pets and children, because it is poisonous.",
            relatedPartIds = listOf("coolant_reservoir", "radiator", "radiator_cap", "thermostat", "water_pump"),
            quiz = LearnQuiz(
                question = "When is it safe to open the coolant cap?",
                options = listOf(
                    "When the engine is cold",
                    "Right after a long drive",
                    "While the engine is running"
                ),
                answerIndex = 0,
                explanation = "A hot system is pressurized and can spray scalding coolant."
            ),
            level = "Beginner",
            minutes = 5
        ),

        MaintenanceGuide(
            id = "brake_fluid_check",
            topicId = "fluids",
            title = "Checking your brake fluid",
            summary = "Look at the level and color",
            overview = "Brake fluid carries the force from your foot to the brakes. Checking it means looking at the level and color in the small reservoir near the back of the engine bay.",
            whyItMatters = "Low, old or wet fluid makes the pedal feel soft and braking weaker. It is a safety item.",
            whenToDo = "Every month or two, and any time the pedal feels different or the brake warning light comes on.",
            tools = listOf(
                "A clean rag",
                "A flashlight, if needed",
                "Your owner's manual, to find the reservoir and the fluid type"
            ),
            steps = listOf(
                "Park on level ground with the engine off.",
                "Find the brake fluid reservoir. It is a small tank, usually on the driver's side, at the back of the engine bay.",
                "Wipe the outside clean. Most reservoirs let you read the level from outside, without opening the cap.",
                "Check that the level sits between MIN and MAX.",
                "Look at the color. New fluid is clear to light amber. Dark brown or black fluid is old.",
                "Do not add fluid to fix a low level. A falling level usually means worn pads or a leak, so have the brakes checked.",
                "If you did open the cap, close it quickly and firmly, because brake fluid absorbs moisture from the air."
            ),
            watchFor = listOf(
                "A level below MIN",
                "Dark or cloudy fluid",
                "A soft or sinking pedal",
                "The brake warning light",
                "Wet spots near the wheels"
            ),
            seeMechanic = listOf(
                "The level is low or dropping",
                "The pedal feels soft or goes too far down",
                "The fluid is dark or past the change interval in your manual",
                "You see any leak near the wheels or under the car"
            ),
            safety = "Brake fluid damages paint and is harmful on skin and in eyes. Wipe up spills right away, and only use the type printed on the cap. Do not drive if you doubt your brakes.",
            relatedPartIds = listOf("brake_fluid_reservoir", "brake_fluid", "master_cylinder", "brake_pads", "spongy_pedal"),
            quiz = LearnQuiz(
                question = "What does a quickly dropping brake fluid level usually mean?",
                options = listOf(
                    "A leak or very worn pads",
                    "The fluid is fresh",
                    "Nothing important"
                ),
                answerIndex = 0,
                explanation = "Fluid is not used up. If the level falls, it is leaking or the pads are wearing down."
            ),
            level = "Beginner",
            minutes = 5
        ),

        MaintenanceGuide(
            id = "washer_fluid_check",
            topicId = "fluids",
            title = "Topping up washer fluid",
            summary = "Keep the windshield clear",
            overview = "Washer fluid is the liquid you spray on the windshield. Keeping the tank full lets you clear dirt, bugs and road spray quickly.",
            whyItMatters = "A dirty windshield cuts your view, especially at night and in the rain. Running the pump dry can also damage it.",
            whenToDo = "Every time you fill up on fuel, and whenever the spray gets weak.",
            tools = listOf(
                "Windshield washer fluid",
                "A small funnel"
            ),
            steps = listOf(
                "Find the washer fluid tank. Its cap usually has a windshield and spray symbol.",
                "Open the cap.",
                "Using the funnel, pour in washer fluid until it is near the top.",
                "Close the cap firmly.",
                "Test the spray. If it is weak or uneven, gently clean the nozzles with a pin."
            ),
            watchFor = listOf(
                "Weak or no spray",
                "Blocked or misaimed nozzles",
                "A tank that empties quickly, which can mean a leak"
            ),
            seeMechanic = listOf(
                "The pump runs but nothing sprays after the tank is full and the nozzles are clear",
                "The tank or a hose is leaking",
                "The wipers also stop working"
            ),
            safety = "Never pour engine coolant, oil or fuel into the washer tank. Keep washer fluid away from children, because it is poisonous.",
            quiz = LearnQuiz(
                question = "What should you check first if the washer sprays weakly?",
                options = listOf(
                    "The fluid level and the nozzles",
                    "The engine oil",
                    "The tire pressure"
                ),
                answerIndex = 0,
                explanation = "An empty tank or blocked nozzles is the most common cause."
            ),
            level = "Beginner",
            minutes = 3
        )
    )
}