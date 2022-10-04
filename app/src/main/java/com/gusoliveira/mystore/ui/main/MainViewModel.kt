package com.gusoliveira.mystore.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

abstract class MainViewModel : ViewModel() {
    abstract val indexPage : MutableLiveData<Int>
    abstract val text: LiveData<String>
    abstract fun setIndex(index: Int)
}