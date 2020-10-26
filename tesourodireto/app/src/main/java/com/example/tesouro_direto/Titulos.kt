package com.example.tesouro_direto

data class Titulos (
    val titulo: String,
    val rentabilidadeAnual: Double,
    val investimentoMinimo: Double,
    val precoUnitario: Double,
    val vencimento: String
)