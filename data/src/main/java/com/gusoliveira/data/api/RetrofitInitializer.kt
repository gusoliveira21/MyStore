package com.gusoliveira.data.api

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
    fun getRetrofitService(): MyStoreService = retrofit.create(MyStoreService::class.java)
}