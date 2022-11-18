package com.gusoliveira.mystore.ui.home.productViewPager.adapter

import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.gusoliveira.domain.entities.objectProduct.ProductEntity
import com.gusoliveira.mystore.databinding.ItemProdutBinding
import jp.wasabeef.glide.transformations.CropSquareTransformation

class ItemViewHolder(private val binding: ItemProdutBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun setCardItem(product: ProductEntity) {
        binding.idNameProduct.text = product.title
        binding.idPriceProduct.text = product.price.toString()
        setImage(product.image, binding.idImageProduct)
    }

    private fun setImage(link: String, imageSource: ImageView) {
        Glide
            .with(imageSource.rootView.context)
            .load(link)
            .apply(RequestOptions.bitmapTransform(CropSquareTransformation()))
            .into(imageSource)
    }
}