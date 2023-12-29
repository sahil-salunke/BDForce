package com.pnautomation.bdforce.presentation

import androidx.lifecycle.*
import com.pnautomation.bdforce.data.model.CardsDTO
import com.pnautomation.bdforce.domain.usecase.BDFUseCase
import com.pnautomation.bdforce.utils.SingleLiveEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import javax.inject.Inject

@HiltViewModel
class BDFViewModel @Inject constructor(private val bdfUseCase: BDFUseCase) :
    ViewModel() {

    val selectedCard = MutableLiveData<CardsDTO>()

    val reloadClick = SingleLiveEvent<Void>()

    private var _cardsList: Flow<CardsDTO> = flowOf()
    val resultList: Flow<CardsDTO>
        get() = _cardsList

    fun getCardsData() {
//        _cardsList = bdfUseCase()
    }

    fun reload() {
        reloadClick.call()
    }


}