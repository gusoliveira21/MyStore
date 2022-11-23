package com.gusoliveira.mystore.ui.product.viewModel

import androidx.lifecycle.ViewModel
import com.google.android.material.textview.MaterialTextView
import com.gusoliveira.mystore.databinding.FragmentProductDetailsBinding

abstract class ProductDetailsViewModel : ViewModel() {
    abstract fun setProduct(binding: FragmentProductDetailsBinding)
    abstract fun setImage(binding: FragmentProductDetailsBinding)
    abstract fun setTitle(idProductTitle: MaterialTextView)
    abstract fun setDescription(idDescriptionProduct: MaterialTextView)
}