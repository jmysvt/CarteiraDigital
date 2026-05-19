package com.example.carteiradigital.feature.carteirinha.data.repository

import com.example.carteiradigital.feature.domain.model.Carteirinha

interface CarteirinhaRepository {
    suspend fun buscarCarteirinha(): Result<Carteirinha>
}