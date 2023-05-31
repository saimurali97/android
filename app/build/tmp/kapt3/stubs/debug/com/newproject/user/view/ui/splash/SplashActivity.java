package com.newproject.user.view.ui.splash;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.Observer;
import com.newproject.user.MainActivity;
import com.newproject.user.R;
import com.newproject.user.data.model.local.Preferenceshandler;
import com.newproject.user.databinding.ActivitySplashBinding;
import com.newproject.user.view.ui.auth.AuthActivity;
import com.munchngiveandroid.user.base.*;
import dagger.hilt.android.AndroidEntryPoint;
import timber.log.Timber;
import java.security.MessageDigest;

@android.annotation.SuppressLint(value = {"CustomSplashScreen"})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001dH\u0002J\b\u0010!\u001a\u00020\u001dH\u0002J\u0012\u0010\"\u001a\u00020\u001d2\b\u0010#\u001a\u0004\u0018\u00010$H\u0014J\b\u0010%\u001a\u00020\u001dH\u0014J\u0010\u0010&\u001a\u00020\u001d2\u0006\u0010\'\u001a\u00020\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006)"}, d2 = {"Lcom/newproject/user/view/ui/splash/SplashActivity;", "Lcom/munchngiveandroid/user/base/BaseActivity;", "Lcom/newproject/user/databinding/ActivitySplashBinding;", "()V", "SPLASH_DELAY", "", "flag", "", "getFlag", "()Z", "setFlag", "(Z)V", "mDelayHandler", "Landroid/os/Handler;", "mRunnable", "Ljava/lang/Runnable;", "model", "Lcom/newproject/user/view/ui/splash/SplashViewModel;", "getModel", "()Lcom/newproject/user/view/ui/splash/SplashViewModel;", "model$delegate", "Lkotlin/Lazy;", "sharedLinkId", "", "getSharedLinkId", "()Ljava/lang/String;", "setSharedLinkId", "(Ljava/lang/String;)V", "generateHash", "", "getLayoutId", "", "hideSystemUI", "navigateToLogin", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onWindowFocusChanged", "hasFocus", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class SplashActivity extends com.munchngiveandroid.user.base.BaseActivity<com.newproject.user.databinding.ActivitySplashBinding> {
    private boolean flag = true;
    private android.os.Handler mDelayHandler;
    private final long SPLASH_DELAY = 3000L;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String sharedLinkId = "";
    @org.jetbrains.annotations.NotNull()
    public static final com.newproject.user.view.ui.splash.SplashActivity.Companion Companion = null;
    public static com.newproject.user.data.model.local.Preferenceshandler sharedPreferences;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy model$delegate = null;
    private final java.lang.Runnable mRunnable = null;
    private java.util.HashMap _$_findViewCache;
    
    public SplashActivity() {
        super();
    }
    
    public final boolean getFlag() {
        return false;
    }
    
    public final void setFlag(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSharedLinkId() {
        return null;
    }
    
    public final void setSharedLinkId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.newproject.user.view.ui.splash.SplashViewModel getModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void generateHash() {
    }
    
    @java.lang.Override()
    public void onWindowFocusChanged(boolean hasFocus) {
    }
    
    private final void hideSystemUI() {
    }
    
    private final void navigateToLogin() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/newproject/user/view/ui/splash/SplashActivity$Companion;", "", "()V", "sharedPreferences", "Lcom/newproject/user/data/model/local/Preferenceshandler;", "getSharedPreferences", "()Lcom/newproject/user/data/model/local/Preferenceshandler;", "setSharedPreferences", "(Lcom/newproject/user/data/model/local/Preferenceshandler;)V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.newproject.user.data.model.local.Preferenceshandler getSharedPreferences() {
            return null;
        }
        
        public final void setSharedPreferences(@org.jetbrains.annotations.NotNull()
        com.newproject.user.data.model.local.Preferenceshandler p0) {
        }
    }
}