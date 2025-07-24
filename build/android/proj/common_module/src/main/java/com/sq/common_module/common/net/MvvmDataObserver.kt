package com.sq.common_module.common.net

/**
 * @param <F>
</F> */
interface MvvmDataObserver<F> {
    fun onSuccess(t: F, isFromDataCache: Boolean)
    fun onFailure(e: Throwable)
}
