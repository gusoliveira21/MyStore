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
        /**Precisa ser deste modo já que a lista será retornada sem nenhuma mudança
         * logo, o modelo de entrada também será o modelo de saída*/
        val listProducts = myStoreService.getAllProductsList()
        val listProductEntityDomain: MutableList<ProductEntity> = mutableListOf()
        listProducts.map { listProductEntityDomain.add(it.toProductEntity()) }
        return listProductEntityDomain
    }



}