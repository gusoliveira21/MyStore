package com.gusoliveira.mystore.ui.home.productViewPager.viewModel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.gusoliveira.domain.entities.objectProduct.ProductEntity
import com.gusoliveira.domain.usecase.GetProductsByCategoryUseCase
import kotlinx.coroutines.launch

class ProductViewModelImpl(private val getProductsByCategories: GetProductsByCategoryUseCase) :
    ProductViewModel() {
    override val product = MutableLiveData<List<ProductEntity>>()
    override val errorProduct = MutableLiveData<String>()

    override fun getProducts(category: String) {
        viewModelScope.launch {
            val result = getProductsByCategories.execute(category)
            result.handleResult(::getProductSuccess, ::getProductFailed)
        }
    }

    override fun getProductSuccess(products: List<ProductEntity>) {
        this.product.value = products
    }

    override fun getProductFailed() {
        this.errorProduct.value = "Erro ao obter produtos"
        Log.e("log", "Erro ao obter produtos")
    }

}