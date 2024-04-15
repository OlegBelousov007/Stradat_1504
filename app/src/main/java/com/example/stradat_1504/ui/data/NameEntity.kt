package com.example.stradat_1504.ui.data

import androidx.compose.runtime.Composable
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "contact")
data class NameEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val numberPhone: String,
    val name: String,
    val surname: String
)