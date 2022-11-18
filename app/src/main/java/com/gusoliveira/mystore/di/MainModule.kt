package com.gusoliveira.mystore.di

import com.gusoliveira.data.api.MyStoreService
import com.gusoliveira.data.api.RetrofitInitializer
import com.gusoliveira.data.repository.MyStoreRepositoryImpl
import com.gusoliveira.domain.repository.MyStoreRepository
import com.gusoliveira.domain.usecase.GetCategoriesUseCase
import com.gusoliveira.domain.usecase.GetAllProductsUseCase
import com.gusoliveira.domain.usecase.GetProductsByCategoryUseCase
import com.gusoliveira.mystore.ui.home.homeTabLayout.adapter.viewModel.HomeViewModel
import com.gusoliveira.mystore.ui.home.homeTabLayout.adapter.viewModel.HomeViewModelImpl
import com.gusoliveira.mystore.ui.home.productViewPager.viewModel.ProductViewModel
import com.gusoliveira.mystore.ui.home.productViewPager.viewModel.ProductViewModelImpl

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mainModule = module {
    // Services
    single<MyStoreService> { RetrofitInitializer().getRetrofitService() }


    // Repositories
    single<MyStoreRepository> { MyStoreRepositoryImpl(get()) }

    factory { GetAllProductsUseCase(get()) }

    factory { GetCategoriesUseCase(get()) }

    factory { GetProductsByCategoryUseCase(get()) }

    viewModel<HomeViewModel> { HomeViewModelImpl(get()) }
    viewModel<ProductViewModel> { ProductViewModelImpl(get()) }

}