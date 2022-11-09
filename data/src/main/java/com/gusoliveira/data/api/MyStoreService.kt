package com.gusoliveira.data.api

import com.gusoliveira.data.model.ItemProduct
import retrofit2.http.GET

interface MyStoreService {
    @GET("products")
    suspend fun getAllProductsList(): List<ItemProduct>

    @GET("products/categories")
    suspend fun getCategoriesList(): List<String>
}