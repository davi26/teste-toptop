package com.example.tesouro_direto

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ConfiguracaoApi {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://5f96189c11ab98001603a42f.mockapi.io/api/tesouro-direto/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun apiTitulos() = retrofit.create(ApiTitulos::class.java)

}