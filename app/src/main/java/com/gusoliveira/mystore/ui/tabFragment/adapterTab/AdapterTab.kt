package com.gusoliveira.mystore.ui.tabFragment.adapterTab

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gusoliveira.domain.entities.objectCategory.CategoryEntity
import com.gusoliveira.mystore.databinding.ItemProdutBinding

class AdapterTab : RecyclerView.Adapter<ViewHolderItemProdut>() {
    var listObjectProdut: MutableList<CategoryEntity> = mutableListOf()

    override fun getItemCount() = listObjectProdut.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderItemProdut {
        val binding = ItemProdutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolderItemProdut(binding)
    }

    override fun onBindViewHolder(holder: ViewHolderItemProdut, position: Int) {
        //val produto = listObjectProdut[position]
        //holder.putImage(listObjectProdut[position])
    }

}