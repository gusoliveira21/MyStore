package com.gusoliveira.domain.entities.objectProduct

data class ProductEntity(
    var id: Int,
    var title: String,
    var price: Double,
    var description: String,
    var category: String,
    var image: String,
    var rating: Rating
)
