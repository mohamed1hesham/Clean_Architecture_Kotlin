package com.example.clean_Architecture_Kotlin.domain.repo

import com.example.clean_Architecture_Kotlin.domain.model.MobileDomainModel

interface IMobileRepo {
    suspend fun getMobileDomainModelData(): MobileDomainModel
}