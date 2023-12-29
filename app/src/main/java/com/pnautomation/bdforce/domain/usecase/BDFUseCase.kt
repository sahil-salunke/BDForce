package com.pnautomation.bdforce.domain.usecase

import com.pnautomation.bdforce.data.model.CardsDTO
import com.pnautomation.bdforce.domain.repository.BDFRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class BDFUseCase @Inject constructor(private val repository: BDFRepository) {

    operator fun invoke(): Flow<CardsDTO> = repository.getCardsData()

}