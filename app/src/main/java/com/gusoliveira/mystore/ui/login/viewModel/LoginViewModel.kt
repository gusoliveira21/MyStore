package com.gusoliveira.mystore.ui.login.viewModel

import androidx.lifecycle.ViewModel

abstract class LoginViewModel : ViewModel() {
    abstract fun postUser(name: String, email: String, password: String)
    abstract fun failed()
    abstract fun success(resultPostRegister: String)
}