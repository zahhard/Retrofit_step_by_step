package data

import android.util.Log

class UserRemoteDataSource(val loginApiService : LoginService) {

    suspend fun register(user : User) : User {
        Log.d("panjshanbe" , "getUser in UserRemoteDataSource called")
        //loginApiService.getUser()
//        return User("1" , "karim", "1111")

        return loginApiService.register(user)
    }

    suspend fun getUser(id: String) : User {
        return loginApiService.getUser(id)
    }

}