package com.newproject.user.view.listeners

import androidx.fragment.app.Fragment

interface FragmentInteractionListener {
    fun switchFragment(fragment: Fragment)
    fun onBackPressedFromFragment()
    fun switchFragmentWithKey(fragment: Fragment, key:String)
}