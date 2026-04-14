package com.example.unscramble.ui

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Histories")
data class History(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val answer: String
)