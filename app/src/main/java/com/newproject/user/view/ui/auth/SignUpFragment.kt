package com.newproject.user.view.ui.auth

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.view.View
import android.widget.Toast
import androidx.navigation.Navigation
import com.newproject.user.MainActivity
import com.newproject.user.R
import com.newproject.user.databinding.FragmentSignUpBinding

import com.munchngiveandroid.user.base.BaseFragment


import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SignUpFragment : BaseFragment<FragmentSignUpBinding, AuthViewModel>() {

    override fun getLayoutId(): Int {
        return R.layout.fragment_sign_up
    }

    override fun getViewModelClass(): Class<AuthViewModel> {
        return AuthViewModel::class.java
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.signUpBtnBack.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_signUpFragment_to_loginFragment)
        }
        binding.btnSkip.setOnClickListener {
            val intent = Intent(requireActivity(), MainActivity::class.java)
            startActivity(intent)
            requireActivity().finish()
        }
        binding.btnLogin.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_signUpFragment_to_loginFragment)
        }

        binding.btnCreateAccount.setOnClickListener{

      /*      if (checkValidation(binding.edtName.text.toString()) && checkEmail(binding.edtEmail.text.toString()) &&
                checkValidation(binding.edtPassword.text.toString()) && checkValidation(binding.edtPassword.text.toString())
            ) {
                *//**//*


                //userRegisterApiCall()


            } else {
                showToast(requireContext(), resources.getString(R.string.enter_all_fields))
            }*/

            val intent = Intent(requireActivity(), MainActivity::class.java)
            startActivity(intent)
            requireActivity().finish()

        }


    }

    private fun userRegisterApiCall() {


    }


    fun checkValidation(number: String): Boolean {

        if (number.isEmpty()) {
            return false
        }
        return true
    }

    private fun checkEmail(string: String): Boolean {
        return if (Patterns.EMAIL_ADDRESS.matcher(string).matches()) {
            true
        } else {
            Toast.makeText(context, "Enter Email Correctly", Toast.LENGTH_LONG).show()
            false
        }
    }


}