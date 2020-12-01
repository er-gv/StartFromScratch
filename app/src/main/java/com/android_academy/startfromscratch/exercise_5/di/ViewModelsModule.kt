
package com.android_academy.startfromscratch.exercise_5.di

import android.util.Log
import com.android_academy.startfromscratch.exercise_5.repository.MoviesRepository
import com.android_academy.startfromscratch.exercise_5.ui.details.DetailsViewModelImpl
import com.android_academy.startfromscratch.exercise_5.ui.mainMovies.MoviesViewModelImpl
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import java.util.*

val viewModelsModule = module {

    viewModel {
        Log.d("viewModelsModule", "creating viewModel: MoviesViewModelImpl")
        MoviesViewModelImpl(
            //DONE change it to "get()" method. It will find what the right class and dependecy to it
            moviesRepository = get()
        )
    }

    //DONE Add here viewModel block to provide our DetailsViewModelImpl with moviesRepository dependency
    viewModel {
        DetailsViewModelImpl(
            moviesRepository = get()
        )
    }
}
