package com.example.renchityourstartupautoguide.model

import android.app.Application
import com.example.renchityourstartupautoguide.repository.SavedRepairRepository

class RenChitApplication : Application() {

    val repository by lazy {
        SavedRepairRepository()
    }
}