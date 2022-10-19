package com.gusoliveira.mystore.di

import com.gusoliveira.data.api.MyStoreService
import com.gusoliveira.data.api.RetrofitInitializer
import com.gusoliveira.data.repository.MyStoreRepositoryImpl
import com.gusoliveira.domain.repository.MyStoreRepository
import com.gusoliveira.domain.usecase.GetProductUseCase
import com.gusoliveira.mystore.ui.tabFragment.viewmodel.TabViewModel
import com.gusoliveira.mystore.ui.tabFragment.viewmodel.TabViewModelImpl
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mainModule = module {
    single<MyStoreService> { RetrofitInitializer().getRetrofitService() }

    single<MyStoreRepository> { MyStoreRepositoryImpl(get()) }

    factory { GetProductUseCase(get()) }

    viewModel<TabViewModel> { TabViewModelImpl(get()) }
}