package com.example.clean_Architecture_Kotlin.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.clean_Architecture_Kotlin.domain.interactors.MobileDomainUseCase
import com.example.clean_Architecture_Kotlin.presentation.models.toUiModel
import kotlinx.coroutines.launch

class MobileViewModel(val mobileusecase: MobileDomainUseCase) : ViewModel() {


    init {
        viewModelScope.launch {
            val result = mobileusecase.getMobileData().toUiModel()

        }
    }
}