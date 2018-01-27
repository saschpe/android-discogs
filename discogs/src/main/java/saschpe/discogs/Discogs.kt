package saschpe.discogs

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import saschpe.discogs.service.DatabaseService
import saschpe.discogs.service.ReleaseService

/**
 * Discogs API client for Android.
 */
class Discogs
/**
 * Constructor supporting OAuth / Discogs auth via key / secret pair or just Discogs auth
 * with a token.
 *
 * @param userAgent You application's HTTP user-agent
 * @param key OAuth consumer key / Discogs auth key
 * @param secret OAuth consumer secret / Discogs auth secret
 * @param token Discogs auth token. Can be used instead of {@link key} and {@link secret} when
 *              OAuth is not required.
 */(
    private val userAgent: String,
    private val key: String? = null,
    private val secret: String? = null,
    private val token: String? = null
) {
    private val retrofit: Retrofit

    init {
        val logging = HttpLoggingInterceptor()
        if (BuildConfig.DEBUG) {
            logging.level = HttpLoggingInterceptor.Level.BODY
        } else {
            logging.level = HttpLoggingInterceptor.Level.BASIC
        }

        val httpClient = OkHttpClient.Builder()
            .addInterceptor({
                val authHeaderValue = if (token != null) {
                    "Discogs token=%s".format(token)
                } else {
                    "Discogs key=%s, secret=%s".format(key, secret)
                }

                val original = it.request()
                val request = original.newBuilder()
                    .header("User-Agent", userAgent)
                    .header("Authorization", authHeaderValue)
                    .method(original.method(), original.body())
                    .build()
                it.proceed(request)
            })
            .addInterceptor(logging)

        retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(httpClient.build())
            .build()
    }

    /**
     * Access to <i>database</i> resource.
     *
     * @see <a href="https://www.discogs.com/developers/#page:database,header:database-search">Search resource reference</a>
     */
    val database: DatabaseService by lazy {
        retrofit.create(DatabaseService::class.java)
    }

    val release: ReleaseService by lazy {
        retrofit.create(ReleaseService::class.java)
    }

    companion object {
        private const val BASE_URL = "https://api.discogs.com/"
    }
}
