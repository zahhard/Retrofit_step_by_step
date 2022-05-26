package ui.model.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import data.User
import data.UserRepository
import kotlinx.coroutines.launch

class HomeViewModel (val userRepository: UserRepository) : ViewModel() {

//    val userListLivaData = MutableLiveData<List<User>>()
//
//    fun getUserList(){
//        viewModelScope.launch {
//            userListLivaData.value = userRepository.getUserList()
//        }
//    }

    var userLiveData = MutableLiveData<User>()

    fun login(id : String, password : Int){
        viewModelScope.launch {
            var user = userRepository.getUser(id)
            userLiveData.value = user
        }
    }

    fun getUser() : User?{
        return userRepository.detailUser
    }

    fun updateState(status: String){
        viewModelScope.launch {
            userRepository.updateState(status)
        }
    }

}