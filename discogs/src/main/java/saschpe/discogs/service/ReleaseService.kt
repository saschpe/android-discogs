package saschpe.discogs.service

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import saschpe.discogs.model.release.Release

interface ReleaseService {
    /**
     * See <a href="https://www.discogs.com/developers/#page:database,header:database-release">Release resource reference</a>
     */
    @GET("releases/{release_id}")
    fun release(@Path("release_id") releaseId: String, @Query("curr_abbr") currencyAbbreviation: String? = null): Call<Release>

    /**
     * See <a href="https://www.discogs.com/developers/#page:database,header:database-release-rating-by-user">Release resource reference</a>
     */
    @GET("releases/{release_id}/rating/{username}")
    fun releaseRating(@Path("release_id") releaseId: String, @Path("username") username: String)
}