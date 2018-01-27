package saschpe.discogs.model.release

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Identifier {
    @SerializedName("type")
    @Expose
    var type: String? = null
    @SerializedName("value")
    @Expose
    var value: String? = null
}