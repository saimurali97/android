package com.newproject.user.view.ui.auth
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.navigation.Navigation
import com.newproject.user.MainActivity
import com.newproject.user.R
import com.newproject.user.databinding.FragmentLoginBinding
import com.munchngiveandroid.user.base.*
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginFragment : BaseFragment<FragmentLoginBinding, AuthViewModel>() {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnSkip.setOnClickListener {
            val intent = Intent(requireActivity(), MainActivity::class.java)
            startActivity(intent)
            requireActivity().finish()
        }

        binding.btnSignUp.setOnClickListener {
            Navigation.findNavController(requireView()).navigate(R.id.action_loginFragment_to_signUpFragment)
        }

        binding.btnLogin.setOnClickListener {
            //var loginBody = LoginBody(binding.edtEmail.text.toString())
            val intent = Intent(requireActivity(), MainActivity::class.java)
            startActivity(intent)
            requireActivity().finish()

        }


    }

    override fun getLayoutId(): Int {
        return R.layout.fragment_login
    }

    override fun getViewModelClass(): Class<AuthViewModel> {
        return AuthViewModel::class.java
    }

}