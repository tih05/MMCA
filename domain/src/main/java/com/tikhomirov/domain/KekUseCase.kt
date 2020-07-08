package com.tikhomirov.domain

class KekUseCase(private val kekDataSource: KekDataSource) {

    fun execute(): KekModel {
        return kekDataSource.lol()
    }

}