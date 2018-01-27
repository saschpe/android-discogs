package saschpe.discogs.model.release

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Tracklist {

    @SerializedName("duration")
    @Expose
    var duration: String? = null
    @SerializedName("position")
    @Expose
    var position: String? = null
    @SerializedName("title")
    @Expose
    var title: String? = null
    @SerializedName("type_")
    @Expose
    var type: String? = null
}