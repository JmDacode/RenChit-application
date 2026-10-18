package com.example.renchityourstartupautoguide.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.MenuBook
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.outlined.BookmarkBorder
import androidx.compose.material.icons.outlined.Build
import androidx.compose.material.icons.outlined.Checklist
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.outlined.Warning
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.renchityourstartupautoguide.R
import com.example.renchityourstartupautoguide.ui.theme.CardWhite
import com.example.renchityourstartupautoguide.ui.theme.DeepCharcoal
import com.example.renchityourstartupautoguide.ui.theme.DividerTaupe
import com.example.renchityourstartupautoguide.ui.theme.LightText
import com.example.renchityourstartupautoguide.ui.theme.OxideBronze
import com.example.renchityourstartupautoguide.ui.theme.PrimaryText
import com.example.renchityourstartupautoguide.ui.theme.SandGold
import com.example.renchityourstartupautoguide.ui.theme.SecondaryText
import com.example.renchityourstartupautoguide.ui.theme.WarmIvory
import androidx.compose.material3.TextButton

@Composable
fun HomeScreen(
    username: String,
    onFindRepair: () -> Unit,
    onViewSaved: () -> Unit,
    onSelectVehicle: (String) -> Unit,
    onLogout: () -> Unit
) {
    Scaffold(
        containerColor = MaterialTheme.colorScheme.background,
        bottomBar = { HomeBottomBar(onFindRepair = onFindRepair, onViewSaved = onViewSaved) }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .statusBarsPadding()
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 16.dp, vertical = 8.dp)
        ) {
            HomeHeader(username = username, onLogout = onLogout)

            Spacer(Modifier.height(16.dp))
            HeroCard(onExplore = onFindRepair)

            Spacer(Modifier.height(24.dp))
            Text(
                text = "Build Your Automotive Knowledge",
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                color = PrimaryText
            )
            Spacer(Modifier.height(12.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(IntrinsicSize.Min),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                // Opens the repair guide flow for now
                HomeCard(
                    modifier = Modifier.weight(1f).fillMaxHeight(),
                    icon = Icons.AutoMirrored.Outlined.MenuBook,
                    title = "Learn Your Car",
                    description = "Beginner lessons about engines, brakes, batteries, and cooling systems.",
                    onClick = onFindRepair
                )
                // Placeholder, no function yet
                HomeCard(
                    modifier = Modifier.weight(1f).fillMaxHeight(),
                    icon = Icons.Outlined.Warning,
                    title = "Warning Signs Explained",
                    description = "Understand dashboard lights, unusual sounds, and symptoms that need attention.",
                    onClick = {}
                )
            }

            Spacer(Modifier.height(12.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(IntrinsicSize.Min),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                // Placeholder, no function yet
                HomeCard(
                    modifier = Modifier.weight(1f).fillMaxHeight(),
                    icon = Icons.Outlined.Build,
                    title = "Essential Maintenance",
                    description = "Learn oil checks, tire pressure, coolant monitoring, and basic maintenance.",
                    onClick = {}
                )
                // Placeholder, no function yet
                HomeCard(
                    modifier = Modifier.weight(1f).fillMaxHeight(),
                    icon = Icons.Outlined.Checklist,
                    title = "Beginner's Checklist",
                    description = "Quick checks before driving or during routine vehicle care.",
                    onClick = {}
                )
            }
            Spacer(Modifier.height(24.dp))
            VehicleSection(
                onSelectVehicle = onSelectVehicle,
                onViewAll = onFindRepair
            )
            Spacer(Modifier.height(16.dp))
        }
    }
}

@Composable
private fun HomeHeader(username: String, onLogout: () -> Unit) {
    var menuOpen by remember { mutableStateOf(false) }

    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(52.dp)
                .clip(RoundedCornerShape(14.dp))
                .background(OxideBronze),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_renchit_logo),
                contentDescription = null,
                tint = LightText,
                modifier = Modifier.size(34.dp)
            )
        }

        Spacer(Modifier.width(14.dp))

        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = "RenChit",
                fontSize = 26.sp,
                fontWeight = FontWeight.SemiBold,
                color = PrimaryText
            )
            Text(
                text = "Your Start Up Auto Guide",
                fontSize = 14.sp,
                color = OxideBronze
            )
        }

        Box {
            IconButton(onClick = { menuOpen = true }) {
                Icon(
                    imageVector = Icons.Filled.Menu,
                    contentDescription = "Menu",
                    tint = PrimaryText
                )
            }
            DropdownMenu(
                expanded = menuOpen,
                onDismissRequest = { menuOpen = false },
                containerColor = CardWhite
            ) {
                Text(
                    text = "Signed in as $username",
                    fontSize = 13.sp,
                    color = SecondaryText,
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
                )
                HorizontalDivider(color = DividerTaupe)
                DropdownMenuItem(
                    text = { Text("Log out", color = PrimaryText) },
                    onClick = {
                        menuOpen = false
                        onLogout()
                    }
                )
            }
        }
    }
}

