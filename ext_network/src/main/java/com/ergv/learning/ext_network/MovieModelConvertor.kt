package com.android_academy.db.di

import com.android_academy.db.Movie
import com.android_academy.db.MoviesListResult
import com.ergv.learning.ext_network.NetworkingConstants.POSTER_BASE_URL

object MovieModelConverter {

    //DONE after moving MoviesListResult to network module change here import as well
    fun convertNetworkMovieToModel(model: MoviesListResult): List<Movie> {
        return model.results.map {
            Movie(
                movieId = it.id,
                name = it.title,
                imageUrl = "${POSTER_BASE_URL}${it.posterPath}",
                overview = it.overview,
                voteAverage = it.voteAverage,
                releaseDate = it.release_date
            )
        }
    }
}