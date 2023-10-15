package com.example.clean_Architecture_Kotlin.data.repo

import com.example.clean_Architecture_Kotlin.data.datasource.MobileDataSource
import com.example.clean_Architecture_Kotlin.data.models.toMobileDomainModel
import com.example.clean_Architecture_Kotlin.domain.model.MobileDomainModel
import com.example.clean_Architecture_Kotlin.domain.repo.IMobileRepo

class MobileRepoImplementation(private val datasource: MobileDataSource) : IMobileRepo {
    override suspend fun getMobileDomainModelData(): MobileDomainModel {
        return datasource.getMobileDataModelData().toMobileDomainModel()
    }

}