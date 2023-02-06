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

    fun favoriteProduct() {
        //TODO implementar funcionalidade de favoritar itens
    }

    fun clickedProduct(product: ProductEntity, onClickItem: (ProductEntity) -> Unit) {
        binding.cardview.setOnClickListener { onClickItem(product) }
    }
//TODO: mudar setCardItem para setupCardItem
    fun setCardItem(product: ProductEntity) {
        binding.idNameProduct.text = product.title
        binding.idPriceProduct.text = "R$ " + product.price
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