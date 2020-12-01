package com.android_academy.startfromscratch.exercise_4.providers

import com.android_academy.db.MoviesListResult
import com.ergv.learning.ext_network.MoviesService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

interface MovieNetworkProvider {
    suspend fun getMovies() : MoviesListResult
}

class MovieNetworkProviderImpl(private val service: MoviesService) : MovieNetworkProvider {

    override suspend fun getMovies(): MoviesListResult = withContext(Dispatchers.IO) {
        return@withContext service.latestMovies()
    }
}