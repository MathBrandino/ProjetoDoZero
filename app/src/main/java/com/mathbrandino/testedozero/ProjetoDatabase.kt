package com.mathbrandino.testedozero

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Produto::class], version = 1)
abstract class ProjetoDatabase : RoomDatabase() {

    abstract fun getProdutoDao(): ProdutoDao

    companion object {

        fun criarBanco(context: Context): ProjetoDatabase {

            val databaseBuilder =
                Room.databaseBuilder(context, ProjetoDatabase::class.java, "ProjetoDB")

            return databaseBuilder
                .allowMainThreadQueries()
                .build()
        }
    }
}