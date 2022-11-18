package com.gusoliveira.domain.usecase.base

import kotlinx.coroutines.*

abstract class BaseUseCase<in Params, out R> {
    private val superVisorJob = SupervisorJob()
    private val scope = CoroutineScope(Dispatchers.Main + superVisorJob)

    protected abstract suspend fun doWork(value:String = ""): R

    suspend fun execute(value:String = ""): DataResult<R> {
        return withContext(scope.coroutineContext) {
            try {
                val result = withContext(Dispatchers.IO) { doWork(value) }
                DataResult.Success(result)

            } catch (e: Throwable) {
                DataResult.Failure
            }
        }
    }

    fun cancelWork() = scope.coroutineContext.cancelChildren()
}