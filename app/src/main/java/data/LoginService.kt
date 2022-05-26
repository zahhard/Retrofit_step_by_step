package data

import retrofit2.http.*

interface LoginService {

     @POST("users")
     suspend fun register(@Body user : User) : User

     @GET("users/{id}")
     suspend fun getUser(@Path("id") id: String): User
}