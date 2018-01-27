package saschpe.discogs.service

import okhttp3.Response
import retrofit2.Call
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface OAuthService {
    @GET("oauth/request_token")
    @FormUrlEncoded
    fun requestToken(): Call<Response>

    @POST("oauth/access_token")
    @FormUrlEncoded
    fun accessToken(): Call<Response>

    @GET("oauth/authorize")
    @FormUrlEncoded
    fun authorize(): Call<Response>
}