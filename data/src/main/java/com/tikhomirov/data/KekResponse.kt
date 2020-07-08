package com.tikhomirov.data

import com.tikhomirov.domain.KekModel

class KekResponse {

    fun toModel(): KekModel {
        return KekModel("kek", -1)
    }

}