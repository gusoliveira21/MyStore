package com.gusoliveira.data.model

// TODO Utilizar a anotação do parse
data class ProductItem(
    val category: String,
    val description: String,
    val id: Int,
    val image: String,
    val price: Double, //se der erro, trocar para DecimalFormat
    val rating: Rating,
    val title: String
)