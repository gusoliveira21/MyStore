package com.gusoliveira.mystore.ui.login.viewModel

import android.util.Log
import androidx.lifecycle.viewModelScope
import com.gusoliveira.domain.entities.auth.RegisterModel
import com.gusoliveira.domain.usecase.authMethods.RegisterUserUseCase
import kotlinx.coroutines.launch

class LoginViewModelImpl(
    private val registerUserUseCase: RegisterUserUseCase,
    //private val router: Router
) : LoginViewModel() {

    override fun postUser(
        name: String,
        email: String,
        password: String
    ) {
        viewModelScope.launch {
            var result = registerUserUseCase.execute(
                RegisterModel(
                    name,
                    email,
                    password
                )
            )
            result.handleResult(::success, ::failed)
        }

    }

    override fun failed() {
        Log.e("LogSucesso", "failed()")
    }

    override fun success(resultPostRegister: String) {
        Log.e("LogSucesso", resultPostRegister)

    }
}