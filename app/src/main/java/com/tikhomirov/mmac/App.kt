package com.tikhomirov.mmac

import android.app.Application
import com.tikhomirov.mmac.di.base
import com.tikhomirov.mmac.di.data
import com.tikhomirov.mmac.di.domain
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.Router

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            // declare modules
            modules(
                base,
                domain,
                data
            )
        }
    }


}