package com.example.renchityourstartupautoguide.model

object SuspensionBasicsData {

    val groups = listOf(
        LearnGroup(
            id = "susp_types",
            systemId = "suspension",
            title = "Suspension types",
            intro = "The main designs that connect the wheels to the car."
        ),
        LearnGroup(
            id = "susp_components",
            systemId = "suspension",
            title = "Suspension components",
            intro = "The arms, springs, joints and cushions that hold the wheels and smooth the ride."
        ),
        LearnGroup(
            id = "susp_shocks",
            systemId = "suspension",
            title = "Shock absorber types",
            intro = "Different ways of building the part that controls bouncing."
        )
    )

    val parts = listOf(

        // ---------- Suspension types ----------
        LearnPart(
            id = "double_wishbone",
            systemId = "suspension",
            groupId = "susp_types",
            name = "Double wishbone",
            summary = "Two arms hold each wheel",
            whatIs = "A design with an upper and a lower A-shaped arm connecting each wheel to the car.",
            whatItDoes = listOf(
                "Keeps the tire flat on the road as the car leans and bounces.",
                "Gives good grip and handling."
            ),
            location = "Common on sports cars, some trucks and some SUVs.",
            relatedIds = listOf("upper_control_arm", "lower_control_arm", "ball_joints", "macpherson_strut"),
            ifItFails = "Worn arm bushings or ball joints cause clunks, wandering, and uneven tire wear.",
            maintenance = "Have the joints and bushings checked at service, and the alignment checked after repairs.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "How many arms does a double wishbone design use at each wheel?",
                options = listOf("Two", "One", "Four"),
                answerIndex = 0,
                explanation = "It uses an upper and a lower arm."
            )
        ),

        LearnPart(
            id = "macpherson_strut",
            systemId = "suspension",
            groupId = "susp_types",
            name = "MacPherson strut",
            summary = "A compact, common design",
            whatIs = "A design where a strut holds the spring and shock absorber in one unit, with a single lower arm below it.",
            whatItDoes = listOf(
                "Takes up little space, which is good for front-wheel-drive cars.",
                "Costs less to build."
            ),
            location = "Very common on the front of small and mid-size cars.",
            relatedIds = listOf("struts", "lower_control_arm", "coil_springs", "double_wishbone"),
            ifItFails = "A worn strut causes bouncing, nose dive when braking, and clunks over bumps.",
            maintenance = "Check for leaks and noises. Get an alignment after replacing struts.",
            quiz = LearnQuiz(
                question = "What does a MacPherson strut combine in one unit?",
                options = listOf(
                    "The spring and the shock absorber",
                    "The brake and the tire",
                    "The engine and the gearbox"
                ),
                answerIndex = 0,
                explanation = "The strut holds both and also guides the wheel."
            )
        ),

