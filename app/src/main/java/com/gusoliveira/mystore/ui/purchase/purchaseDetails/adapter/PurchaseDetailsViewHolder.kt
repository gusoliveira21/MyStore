package com.gusoliveira.mystore.ui.purchase.purchaseDetails.adapter

import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.gusoliveira.domain.entities.objectProduct.ProductEntity
import com.gusoliveira.mystore.databinding.ItemProductPurchaseBinding
import com.gusoliveira.mystore.util.formatCurrency.Format
import com.gusoliveira.mystore.util.formatCurrency.Format.Companion.formatCurrency
import jp.wasabeef.glide.transformations.CropSquareTransformation

class PurchaseDetailsViewHolder(private val binding: ItemProductPurchaseBinding) :
    RecyclerView.ViewHolder(binding.root) {

        fun setupCardItemPurchase(product: ProductEntity){
            binding.idNameProduct.text = product.title
            binding.idPriceProduct.text = formatCurrency(product.price)
            setImage(product.image, binding.idImageProduct)
        }

        private fun setImage(link: String, imageSource: ImageView){
            Glide
                .with(imageSource.rootView.context)
                .load(link)
                .apply(RequestOptions.bitmapTransform(CropSquareTransformation()))
                .into(imageSource)
        }
}