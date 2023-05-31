package com.munchngiveandroid.user.base

import android.app.Dialog
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.newproject.user.R


abstract class BaseFragment <T: ViewDataBinding, VM: ViewModel>: Fragment() {

    protected lateinit var binding: T
    protected lateinit var viewModel: VM

    private lateinit var progressDialog:Dialog

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,getLayoutId(),container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[getViewModelClass()]
        setUpProgressDialog()
    }

    @LayoutRes
    abstract fun getLayoutId(): Int
    abstract fun getViewModelClass(): Class<VM>
    private fun setUpProgressDialog(){
        val view: View = layoutInflater.inflate(R.layout.progress_dialog,null)
        progressDialog = Dialog(requireActivity(), R.style.AppTheme)
        progressDialog.setContentView(view)
        progressDialog.window?.setBackgroundDrawable(
            ColorDrawable(
                ContextCompat.getColor(
                    requireContext(),
                    R.color.colorTransparent
                )
            )
        )
    }

    protected fun showProgress(isVisible: Boolean){
        if (isVisible) progressDialog.show() else progressDialog.cancel()
    }

}