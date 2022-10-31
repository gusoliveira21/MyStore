package com.gusoliveira.mystore.di

import com.gusoliveira.data.api.MyStoreService
import com.gusoliveira.data.api.RetrofitInitializer
import com.gusoliveira.data.repository.MyStoreRepositoryImpl
import com.gusoliveira.domain.repository.MyStoreRepository
import com.gusoliveira.domain.usecase.GetCategoriesUseCase
import com.gusoliveira.domain.usecase.GetProductUseCase
import com.gusoliveira.mystore.ui.navigation.MainViewModel
import com.gusoliveira.mystore.ui.navigation.MainViewModelImpl
import com.gusoliveira.mystore.ui.tabFragment.viewmodel.TabViewModel
import com.gusoliveira.mystore.ui.tabFragment.viewmodel.TabViewModelImpl
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mainModule = module {
    // Services
    single<MyStoreService> { RetrofitInitializer().getRetrofitService() }


    // Repositories
    single<MyStoreRepository> { MyStoreRepositoryImpl(get()) }


    // Use Cases
    factory { GetProductUseCase(get()) }
    factory { GetCategoriesUseCase(get()) }


    // View Models
    viewModel<TabViewModel> { TabViewModelImpl(get()) }

    viewModel<MainViewModel> {
        MainViewModelImpl(get())
    }
}