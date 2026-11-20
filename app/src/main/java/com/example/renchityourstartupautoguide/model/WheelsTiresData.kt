package com.example.renchityourstartupautoguide.model

object WheelsTiresData {

    val groups = listOf(
        LearnGroup(
            id = "wheel_specs",
            systemId = "wheels",
            title = "Wheel components and specs",
            intro = "The measurements that decide whether a wheel fits your car."
        ),
        LearnGroup(
            id = "tire_anatomy",
            systemId = "wheels",
            title = "Tire anatomy",
            intro = "What a tire is made of, and what each layer does."
        ),
        LearnGroup(
            id = "tire_types",
            systemId = "wheels",
            title = "Tire types",
            intro = "Different tires for different roads and jobs."
        ),
        LearnGroup(
            id = "tire_topics",
            systemId = "wheels",
            title = "Topics",
            intro = "Reading the markings, caring for your tires, and spotting damage."
        )
    )

    val parts = listOf(

        // ---------- Wheel components and specs ----------
        LearnPart(
            id = "wheel_diameter",
            systemId = "wheels",
            groupId = "wheel_specs",
            name = "Wheel diameter",
            summary = "How big the wheel is across",
            whatIs = "The width of the wheel measured across the rim, usually in inches, such as 16 or 17.",
            whatItDoes = listOf(
                "Must match the tire's rim size exactly.",
                "A bigger wheel usually means a thinner tire, which looks sporty but rides firmer."
            ),
            relatedIds = listOf("wheel_width", "tire_size_markings", "sidewall"),
            ifItFails = "A wheel that does not suit the tire cannot be fitted safely.",
            maintenance = "If you change wheel size, keep the overall tire height close to the original so the speedometer stays accurate.",
            quiz = LearnQuiz(
                question = "What usually happens to the ride when you fit bigger wheels with thinner tires?",
                options = listOf("It gets firmer", "It gets softer", "Nothing changes"),
                answerIndex = 0,
                explanation = "Less sidewall means less cushioning."
            )
        ),

        LearnPart(
            id = "wheel_width",
            systemId = "wheels",
            groupId = "wheel_specs",
            name = "Wheel width",
            summary = "How wide the rim is",
            whatIs = "The width of the rim between its two edges, usually in inches.",
            whatItDoes = listOf(
                "Each tire size works within a range of wheel widths.",
                "Too narrow or too wide stretches or pinches the tire and hurts handling."
            ),
            relatedIds = listOf("wheel_diameter", "wheel_offset", "tire_size_markings"),
            maintenance = "Pick a tire that lists your wheel width in its approved range.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What can happen if a tire is on a wheel that is too wide or too narrow?",
                options = listOf("Poor handling and uneven wear", "Better fuel use", "Louder radio"),
                answerIndex = 0,
                explanation = "The tire cannot sit in its intended shape."
            )
        ),

