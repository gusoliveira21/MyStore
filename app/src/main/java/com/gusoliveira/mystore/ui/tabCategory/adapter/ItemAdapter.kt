package com.gusoliveira.mystore.ui.tabCategory.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gusoliveira.mystore.databinding.ItemProdutBinding
import com.gusoliveira.mystore.ui.tabCategory.adapter.ItemAdapter.ItemViewHolder

class ItemAdapter(private val list: List<String>) : RecyclerView.Adapter<ItemViewHolder>() {


    class ItemViewHolder(item: ItemProdutBinding) : RecyclerView.ViewHolder(item.root) {
        val nameProd = item.idNameProduct
        val priceProd = item.idPriceProduct
        val imageProd = item.idImageProduct
        fun setCardItem(name: String, price: Double) {
            nameProd.text = name
            priceProd.text = price.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        var binding = ItemProdutBinding.inflate(LayoutInflater.from(parent.context))
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.setCardItem("Notebook CCE", 11.3)
    }

    override fun getItemCount() = list.size
}