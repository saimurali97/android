package com.newproject.user.network.auth

import com.newproject.user.data.model.remote.auth.LoginResponse
import com.newproject.user.data.model.remote.auth.SignUpBody
import com.newproject.user.data.model.remote.auth.SignUpResponse
import retrofit2.Response
import retrofit2.http.*

interface AuthApi {

    @GET("api/profile/{id}")
    suspend fun userProfile(@Path("id") id: String): Response<LoginResponse>



    @POST("api/createCustomer")
    suspend fun signUp(@Body createCustomer: SignUpBody): SignUpResponse

}