package com.mathbrandino.testedozero

import androidx.room.*

@Dao
interface ProdutoDao {

    @Insert
    fun salva(produto: Produto)

    @Update
    fun atualiza(produto: Produto)

    @Delete
    fun deleta(produto: Produto)

    @Query("select * from Produto")
    fun buscaTodos() : List<Produto>
}