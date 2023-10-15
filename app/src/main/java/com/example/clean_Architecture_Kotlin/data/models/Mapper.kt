package com.example.clean_Architecture_Kotlin.data.models

import com.example.clean_Architecture_Kotlin.domain.model.MobileDomainModel

fun MobileDataModel.toMobileDomainModel()= MobileDomainModel(
        name = this.name ?: "",
        brand=this.brand?:""
    )
