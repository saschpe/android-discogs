package saschpe.discogs.service

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.QueryMap
import saschpe.discogs.model.database.Search

interface DatabaseService {
    /**
     * See <a href="https://www.discogs.com/developers/#page:database,header:database-search">Search resource reference</a>
     */
    @GET("database/search")
    fun search(@QueryMap options: Map<String, String>): Call<Search>

    companion object {
        const val SEARCH_QUERY = "q"
        const val SEARCH_TYPE = "type"
        const val SEARCH_TITLE = "title"
        const val SEARCH_RELEASE_TITLE = "release_title"
        const val SEARCH_CREDIT = "credit"
        const val SEARCH_ARTIST = "artist"
        const val SEARCH_ANV = "anv"
        const val SEARCH_LABEL = "label"
        const val SEARCH_GENRE = "genre"
        const val SEARCH_STYLE = "style"
        const val SEARCH_COUNTRY = "country"
        const val SEARCH_YEAR = "year"
        const val SEARCH_FORMAT = "format"
        const val SEARCH_CATNO = "catno"
        const val SEARCH_BARCODE = "barcode"
        const val SEARCH_TRACK = "track"
        const val SEARCH_SUBMITTER = "submitter"
        const val SEARCH_CONTRIBUTOR = "contributor"
    }
}