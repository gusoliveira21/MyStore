package com.gusoliveira.domain.usecase.authMethods

import com.gusoliveira.domain.entities.auth.RegisterModel
import com.gusoliveira.domain.repository.AuthRepository
import com.gusoliveira.domain.usecase.base.BaseUseCase

class RegisterUserUseCase(private val authRepository: AuthRepository) :
    BaseUseCase<RegisterModel?, String>() {

    override suspend fun doWork(value: RegisterModel?): String {
        return if (value != null)
            when (authRepository.register(value)) {
                403 -> "Este email já existe!"
                203 -> "Sucesso, email cadastrado!"
                204 -> "Sucesso, email cadastrado!"
                400 -> "Preencha todos os campos!"
                else -> "Erro ao cadastrar usuário!"
            }
        else
            "0"
    }
}

/**
403 - email já existe
203 - sucesso ao cadastrar
400 - Falta parametro
 */

