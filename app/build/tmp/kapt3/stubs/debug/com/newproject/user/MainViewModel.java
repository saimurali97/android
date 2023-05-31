package com.newproject.user;

import androidx.lifecycle.*;
import com.newproject.user.data.model.local.Preferenceshandler;
import com.newproject.user.data.model.local.UserSession;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/newproject/user/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "userSession", "Lcom/newproject/user/data/model/local/UserSession;", "preferenceshandler", "Lcom/newproject/user/data/model/local/Preferenceshandler;", "(Lcom/newproject/user/data/model/local/UserSession;Lcom/newproject/user/data/model/local/Preferenceshandler;)V", "clearUserToken", "", "token", "", "isUserLoggedIn", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.newproject.user.data.model.local.UserSession userSession = null;
    private final com.newproject.user.data.model.local.Preferenceshandler preferenceshandler = null;
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.newproject.user.data.model.local.UserSession userSession, @org.jetbrains.annotations.NotNull()
    com.newproject.user.data.model.local.Preferenceshandler preferenceshandler) {
        super();
    }
    
    public final boolean clearUserToken(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
        return false;
    }
    
    public final boolean isUserLoggedIn() {
        return false;
    }
}