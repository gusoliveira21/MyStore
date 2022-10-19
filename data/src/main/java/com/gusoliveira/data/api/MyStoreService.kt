package com.gusoliveira.data.api

import com.gusoliveira.data.model.ProductItem
import retrofit2.http.GET

interface MyStoreService {
@GET("products")
suspend fun getAllProductsList(): ProductItem
}