package com.gusoliveira.domain.usecase.authMethods
import com.gusoliveira.domain.repository.AuthRepository
import com.gusoliveira.domain.usecase.base.BaseUseCase
/*
* TODO: Pelo que compreendi, preciso modificar o doWork, para me devolter outro tipo de argumento*/

class RegisterUserUseCase(private val authRepository: AuthRepository) :
    BaseUseCase<Nothing, String>() {
    override suspend fun doWork(value: String) = authRepository.register("", "", "")
}
