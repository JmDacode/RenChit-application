package com.example.renchityourstartupautoguide.model

object FuelExhaustData {

    val groups = listOf(
        LearnGroup(
            id = "fuel_system",
            systemId = "fuel_exhaust",
            title = "Fuel system",
            intro = "Stores the fuel and delivers it to the engine at the right pressure."
        ),
        LearnGroup(
            id = "exhaust_system",
            systemId = "fuel_exhaust",
            title = "Exhaust system",
            intro = "Carries burnt gas away from the engine, cleans it, and keeps the noise down."
        ),
        LearnGroup(
            id = "fuel_exhaust_topics",
            systemId = "fuel_exhaust",
            title = "Topics",
            intro = "How the pieces work together, and what the symptoms mean."
        )
    )

    val parts = listOf(

        // ---------- Fuel system ----------
        LearnPart(
            id = "fuel_tank",
            systemId = "fuel_exhaust",
            groupId = "fuel_system",
            name = "Fuel tank",
            summary = "Stores the fuel",
            whatIs = "The container that stores the vehicle's fuel.",
            whatItDoes = listOf(
                "Holds the fuel the engine uses.",
                "Has a filler neck and a cap that seals it."
            ),
            location = "Usually at the rear of the car, under or behind the rear seat.",
            relatedIds = listOf("fuel_pump", "fuel_filter", "fuel_lines"),
            ifItFails = "Leaks, a fuel smell, or dirty fuel can make the engine run badly.",
            maintenance = "Keep the cap tight, and avoid running the tank nearly empty.",
            quiz = LearnQuiz(
                question = "What is the fuel tank for?",
                options = listOf("Storing fuel", "Cooling the engine", "Making spark"),
                answerIndex = 0,
                explanation = "It stores the fuel until the engine needs it."
            )
        ),

        LearnPart(
            id = "fuel_pump",
            systemId = "fuel_exhaust",
            groupId = "fuel_system",
            name = "Fuel pump",
            summary = "Moves fuel toward the engine",
            whatIs = "A pump that moves fuel from the tank toward the engine's fuel system.",
            whatItDoes = listOf(
                "Pushes fuel along the fuel line.",
                "Keeps up the pressure the engine needs."
            ),
            location = "Usually inside the fuel tank.",
            relatedIds = listOf("fuel_tank", "fuel_filter", "fuel_rail", "fuel_pressure_regulator"),
            ifItFails = "A whining noise, hard starting, losing power under load, or the engine stalling.",
            maintenance = "It is not a routine service. A clogged fuel filter makes it work harder.",
            quiz = LearnQuiz(
                question = "What does the fuel pump move?",
                options = listOf("Fuel", "Coolant", "Engine oil"),
                answerIndex = 0,
                explanation = "It moves fuel from the tank toward the engine."
            )
        ),

        LearnPart(
            id = "fuel_filter",
            systemId = "fuel_exhaust",
            groupId = "fuel_system",
            name = "Fuel filter",
            summary = "Catches dirt in the fuel",
            whatIs = "A filter that removes dirt from the fuel. In diesel systems, it may also separate water from the fuel.",
            whatItDoes = listOf(
                "Protects the injectors from dirt.",
                "In diesels, catches water in the fuel."
            ),
            location = "Along the fuel line, or inside the tank on some cars.",
            relatedIds = listOf("fuel_pump", "fuel_injectors", "fuel_tank"),
            ifItFails = "A clogged filter causes hesitation, rough running, and hard starting.",
            maintenance = "Replace it at the interval in your manual. Diesel filters often also need water drained.",
            quiz = LearnQuiz(
                question = "What does a fuel filter protect?",
                options = listOf("The injectors", "The tires", "The brakes"),
                answerIndex = 0,
                explanation = "It stops dirt in the fuel from reaching the injectors."
            )
        ),

        LearnPart(
            id = "fuel_lines",
            systemId = "fuel_exhaust",
            groupId = "fuel_system",
            name = "Fuel lines",
            summary = "The pipes that carry fuel",
            whatIs = "Steel pipes and flexible hoses that carry fuel from the tank to the engine.",
            whatItDoes = listOf(
                "Carry fuel under pressure along the underside of the car.",
                "Use flexible sections where parts move."
            ),
            location = "Under the car, from the fuel tank to the engine bay.",
            relatedIds = listOf("fuel_tank", "fuel_pump", "fuel_filter", "fuel_rail"),
            ifItFails = "Rust or cracks cause fuel leaks. A fuel smell or drips under the car is a fire hazard.",
            maintenance = "Have them inspected for rust, cracks and wet spots, especially on older cars. Fix any leak right away.",
            whyItMatters = "A fuel leak near a hot exhaust can start a fire.",
            quiz = LearnQuiz(
                question = "What should you do if you smell fuel and see drips under the car?",
                options = listOf(
                    "Do not drive, and have it checked",
                    "Ignore it",
                    "Keep topping up the tank"
                ),
                answerIndex = 0,
                explanation = "A fuel leak is a fire risk."
            )
        ),

        LearnPart(
            id = "fuel_rail",
            systemId = "fuel_exhaust",
            groupId = "fuel_system",
            name = "Fuel rail",
            summary = "Feeds fuel to the injectors",
            whatIs = "A pipe that spreads pressurized fuel to the injectors in many fuel-injection systems.",
            whatItDoes = listOf(
                "Holds fuel under pressure.",
                "Delivers it to each injector."
            ),
            location = "On the intake manifold or cylinder head, over the injectors.",
            relatedIds = listOf("fuel_injectors", "fuel_pump", "fuel_pressure_regulator", "common_rail"),
            ifItFails = "Fuel leaks are a fire risk. A fuel smell near the engine needs checking right away.",
            maintenance = "It is not a routine service.",
            quiz = LearnQuiz(
                question = "What does the fuel rail feed?",
                options = listOf("The injectors", "The radiator", "The battery"),
                answerIndex = 0,
                explanation = "It shares pressurized fuel among the injectors."
            )
        ),

        LearnPart(
            id = "fuel_injectors",
            systemId = "fuel_exhaust",
            groupId = "fuel_system",
            name = "Fuel injectors",
            summary = "Spray the fuel in",
            whatIs = "Valves that spray a controlled amount of fuel into the intake or the combustion chamber, depending on the injection design.",
            whatItDoes = listOf(
                "Spray the right amount of fuel at the right moment.",
                "Turn the fuel into a fine mist so it burns well."
            ),
            location = "In the intake manifold or in the cylinder head, depending on the engine.",
            relatedIds = listOf("fuel_rail", "fuel_filter", "intake_manifold", "gas_vs_diesel_delivery"),
            ifItFails = "A rough idle, misfires, poor fuel economy, or hard starting.",
            maintenance = "Clean fuel and a fresh fuel filter help protect them.",
            quiz = LearnQuiz(
                question = "What do fuel injectors do?",
                options = listOf("Spray fuel into the engine", "Pump oil", "Cool the exhaust"),
                answerIndex = 0,
                explanation = "They spray a controlled amount of fuel at the right time."
            )
        ),

        LearnPart(
            id = "hp_fuel_pump",
            systemId = "fuel_exhaust",
            groupId = "fuel_system",
            name = "High-pressure fuel pump",
            summary = "Raises fuel pressure for injection",
            whatIs = "A pump that raises fuel to the very high pressure needed by high-pressure injection systems, especially common-rail diesels.",
            whatItDoes = listOf(
                "Takes fuel from the tank pump and boosts its pressure.",
                "Lets the injectors spray a very fine mist."
            ),
            location = "On or near the engine.",
            relatedIds = listOf("fuel_pump", "fuel_rail", "fuel_injectors", "diesel_engine", "common_rail"),
            ifItFails = "Hard starting, loss of power, or a warning light.",
            maintenance = "Use good-quality fuel and follow the fuel filter schedule.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "Which engines most often use a high-pressure fuel pump?",
                options = listOf("Common-rail diesels", "Bicycles", "Electric motors"),
                answerIndex = 0,
                explanation = "Common-rail diesels need very high fuel pressure."
            )
        ),

