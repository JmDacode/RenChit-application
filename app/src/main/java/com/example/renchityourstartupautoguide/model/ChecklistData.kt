package com.example.renchityourstartupautoguide.model

object ChecklistData {

    val categories = listOf(
        ChecklistCategory(
            id = "before_drive",
            title = "Before You Drive",
            subtitle = "Quick walk-around and cabin checks",
            intro = "A quick walk-around and cabin check before you start the engine."
        ),
        ChecklistCategory(
            id = "weekly",
            title = "Weekly Checks",
            subtitle = "Tires, fluids, and wipers",
            intro = "Do these once a week, ideally before the first drive of the day."
        ),
        ChecklistCategory(
            id = "monthly",
            title = "Monthly Checks",
            subtitle = "Battery, brakes, and belts",
            intro = "A closer look once a month, with the engine off and cool."
        ),
        ChecklistCategory(
            id = "long_trip",
            title = "Before a Long Trip",
            subtitle = "Get ready for the road",
            intro = "Check these the day before you leave, so there is time to fix anything."
        ),
        ChecklistCategory(
            id = "after_parking",
            title = "After Parking",
            subtitle = "Leave the car safe",
            intro = "A short routine every time you park."
        ),
        ChecklistCategory(
            id = "emergency",
            title = "Emergency Kit",
            subtitle = "What to keep in the car",
            intro = "Having these in the car makes a breakdown much easier to handle."
        )
    )

