package com.pnautomation.bdforce.domain.repository

import com.pnautomation.bdforce.data.model.CardsDTO
import kotlinx.coroutines.flow.Flow

interface BDFRepository {

    fun getCardsData(): Flow<CardsDTO>

}