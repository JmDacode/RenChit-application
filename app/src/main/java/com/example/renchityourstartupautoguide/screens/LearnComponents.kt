package com.example.renchityourstartupautoguide.screens

import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AcUnit
import androidx.compose.material.icons.outlined.Adjust
import androidx.compose.material.icons.outlined.Album
import androidx.compose.material.icons.outlined.Bolt
import androidx.compose.material.icons.outlined.Build
import androidx.compose.material.icons.outlined.LocalGasStation
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.outlined.Shield
import androidx.compose.material.icons.outlined.Speed
import androidx.compose.material.icons.outlined.Thermostat
import androidx.compose.material.icons.outlined.Tune
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import com.example.renchityourstartupautoguide.R
import com.example.renchityourstartupautoguide.ui.theme.OxideBronze
import androidx.compose.material.icons.outlined.Air
import androidx.compose.material.icons.outlined.Autorenew
import androidx.compose.material.icons.outlined.Cached
import androidx.compose.material.icons.outlined.Compress
import androidx.compose.material.icons.outlined.LocalFireDepartment
import androidx.compose.material.icons.outlined.Looks4
import androidx.compose.material.icons.outlined.LooksTwo
import androidx.compose.material.icons.outlined.Straighten
import androidx.compose.material.icons.outlined.Sync
import androidx.compose.material.icons.outlined.WaterDrop
import androidx.compose.material.icons.outlined.Sensors
import androidx.compose.material.icons.outlined.Cyclone
import androidx.compose.material.icons.outlined.Hvac
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.Opacity
import androidx.compose.material.icons.outlined.Toys
import androidx.compose.material.icons.outlined.AllInclusive
import androidx.compose.material.icons.outlined.ArrowDownward
import androidx.compose.material.icons.outlined.ArrowUpward
import androidx.compose.material.icons.outlined.KeyboardDoubleArrowDown
import androidx.compose.material.icons.outlined.KeyboardDoubleArrowUp
import androidx.compose.material.icons.outlined.Terrain
import androidx.compose.material.icons.outlined.ToggleOn
import androidx.compose.material.icons.outlined.Balance
import androidx.compose.material.icons.outlined.FlashOn
import androidx.compose.material.icons.outlined.Memory
import androidx.compose.material.icons.outlined.BubbleChart
import androidx.compose.material.icons.outlined.Campaign
import androidx.compose.material.icons.outlined.DeveloperBoard
import androidx.compose.material.icons.outlined.HourglassBottom
import androidx.compose.material.icons.outlined.Hub
import androidx.compose.material.icons.outlined.LocalParking
import androidx.compose.material.icons.outlined.Science
import androidx.compose.material.icons.outlined.Waves
import androidx.compose.material.icons.outlined.Block
import androidx.compose.material.icons.outlined.Checklist
import androidx.compose.material.icons.outlined.DeviceThermostat
import androidx.compose.material.icons.outlined.Plumbing
import androidx.compose.material.icons.outlined.ReportProblem
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.Whatshot
import androidx.compose.material.icons.outlined.AccountTree
import androidx.compose.material.icons.outlined.BatteryAlert
import androidx.compose.material.icons.outlined.BatteryChargingFull
import androidx.compose.material.icons.outlined.BatteryStd
import androidx.compose.material.icons.outlined.Cable
import androidx.compose.material.icons.outlined.ElectricBolt
import androidx.compose.material.icons.outlined.ElectricalServices
import androidx.compose.material.icons.outlined.Equalizer
import androidx.compose.material.icons.outlined.Power
import androidx.compose.material.icons.outlined.Timeline
import androidx.compose.material.icons.outlined.VpnKey
import androidx.compose.material.icons.outlined.Cloud
import androidx.compose.material.icons.outlined.Computer
import androidx.compose.material.icons.outlined.EmojiObjects
import androidx.compose.material.icons.outlined.ErrorOutline
import androidx.compose.material.icons.outlined.LinkOff
import androidx.compose.material.icons.outlined.Lightbulb
import androidx.compose.material.icons.outlined.NightsStay
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.PowerOff
import androidx.compose.material.icons.outlined.PowerSettingsNew
import androidx.compose.material.icons.outlined.SettingsInputHdmi
import androidx.compose.material.icons.outlined.StopCircle
import androidx.compose.material.icons.outlined.SwapHoriz
import androidx.compose.material.icons.outlined.SyncProblem
import androidx.compose.material.icons.outlined.Visibility
import androidx.compose.material.icons.outlined.Warning
import androidx.compose.material.icons.outlined.Storage
import androidx.compose.material.icons.outlined.SwapVert
import androidx.compose.material.icons.outlined.VerticalAlignBottom
import androidx.compose.material.icons.outlined.BrokenImage
import androidx.compose.material.icons.outlined.CompareArrows
import androidx.compose.material.icons.outlined.DonutLarge
import androidx.compose.material.icons.outlined.GraphicEq
import androidx.compose.material.icons.outlined.PrecisionManufacturing
import androidx.compose.material.icons.outlined.ScreenRotation
import androidx.compose.material.icons.outlined.Vibration
import androidx.compose.material.icons.outlined.ArrowRightAlt
import androidx.compose.material.icons.outlined.CloudOff
import androidx.compose.material.icons.outlined.Compare
import androidx.compose.material.icons.outlined.Eco
import androidx.compose.material.icons.outlined.LinearScale
import androidx.compose.material.icons.outlined.Loop
import androidx.compose.material.icons.outlined.Palette
import androidx.compose.material.icons.outlined.RotateRight
import androidx.compose.material.icons.outlined.Savings
import androidx.compose.material.icons.outlined.SettingsInputComponent
import androidx.compose.material.icons.outlined.FilterAlt
import androidx.compose.material.icons.outlined.Spa
import androidx.compose.material.icons.outlined.Apps
import androidx.compose.material.icons.outlined.Commute
import androidx.compose.material.icons.outlined.Height
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Landscape
import androidx.compose.material.icons.outlined.Layers
import androidx.compose.material.icons.outlined.RadioButtonUnchecked
import androidx.compose.material.icons.outlined.Reorder
import androidx.compose.material.icons.outlined.Scale
import androidx.compose.material.icons.outlined.SettingsEthernet
import androidx.compose.material.icons.outlined.VerticalSplit
import androidx.compose.material.icons.outlined.Anchor
import androidx.compose.material.icons.outlined.DirectionsCar
import androidx.compose.material.icons.outlined.DragHandle
import androidx.compose.material.icons.outlined.Flip
import androidx.compose.material.icons.outlined.GridView
import androidx.compose.material.icons.outlined.HorizontalRule
import androidx.compose.material.icons.outlined.Inventory2
import androidx.compose.material.icons.outlined.MeetingRoom
import androidx.compose.material.icons.outlined.NotificationImportant
import androidx.compose.material.icons.outlined.Security
import androidx.compose.material.icons.outlined.ViewColumn
import androidx.compose.material.icons.outlined.Window

