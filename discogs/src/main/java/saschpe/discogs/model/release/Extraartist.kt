package saschpe.discogs.model.release

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Extraartist {
    @SerializedName("anv")
    @Expose
    var anv: String? = null
    @SerializedName("id")
    @Expose
    var id: Int = 0
    @SerializedName("join")
    @Expose
    var join: String? = null
    @SerializedName("name")
    @Expose
    var name: String? = null
    @SerializedName("resource_url")
    @Expose
    var resourceUrl: String? = null
    @SerializedName("role")
    @Expose
    var role: String? = null
    @SerializedName("tracks")
    @Expose
    var tracks: String? = null
}