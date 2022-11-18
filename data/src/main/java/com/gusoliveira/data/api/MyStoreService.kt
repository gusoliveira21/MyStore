package com.gusoliveira.data.api

import com.gusoliveira.data.model.ItemProduct
import retrofit2.http.GET
import retrofit2.http.Path

interface MyStoreService {
    @GET("products/category/{id}")
    suspend fun getProductsByCategory(@Path("id") params: String): List<ItemProduct>

    @GET("products")
    suspend fun getAllProductsList(): List<ItemProduct>

    @GET("products/categories")
    suspend fun getCategoriesList(): List<String>
}