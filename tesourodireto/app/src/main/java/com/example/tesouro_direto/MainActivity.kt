package com.example.tesouro_direto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun verTitulos(componente: View){
        val telaTitulos = Intent(this, Tela_titulos::class.java)
        startActivity(telaTitulos)
    }
}