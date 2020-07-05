package com.tikhomirov.base

import androidx.fragment.app.Fragment
import com.tikhomirov.base.navigation.ScreenList
import org.koin.android.ext.android.inject
import ru.terrakok.cicerone.Router

open class BaseFragment(): Fragment() {
     val router: Router by inject()
     val screenList: ScreenList by inject()
}