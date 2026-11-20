package com.example.renchityourstartupautoguide.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class ChecklistViewModel : ViewModel() {

    private val _doneIds = MutableStateFlow<Set<String>>(emptySet())
    val doneIds: StateFlow<Set<String>> = _doneIds.asStateFlow()

    fun setDone(itemId: String, done: Boolean) {
        _doneIds.value = if (done) {
            _doneIds.value + itemId
        } else {
            _doneIds.value - itemId
        }
    }

    fun toggle(itemId: String) {
        setDone(itemId, itemId !in _doneIds.value)
    }

    fun reset(itemIds: List<String>) {
        _doneIds.value = _doneIds.value - itemIds.toSet()
    }

    fun clear() {
        _doneIds.value = emptySet()
    }
}