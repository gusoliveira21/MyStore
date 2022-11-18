package com.gusoliveira.mystore.ui.home.homeTabLayout.adapter.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

abstract class HomeViewModel : ViewModel() {
    abstract val categories: LiveData<List<String>>
    abstract val errorCategories: LiveData<String>
    abstract fun getCategories()
    abstract fun getCategoriesSuccess(categories: List<String>)
    abstract fun getCategoriesFailed()
}