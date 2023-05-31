package com.newproject.user.data.model.remote.auth

data class SignUpBody(
   /* @SerializedName("Name")*/
    val name: String,
   /* @SerializedName("Email")*/
    val email: String,
  /*  @SerializedName("phone")*/
    val password: String
)
