package ui.model.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.retrofit_step_by_step.R
import com.example.retrofit_step_by_step.databinding.FragmentLoginBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding
    val loginViewModel: LoginViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        binding.textView.text = loginViewModel.user.name.toString()


        binding.btnLogin.setOnClickListener {
            loginViewModel.login(
                binding.editTextId.text.toString(),
                Integer.parseInt(binding.editTextPassword.text.toString())
            )
        }

        loginViewModel.loginSuccess.observe(viewLifecycleOwner) {
            if (it)
                findNavController().navigate(R.id.action_loginFragment_to_homeFragment)
            else
                Toast.makeText(requireContext(), "not valid", Toast.LENGTH_SHORT).show()
        }
    }
}