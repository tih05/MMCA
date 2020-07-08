package com.tikhomirov.mmac.di

import com.tikhomirov.data.KekRepository
import com.tikhomirov.domain.KekDataSource
import org.koin.dsl.module


val data = module {

    single<KekDataSource> { KekRepository() }

}