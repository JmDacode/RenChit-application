package com.example.renchityourstartupautoguide.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ChevronRight
import androidx.compose.material.icons.outlined.Description
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.automirrored.outlined.Logout
import androidx.compose.material.icons.outlined.Policy
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.firebase.auth.FirebaseAuth

private val SettingsBackground = Color(0xFFF2EEE6)
private val SettingsText = Color(0xFF292824)
private val SettingsMuted = Color(0xFF81796F)
private val SettingsBrown = Color(0xFF9B6B49)
private val SettingsIconBackground = Color(0xFFEADFD1)
private val SettingsDivider = Color(0xFFE6DED4)

@Composable
fun SettingsScreen(
    onBack: () -> Unit,
    onPrivacyClick: () -> Unit,
    onTermsClick: () -> Unit,
    onLogout: () -> Unit
) {
    val currentUser = FirebaseAuth.getInstance().currentUser

    val email = currentUser?.email ?: "No email available"

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(SettingsBackground)
            .verticalScroll(rememberScrollState())
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(22.dp)
    ) {
        // PAGE HEADER
        Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {

            OutlinedButton(onClick = onBack) {
                Text("Back")
            }

            Text(
                text = "Settings",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                color = SettingsText
            )

            Text(
                text = "User account",
                fontSize = 16.sp,
                color = SettingsMuted
            )
        }

        // YOUR ACCOUNT
        SettingsCard {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .size(64.dp)
                        .background(SettingsIconBackground, CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Outlined.Person,
                        contentDescription = "Account",
                        tint = SettingsBrown,
                        modifier = Modifier.size(34.dp)
                    )
                }

                Spacer(modifier = Modifier.width(16.dp))

                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = "Your Account",
                        fontSize = 22.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = SettingsText
                    )
                    Text(
                        text = "Your account information",
                        fontSize = 14.sp,
                        color = SettingsMuted
                    )
                }
            }

            Spacer(modifier = Modifier.height(20.dp))
            SettingsDivider()
            Spacer(modifier = Modifier.height(14.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Email",
                    modifier = Modifier.weight(1f),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = SettingsText
                )

                Text(
                    text = email,
                    fontSize = 15.sp,
                    color = SettingsMuted
                )
            }
        }

        // SUPPORT AND INFORMATION
        Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
            SettingsSectionTitle()

            SettingsCard {
                SettingsOptionRow(
                    icon = Icons.Outlined.Policy,
                    title = "Privacy Policy",
                    onClick = onPrivacyClick
                )

                SettingsDivider()

                SettingsOptionRow(
                    icon = Icons.Outlined.Description,
                    title = "Terms and Conditions",
                    onClick = onTermsClick
                )

                SettingsDivider()

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    SettingsIcon(Icons.Outlined.Info)

                    Spacer(modifier = Modifier.width(14.dp))

                    Column {
                        Text(
                            text = "App Version",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = SettingsText
                        )
                        Text(
                            text = "Version 1.0.1",
                            fontSize = 13.sp,
                            color = SettingsMuted
                        )
                    }
                }
            }
        }

        // LOG OUT
        SettingsCard(
            modifier = Modifier.clickable { onLogout() }
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Outlined.Logout,
                    contentDescription = "Log out",
                    tint = Color(0xFFB34D43)
                )

                Spacer(modifier = Modifier.width(10.dp))

                Text(
                    text = "Log Out",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFFB34D43)
                )
            }
        }

        Text(
            text = "RenChit • Your Start Up Auto Guide",
            modifier = Modifier.fillMaxWidth(),
            fontSize = 12.sp,
            color = SettingsMuted,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(8.dp))
    }
}

// REUSABLE SETTINGS COMPONENTS

@Composable
private fun SettingsCard(
    modifier: Modifier = Modifier,
    content: @Composable ColumnScope.() -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(Color.White, RoundedCornerShape(24.dp))
            .padding(20.dp),
        content = content
    )
}

@Composable
private fun SettingsSectionTitle() {
    Text(
        text = "Support and Information",
        fontSize = 20.sp,
        fontWeight = FontWeight.SemiBold,
        color = SettingsText
    )
}

@Composable
private fun SettingsDivider() {
    HorizontalDivider(
        color = SettingsDivider,
        thickness = 1.dp
    )
}

@Composable
private fun SettingsIcon(icon: androidx.compose.ui.graphics.vector.ImageVector) {
    Box(
        modifier = Modifier
            .size(42.dp)
            .background(SettingsIconBackground, RoundedCornerShape(12.dp)),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = SettingsBrown,
            modifier = Modifier.size(22.dp)
        )
    }
}

@Composable
private fun SettingsOptionRow(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    title: String,
    subtitle: String? = null,
    value: String? = null,
    onClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() }
            .padding(vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        SettingsIcon(icon)

        Spacer(modifier = Modifier.width(14.dp))

        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = title,
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                color = SettingsText
            )

            if (subtitle != null) {
                Text(
                    text = subtitle,
                    fontSize = 13.sp,
                    color = SettingsMuted
                )
            }
        }

        if (value != null) {
            Text(
                text = value,
                fontSize = 14.sp,
                color = SettingsBrown
            )
        }

        Spacer(modifier = Modifier.width(6.dp))
        Icon(
            imageVector = Icons.Outlined.ChevronRight,
            contentDescription = "Open $title",
            tint = SettingsBrown
        )
    }
}