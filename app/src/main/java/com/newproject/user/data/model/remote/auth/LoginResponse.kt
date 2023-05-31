package com.newproject.user.data.model.remote.auth

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class LoginResponse(
    @SerializedName("data")
    val `data`: ArrayList<Data>,
    @SerializedName("message")
    val message: String,
    @SerializedName("success")
    val success: Boolean,
    @SerializedName("status")
    val statusCode: Int
) : Serializable {
    data class Data(
        @SerializedName("id")
        val id: String,
        @SerializedName("Name")
        val name: String,
        @SerializedName("DOB")
        val dob: String,
        @SerializedName("Email")
        val email: String,
        @SerializedName("phone")
        val phone: String,
        @SerializedName("createdBy")
        val createdBy: Any,
        @SerializedName("createdDate")
        val createdDate: String,
        @SerializedName("modifiedBy")
        val modifiedBy: Any,
        @SerializedName("ModifiedDate")
        val ModifiedDate: String,
        @SerializedName("status")
        val status: String,
        @SerializedName("otp")
        val otp: String,
        @SerializedName("profileUrl")
        val profileUrl: String

        ): Serializable
}