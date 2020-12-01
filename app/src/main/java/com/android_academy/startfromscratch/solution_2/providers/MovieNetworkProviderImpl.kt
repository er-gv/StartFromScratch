package com.android_academy.startfromscratch.solution_2.providers

import com.android_academy.db.MoviesListResult
import com.ergv.learning.ext_network.di.MockMovieService

interface MovieNetworkProvider {
    fun getMovies(): MoviesListResult?
}

class MovieNetworkProviderImpl(private val service: MockMovieService) : MovieNetworkProvider {

    override fun getMovies(): MoviesListResult? {
        return try {
            service.latestMovies()
        } catch (e: Throwable) {
            null
        }
    }
}