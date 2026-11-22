package com.example.renchityourstartupautoguide.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TermsAndConditionsScreen(
    onBack: () -> Unit
) {
    val colors = MaterialTheme.colorScheme

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colors.background)
            .verticalScroll(rememberScrollState())
            .padding(20.dp)
    ) {
        OutlinedButton(onClick = onBack) {
            Text("Back")
        }

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Terms and Conditions",
            style = MaterialTheme.typography.headlineMedium,
            color = colors.onBackground
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Last updated: November 21, 2026",
            style = MaterialTheme.typography.bodySmall,
            color = colors.onSurfaceVariant
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Introduction",
            style = MaterialTheme.typography.titleMedium,
            color = colors.primary
        )
        LegalParagraph(
            "Welcome to RenChit - Your Start Up Auto Guide. " +
                    "By accessing or using RenChit, you agree to follow these " +
                    "Terms and Conditions. Please read them carefully."
        )

        LegalHeading("1. Purpose of the Application")
        LegalParagraph(
            "RenChit is an educational automotive guide designed to help " +
                    "beginner drivers understand vehicle components, basic maintenance, " +
                    "and common automotive concerns."
        )

        LegalHeading("2. User Accounts")
        LegalParagraph(
            "Some application features may require an account. " +
                    "You are responsible for providing accurate account information " +
                    "and keeping your login credentials secure."
        )

        LegalHeading("3. Acceptable Use")
        LegalParagraph(
            "You agree to use RenChit responsibly and only for its intended " +
                    "educational purposes. You must not attempt to disrupt the application, " +
                    "access accounts without authorization, or misuse its features."
        )

        LegalHeading("4. Automotive Information Disclaimer")
        LegalParagraph(
            "The automotive information provided by RenChit is for general " +
                    "educational purposes. It is not a substitute for professional " +
                    "vehicle inspection, mechanical diagnosis, or repair services."
        )

        LegalHeading("5. Vehicle Safety")
        LegalParagraph(
            "Always prioritize vehicle and personal safety. Do not attempt " +
                    "maintenance or repairs beyond your knowledge or skill level. " +
                    "Work involving brakes, steering, airbags, electrical systems, " +
                    "or other safety-critical components should be handled by qualified " +
                    "automotive professionals."
        )

        LegalHeading("6. Saved User Content")
        LegalParagraph(
            "You are responsible for the notes and information you create " +
                    "and save within RenChit. Saved notes are personal references " +
                    "and should not be treated as verified professional repair instructions."
        )

        LegalHeading("7. Intellectual Property")
        LegalParagraph(
            "The RenChit name, application design, original educational content, " +
                    "and other project materials belong to their respective owners. " +
                    "You may not reproduce or redistribute protected materials without " +
                    "appropriate permission."
        )

        LegalHeading("8. Application Availability")
        LegalParagraph(
            "RenChit may be updated, modified, temporarily unavailable, " +
                    "or discontinued as development continues. Features may change " +
                    "without prior notice."
        )

        LegalHeading("9. Limitation of Liability")
        LegalParagraph(
            "To the extent permitted by applicable law, the development team " +
                    "is not responsible for damage, injury, or loss resulting from " +
                    "improper vehicle maintenance, unsafe repair attempts, or reliance " +
                    "on educational information without professional verification."
        )

        LegalHeading("10. Account Suspension or Termination")
        LegalParagraph(
            "Access to RenChit may be restricted when an account or application " +
                    "feature is misused, or when necessary to protect the application " +
                    "and its users."
        )

        LegalHeading("11. Changes to These Terms")
        LegalParagraph(
            "These Terms and Conditions may be revised when application " +
                    "features or policies change. The latest version should be made " +
                    "available within the application."
        )

        LegalHeading("12. Contact Information")
        LegalParagraph(
            "For questions or concerns about these Terms and Conditions, " +
                    "contact the RenChit development team at:"
        )

        LegalParagraph("Developer contact: johnmarlohtaylan21@gmail.com")

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "RenChit • Your Start Up Auto Guide",
            style = MaterialTheme.typography.bodySmall,
            color = colors.onSurfaceVariant
        )
    }
}

@Composable
private fun LegalHeading(text: String) {
    Spacer(modifier = Modifier.height(20.dp))

    Text(
        text = text,
        style = MaterialTheme.typography.titleMedium,
        color = MaterialTheme.colorScheme.primary
    )

    Spacer(modifier = Modifier.height(8.dp))
}

@Composable
private fun LegalParagraph(text: String) {
    Spacer(modifier = Modifier.height(8.dp))

    Text(
        text = text,
        style = MaterialTheme.typography.bodyMedium,
        color = MaterialTheme.colorScheme.onSurface,
        lineHeight = MaterialTheme.typography.bodyMedium.lineHeight
    )
}
