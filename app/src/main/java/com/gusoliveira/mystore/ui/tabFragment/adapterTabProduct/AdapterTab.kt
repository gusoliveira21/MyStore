package com.gusoliveira.mystore.ui.tabFragment.adapterTabProduct

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gusoliveira.domain.entities.objectProduct.ProductEntity
import com.gusoliveira.mystore.databinding.ItemProdutBinding

class AdapterTab : RecyclerView.Adapter<ViewHolderItemProdut>() {
    var listObjectProdut: MutableList<ProductEntity> = mutableListOf()
    override fun getItemCount() = listObjectProdut.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderItemProdut {
        val binding = ItemProdutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolderItemProdut(binding)
    }

    override fun onBindViewHolder(holder: ViewHolderItemProdut, position: Int) {

        holder.setupCardProduct(listObjectProdut[position])
        Log.e("test","Adapter: ${listObjectProdut[position].category}")
    }

}