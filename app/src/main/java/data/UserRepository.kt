package data

import android.util.Log
import java.util.*

class UserRepository (val userLocalDataSource: UserLocalDataSource,
                      val userRemoteDataSource: UserRemoteDataSource) {

    var resultUser : User? = null
    var detailUser : User? = null

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

    suspend fun getUserList(): List<User>{
        return userRemoteDataSource.getUserLIst()
    }

    suspend fun updateState(status : String) : User{
        return userRemoteDataSource.updateState(detailUser!!.id, status)
    }
}