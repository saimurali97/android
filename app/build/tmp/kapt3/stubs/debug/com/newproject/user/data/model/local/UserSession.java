package com.newproject.user.data.model.local;

import androidx.lifecycle.MutableLiveData;
import com.newproject.user.data.model.remote.auth.LoginResponse;
import javax.inject.Inject;
import javax.inject.Singleton;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0005R\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/newproject/user/data/model/local/UserSession;", "", "()V", "userProfile", "Landroidx/lifecycle/MutableLiveData;", "Lcom/newproject/user/data/model/remote/auth/LoginResponse;", "getUserProfile", "setUserProfile", "", "user", "app_debug"})
@javax.inject.Singleton()
public final class UserSession {
    private androidx.lifecycle.MutableLiveData<com.newproject.user.data.model.remote.auth.LoginResponse> userProfile;
    
    @javax.inject.Inject()
    public UserSession() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.newproject.user.data.model.remote.auth.LoginResponse> getUserProfile() {
        return null;
    }
    
    public final void setUserProfile(@org.jetbrains.annotations.Nullable()
    com.newproject.user.data.model.remote.auth.LoginResponse user) {
    }
}