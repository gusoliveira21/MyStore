package com.gusoliveira.data.model.itemProduct

import com.squareup.moshi.Json

data class Rating(
    @field:Json(name = "count") val count: Int,
    @field:Json(name = "rate") val rate: Double
)