        LearnPart(
            id = "wheel_offset",
            systemId = "wheels",
            groupId = "wheel_specs",
            name = "Offset",
            summary = "How far in or out the wheel sits",
            whatIs = "The distance, in millimeters, from the wheel's mounting face to the center line of the wheel. It is often marked ET.",
            whatItDoes = listOf(
                "A higher offset tucks the wheel further inside the car.",
                "A lower offset pushes it outward."
            ),
            relatedIds = listOf("wheel_width", "bolt_pattern", "wheel_bearings"),
            ifItFails = "The wrong offset can rub the fender or suspension, change handling, and put extra load on the wheel bearings.",
            maintenance = "Stay close to the factory offset unless you know the clearances.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What can the wrong offset cause?",
                options = listOf("Rubbing and extra bearing load", "A hotter engine", "Weaker brake fluid"),
                answerIndex = 0,
                explanation = "The wheel sits in the wrong position inside the wheel well."
            )
        ),

        LearnPart(
            id = "bolt_pattern",
            systemId = "wheels",
            groupId = "wheel_specs",
            name = "Bolt pattern",
            summary = "The layout of the wheel bolts",
            whatIs = "The number of bolt holes and the diameter of the circle they sit on, written like 5x114.3. Also called the PCD.",
            whatItDoes = listOf(
                "Must match your hub exactly.",
                "5x114.3 means five bolts on a circle 114.3 mm across."
            ),
            relatedIds = listOf("center_bore", "lug_nuts", "wheel_hubs"),
            ifItFails = "A wheel that almost fits, such as 5x114.3 on a 5x112 hub, can look fine and still be dangerously loose.",
            maintenance = "Check your manual or the wheel markings before buying wheels.",
            whyItMatters = "A wrong bolt pattern can cause a wheel to come off.",
            quiz = LearnQuiz(
                question = "What does 5x114.3 mean?",
                options = listOf(
                    "Five bolts on a 114.3 mm circle",
                    "Five tires of 114 mm width",
                    "A 114-volt wheel"
                ),
                answerIndex = 0,
                explanation = "It is the bolt count and the circle diameter in millimeters."
            )
        ),

        LearnPart(
            id = "center_bore",
            systemId = "wheels",
            groupId = "wheel_specs",
            name = "Center bore",
            summary = "The hole in the middle of the wheel",
            whatIs = "The large hole in the center of the wheel that fits over the hub.",
            whatItDoes = listOf(
                "Centers the wheel on the hub.",
                "If an aftermarket wheel has a larger bore, a hub-centric ring fills the gap."
            ),
            relatedIds = listOf("bolt_pattern", "wheel_hubs", "lug_nuts"),
            ifItFails = "A loose fit can cause a vibration that balancing does not fix.",
            maintenance = "Use hub rings for aftermarket wheels with a larger bore.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What does a hub ring do?",
                options = listOf(
                    "Fills the gap between a larger bore and the hub",
                    "Cools the brakes",
                    "Holds the tire pressure"
                ),
                answerIndex = 0,
                explanation = "It keeps the wheel centered on the hub."
            )
        ),

        LearnPart(
            id = "wheel_studs",
            systemId = "wheels",
            groupId = "wheel_specs",
            name = "Wheel studs",
            summary = "The threaded posts on the hub",
            whatIs = "Threaded bolts pressed into the hub that the wheel slides over. Some cars use lug bolts instead.",
            whatItDoes = listOf(
                "Hold the wheel in place with the lug nuts.",
                "Carry the load between the wheel and hub."
            ),
            location = "On the wheel hub, behind the wheel.",
            relatedIds = listOf("lug_nuts", "wheel_hubs", "bolt_pattern"),
            ifItFails = "Stripped, stretched or broken studs can let the wheel loosen. A snapped stud needs replacing right away.",
            maintenance = "Replace any damaged stud. Never over-tighten lug nuts, since that stretches the studs.",
            quiz = LearnQuiz(
                question = "What can over-tightening lug nuts do to wheel studs?",
                options = listOf("Stretch or damage them", "Strengthen them", "Nothing"),
                answerIndex = 0,
                explanation = "Too much force can weaken the threads."
            )
        ),

        LearnPart(
            id = "lug_nuts",
            systemId = "wheels",
            groupId = "wheel_specs",
            name = "Lug nuts",
            summary = "They hold the wheel on",
            whatIs = "The nuts that thread onto the wheel studs and clamp the wheel to the hub.",
            whatItDoes = listOf(
                "Keep the wheel secured as you drive.",
                "Must match the seat shape of your wheel, such as conical or flat."
            ),
            relatedIds = listOf("wheel_studs", "bolt_pattern", "center_bore"),
            ifItFails = "Loose lug nuts cause a clunk or vibration. A wheel that comes off is extremely dangerous.",
            maintenance = "Tighten in a star pattern to the torque in your manual, using a torque wrench. Re-check after about 100 km following a wheel change.",
            whyItMatters = "Impact guns can over-tighten them, so ask the shop to finish with a torque wrench.",
            quiz = LearnQuiz(
                question = "In what pattern should lug nuts be tightened?",
                options = listOf("A star pattern", "Around in a circle", "Any random order"),
                answerIndex = 0,
                explanation = "It pulls the wheel flat against the hub evenly."
            )
        ),

        LearnPart(
            id = "center_caps",
            systemId = "wheels",
            groupId = "wheel_specs",
            name = "Center caps",
            summary = "The cover in the middle of the wheel",
            whatIs = "A cap that covers the center of the wheel, often showing the car's badge.",
            whatItDoes = listOf(
                "Keeps dirt and water away from the hub.",
                "Improves the look of the wheel."
            ),
            relatedIds = listOf("wheel_hubs", "lug_nuts"),
            ifItFails = "A missing cap is mostly cosmetic, but it lets dirt in and can allow rust.",
            maintenance = "Replace missing caps. Some wheels hide the lug nuts behind them.",
            quiz = LearnQuiz(
                question = "What is the main job of a center cap?",
                options = listOf("Cover the hub and look good", "Store air", "Cool the tire"),
                answerIndex = 0,
                explanation = "It protects the hub area and finishes the look."
            )
        ),

        // ---------- Tire anatomy ----------
        LearnPart(
            id = "tread",
            systemId = "wheels",
            groupId = "tire_anatomy",
            name = "Tread",
            summary = "The part that touches the road",
            whatIs = "The patterned rubber on the outside of the tire.",
            whatItDoes = listOf(
                "Grips the road.",
                "Its grooves push water out from under the tire, to help prevent aquaplaning."
            ),
            relatedIds = listOf("tread_wear_damage", "tire_rotation", "tire_belts"),
            ifItFails = "Worn tread gives longer stopping distances, especially on wet roads.",
            maintenance = "Wear bars across the grooves show when the tread is down to 1.6 mm. Many experts suggest replacing before that, around 3 mm, for wet grip.",
            whyItMatters = "Tread depth is the biggest factor in wet braking.",
            quiz = LearnQuiz(
                question = "What do the grooves in the tread do?",
                options = listOf("Push water away", "Store fuel", "Cool the brakes"),
                answerIndex = 0,
                explanation = "They channel water out so the rubber stays in contact."
            )
        ),

        LearnPart(
            id = "sidewall",
            systemId = "wheels",
            groupId = "tire_anatomy",
            name = "Sidewall",
            summary = "The side of the tire",
            whatIs = "The side of the tire between the tread and the rim. It carries all the markings.",
            whatItDoes = listOf(
                "Flexes to absorb bumps.",
                "Gives the tire its height and carries the size markings."
            ),
            relatedIds = listOf("tire_size_markings", "bead", "carcass"),
            ifItFails = "A bulge, cut or crack in the sidewall means the tire is unsafe, and it cannot be repaired.",
            maintenance = "Look for bulges and cuts, especially after hitting a curb or pothole.",
            whyItMatters = "A bulge means the tire's internal structure has broken, and it can burst.",
            quiz = LearnQuiz(
                question = "What should you do if you find a bulge in the sidewall?",
                options = listOf("Replace the tire", "Ignore it", "Add more air"),
                answerIndex = 0,
                explanation = "The tire's internal structure has failed and it can burst."
            )
        ),

        LearnPart(
            id = "bead",
            systemId = "wheels",
            groupId = "tire_anatomy",
            name = "Bead",
            summary = "The ring that seals against the rim",
            whatIs = "A ring of steel wire wrapped in rubber at the inner edge of the tire.",
            whatItDoes = listOf(
                "Holds the tire firmly on the rim.",
                "Forms an airtight seal with the rim."
            ),
            relatedIds = listOf("sidewall", "inner_liner", "tire_pressure"),
            ifItFails = "A damaged bead or dirty rim can leak air slowly.",
            maintenance = "A tire shop cleans the rim and checks the bead when fitting tires.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What does the bead do?",
                options = listOf("Seals the tire to the rim", "Cools the tire", "Shows the speed"),
                answerIndex = 0,
                explanation = "It grips the rim and keeps the air in."
            )
        ),

        LearnPart(
            id = "inner_liner",
            systemId = "wheels",
            groupId = "tire_anatomy",
            name = "Inner liner",
            summary = "The airtight layer inside",
            whatIs = "A layer of airtight rubber on the inside of a tubeless tire.",
            whatItDoes = listOf(
                "Does the job of an inner tube.",
                "Keeps air from seeping through the tire."
            ),
            relatedIds = listOf("bead", "tire_pressure", "carcass"),
            ifItFails = "Damage to the liner can cause slow air loss that is hard to find.",
            maintenance = "A shop can repair a small puncture in the tread area properly from the inside. Plugs alone are not a proper long-term fix.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What does the inner liner replace in a tubeless tire?",
                options = listOf("The inner tube", "The tread", "The valve cap"),
                answerIndex = 0,
                explanation = "It holds the air so no tube is needed."
            )
        ),

        LearnPart(
            id = "tire_belts",
            systemId = "wheels",
            groupId = "tire_anatomy",
            name = "Belts",
            summary = "Steel layers under the tread",
            whatIs = "Layers of steel cord, and sometimes fabric, that sit under the tread.",
            whatItDoes = listOf(
                "Keep the tread flat on the road.",
                "Resist punctures and add strength."
            ),
            relatedIds = listOf("tread", "carcass", "sidewall"),
            ifItFails = "A broken belt causes a bulge in the tread, a wobble, or vibration that grows with speed.",
            maintenance = "If you see wire showing, or feel a wobble that grows with speed, stop using the tire.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What do steel belts do under the tread?",
                options = listOf("Keep it flat and resist punctures", "Heat the tire", "Store air"),
                answerIndex = 0,
                explanation = "They add stiffness and strength under the tread."
            )
        ),

        LearnPart(
            id = "carcass",
            systemId = "wheels",
            groupId = "tire_anatomy",
            name = "Carcass",
            summary = "The body of the tire",
            whatIs = "The layers of fabric cord, called plies, that form the tire's shape and carry its load.",
            whatItDoes = listOf(
                "Holds the air pressure.",
                "Runs from bead to bead, giving the tire its strength."
            ),
            relatedIds = listOf("sidewall", "tire_belts", "bead"),
            ifItFails = "Impact damage inside can hide behind a normal-looking tire, then show up as a bulge.",
            maintenance = "Have a tire checked after any hard impact, even if it looks fine.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What forms the tire's basic shape?",
                options = listOf("The carcass", "The valve cap", "The hubcap"),
                answerIndex = 0,
                explanation = "Layers of cord make up its structure."
            )
        ),

        LearnPart(
            id = "tire_pressure",
            systemId = "wheels",
            groupId = "tire_anatomy",
            name = "Tire pressure",
            summary = "The air that carries your car",
            whatIs = "The air pressure inside the tire, shown in psi, kPa or bar.",
            whatItDoes = listOf(
                "Holds up the weight of the car.",
                "Affects grip, braking, comfort, fuel economy and tire life."
            ),
            location = "The correct pressure is on a sticker in the driver's door jamb or in your manual. The number on the tire sidewall is the maximum, not what to use.",
            relatedIds = listOf("uneven_tire_wear", "inner_liner", "bead", "fuel_economy"),
            ifItFails = "Too low: heat, wear on both edges, and a blowout risk. Too high: a harsh ride and wear in the center.",
            maintenance = "Check monthly, when the tires are cold, and before long trips. Do not forget the spare.",
            whyItMatters = "It is the cheapest and most useful tire check you can do.",
            quiz = LearnQuiz(
                question = "Where do you find the right tire pressure for your car?",
                options = listOf(
                    "The door jamb sticker or manual",
                    "The maximum number on the sidewall",
                    "Any gas station sign"
                ),
                answerIndex = 0,
                explanation = "The car maker sets it for your vehicle, not the tire maker."
            )
        ),

        // ---------- Tire types ----------
        LearnPart(
            id = "ht_tires",
            systemId = "wheels",
            groupId = "tire_types",
            name = "Highway Terrain (HT)",
            summary = "Quiet and comfortable on pavement",
            whatIs = "Tires made for paved roads, common on SUVs and pickups used mostly on highways.",
            whatItDoes = listOf(
                "Give a quiet, smooth ride and good fuel economy.",
                "Last a long time."
            ),
            relatedIds = listOf("at_tires", "mt_tires", "tread"),
            ifItFails = "They struggle in deep mud, loose sand and rough off-road.",
            maintenance = "Rotate and check pressure on schedule.",
            quiz = LearnQuiz(
                question = "Where do HT tires work best?",
                options = listOf("Paved roads", "Deep mud", "Rock crawling"),
                answerIndex = 0,
                explanation = "They are designed for comfort and efficiency on the road."
            )
        ),

        LearnPart(
            id = "at_tires",
            systemId = "wheels",
            groupId = "tire_types",
            name = "All-Terrain (AT)",
            summary = "A mix of road and off-road",
            whatIs = "Tires with a more aggressive tread that still work well on the road.",
            whatItDoes = listOf(
                "Handle gravel, dirt and light mud.",
                "Are a bit noisier and use slightly more fuel than HT tires."
            ),
            relatedIds = listOf("ht_tires", "mt_tires", "tread"),
            maintenance = "A good all-round choice if you drive both on and off pavement.",
            quiz = LearnQuiz(
                question = "What is an AT tire good for?",
                options = listOf("Both road and light off-road use", "Racing only", "Parking only"),
                answerIndex = 0,
                explanation = "It balances on-road manners with off-road grip."
            )
        ),

        LearnPart(
            id = "mt_tires",
            systemId = "wheels",
            groupId = "tire_types",
            name = "Mud-Terrain (MT)",
            summary = "Built for mud and rock",
            whatIs = "Tires with big, deep tread blocks and strong sidewalls for tough off-road use.",
            whatItDoes = listOf(
                "Grip very well in mud and over rocks.",
                "Are noisy on the road, wear faster and brake worse on wet pavement."
            ),
            relatedIds = listOf("at_tires", "ht_tires"),
            ifItFails = "On the road they are loud, use more fuel, and are less stable at speed.",
            maintenance = "Choose them only if you really go off-road often.",
            quiz = LearnQuiz(
                question = "What is a downside of MT tires on the road?",
                options = listOf("Noise and faster wear", "Better braking", "Lower price"),
                answerIndex = 0,
                explanation = "Deep tread blocks are loud and wear quickly on pavement."
            )
        ),

        LearnPart(
            id = "performance_tires",
            systemId = "wheels",
            groupId = "tire_types",
            name = "Performance tires",
            summary = "Maximum grip for sporty driving",
            whatIs = "Tires with a soft, sticky rubber compound and stiff sidewalls.",
            whatItDoes = listOf(
                "Give strong grip and sharp steering.",
                "Wear faster, and some types lose grip in cold weather."
            ),
            relatedIds = listOf("speed_rating", "tread"),
            ifItFails = "Summer-only types can be unsafe in cold or on snow.",
            maintenance = "Check the tire's season rating and your climate before buying.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What is a trade-off of performance tires?",
                options = listOf("Faster wear", "Slower steering", "No grip"),
                answerIndex = 0,
                explanation = "The soft rubber that grips so well also wears quickly."
            )
        ),

        LearnPart(
            id = "run_flat",
            systemId = "wheels",
            groupId = "tire_types",
            name = "Run-flat tires",
            summary = "They keep going after a puncture",
            whatIs = "Tires with strengthened sidewalls that can carry the car for a limited distance with no air.",
            whatItDoes = listOf(
                "Let you drive to safety, typically up to about 80 km at around 80 km/h.",
                "Need a tire pressure warning system, because you may not notice a flat."
            ),
            relatedIds = listOf("sidewall", "tire_pressure"),
            ifItFails = "Ride is often firmer, and many cannot be repaired after running flat.",
            maintenance = "Follow the maker's limits for distance and speed after a puncture.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What can a run-flat tire do after a puncture?",
                options = listOf(
                    "Drive a limited distance to safety",
                    "Run forever",
                    "Fix itself"
                ),
                answerIndex = 0,
                explanation = "The strong sidewall carries the car for a short distance."
            )
        ),

        // ---------- Topics ----------
        LearnPart(
            id = "tire_size_markings",
            systemId = "wheels",
            groupId = "tire_topics",
            name = "Tire size markings",
            summary = "How to read 205/55R16 91V",
            whatIs = "The code on the sidewall that tells you the tire's size and ratings.",
            whatItDoes = listOf(
                "205: width in millimeters.",
                "55: sidewall height as a percentage of the width.",
                "R: radial construction.",
                "16: rim diameter in inches.",
                "91V: load index and speed rating.",
                "A four-digit DOT code shows week and year of making, such as 2423 for week 24 of 2023."
            ),
            relatedIds = listOf("load_index", "speed_rating", "wheel_diameter", "sidewall"),
            maintenance = "Use the size listed in your manual or door jamb sticker. Many experts suggest replacing tires that are 6 to 10 years old, even with good tread.",
            quiz = LearnQuiz(
                question = "In 205/55R16, what does 16 mean?",
                options = listOf("Rim diameter in inches", "Tire width in mm", "Speed rating"),
                answerIndex = 0,
                explanation = "It is the wheel size the tire fits, in inches."
            )
        ),

        LearnPart(
            id = "load_index",
            systemId = "wheels",
            groupId = "tire_topics",
            name = "Load index",
            summary = "How much weight a tire can carry",
            whatIs = "A number on the sidewall that matches to the most weight one tire can carry.",
            whatItDoes = listOf(
                "For example, 91 means 615 kg per tire.",
                "Four tires together must carry the car's maximum weight."
            ),
            relatedIds = listOf("tire_size_markings", "speed_rating"),
            ifItFails = "A tire with too low a load index can overheat and fail under load.",
            maintenance = "Never choose a lower load index than your manual lists, especially if you carry heavy loads or tow.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What should you do about the load index when buying tires?",
                options = listOf(
                    "Choose the same or higher than the manual lists",
                    "Choose a lower one",
                    "Ignore it"
                ),
                answerIndex = 0,
                explanation = "A lower rating can make a tire fail under load."
            )
        ),

        LearnPart(
            id = "speed_rating",
            systemId = "wheels",
            groupId = "tire_topics",
            name = "Speed rating",
            summary = "The top speed a tire is built for",
            whatIs = "A letter on the sidewall showing the highest speed the tire is tested for.",
            whatItDoes = listOf(
                "S is 180 km/h, T is 190, H is 210, V is 240, W is 270 and Y is 300.",
                "Also hints at how the tire handles and how fast it wears."
            ),
            relatedIds = listOf("tire_size_markings", "load_index", "performance_tires"),
            maintenance = "Match or exceed your car's rating, and follow local speed limits. It is not a target.",
            level = "Intermediate",
            quiz = LearnQuiz(
                question = "What does a speed rating of H roughly mean?",
                options = listOf("Tested up to about 210 km/h", "Heavy duty", "Highway only"),
                answerIndex = 0,
                explanation = "The letter H matches a maximum tested speed of 210 km/h."
            )
        ),

        LearnPart(
            id = "tire_rotation",
            systemId = "wheels",
            groupId = "tire_topics",
            name = "Tire rotation",
            summary = "Swap positions to wear evenly",
            whatIs = "Moving the tires to different positions on the car on a regular schedule.",
            whatItDoes = listOf(
                "Front tires usually wear differently from the rear.",
                "Rotating evens it out so the set lasts longer.",
                "A common interval is every 8,000 to 10,000 km, but follow your manual."
            ),
            relatedIds = listOf("wheel_balancing", "camber", "toe", "uneven_tire_wear"),
            maintenance = "Directional tires and different front and rear sizes limit the patterns you can use. A shop will know which. Check the pressure when you rotate.",
            quiz = LearnQuiz(
                question = "Why rotate tires?",
                options = listOf("To wear them evenly", "To save fuel only", "To cool the brakes"),
                answerIndex = 0,
                explanation = "Front and rear tires wear differently, and rotation evens it out."
            )
        ),

        LearnPart(
            id = "tread_wear_damage",
            systemId = "wheels",
            groupId = "tire_topics",
            name = "Tread wear and damage",
            summary = "When it is time to replace a tire",
            whatIs = "How to spot worn or damaged tires before they let you down.",
            whatItDoes = listOf(
                "Look at the wear bars in the grooves. If the tread is level with them, replace the tire.",
                "Look for bulges, cuts, cracks, nails, and uneven wear.",
                "Cracks on the sidewall from age are called dry rot."
            ),
            relatedIds = listOf("tread", "sidewall", "uneven_tire_wear", "tire_pressure"),
            ifItFails = "Bald or damaged tires can lose grip, puncture, or burst.",
            maintenance = "Check all four tires, and the spare, once a month. Uneven wear is a sign to check pressure and alignment.",
            whyItMatters = "Tires are the only part of your car touching the road.",
            quiz = LearnQuiz(
                question = "What do wear bars in the tread groove show?",
                options = listOf(
                    "When the tread is too worn",
                    "The right tire pressure",
                    "The date of making"
                ),
                answerIndex = 0,
                explanation = "When the tread is level with them, the tire needs replacing."
            )
        )
    )
}