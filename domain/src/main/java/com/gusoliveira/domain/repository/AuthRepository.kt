package com.gusoliveira.domain.repository

interface AuthRepository {
    suspend fun register(name: String, email: String, password: String): String
}