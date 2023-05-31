package com.newproject.user

import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.newproject.user.databinding.ActivityMainBinding
import com.munchngiveandroid.user.base.BaseActivityViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivityViewModel<ActivityMainBinding, MainViewModel>(){

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var navController: NavController
    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bottomNavigationView = binding.bottomNavigationView
        val host: NavHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_main_fragment) as NavHostFragment? ?: return

        navController = host.navController

        appBarConfiguration = AppBarConfiguration(navController.graph)

        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.orderFragment,
                R.id.menuFragment,
                R.id.insightsFragment,
                R.id.offerFragment,
                R.id.profileFragment
            )
        )
        binding.navOrder.setOnClickListener {
            navController.navigate(R.id.orderFragment)
        }
        binding.bottomNavigationView.setupBottomNavMenu(navController)


    }

    private fun BottomNavigationView.setupBottomNavMenu(navController: NavController) =
        setupWithNavController(navController)



    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun getViewModelClass(): Class<MainViewModel> {
        return MainViewModel::class.java
    }

}