package com.example.stradat_1504.ui.data

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "contact")
data class NameEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val numberPhone: String? = null,
    val name: String? = null,
    val surname: String? = null
)