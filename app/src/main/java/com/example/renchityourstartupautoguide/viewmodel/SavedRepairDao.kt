package com.example.renchityourstartupautoguide.viewmodel

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface SavedRepairDao {

    @Query("SELECT * FROM SavedRepairEntity ORDER BY id DESC")
    fun getAllSavedRepairs(): Flow<List<SavedRepairEntity>>

    @Query("SELECT * FROM SavedRepairEntity WHERE id = :id LIMIT 1")
    suspend fun getSavedRepairById(id: Int): SavedRepairEntity?

    @Insert
    suspend fun insertSavedRepair(repair: SavedRepairEntity)

    @Update
    suspend fun updateSavedRepair(repair: SavedRepairEntity)

    @Delete
    suspend fun deleteSavedRepair(repair: SavedRepairEntity)
}