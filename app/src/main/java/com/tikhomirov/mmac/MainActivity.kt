package com.tikhomirov.mmac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.tikhomirov.base.navigation.ScreenList
import org.koin.android.ext.android.inject
import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.Router
import ru.terrakok.cicerone.android.support.SupportAppNavigator
import ru.terrakok.cicerone.commands.Command

class MainActivity : AppCompatActivity() {
    private val navigator = object : SupportAppNavigator(this, R.id.mainContainer){
        override fun setupFragmentTransaction(command: Command, currentFragment: Fragment?, nextFragment: Fragment?, fragmentTransaction: FragmentTransaction) {
            super.setupFragmentTransaction(command, currentFragment, nextFragment, fragmentTransaction)
        }
    }
    private val cicerone: Cicerone<Router> by inject()
    private val router: Router by inject()
    private val screenList: ScreenList by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        router.newRootScreen(screenList.openBlueScreen(42))
    }

    override fun onResume() {
        super.onResume()
        cicerone.navigatorHolder.setNavigator(navigator)
    }

    override fun onPause() {
        super.onPause()
        cicerone.navigatorHolder.removeNavigator()
    }

}