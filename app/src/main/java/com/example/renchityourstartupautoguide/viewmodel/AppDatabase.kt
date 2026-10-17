package com.example.renchityourstartupautoguide.viewmodel

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [SavedRepairEntity::class],
    version = 1,
    exportSchema = false
)
abstract class RenChitDatabase : RoomDatabase() {

    abstract fun savedRepairDao(): SavedRepairDao

    companion object {
        @Volatile
        private var INSTANCE: RenChitDatabase? = null

        fun getDatabase(context: Context): RenChitDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    RenChitDatabase::class.java,
                    "renchit_database"
                ).build()

                INSTANCE = instance
                instance
            }
        }
    }
}