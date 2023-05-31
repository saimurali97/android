package com.newproject.user.view.listeners;

import androidx.fragment.app.Fragment;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lcom/newproject/user/view/listeners/FragmentInteractionListener;", "", "onBackPressedFromFragment", "", "switchFragment", "fragment", "Landroidx/fragment/app/Fragment;", "switchFragmentWithKey", "key", "", "app_debug"})
public abstract interface FragmentInteractionListener {
    
    public abstract void switchFragment(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment);
    
    public abstract void onBackPressedFromFragment();
    
    public abstract void switchFragmentWithKey(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    java.lang.String key);
}