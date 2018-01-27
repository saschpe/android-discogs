package saschpe.discogs.model.oauth

import com.google.gson.annotations.SerializedName

class RequestToken {
    @SerializedName("oauth_token")
    var oauthToken: String? = null

    @SerializedName("oauth_token_secret")
    var oauthTokenSecret: String? = null

    @SerializedName("oauth_callback_confirmed")
    var oauthCallbackConfirmed: Boolean? = false
}