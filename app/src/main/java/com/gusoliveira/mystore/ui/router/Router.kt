package com.gusoliveira.mystore.ui.router

import android.util.Log
import androidx.navigation.NavController
import com.gusoliveira.domain.entities.objectProduct.ProductEntity

class Router(private val navController: NavController) {
    fun homeFragmentToProductSelected(product:ProductEntity){
        Log.e("log","Item -> ${product.title} FOI CLICADO")
        //navController.navigate(MainFragmentDirections.actionMainFragmentToFullscreenImageFragment(link))
    }
}