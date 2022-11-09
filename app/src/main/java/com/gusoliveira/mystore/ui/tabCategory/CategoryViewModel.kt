package com.gusoliveira.mystore.ui.tabCategory

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

abstract class CategoryViewModel : ViewModel() {
    abstract val categories: LiveData<List<String>>
    abstract val errorCategories: LiveData<String>
    abstract fun getCategories()
}