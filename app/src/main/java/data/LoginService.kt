package data

import androidx.room.Room
import retrofit2.http.*


interface LoginService {

     @POST("users")
     suspend fun register(@Body user : User) : User

     @GET("users/{id}")
     suspend fun getUser(@Path("id") id: String): User

     @GET("Users")
     suspend fun getUserList() : List<User>

     @FormUrlEncoded
     @PUT("users/{id}")
     suspend fun updateState(
          @Path("id") roomId: String?,
          @Field("status") state: String?
     ): User
}