package com.munchngiveandroid.user.base

import android.app.Dialog
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.newproject.user.R


abstract class BaseActivityViewModel<T : ViewDataBinding, VM : ViewModel> : AppCompatActivity() {
    lateinit var binding: T
    protected lateinit var viewModel: VM
    private lateinit var progressDialog:Dialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, getLayoutId())
        viewModel = ViewModelProvider(this)[getViewModelClass()]
        setUpProgressDialog()
    }


    fun <T : ViewDataBinding> bindView(): Lazy<T> {
        return lazy { binding as T }
    }

    @LayoutRes
    abstract fun getLayoutId(): Int
    abstract fun getViewModelClass(): Class<VM>

    private fun setUpProgressDialog(){
        val view: View = layoutInflater.inflate(R.layout.progress_dialog,null)
        progressDialog = Dialog(this, R.style.AppTheme)
        progressDialog.setContentView(view)
        progressDialog.window?.setBackgroundDrawable(
            ColorDrawable(
                ContextCompat.getColor(
                    this,
                    R.color.colorTransparent
                )
            )
        )
    }

    protected fun showProgress(isVisible: Boolean){
        if (isVisible) progressDialog.show() else progressDialog.cancel()
    }


}