package saschpe.discogs.model.oauth

import com.google.gson.annotations.SerializedName

class AccessToken {
    @SerializedName("oauth_token")
    var oauthToken: String? = null

    @SerializedName("oauth_token_secret")
    var oauthTokenSecret: String? = null
}