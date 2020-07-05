package com.tikhomirov.base.navigation

import androidx.fragment.app.Fragment
import com.tikhomirov.base.BaseFragment
import ru.terrakok.cicerone.android.support.SupportAppScreen

class Screen(val fragment: BaseFragment): SupportAppScreen() {
    override fun getFragment(): Fragment? {
        return fragment
    }
}