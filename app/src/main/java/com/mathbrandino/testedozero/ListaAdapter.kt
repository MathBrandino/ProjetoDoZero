package com.mathbrandino.testedozero

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListaAdapter(private val items: List<Produto>) :
    RecyclerView.Adapter<ListaAdapter.ListaViewHolder>() {

    inner class ListaViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun bind(item: Produto) {
            itemView.findViewById<TextView>(R.id.itemText).text = item.nome
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return ListaViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListaViewHolder, position: Int) =
        holder.bind(items[position])

    override fun getItemCount() = items.size
}