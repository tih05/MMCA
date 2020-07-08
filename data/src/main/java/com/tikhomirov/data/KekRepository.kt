package com.tikhomirov.data

import com.tikhomirov.domain.KekDataSource
import com.tikhomirov.domain.KekModel

class KekRepository : KekDataSource {

    override fun lol(): KekModel {
        val kekResponse = KekResponse()
        return kekResponse.toModel()
    }

}