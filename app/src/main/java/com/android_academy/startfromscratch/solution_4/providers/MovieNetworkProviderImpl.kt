package com.android_academy.startfromscratch.solution_4.providers

import com.android_academy.db.MoviesListResult
import com.ergv.learning.ext_network.di.MockMovieService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

interface MovieNetworkProvider {
    suspend fun getMovies() : MoviesListResult
}

class MovieNetworkProviderImpl(private val service: MockMovieService) : MovieNetworkProvider {

    override suspend fun getMovies(): MoviesListResult = withContext(Dispatchers.IO) {
        return@withContext service.latestMovies()
    }
}