package com.gusoliveira.data.auth

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class AuthInitializer {
    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://ib3ia2wmhj.execute-api.us-east-1.amazonaws.com")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val authService: AuthService = retrofit.create(AuthService::class.java)


}