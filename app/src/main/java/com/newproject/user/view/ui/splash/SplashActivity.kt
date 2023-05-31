package com.newproject.user.view.ui.splash

import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.os.Handler
import android.util.Base64
import android.util.Log
import android.view.View
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.newproject.user.MainActivity
import com.newproject.user.R
import com.newproject.user.data.model.local.Preferenceshandler
import com.newproject.user.databinding.ActivitySplashBinding
import com.newproject.user.utils.showSnackBar
import com.newproject.user.utils.showToast
import com.newproject.user.view.ui.auth.AuthActivity
import com.munchngiveandroid.user.base.*
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber
import java.security.MessageDigest

@SuppressLint("CustomSplashScreen")
@AndroidEntryPoint
class SplashActivity : BaseActivity<ActivitySplashBinding>() {
    var flag: Boolean = true
    private var mDelayHandler: Handler? = null
    private val SPLASH_DELAY: Long = 3000
    var sharedLinkId = ""

    companion object {
        lateinit var sharedPreferences: Preferenceshandler
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_splash
    }

    val model: SplashViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedPreferences = model.getSharedPref()


        generateHash()
        mDelayHandler = Handler()

        mDelayHandler!!.postDelayed(mRunnable, SPLASH_DELAY)

        model.getRemoteUserProfile().observe(this, Observer {
            when (it) {
                is BaseResult.Loading -> {
                    Timber.d("onViewCreated:Loading")
                }
                is BaseResult.Success -> {
                    mDelayHandler!!.removeCallbacks(mRunnable)
                    it.data?.let { it1 -> model.setUserProfile(it1) }
                    // showToast(this,"Profile Loading Success")

                }
                is BaseResult.Failed -> {
                    model.setUserProfile(null)
                    showSnackBar(it.message.toString(), binding.mainContainer)
                    showToast(this, it.message.toString())
                    navigateToLogin()
                    // showSnackBar(it.message.toString(),binding.mainContainer)
                }
                else -> {
                    model.setUserProfile(null)
                    navigateToLogin()
                }
            }
        })
        model.getUserprofile().observe(this, Observer {
            if (it != null) {
                if (sharedLinkId.isNotEmpty()) {
                   // userSharedRestaurantId = sharedLinkId
                } else {
                   // userSharedRestaurantId = ""
                }
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        })

    }


    private fun generateHash() {
        try {
            val info = packageManager.getPackageInfo(
                packageName,
                PackageManager.GET_SIGNATURES
            )
            for (signature in info.signatures) {
                val md = MessageDigest.getInstance("SHA")
                md.update(signature.toByteArray())
                Log.d("KeyHash:", Base64.encodeToString(md.digest(), Base64.DEFAULT))
            }
        } catch (e: Exception) {
            e.message?.let { Log.d("_genratehash", it) }
        }

    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) {
            hideSystemUI()
        }
    }

    private fun hideSystemUI() {
        val decorView = window.decorView
        decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_IMMERSIVE
                or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                // Hide the nav bar and status bar
                or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_FULLSCREEN)
    }

    private fun navigateToLogin() {
        val intent = Intent(this, AuthActivity::class.java)
        startActivity(intent)
        finish()
    }


    private val mRunnable: Runnable = Runnable {
        if (model.getToken() != "") {

            if (flag) {
                model.userProfile()
               // model.pushNotificationParams()
                flag = false

            }

        } else {

            navigateToLogin()
        }
    }

    override fun onPause() {
        super.onPause()
        mDelayHandler!!.removeCallbacks(mRunnable)
    }
}


