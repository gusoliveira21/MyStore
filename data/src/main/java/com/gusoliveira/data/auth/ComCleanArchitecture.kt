package com.gusoliveira.data.auth

import retrofit2.http.POST

// Camada de interface de usuário

class LoginFragment : Fragment() {
    private val loginViewModel: LoginViewModel by viewModels()

    // Exibe um formulário de login para o usuário
    // Quando o usuário envia o formulário, chama o método login() do view model
    // com os dados do formulário
}

// Camada de apresentação

class LoginViewModel(
    private val loginUseCase: LoginUseCase
) : ViewModel() {
    fun login(name: String, email: String, password: String) {
        loginUseCase.execute(name, email, password)
    }
}

// Camada de domínio

class LoginUseCase(
    private val loginRepository: LoginRepository
) {
    fun execute(name: String, email: String, password: String) {
        loginRepository.login(name, email, password)
    }
}

// Camada de dados

class LoginRepository(
    private val authInitializer: AuthInitializer
) {
    fun login(name: String, email: String, password: String) {
        authInitializer.login(name, email, password)
    }
}

// Camada de infraestrutura

class LoginApi {
    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val loginService: LoginService = retrofit.create(LoginService::class.java)

    fun login(name: String, email: String, password: String) {
        loginService.login(name, email, password)
    }
}

private interface LoginService {
    @POST("/login")
    fun login(@Body loginData: LoginData): Call<AccessToken>
}

data class LoginData(val name: String, val email: String, val password: String)



/*Nesta implementação, cada camada tem uma responsabilidade bem definida:

A camada de interface de usuário é responsável por exibir a interface do usuário e capturar os dados de entrada do usuário.
A camada de apresentação é responsável por gerenciar o estado da interface do usuário e intermediar entre a interface de usuário e a camada de domínio.
A camada de domínio é responsável por conter a lógica de negócios e os casos de uso da aplicação.
A camada de dados é responsável por acessar os dados persistent*/