package com.gusoliveira.data.auth.email

import androidx.appcompat.app.AppCompatActivity
import com.gusoliveira.data.model.userModel.LoggedInUser
import com.gusoliveira.domain.usecase.base.DataResult
import java.util.*


/** Class that handles authentication w/ login credentials and retrieves user information. */
class LoginDataSource {

    fun login(username: String, password: String): DataResult<LoggedInUser> {
        //try {
        val fakeUser = LoggedInUser(UUID.randomUUID().toString(), "Jane Doe")
        return DataResult.Success(fakeUser)
        //} catch (e: Throwable) {
        //return Error(IOException("Error logging in", e))
        //}
    }


    fun logout() {
        // TODO: revoke authentication
    }
}