package com.sq.common_module.common.net

import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.disposables.Disposable
import java.lang.ref.WeakReference

abstract class BaseModel<NETWORK_DATA, RESULTDATA> : MvvmDataObserver<NETWORK_DATA> {
    private val compositeDisposable = CompositeDisposable()
    protected var mPage = 1
//    protected var mReferenceListener: WeakReference<IBaseModelListener<RESULTDATA>>? = null
    private val mIsPaging: Boolean
    private val INIT_PAGE_NUMBER: Int
    private var mIsLoading = false
    private val mCachedPreferenceKey: String? // 缓存的key

    // 主构造函数
    constructor(isPaging: Boolean, cachedPreferenceKey: String?, vararg initPageNumber: Int) {
        this.mIsPaging = isPaging
        this.INIT_PAGE_NUMBER = if (isPaging && initPageNumber.isNotEmpty()) {
            initPageNumber[0]
        } else {
            -1
        }
        this.mCachedPreferenceKey = cachedPreferenceKey
    }

    // 默认构造函数
    constructor() : this(true, null, 1)

//    // 修复类型不匹配问题
//    fun register(listener: IBaseModelListener<RESULTDATA>) {
//        this.mReferenceListener = WeakReference(listener)
//    }

    fun refresh() {
        if (!mIsLoading) {
            if (mIsPaging) {
                mPage = INIT_PAGE_NUMBER
            }
            mIsLoading = true // 修正加载状态标记
            load()
        }
    }

    fun loadNexPage() {
        if (!mIsLoading) {
            mIsLoading = true // 修正加载状态标记
            load()
        }
    }

    fun getCachedDataAndLoad() {
        if (!mIsLoading) { // 非加载期间
            mIsLoading = true // 修正加载状态标记
            load()
        }
    }

    protected abstract fun load()
    @Suppress("UNCHECKED_CAST")
    protected fun notifyResultToListener(
        resultData: RESULTDATA
    ) {
        notifyResultToListener(null, resultData, false)
    }
    @Suppress("UNCHECKED_CAST")
    protected fun notifyResultToListener(
        networkData: NETWORK_DATA,
        resultData: RESULTDATA
    ) {
        notifyResultToListener(networkData, resultData, false)
    }

    @Suppress("UNCHECKED_CAST")
    protected fun notifyResultToListener(
        networkData: NETWORK_DATA?,
        resultData: RESULTDATA,
        isFromCache: Boolean
    ) {
//        mIsLoading = false
//        val listener = mReferenceListener?.get() ?: return
//
//        if (mIsPaging) {
//            val isFirstPage = mPage == INIT_PAGE_NUMBER
//            val isEmpty = resultData == null || (resultData is List<*> && resultData.isEmpty())
//            val hasNextPage = resultData is List<*> && resultData.size > 0
//
//            listener.onLoadSuccess(this, resultData, PageResult(isFirstPage, isEmpty, hasNextPage))
//        } else {
//            listener.onLoadSuccess(this, resultData)
//        }
//
//        // 判断缓存的存储
//        if (mCachedPreferenceKey != null && !isFromCache) {
//            if (mIsPaging && mPage == INIT_PAGE_NUMBER || !mIsPaging) {
//                if (networkData != null) {
//                    saveDataToPreference(networkData)
//                }
//            }
//        }
//
//        // 更新页数
//        if (mIsPaging && !isFromCache && resultData is List<*> && resultData.isNotEmpty()) {
//            mPage++
//        }
    }

    protected fun loadFail(errorMessage: String) {
        mIsLoading = false
//        val listener = mReferenceListener?.get() ?: return
//
//        if (mIsPaging) {
//            val isFirstPage = mPage == INIT_PAGE_NUMBER
//            listener.onLoadFail(this, errorMessage, PageResult(isFirstPage, true, false))
//        } else {
//            listener.onLoadFail(this, errorMessage)
//        }
    }

    protected open fun saveDataToPreference(cacheData: NETWORK_DATA) {
        // 默认实现为空，子类可重写
    }

    // 取消网络请求
    open fun cancel() {
        if (!compositeDisposable.isDisposed) {
            compositeDisposable.dispose()
        }
    }

    fun addDisposable(d: Disposable) {
        if (d == null) return
        compositeDisposable.add(d)
    }

    /**
     * 是否分页
     */
    fun isPaging(): Boolean = mIsPaging
}