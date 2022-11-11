package com.gusoliveira.mystore.ui.tabCategory

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.gusoliveira.domain.usecase.GetCategoriesUseCase
import kotlinx.coroutines.launch

class CategoryViewModelImpl(
    private val getCategoriesUseCase: GetCategoriesUseCase
) : CategoryViewModel() {
    override val categories = MutableLiveData<List<String>>()
    override val errorCategories  = MutableLiveData<String>()

    init {
        getCategories()
    }

    override fun getCategories() {
        viewModelScope.launch {
            val result = getCategoriesUseCase.execute()
            result.handleResult(::getCategoriesSuccess, ::getCategoriesFailed)
        }
    }

    private fun getCategoriesSuccess(categories: List<String>) {
        this.categories.value = categories
        Log.i("teste", "$categories")
    }

    private fun getCategoriesFailed() {
        errorCategories.value = "Qualquer erro aqui"
        Log.e("teste", "Qualquer erro aqui")

    }
}