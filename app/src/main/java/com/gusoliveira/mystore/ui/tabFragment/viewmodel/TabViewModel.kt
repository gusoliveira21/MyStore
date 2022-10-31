package com.gusoliveira.mystore.ui.tabFragment.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.gusoliveira.domain.entities.objectProduct.ProductEntity

abstract class TabViewModel : ViewModel() {

    abstract val produtList: LiveData<MutableList<Any>>
    abstract val electronicsList: LiveData<MutableList<ProductEntity>>
    abstract val wClothingList: LiveData<MutableList<ProductEntity>>
    abstract val mClothingList: LiveData<MutableList<ProductEntity>>
    abstract val jeweleryList: LiveData<MutableList<ProductEntity>>
    abstract val categoryList: LiveData<MutableList<Any>>

    abstract val error: LiveData<String>

    abstract fun getProdutList()

    abstract fun onItemClicked(link: String)

    abstract fun getProductByCategory(allProducts: MutableList<ProductEntity>, category: String)
    abstract fun selectCategory(
        allProducts: MutableList<ProductEntity>,
        category: String
    ): MutableList<ProductEntity>
}