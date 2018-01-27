package saschpe.discogs.model.user

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Identity {
    @SerializedName("id")
    @Expose
    var id: Int = 0
    @SerializedName("username")
    @Expose
    var username: String? = null
    @SerializedName("resource_url")
    @Expose
    var resourceUrl: String? = null
    @SerializedName("consumer_name")
    @Expose
    var consumerName: String? = null
}