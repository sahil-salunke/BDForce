package com.pnautomation.bdforce.data.model

import androidx.annotation.Keep
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
@Keep
data class RemoteKey(
    @PrimaryKey(autoGenerate = false)
    val id: Long,
    val next: Int?,
    val prev: Int?
)