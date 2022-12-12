package com.gusoliveira.mystore.ui.login

data class LoginResult(
    val success: LoggedInUserView? = null,
    val error: Int? = null
)