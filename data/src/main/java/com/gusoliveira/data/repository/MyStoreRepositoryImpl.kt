package com.gusoliveira.data.repository

import com.gusoliveira.data.api.MyStoreService
import com.gusoliveira.data.util.toProductEntity
import com.gusoliveira.domain.entities.objectProduct.ProductEntity
import com.gusoliveira.domain.repository.MyStoreRepository

class MyStoreRepositoryImpl(
    private val myStoreService: MyStoreService
) : MyStoreRepository {
    override suspend fun getProductsByCategory(category: String): List<ProductEntity> {
        val listProducts = myStoreService.getProductsByCategory(category)
        val listProductEntityDomain: MutableList<ProductEntity> = mutableListOf()
        listProducts.map { listProductEntityDomain.add(it.toProductEntity()) }
        return listProductEntityDomain
    }

    override suspend fun getAllProducts(): List<ProductEntity> {
        val listProducts = myStoreService.getAllProductsList()
        val listProductEntityDomain: MutableList<ProductEntity> = mutableListOf()
        listProducts.map { listProductEntityDomain.add(it.toProductEntity()) }
        return listProductEntityDomain
    }

    override suspend fun getCategories(): List<String> {
        return myStoreService.getCategoriesList()
    }
}