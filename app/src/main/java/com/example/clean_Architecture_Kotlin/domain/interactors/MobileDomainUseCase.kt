package com.example.clean_Architecture_Kotlin.domain.interactors

import com.example.clean_Architecture_Kotlin.domain.repo.IMobileRepo

class MobileDomainUseCase (private val mobileRepo:IMobileRepo) {

    suspend fun getMobileData() = mobileRepo.getMobileDomainModelData()


}
