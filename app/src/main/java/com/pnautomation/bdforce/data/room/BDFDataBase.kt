package com.pnautomation.bdforce.data.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.pnautomation.bdforce.data.model.RemoteKey
import com.example.beerapp.data.room.RemoteKeyDAO
import com.pnautomation.bdforce.data.model.CardsDTO

@Database(entities = [CardsDTO::class, RemoteKey::class], version = 1, exportSchema = false)
abstract class BDFDatabase : RoomDatabase() {

    companion object {
        fun getInstance(context: Context): BDFDatabase {
            return Room.databaseBuilder(context, BDFDatabase::class.java, "bdf_db").build()
        }
    }

    abstract fun getCardsDAO(): CardsDAO

    abstract fun getRemoteDAO(): RemoteKeyDAO

}