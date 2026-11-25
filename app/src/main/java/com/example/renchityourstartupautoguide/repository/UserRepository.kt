package com.example.renchityourstartupautoguide.repository

import android.util.Log
import com.example.renchityourstartupautoguide.model.UserProfile
import com.google.firebase.firestore.FirebaseFirestore

class UserRepository {

    private val db = FirebaseFirestore.getInstance()

    private val usersCollection = db.collection("coll_users")

    // Create: save a new user record
    fun addUser(user: UserProfile, onResult: (Boolean) -> Unit) {
        usersCollection
            .add(user)
            .addOnSuccessListener { onResult(true) }
            .addOnFailureListener { error ->
                Log.e("UserRepository", "Could not add user", error)
                onResult(false)
            }
    }
}