        LearnPart(
            id = "fuel_pressure_regulator",
            systemId = "fuel_exhaust",
            groupId = "fuel_system",
            name = "Fuel pressure regulator",
            summary = "Keeps fuel pressure steady",
            whatIs = "A valve that keeps the fuel pressure at the injectors within the right range.",
            whatItDoes = listOf(
                "Sends extra fuel back to the tank, on systems with a return line.",
                "Keeps spray consistent whether you are idling or accelerating."
            ),
            location = "On the fuel rail, or inside the fuel tank on many newer cars.",
            relatedIds = listOf("fuel_rail", "fuel_pump", "fuel_injectors"),
            ifItFails = "Too much pressure: black smoke and poor economy. Too little: hesitation, hard starting and weak power.",
            maintenance = "A mechanic checks fuel pressure with a gauge. It is not a routine service.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What does the fuel pressure regulator keep steady?",
                options = listOf("Fuel pressure", "Tire pressure", "Oil level"),
                answerIndex = 0,
                explanation = "It holds the pressure the injectors need."
            )
        ),

        // ---------- Exhaust system ----------
        LearnPart(
            id = "exhaust_manifold",
            systemId = "fuel_exhaust",
            groupId = "exhaust_system",
            name = "Exhaust manifold",
            summary = "Collects the exhaust from the cylinders",
            whatIs = "A set of pipes bolted to the cylinder head that gathers exhaust from every cylinder into one outlet.",
            whatItDoes = listOf(
                "Carries very hot gas away from the exhaust valves.",
                "Feeds the turbocharger on turbo engines."
            ),
            location = "On the side of the cylinder head, opposite the intake manifold.",
            relatedIds = listOf("cylinder_head", "exhaust_valve", "turbocharger", "downpipe"),
            ifItFails = "Cracks or a bad gasket cause a ticking noise on a cold engine, exhaust smell, and sometimes a check engine light.",
            maintenance = "Not a routine service. Have a leak repaired, because exhaust gas can reach the cabin.",
            quiz = LearnQuiz(
                question = "What does the exhaust manifold do?",
                options = listOf(
                    "Gathers exhaust from all cylinders",
                    "Spreads air to the cylinders",
                    "Stores fuel"
                ),
                answerIndex = 0,
                explanation = "It combines the exhaust of each cylinder into one pipe."
            )
        ),

        LearnPart(
            id = "downpipe",
            systemId = "fuel_exhaust",
            groupId = "exhaust_system",
            name = "Downpipe",
            summary = "The pipe after the turbo",
            whatIs = "The pipe that carries exhaust from the turbocharger, or the manifold, down to the catalytic converter.",
            whatItDoes = listOf(
                "Sends hot exhaust gas along the underside of the car.",
                "On turbo cars, its shape can affect how freely the turbo spins."
            ),
            location = "Under the car, just behind the engine.",
            relatedIds = listOf("turbocharger", "exhaust_manifold", "catalytic_converter"),
            ifItFails = "Leaks cause noise and a smell, and can confuse the oxygen sensors.",
            maintenance = "Have leaks fixed. Removing the catalytic converter or fitting a downpipe without one is illegal in many places.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What does the downpipe lead to?",
                options = listOf("The catalytic converter", "The radiator", "The fuel tank"),
                answerIndex = 0,
                explanation = "The exhaust goes from the downpipe to the catalytic converter."
            )
        ),

        LearnPart(
            id = "catalytic_converter",
            systemId = "fuel_exhaust",
            groupId = "exhaust_system",
            name = "Catalytic converter",
            summary = "Cleans the exhaust gas",
            whatIs = "A canister with a honeycomb coated in precious metals that changes harmful gases into less harmful ones.",
            whatItDoes = listOf(
                "Converts carbon monoxide, unburnt fuel and nitrogen oxides into carbon dioxide, water and nitrogen.",
                "Needs to be hot to work well."
            ),
            location = "Under the car, between the engine and the muffler.",
            relatedIds = listOf("oxygen_sensors", "downpipe", "emissions_control", "smoke_colors"),
            ifItFails = "A rotten-egg smell, a rattle from inside, weak power, or a check engine light. A blocked one can choke the engine.",
            maintenance = "Fix misfires, oil burning or coolant leaks quickly, since they can destroy it. Never remove it.",
            whyItMatters = "It is one of the most expensive exhaust parts, and a common theft target.",
            quiz = LearnQuiz(
                question = "What smell can point to a failing catalytic converter?",
                options = listOf("Rotten eggs", "Fresh bread", "Coffee"),
                answerIndex = 0,
                explanation = "A struggling converter can let sulfur smells through."
            )
        ),

        LearnPart(
            id = "dpf",
            systemId = "fuel_exhaust",
            groupId = "exhaust_system",
            name = "Diesel particulate filter (DPF)",
            summary = "Traps soot from diesel exhaust",
            whatIs = "A filter in the exhaust of many modern diesel cars that catches soot. It is only fitted where the car's design needs one.",
            whatItDoes = listOf(
                "Traps soot particles.",
                "Burns them off from time to time in a process called regeneration."
            ),
            location = "Under the car, near or combined with the catalytic converter.",
            relatedIds = listOf("diesel_engine", "catalytic_converter", "emissions_control"),
            ifItFails = "A warning light, reduced power, or higher fuel use. Many short trips can stop it from regenerating and clog it.",
            maintenance = "Drive at steady speed for a good stretch now and then, if your manual advises it, so it can clean itself.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What does a DPF catch?",
                options = listOf("Soot", "Coolant", "Brake dust"),
                answerIndex = 0,
                explanation = "It traps particles from diesel exhaust."
            )
        ),

        LearnPart(
            id = "egr_system",
            systemId = "fuel_exhaust",
            groupId = "exhaust_system",
            name = "EGR system",
            summary = "Sends some exhaust back in",
            whatIs = "Exhaust Gas Recirculation. A valve and pipes that send a small amount of exhaust back into the intake.",
            whatItDoes = listOf(
                "Lowers combustion temperature.",
                "Reduces nitrogen oxide emissions."
            ),
            location = "Between the exhaust and the intake, on or near the engine.",
            relatedIds = listOf("intake_manifold", "exhaust_manifold", "emissions_control"),
            ifItFails = "A valve stuck open or closed causes a rough idle, hesitation, knocking or a check engine light. Carbon buildup is the usual cause.",
            maintenance = "A mechanic can clean or replace the valve. Good fuel and regular servicing slow buildup.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What does the EGR system recirculate?",
                options = listOf("Exhaust gas", "Coolant", "Engine oil"),
                answerIndex = 0,
                explanation = "It sends a little exhaust back to the intake to cool combustion."
            )
        ),

        LearnPart(
            id = "oxygen_sensors",
            systemId = "fuel_exhaust",
            groupId = "exhaust_system",
            name = "Oxygen sensors",
            summary = "Sniff the exhaust",
            whatIs = "Sensors in the exhaust that measure how much oxygen is left in the gas.",
            whatItDoes = listOf(
                "Tell the computer if the mix is too rich or too lean.",
                "The one after the catalytic converter checks that the converter is working."
            ),
            location = "In the exhaust, before and after the catalytic converter, where fitted.",
            relatedIds = listOf("ecu", "catalytic_converter", "fuel_injectors", "sensors"),
            ifItFails = "A check engine light, higher fuel use, or a rough idle.",
            maintenance = "They wear out slowly. Replace when faulty, or at the interval your manual lists.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What do oxygen sensors help the computer adjust?",
                options = listOf("The fuel mixture", "The tire pressure", "The wiper speed"),
                answerIndex = 0,
                explanation = "They report if the mix is rich or lean."
            )
        ),

        LearnPart(
            id = "muffler",
            systemId = "fuel_exhaust",
            groupId = "exhaust_system",
            name = "Muffler",
            summary = "Quiets the engine",
            whatIs = "A chambered box in the exhaust that reduces engine noise.",
            whatItDoes = listOf(
                "Lets sound waves bounce and cancel inside.",
                "Keeps the car within legal noise limits."
            ),
            location = "Near the rear of the car, under the body.",
            relatedIds = listOf("resonator", "exhaust_tips", "exhaust_leaks"),
            ifItFails = "A loud rumble or rattle, or a hole from rust. Short trips leave moisture inside and speed up rusting.",
            maintenance = "Look for rust and hangers that are loose. A drive of 20 minutes or more now and then helps dry the system out.",
            quiz = LearnQuiz(
                question = "What does a muffler do?",
                options = listOf("Reduces exhaust noise", "Cools the oil", "Stores fuel"),
                answerIndex = 0,
                explanation = "Its chambers cut down engine noise."
            )
        ),

        LearnPart(
            id = "resonator",
            systemId = "fuel_exhaust",
            groupId = "exhaust_system",
            name = "Resonator",
            summary = "Takes out droning sounds",
            whatIs = "A small chamber in the exhaust that cancels particular sound frequencies.",
            whatItDoes = listOf(
                "Reduces the drone you can hear at certain speeds.",
                "Works together with the muffler."
            ),
            location = "In the exhaust pipe, between the catalytic converter and the muffler, on cars that have one.",
            relatedIds = listOf("muffler", "catalytic_converter"),
            ifItFails = "Rust holes or damage make the exhaust louder.",
            maintenance = "Inspect it along with the rest of the exhaust.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What sound does a resonator mainly reduce?",
                options = listOf("Droning at certain speeds", "Tire noise", "Wind noise"),
                answerIndex = 0,
                explanation = "It cancels specific exhaust frequencies."
            )
        ),

        LearnPart(
            id = "exhaust_tips",
            systemId = "fuel_exhaust",
            groupId = "exhaust_system",
            name = "Exhaust tips",
            summary = "The visible end of the exhaust",
            whatIs = "The finishing piece at the very end of the exhaust pipe.",
            whatItDoes = listOf(
                "Is mostly for looks.",
                "Shows signs of how the engine is running through its soot and color."
            ),
            location = "At the rear bumper.",
            relatedIds = listOf("muffler", "smoke_colors"),
            ifItFails = "Loose or rusted tips rattle or fall off.",
            maintenance = "Never run the engine in a closed garage, because exhaust contains carbon monoxide, which you cannot smell and which is deadly.",
            whyItMatters = "Carbon monoxide is odorless, so a closed space can be dangerous even if you smell nothing.",
            quiz = LearnQuiz(
                question = "Why should you never run a car in a closed garage?",
                options = listOf(
                    "Exhaust contains deadly carbon monoxide",
                    "It wastes fuel",
                    "It dries out the tires"
                ),
                answerIndex = 0,
                explanation = "Carbon monoxide builds up quickly and cannot be smelled."
            )
        ),

        // ---------- Topics ----------
        LearnPart(
            id = "gas_vs_diesel_delivery",
            systemId = "fuel_exhaust",
            groupId = "fuel_exhaust_topics",
            name = "Gasoline vs. diesel fuel delivery",
            summary = "Two ways to get fuel burning",
            whatIs = "Gasoline and diesel engines both inject fuel, but they light it differently.",
            whatItDoes = listOf(
                "Gasoline: fuel mixes with air, and a spark plug ignites it.",
                "Diesel: the engine compresses air until it is very hot, then fuel is injected and ignites by itself.",
                "Diesel injection uses much higher pressure."
            ),
            relatedIds = listOf("gasoline_engine", "diesel_engine", "fuel_injectors", "common_rail"),
            whyItMatters = "It is why diesels have no spark plugs, and why they need stronger parts and cleaner fuel.",
            quiz = LearnQuiz(
                question = "How does a diesel engine ignite its fuel?",
                options = listOf(
                    "Heat from compressed air",
                    "A spark plug",
                    "A battery"
                ),
                answerIndex = 0,
                explanation = "Compression makes the air hot enough to light the fuel."
            )
        ),

        LearnPart(
            id = "common_rail",
            systemId = "fuel_exhaust",
            groupId = "fuel_exhaust_topics",
            name = "Common-rail diesel injection",
            summary = "One shared high-pressure line",
            whatIs = "A diesel system where a high-pressure pump fills a shared rail, and electronic injectors take fuel from it.",
            whatItDoes = listOf(
                "Keeps fuel at very high pressure all the time.",
                "Lets the computer fire each injector several times per cycle.",
                "Makes diesels quieter, cleaner and more efficient."
            ),
            relatedIds = listOf("hp_fuel_pump", "fuel_rail", "fuel_injectors", "diesel_engine"),
            ifItFails = "Dirty fuel and water are the main enemies. They damage the pump and injectors, which are costly to replace.",
            maintenance = "Use good fuel and replace the fuel filter on time.",
            level = "Advanced",
            quiz = LearnQuiz(
                question = "What is the main enemy of a common-rail system?",
                options = listOf("Dirty fuel and water", "Clean air", "Cold weather only"),
                answerIndex = 0,
                explanation = "The tiny parts and high pressure are easily damaged by contamination."
            )
        ),

        LearnPart(
            id = "turbo_operation",
            systemId = "fuel_exhaust",
            groupId = "fuel_exhaust_topics",
            name = "Turbocharger operation",
            summary = "How exhaust makes boost",
            whatIs = "A short walk through how a turbo adds power.",
            whatItDoes = listOf(
                "Exhaust gas spins the turbine.",
                "The turbine spins the compressor on the same shaft.",
                "The compressor pushes extra air in, so more fuel can burn.",
                "The wastegate limits boost, and the intercooler cools the air."
            ),
            relatedIds = listOf("turbocharger", "turbine_wheel", "compressor_wheel", "wastegate", "intercooler"),
            maintenance = "Use the oil grade your manual lists and change it on time. The turbo spins extremely fast.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What does the compressor wheel push into the engine?",
                options = listOf("Extra air", "Coolant", "Oil"),
                answerIndex = 0,
                explanation = "More air allows more fuel to burn, which gives more power."
            )
        ),

        LearnPart(
            id = "exhaust_flow",
            systemId = "fuel_exhaust",
            groupId = "fuel_exhaust_topics",
            name = "Exhaust gas flow",
            summary = "The path the exhaust takes",
            whatIs = "The route burnt gas follows from the engine to the air.",
            whatItDoes = listOf(
                "Cylinder, through the exhaust valve.",
                "Exhaust manifold, then the turbo if fitted.",
                "Downpipe, catalytic converter, and DPF if fitted.",
                "Resonator, muffler, and out of the tailpipe."
            ),
            relatedIds = listOf("exhaust_manifold", "catalytic_converter", "muffler", "exhaust_leaks"),
            whyItMatters = "A blockage anywhere along the path can choke the engine, and a leak lets gas out early.",
            quiz = LearnQuiz(
                question = "Which part does exhaust reach first after the cylinders?",
                options = listOf("The exhaust manifold", "The muffler", "The tailpipe"),
                answerIndex = 0,
                explanation = "The manifold collects it from every cylinder."
            )
        ),

        LearnPart(
            id = "emissions_control",
            systemId = "fuel_exhaust",
            groupId = "fuel_exhaust_topics",
            name = "Emissions control",
            summary = "Keeping the exhaust cleaner",
            whatIs = "The parts and strategies that cut harmful gases and particles.",
            whatItDoes = listOf(
                "Catalytic converter: cleans carbon monoxide, unburnt fuel and nitrogen oxides.",
                "EGR: cuts nitrogen oxides by cooling combustion.",
                "DPF: traps soot on diesels.",
                "Oxygen sensors: help the computer keep the mixture right."
            ),
            relatedIds = listOf("catalytic_converter", "egr_system", "dpf", "oxygen_sensors"),
            maintenance = "A check engine light can mean an emissions fault. Many places require emission tests.",
            quiz = LearnQuiz(
                question = "Which part cleans carbon monoxide in the exhaust?",
                options = listOf("The catalytic converter", "The muffler", "The fuel tank"),
                answerIndex = 0,
                explanation = "It converts harmful gases into less harmful ones."
            )
        ),

        LearnPart(
            id = "exhaust_leaks",
            systemId = "fuel_exhaust",
            groupId = "fuel_exhaust_topics",
            name = "Exhaust leaks",
            summary = "Gas escaping too early",
            whatIs = "Exhaust gas getting out before the tailpipe, through cracks, rusted holes or bad gaskets.",
            whatItDoes = listOf(
                "Signs: a ticking on a cold engine, a loud or hissing sound, a smell, or less power.",
                "Can also upset the oxygen sensors and trigger a warning light."
            ),
            relatedIds = listOf("exhaust_manifold", "muffler", "oxygen_sensors", "downpipe"),
            ifItFails = "A leak near the front of the car can let carbon monoxide into the cabin, which is dangerous.",
            maintenance = "Have it repaired soon. If you feel drowsy or get a headache while driving, open the windows and get it checked.",
            whyItMatters = "Carbon monoxide has no smell and can make you sleepy before you notice.",
            quiz = LearnQuiz(
                question = "Why is an exhaust leak dangerous?",
                options = listOf(
                    "Carbon monoxide can reach the cabin",
                    "It makes the engine colder",
                    "It fills the tank"
                ),
                answerIndex = 0,
                explanation = "Carbon monoxide is poisonous and cannot be smelled."
            )
        ),

        LearnPart(
            id = "smoke_colors",
            systemId = "fuel_exhaust",
            groupId = "fuel_exhaust_topics",
            name = "Smoke color and possible causes",
            summary = "What the smoke may be telling you",
            whatIs = "The color of exhaust smoke can hint at what is wrong.",
            whatItDoes = listOf(
                "Thin white vapor on a cold day: normal condensation that fades as the engine warms.",
                "Thick white smoke with a sweet smell: coolant burning, possibly a head gasket problem.",
                "Blue or gray smoke: oil burning, from worn rings, valve seals or a turbo seal.",
                "Black smoke: too much fuel, from a clogged air filter, bad injectors or a fuel pressure fault."
            ),
            relatedIds = listOf("head_gasket", "piston_rings", "air_filter", "fuel_injectors"),
            ifItFails = "These are clues only. They do not prove the cause, and a mechanic should confirm.",
            maintenance = "Have thick or lasting smoke checked soon.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What does blue smoke from the exhaust usually suggest?",
                options = listOf("Burning oil", "Burning coolant", "Too much air"),
                answerIndex = 0,
                explanation = "Oil getting into the combustion chamber burns with a bluish smoke."
            )
        ),

        LearnPart(
            id = "fuel_economy",
            systemId = "fuel_exhaust",
            groupId = "fuel_exhaust_topics",
            name = "Fuel economy and combustion efficiency",
            summary = "Getting more distance from the same fuel",
            whatIs = "How well the engine turns fuel into motion.",
            whatItDoes = listOf(
                "Healthy engine parts burn fuel more completely.",
                "Correct tire pressure, a clean air filter and fresh oil all help.",
                "Smooth driving, steady speeds and less weight save fuel too."
            ),
            relatedIds = listOf("air_filter", "oxygen_sensors", "fuel_injectors", "engine_oil"),
            maintenance = "Follow your service schedule, keep tires properly inflated, and avoid hard acceleration and long idling.",
            whyItMatters = "Better fuel economy saves money and reduces emissions.",
            quiz = LearnQuiz(
                question = "Which habit helps fuel economy?",
                options = listOf(
                    "Keeping tires at the right pressure",
                    "Driving with a loaded roof rack all the time",
                    "Skipping oil changes"
                ),
                answerIndex = 0,
                explanation = "Underinflated tires increase rolling resistance."
            )
        )
    )
}