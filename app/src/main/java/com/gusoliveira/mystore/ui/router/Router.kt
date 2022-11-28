package com.gusoliveira.mystore.ui.router

import androidx.navigation.NavController
import com.gusoliveira.domain.entities.objectProduct.ProductEntity
import com.gusoliveira.mystore.ui.home.homeTabLayout.adapter.HomeFragmentDirections
import timber.log.Timber

class Router(private val navController: NavController) {
    fun toProduct(product: ProductEntity) {
        navController.navigate(HomeFragmentDirections.toProductDetailsFragment(product))
    }
}