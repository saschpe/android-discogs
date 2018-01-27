package saschpe.discogs.service

import retrofit2.Call
import retrofit2.http.GET
import saschpe.discogs.model.user.Identity

interface UserService {
    @GET("oauth/identity")
    fun identity(): Call<Identity>
}