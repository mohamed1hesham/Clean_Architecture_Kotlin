package com.example.clean_Architecture_Kotlin.presentation.ui

import androidx.annotation.StringRes

data class MobileUiModel (
    val name:String,
    @StringRes val brand:Int?,
)

enum class BrandCategory(val firstLetter:String){
    IPHONE("P"),
    SAMSUNG("S"),

}