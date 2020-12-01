package com.ergv.learning.ext_network

import com.android_academy.db.MoviesListResult
import retrofit2.http.GET
import retrofit2.http.Query



interface MoviesService {

    @GET("discover/movie${NetworkingConstants.DISCOVER_QUERY_PATH}")
    suspend fun latestMovies(
        @Query("year") year: Int = 2020,
        @Query("api_key") apiKey: String = NetworkingConstants.apiKey
    ): MoviesListResult

}
