package com.example.unscramble.ui

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface HistoryDao {
    @Query("SELECT * FROM Histories ORDER BY id DESC")
    fun getAllHistories(): Flow<List<History>>

    @Insert
    suspend fun insert(history: History)
}