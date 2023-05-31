package com.newproject.user.view.ui.splash

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.newproject.user.data.model.local.Preferenceshandler
import com.newproject.user.data.model.local.UserSession
import com.newproject.user.data.model.remote.auth.LoginResponse
import com.newproject.user.data.repository.auth.AuthRepository
import com.newproject.user.network.NoInternetException
import com.munchngiveandroid.user.base.BaseResult
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import timber.log.Timber
import java.util.*
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(
    private val authRepository: AuthRepository,
    private val preferenceshandler: Preferenceshandler,
    private val userSession: UserSession,
    private val noInternetString: String
) : ViewModel() {

    private var userProfile: MutableLiveData<BaseResult<LoginResponse>> = MutableLiveData()
    private var pushResponse: MutableLiveData<BaseResult<Objects>> = MutableLiveData()
    private val TAG = "SplashViewModel"

    fun userProfile() {
        userProfile.value = (BaseResult.Loading())

        viewModelScope.launch/*(Dispatchers.IO)*/ {
            try {
                var response = authRepository.getUserProfile(preferenceshandler.userToken)

                /* withContext(Dispatchers.Main) {*/
                when (response.body()?.statusCode) {
                    200 -> {
                        //  Timber.d("User profile get success")
                        userProfile.postValue(BaseResult.Success(response.body()))
                    }
                    422 -> {
                        userProfile.postValue(BaseResult.Failed("The given data was invalid"))
                    }
                    else -> {
                        userProfile.postValue(BaseResult.Failed("Something went wrong !"))
                    }
                }
                /*}*/
            } catch (e: Exception) {
                if (e is NoInternetException) {
                    Timber.d("userProfile: No Internet")
                    userProfile.postValue(BaseResult.Failed(noInternetString))
                }
            }
        }
    }


    fun getToken(): String {
        return preferenceshandler.userToken
    }

    fun getSharedPref(): Preferenceshandler {
        return preferenceshandler
    }

    fun setUserProfile(userProfile: LoginResponse?) {
        userSession.setUserProfile(userProfile)
    }

    fun getUserprofile(): MutableLiveData<LoginResponse?> {
        return userSession.getUserProfile()
    }

    fun getRemoteUserProfile(): LiveData<BaseResult<LoginResponse>> {
        userProfile = MutableLiveData()
        return userProfile
    }
}