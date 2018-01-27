package saschpe.discogs.model.release

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Rating {
    @SerializedName("average")
    @Expose
    var average: Double = 0.toDouble()
    @SerializedName("count")
    @Expose
    var count: Int = 0
}