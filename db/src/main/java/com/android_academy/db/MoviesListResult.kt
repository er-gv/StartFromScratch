package com.android_academy.db

import com.android_academy.db.MovieResult
import com.google.gson.annotations.SerializedName

data class MoviesListResult (

    @SerializedName("page") val page : Int,
    @SerializedName("total_results") val totalResults : Int,
    @SerializedName("total_pages") val totalPages : Int,
    @SerializedName("results") val results : List<MovieResult>
)
