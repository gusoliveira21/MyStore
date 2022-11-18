package com.gusoliveira.mystore.ui.home.productViewPager.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.gusoliveira.domain.entities.objectProduct.ProductEntity
import com.gusoliveira.mystore.databinding.ItemProdutBinding

class ItemAdapter(private val list: List<ProductEntity>) :
    ListAdapter<ProductEntity, ItemViewHolder>(DiffCallBack()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            ItemProdutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.setCardItem(list[position])
    }

    override fun getItemCount() = list.size
}

class DiffCallBack : DiffUtil.ItemCallback<ProductEntity>() {
    override fun areItemsTheSame(oldItem: ProductEntity, newItem: ProductEntity) =
        oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: ProductEntity, newItem: ProductEntity) =
        oldItem == newItem
}