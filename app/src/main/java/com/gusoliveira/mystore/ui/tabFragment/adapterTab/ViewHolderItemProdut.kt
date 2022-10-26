package com.gusoliveira.mystore.ui.tabFragment.adapterTab

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.gusoliveira.mystore.databinding.ItemProdutBinding
import jp.wasabeef.glide.transformations.CropSquareTransformation

class ViewHolderItemProdut(item: ItemProdutBinding) : RecyclerView.ViewHolder(item.root) {
    var price = item.valueProdut
    var viewImagem = item.imageProdut
    var name = item.nameProdut

    fun putImage(link: String) {
        Glide
            .with(itemView.rootView.context)
            .load(link)
            .apply(RequestOptions.bitmapTransform(CropSquareTransformation()))
            .into(viewImagem)
    }
}


