package com.example.carteiradigital.feature.home

sealed interface HomeEvent {
    data object OnCarteirinhaClick : HomeEvent
    data object OnUnidadesCurricularesClick : HomeEvent
}