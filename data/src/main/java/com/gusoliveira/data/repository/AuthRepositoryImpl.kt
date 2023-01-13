package com.gusoliveira.data.repository

import com.gusoliveira.data.auth_aws.AuthService
import com.gusoliveira.data.model.RegisterModel
import com.gusoliveira.domain.repository.AuthRepository

//TODO: Aqui eu preciso realizar uma modificação para retornar uma string dizendo se foi um sucesso ou nao
class AuthRepositoryImpl( private val authService: AuthService ) : AuthRepository {
    override suspend fun register(name: String, email: String, password: String): String {
        return authService.registration(RegisterModel(name, email, password))
    }
}