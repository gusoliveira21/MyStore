package com.gusoliveira.mystore.ui.login.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import android.util.Patterns
import com.gusoliveira.mystore.data.LoginRepository
import com.gusoliveira.mystore.data.Result

import com.gusoliveira.mystore.R.string
import com.gusoliveira.mystore.ui.login.LoggedInUserView
import com.gusoliveira.mystore.ui.login.LoginFormState
import com.gusoliveira.mystore.ui.login.LoginResult

abstract class LoginViewModel() : ViewModel() {

    abstract val loginFormState: LiveData<LoginFormState>

    abstract val loginResult: LiveData<LoginResult>

    abstract fun login(username: String, password: String)

    abstract fun loginDataChanged(username: String, password: String)

    abstract fun isUserNameValid(username: String): Boolean

    abstract fun isPasswordValid(password: String): Boolean
}