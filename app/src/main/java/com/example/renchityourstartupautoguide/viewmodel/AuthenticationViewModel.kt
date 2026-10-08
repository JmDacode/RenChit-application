package com.example.renchityourstartupautoguide.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import java.security.MessageDigest

class AuthViewModel : ViewModel() {

    private val users = mutableStateListOf<User>()
    private var nextUserId = 1

    var currentUser by mutableStateOf<User?>(null)
        private set

    fun register(
        username: String,
        email: String,
        password: String,
        confirmPassword: String
    ): String? {
        val name = username.trim()
        val mail = email.trim()
        return when {
            name.isBlank() || mail.isBlank() || password.isBlank() -> "Please fill in all fields."
            !mail.contains("@") -> "Please enter a valid email address."
            password.length < 6 -> "Password must be at least 6 characters."
            password != confirmPassword -> "Passwords do not match."
            users.any { it.username.equals(name, ignoreCase = true) } -> "That username is already taken."
            users.any { it.email.equals(mail, ignoreCase = true) } -> "That email is already registered."
            else -> {
                val user = User(nextUserId++, name, mail, hash(password), System.currentTimeMillis())
                users.add(user)
                currentUser = user
                null
            }
        }
    }

    fun login(username: String, password: String): String? {
        val user = users.find { it.username.equals(username.trim(), ignoreCase = true) }
        return if (user == null || user.passwordHash != hash(password)) {
            "Incorrect username or password."
        } else {
            currentUser = user
            null
        }
    }

    fun logout() {
        currentUser = null
    }

    private fun hash(password: String): String =
        MessageDigest.getInstance("SHA-256")
            .digest(password.toByteArray())
            .joinToString("") { "%02x".format(it) }
}