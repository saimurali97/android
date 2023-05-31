package com.newproject.user.data.repository.auth

import com.newproject.user.data.model.remote.auth.LoginResponse
import com.newproject.user.data.model.remote.auth.SignUpBody
import com.newproject.user.data.model.remote.auth.SignUpResponse
import com.newproject.user.network.auth.AuthApi
import retrofit2.Response
import javax.inject.Inject

class AuthRepository @Inject constructor(private val authApi: AuthApi) {

    suspend fun getUserProfile(id: String): Response<LoginResponse> {
        return authApi.userProfile(id)
    }



    suspend fun signUp(createCustomer: SignUpBody): SignUpResponse {
        return authApi.signUp(createCustomer)
    }


}