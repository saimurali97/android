package com.newproject.user.view.ui.auth
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.newproject.user.data.model.local.Preferenceshandler
import com.newproject.user.data.model.local.UserSession
import com.newproject.user.data.model.remote.auth.SignUpBody
import com.newproject.user.data.model.remote.auth.SignUpResponse
import com.newproject.user.data.repository.auth.AuthRepository
import com.newproject.user.network.NoInternetException
import com.munchngiveandroid.user.base.BaseResult
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(
    private val authRepository: AuthRepository,
    private val preferencesHandler: Preferenceshandler,
    private val userSession: UserSession,
    private val noInternetString:String) : ViewModel() {

    private val TAG = "AuthViewModel"
    private var signUpRes: MutableLiveData<BaseResult<SignUpResponse>> = MutableLiveData()




    fun getSignUpResult(): LiveData<BaseResult<SignUpResponse>> {
        signUpRes = MutableLiveData()
        return signUpRes
    }



    fun signUp(createCustomer: SignUpBody) {
        signUpRes.postValue(BaseResult.Loading())

        viewModelScope.launch {
            try {
                var response = authRepository.signUp(createCustomer)

                if (response.success == true) {
                    signUpRes.postValue(BaseResult.Success(response))

                } else {
                    signUpRes.postValue(BaseResult.Failed(response.message))
                }
            } catch (e: Exception) {
                if (e is NoInternetException) {
                    signUpRes.postValue(BaseResult.Failed(noInternetString))
                }
            }
        }
    }
}