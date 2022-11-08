package com.gusoliveira.domain.repository

import com.gusoliveira.domain.entities.objectProduct.ProductEntity

interface MyStoreRepository {
    suspend fun getProduct():List<ProductEntity>
    suspend fun getCategories():List<String>
}