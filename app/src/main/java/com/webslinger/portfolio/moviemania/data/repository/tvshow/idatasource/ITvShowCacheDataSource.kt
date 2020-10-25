package com.webslinger.portfolio.moviemania.data.repository.tvshow.idatasource

import com.webslinger.portfolio.moviemania.domain.model.TvShow

interface ITvShowCacheDataSource {
    fun getTvShows(): List<TvShow>
    fun updateTvShows(tvShows: List<TvShow>)
}
