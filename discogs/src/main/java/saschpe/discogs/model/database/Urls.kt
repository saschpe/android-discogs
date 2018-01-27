package saschpe.discogs.model.database

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Urls {
    @SerializedName("last")
    @Expose
    var last: String? = null
    @SerializedName("next")
    @Expose
    var next: String? = null
}