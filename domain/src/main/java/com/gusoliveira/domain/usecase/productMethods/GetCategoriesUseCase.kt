package com.gusoliveira.domain.usecase.productMethods

import com.gusoliveira.domain.repository.MyStoreRepository
import com.gusoliveira.domain.usecase.base.BaseUseCase

class GetCategoriesUseCase(private val myStoreRepository: MyStoreRepository) :
    BaseUseCase<Nothing, List<String>>() {
    override suspend fun doWork(value: Nothing?): List<String> {
        return myStoreRepository.getCategories()
    }
}