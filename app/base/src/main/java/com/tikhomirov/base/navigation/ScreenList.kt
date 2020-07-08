package com.tikhomirov.base.navigation


interface ScreenList {
    val red_screen: Screen
    fun openBlueScreen(param: Int): Screen
}