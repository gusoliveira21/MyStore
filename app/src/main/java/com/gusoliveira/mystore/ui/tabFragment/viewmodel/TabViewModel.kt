package com.gusoliveira.mystore.ui.tabFragment.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gusoliveira.domain.entities.ProductEntity

abstract class TabViewModel: ViewModel() {

    abstract val produtList: LiveData<MutableList<ProductEntity>>

    abstract val error: LiveData<String>

    abstract fun getProdutList(wordToSearch:String = "")

    abstract fun onItemClicked(link: String)

    abstract fun getCurrent(tab: String): String

    abstract fun getContentObserver(): MutableLiveData<String>

}