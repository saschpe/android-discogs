package saschpe.discogs.model.database

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Search {
    @SerializedName("pagination")
    @Expose
    var pagination: Pagination? = null
    @SerializedName("results")
    @Expose
    var results: List<Result>? = null
}