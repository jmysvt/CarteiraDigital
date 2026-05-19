package com.example.carteiradigital.feature.carteirinha.data.repository

import com.example.carteiradigital.feature.domain.model.Carteirinha
import kotlinx.coroutines.delay

class FakeCarteirinhaRepository : CarteirinhaRepository {
    override suspend fun buscarCarteirinha(): Result<Carteirinha> {
        delay(1500)

        return Result.success(
            Carteirinha(
                nome = "Jamily Alecrim",
                curso = "Técnica em Desenvolvimento de Sistemas",
                turma = "4DEVM-T1",
                matricula = "20260001",
                unidade = "SENAI Anchieta",
                status = "Ativo",
                qrCodeContent = "MATRICULA:20260001;ALUNO:Jamily Alecrim;TURMA:4DEVM-T1"
            )
        )
    }
}