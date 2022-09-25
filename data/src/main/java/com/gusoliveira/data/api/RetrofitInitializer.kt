package com.gusoliveira.data.api

import com.gusoliveira.data.model.Product
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInitializer {
    companion object {
        private const val BASE_URL = "https://fakestoreapi.com/"
    }
    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    fun getRetrofitService(): Service = retrofit.create(Service::class.java)
}