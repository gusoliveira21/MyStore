package com.gusoliveira.domain.usecase

import com.gusoliveira.domain.entities.ProductEntity
import com.gusoliveira.domain.repository.MyStoreRepository
import com.gusoliveira.domain.usecase.base.BaseUseCase

class GetProductUseCase(private val myStoreRepository: MyStoreRepository): BaseUseCase<Nothing, List<ProductEntity>>(){
    override suspend fun doWork(): List<ProductEntity> {
        return myStoreRepository.getProduct()
    }
}