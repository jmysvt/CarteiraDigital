package com.example.carteiradigital.feature.auth.data.repository

import com.example.carteiradigital.feature.domain.model.UsuarioLogado

interface AuthRepository {
    suspend fun login(login: String, senha: String): Result<UsuarioLogado>
}