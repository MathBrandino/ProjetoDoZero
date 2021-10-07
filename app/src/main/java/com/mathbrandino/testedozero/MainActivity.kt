package com.mathbrandino.testedozero

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener {
            startActivity(Intent(this, FormularioActivity::class.java))
        }
    }

    override fun onResume() {
        super.onResume()

        val bancoDeDados = ProjetoDatabase.criarBanco(this)
        val produtoDao = bancoDeDados.getProdutoDao()
        val produtos = produtoDao.buscaTodos()

        val listaItems = findViewById<RecyclerView>(R.id.listaItems)

        listaItems.adapter = ListaAdapter(produtos)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menuCart -> {
                Toast.makeText(this, "Botão clicado", Toast.LENGTH_LONG).show()
            }
            else -> {
            }
        }

        return super.onOptionsItemSelected(item)
    }
}