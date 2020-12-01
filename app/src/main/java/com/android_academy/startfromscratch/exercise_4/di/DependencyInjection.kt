package com.android_academy.startfromscratch.exercise_4.di

import com.android_academy.db.MovieDao
import com.android_academy.db.di.DBDependency
import com.android_academy.startfromscratch.MoviesApp
import com.ergv.learning.ext_network.MoviesService
import com.ergv.learning.ext_network.di.NetworkDependency
import com.android_academy.startfromscratch.exercise_4.providers.MovieDatabaseProvider
import com.android_academy.startfromscratch.exercise_4.providers.MovieDatabaseProviderImpl
import com.android_academy.startfromscratch.exercise_4.providers.MovieNetworkProvider
import com.android_academy.startfromscratch.exercise_4.providers.MovieNetworkProviderImpl
import com.android_academy.startfromscratch.exercise_4.repository.MoviesRepository
import com.android_academy.startfromscratch.exercise_4.repository.MoviesRepositoryImpl
import java.util.concurrent.Executors

import java.util.concurrent.ThreadPoolExecutor

object DependencyInjection {
    //DONE change MockDBDependency to DBDependency and remove casting
    val dbProvider: MovieDatabaseProvider = MovieDatabaseProviderImpl(DBDependency.getMoviesDao(
        MoviesApp.applicationContext()) as MovieDao)

    //DONE change MockNetworkDependency to NetworkDependency and remove casting
    val networkProvider: MovieNetworkProvider = MovieNetworkProviderImpl(NetworkDependency.movieService as MoviesService)

    val moviesRepo: MoviesRepository = MoviesRepositoryImpl(dbProvider, networkProvider)

    val viewModelExecutor: ThreadPoolExecutor =
        Executors.newFixedThreadPool(10) as ThreadPoolExecutor
}