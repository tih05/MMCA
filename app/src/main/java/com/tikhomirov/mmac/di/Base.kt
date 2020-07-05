package com.tikhomirov.mmac.di

import com.tikhomirov.base.navigation.ScreenList
import com.tikhomirov.mmac.ScreenListImpl
import org.koin.dsl.module
import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.Router


val base = module {
    single { Cicerone.create() }
    single { get<Cicerone<Router>>().router}

    single<ScreenList> { ScreenListImpl() }

}