@Composable
private fun HeroCard(onExplore: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(24.dp))
            .background(DeepCharcoal)
    ) {
        // Simplified car in the corner. Change width or offset to move it around.
        Image(
            painter = painterResource(R.drawable.ic_car_silhouette),
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .offset(x = 40.dp, y = 8.dp)
                .width(230.dp)
                .alpha(0.6f)
        )

        Column(modifier = Modifier.padding(24.dp)) {
            Text(
                text = "YOUR AUTOMOTIVE STARTING POINT",
                fontSize = 12.sp,
                fontWeight = FontWeight.SemiBold,
                letterSpacing = 0.8.sp,
                color = SandGold
            )
            Spacer(Modifier.height(10.dp))
            Text(
                text = "Know your car.",
                fontSize = 32.sp,
                lineHeight = 38.sp,
                fontWeight = FontWeight.Bold,
                color = WarmIvory
            )
            Spacer(Modifier.height(10.dp))
            Text(
                text = "Learn the basics, understand common problems, and build confidence one guide at a time.",
                fontSize = 15.sp,
                lineHeight = 22.sp,
                color = WarmIvory.copy(alpha = 0.85f),
                modifier = Modifier.fillMaxWidth(0.8f)
            )
            Spacer(Modifier.height(20.dp))
            Button(
                onClick = onExplore,
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = OxideBronze,
                    contentColor = LightText
                )
            ) {
                Text("Explore guides", fontSize = 16.sp, fontWeight = FontWeight.Medium)
                Spacer(Modifier.width(10.dp))
            }
        }
    }
}

@Composable
private fun HomeCard(
    icon: ImageVector,
    title: String,
    description: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        onClick = onClick,
        modifier = modifier,
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = CardWhite)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = OxideBronze,
                modifier = Modifier.size(32.dp)
            )
            Spacer(Modifier.height(12.dp))
            Row(verticalAlignment = Alignment.Top) {
                Text(
                    text = title,
                    fontSize = 17.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = PrimaryText,
                    modifier = Modifier.weight(1f)
                )
            }
            Spacer(Modifier.height(6.dp))
            Text(
                text = description,
                fontSize = 14.sp,
                lineHeight = 20.sp,
                color = SecondaryText
            )
        }
    }
}

@Composable
private fun HomeBottomBar(
    onFindRepair: () -> Unit,
    onViewSaved: () -> Unit
) {
    val itemColors = NavigationBarItemDefaults.colors(
        selectedIconColor = LightText,
        selectedTextColor = PrimaryText,
        indicatorColor = OxideBronze,
        unselectedIconColor = SecondaryText,
        unselectedTextColor = SecondaryText
    )

    NavigationBar(containerColor = CardWhite) {
        NavigationBarItem(
            selected = true,
            onClick = onFindRepair,
            icon = { Icon(Icons.Outlined.Search, contentDescription = null) },
            label = { NavLabel("Find Repair Guide") },
            colors = itemColors
        )
        NavigationBarItem(
            selected = false,
            onClick = onViewSaved,
            icon = { Icon(Icons.Outlined.BookmarkBorder, contentDescription = null) },
            label = { NavLabel("My Saved Repair") },
            colors = itemColors
        )
        // Placeholder, no function yet
        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = { Icon(painterResource(R.drawable.ic_engine), contentDescription = null) },
            label = { NavLabel("Advanced Diagnostic") },
            colors = itemColors
        )
        // Placeholder, no function yet
        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = { Icon(Icons.Outlined.Settings, contentDescription = null) },
            label = { NavLabel("Settings") },
            colors = itemColors
        )
    }
}

@Composable
private fun NavLabel(text: String) {
    Text(
        text = text,
        fontSize = 11.sp,
        lineHeight = 13.sp,
        textAlign = TextAlign.Center,
        maxLines = 2
    )
}
@Composable
private fun VehicleSection(
    onSelectVehicle: (String) -> Unit,
    onViewAll: () -> Unit
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .width(4.dp)
                .height(40.dp)
                .clip(RoundedCornerShape(2.dp))
                .background(OxideBronze)
        )
        Spacer(Modifier.width(10.dp))
        Icon(
            painter = painterResource(R.drawable.ic_renchit_logo),
            contentDescription = null,
            tint = PrimaryText,
            modifier = Modifier.size(28.dp)
        )
        Spacer(Modifier.width(10.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = "Choose Your Vehicle",
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                color = PrimaryText
            )
            Text(
                text = "Select your vehicle type to get started with the right guides.",
                fontSize = 12.sp,
                lineHeight = 16.sp,
                color = SecondaryText
            )
        }
        TextButton(onClick = onViewAll) {
            Text("View all", fontSize = 13.sp, color = OxideBronze)
            Spacer(Modifier.width(4.dp))
        }
    }

    Spacer(Modifier.height(12.dp))

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(IntrinsicSize.Min),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        VehicleCard(
            modifier = Modifier.weight(1f).fillMaxHeight(),
            label = "Sedan",
            imageRes = R.drawable.ic_vehicle_sedan,
            onClick = { onSelectVehicle("Sedan") }
        )
        VehicleCard(
            modifier = Modifier.weight(1f).fillMaxHeight(),
            label = "SUV",
            imageRes = R.drawable.ic_vehicle_suv,
            onClick = { onSelectVehicle("SUV") }
        )
        VehicleCard(
            modifier = Modifier.weight(1f).fillMaxHeight(),
            label = "Pickup Truck",
            imageRes = R.drawable.ic_vehicle_pickup,
            onClick = { onSelectVehicle("PickupTruck") }
        )
    }
}

@Composable
private fun VehicleCard(
    label: String,
    imageRes: Int,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        onClick = onClick,
        modifier = modifier,
        shape = RoundedCornerShape(14.dp),
        colors = CardDefaults.cardColors(containerColor = CardWhite)
    ) {
        Column(modifier = Modifier.padding(10.dp)) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(52.dp),
                contentAlignment = Alignment.Center
            ) {
                Box(
                    modifier = Modifier
                        .width(76.dp)
                        .height(40.dp)
                        .clip(RoundedCornerShape(50))
                        .background(DividerTaupe)
                )
                Image(
                    painter = painterResource(imageRes),
                    contentDescription = label,
                    modifier = Modifier.width(80.dp)
                )
            }
            Spacer(Modifier.height(8.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = label,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = PrimaryText,
                    modifier = Modifier.weight(1f)
                )
            }
        }
    }
}