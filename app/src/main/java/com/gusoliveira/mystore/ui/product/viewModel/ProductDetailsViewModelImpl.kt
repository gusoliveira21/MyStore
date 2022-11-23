package com.gusoliveira.mystore.ui.product.viewModel

import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.google.android.material.textview.MaterialTextView
import com.gusoliveira.mystore.databinding.FragmentProductDetailsBinding
import com.gusoliveira.mystore.ui.product.ProductDetailsFragmentArgs
import jp.wasabeef.glide.transformations.CropSquareTransformation

class ProductDetailsViewModelImpl(
    private val args: ProductDetailsFragmentArgs,
) : ProductDetailsViewModel() {

    override fun setProduct(binding: FragmentProductDetailsBinding) {
        setImage(binding)
        setTitle(binding.idProductTitle)
        setDescription(binding.idDescriptionProduct)
    }

    override fun setImage(binding: FragmentProductDetailsBinding) {
        Glide
            .with(binding.root.context)
            .load(args.product.image)
            .apply(RequestOptions.bitmapTransform(CropSquareTransformation()))
            .into(binding.idImageProduct)
    }

    override fun setTitle(idProductTitle: MaterialTextView) {
        idProductTitle.text = args.product.title
    }

    override fun setDescription(idDescriptionProduct: MaterialTextView) {
        idDescriptionProduct.text = args.product.description
    }


}