package com.example.carteiradigital.core.session

data class LoggedUser(
    val id: String,
    val nome: String,
    val descricao: String = "Aluno logado",
    val token: String
)