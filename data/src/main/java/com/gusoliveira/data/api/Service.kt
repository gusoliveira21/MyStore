package com.gusoliveira.data.api

import com.gusoliveira.data.model.Product
import retrofit2.http.GET

interface Service {
    companion object{
        //TODO -> products"
        const val RESOURCE_URL = "products"
    }
@GET(RESOURCE_URL)
suspend fun getAllProductsList(): Product
}