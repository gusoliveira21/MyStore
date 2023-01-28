package com.gusoliveira.data.auth

import com.gusoliveira.domain.entities.auth.ApiResponseCode
import com.gusoliveira.domain.entities.auth.RegisterModel
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthService {
    @POST("URL_CALL_PATH")
    fun registration(@Body registerData: RegisterModel): Call<ApiResponseCode>
}