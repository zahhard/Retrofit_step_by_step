package data

import retrofit2.http.Body
import retrofit2.http.POST

interface LoginService {

     @POST("users")
     suspend fun register(@Body user : User) : User
}