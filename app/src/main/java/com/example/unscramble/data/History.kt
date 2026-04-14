package com.example.unscramble.data

import androidx.room.ColumnInfo
import androidx.room.Entity


@Entity("Histories")
data class History(
    @ColumnInfo(name = "GuessWord")
    val GuessWord: String
)
