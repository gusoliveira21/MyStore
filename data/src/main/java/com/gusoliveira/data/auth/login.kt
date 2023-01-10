package com.gusoliveira.data.auth

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.POST

class Login {
    private interface LoginService {
        @POST("/login")
        fun login(@Body loginData: LoginData): Call<AccessToken>
    }

    private companion object {
        const val BASE_URL = "https://your-server.com"
    }

    data class LoginData(val name: String, val email: String, val password: String)

    fun login(name: String, email: String, password: String): String {
        // Crie um objeto LoginData com os dados de login
        val loginData = LoginData(name, email, password)

        // Crie um Retrofit builder
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        // Crie um objeto de serviço de login
        val loginService = retrofit.create(LoginService::class.java)

        // Envie a solicitação POST para a rota de login do servidor
        val call = loginService.login(loginData)
        val response = call.execute()

        // Devolva o token de acesso recebido na resposta
        return response.body()!!.token
    }
}