package ui.model.login

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import data.UserRepository
import kotlinx.coroutines.launch

class LoginViewModel(val userRepository: UserRepository) : ViewModel() {

    var loginSuccess = MutableLiveData<Boolean>()

    fun login(id : String, password : Int){
        viewModelScope.launch {
            var user = userRepository.getUser(id)
            loginSuccess.value = user.password == password
            userRepository.detailUser = user
        }
    }
}