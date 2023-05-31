package com.newproject.user.view.ui.splash;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.newproject.user.data.model.local.Preferenceshandler;
import com.newproject.user.data.model.local.UserSession;
import com.newproject.user.data.model.remote.auth.LoginResponse;
import com.newproject.user.data.repository.auth.AuthRepository;
import com.newproject.user.network.NoInternetException;
import com.munchngiveandroid.user.base.BaseResult;
import dagger.hilt.android.lifecycle.HiltViewModel;
import timber.log.Timber;
import java.util.*;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u000e0\u0013J\u0006\u0010\u0014\u001a\u00020\u0005J\u0006\u0010\u0015\u001a\u00020\tJ\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\rJ\u0010\u0010\u0017\u001a\u00020\u00182\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0006\u0010\u0010\u001a\u00020\u0018R\u000e\u0010\u000b\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u000e0\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/newproject/user/view/ui/splash/SplashViewModel;", "Landroidx/lifecycle/ViewModel;", "authRepository", "Lcom/newproject/user/data/repository/auth/AuthRepository;", "preferenceshandler", "Lcom/newproject/user/data/model/local/Preferenceshandler;", "userSession", "Lcom/newproject/user/data/model/local/UserSession;", "noInternetString", "", "(Lcom/newproject/user/data/repository/auth/AuthRepository;Lcom/newproject/user/data/model/local/Preferenceshandler;Lcom/newproject/user/data/model/local/UserSession;Ljava/lang/String;)V", "TAG", "pushResponse", "Landroidx/lifecycle/MutableLiveData;", "Lcom/munchngiveandroid/user/base/BaseResult;", "Ljava/util/Objects;", "userProfile", "Lcom/newproject/user/data/model/remote/auth/LoginResponse;", "getRemoteUserProfile", "Landroidx/lifecycle/LiveData;", "getSharedPref", "getToken", "getUserprofile", "setUserProfile", "", "app_debug"})
public final class SplashViewModel extends androidx.lifecycle.ViewModel {
    private final com.newproject.user.data.repository.auth.AuthRepository authRepository = null;
    private final com.newproject.user.data.model.local.Preferenceshandler preferenceshandler = null;
    private final com.newproject.user.data.model.local.UserSession userSession = null;
    private final java.lang.String noInternetString = null;
    private androidx.lifecycle.MutableLiveData<com.munchngiveandroid.user.base.BaseResult<com.newproject.user.data.model.remote.auth.LoginResponse>> userProfile;
    private androidx.lifecycle.MutableLiveData<com.munchngiveandroid.user.base.BaseResult<java.util.Objects>> pushResponse;
    private final java.lang.String TAG = "SplashViewModel";
    
    @javax.inject.Inject()
    public SplashViewModel(@org.jetbrains.annotations.NotNull()
    com.newproject.user.data.repository.auth.AuthRepository authRepository, @org.jetbrains.annotations.NotNull()
    com.newproject.user.data.model.local.Preferenceshandler preferenceshandler, @org.jetbrains.annotations.NotNull()
    com.newproject.user.data.model.local.UserSession userSession, @org.jetbrains.annotations.NotNull()
    java.lang.String noInternetString) {
        super();
    }
    
    public final void userProfile() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getToken() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.newproject.user.data.model.local.Preferenceshandler getSharedPref() {
        return null;
    }
    
    public final void setUserProfile(@org.jetbrains.annotations.Nullable()
    com.newproject.user.data.model.remote.auth.LoginResponse userProfile) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.newproject.user.data.model.remote.auth.LoginResponse> getUserprofile() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.munchngiveandroid.user.base.BaseResult<com.newproject.user.data.model.remote.auth.LoginResponse>> getRemoteUserProfile() {
        return null;
    }
}