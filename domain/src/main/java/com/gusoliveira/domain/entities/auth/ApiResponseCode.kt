package com.gusoliveira.domain.entities.auth
//TODO: devo modificar essa data class para permitir este formato de informações
// Response{protocol=h2, code=403, message=, url=https://ib3ia2wmhj.execute-api.us-east-1.amazonaws.com/auth/sign-up}
data class ApiResponseCode(val code: Int)