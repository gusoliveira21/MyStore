package com.gusoliveira.domain.repository

import com.gusoliveira.domain.entities.ProductEntity

interface MyStoreRepository {
    suspend fun getProduct():List<ProductEntity>
}