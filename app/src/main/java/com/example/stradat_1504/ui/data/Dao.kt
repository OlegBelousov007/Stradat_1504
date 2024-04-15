package com.example.stradat_1504.ui.data

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

interface Dao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertItem(nameEntity: NameEntity)
    @Delete
    suspend fun deleteItem(nameEntity: NameEntity)
    @Query("SELECT * FROM contact")
    fun getAllItems(): Flow<List<NameEntity>>
}