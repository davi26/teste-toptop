package com.example.tesouro_direto

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.widget.TextView
import android.widget.Toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Tela_titulos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_titulos)

        val retrofit = ConfiguracaoApi().apiTitulos()
        val listaTitulos = retrofit.getTitulos()

        listaTitulos.enqueue(object: Callback<List<Titulos>> {

            override fun onResponse(call: Call<List<Titulos>>, response: Response<List<Titulos>>) {

                response.body()?.forEach {
                    val listaTP = TextView(baseContext)

                    listaTP.text = "${it.titulo} - ${it.rentabilidadeAnual} - ${it.investimentoMinimo} - ${it.precoUnitario} - ${it.vencimento}"
                    listaTP.setTextSize(TypedValue.COMPLEX_UNIT_SP, 15f)
                    listaTP.setTextColor(Color.parseColor("#000000"))

                    ll_tp.dView(listaTP)
                }

            }

            override fun onFailure(call: Call<List<Titulos>>, t: Throwable) {
                Toast.makeText(this@Tela_titulos, "something went wrong", Toast.LENGTH_SHORT).show()
            }
        })
    }


}