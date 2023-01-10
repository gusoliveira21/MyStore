package com.gusoliveira.data.repository

import com.gusoliveira.data.auth.AuthService
import com.gusoliveira.data.model.RegisterModel

class AuthRepository(
    private val authService: AuthService
) {
    fun login(name: String, email: String, password: String) {
        authService.registration(RegisterModel(name, email, password))
    }
}