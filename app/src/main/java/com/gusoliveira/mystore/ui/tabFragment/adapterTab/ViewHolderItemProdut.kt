package com.gusoliveira.mystore.ui.tabFragment.adapterTab

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.gusoliveira.domain.entities.objectProduct.ProductEntity
import com.gusoliveira.mystore.databinding.ItemProdutBinding
import jp.wasabeef.glide.transformations.CropSquareTransformation
import org.koin.core.component.getScopeName

class ViewHolderItemProdut(item: ItemProdutBinding) : RecyclerView.ViewHolder(item.root) {
    var viewImagem = item.imageProdut
    var price = item.valueProdut
    var name = item.nameProdut

    fun setupCardProduct(product: ProductEntity) {
        setImageProduct(product.image)
        setPriceProduct(product.price)
        setNameProduct(product.title)
    }

    private fun setPriceProduct(priceProduct : Double) {
        price.text = priceProduct.toString()
    }

    private fun setNameProduct(nameProduct : String) {
        name.text = nameProduct
    }

    private fun setImageProduct(linkProduct: String){
        Glide
            .with(itemView.rootView.context)
            .load(linkProduct)
            .apply(RequestOptions.bitmapTransform(CropSquareTransformation()))
            .into(viewImagem)
    }
}


