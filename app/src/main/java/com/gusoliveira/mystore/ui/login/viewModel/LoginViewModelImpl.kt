/*
package com.gusoliveira.mystore.ui.login.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import android.util.Patterns
import com.gusoliveira.data.auth.email.LoginRepository
import com.gusoliveira.domain.usecase.base.DataResult

import com.gusoliveira.mystore.R.string
import com.gusoliveira.mystore.ui.login.LoggedInUserView
import com.gusoliveira.mystore.ui.login.LoginFormState
import com.gusoliveira.mystore.ui.login.LoginResult

class LoginViewModelImpl(private val loginRepository: LoginRepository) : LoginViewModel() {

    private val _loginForm = MutableLiveData<LoginFormState>()
    override val loginFormState: LiveData<LoginFormState> = _loginForm

    private val _loginResult = MutableLiveData<LoginResult>()
    override val loginResult: LiveData<LoginResult> = _loginResult

    override fun loginWithGmail(){
        loginRepository.loginWithGmail()
    }

    override fun loginWithEmail(username: String, password: String) {
        */
/** can be launched in a separate asynchronous job *//*

        val result = loginRepository.loginWithEmail(username, password)

        if (result is DataResult.Success) {
            _loginResult.value = LoginResult(success = LoggedInUserView(displayName = result.data.displayName))
        } else {
            _loginResult.value = LoginResult(error = string.login_failed)
        }
    }

    override fun loginDataChanged(username: String, password: String) {
        if (!isUserNameValid(username)) {
            _loginForm.value = LoginFormState(usernameError = string.invalid_username)
        } else if (!isPasswordValid(password)) {
            _loginForm.value = LoginFormState(passwordError = string.invalid_password)
        } else {
            _loginForm.value = LoginFormState(isDataValid = true)
        }
    }

    // A placeholder username validation check
    override fun isUserNameValid(username: String): Boolean {
        //TODO: Deve-se melhorar a lógica para reconhecer melhor os padrões de email
        return if (username.contains("@")) {
            Patterns.EMAIL_ADDRESS.matcher(username).matches()
        } else {
            username.isNotBlank()
        }
    }

    // A placeholder password validation check
    override fun isPasswordValid(password: String): Boolean {
        return password.length > 5
    }
}*/
