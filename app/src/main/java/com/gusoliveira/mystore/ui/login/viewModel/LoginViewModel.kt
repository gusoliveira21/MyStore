package com.gusoliveira.mystore.ui.login.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

import com.gusoliveira.mystore.ui.login.LoginFormState
import com.gusoliveira.mystore.ui.login.LoginResult

abstract class LoginViewModel() : ViewModel() {

    abstract val loginFormState: LiveData<LoginFormState>

    abstract val loginResult: LiveData<LoginResult>

    abstract fun loginWithEmail(username: String, password: String)

    abstract fun loginDataChanged(username: String, password: String)

    abstract fun isUserNameValid(username: String): Boolean

    abstract fun isPasswordValid(password: String): Boolean

    abstract fun loginWithGmail()
}