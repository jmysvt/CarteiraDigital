package com.example.carteiradigital.feature.unidadecurricular.data.repository

import com.example.carteiradigital.feature.unidadecurricular.domain.model.UnidadeCurricular

interface UnidadeCurricularRepository {
    suspend fun buscarUnidadesCurriculares(): Result<List<UnidadeCurricular>>
}