package com.gusoliveira.mystore.ui.home.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

abstract class HomeViewModel : ViewModel() {
    abstract val categories: LiveData<List<String>>
    abstract val errorCategories: LiveData<String>
    abstract fun getCategories()
}