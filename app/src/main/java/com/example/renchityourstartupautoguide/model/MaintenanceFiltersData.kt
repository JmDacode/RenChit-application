package com.example.renchityourstartupautoguide.model

object MaintenanceFiltersData {

    val guides = listOf(

        MaintenanceGuide(
            id = "air_filter_inspection",
            topicId = "filters",
            title = "Inspecting the engine air filter",
            summary = "See if it is clogged with dirt",
            overview = "The engine air filter cleans the air before it goes into the engine. Inspecting it means opening the air filter box, taking the filter out and checking how dirty it is.",
            whyItMatters = "A clogged filter restricts airflow, which can hurt performance and fuel economy. A damaged filter can let dirt into the engine.",
            whenToDo = "Every few months, more often if you drive on dusty or unpaved roads, and at each service.",
            tools = listOf(
                "A screwdriver, if the housing uses screws",
                "A flashlight",
                "A clean rag",
                "Your owner's manual, to find the air filter box"
            ),
            steps = listOf(
                "Switch the engine off, let it cool and open the hood.",
                "Find the air filter box. It is a large black plastic box connected to the engine by a wide hose, and it usually has metal clips or screws.",
                "Release the clips or remove the screws and lift the cover.",
                "Take the filter out and note which way it sits, so it goes back the same way.",
                "Hold it up to a light. If you cannot see light through the pleats, it is clogged.",
                "Look for dirt, oil, insects, leaves and any holes or tears.",
                "Wipe out any loose dirt from inside the box with a clean rag, being careful not to let anything fall into the intake.",
                "Put the filter back, fit the cover and make sure all the clips or screws are secure."
            ),
            watchFor = listOf(
                "A filter that is dark, caked with dirt or full of debris",
                "Oil on the filter",
                "Holes, tears or a bent frame",
                "Dirt inside the box on the engine side of the filter",
                "A cover that does not close fully"
            ),
            seeMechanic = listOf(
                "The filter is wet with oil",
                "You find dirt on the clean side of the filter",
                "The housing or hoses are cracked or loose",
                "The engine runs rough or the check engine light is on after you reassemble the box"
            ),
            safety = "Do the check with the engine off and cool. Keep your hands clear of belts and fans, and make sure nothing falls into the intake opening. Do not start the engine with the filter box open.",
            relatedPartIds = listOf("air_filter", "air_filter_housing", "intake_hose", "mass_air_flow_sensor"),
            quiz = LearnQuiz(
                question = "How can you quickly tell if an air filter is clogged?",
                options = listOf(
                    "Hold it up to a light and see if light passes through",
                    "Smell it",
                    "Shake it hard"
                ),
                answerIndex = 0,
                explanation = "If you cannot see light through the pleats, air cannot get through easily either."
            ),
            level = "Beginner",
            minutes = 10
        ),

        MaintenanceGuide(
            id = "air_filter_replacement",
            topicId = "filters",
            title = "Replacing the engine air filter",
            summary = "A simple swap you can do yourself",
            overview = "Replacing the engine air filter means taking out the old one and fitting a new one of the same size and type. On most cars it is one of the easiest jobs under the hood.",
            whyItMatters = "A fresh filter keeps the engine breathing freely and keeps dirt and grit out of the engine.",
            whenToDo = "At the interval in your owner's manual, or sooner if the filter is dirty or you drive in dusty conditions.",
            tools = listOf(
                "The correct replacement air filter for your car",
                "A screwdriver, if needed",
                "A clean rag",
                "Your owner's manual or the parts shop, to confirm the right filter"
            ),
            steps = listOf(
                "Confirm the filter you bought matches your car by comparing it to the old one or checking the part number.",
                "Switch the engine off, let it cool and open the hood.",
                "Open the air filter box by releasing the clips or removing the screws.",
                "Lift out the old filter and note how it sits.",
                "Wipe the inside of the box clean with a rag, without letting anything drop into the intake.",
                "Place the new filter in the same way as the old one, making sure the rubber edge sits fully in its seat.",
                "Fit the cover and make sure every clip or screw is secured and nothing is pinched.",
                "Start the engine and check it idles normally, then dispose of the old filter."
            ),
            watchFor = listOf(
                "A filter that is slightly the wrong size",
                "A gap around the edge of the filter",
                "A cover that does not sit flush",
                "A loose hose or sensor plug that came off while you worked",
                "A rough idle after the change"
            ),
            seeMechanic = listOf(
                "You cannot find the filter box or are unsure how to open it",
                "The cover will not close properly",
                "The check engine light comes on after the change",
                "Your car's filter is in a hard to reach spot or needs parts removed"
            ),
            safety = "Work with the engine off and cool. Do not let dirt or any tool fall into the intake. Make sure all electrical plugs or sensors you moved are reconnected before you start the engine.",
            relatedPartIds = listOf("air_filter", "air_filter_housing", "mass_air_flow_sensor", "intake_hose"),
            quiz = LearnQuiz(
                question = "What should you check before closing the air filter box?",
                options = listOf(
                    "The new filter sits fully in its seat and the cover is secure",
                    "That the filter is as loose as possible",
                    "That the old filter is put back in as well"
                ),
                answerIndex = 0,
                explanation = "A gap around the filter lets unfiltered air and dirt into the engine."
            ),
            level = "Beginner",
            minutes = 15
        ),

        MaintenanceGuide(
            id = "cabin_filter_inspection",
            topicId = "filters",
            title = "Inspecting the cabin air filter",
            summary = "The filter for the air you breathe",
            overview = "The cabin air filter cleans the air that comes through the vents inside the car. It traps dust, pollen and some pollution. Many cars have one, but not all.",
            whyItMatters = "A clogged cabin filter reduces airflow, makes the air conditioning and heater weaker, and can cause bad smells or fogging windows. It also matters if you have allergies.",
            whenToDo = "Every few months, and whenever airflow from the vents feels weak or the air smells musty.",
            tools = listOf(
                "A flashlight",
                "A screwdriver, on some cars",
                "Your owner's manual, to find where the filter is"
            ),
            steps = listOf(
                "Check your manual for the location of the cabin filter. It is commonly behind the glove box, under the dashboard or under the hood near the windshield.",
                "If it is behind the glove box, empty the glove box and release the stops so it swings down.",
                "Open the filter cover, which is usually held by clips.",
                "Slide the filter out and note which way the airflow arrow points.",
                "Look at it in the light. Leaves, dust and dirt on the surface mean it is due for replacement.",
                "If it is only lightly dusty and still in good shape, you can put it back the same way.",
                "Close the cover and refit the glove box."
            ),
            watchFor = listOf(
                "A filter that is gray or black with dirt",
                "Leaves, insects or debris stuck in the pleats",
                "A damp or moldy filter",
                "Weak airflow from the vents",
                "A musty smell when the fan or air conditioning is on"
            ),
            seeMechanic = listOf(
                "The airflow is still weak with a clean filter",
                "A musty smell stays after you replace the filter",
                "You cannot find a cabin filter in your car",
                "The filter housing is damaged or water is getting in"
            ),
            safety = "Work with the engine off. Do not force the glove box or plastic clips, because they can snap. If you have allergies, wear a dust mask when handling a dirty filter.",
            relatedPartIds = listOf("cabin_filter", "hvac_blower", "ac_evaporator"),
            quiz = LearnQuiz(
                question = "What is a common sign of a clogged cabin air filter?",
                options = listOf(
                    "Weak airflow from the vents",
                    "A flat tire",
                    "A low oil light"
                ),
                answerIndex = 0,
                explanation = "A clogged filter blocks the air before it reaches the vents, so the fan has to push harder for less airflow."
            ),
            level = "Beginner",
            minutes = 10
        ),

        MaintenanceGuide(
            id = "cabin_filter_replacement",
            topicId = "filters",
            title = "Replacing the cabin air filter",
            summary = "Fresh air through the vents",
            overview = "Replacing the cabin filter is a quick job on most cars. You slide out the old filter and fit a new one in the same direction.",
            whyItMatters = "A clean cabin filter gives stronger airflow, cleaner air and helps keep the air conditioning working well.",
            whenToDo = "At the interval in your owner's manual, or sooner if the filter is dirty, the airflow is weak or the car is used in dusty or polluted areas.",
            tools = listOf(
                "The correct cabin filter for your car",
                "A screwdriver, if needed",
                "A flashlight",
                "Your owner's manual"
            ),
            steps = listOf(
                "Make sure the new filter matches your car by comparing it to the old one or checking the part number.",
                "Locate the filter housing as in your manual, and open the cover.",
                "Slide out the old filter and look at which way the airflow arrow points.",
                "Clean out any leaves or dust in the housing with a rag or a small brush.",
                "Slide in the new filter with the airflow arrow pointing the same way as the old one.",
                "Close the cover and make sure the clips are secure.",
                "Refit the glove box, if you removed it.",
                "Turn on the fan and check the airflow from the vents."
            ),
            watchFor = listOf(
                "A filter fitted the wrong way round",
                "A cover that does not close flush",
                "Pieces of the old filter left in the housing",
                "Weaker airflow after the change",
                "A rattling sound from the dashboard"
            ),
            seeMechanic = listOf(
                "The housing is broken or the filter will not fit",
                "The airflow is still weak after replacing the filter",
                "There is a persistent bad smell or moisture in the housing",
                "You are not sure where the filter is on your car"
            ),
            safety = "Switch the engine off before working. Be gentle with the plastic covers and clips behind the dashboard, as they can break easily. Wear a dust mask if you are sensitive to dust or mold.",
            relatedPartIds = listOf("cabin_filter", "hvac_blower", "ac_evaporator"),
            quiz = LearnQuiz(
                question = "What does the arrow on a new cabin filter show?",
                options = listOf(
                    "The direction the air should flow through the filter",
                    "Which side to throw away",
                    "The date it was made"
                ),
                answerIndex = 0,
                explanation = "Fitting the filter the right way round makes sure it traps dirt properly and does not release it into the cabin."
            ),
            level = "Beginner",
            minutes = 15
        ),

        MaintenanceGuide(
            id = "dirty_filter_signs",
            topicId = "filters",
            title = "Signs a filter needs replacing",
            summary = "What your car tells you",
            overview = "Both filters give hints when they are past their best. Knowing the signs means you can change them before they cause problems, rather than only following a schedule.",
            whyItMatters = "A clogged filter costs you comfort and efficiency, and in the case of the engine air filter, can allow damage if dirt gets through. Filters are cheap compared to the parts they protect.",
            whenToDo = "Any time you notice these signs, and as part of your regular checks.",
            tools = listOf(
                "A flashlight",
                "Your owner's manual",
                "Your eyes and nose"
            ),
            steps = listOf(
                "For the engine air filter, notice if the car feels slower or less responsive, or if fuel use goes up.",
                "Listen for a rough or uneven idle, which can sometimes come from restricted airflow.",
                "Open the air filter box and look for a dark, clogged or damaged filter.",
                "For the cabin filter, check how strong the airflow is when the fan is on high.",
                "Notice musty or unpleasant smells when you turn on the fan or air conditioning.",
                "Look at windows that fog up more easily than usual, because poor airflow slows demisting.",
                "Compare the filter's age with the interval in your owner's manual, and replace it if it is due."
            ),
            watchFor = listOf(
                "Reduced power or sluggish acceleration",
                "Higher fuel use than normal",
                "Weak airflow from the vents",
                "Musty or dusty smells inside the car",
                "Windows that fog up and clear slowly",
                "Visible dirt or damage on the filter"
            ),
            seeMechanic = listOf(
                "Symptoms continue after you replace the filter",
                "The check engine light is on",
                "The engine misfires or stalls",
                "Airflow is weak even with new filters"
            ),
            safety = "None of these checks needs the engine running. Keep your hands clear of moving parts and hot surfaces whenever you look under the hood.",
            relatedPartIds = listOf("air_filter", "cabin_filter", "mass_air_flow_sensor", "hvac_blower"),
            quiz = LearnQuiz(
                question = "A musty smell when you turn on the fan is most likely linked to which part?",
                options = listOf(
                    "The cabin air filter or the ventilation system",
                    "The tires",
                    "The brake pads"
                ),
                answerIndex = 0,
                explanation = "A dirty or damp cabin filter and the air ducts can hold moisture and dust, which produce that smell."
            ),
            level = "Beginner",
            minutes = 5
        )
    )
}