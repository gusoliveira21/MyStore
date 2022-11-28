package com.gusoliveira.mystore.ui.home.productViewPager.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.gusoliveira.domain.entities.objectProduct.ProductEntity

abstract class ProductViewModel : ViewModel() {
    abstract val product: LiveData<List<ProductEntity>>
    abstract val errorProduct: LiveData<String>
    abstract fun getProducts(category: String)
    abstract fun getProductSuccess(products: List<ProductEntity>)
    abstract fun getProductFailed()
    abstract fun onProductClicked(product: ProductEntity)
}