package com.newproject.user.data.model.local

import androidx.lifecycle.MutableLiveData
import com.newproject.user.data.model.remote.auth.LoginResponse
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserSession @Inject constructor() {
    private var userProfile: MutableLiveData<LoginResponse?> = MutableLiveData()

    fun getUserProfile(): MutableLiveData<LoginResponse?> {
        return userProfile
    }

    fun setUserProfile(user: LoginResponse?) {
        userProfile.postValue(user)
    }
}