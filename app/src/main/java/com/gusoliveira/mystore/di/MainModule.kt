package com.gusoliveira.mystore.di

import com.gusoliveira.mystore.ui.mainFragment.MainViewModel
import com.gusoliveira.mystore.ui.mainFragment.MainViewModelImpl
import com.gusoliveira.mystore.ui.tabFragment.viewmodel.TabViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mainModule = module {
    viewModel<MainViewModel> { MainViewModelImpl() }
    viewModel<TabViewModel> { TabViewModel() }
}