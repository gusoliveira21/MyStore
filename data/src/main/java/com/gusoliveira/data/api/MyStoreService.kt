package com.gusoliveira.data.api

import com.gusoliveira.data.model.ItemProduct
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MyStoreService {
    //https://fakestoreapi.com/products/category/jewelery

    // 3/gallery/search/?q=cats
    //@GET("3/gallery/search/")
    //suspend fun catList(@Query("q") params: String): CatDataClass

    @GET("products/category/{id}")
    suspend fun getProductsByCategory(@Path("id") params: String): List<ItemProduct>

    @GET("products")
    suspend fun getAllProductsList(): List<ItemProduct>

    @GET("products/categories")
    suspend fun getCategoriesList(): List<String>
}