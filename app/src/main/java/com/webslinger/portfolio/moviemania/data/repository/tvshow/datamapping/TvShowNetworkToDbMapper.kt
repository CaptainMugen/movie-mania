package com.webslinger.portfolio.moviemania.data.repository.tvshow.datamapping

import com.webslinger.portfolio.moviemania.data.datamapping.tvshow.ITvShowNetworkToDbMapper
import com.webslinger.portfolio.moviemania.data.db.tvshow.DBTvShow
import com.webslinger.portfolio.moviemania.data.networking.model.tvshow.NetworkTVShow

private const val NA = "N/A"

class TvShowNetworkToDbMapper: ITvShowNetworkToDbMapper {
    override fun map(input: NetworkTVShow): DBTvShow {
        input.apply {
            return DBTvShow(
                backdropPath ?: NA,
                firstAirDate,
                genreIds,
                id,
                name,
                originCountry,
                originalLanguage,
                originalName,
                overview,
                popularity,
                posterPath,
                voteAverage,
                voteCount
            )
        }
    }
}