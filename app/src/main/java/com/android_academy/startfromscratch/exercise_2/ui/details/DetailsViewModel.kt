package com.android_academy.startfromscratch.exercise_2.ui.details

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.android_academy.db.Movie
import com.android_academy.db.MovieModelConverter
import com.android_academy.db.MoviesListResult
import com.android_academy.startfromscratch.exercise_2.providers.MovieNetworkProvider
import com.android_academy.startfromscratch.solution_3.di.DependencyInjection
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.details_fragment.*
import kotlinx.coroutines.MainScope

interface DetailsViewModel {
    fun observeMovieDetails(lifecycle: Lifecycle, observer: (Movie) -> Unit)
    fun loadMovie(movieId: Int)
}

class DetailsViewModelImpl(
    private val moviesNetworkProvider: MovieNetworkProvider) : ViewModel(),
    DetailsViewModel {

    private val executors = DependencyInjection.viewModelExecutor

    private val movieLiveData = MutableLiveData<Movie>()

    override fun observeMovieDetails(lifecycle: Lifecycle, observer: (Movie) -> Unit) {
        movieLiveData.observe({ lifecycle }) {
            observer(it)
        }
    }

    override fun loadMovie(movieId: Int) {
        executors.execute {
            //DONE 1. Load data view moviesNetworkProvider.getMovies()
            //DONE 2. Convert MoviesListResult to List<Movie>
            //DONE 3. Find movie with a requested movieId
            //DONE 4. Update live data with a movie object
            val moviesList: MoviesListResult = moviesNetworkProvider.getMovies() ?: return@execute
            val convertNetworkMovieToModel = MovieModelConverter.convertNetworkMovieToModel(moviesList)
            val movie = convertNetworkMovieToModel.firstOrNull { it.movieId == movieId }
            movie?.let {
                movieLiveData.postValue(movie)
            }
        }
    }
}
