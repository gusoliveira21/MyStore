package com.gusoliveira.data.auth_aws

import com.gusoliveira.data.model.RegisterModel
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthService {
    @POST("/auth/sign-up")
    fun registration(@Body loginData: RegisterModel): String
}