        LearnPart(
            id = "multi_link",
            systemId = "suspension",
            groupId = "susp_types",
            name = "Multi-link",
            summary = "Several links for a smooth, stable ride",
            whatIs = "A design that uses three or more separate links to locate each wheel.",
            whatItDoes = listOf(
                "Gives engineers fine control over how the wheel moves.",
                "Helps a car ride comfortably and still handle well."
            ),
            location = "Often at the rear, and on the front of some premium cars.",
            relatedIds = listOf("bushings", "ball_joints", "lower_control_arm"),
            ifItFails = "With so many parts, any worn link or bushing can cause noise, vibration or odd tire wear.",
            maintenance = "Costly to repair, so catch worn bushings early.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What is a benefit of a multi-link suspension?",
                options = listOf(
                    "Good ride and handling",
                    "No parts to wear",
                    "It needs no alignment"
                ),
                answerIndex = 0,
                explanation = "Many links give fine control over wheel movement."
            )
        ),

        LearnPart(
            id = "solid_axle",
            systemId = "suspension",
            groupId = "susp_types",
            name = "Solid axle",
            summary = "One rigid axle across the car",
            whatIs = "A design where one stiff axle connects the left and right wheels.",
            whatItDoes = listOf(
                "Is tough, simple and good for heavy loads.",
                "Means a bump on one wheel affects the other."
            ),
            location = "Common on trucks, off-road vehicles, and the rear of some SUVs.",
            relatedIds = listOf("leaf_spring_type", "coil_spring_type", "axles", "differential"),
            ifItFails = "A bent axle or worn mounts cause vibration and tire wear.",
            maintenance = "Have the mounts and bushings inspected, especially on vehicles that haul or go off-road.",
            quiz = LearnQuiz(
                question = "What happens when one wheel on a solid axle hits a bump?",
                options = listOf(
                    "The other wheel is affected too",
                    "Nothing",
                    "The engine stops"
                ),
                answerIndex = 0,
                explanation = "Both wheels are joined by the same axle."
            )
        ),

        LearnPart(
            id = "leaf_spring_type",
            systemId = "suspension",
            groupId = "susp_types",
            name = "Leaf spring suspension",
            summary = "Stacked steel strips as the spring",
            whatIs = "A design that uses a stack of curved steel strips as both spring and wheel locator.",
            whatItDoes = listOf(
                "Carries heavy loads well.",
                "Is simple and strong."
            ),
            location = "Mostly on the rear of pickup trucks and vans.",
            relatedIds = listOf("leaf_springs", "solid_axle", "shock_absorbers"),
            ifItFails = "A cracked or sagging leaf makes the vehicle sit low or lean to one side.",
            maintenance = "Look for cracks, rust and broken leaves, and check the mounting bolts.",
            quiz = LearnQuiz(
                question = "Where are leaf springs most common?",
                options = listOf(
                    "The rear of trucks and vans",
                    "On sports car fronts",
                    "Inside the engine"
                ),
                answerIndex = 0,
                explanation = "They suit vehicles that carry heavy loads."
            )
        ),

        LearnPart(
            id = "coil_spring_type",
            systemId = "suspension",
            groupId = "susp_types",
            name = "Coil spring suspension",
            summary = "Spiral springs hold the car up",
            whatIs = "A design that uses spiral steel springs to support the car's weight.",
            whatItDoes = listOf(
                "Gives a smooth, comfortable ride.",
                "Works with shock absorbers or struts."
            ),
            location = "On most modern passenger cars.",
            relatedIds = listOf("coil_springs", "shock_absorbers", "struts"),
            ifItFails = "A broken or sagging spring makes the car sit low, bottom out, or make noise.",
            maintenance = "Replace springs in pairs on the same axle.",
            quiz = LearnQuiz(
                question = "What do coil springs do?",
                options = listOf(
                    "Support the car's weight",
                    "Pump fuel",
                    "Cool the brakes"
                ),
                answerIndex = 0,
                explanation = "They hold the car up and absorb bumps."
            )
        ),

        LearnPart(
            id = "torsion_bar",
            systemId = "suspension",
            groupId = "susp_types",
            name = "Torsion bar",
            summary = "A twisting steel bar acts as the spring",
            whatIs = "A long steel bar that twists to act as a spring.",
            whatItDoes = listOf(
                "Takes the place of a coil spring.",
                "Often lets you adjust ride height by turning a bolt."
            ),
            location = "On the front of some trucks and SUVs.",
            relatedIds = listOf("lower_control_arm", "coil_spring_type"),
            ifItFails = "A sagging front end or a ride height that will not hold.",
            maintenance = "Have it adjusted and checked by a mechanic.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "How does a torsion bar work as a spring?",
                options = listOf("It twists", "It stretches like rubber", "It spins freely"),
                answerIndex = 0,
                explanation = "The steel bar twists and then springs back."
            )
        ),

        // ---------- Suspension components ----------
        LearnPart(
            id = "upper_control_arm",
            systemId = "suspension",
            groupId = "susp_components",
            name = "Upper control arm",
            summary = "The top arm that holds the wheel",
            whatIs = "A hinged arm that connects the top of the wheel assembly to the car's frame.",
            whatItDoes = listOf(
                "Lets the wheel move up and down.",
                "Keeps the wheel in the right position."
            ),
            location = "Above the lower arm, on double wishbone suspensions.",
            relatedIds = listOf("lower_control_arm", "ball_joints", "bushings", "double_wishbone"),
            ifItFails = "Clunking, wandering, or uneven tire wear.",
            maintenance = "Look for bent arms and worn bushings. Alignment is needed after replacing arms.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What does a control arm let the wheel do?",
                options = listOf("Move up and down", "Make power", "Hold fuel"),
                answerIndex = 0,
                explanation = "It pivots so the wheel can follow the road."
            )
        ),

        LearnPart(
            id = "lower_control_arm",
            systemId = "suspension",
            groupId = "susp_components",
            name = "Lower control arm",
            summary = "The bottom arm that holds the wheel",
            whatIs = "A hinged arm that connects the bottom of the wheel assembly to the frame. It carries most of the load.",
            whatItDoes = listOf(
                "Locates the wheel front to back and side to side.",
                "Carries braking and cornering forces."
            ),
            location = "Under the front of the car, behind each wheel.",
            relatedIds = listOf("upper_control_arm", "ball_joints", "bushings", "macpherson_strut"),
            ifItFails = "Clunking over bumps, steering wander, or a pull when braking.",
            maintenance = "Inspect for bends, cracks and worn bushings or ball joints.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What can a worn lower control arm bushing cause?",
                options = listOf("Clunking and wandering", "Better fuel use", "Cooler air"),
                answerIndex = 0,
                explanation = "Extra movement lets the wheel shift and knock."
            )
        ),

        LearnPart(
            id = "ball_joints",
            systemId = "suspension",
            groupId = "susp_components",
            name = "Ball joints",
            summary = "Pivots that let the wheel turn and move",
            whatIs = "Ball-and-socket joints that connect the control arms to the steering knuckle.",
            whatItDoes = listOf(
                "Let the wheel turn left and right and move up and down.",
                "Work like the hip joint in your body."
            ),
            location = "At the outer end of the control arms, near each wheel.",
            relatedIds = listOf("lower_control_arm", "upper_control_arm", "steering_knuckles"),
            ifItFails = "Clunking over bumps, loose steering, or wobble. A joint that comes apart can make the wheel collapse, which is very dangerous.",
            maintenance = "Have them checked at service. Replace worn ones right away.",
            whyItMatters = "A failed ball joint is a safety emergency, not just a nuisance.",
            quiz = LearnQuiz(
                question = "What is the danger of a badly worn ball joint?",
                options = listOf(
                    "It can separate and the wheel can collapse",
                    "It makes the car faster",
                    "It only looks bad"
                ),
                answerIndex = 0,
                explanation = "A separated joint lets the wheel assembly fold away from the car."
            )
        ),

        LearnPart(
            id = "shock_absorbers",
            systemId = "suspension",
            groupId = "susp_components",
            name = "Shock absorbers",
            summary = "Stop the car from bouncing",
            whatIs = "Oil-filled dampers that control how fast the springs move.",
            whatItDoes = listOf(
                "Stop the car from bouncing after a bump.",
                "Keep the tires pressed to the road.",
                "Do not hold up the car's weight. The springs do that."
            ),
            location = "Near each wheel, between the axle or arm and the body.",
            relatedIds = listOf("coil_springs", "struts", "twin_tube", "monotube"),
            ifItFails = "Bouncing after bumps, nose dive when braking, body sway, or oil leaking down the shock.",
            maintenance = "Check for leaks and test by pushing down on a corner. Replace in pairs.",
            quiz = LearnQuiz(
                question = "What do shock absorbers control?",
                options = listOf("Bouncing", "Fuel flow", "Oil pressure"),
                answerIndex = 0,
                explanation = "They damp the movement of the springs."
            )
        ),

        LearnPart(
            id = "struts",
            systemId = "suspension",
            groupId = "susp_components",
            name = "Struts",
            summary = "A shock absorber that also holds the wheel",
            whatIs = "A shock absorber built as a structural part of the suspension, usually surrounded by the coil spring.",
            whatItDoes = listOf(
                "Does the job of a shock absorber.",
                "Also supports the spring and helps guide the steering."
            ),
            location = "At the front, and sometimes the rear, of cars with strut suspension.",
            relatedIds = listOf("macpherson_strut", "shock_absorbers", "coil_springs", "bump_stops"),
            ifItFails = "Bouncing, clunking, uneven tire wear, and leaks. Because it is structural, it also affects steering.",
            maintenance = "Replace in pairs and get a wheel alignment afterward.",
            quiz = LearnQuiz(
                question = "How is a strut different from a plain shock absorber?",
                options = listOf(
                    "It is also a structural part of the suspension",
                    "It has no oil",
                    "It is on the engine"
                ),
                answerIndex = 0,
                explanation = "The strut holds the wheel in place as well as damping."
            )
        ),

        LearnPart(
            id = "coil_springs",
            systemId = "suspension",
            groupId = "susp_components",
            name = "Coil springs",
            summary = "Carry the car's weight",
            whatIs = "Spiral steel springs that support the weight of the car.",
            whatItDoes = listOf(
                "Absorb bumps by compressing and extending.",
                "Set the ride height."
            ),
            location = "At each wheel, around a strut or next to a shock.",
            relatedIds = listOf("coil_spring_type", "shock_absorbers", "struts", "bump_stops"),
            ifItFails = "A sagging or broken spring makes one corner low, causes noise, and wears tires.",
            maintenance = "Look for cracks or a low corner. Replace in pairs.",
            quiz = LearnQuiz(
                question = "What can a broken coil spring cause?",
                options = listOf(
                    "One corner of the car sits low",
                    "More horsepower",
                    "A cooler cabin"
                ),
                answerIndex = 0,
                explanation = "The spring no longer holds that corner up."
            )
        ),

        LearnPart(
            id = "leaf_springs",
            systemId = "suspension",
            groupId = "susp_components",
            name = "Leaf springs",
            summary = "Stacked steel strips",
            whatIs = "Curved strips of spring steel stacked together.",
            whatItDoes = listOf(
                "Support the vehicle and its load.",
                "Hold the axle in place."
            ),
            location = "At the rear of trucks, vans and some SUVs, under the body.",
            relatedIds = listOf("leaf_spring_type", "solid_axle", "bushings"),
            ifItFails = "Cracks, broken leaves, a sagging rear, or squeaks.",
            maintenance = "Do not overload the vehicle. Check for cracks and rust.",
            quiz = LearnQuiz(
                question = "What can overloading do to leaf springs?",
                options = listOf("Make them sag or crack", "Make them stronger", "Nothing"),
                answerIndex = 0,
                explanation = "Too much weight can fatigue and break them."
            )
        ),

        LearnPart(
            id = "bushings",
            systemId = "suspension",
            groupId = "susp_components",
            name = "Bushings",
            summary = "Rubber cushions at the joints",
            whatIs = "Rubber or polyurethane sleeves where suspension parts bolt to the car.",
            whatItDoes = listOf(
                "Cut noise and vibration.",
                "Let parts pivot a little while holding them in place."
            ),
            location = "At the ends of control arms, links and the stabilizer bar.",
            relatedIds = listOf("upper_control_arm", "lower_control_arm", "stabilizer_bar", "worn_bushings"),
            ifItFails = "Clunks, vibration, loose steering, and uneven tire wear. Rubber cracks and tears with age.",
            maintenance = "Have them inspected. Replace cracked ones, and get an alignment after.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What are bushings made of?",
                options = listOf("Rubber or polyurethane", "Glass", "Paper"),
                answerIndex = 0,
                explanation = "Soft material cushions the joints and reduces noise."
            )
        ),

        LearnPart(
            id = "stabilizer_bar",
            systemId = "suspension",
            groupId = "susp_components",
            name = "Stabilizer bar",
            summary = "Reduces body roll in corners",
            whatIs = "A steel bar, also called an anti-roll or sway bar, linking the left and right sides of the suspension.",
            whatItDoes = listOf(
                "Twists to resist the car leaning in a turn.",
                "Keeps the car flatter and more stable."
            ),
            location = "Across the front, and sometimes the rear, behind the wheels.",
            relatedIds = listOf("stabilizer_links", "bushings", "excessive_body_roll"),
            ifItFails = "More lean in corners, and clunks from worn bushings or links.",
            maintenance = "Check the bushings and links for wear.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What does the stabilizer bar reduce?",
                options = listOf("Body roll in turns", "Engine noise", "Fuel use"),
                answerIndex = 0,
                explanation = "It keeps the car from leaning too much while cornering."
            )
        ),

        LearnPart(
            id = "stabilizer_links",
            systemId = "suspension",
            groupId = "susp_components",
            name = "Stabilizer links",
            summary = "Connect the bar to the suspension",
            whatIs = "Short rods with a joint at each end that connect the stabilizer bar to the suspension.",
            whatItDoes = listOf(
                "Pass the bar's twisting force to the wheel.",
                "Allow the suspension to move."
            ),
            location = "Between the stabilizer bar and the strut or control arm at each wheel.",
            relatedIds = listOf("stabilizer_bar", "bushings", "clunking_sounds"),
            ifItFails = "A rattle or clunk over small bumps and in turns. One of the most common suspension noises.",
            maintenance = "Cheap and fairly easy to replace. Do it as soon as they are loose.",
            quiz = LearnQuiz(
                question = "What do worn stabilizer links often cause?",
                options = listOf(
                    "Rattling over bumps",
                    "Engine overheating",
                    "A dead battery"
                ),
                answerIndex = 0,
                explanation = "Loose joints in the links knock over small bumps."
            )
        ),

        LearnPart(
            id = "bump_stops",
            systemId = "suspension",
            groupId = "susp_components",
            name = "Bump stops",
            summary = "Soft limits for suspension travel",
            whatIs = "Rubber or foam blocks that stop the suspension from hitting metal on metal.",
            whatItDoes = listOf(
                "Cushion the end of the suspension's travel.",
                "Protect the shock and spring from a hard hit."
            ),
            location = "Around the strut or shock rod, or on the axle or frame.",
            relatedIds = listOf("struts", "shock_absorbers", "coil_springs"),
            ifItFails = "A crunching or banging when the suspension bottoms out. Crumbled stops should be replaced.",
            maintenance = "Look at them when other suspension work is done.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What do bump stops prevent?",
                options = listOf(
                    "Metal hitting metal at the end of travel",
                    "Rust",
                    "Low fuel"
                ),
                answerIndex = 0,
                explanation = "They cushion the last bit of suspension movement."
            )
        ),

        // ---------- Shock absorber types ----------
        LearnPart(
            id = "twin_tube",
            systemId = "suspension",
            groupId = "susp_shocks",
            name = "Twin-tube shocks",
            summary = "An inner and an outer tube",
            whatIs = "A shock with an inner tube for the piston and an outer tube that stores extra oil.",
            whatItDoes = listOf(
                "Is the most common and affordable type.",
                "Gives a comfortable ride for everyday driving."
            ),
            relatedIds = listOf("monotube", "gas_charged", "shock_absorbers"),
            ifItFails = "Can fade when working hard, because the oil can heat up and foam.",
            maintenance = "Replace when leaking or worn.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "Why is twin-tube popular?",
                options = listOf(
                    "It is common and affordable",
                    "It is always the strongest",
                    "It uses no oil"
                ),
                answerIndex = 0,
                explanation = "It gives good everyday comfort at a low price."
            )
        ),

        LearnPart(
            id = "monotube",
            systemId = "suspension",
            groupId = "susp_shocks",
            name = "Monotube shocks",
            summary = "One tube, better at shedding heat",
            whatIs = "A shock with a single tube. A separate floating piston keeps gas apart from the oil.",
            whatItDoes = listOf(
                "Cools better because the oil touches the outer tube.",
                "Responds quickly, which suits sporty driving and heavy use."
            ),
            relatedIds = listOf("twin_tube", "gas_charged", "shock_absorbers"),
            ifItFails = "A dent in the tube can ruin it, and it can feel stiffer than a twin-tube.",
            maintenance = "Replace when leaking or worn.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What is a strength of a monotube shock?",
                options = listOf(
                    "It sheds heat well",
                    "It has two tubes",
                    "It needs no gas or oil"
                ),
                answerIndex = 0,
                explanation = "The oil is close to the outer wall, so heat escapes easily."
            )
        ),

        LearnPart(
            id = "gas_charged",
            systemId = "suspension",
            groupId = "susp_shocks",
            name = "Gas-charged shocks",
            summary = "Nitrogen gas keeps the oil from foaming",
            whatIs = "A shock that holds pressurized gas, usually nitrogen, along with the oil.",
            whatItDoes = listOf(
                "Keeps the oil from foaming when the shock works hard.",
                "Gives steadier damping and less fade."
            ),
            relatedIds = listOf("monotube", "twin_tube", "hydraulic_shock"),
            ifItFails = "Loses pressure over time, then bounces or feels soft.",
            maintenance = "Replace when leaking or when the car bounces.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "Which gas is normally used in gas-charged shocks?",
                options = listOf("Nitrogen", "Oxygen", "Fuel vapor"),
                answerIndex = 0,
                explanation = "Nitrogen is stable and does not react with the oil."
            )
        ),

        LearnPart(
            id = "hydraulic_shock",
            systemId = "suspension",
            groupId = "susp_shocks",
            name = "Hydraulic shocks",
            summary = "The traditional oil-only shock",
            whatIs = "A shock that relies only on oil forced through small passages to resist movement.",
            whatItDoes = listOf(
                "Is simple and gives a soft, comfortable ride.",
                "Is less able to cope with heavy, repeated bumps."
            ),
            relatedIds = listOf("gas_charged", "twin_tube"),
            ifItFails = "Oil can foam on rough roads, so damping fades.",
            maintenance = "Replace when leaking or worn.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What does a plain hydraulic shock rely on?",
                options = listOf("Oil", "Electricity", "Air only"),
                answerIndex = 0,
                explanation = "Oil forced through small holes slows the movement."
            )
        ),

        LearnPart(
            id = "remote_reservoir",
            systemId = "suspension",
            groupId = "susp_shocks",
            name = "Remote reservoir shocks",
            summary = "A shock with an extra canister",
            whatIs = "A shock with a separate canister, connected by a hose, that holds extra oil and gas.",
            whatItDoes = listOf(
                "Holds more oil, so it stays cooler.",
                "Is used for off-road, racing and heavy-duty work."
            ),
            relatedIds = listOf("monotube", "adjustable_dampers"),
            ifItFails = "Leaking hoses or canisters mean the damper loses its performance.",
            maintenance = "Check the hose and fittings. Service it as the maker advises.",
            level = "Advanced",
            quiz = LearnQuiz(
                question = "Why add a remote reservoir?",
                options = listOf(
                    "More oil capacity and better cooling",
                    "To save weight",
                    "To make the engine louder"
                ),
                answerIndex = 0,
                explanation = "Extra oil volume keeps the shock from overheating."
            )
        ),

        LearnPart(
            id = "adjustable_dampers",
            systemId = "suspension",
            groupId = "susp_shocks",
            name = "Adjustable dampers",
            summary = "Stiffness you can change",
            whatIs = "Shocks whose firmness can be changed, either by hand with a dial or electronically by the car.",
            whatItDoes = listOf(
                "Let you pick a comfort or sport feel.",
                "Electronic types adjust automatically as you drive."
            ),
            relatedIds = listOf("remote_reservoir", "position_sensitive"),
            ifItFails = "An electronic fault can leave the damper stuck in one setting and may show a warning light.",
            maintenance = "Replacements are costly, so follow the service schedule.",
            level = "Advanced",
            quiz = LearnQuiz(
                question = "What can adjustable dampers change?",
                options = listOf("Their firmness", "The engine size", "The tire color"),
                answerIndex = 0,
                explanation = "You can choose softer or firmer damping."
            )
        ),

        LearnPart(
            id = "position_sensitive",
            systemId = "suspension",
            groupId = "susp_shocks",
            name = "Position-sensitive damping",
            summary = "Soft in the middle, firm at the ends",
            whatIs = "A damper that changes its firmness depending on how far the shock is compressed or extended.",
            whatItDoes = listOf(
                "Stays soft for small bumps, so the ride is comfortable.",
                "Gets firmer near the limit of travel to control big movements."
            ),
            relatedIds = listOf("adjustable_dampers", "monotube"),
            ifItFails = "It can feel too soft or too harsh if worn.",
            maintenance = "Replace when leaking or worn.",
            level = "Advanced",
            quiz = LearnQuiz(
                question = "When does a position-sensitive damper get firmer?",
                options = listOf(
                    "Near the ends of its travel",
                    "Only when parked",
                    "Only on a smooth road"
                ),
                answerIndex = 0,
                explanation = "It resists big movements more strongly."
            )
        )
    )
}