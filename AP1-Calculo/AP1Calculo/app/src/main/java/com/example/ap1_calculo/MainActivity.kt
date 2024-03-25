package com.example.ap1_calculo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val valorBrutoEntrada: EditText
        val valorSaida: EditText
        val valordesconto: EditText
        val calculo: Button
        val resetar: Button

        valorBrutoEntrada = findViewById<View>(R.id.valorBrutoEntrada) as EditText
        valorSaida = findViewById<View>(R.id.valorSaida) as EditText
        valordesconto = findViewById<View>(R.id.valordesconto) as EditText
        calculo = findViewById<View>(R.id.calcular) as Button
        resetar = findViewById<View>(R.id.reset) as Button

        calculo.setOnClickListener {
            val string = valorBrutoEntrada.text.toString()
            val string_desc = valordesconto.text.toString()
            val moeda = string.toInt()
            val cleber = string_desc.toInt()
            val i = moeda - cleber
            val decimal = i.toString()
            valorSaida.setText(decimal)

        }

        resetar.setOnClickListener {
            val vazio = null
            valorSaida.setText(vazio)
            valorBrutoEntrada.setText(vazio)
            valordesconto.setText(vazio)
        }

    }
}