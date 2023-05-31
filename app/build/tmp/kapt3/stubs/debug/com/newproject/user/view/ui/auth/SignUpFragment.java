package com.newproject.user.view.ui.auth;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Toast;
import androidx.navigation.Navigation;
import com.newproject.user.MainActivity;
import com.newproject.user.R;
import com.newproject.user.databinding.FragmentSignUpBinding;
import com.munchngiveandroid.user.base.BaseFragment;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eH\u0016J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0010H\u0002\u00a8\u0006\u0016"}, d2 = {"Lcom/newproject/user/view/ui/auth/SignUpFragment;", "Lcom/munchngiveandroid/user/base/BaseFragment;", "Lcom/newproject/user/databinding/FragmentSignUpBinding;", "Lcom/newproject/user/view/ui/auth/AuthViewModel;", "()V", "checkEmail", "", "string", "", "checkValidation", "number", "getLayoutId", "", "getViewModelClass", "Ljava/lang/Class;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "userRegisterApiCall", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class SignUpFragment extends com.munchngiveandroid.user.base.BaseFragment<com.newproject.user.databinding.FragmentSignUpBinding, com.newproject.user.view.ui.auth.AuthViewModel> {
    private java.util.HashMap _$_findViewCache;
    
    public SignUpFragment() {
        super();
    }
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Class<com.newproject.user.view.ui.auth.AuthViewModel> getViewModelClass() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void userRegisterApiCall() {
    }
    
    public final boolean checkValidation(@org.jetbrains.annotations.NotNull()
    java.lang.String number) {
        return false;
    }
    
    private final boolean checkEmail(java.lang.String string) {
        return false;
    }
}