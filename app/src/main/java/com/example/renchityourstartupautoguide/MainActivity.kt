
package com.example.renchityourstartupautoguide

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.renchityourstartupautoguide.nav.RenChitApp
import com.example.renchityourstartupautoguide.ui.theme.RenChitYourStartUpAutoGuideTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            RenChitYourStartUpAutoGuideTheme {
                RenChitApp()
            }
        }
    }
}
