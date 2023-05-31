package com.newproject.user.view.ui.auth;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.newproject.user.data.model.local.Preferenceshandler;
import com.newproject.user.data.model.local.UserSession;
import com.newproject.user.data.model.remote.auth.SignUpBody;
import com.newproject.user.data.model.remote.auth.SignUpResponse;
import com.newproject.user.data.repository.auth.AuthRepository;
import com.newproject.user.network.NoInternetException;
import com.munchngiveandroid.user.base.BaseResult;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0011J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u000b\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/newproject/user/view/ui/auth/AuthViewModel;", "Landroidx/lifecycle/ViewModel;", "authRepository", "Lcom/newproject/user/data/repository/auth/AuthRepository;", "preferencesHandler", "Lcom/newproject/user/data/model/local/Preferenceshandler;", "userSession", "Lcom/newproject/user/data/model/local/UserSession;", "noInternetString", "", "(Lcom/newproject/user/data/repository/auth/AuthRepository;Lcom/newproject/user/data/model/local/Preferenceshandler;Lcom/newproject/user/data/model/local/UserSession;Ljava/lang/String;)V", "TAG", "signUpRes", "Landroidx/lifecycle/MutableLiveData;", "Lcom/munchngiveandroid/user/base/BaseResult;", "Lcom/newproject/user/data/model/remote/auth/SignUpResponse;", "getSignUpResult", "Landroidx/lifecycle/LiveData;", "signUp", "", "createCustomer", "Lcom/newproject/user/data/model/remote/auth/SignUpBody;", "app_debug"})
public final class AuthViewModel extends androidx.lifecycle.ViewModel {
    private final com.newproject.user.data.repository.auth.AuthRepository authRepository = null;
    private final com.newproject.user.data.model.local.Preferenceshandler preferencesHandler = null;
    private final com.newproject.user.data.model.local.UserSession userSession = null;
    private final java.lang.String noInternetString = null;
    private final java.lang.String TAG = "AuthViewModel";
    private androidx.lifecycle.MutableLiveData<com.munchngiveandroid.user.base.BaseResult<com.newproject.user.data.model.remote.auth.SignUpResponse>> signUpRes;
    
    @javax.inject.Inject()
    public AuthViewModel(@org.jetbrains.annotations.NotNull()
    com.newproject.user.data.repository.auth.AuthRepository authRepository, @org.jetbrains.annotations.NotNull()
    com.newproject.user.data.model.local.Preferenceshandler preferencesHandler, @org.jetbrains.annotations.NotNull()
    com.newproject.user.data.model.local.UserSession userSession, @org.jetbrains.annotations.NotNull()
    java.lang.String noInternetString) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.munchngiveandroid.user.base.BaseResult<com.newproject.user.data.model.remote.auth.SignUpResponse>> getSignUpResult() {
        return null;
    }
    
    public final void signUp(@org.jetbrains.annotations.NotNull()
    com.newproject.user.data.model.remote.auth.SignUpBody createCustomer) {
    }
}