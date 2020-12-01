package com.android_academy.db

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Movie(
    @PrimaryKey
    val movieId: Int,
    val name: String,
    val imageUrl: String,
    val overview: String?,
    val releaseDate: String,
    val voteAverage: Double
)