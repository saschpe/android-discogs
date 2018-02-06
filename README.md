# Discogs API client for Android
[![Download](https://api.bintray.com/packages/saschpe/maven/android-discogs/images/download.svg)](https://bintray.com/saschpe/maven/android-discogs/_latestVersion)
[![License](http://img.shields.io/:license-apache-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0.html)
[![Build Status](https://travis-ci.org/saschpe/android-discogs.svg?branch=master)](https://travis-ci.org/saschpe/android-discogs)
<a href="http://www.methodscount.com/?lib=saschpe.android%3Aandroid-discogs%3A0.1.3"><img src="https://img.shields.io/badge/Methods and size-core: 100 | deps: 19640 | 25 KB-e91e63.svg"/></a>

This Java / Android library provides access to the Discogs API using *Retrofit*. Currently supports *Discogs Authentication* and a bunch of API queries. You can find the full Discogs API description here:

- https://www.discogs.com/developers

# Usage
To interact with Discog's API, create a new *Discogs* instance with your key and secret (See https://www.discogs.com/settings/developers). You can then access various API routes such as **database** or **release** like this (in Kotlin):
```kotlin
val discogs = Discogs("my-user-agent", key = "my-key", secret = "my-secret")

// Search the Discogs database for album / artist...
discogs.database
    .search(hashMapOf(
        SEARCH_ARTIST to "Nine Inch Nails",
        SEARCH_TRACK to "La Mer"))
    .enqueue(object : Callback<Search> {
        override fun onFailure(call: Call<Search>, t: Throwable) {}

        override fun onResponse(call: Call<Search>, response: Response<Search>) {
            val search = response.body()
            // Do something with the search result...
        })

// Query a particular release...
discogs.release
    .release("123141231")
    .enqueue(object : Callback<Release> {
        override fun onFailure(call: Call<Release>, t: Throwable) {}

        override fun onResponse(call: Call<Release>, response: Response<Release>) {
            val release = response.body()
        })
```

# Download
```groovy
implementation 'saschpe.android:discogs:0.1.3'
```

Snapshots of the development version are available in [Sonatype's `snapshots` repository][snap].

# Users
* [Alpha+ Player](https://play.google.com/store/apps/details?id=saschpe.alphaplus)

# License

    Copyright 2018 Sascha Peilicke

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.


 [snap]: https://oss.sonatype.org/content/repositories/snapshots/
