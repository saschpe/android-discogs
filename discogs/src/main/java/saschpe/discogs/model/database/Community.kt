package saschpe.discogs.model.database

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Community {
    @SerializedName("want")
    @Expose
    var want: Int = 0
    @SerializedName("have")
    @Expose
    var have: Int = 0
}