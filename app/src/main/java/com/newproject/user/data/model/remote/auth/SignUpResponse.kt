package com.newproject.user.data.model.remote.auth

import com.google.gson.annotations.SerializedName

data class SignUpResponse(

    @SerializedName("success" ) var success : Boolean? = null,
    @SerializedName("status"  ) var status  : Int?     = null,
    @SerializedName("data"    ) var data    : Data?    = Data(),
    @SerializedName("message" ) var message : String?  = null
) {
    data class Data(


      /*  @SerializedName("createdDate"  ) var createdDate  : CreatedDate?  = CreatedDate(),
        @SerializedName("ModifiedDate" ) var ModifiedDate : ModifiedDate? = ModifiedDate(),*/
        @SerializedName("status"       ) var status       : Int?          = null,
        @SerializedName("id"           ) var id           : Int?          = null,
        @SerializedName("name"         ) var name         : String?       = null,
        @SerializedName("email"        ) var email        : String?       = null,
        @SerializedName("password"     ) var password     : String?       = null
    )


}
