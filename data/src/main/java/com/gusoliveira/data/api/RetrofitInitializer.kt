package com.gusoliveira.data.api

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory

class RetrofitInitializer {
    private val moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()


    private val retrofit:Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("https://fakestoreapi.com/")
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .build()
    }

    fun getRetrofitService(): MyStoreService = retrofit.create(MyStoreService::class.java)
}