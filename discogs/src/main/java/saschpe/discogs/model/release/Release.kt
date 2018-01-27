package saschpe.discogs.model.release

import android.provider.MediaStore.Video
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Release {
    @SerializedName("title")
    @Expose
    var title: String? = null
    @SerializedName("id")
    @Expose
    var id: Int = 0
    @SerializedName("artists")
    @Expose
    var artists: List<Artist>? = null
    @SerializedName("data_quality")
    @Expose
    var dataQuality: String? = null
    @SerializedName("thumb")
    @Expose
    var thumb: String? = null
    @SerializedName("community")
    @Expose
    var community: Community? = null
    @SerializedName("companies")
    @Expose
    var companies: List<Company>? = null
    @SerializedName("country")
    @Expose
    var country: String? = null
    @SerializedName("date_added")
    @Expose
    var dateAdded: String? = null
    @SerializedName("date_changed")
    @Expose
    var dateChanged: String? = null
    @SerializedName("estimated_weight")
    @Expose
    var estimatedWeight: Int = 0
    @SerializedName("extraartists")
    @Expose
    var extraartists: List<Extraartist>? = null
    @SerializedName("format_quantity")
    @Expose
    var formatQuantity: Int = 0
    @SerializedName("formats")
    @Expose
    var formats: List<Format>? = null
    @SerializedName("genres")
    @Expose
    var genres: List<String>? = null
    @SerializedName("identifiers")
    @Expose
    var identifiers: List<Identifier>? = null
    @SerializedName("images")
    @Expose
    var images: List<Image>? = null
    @SerializedName("labels")
    @Expose
    var labels: List<Label>? = null
    @SerializedName("lowest_price")
    @Expose
    var lowestPrice: Double = 0.toDouble()
    @SerializedName("master_id")
    @Expose
    var masterId: Int = 0
    @SerializedName("master_url")
    @Expose
    var masterUrl: String? = null
    @SerializedName("notes")
    @Expose
    var notes: String? = null
    @SerializedName("num_for_sale")
    @Expose
    var numForSale: Int = 0
    @SerializedName("released")
    @Expose
    var released: String? = null
    @SerializedName("released_formatted")
    @Expose
    var releasedFormatted: String? = null
    @SerializedName("resource_url")
    @Expose
    var resourceUrl: String? = null
    @SerializedName("series")
    @Expose
    var series: List<Any>? = null
    @SerializedName("status")
    @Expose
    var status: String? = null
    @SerializedName("styles")
    @Expose
    var styles: List<String>? = null
    @SerializedName("tracklist")
    @Expose
    var tracklist: List<Tracklist>? = null
    @SerializedName("uri")
    @Expose
    var uri: String? = null
    @SerializedName("videos")
    @Expose
    var videos: List<Video>? = null
    @SerializedName("year")
    @Expose
    var year: Int = 0
}