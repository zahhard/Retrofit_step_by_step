package ui.model.register

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.retrofit_step_by_step.R
import com.example.retrofit_step_by_step.databinding.FragmentRegesterBinding
import data.User
import org.koin.androidx.viewmodel.ext.android.viewModel


class RegesterFragment : Fragment() {
    private lateinit var binding: FragmentRegesterBinding
    val regesterViewModel : RegesterViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRegesterBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnRegister.setOnClickListener {
            var user = User(
                binding.editTextAvatarUrl.text.toString(),
                binding.editTextName.text.toString(),
                Integer.parseInt(binding.editTextPassword.text.toString())
            )

            regesterViewModel.register(user)
            regesterViewModel.resultUserLiveData.observe(viewLifecycleOwner){
                Toast.makeText(requireContext(), "Id =" + it?.id, Toast.LENGTH_SHORT).show()
                findNavController().navigate(R.id.action_regesterFragment_to_homeFragment)
            }
        }

        binding.goToLogin.setOnClickListener {
            findNavController().navigate(R.id.action_regesterFragment_to_loginFragment)
        }
    }

}