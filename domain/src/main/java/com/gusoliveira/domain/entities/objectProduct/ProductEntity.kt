package com.gusoliveira.domain.entities.objectProduct

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ProductEntity(
    var id: Int,
    var title: String,
    var price: Double,
    var description: String,
    var category: String,
    var image: String,
    var rating: Rating
) : Parcelable
