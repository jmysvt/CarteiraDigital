package com.example.carteiradigital.feature.carteirinha.presentation

import com.example.carteiradigital.feature.domain.model.Carteirinha

data class CarteirinhaUiState(
    val isLoading: Boolean = false,
    val carteirinha: Carteirinha? = null,
    val errorMessage: String? = null
)