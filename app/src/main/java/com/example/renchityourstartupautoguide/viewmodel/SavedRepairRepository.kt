package com.example.renchityourstartupautoguide.viewmodel

import kotlinx.coroutines.flow.Flow

class SavedRepairRepository(
    private val dao: SavedRepairDao
) {

    val savedRepairs: Flow<List<SavedRepairEntity>> =
        dao.getAllSavedRepairs()

    suspend fun getSavedRepair(id: Int): SavedRepairEntity? {
        return dao.getSavedRepairById(id)
    }

    suspend fun addSavedRepair(repair: SavedRepairEntity) {
        dao.insertSavedRepair(repair)
    }

    suspend fun updateSavedRepair(repair: SavedRepairEntity) {
        dao.updateSavedRepair(repair)
    }

    suspend fun deleteSavedRepair(repair: SavedRepairEntity) {
        dao.deleteSavedRepair(repair)
    }
}