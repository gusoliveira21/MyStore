package com.gusoliveira.mystore.ui.home.homeTabLayout.adapter.viewModel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.gusoliveira.domain.entities.objectProduct.ProductEntity
import com.gusoliveira.domain.usecase.GetCategoriesUseCase
import com.gusoliveira.mystore.ui.router.Router
import kotlinx.coroutines.launch

class HomeViewModelImpl(
    private val getCategoriesUseCase: GetCategoriesUseCase,
) : HomeViewModel() {
    override val categories = MutableLiveData<List<String>>()
    override val errorCategories = MutableLiveData<String>()

    init {
        getCategories()
    }

    override fun getCategories() {
        viewModelScope.launch {
            val result = getCategoriesUseCase.execute()
            result.handleResult(::getCategoriesSuccess, ::getCategoriesFailed)
        }
    }

    override fun getCategoriesSuccess(categories: List<String>) {
        this.categories.value = categories
    }

    override fun getCategoriesFailed() {
        errorCategories.value = "Qualquer erro aqui"
        Log.e("teste", "Qualquer erro aqui")
    }
}