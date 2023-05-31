package com.newproject.user.data.model.local;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.inject.Inject;
import javax.inject.Singleton;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0011\b\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00012\b\u0010\u0010\u001a\u0004\u0018\u00010\nJ\u001c\u0010\u0011\u001a\u00020\u00122\b\u0010\u0010\u001a\u0004\u0018\u00010\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\nH\u0002J!\u0010\u0014\u001a\u00020\u00122\b\u0010\u0010\u001a\u0004\u0018\u00010\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002\u00a2\u0006\u0002\u0010\u0015J\u000e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0012J\u0016\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\nR\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u001b"}, d2 = {"Lcom/newproject/user/data/model/local/Preferenceshandler;", "", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "appSharedPreferencesObject", "Landroid/content/SharedPreferences;", "getAppSharedPreferencesObject", "()Landroid/content/SharedPreferences;", "userToken", "", "getUserToken", "()Ljava/lang/String;", "clearLocalData", "", "getValue", "key", "saveSharedPreferences", "", "object", "saveSharedPreferencesBoolean", "(Ljava/lang/String;Ljava/lang/Boolean;)Z", "saveUserToken", "setBoolean", "value", "setValue", "Companion", "app_debug"})
@javax.inject.Singleton()
public final class Preferenceshandler {
    private final android.content.Context mContext = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.newproject.user.data.model.local.Preferenceshandler.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SHARED_PREFERENCES_KEY = "com.munchngiveandroid.user";
    
    @javax.inject.Inject()
    public Preferenceshandler(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context mContext) {
        super();
    }
    
    private final android.content.SharedPreferences getAppSharedPreferencesObject() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getValue(@org.jetbrains.annotations.Nullable()
    java.lang.String key) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserToken() {
        return null;
    }
    
    private final boolean saveSharedPreferences(java.lang.String key, java.lang.String object) {
        return false;
    }
    
    private final boolean saveSharedPreferencesBoolean(java.lang.String key, java.lang.Boolean object) {
        return false;
    }
    
    public final boolean saveUserToken(@org.jetbrains.annotations.NotNull()
    java.lang.String userToken) {
        return false;
    }
    
    public final boolean setValue(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
        return false;
    }
    
    public final boolean setBoolean(@org.jetbrains.annotations.NotNull()
    java.lang.String key, boolean value) {
        return false;
    }
    
    @android.annotation.SuppressLint(value = {"CommitPrefEdits"})
    public final void clearLocalData() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/newproject/user/data/model/local/Preferenceshandler$Companion;", "", "()V", "SHARED_PREFERENCES_KEY", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}