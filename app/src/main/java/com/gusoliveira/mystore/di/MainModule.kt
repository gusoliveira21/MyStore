package com.gusoliveira.mystore.di

import androidx.navigation.NavController
import com.gusoliveira.data.api.MyStoreService
import com.gusoliveira.data.api.RetrofitInitializer
import com.gusoliveira.data.repository.MyStoreRepositoryImpl
import com.gusoliveira.domain.repository.MyStoreRepository
import com.gusoliveira.domain.usecase.GetAllProductsUseCase
import com.gusoliveira.domain.usecase.GetCategoriesUseCase
import com.gusoliveira.domain.usecase.GetProductsByCategoryUseCase
import com.gusoliveira.mystore.ui.home.homeTabLayout.adapter.viewModel.HomeViewModel
import com.gusoliveira.mystore.ui.home.homeTabLayout.adapter.viewModel.HomeViewModelImpl
import com.gusoliveira.mystore.ui.home.productViewPager.viewModel.ProductViewModel
import com.gusoliveira.mystore.ui.home.productViewPager.viewModel.ProductViewModelImpl
import com.gusoliveira.mystore.ui.product.ProductDetailsFragmentArgs
import com.gusoliveira.mystore.ui.product.viewModel.ProductDetailsViewModel
import com.gusoliveira.mystore.ui.product.viewModel.ProductDetailsViewModelImpl
import com.gusoliveira.mystore.ui.router.Router
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.parameter.parametersOf
import org.koin.dsl.module

val mainModule = module {
    // Services
    single<MyStoreService> { RetrofitInitializer().getRetrofitService() }

    // Repositories
    single<MyStoreRepository> { MyStoreRepositoryImpl(get()) }

    factory { GetAllProductsUseCase(get()) }

    factory { GetCategoriesUseCase(get()) }

    factory { GetProductsByCategoryUseCase(get()) }

    factory { (navController: NavController) -> Router(navController) }

    viewModel<HomeViewModel> { HomeViewModelImpl(get()) }

    viewModel<ProductViewModel> { (navController: NavController) ->
        ProductViewModelImpl(get(), get { parametersOf(navController) })
    }
    viewModel<ProductDetailsViewModel> { (args: ProductDetailsFragmentArgs) ->
        ProductDetailsViewModelImpl(args)
    }
}