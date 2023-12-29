package com.pnautomation.bdforce.data.model

import android.os.Parcelable
import androidx.annotation.Keep
import androidx.room.*
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "Cards")
@Keep
data class CardsDTO(
    @PrimaryKey
    val id: Long,
    val name: String? = "",
) : Parcelable