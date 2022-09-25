package com.gusoliveira.domain.repository

import com.gusoliveira.domain.entities.ProductEntity

interface ProductRepository {
    suspend fun getProduct():List<ProductEntity>
}