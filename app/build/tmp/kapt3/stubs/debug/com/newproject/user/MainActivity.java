package com.newproject.user;

import android.os.Bundle;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.newproject.user.databinding.ActivityMainBinding;
import com.munchngiveandroid.user.base.BaseActivityViewModel;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\u0014\u0010\u0013\u001a\u00020\u0010*\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/newproject/user/MainActivity;", "Lcom/munchngiveandroid/user/base/BaseActivityViewModel;", "Lcom/newproject/user/databinding/ActivityMainBinding;", "Lcom/newproject/user/MainViewModel;", "()V", "appBarConfiguration", "Landroidx/navigation/ui/AppBarConfiguration;", "bottomNavigationView", "Lcom/google/android/material/bottomnavigation/BottomNavigationView;", "navController", "Landroidx/navigation/NavController;", "getLayoutId", "", "getViewModelClass", "Ljava/lang/Class;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setupBottomNavMenu", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MainActivity extends com.munchngiveandroid.user.base.BaseActivityViewModel<com.newproject.user.databinding.ActivityMainBinding, com.newproject.user.MainViewModel> {
    private androidx.navigation.ui.AppBarConfiguration appBarConfiguration;
    private androidx.navigation.NavController navController;
    private com.google.android.material.bottomnavigation.BottomNavigationView bottomNavigationView;
    private java.util.HashMap _$_findViewCache;
    
    public MainActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupBottomNavMenu(com.google.android.material.bottomnavigation.BottomNavigationView $this$setupBottomNavMenu, androidx.navigation.NavController navController) {
    }
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Class<com.newproject.user.MainViewModel> getViewModelClass() {
        return null;
    }
}