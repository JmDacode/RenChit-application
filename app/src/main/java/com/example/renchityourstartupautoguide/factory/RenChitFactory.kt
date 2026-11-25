package com.example.renchityourstartupautoguide.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.renchityourstartupautoguide.repository.AuthRepository
import com.example.renchityourstartupautoguide.repository.SavedRepairRepository
import com.example.renchityourstartupautoguide.viewmodel.AuthViewModel
import com.example.renchityourstartupautoguide.viewmodel.ChecklistViewModel
import com.example.renchityourstartupautoguide.viewmodel.RenChitViewModel
import com.example.renchityourstartupautoguide.viewmodel.GarageViewModel
import com.example.renchityourstartupautoguide.repository.GarageRepository
import com.example.renchityourstartupautoguide.repository.UserRepository
import com.example.renchityourstartupautoguide.viewmodel.UserViewModel

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

        if (modelClass.isAssignableFrom(ChecklistViewModel::class.java))
        {
            @Suppress("UNCHECKED_CAST")
            return ChecklistViewModel() as T
        }
        if (modelClass.isAssignableFrom(GarageViewModel::class.java))
        {
            @Suppress("UNCHECKED_CAST")
            return GarageViewModel(GarageRepository()) as T
        }
        if (modelClass.isAssignableFrom(UserViewModel::class.java))
        {
            @Suppress("UNCHECKED_CAST")
            return UserViewModel(UserRepository()) as T
        }

        throw IllegalArgumentException("Unknown ViewModel")
    }
}