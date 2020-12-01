package com.ergv.learning.ext_network.di

import com.android_academy.db.MoviesListResult
import com.google.gson.Gson

object MockNetworkDependency {
    val movieService = object : MockMovieService {
        override fun latestMovies(year: Int, apiKey: String): MoviesListResult {
            val gson = Gson()
            return gson.fromJson(mockData, MoviesListResult::class.java)
        }
    }
}