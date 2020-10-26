package com.example.tesouro_direto

import retrofit2.Call
import retrofit2.http.GET

interface ApiTitulos {
    @GET("titulos")
    fun getTitulos(): Call<List<Titulos>>

}