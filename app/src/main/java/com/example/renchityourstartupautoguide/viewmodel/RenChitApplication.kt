
package com.example.renchityourstartupautoguide.viewmodel

import android.app.Application

class RenChitApplication : Application() {

    val database by lazy {
        RenChitDatabase.getDatabase(this)
    }

    val repository by lazy {
        SavedRepairRepository(
            dao = database.savedRepairDao()
        )
    }
}
