package com.example.renchityourstartupautoguide.viewmodel

import android.app.Application

class RenChitApplication : Application() {

    val repository by lazy {
        SavedRepairRepository()
    }
}