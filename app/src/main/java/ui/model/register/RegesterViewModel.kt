package ui.model.register

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import data.User
import data.UserRepository
import kotlinx.coroutines.launch

class RegesterViewModel(val userRepository: UserRepository) : ViewModel() {

    var resultUserLiveData = MutableLiveData<User?>()

//    var user = userRepository.getUser()
    fun register(user : User){
        viewModelScope.launch {
           var resultUser = userRepository.register(user)
            resultUserLiveData.value = resultUser
            userRepository.detailUser = resultUser
        }
    }
}