fun learnSystemIcon(systemId: String): ImageVector = when (systemId) {
    "engine" -> Icons.Outlined.Settings
    "transmission" -> Icons.Outlined.Tune
    "brakes" -> Icons.Outlined.Album
    "cooling" -> Icons.Outlined.Thermostat
    "electrical" -> Icons.Outlined.Bolt
    "suspension" -> Icons.Outlined.Speed
    "fuel_exhaust" -> Icons.Outlined.LocalGasStation
    "aircon" -> Icons.Outlined.AcUnit
    "wheels" -> Icons.Outlined.Adjust
    "body_safety" -> Icons.Outlined.Shield
    else -> Icons.Outlined.Build
}


fun learnPartIcon(partId: String): Int? = when (partId) {
    "engine_block" -> R.drawable.ic_lp_engine_block
    "cylinder_head" -> R.drawable.ic_lp_cylinder_head
    "head_gasket" -> R.drawable.ic_lp_head_gasket
    "cylinder" -> R.drawable.ic_lp_cylinder
    "cylinder_liner" -> R.drawable.ic_lp_cylinder_liner
    "piston" -> R.drawable.ic_lp_piston
    "piston_rings" -> R.drawable.ic_lp_piston_rings
    "connecting_rod" -> R.drawable.ic_lp_connecting_rod
    "crankshaft" -> R.drawable.ic_lp_crankshaft
    "camshaft" -> R.drawable.ic_lp_camshaft
    "intake_valve" -> R.drawable.ic_lp_intake_valve
    "exhaust_valve" -> R.drawable.ic_lp_exhaust_valve
    "valve_spring" -> R.drawable.ic_lp_valve_spring
    "rocker_arm" -> R.drawable.ic_lp_rocker_arm
    "lifter" -> R.drawable.ic_lp_lifter
    "engine_bearings" -> R.drawable.ic_lp_engine_bearings
    "flywheel" -> R.drawable.ic_lp_flywheel
    "flexplate" -> R.drawable.ic_lp_flexplate
    "oil_pan" -> R.drawable.ic_lp_oil_pan
    "manual_transmission" -> R.drawable.ic_lp_manual_transmission
    "automatic_transmission" -> R.drawable.ic_lp_automatic_transmission
    "cvt" -> R.drawable.ic_lp_cvt
    "dct" -> R.drawable.ic_lp_dct
    "amt" -> R.drawable.ic_lp_amt
    "clutch" -> R.drawable.ic_lp_clutch
    "clutch_disc" -> R.drawable.ic_lp_clutch_disc
    "pressure_plate" -> R.drawable.ic_lp_pressure_plate
    "release_bearing" -> R.drawable.ic_lp_release_bearing
    "input_shaft" -> R.drawable.ic_lp_input_shaft
    "output_shaft" -> R.drawable.ic_lp_output_shaft
    "transmission_gears" -> R.drawable.ic_lp_transmission_gears
    "synchronizers" -> R.drawable.ic_lp_synchronizers
    "shift_forks" -> R.drawable.ic_lp_shift_forks
    "inline_engine" -> R.drawable.ic_lp_inline_engine
    "v_engine" -> R.drawable.ic_lp_v_engine
    "boxer_engine" -> R.drawable.ic_lp_boxer_engine
    "rotary_engine" -> R.drawable.ic_lp_rotary_engine
    "timing_belt" -> R.drawable.ic_lp_timing_belt
    "timing_chain" -> R.drawable.ic_lp_timing_chain
    "timing_gears" -> R.drawable.ic_lp_timing_gears
    "camshaft_sprocket" -> R.drawable.ic_lp_camshaft_sprocket
    "crankshaft_sprocket" -> R.drawable.ic_lp_crankshaft_sprocket
    "timing_tensioner" -> R.drawable.ic_lp_timing_tensioner
    "timing_guides" -> R.drawable.ic_lp_timing_guides
    "air_filter" -> R.drawable.ic_lp_air_filter
    "intake_manifold" -> R.drawable.ic_lp_intake_manifold
    "throttle_body" -> R.drawable.ic_lp_throttle_body
    "fuel_pump" -> R.drawable.ic_lp_fuel_pump
    "fuel_filter" -> R.drawable.ic_lp_fuel_filter
    "fuel_rail" -> R.drawable.ic_lp_fuel_rail
    "fuel_injectors" -> R.drawable.ic_lp_fuel_injectors
    "hp_fuel_pump" -> R.drawable.ic_lp_hp_fuel_pump
    "turbine_wheel" -> R.drawable.ic_lp_turbine_wheel
    "compressor_wheel" -> R.drawable.ic_lp_compressor_wheel
    "wastegate" -> R.drawable.ic_lp_wastegate
    "boost_pipes" -> R.drawable.ic_lp_boost_pipes
    "oil_pump" -> R.drawable.ic_lp_oil_pump
    "oil_filter" -> R.drawable.ic_lp_oil_filter
    "oil_pickup_tube" -> R.drawable.ic_lp_oil_pickup_tube
    "oil_strainer" -> R.drawable.ic_lp_oil_strainer
    "oil_galleries" -> R.drawable.ic_lp_oil_galleries
    "oil_cooler" -> R.drawable.ic_lp_oil_cooler
    "radiator" -> R.drawable.ic_lp_radiator
    "water_pump" -> R.drawable.ic_lp_water_pump
    "radiator_hoses" -> R.drawable.ic_lp_radiator_hoses
    "water_jackets" -> R.drawable.ic_lp_water_jackets
    "torque_converter" -> R.drawable.ic_lp_torque_converter
    "planetary_gearset" -> R.drawable.ic_lp_planetary_gearset
    "clutch_packs" -> R.drawable.ic_lp_clutch_packs
    "valve_body" -> R.drawable.ic_lp_valve_body
    "transmission_oil_pump" -> R.drawable.ic_lp_trans_oil_pump
    "driveshaft" -> R.drawable.ic_lp_driveshaft
    "universal_joints" -> R.drawable.ic_lp_universal_joints
    "cv_joints" -> R.drawable.ic_lp_cv_joints
    "differential" -> R.drawable.ic_lp_differential
    "axles" -> R.drawable.ic_lp_axles
    "wheel_hubs" -> R.drawable.ic_lp_wheel_hubs
    "wheel_bearings" -> R.drawable.ic_lp_wheel_bearings
    "transfer_case" -> R.drawable.ic_lp_transfer_case
    "locking_differentials" -> R.drawable.ic_lp_locking_differentials
    "disc_brakes" -> R.drawable.ic_lp_disc_brakes
    "drum_brakes" -> R.drawable.ic_lp_drum_brakes
    "abs" -> R.drawable.ic_lp_abs
    "brake_rotor" -> R.drawable.ic_lp_brake_rotor
    "brake_pads" -> R.drawable.ic_lp_brake_pads
    "brake_caliper" -> R.drawable.ic_lp_brake_caliper
    "caliper_piston" -> R.drawable.ic_lp_caliper_piston
    "brake_hose" -> R.drawable.ic_lp_brake_hose
    "brake_drum" -> R.drawable.ic_lp_brake_drum
    "brake_shoes" -> R.drawable.ic_lp_brake_shoes
    "wheel_cylinder" -> R.drawable.ic_lp_wheel_cylinder
    "return_springs" -> R.drawable.ic_lp_return_springs
    "brake_pedal" -> R.drawable.ic_lp_brake_pedal
    "brake_booster" -> R.drawable.ic_lp_brake_booster
    "master_cylinder" -> R.drawable.ic_lp_master_cylinder
    "brake_lines" -> R.drawable.ic_lp_brake_lines
    "proportioning_valve" -> R.drawable.ic_lp_proportioning_valve
    "wheel_speed_sensors" -> R.drawable.ic_lp_wheel_speed_sensors
    "mechanical_fan" -> R.drawable.ic_lp_mechanical_fan
    "electric_fan" -> R.drawable.ic_lp_electric_fan
    "resistance" -> R.drawable.ic_lp_resistance
    "ground_connections" -> R.drawable.ic_lp_ground_connections
    "lead_acid_battery" -> R.drawable.ic_lp_lead_acid_battery
    "starter_motor" -> R.drawable.ic_lp_starter_motor
    "starter_solenoid" -> R.drawable.ic_lp_starter_solenoid
    "starter_relay" -> R.drawable.ic_lp_starter_relay
    "alternator" -> R.drawable.ic_lp_alternator
    "drive_belt" -> R.drawable.ic_lp_drive_belt
    "fuses" -> R.drawable.ic_lp_fuses
    "relays" -> R.drawable.ic_lp_starter_relay
    "wiring_harnesses" -> R.drawable.ic_lp_wiring_harnesses
    "headlights" -> R.drawable.ic_lp_headlights
    "double_wishbone" -> R.drawable.ic_lp_double_wishbone
    "macpherson_strut" -> R.drawable.ic_lp_macpherson_strut
    "multi_link" -> R.drawable.ic_lp_multi_link
    "solid_axle" -> R.drawable.ic_lp_solid_axle
    "leaf_spring_type", "leaf_springs" -> R.drawable.ic_lp_leaf_spring
    "coil_spring_type", "coil_springs" -> R.drawable.ic_lp_coil_spring
    "torsion_bar" -> R.drawable.ic_lp_torsion_bar
    "upper_control_arm" -> R.drawable.ic_lp_upper_control_arm
    "lower_control_arm" -> R.drawable.ic_lp_lower_control_arm
    "ball_joints" -> R.drawable.ic_lp_ball_joints
    "shock_absorbers" -> R.drawable.ic_lp_shock_absorbers
    "bushings" -> R.drawable.ic_lp_bushings
    "stabilizer_bar" -> R.drawable.ic_lp_stabilizer_bar
    "stabilizer_links" -> R.drawable.ic_lp_stabilizer_links
    "twin_tube" -> R.drawable.ic_lp_twin_tube
    "monotube" -> R.drawable.ic_lp_monotube
    "steering_wheel" -> R.drawable.ic_lp_steering_wheel
    "steering_column" -> R.drawable.ic_lp_steering_column
    "steering_rack" -> R.drawable.ic_lp_steering_rack
    "pinion_gear" -> R.drawable.ic_lp_pinion_gear
    "tie_rods" -> R.drawable.ic_lp_tie_rods
    "steering_knuckles" -> R.drawable.ic_lp_steering_knuckles
    "power_steering_pump" -> R.drawable.ic_lp_power_steering_pump
    "camber" -> R.drawable.ic_lp_camber
    "caster" -> R.drawable.ic_lp_caster
    "toe" -> R.drawable.ic_lp_toe
    "thrust_angle" -> R.drawable.ic_lp_thrust_angle
    "wheel_balancing" -> R.drawable.ic_lp_wheel_balancing
    "fuel_lines" -> R.drawable.ic_lp_fuel_lines
    "exhaust_manifold" -> R.drawable.ic_lp_exhaust_manifold
    "downpipe" -> R.drawable.ic_lp_downpipe
    "catalytic_converter" -> R.drawable.ic_lp_catalytic_converter
    "dpf" -> R.drawable.ic_lp_dpf
    "muffler" -> R.drawable.ic_lp_muffler
    "resonator" -> R.drawable.ic_lp_resonator
    "exhaust_tips" -> R.drawable.ic_lp_exhaust_tips
    "ac_compressor" -> R.drawable.ic_lp_ac_compressor
    "condenser" -> R.drawable.ic_lp_condenser
    "receiver_drier" -> R.drawable.ic_lp_receiver_drier
    "expansion_valve" -> R.drawable.ic_lp_expansion_valve
    "evaporator" -> R.drawable.ic_lp_evaporator
    "blower_motor" -> R.drawable.ic_lp_blower_motor
    "refrigerant_lines" -> R.drawable.ic_lp_refrigerant_lines
    "wheel_studs" -> R.drawable.ic_lp_wheel_studs
    "lug_nuts" -> R.drawable.ic_lp_lug_nuts
    "tread" -> R.drawable.ic_lp_tread
    "sidewall" -> R.drawable.ic_lp_sidewall
    "bead" -> R.drawable.ic_lp_bead
    "ladder_frame" -> R.drawable.ic_lp_ladder_frame
    "hood" -> R.drawable.ic_lp_hood
    "fenders" -> R.drawable.ic_lp_fenders
    "bumpers" -> R.drawable.ic_lp_bumpers
    "seat_belts" -> R.drawable.ic_lp_seat_belts
    "airbags" -> R.drawable.ic_lp_airbags
    "crumple_zones" -> R.drawable.ic_lp_crumple_zones
    else -> null
}
fun learnPartVector(partId: String): ImageVector? = when (partId) {
    "engine_displacement" -> Icons.Outlined.Straighten
    "compression_ratio" -> Icons.Outlined.Compress
    "horsepower" -> Icons.Outlined.Speed
    "torque" -> Icons.Outlined.Autorenew
    "combustion" -> Icons.Outlined.LocalFireDepartment
    "four_stroke_cycle" -> Icons.Outlined.Sync
    "gasoline_engine" -> Icons.Outlined.LocalGasStation
    "diesel_engine" -> Icons.Outlined.WaterDrop
    "naturally_aspirated" -> Icons.Outlined.Air
    "turbocharged_engine" -> Icons.Outlined.Cached
    "supercharged_engine" -> Icons.Outlined.Bolt
    "two_stroke" -> Icons.Outlined.LooksTwo
    "four_stroke_engine" -> Icons.Outlined.Looks4
    "fuel_tank" -> Icons.Outlined.LocalGasStation
    "maf_sensor" -> Icons.Outlined.Air
    "map_sensor" -> Icons.Outlined.Sensors
    "turbocharger" -> Icons.Outlined.Cyclone
    "vgt" -> Icons.Outlined.Tune
    "intercooler" -> Icons.Outlined.AcUnit
    "supercharger" -> Icons.Outlined.Bolt
    "engine_oil" -> Icons.Outlined.Opacity
    "oil_pressure_sensor" -> Icons.Outlined.Speed
    "radiator_cap" -> Icons.Outlined.Lock
    "thermostat" -> Icons.Outlined.Thermostat
    "cooling_fan" -> Icons.Outlined.Toys
    "coolant_reservoir" -> Icons.Outlined.WaterDrop
    "heater_core" -> Icons.Outlined.Hvac
    "coolant_temp_sensor" -> Icons.Outlined.Sensors
    "solenoids" -> Icons.Outlined.Bolt
    "transmission_fluid" -> Icons.Outlined.Opacity
    "transmission_fluid_cooler" -> Icons.Outlined.AcUnit
    "front_differential" -> Icons.Outlined.KeyboardDoubleArrowUp
    "rear_differential" -> Icons.Outlined.KeyboardDoubleArrowDown
    "front_driveshaft" -> Icons.Outlined.ArrowUpward
    "rear_driveshaft" -> Icons.Outlined.ArrowDownward
    "drive_modes" -> Icons.Outlined.Terrain
    "part_time_4wd" -> Icons.Outlined.ToggleOn
    "full_time_4wd" -> Icons.Outlined.AllInclusive
    "hydraulic_braking" -> Icons.Outlined.Opacity
    "electronic_braking" -> Icons.Outlined.Memory
    "ebd" -> Icons.Outlined.Balance
    "brake_assist" -> Icons.Outlined.FlashOn
    "dust_shield" -> Icons.Outlined.Shield
    "drum_adjuster" -> Icons.Outlined.Adjust
    "brake_fluid_reservoir" -> Icons.Outlined.WaterDrop
    "abs_module" -> Icons.Outlined.DeveloperBoard
    "hydraulic_control_unit" -> Icons.Outlined.Hub
    "epb_motor" -> Icons.Outlined.LocalParking
    "brake_pad_wear" -> Icons.Outlined.HourglassBottom
    "warped_rotors" -> Icons.Outlined.Waves
    "brake_fluid" -> Icons.Outlined.Science
    "brake_bleeding" -> Icons.Outlined.Air
    "brake_fade" -> Icons.Outlined.LocalFireDepartment
    "spongy_pedal" -> Icons.Outlined.BubbleChart
    "brake_noise" -> Icons.Outlined.Campaign
    "liquid_cooled" -> Icons.Outlined.WaterDrop
    "air_cooled" -> Icons.Outlined.Air
    "pressurized_cooling" -> Icons.Outlined.Compress
    "coolant_circulation" -> Icons.Outlined.Sync
    "thermostat_regulation" -> Icons.Outlined.DeviceThermostat
    "why_overheat" -> Icons.Outlined.Whatshot
    "coolant_specs" -> Icons.Outlined.Checklist
    "coolant_leaks" -> Icons.Outlined.Plumbing
    "radiator_blockage" -> Icons.Outlined.Block
    "water_pump_failure" -> Icons.Outlined.ReportProblem
    "coolant_inspection" -> Icons.Outlined.Search
    "voltage" -> Icons.Outlined.Bolt
    "current" -> Icons.Outlined.Timeline
    "electrical_power" -> Icons.Outlined.ElectricBolt
    "series_parallel" -> Icons.Outlined.AccountTree
    "agm_battery" -> Icons.Outlined.BatteryChargingFull
    "battery_terminals" -> Icons.Outlined.Power
    "battery_sensors" -> Icons.Outlined.BatteryAlert
    "battery_capacity_cca" -> Icons.Outlined.BatteryStd
    "ignition_switch" -> Icons.Outlined.VpnKey
    "starter_wiring" -> Icons.Outlined.Cable
    "voltage_regulator" -> Icons.Outlined.Equalizer
    "charging_cables" -> Icons.Outlined.ElectricalServices
    "connectors" -> Icons.Outlined.SettingsInputHdmi
    "switches" -> Icons.Outlined.PowerSettingsNew
    "sensors" -> Icons.Outlined.Visibility
    "ecu" -> Icons.Outlined.Computer
    "tail_lights" -> Icons.Outlined.Lightbulb
    "brake_lights" -> Icons.Outlined.StopCircle
    "turn_signals" -> Icons.Outlined.SwapHoriz
    "fog_lights" -> Icons.Outlined.Cloud
    "interior_lights" -> Icons.Outlined.EmojiObjects
    "horn" -> Icons.Outlined.Notifications
    "dead_battery" -> Icons.Outlined.PowerOff
    "charging_failure" -> Icons.Outlined.ErrorOutline
    "blown_fuse" -> Icons.Outlined.Warning
    "loose_connections" -> Icons.Outlined.LinkOff
    "parasitic_drain" -> Icons.Outlined.NightsStay
    "faulty_alternator" -> Icons.Outlined.SyncProblem
    "struts" -> Icons.Outlined.Straighten
    "bump_stops" -> Icons.Outlined.VerticalAlignBottom
    "gas_charged" -> Icons.Outlined.Air
    "hydraulic_shock" -> Icons.Outlined.Opacity
    "remote_reservoir" -> Icons.Outlined.Storage
    "adjustable_dampers" -> Icons.Outlined.Tune
    "position_sensitive" -> Icons.Outlined.SwapVert
    "eps_motor" -> Icons.Outlined.PrecisionManufacturing
    "clunking_sounds" -> Icons.Outlined.GraphicEq
    "steering_vibration" -> Icons.Outlined.Vibration
    "uneven_tire_wear" -> Icons.Outlined.DonutLarge
    "excessive_body_roll" -> Icons.Outlined.ScreenRotation
    "vehicle_pulling" -> Icons.Outlined.CompareArrows
    "worn_bushings" -> Icons.Outlined.BrokenImage
    "shock_absorber_leaks" -> Icons.Outlined.WaterDrop
    "fuel_pressure_regulator" -> Icons.Outlined.SettingsInputComponent
    "egr_system" -> Icons.Outlined.Loop
    "oxygen_sensors" -> Icons.Outlined.Sensors
    "gas_vs_diesel_delivery" -> Icons.Outlined.Compare
    "common_rail" -> Icons.Outlined.LinearScale
    "turbo_operation" -> Icons.Outlined.RotateRight
    "exhaust_flow" -> Icons.Outlined.ArrowRightAlt
    "emissions_control" -> Icons.Outlined.Eco
    "exhaust_leaks" -> Icons.Outlined.CloudOff
    "smoke_colors" -> Icons.Outlined.Palette
    "fuel_economy" -> Icons.Outlined.Savings
    "cabin_air_filter" -> Icons.Outlined.FilterAlt
    "pressure_sensors" -> Icons.Outlined.Speed
    "how_ac_works" -> Icons.Outlined.AcUnit
    "refrigeration_cycle" -> Icons.Outlined.Autorenew
    "compressor_operation" -> Icons.Outlined.ToggleOn
    "cooling_performance" -> Icons.Outlined.DeviceThermostat
    "weak_airflow" -> Icons.Outlined.Air
    "unusual_ac_smells" -> Icons.Outlined.Spa
    "refrigerant_leaks" -> Icons.Outlined.WaterDrop
    "wheel_diameter" -> Icons.Outlined.Height
    "wheel_width" -> Icons.Outlined.SettingsEthernet
    "wheel_offset" -> Icons.Outlined.VerticalSplit
    "bolt_pattern" -> Icons.Outlined.Apps
    "center_bore" -> Icons.Outlined.RadioButtonUnchecked
    "center_caps" -> Icons.Outlined.Album
    "inner_liner" -> Icons.Outlined.Layers
    "tire_belts" -> Icons.Outlined.Reorder
    "carcass" -> Icons.Outlined.DonutLarge
    "tire_pressure" -> Icons.Outlined.Compress
    "ht_tires" -> Icons.Outlined.Commute
    "at_tires" -> Icons.Outlined.Terrain
    "mt_tires" -> Icons.Outlined.Landscape
    "performance_tires" -> Icons.Outlined.Speed
    "run_flat" -> Icons.Outlined.Shield
    "tire_size_markings" -> Icons.Outlined.Info
    "load_index" -> Icons.Outlined.Scale
    "speed_rating" -> Icons.Outlined.Speed
    "tire_rotation" -> Icons.Outlined.RotateRight
    "tread_wear_damage" -> Icons.Outlined.ReportProblem
    "unibody" -> Icons.Outlined.DirectionsCar
    "crossmembers" -> Icons.Outlined.HorizontalRule
    "frame_rails" -> Icons.Outlined.DragHandle
    "subframes" -> Icons.Outlined.GridView
    "body_mounts" -> Icons.Outlined.Anchor
    "doors" -> Icons.Outlined.MeetingRoom
    "tailgate" -> Icons.Outlined.Inventory2
    "glass_windows" -> Icons.Outlined.Window
    "mirrors" -> Icons.Outlined.Flip
    "pretensioners" -> Icons.Outlined.FlashOn
    "reinforced_pillars" -> Icons.Outlined.ViewColumn
    "esc" -> Icons.Outlined.Security
    "tcs" -> Icons.Outlined.SyncProblem
    "parking_sensors" -> Icons.Outlined.LocalParking
    "collision_warning" -> Icons.Outlined.NotificationImportant
    else -> null
}

@Composable
fun LearnPartIcon(partId: String, size: Dp) {
    val res = learnPartIcon(partId)
    val vector = learnPartVector(partId)

    if (res != null) {
        Icon(
            painter = painterResource(id = res),
            contentDescription = null,
            tint = OxideBronze,
            modifier = Modifier.size(size)
        )
    } else if (vector != null) {
        Icon(
            imageVector = vector,
            contentDescription = null,
            tint = OxideBronze,
            modifier = Modifier.size(size)
        )
    } else {
        Icon(
            imageVector = Icons.Outlined.Build,
            contentDescription = null,
            tint = OxideBronze,
            modifier = Modifier.size(size)
        )
    }
}