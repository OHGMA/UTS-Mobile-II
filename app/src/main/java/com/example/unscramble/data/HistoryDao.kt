package com.example.unscramble.data

import androidx.room.Dao
import androidx.room.Query

@Dao
interface HistoryDao {
    @Query("Select * From histories")
    fun getAllHistory(): List<History>
}