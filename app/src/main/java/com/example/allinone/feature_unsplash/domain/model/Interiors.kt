package com.example.allinone.feature_unsplash.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Interiors(
    val approved_on: String,
    val status: String
): Parcelable