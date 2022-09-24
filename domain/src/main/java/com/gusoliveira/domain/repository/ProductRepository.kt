package com.gusoliveira.domain.repository

import com.gusoliveira.domain.entities.Product

interface ProductRepository {
    suspend fun getProduct():List<Product>
}