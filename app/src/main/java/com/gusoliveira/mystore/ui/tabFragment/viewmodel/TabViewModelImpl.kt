package com.gusoliveira.mystore.ui.tabFragment.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.gusoliveira.domain.entities.ProductEntity
import com.gusoliveira.domain.usecase.GetProductUseCase
import kotlinx.coroutines.launch

class TabViewModelImpl(private val getProductUseCase: GetProductUseCase) : TabViewModel() {
    var currentTabContent: String = "Current on Tab One!"
    var currentTab: String = "Tab One!"
    private val currentTabObserver: MutableLiveData<String> = MutableLiveData()

    // lógica é programada no view model a view geralmente so é atualizada
    // separando responsabilidades CoC (cerparation of concern)
    override fun getCurrent(tab: String): String {
        if (currentTab != tab) {
            currentTabContent = "Toque anterior: $currentTab\nÚltimo toque: $tab"
            currentTab = tab
        }
        return currentTabContent
    }

    override fun getContentObserver(): MutableLiveData<String> = currentTabObserver




    init {
        getProdutList("")
    }

    override val produtList = MutableLiveData<MutableList<ProductEntity>>()
    override val error = MutableLiveData<String>()

    override fun getProdutList(wordToSearch: String) {
            viewModelScope.launch {
                val result = getProductUseCase.execute()
                result.handleResult(::getProdutListSuccess, ::getProdutListFailure)
            }
    }

    override fun onItemClicked(link: String) {
        TODO("Not yet implemented")
    }

    private fun getProdutListSuccess(list: List<ProductEntity>) {
        produtList.value = list.map { it }.toMutableList()
        Log.e("test","${produtList.value}")
    }

    private fun getProdutListFailure() {
        error.value = "Não foi possível obter a lista de gatos!!"
        Log.e("test","${error.value}")
    }

}