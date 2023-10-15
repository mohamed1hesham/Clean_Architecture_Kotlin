package com.example.clean_Architecture_Kotlin.data.datasource

import com.example.clean_Architecture_Kotlin.data.models.MobileDataModel
import kotlinx.coroutines.CoroutineDispatcher

class MobileDataSource (
    private val api:IMobileDataSource,
    private val ioDispatcher: CoroutineDispatcher
) {

    fun getMobileDataModelData(): MobileDataModel {
        return api.getMobileDataModelData()
    }
}