package com.gusoliveira.data.model

import com.squareup.moshi.Json

data class ItemProduct(
    @field:Json(name = "id") val id: Int,
    @field:Json(name = "title") val title: String,
    @field:Json(name = "price") val price: Double,
    @field:Json(name = "description") val description: String,
    @field:Json(name = "category") val category: String,
    @field:Json(name = "image") val image: String,
    @field:Json(name = "rating") val rating: Rating
)