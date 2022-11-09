package com.gusoliveira.data.util

import com.gusoliveira.data.model.ItemProduct
import com.gusoliveira.domain.entities.objectProduct.ProductEntity
import com.gusoliveira.domain.entities.objectProduct.Rating

fun ItemProduct.toProductEntity() = ProductEntity(
        id = id,
        title = title,
        price = price,
        description = description,
        category = category,
        image = image,
        rating = Rating(
            count = rating.count,
            rate = rating.rate
        )
    )
