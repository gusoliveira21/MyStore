package com.gusoliveira.data.auth_aws

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class AuthInitializer {
    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(LINK_SERVER)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val authService: AuthService = retrofit.create(AuthService::class.java)
}