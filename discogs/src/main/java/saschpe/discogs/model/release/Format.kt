package saschpe.discogs.model.release

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Format {
    @SerializedName("descriptions")
    @Expose
    var descriptions: List<String>? = null
    @SerializedName("name")
    @Expose
    var name: String? = null
    @SerializedName("qty")
    @Expose
    var qty: String? = null
}