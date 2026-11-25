package com.example.renchityourstartupautoguide.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.renchityourstartupautoguide.model.MaintenanceLog
import com.example.renchityourstartupautoguide.repository.MaintenanceLogRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MaintenanceLogViewModel(
    private val repository: MaintenanceLogRepository
) : ViewModel() {

    private val _logs = MutableStateFlow<List<MaintenanceLog>>(emptyList())
    val logs: StateFlow<List<MaintenanceLog>> = _logs.asStateFlow()

    init {
        repository.getLogs { list ->
            _logs.value = list
        }
    }

    fun getLog(id: String): MaintenanceLog? =
        _logs.value.find { it.id == id }

    fun addLog(log: MaintenanceLog) {
        viewModelScope.launch {
            try {
                repository.addLog(log)
            } catch (e: Exception) {
                println("Add log failed: ${e.message}")
            }
        }
    }

    fun updateLog(id: String, updates: Map<String, Any>) {
        repository.updateLog(id, updates)
    }

    fun deleteLog(id: String) {
        repository.deleteLog(id)
    }
}
