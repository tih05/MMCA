package com.tikhomirov.mmac.di

import com.tikhomirov.domain.KekUseCase
import org.koin.dsl.module

val domain = module {

    factory { KekUseCase(get()) }

}