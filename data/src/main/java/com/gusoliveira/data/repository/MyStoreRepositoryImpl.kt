package com.gusoliveira.data.repository

import com.gusoliveira.data.api.MyStoreService
import com.gusoliveira.data.util.toProductEntity
import com.gusoliveira.domain.entities.objectProduct.ProductEntity
import com.gusoliveira.domain.repository.MyStoreRepository

// TODO utilizar o padrão mapper aqui https://www.baeldung.com/kotlin/data-objects
class MyStoreRepositoryImpl(
    private val myStoreService: MyStoreService
) : MyStoreRepository {
    override suspend fun getProduct(): List<ProductEntity> {
        val listProducts = myStoreService.getAllProductsList()
        val listProductEntityDomain: MutableList<ProductEntity> = mutableListOf()
        listProducts.map { listProductEntityDomain.add(it.toProductEntity()) }
        return listProductEntityDomain
    }

<<<<<<< Updated upstream
    override suspend fun getCategories(): List<String> {
        return myStoreService.getCategoriesList()
    }

=======
    
>>>>>>> Stashed changes

}