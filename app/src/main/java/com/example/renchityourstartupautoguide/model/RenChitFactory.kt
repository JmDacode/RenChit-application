package com.example.renchityourstartupautoguide.model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.renchityourstartupautoguide.repository.AuthRepository
import com.example.renchityourstartupautoguide.repository.SavedRepairRepository
import com.example.renchityourstartupautoguide.viewmodel.AuthViewModel
import com.example.renchityourstartupautoguide.viewmodel.RenChitViewModel

class RenChitFactory(
    private val repository: SavedRepairRepository,
    private val authrepository: AuthRepository
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T
    {
        if (modelClass.isAssignableFrom(RenChitViewModel::class.java))
        {
            @Suppress("UNCHECKED_CAST")
            return RenChitViewModel(repository) as T
        }
        if (modelClass.isAssignableFrom(AuthViewModel::class.java))
        {
            @Suppress("UNCHECKED_CAST")
            return AuthViewModel(authrepository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel")
    }
}