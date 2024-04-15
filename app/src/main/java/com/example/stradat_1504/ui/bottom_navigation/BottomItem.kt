package com.example.stradat_1504.ui.bottom_navigation

import com.example.stradat_1504.R

sealed class BottomItem(val title: String, val iconId: Int, val route: String) {
    object Screen1: BottomItem("Latest", R.drawable.zvonit, "screen_1")
    object Screen2: BottomItem("Contacts", R.drawable.contacti, "screen_2")
}