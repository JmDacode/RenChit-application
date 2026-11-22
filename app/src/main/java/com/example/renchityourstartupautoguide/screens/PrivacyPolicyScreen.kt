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
fun PrivacyPolicyScreen(
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
            text = "Privacy Policy",
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
                    "This Privacy Policy explains how the application handles " +
                    "information when you use its features and services."
        )

        LegalHeading("1. Information We Collect")
        LegalParagraph(
            "RenChit may process information needed to provide its features, " +
                    "including your email address and account authentication details. " +
                    "The application may also store repair notes and other information " +
                    "that you choose to save."
        )

        LegalHeading("2. How We Use Your Information")
        LegalParagraph(
            "Information is used to support account registration and login, " +
                    "provide application features, maintain saved user content, " +
                    "and support the proper operation of RenChit."
        )

        LegalHeading("3. Data Storage")
        LegalParagraph(
            "RenChit uses Firebase Authentication for account authentication. " +
                    "Saved repair notes and other locally stored application data " +
                    "may be kept on your device through the Room database. " +
                    "Firebase App Distribution is used to distribute testing builds " +
                    "and is not itself the application's user-data database."
        )

        LegalHeading("4. Third-Party Services")
        LegalParagraph(
            "RenChit uses services provided by Google Firebase. " +
                    "Firebase Authentication processes account information " +
                    "to support sign-in and authentication. These services are " +
                    "subject to their own terms and privacy practices."
        )

        LegalHeading("5. Data Sharing")
        LegalParagraph(
            "RenChit does not intentionally sell your personal information. " +
                    "Information may be processed by service providers when necessary " +
                    "to operate the application and provide its features."
        )

        LegalHeading("6. Data Security")
        LegalParagraph(
            "Reasonable measures are used to help protect information handled " +
                    "by the application. However, no electronic storage or transmission " +
                    "method can be guaranteed to be completely secure."
        )

        LegalHeading("7. Data Retention and Deletion")
        LegalParagraph(
            "Locally stored information may remain on your device until it is " +
                    "deleted through available application features or the application " +
                    "data is cleared. Firebase account information is handled through " +
                    "Firebase Authentication. Contact the development team for questions " +
                    "about account-related data or deletion requests."
        )

        LegalHeading("8. Your Privacy Rights")
        LegalParagraph(
            "Depending on applicable law, you may have rights to request access " +
                    "to, correction of, or deletion of your personal information. " +
                    "You may contact the development team to raise a privacy concern."
        )

        LegalHeading("9. Children's Privacy")
        LegalParagraph(
            "RenChit is an educational automotive guide. It is not specifically " +
                    "designed to collect personal information from children. " +
                    "Users who require assistance with privacy concerns may contact " +
                    "the development team."
        )

        LegalHeading("10. Changes to This Policy")
        LegalParagraph(
            "This Privacy Policy may be updated when application features " +
                    "or data practices change. The latest version should be made " +
                    "available within the application."
        )

        LegalHeading("11. Contact Information")
        LegalParagraph(
            "For questions, requests, or concerns about this Privacy Policy, " +
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
