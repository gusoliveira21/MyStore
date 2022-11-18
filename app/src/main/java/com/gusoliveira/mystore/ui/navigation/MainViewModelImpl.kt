package com.gusoliveira.mystore.ui.navigation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.gusoliveira.domain.usecase.GetCategoriesUseCase
import kotlinx.coroutines.launch

class MainViewModelImpl(
    private val getCategoriesUseCase: GetCategoriesUseCase
) : MainViewModel() {

    override val categories = MutableLiveData<List<String>>()

    override val errorCategories = MutableLiveData<String>()

    override fun getCategories() {
        viewModelScope.launch {
            val result = getCategoriesUseCase.execute()
            result.handleResult(::getCategoriesSuccess, ::getCategoriesFailed)
        }
    }

    private fun getCategoriesSuccess(categories: List<String>) {
        this.categories.value = categories
    }

    private fun getCategoriesFailed() {
        errorCategories.value = "Qualquer erro aqui"
    }
}