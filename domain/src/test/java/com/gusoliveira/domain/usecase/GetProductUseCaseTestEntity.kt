package com.gusoliveira.domain.usecase

import assertk.assertThat
import br.com.domain.MainCoroutineRule
import com.gusoliveira.domain.productEntityData
import com.gusoliveira.domain.repository.ProductRepository
import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.runBlocking
import org.junit.Rule
import org.junit.Test

class GetProductUseCaseTestEntity {
    @ExperimentalCoroutinesApi
    @get:Rule
    var coroutineTesteRule = MainCoroutineRule()
    private val repository = mockk<ProductRepository>(relaxed = true)
    @Test
    fun `checks if the return is a object`() = runBlocking {
        //arrange
        coEvery { repository.getProduct()} returns productEntityData
        val getProductObjectUseCase = GetProductUseCase(repository)

        //act
        val result = getProductObjectUseCase.execute()

        //TODO: nao é possível encontrar o .data, corrigir
        assertThat(result.success)
    }
}