package com.example.clean_Architecture_Kotlin.data.datasource

import com.example.clean_Architecture_Kotlin.data.models.MobileDataModel

interface IMobileDataSource {
    companion object{
        private const val login_path = "abc/def"
    }
   // @GET (login_path)
    fun getMobileDataModelData(): MobileDataModel
}