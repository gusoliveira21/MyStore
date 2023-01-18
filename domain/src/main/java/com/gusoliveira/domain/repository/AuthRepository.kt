package com.gusoliveira.domain.repository

import com.gusoliveira.domain.entities.auth.RegisterModel

interface AuthRepository {
    suspend fun register(user: RegisterModel): Int
}