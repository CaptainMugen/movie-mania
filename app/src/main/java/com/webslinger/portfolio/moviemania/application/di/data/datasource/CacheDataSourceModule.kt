package com.webslinger.portfolio.moviemania.application.di.data.datasource

import com.webslinger.portfolio.moviemania.data.repository.actor.datasource.ActorCacheDataSource
import com.webslinger.portfolio.moviemania.data.repository.movie.datasource.MovieCahceDataSource
import com.webslinger.portfolio.moviemania.data.repository.tvshow.datasource.TvShowCacheDataSource
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataSourceModule {
    @Singleton
    @Provides
    fun provideMovieCacheDataSource(): MovieCahceDataSource{
        return MovieCahceDataSource()
    }

    @Singleton
    @Provides
    fun provideTvShowCacheDataSource(): TvShowCacheDataSource{
        return TvShowCacheDataSource()
    }

    @Singleton
    @Provides
    fun provideActorCacheDataSource(): ActorCacheDataSource{
        return ActorCacheDataSource()
    }
}