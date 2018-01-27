package saschpe.discogs.model.database

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Pagination {
    @SerializedName("per_page")
    @Expose
    var perPage: Int = 0
    @SerializedName("pages")
    @Expose
    var pages: Int = 0
    @SerializedName("page")
    @Expose
    var page: Int = 0
    @SerializedName("urls")
    @Expose
    var urls: Urls? = null
    @SerializedName("items")
    @Expose
    var items: Int = 0
}