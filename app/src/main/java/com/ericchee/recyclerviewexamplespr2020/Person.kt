package com.ericchee.recyclerviewexamplespr2020

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Person(
    val id: String,
    val name: String,
    val age: Int
): Parcelable