package com.tikhomirov.mmac

import com.tikhomirov.base.navigation.Screen
import com.tikhomirov.base.navigation.ScreenList
import com.tikhomirov.blue_screen.BlueScreenFragment
import com.tikhomirov.red_screen.RedScreenFragment

class ScreenListImpl : ScreenList {
    override val red_screen = Screen(RedScreenFragment.newInstance())

    override fun openBlueScreen(param: Int): Screen {
        return Screen(BlueScreenFragment.newInstance(param))
    }

}