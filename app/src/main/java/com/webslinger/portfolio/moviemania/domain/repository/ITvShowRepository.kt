package com.webslinger.portfolio.moviemania.domain.repository

import com.webslinger.portfolio.moviemania.domain.model.TvShow

interface ITvShowRepository {
    suspend fun getTvShows(): List<TvShow>

    suspend fun getUpdatedTvShows(): List<TvShow>
}
