package com.mathbrandino.testedozero

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class FormularioActivity : AppCompatActivity(R.layout.activity_formulario) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        findViewById<Button>(R.id.btnSalvar).setOnClickListener {
            val nome = findViewById<TextInputEditText>(R.id.campoNome)

            val produto = Produto(nome.text.toString())

            ProjetoDatabase.criarBanco(this).getProdutoDao().salva(produto)
            finish()
        }
    }
}