package com.android_academy.startfromscratch.exercise_1.di

import com.ergv.learning.ext_network.di.MockNetworkDependency
import com.android_academy.startfromscratch.exercise_1.providers.MovieNetworkProvider
import com.android_academy.startfromscratch.exercise_1.providers.MovieNetworkProviderImpl
import java.util.concurrent.Executors
import java.util.concurrent.ThreadPoolExecutor

object DependencyInjection {
    val networkProvider: MovieNetworkProvider =
        //DONE Exercise #1 After you move MockNetworkDependency to network module change an import to use it from network module
        MovieNetworkProviderImpl(MockNetworkDependency.movieService)

    val viewModelExecutor: ThreadPoolExecutor =
        Executors.newFixedThreadPool(10) as ThreadPoolExecutor
}