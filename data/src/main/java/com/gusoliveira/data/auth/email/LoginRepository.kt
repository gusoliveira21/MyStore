package com.gusoliveira.data.auth.email

import com.gusoliveira.data.auth.gmail.LoginWithGmail
import com.gusoliveira.data.model.userModel.LoggedInUser
import com.gusoliveira.domain.usecase.base.DataResult

/**
 * Class that requests authentication and user information from the remote data source and
 * maintains an in-memory cache of login status and user credentials information.
 */

class LoginRepository(val logindataSoure: LoginDataSource, val loginWithGmail: LoginWithGmail) {

    // in-memory cache of the loggedInUser object
    var user: LoggedInUser? = null
        private set

    val isLoggedIn: Boolean
        get() = user != null

    init {
        // If user credentials will be cached in local storage, it is recommended it be encrypted
        // @see https://developer.android.com/training/articles/keystore
        user = null
    }

    fun logout() {
        user = null
        logindataSoure.logout()
    }

    fun loginWithEmail(username: String, password: String): DataResult<LoggedInUser> {
        /** handle login */
        val result = logindataSoure.login(username, password)

        if (result is DataResult.Success) {
            setLoggedInUser(result.data)
        }

        return result
    }

    private fun setLoggedInUser(loggedInUser: LoggedInUser) {
        this.user = loggedInUser
        // If user credentials will be cached in local storage, it is recommended it be encrypted
        // @see https://developer.android.com/training/articles/keystore
    }


    fun loginWithGmail(){
        loginWithGmail.setupUI()
    }

}