package com.munchngiveandroid.user.data.model.remote.auth

import com.google.gson.annotations.SerializedName

data class LoginBody(
    @SerializedName("phone")
    val phone: String
)