package com.mathbrandino.testedozero

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Produto(
   val nome: String,
   @PrimaryKey(autoGenerate = true) val id : Int = 0
)
