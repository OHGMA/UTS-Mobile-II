package com.example.unscramble.data

import androidx.room.Database

@Database(entities = [History::class], version = 1)
abstract class HistoryDatabase {
    abstract fun HistoryDao(): HistoryDao
}