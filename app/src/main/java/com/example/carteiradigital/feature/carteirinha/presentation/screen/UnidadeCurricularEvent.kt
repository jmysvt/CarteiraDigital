package com.example.carteiradigital.feature.carteirinha.presentation.screen

sealed interface UnidadeCurricularEvent {
    data object OnCarregarDados : UnidadeCurricularEvent
    data object OnTentarNovamenteClick : UnidadeCurricularEvent
    data object OnVoltarClick : UnidadeCurricularEvent
}