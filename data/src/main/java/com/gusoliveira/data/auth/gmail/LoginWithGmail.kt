/*
package com.gusoliveira.data.auth.gmail

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.GoogleAuthProvider
import com.gusoliveira.data.R

class LoginWithGmail : AppCompatActivity() {

    val RC_SIGN_IN: Int = 1
    lateinit var mGoogleSignInClient: GoogleSignInClient
    lateinit var mGoogleSignInOptions: GoogleSignInOptions

    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //TODO: Seta a tela inicial de login
        //setContentView(R.layout.activity_sign_in)
        //configureGoogleSignIn()
        setupUI()
        //firebaseAuth = FirebaseAuth.getInstance()
    }

    companion object {
        //   fun getLaunchIntent(from: Context) = Intent(from, SignInActivity::class.java).apply {
        //       addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK) }
    }

    override fun onStart() {
        super.onStart()
        val user = FirebaseAuth.getInstance().currentUser
        if (user != null) {
            //TODO: Se já houver usuário, inicie a tela
            //startActivity(HomeActivity.getLaunchIntent(this))
            finish()
        }
    }

    private fun configureGoogleSignIn() {
        mGoogleSignInOptions = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestIdToken("121210063957-vlqbhfbfre0cd0992c2lcghvtppj0u3i.apps.googleusercontent.com")
            .requestEmail()
            .build()
        mGoogleSignInClient = GoogleSignIn.getClient(this, mGoogleSignInOptions)
    }

    fun setupUI() {
        //google_button.setOnClickListener {
        //TODO: Adicionar ação de click que irá chamar o signIn()
        signIn()
        //}
    }

    */
/**singIn() method which will be called when the user presses on the log in button*//*

    private fun signIn() {
        configureGoogleSignIn()
        firebaseAuth = FirebaseAuth.getInstance()
        val signInIntent: Intent = mGoogleSignInClient.signInIntent
        startActivityForResult(signInIntent, RC_SIGN_IN)
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == RC_SIGN_IN) {
            val task: Task<GoogleSignInAccount> = GoogleSignIn.getSignedInAccountFromIntent(data)
            try {
                val account = task.getResult(ApiException::class.java)
                firebaseAuthWithGoogle(account)
            } catch (e: ApiException) {
                //Toast.makeText(this, "Google sign in failed:(", Toast.LENGTH_LONG).show()
            }
        }
    }

    private fun firebaseAuthWithGoogle(acct: GoogleSignInAccount?) {
        val credential = GoogleAuthProvider.getCredential(acct?.idToken, null)
        firebaseAuth.signInWithCredential(credential).addOnCompleteListener {
            if (it.isSuccessful) {
                //TODO: Se for bem sucedido, chamar tela inicial
                //startActivity(HomeActivity.getLaunchIntent(this))
            } else {
                //Toast.makeText(this, "Google sign in failed:(", Toast.LENGTH_LONG).show()
            }
        }

        */
/**Função que faz logout*//*

        fun signOut() {
            //TODO: Iniciar uma tela
            //startActivity(SignInActivity.getLaunchIntent(this))
            FirebaseAuth.getInstance().signOut()
        }
    }
}


*/
/*
private val RC_SIGN_IN: Int = 1
private lateinit var firebaseAuth: FirebaseAuth
lateinit var mGoogleSignInOptions: GoogleSignInOptions
lateinit var mGoogleSignInClient: GoogleSignInClient


companion object {
    //TODO: Aqui é para iniciar uma nova tela
    *//*
*/
/*fun getLaunchIntent(from: Context) = Intent(from, HomeActivity::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        }*//*
*/
/*
        //TODO: Aqui é para iniciar uma nova tela
        *//*
*/
/*fun getLaunchIntent(from: Context) = Intent(from, SignInActivity::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        }*//*
*/
/*
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        //configureGoogleSignIn()
        //firebaseAuth = FirebaseAuth.getInstance()
    }

    override fun onStart() {
        *//*

*/
/** é responsáel por verificar se o usuário já está logado *//*
*/
/*
        super.onStart()
        val user = FirebaseAuth.getInstance().currentUser
        if (user != null) {
            //startActivity(HomeActivity.getLaunchIntent(this))
            finish()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == RC_SIGN_IN) {
            val task: Task<GoogleSignInAccount> = GoogleSignIn.getSignedInAccountFromIntent(data)
            try {
                val account = task.getResult(ApiException::class.java)
                firebaseAuthWithGoogle(account)
            } catch (e: ApiException) {
                Toast.makeText(this, "Google sign in failed:(", Toast.LENGTH_LONG).show()
            }
        }
    }

    private fun configureGoogleSignIn() {
        mGoogleSignInOptions = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestIdToken(getString(R.string.default_web_client_id))
            .requestEmail()
            .build()
        mGoogleSignInClient = GoogleSignIn.getClient(this, mGoogleSignInOptions)
    }

    private fun firebaseAuthWithGoogle(acct: GoogleSignInAccount?) {
        *//*
*/
/*var signInRequest = BeginSignInRequest.builder()
            .setGoogleIdTokenRequestOptions(
                BeginSignInRequest.GoogleIdTokenRequestOptions.builder()
                    .setSupported(true)
                    // Your server's client ID, not your Android client ID.
                    .setServerClientId(getString(R.string.your_web_client_id))
                    // Only show accounts previously used to sign in.
                    .setFilterByAuthorizedAccounts(true)
                    .build())
            .build()*//*
*/
/*
        val credential = GoogleAuthProvider.getCredential(acct?.idToken, null)
        firebaseAuth.signInWithCredential(credential).addOnCompleteListener {
            if (it.isSuccessful) {
                //TODO: inicia a tela se ocorrer tudo bem
                Log.e("loginError", "Sucesso ao fazer login")
                //startActivity(HomeActivity.getLaunchIntent(this))
            } else {
                Log.e("loginError", "Erro ao fazer login")
                Toast.makeText(this, "Google sign in failed:(", Toast.LENGTH_LONG).show()
            }
        }
    }

    *//*

*/
/**Chamar para realizar login*//*
*/
/*
    *//*

*/
/**singIn() method which will be called when the user presses on the log in button*//*
*/
/*
    fun signIn() {
        configureGoogleSignIn()
        firebaseAuth = FirebaseAuth.getInstance()
        val signInIntent: Intent = mGoogleSignInClient.signInIntent
        startActivityForResult(signInIntent, RC_SIGN_IN)
    }


*/
