package com.gusoliveira.domain.usecase

import assertk.assertThat
import br.com.domain.MainCoroutineRule
import com.gusoliveira.domain.productEntityData
import com.gusoliveira.domain.repository.MyStoreRepository
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
    private val repository = mockk<MyStoreRepository>(relaxed = true)
    //Ao executar ele diz que nenhum teste foi encontrado
    @Test
    fun `checks if the return is a object`() = runBlocking {
        //arrange
        coEvery { repository.getProduct()} returns productEntityData
        val getProductUseCase = GetProductUseCase(repository)

        //act
        val result = getProductUseCase.execute()

        //assert
        //TODO: nao é possível encontrar o .data, corrigir
        assertThat(result.success)
    }
}