package saschpe.discogs.model.release

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Label {
    @SerializedName("catno")
    @Expose
    var catno: String? = null
    @SerializedName("entity_type")
    @Expose
    var entityType: String? = null
    @SerializedName("id")
    @Expose
    var id: Int = 0
    @SerializedName("name")
    @Expose
    var name: String? = null
    @SerializedName("resource_url")
    @Expose
    var resourceUrl: String? = null
}