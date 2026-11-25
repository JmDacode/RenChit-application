package com.example.renchityourstartupautoguide.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.renchityourstartupautoguide.model.UserProfile
import com.example.renchityourstartupautoguide.repository.UserRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class UserViewModel(
    private val repository: UserRepository
) : ViewModel() {

    private val _users = MutableStateFlow<List<UserProfile>>(emptyList())
    val users: StateFlow<List<UserProfile>> = _users.asStateFlow()

    init {
        repository.getUsers { list ->
            _users.value = list
        }
    }

    fun addUser(email: String) {
        viewModelScope.launch {
            try {
                repository.addUser(
                    UserProfile(
                        email = email,
                        createdAt = System.currentTimeMillis()
                    )
                )
            } catch (e: Exception) {
                println("Add user failed: ${e.message}")
            }
        }
    }

    fun updateUser(id: String, updates: Map<String, Any>) {
        repository.updateUser(id, updates)
    }

    fun deleteUser(id: String) {
        repository.deleteUser(id)
    }
}