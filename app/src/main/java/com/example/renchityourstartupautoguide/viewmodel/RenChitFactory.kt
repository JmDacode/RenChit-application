package com.example.renchityourstartupautoguide.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class RenChitFactory(
    private val repository: SavedRepairRepository
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(RenChitViewModel::class.java)) {
            return RenChitViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}