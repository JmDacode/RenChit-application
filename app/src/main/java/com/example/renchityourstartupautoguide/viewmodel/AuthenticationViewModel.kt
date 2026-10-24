package com.example.renchityourstartupautoguide.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class AuthViewModel : ViewModel() {

    var currentUser by mutableStateOf<User?>(null)
        private set

    var isLoading by mutableStateOf(false)
        private set

    fun register(
        username: String,
        email: String,
        password: String,
        confirmPassword: String,
        onResult: (String?) -> Unit
    ) {
        val name = username.trim()
        val mail = email.trim()

        when {
            name.isEmpty() || mail.isEmpty() ||
                    password.isEmpty() || confirmPassword.isEmpty() ->
                onResult("Please fill in all fields.")

            !mail.endsWith("@gmail.com", ignoreCase = true) ->
                onResult("Please use a valid Gmail address.")

            password != confirmPassword ->
                onResult("Passwords do not match.")

            else -> {
                currentUser = User(username = name, email = mail)
                onResult(null)
            }
        }
    }

    fun login(
        username: String,
        password: String,
        onResult: (String?) -> Unit
    ) {
        val name = username.trim()

        if (name.isEmpty() || password.isEmpty()) {
            onResult("Please enter a username and password.")
            return
        }

        currentUser = User(username = name)
        onResult(null)
    }

    fun logout() {
        currentUser = null
    }
}