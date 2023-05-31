package com.newproject.user.view.ui.auth

import android.os.Bundle
import android.os.PersistableBundle
import com.newproject.user.R
import com.newproject.user.databinding.ActivityAuthBinding
import com.munchngiveandroid.user.base.BaseActivity
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class AuthActivity : BaseActivity<ActivityAuthBinding>() {

    override fun getLayoutId(): Int {
        return R.layout.activity_auth
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
    }

}