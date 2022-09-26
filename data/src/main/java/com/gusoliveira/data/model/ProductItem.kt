package com.gusoliveira.data.model

import java.text.DecimalFormat

data class ProductItem(
    val category: String,
    val description: String,
    val id: Int,
    val image: String,
    val price: DecimalFormat, //se der erro, trocar para Double
    val rating: Rating,
    val title: String
)