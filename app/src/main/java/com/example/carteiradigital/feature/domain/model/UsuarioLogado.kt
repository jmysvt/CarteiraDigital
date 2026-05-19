package com.example.carteiradigital.feature.domain.model

data class UsuarioLogado(
    val id: String,
    val nome: String,
    val token: String
)