    val items = listOf(

        // ---------- Before You Drive ----------
        ChecklistItem(
            id = "walk_around",
            categoryId = "before_drive",
            title = "Walk around the car",
            hint = "Look for flat tires, dents, or leaks under the car.",
            why = "A quick look can catch problems before you start moving.",
            steps = listOf(
                "Walk all the way around the car.",
                "Look at the ground under the car for wet spots or puddles.",
                "Check that nothing is blocking the wheels or lights."
            ),
            tip = "Do it in daylight when you can, so small leaks and damage are easy to see."
        ),
        ChecklistItem(
            id = "tires",
            categoryId = "before_drive",
            title = "Check your tires",
            hint = "Make sure none look low or damaged.",
            why = "Tires affect braking, steering, and fuel use. A quick look can catch a slow leak or damage before it becomes a problem on the road.",
            steps = listOf(
                "Look at each tire. Check for bulges, cuts, or nails.",
                "Use a tire gauge and compare with the pressure on the sticker inside the driver's door.",
                "Check the tread. If it looks worn smooth, plan to replace the tire."
            ),
            tip = "Check tires when they are cold, before you drive, for the most accurate pressure reading."
        ),
        ChecklistItem(
            id = "lights_mirrors",
            categoryId = "before_drive",
            title = "Check lights and mirrors",
            hint = "Headlights, brake lights, signals, and mirrors.",
            why = "Working lights help others see you, and clean mirrors help you see them.",
            steps = listOf(
                "Turn on the headlights and look at the front and back of the car.",
                "Test the turn signals and brake lights. Ask someone to help, or check the reflection on a wall.",
                "Wipe the mirrors and windows so you can see clearly."
            ),
            tip = "A broken light is an easy fix and unsafe to ignore."
        ),
        ChecklistItem(
            id = "seat_belt",
            categoryId = "before_drive",
            title = "Seat belt and seat position",
            hint = "Buckle up and adjust so you can reach the pedals.",
            why = "A good seating position gives you control and helps the seat belt protect you.",
            steps = listOf(
                "Adjust the seat so you can press the pedals fully without stretching.",
                "Set the mirrors so you can see behind you without leaning.",
                "Buckle your seat belt and make sure your passengers buckle up too."
            ),
            tip = "Adjust everything before you start moving, never while driving."
        ),
        ChecklistItem(
            id = "dashboard",
            categoryId = "before_drive",
            title = "Look at the dashboard",
            hint = "After starting, check that no warning lights stay on.",
            why = "Warning lights come on briefly at start. If one stays on, the car is telling you something.",
            steps = listOf(
                "Turn the key or press start and watch the dashboard.",
                "Most lights switch off after a few seconds.",
                "If a light stays on, look it up in Warning Signs Explained."
            ),
            tip = "A red light usually means stop and check. An orange one means have it checked soon."
        ),

        // ---------- Weekly Checks ----------
        ChecklistItem(
            id = "tire_pressure",
            categoryId = "weekly",
            title = "Check tire pressure",
            hint = "Use a gauge and match the door sticker.",
            why = "Correct pressure makes the car safer and saves fuel.",
            steps = listOf(
                "Remove the valve cap and press the gauge firmly on the valve.",
                "Compare the number with the sticker inside the driver's door.",
                "Add air if it is low, then put the cap back."
            ),
            tip = "Check when the tires are cold for an accurate reading.",
            minutes = 2
        ),
        ChecklistItem(
            id = "oil_level",
            categoryId = "weekly",
            title = "Check the engine oil",
            hint = "Use the dipstick on flat ground with the engine off.",
            why = "Low oil can seriously damage the engine.",
            steps = listOf(
                "Park on flat ground and wait a few minutes after switching off.",
                "Pull out the dipstick, wipe it, put it back, then pull it out again.",
                "The oil should be between the two marks. Add the right oil if it is low."
            ),
            tip = "Your owner's manual says which type of oil your car needs.",
            minutes = 2
        ),
        ChecklistItem(
            id = "coolant_level",
            categoryId = "weekly",
            title = "Check the coolant level",
            hint = "Look at the reservoir when the engine is cold.",
            why = "Coolant keeps the engine from overheating.",
            steps = listOf(
                "Make sure the engine is completely cold.",
                "Find the coolant reservoir and look at the level on its side.",
                "It should sit between MIN and MAX. Top up with the right coolant if it is low."
            ),
            tip = "Never open the radiator cap on a hot engine. The coolant is under pressure and can burn you."
        ),
        ChecklistItem(
            id = "wipers_washer",
            categoryId = "weekly",
            title = "Wipers and washer fluid",
            hint = "Clear glass and a filled reservoir.",
            why = "Clear vision matters most in sudden rain.",
            steps = listOf(
                "Spray the washer fluid and run the wipers.",
                "Look for streaks, skipping, or squeaking.",
                "Fill the washer reservoir if it is low."
            ),
            tip = "Replace wipers when they leave streaks. It is a cheap fix."
        ),

        // ---------- Monthly Checks ----------
        ChecklistItem(
            id = "battery",
            categoryId = "monthly",
            title = "Check the battery",
            hint = "Look for corrosion and loose cables.",
            why = "A weak or loose battery is a common reason cars will not start.",
            steps = listOf(
                "Open the hood and find the battery.",
                "Look for white or green buildup on the terminals.",
                "Check that the cables are tight and do not wiggle."
            ),
            tip = "If you see heavy corrosion, ask a mechanic to clean it.",
            minutes = 2
        ),
        ChecklistItem(
            id = "brake_fluid",
            categoryId = "monthly",
            title = "Check the brake fluid",
            hint = "Look at the level in the reservoir.",
            why = "Low brake fluid can mean worn brakes or a leak.",
            steps = listOf(
                "Find the brake fluid reservoir near the back of the engine bay.",
                "Check that the level is between MIN and MAX.",
                "If it is low, have the brakes checked instead of just topping it up."
            ),
            tip = "Brake fluid that keeps dropping needs a mechanic, since it can mean a leak.",
            minutes = 2
        ),
        ChecklistItem(
            id = "belts_hoses",
            categoryId = "monthly",
            title = "Look at belts and hoses",
            hint = "Check for cracks, fraying, or leaks.",
            why = "Belts and hoses wear out slowly, and a break can stop the car.",
            steps = listOf(
                "With the engine off and cool, look at the rubber belts and hoses.",
                "Look for cracks, fraying, or shiny worn spots.",
                "Squeeze a hose gently. It should feel firm, not mushy or rock hard."
            ),
            tip = "Only do this with the engine off and cool.",
            minutes = 3
        ),
        ChecklistItem(
            id = "spare_jack",
            categoryId = "monthly",
            title = "Check the spare tire and jack",
            hint = "Make sure you can actually change a flat.",
            why = "A spare is no use if it is flat or the tools are missing.",
            steps = listOf(
                "Find the spare tire, jack, and wheel wrench.",
                "Check that the spare has enough air.",
                "Make sure all the tools are there."
            ),
            tip = "Find them once now, so you are not searching on the side of the road.",
            minutes = 3
        ),

        // ---------- Before a Long Trip ----------
        ChecklistItem(
            id = "trip_tires",
            categoryId = "long_trip",
            title = "Tires and spare",
            hint = "Pressure, tread, and the spare.",
            why = "Long drives put extra load on your tires.",
            steps = listOf(
                "Check the pressure of all four tires and the spare.",
                "Look at the tread and sidewalls for wear or cuts.",
                "Use the full-load pressure if your manual or door sticker lists one."
            ),
            tip = "Your manual may show a different pressure for a heavy load.",
            minutes = 3
        ),
        ChecklistItem(
            id = "trip_fluids",
            categoryId = "long_trip",
            title = "Oil, coolant, and washer fluid",
            hint = "Top up before you leave.",
            why = "Long trips use up more oil and coolant than short ones.",
            steps = listOf(
                "Check the oil level with the dipstick.",
                "Check the coolant level when the engine is cold.",
                "Fill the washer fluid reservoir."
            ),
            tip = "Do these checks before the first drive of the day, when the car is cold.",
            minutes = 3
        ),
        ChecklistItem(
            id = "trip_lights_brakes",
            categoryId = "long_trip",
            title = "Lights and brakes",
            hint = "Make sure you can see and stop.",
            why = "Night driving, rain, and long downhills test your lights and brakes.",
            steps = listOf(
                "Test the headlights, brake lights, and turn signals.",
                "Press the brake pedal. It should feel firm, not soft.",
                "Listen for squealing or grinding when you brake."
            ),
            tip = "If the brakes feel soft or grind, get them checked before you go.",
            minutes = 2
        ),
        ChecklistItem(
            id = "trip_documents",
            categoryId = "long_trip",
            title = "Documents and phone",
            hint = "Registration, license, and a charged phone.",
            why = "Having your papers and a charged phone makes a breakdown or checkpoint much easier.",
            steps = listOf(
                "Check that your license and the car's registration are in the car.",
                "Charge your phone and bring a charger.",
                "Save the number of your insurance or roadside help."
            ),
            tip = "Tell someone you trust where you are going and when you expect to arrive."
        ),
        ChecklistItem(
            id = "trip_fuel_route",
            categoryId = "long_trip",
            title = "Fuel and route",
            hint = "Fill up and plan your stops.",
            why = "Running out of fuel on a long road is stressful and unsafe.",
            steps = listOf(
                "Fill the tank before you leave.",
                "Plan where you will stop for fuel and rest.",
                "Check the route and traffic before leaving."
            ),
            tip = "Stop to rest about every two hours, even if you feel fine."
        ),

        // ---------- After Parking ----------
        ChecklistItem(
            id = "park_lock",
            categoryId = "after_parking",
            title = "Lock and close everything",
            hint = "Doors, windows, and the trunk.",
            why = "A closed and locked car protects your things.",
            steps = listOf(
                "Make sure all windows are closed.",
                "Lock the doors and pull a handle to confirm.",
                "Check that the trunk or tailgate is shut."
            ),
            tip = "Take your valuables with you, or at least keep them out of sight."
        ),
        ChecklistItem(
            id = "park_brake",
            categoryId = "after_parking",
            title = "Parking brake and gear",
            hint = "Make sure the car cannot roll.",
            why = "A car that rolls can cause damage or injury.",
            steps = listOf(
                "Press the brake pedal and apply the parking brake.",
                "Put a manual car in first gear, or an automatic in Park.",
                "On a slope, turn the front wheels toward the curb."
            ),
            tip = "Release the parking brake fully before you drive off. A dashboard light shows if it is still on."
        ),
        ChecklistItem(
            id = "park_lights",
            categoryId = "after_parking",
            title = "Lights and electronics off",
            hint = "Avoid a flat battery.",
            why = "Lights left on can drain the battery overnight.",
            steps = listOf(
                "Turn off the headlights and interior lights.",
                "Unplug chargers and dashcams that do not switch off by themselves.",
                "Take one last look around the car before you walk away."
            ),
            tip = "Many cars beep if the lights are still on. Do not ignore the beep."
        ),

        // ---------- Emergency Kit ----------
        ChecklistItem(
            id = "kit_tools",
            categoryId = "emergency",
            title = "Basic tools",
            hint = "Jack, wheel wrench, and warning triangle.",
            why = "These are the things you need for a flat tire or a breakdown.",
            steps = listOf(
                "Check that the jack and wheel wrench are in the car.",
                "Keep a warning triangle or reflective device where you can reach it.",
                "Add a flashlight with fresh batteries."
            ),
            tip = "Learn how to use the jack before you need it.",
            minutes = 2
        ),
        ChecklistItem(
            id = "kit_power",
            categoryId = "emergency",
            title = "Jumper cables and power bank",
            hint = "Be ready for a flat battery.",
            why = "A flat battery is one of the most common breakdowns.",
            steps = listOf(
                "Keep a set of jumper cables in the trunk.",
                "Keep a charged power bank for your phone.",
                "Know where the battery is under the hood."
            ),
            tip = "Ask your owner's manual or a mechanic how to jump start your car safely.",
            minutes = 2
        ),
        ChecklistItem(
            id = "kit_first_aid",
            categoryId = "emergency",
            title = "First aid and water",
            hint = "Bandages, plasters, and drinking water.",
            why = "Small injuries and long waits happen on the road.",
            steps = listOf(
                "Pack a small first aid kit with bandages, plasters, and antiseptic.",
                "Keep a bottle of drinking water in the car.",
                "Check the expiry dates every few months."
            ),
            tip = "Keep your emergency contacts in your phone and on paper.",
            minutes = 2
        )
    )

    fun getCategory(id: String): ChecklistCategory? = categories.find { it.id == id }

    fun itemsFor(categoryId: String): List<ChecklistItem> = items.filter { it.categoryId == categoryId }

    fun getItem(id: String): ChecklistItem? = items.find { it.id == id }
}