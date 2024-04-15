package com.example.stradat_1504.ui.data

import android.provider.ContactsContract.CommonDataKinds.Phone
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "contact")
data class NameEntity(
    @PrimaryKey(autoGenerate = true)
    val nomberPhone: Phone,
    val name: String,
    val surname: String
)