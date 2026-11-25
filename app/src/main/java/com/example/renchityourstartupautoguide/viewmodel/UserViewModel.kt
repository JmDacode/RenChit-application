package com.example.renchityourstartupautoguide.viewmodel

import androidx.lifecycle.ViewModel
import com.example.renchityourstartupautoguide.model.UserProfile
import com.example.renchityourstartupautoguide.repository.UserRepository

class UserViewModel(
    private val repository: UserRepository
) : ViewModel() {

    fun addUser(email: String, onResult: (Boolean) -> Unit = {}) {
        val user = UserProfile(
            email = email,
            status = "active",
            createdAt = System.currentTimeMillis()
        )

        repository.addUser(user, onResult)
    }
}