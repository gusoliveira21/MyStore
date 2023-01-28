package com.gusoliveira.domain.usecase.product

import com.gusoliveira.domain.entities.objectProduct.ProductEntity
import com.gusoliveira.domain.repository.MyStoreRepository
import com.gusoliveira.domain.usecase.base.BaseUseCase

class GetAllProductsUseCase(private val myStoreRepository: MyStoreRepository) :
    BaseUseCase<Nothing?, List<ProductEntity>>() {

    override suspend fun doWork(value: Nothing?): List<ProductEntity> {
        return myStoreRepository.getAllProducts()
    }
}