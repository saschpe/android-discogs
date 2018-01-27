package saschpe.discogs.model.release

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Image {
    @SerializedName("height")
    @Expose
    var height: Int = 0
    @SerializedName("resource_url")
    @Expose
    var resourceUrl: String? = null
    @SerializedName("type")
    @Expose
    var type: String? = null
    @SerializedName("uri")
    @Expose
    var uri: String? = null
    @SerializedName("uri150")
    @Expose
    var uri150: String? = null
    @SerializedName("width")
    @Expose
    var width: Int = 0
}