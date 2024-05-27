package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Recuperar os componentes EditText
        //Criar uma Varivel e associar(=) o componente de Ui(EditText)
        //Recuperar o button da Tela

        val edtpeso = findViewById<TextInputEditText>(R.id.edtext_peso)
        val edtaltura = findViewById<TextInputEditText>(R.id.edttext_altura)
        val btcaucular = findViewById<Button>(R.id.btn_caucular)

        // As val de cima recuperou a parte logica da tela para eu poder utilizar e da fucionalidades para meu aplicativo.
        // Para receber o valor indicado pelo o usuario e para utilizar o button


        //Colocar acao no bnt
        btcaucular.setOnClickListener {
            val peso: Float = edtpeso.text.toString().toFloat()
            val altura: Float = edtaltura.text.toString().toFloat()

            val alturaQ2 = altura * altura
            val resultado = peso/alturaQ2

            println(resultado)
        }

    }
}