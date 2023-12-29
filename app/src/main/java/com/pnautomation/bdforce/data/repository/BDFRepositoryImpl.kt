package com.pnautomation.bdforce.data.repository

import com.example.beerapp.data.room.RemoteKeyDAO
import com.pnautomation.bdforce.data.model.CardsDTO
import com.pnautomation.bdforce.domain.repository.BDFRepository
import com.pnautomation.bdforce.data.remote.ApiService
import com.pnautomation.bdforce.data.room.CardsDAO
import kotlinx.coroutines.flow.Flow

class BDFRepositoryImpl(
    private val apiService: ApiService,
    private val cardsDAO: CardsDAO,
    private val remoteKeyDAO: RemoteKeyDAO
) : BDFRepository {
    override fun getCardsData(): Flow<CardsDTO> {
        TODO("Not yet implemented")
    }


}
