package com.newproject.user

import androidx.lifecycle.*
import com.newproject.user.data.model.local.Preferenceshandler
import com.newproject.user.data.model.local.UserSession
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val userSession: UserSession,
    private val preferenceshandler: Preferenceshandler
): ViewModel() {

/*    fun getUserProfile(): MutableLiveData<UserProfile?> {
        return userSession.getUserProfile()
    }*/
    fun clearUserToken(token: String): Boolean{
        return preferenceshandler.saveUserToken("")
    }
    fun isUserLoggedIn(): Boolean{
        if (preferenceshandler.userToken == ""){
            return false
        }
        return true
    }
  /*  fun setUserProfile(userProfile: UserProfile?){
        userSession.setUserProfile(userProfile)
    }*/
}