package com.pnautomation.bdforce.di

import android.content.Context
import androidx.paging.ExperimentalPagingApi
import com.example.beerapp.data.room.RemoteKeyDAO
import com.pnautomation.bdforce.data.remote.ApiService
import com.pnautomation.bdforce.data.repository.BDFRepositoryImpl
import com.pnautomation.bdforce.data.room.BDFDatabase
import com.pnautomation.bdforce.data.room.CardsDAO
import com.pnautomation.bdforce.domain.repository.BDFRepository
import com.pnautomation.bdforce.utils.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object BDFModule {

    @Provides
    @Singleton
    fun provideDataService(): ApiService {
        return Retrofit.Builder().baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()).build()
            .create(ApiService::class.java)
    }

    @OptIn(ExperimentalPagingApi::class)
    @Provides
    fun provideBeerListRepository(
        apiService: ApiService,
        cardsDAO: CardsDAO,
        remoteKeyDAO: RemoteKeyDAO
    ): BDFRepository {
        return BDFRepositoryImpl(apiService, cardsDAO, remoteKeyDAO)
    }

    @Provides
    fun getBeerDatabase(@ApplicationContext context: Context): BDFDatabase {
        return BDFDatabase.getInstance(context)
    }

    @Provides
    fun provideBeerDAO(bdfDatabase: BDFDatabase): CardsDAO = bdfDatabase.getCardsDAO()

    @Provides
    fun provideRemoteKeyDAO(bdfDatabase: BDFDatabase): RemoteKeyDAO = bdfDatabase.getRemoteDAO()

}