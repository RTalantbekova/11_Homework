package com.example.l11_homework

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class LayoutType (
    val layoutName : String
) : Parcelable
