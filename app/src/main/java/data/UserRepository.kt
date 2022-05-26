package data

import android.util.Log

class UserRepository (val userLocalDataSource: UserLocalDataSource,
                      val userRemoteDataSource: UserRemoteDataSource) {

    var resultUser : User? = null

    suspend fun getUser(user : User) : User {
        Log.d("panjshanbe" , "getUser in UserRepository called")
        val usered = userRemoteDataSource.register(user)
        userLocalDataSource.setUser(user)
        return  usered
    }

    suspend fun register(user: User): User? {
        resultUser = userRemoteDataSource.register(user)
        return resultUser
    }

    suspend fun getUser(id : String) : User {
        return userRemoteDataSource.getUser(id)
    }

//    suspend fun login()
}