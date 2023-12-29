package com.pnautomation.bdforce.data.room

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.pnautomation.bdforce.data.model.CardsDTO

@Dao
interface CardsDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(list: List<CardsDTO>)

    @Query("DELETE FROM Cards")
    suspend fun deleteCards()

    @Query("SELECT * FROM Cards")
    fun getAllCards(): PagingSource<Int, CardsDTO>

}