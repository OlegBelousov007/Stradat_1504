package com.example.stradat_1504

import android.app.Application
import com.example.stradat_1504.ui.data.MainDb

class App : Application() {
    val database by lazy { MainDb.createDataBase(this) }
}