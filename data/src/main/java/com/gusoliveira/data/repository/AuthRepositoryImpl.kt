package com.gusoliveira.data.repository

import android.util.Log
import com.gusoliveira.data.auth.AuthService
import com.gusoliveira.domain.entities.auth.RegisterModel
import com.gusoliveira.domain.repository.AuthRepository

class AuthRepositoryImpl(private val authService: AuthService) : AuthRepository {
    override suspend fun register(user: RegisterModel): Int {
        var call = authService.registration(user).execute()
        Log.i("LogSucesso", "$call")
        return call.code()
    }
}