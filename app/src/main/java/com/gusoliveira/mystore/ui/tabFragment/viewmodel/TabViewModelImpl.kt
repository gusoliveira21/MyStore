package com.gusoliveira.mystore.ui.tabFragment.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.gusoliveira.domain.usecase.GetProductUseCase
import kotlinx.coroutines.launch

class TabViewModelImpl(private val getProductUseCase: GetProductUseCase) : TabViewModel() {


    init {
        getProdutList()
    }

    override val produtList = MutableLiveData<MutableList<Any>>()
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

    //TODO: Deveria fazer uma função pra cada retorno de lista?
    private fun getProdutListSuccess(list: List<List<Any>>) { //Pega lista de objetos e lista de categorias
        produtList.value = list[0].map { it }.toMutableList()
        categoryList.value = list[1].map { it }.toMutableList()
    }

    private fun getProdutListFailure() {
        error.value = "Não foi possível obter a lista de gatos!!"
    }

}