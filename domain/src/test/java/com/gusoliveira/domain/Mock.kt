package com.gusoliveira.domain

import com.gusoliveira.domain.entities.objectProduct.ProductEntity
import com.gusoliveira.domain.entities.objectProduct.Rating

val productEntityData = listOf(
    ProductEntity(
        id = 1,
        title = "Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops",
        price = 109.5,
        description = "Your perfect pack for everyday use and walks in the forest. Stash your laptop (up to 15 inches) in the padded sleeve, your everyday",
        category = "men's clothing",
        image = "https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg",
        Rating(
            rate = 3.9,
            count = 120
        )
)
)