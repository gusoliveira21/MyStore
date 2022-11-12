package com.gusoliveira.domain.usecase

import com.gusoliveira.domain.repository.MyStoreRepository
import com.gusoliveira.domain.usecase.base.BaseUseCase

class GetProductUseCase(private val myStoreRepository: MyStoreRepository) : BaseUseCase<Nothing, List<Any>>() {
    override suspend fun doWork() = myStoreRepository.getProduct()
}