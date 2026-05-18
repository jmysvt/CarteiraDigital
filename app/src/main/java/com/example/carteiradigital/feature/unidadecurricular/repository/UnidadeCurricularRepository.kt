package com.example.carteiradigital.feature.unidadecurricular.repository

import com.example.carteiradigital.feature.domain.UnidadeCurricular

interface UnidadeCurricularRepository {
    suspend fun buscarUnidadesCurriculares(): Result<List<UnidadeCurricular>>
}