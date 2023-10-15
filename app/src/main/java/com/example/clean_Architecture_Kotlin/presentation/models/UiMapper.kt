package com.example.clean_Architecture_Kotlin.presentation.models

import com.example.clean_Architecture_Kotlin.R
import com.example.clean_Architecture_Kotlin.domain.model.MobileDomainModel
import com.example.clean_Architecture_Kotlin.presentation.ui.BrandCategory
import com.example.clean_Architecture_Kotlin.presentation.ui.MobileUiModel


fun MobileDomainModel.toUiModel() = MobileUiModel(
    name = this.name,
    brand = mapFirstLetterToBrandName(this.brand)
)
fun mapFirstLetterToBrandName(firstLetter:String): Int?{
return when(firstLetter){
    BrandCategory.SAMSUNG.firstLetter-> R.string.brand_category_Samsung
    BrandCategory.IPHONE.firstLetter->R.string.brand_category_Iphone
    else-> null
}
}