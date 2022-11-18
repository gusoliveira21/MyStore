package com.gusoliveira.mystore.ui.navigation

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

abstract class MainViewModel : ViewModel() {

    abstract val categories: LiveData<List<String>>

    abstract val errorCategories: LiveData<String>

    abstract fun getCategories()
}