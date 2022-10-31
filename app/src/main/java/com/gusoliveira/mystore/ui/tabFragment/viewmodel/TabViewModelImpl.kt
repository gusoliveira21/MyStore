package com.gusoliveira.mystore.ui.tabFragment.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.gusoliveira.domain.entities.objectProduct.ProductEntity
import com.gusoliveira.domain.usecase.GetProductUseCase
import kotlinx.coroutines.launch

class TabViewModelImpl(private val getProductUseCase: GetProductUseCase) : TabViewModel() {
    init {
        getProdutList()
    }

    override val produtList = MutableLiveData<MutableList<Any>>()
    override var electronicsList = MutableLiveData<MutableList<ProductEntity>>()

    override val wClothingList = MutableLiveData<MutableList<ProductEntity>>()
    override val mClothingList = MutableLiveData<MutableList<ProductEntity>>()
    override val jeweleryList = MutableLiveData<MutableList<ProductEntity>>()

    override val categoryList = MutableLiveData<MutableList<Any>>()
    override val error = MutableLiveData<String>()


    override fun getProdutList() {
        viewModelScope.launch {
            val result = getProductUseCase.execute()
            result.handleResult(::getProdutListSuccess, ::getProdutListFailure)
        }
    }

    override fun onItemClicked(link: String) {
        TODO("Not yet implemented")
    }

    override fun getProductByCategory(allProducts: MutableList<ProductEntity>, category:String) {
        when(category){
            "electronics" -> electronicsList.value = selectCategory(allProducts, category)
            "women's clothing" -> wClothingList.value = selectCategory(allProducts, category)
            "men's clothing" -> mClothingList.value = selectCategory(allProducts, category)
            "jewelery" -> jeweleryList.value = selectCategory(allProducts, category)
        }
    }

    override fun selectCategory(allProducts: MutableList<ProductEntity>, category:String) =
        allProducts.filter { product -> product.category == category }.toMutableList()


    //TODO: Deveria fazer uma função pra cada retorno de lista?
    private fun getProdutListSuccess(list: List<List<Any>>) { //Pega lista de objetos e lista de categorias
        produtList.value = list[0].map { it }.toMutableList()
        categoryList.value = list[1].map { it }.toMutableList()
    }

    private fun getProdutListFailure() {
        error.value = "Não foi possível obter a lista de gatos!!"
    }

}