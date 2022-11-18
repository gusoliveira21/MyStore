package com.gusoliveira.domain.usecase

import com.gusoliveira.domain.entities.objectProduct.ProductEntity
import com.gusoliveira.domain.repository.MyStoreRepository
import com.gusoliveira.domain.usecase.base.BaseUseCase

class GetAllProductsUseCase(private val myStoreRepository: MyStoreRepository) :
    BaseUseCase<Nothing, List<ProductEntity>>() {
    override suspend fun doWork(value: String)= myStoreRepository.getAllProducts()
}