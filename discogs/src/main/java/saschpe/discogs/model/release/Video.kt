package saschpe.discogs.model.release

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Video {
    @SerializedName("description")
    @Expose
    var description: String? = null
    @SerializedName("duration")
    @Expose
    var duration: Int = 0
    @SerializedName("embed")
    @Expose
    var embed: Boolean = false
    @SerializedName("title")
    @Expose
    var title: String? = null
    @SerializedName("uri")
    @Expose
    var uri: String? = null
}