package com.gusoliveira.domain.repository

import com.gusoliveira.domain.entities.objectProduct.ProductEntity

interface MyStoreRepository {
    suspend fun getProductsByCategory(category: String): List<ProductEntity>
    suspend fun getAllProducts(): List<ProductEntity>
    suspend fun getCategories(): List<String>
}