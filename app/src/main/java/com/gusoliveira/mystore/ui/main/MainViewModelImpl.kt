package com.gusoliveira.mystore.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations

class MainViewModelImpl : MainViewModel() {
    override val indexPage = MutableLiveData<Int>()

    override val text: LiveData<String> = Transformations.map(indexPage) {
        "Hello world from section: $it"
    }

    override fun setIndex(index: Int) {
        indexPage.value = index
    }
}