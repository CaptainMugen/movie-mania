package com.webslinger.portfolio.moviemania.domain.model

import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

data class TvShow(
    val backdropPath: String,
    val firstAirDate: String,
    val genreIds: List<Int>,
    val id: Int,
    val name: String,
    val originCountry: List<String>,
    val originalLanguage: String,
    val originalName: String,
    val overview: String,
    val popularity: Double,
    val posterPath: String,
    val voteAverage: Double,
    val voteCount: Int
)