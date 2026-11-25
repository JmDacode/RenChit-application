package com.example.renchityourstartupautoguide.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.renchityourstartupautoguide.model.Feedback
import com.example.renchityourstartupautoguide.repository.FeedbackRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class FeedbackViewModel(
    private val repository: FeedbackRepository
) : ViewModel() {

    private val _feedbacks = MutableStateFlow<List<Feedback>>(emptyList())
    val feedbacks: StateFlow<List<Feedback>> = _feedbacks.asStateFlow()

    init {
        repository.getFeedbacks { list ->
            _feedbacks.value = list
        }
    }

    fun getFeedback(id: String): Feedback? =
        _feedbacks.value.find { it.id == id }

    fun addFeedback(feedback: Feedback) {
        viewModelScope.launch {
            try {
                repository.addFeedback(feedback)
            } catch (e: Exception) {
                println("Add feedback failed: ${e.message}")
            }
        }
    }

    fun updateFeedback(id: String, updates: Map<String, Any>) {
        repository.updateFeedback(id, updates)
    }

    fun deleteFeedback(id: String) {
        repository.deleteFeedback(id)
    }
}