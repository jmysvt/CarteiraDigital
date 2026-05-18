package com.example.carteiradigital.feature.carteirinha.presentation.screen

import com.example.carteiradigital.feature.domain.UnidadeCurricular

data class UnidadeCurricularUiState(
    val isLoading: Boolean = false,
    val unidadesCurriculares: List<UnidadeCurricular> = emptyList(),
    val errorMessage: String? = null
)