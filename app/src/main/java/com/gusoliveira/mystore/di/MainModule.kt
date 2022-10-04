package com.gusoliveira.mystore.di

import com.gusoliveira.mystore.ui.main.MainViewModel
import com.gusoliveira.mystore.ui.main.MainViewModelImpl
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mainModule = module{
viewModel<MainViewModel> { MainViewModelImpl() }
}