package com.android_academy.startfromscratch.exercise_1.ui.mainMovies

import com.android_academy.db.Movie

interface OnMovieClickListener {
    //DONE Exercise #1 Fix import of Movie class after you move network to separate module
    fun onMovieClicked(movie: Movie, adapterPosition: Int)

}