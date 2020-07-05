package com.tikhomirov.mmac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tikhomirov.base.navigation.ScreenList
import org.koin.android.ext.android.inject
import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.Router
import ru.terrakok.cicerone.android.support.SupportAppNavigator

class MainActivity : AppCompatActivity() {
    private val navigator = SupportAppNavigator(this, R.id.mainContainer)
    private val cicerone: Cicerone<Router> by inject()
    private val router: Router by inject()
    private val screenList: ScreenList by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        router.newRootScreen(screenList.blue_screen)
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