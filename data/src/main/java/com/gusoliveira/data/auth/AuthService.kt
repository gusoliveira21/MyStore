package com.gusoliveira.data.auth

import com.gusoliveira.data.model.RegisterModel
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthService {
    @POST("/auth/sign-up")
    fun registration(@Body loginData: RegisterModel): String
}