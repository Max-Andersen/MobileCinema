package com.example.mobile_cinema_lab1.network.repositories

import com.example.mobile_cinema_lab1.network.Network
import com.example.mobile_cinema_lab1.network.api.AuthApi
import com.example.mobile_cinema_lab1.network.apiRequestFlow
import com.example.mobile_cinema_lab1.network.models.LoginRequestBody
import com.example.mobile_cinema_lab1.network.models.RegisterRequestBody
import com.example.mobile_cinema_lab1.network.repositories.interfaces.IAuthRepository

class AuthRepository: IAuthRepository {
    private val authApi: AuthApi = Network.getAuthApi()

    override fun register(registerData: RegisterRequestBody) =
        apiRequestFlow { authApi.register(registerData) }

    override fun login(loginData: LoginRequestBody) = apiRequestFlow { authApi.login(loginData) }

}