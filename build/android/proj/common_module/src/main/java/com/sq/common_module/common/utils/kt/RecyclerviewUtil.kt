package com.sq.common_module.common.utils.kt

import android.view.View
import com.chad.library.adapter.base.BaseDelegateMultiAdapter
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.scwang.smart.refresh.layout.SmartRefreshLayout
import com.scwang.smart.refresh.layout.api.RefreshLayout
import com.scwang.smart.refresh.layout.listener.OnRefreshLoadMoreListener


/**
 * Created by town.
 * Date: 2021/12/23
 * Time: 6:07 下午
 * 统一处理recyclerview
 */
open class MyBaseAdapter<T>(layout: Int) : BaseQuickAdapter<T, BaseViewHolder>(layout) {
    override fun convert(holder: BaseViewHolder, item: T) {

    }

}

open class MyDelegateMultiAdapter<T> : BaseDelegateMultiAdapter<T, BaseViewHolder>() {
    override fun convert(holder: BaseViewHolder, item: T) {

    }
}


fun <T> setRecyclerListData(
    t: List<T>,
    page: Int,
    adapter: MyBaseAdapter<T>,
    refresh: SmartRefreshLayout,
    mEmptyView: View? = null
): Int {
    var mPage = page
    if (page == 1) {
        if (t.isNotEmpty()) {
            refresh.setEnableLoadMore(true)
            ++mPage
        } else {
            refresh.setEnableLoadMore(false)
            mEmptyView?.let {
                adapter.setEmptyView(it)
            }
        }
        refresh.finishRefresh()
        adapter.setList(t)
    } else {
        if (t.isNotEmpty()) {
            refresh.setEnableLoadMore(true)
            ++mPage
        } else {
            refresh.setEnableLoadMore(false)
        }
        refresh.finishLoadMore()
        adapter.addData(t)
    }
    return mPage
}

fun <T> setMultiRecyclerListData(
    t: List<T>,
    page: Int,
    adapter: MyDelegateMultiAdapter<T>,
    refresh: SmartRefreshLayout,
    mEmptyView: View? = null
): Int {
    var mPage = page
    if (page == 1) {
        if (t.isNotEmpty()) {
            refresh.setEnableLoadMore(true)
            ++mPage
        } else {
            refresh.setEnableLoadMore(false)
            mEmptyView?.let {
                adapter.setEmptyView(it)
            }
        }
        refresh.finishRefresh()
        adapter.setList(t)
    } else {
        if (t.isNotEmpty()) {
            refresh.setEnableLoadMore(true)
            ++mPage
        } else {
            refresh.setEnableLoadMore(false)
        }
        refresh.finishLoadMore()
        adapter.addData(t)
    }
    return mPage
}


inline fun SmartRefreshLayout.setRefreshAndLoadMore(
    crossinline refresh: () -> Unit,
    crossinline loadMore: () -> Unit
) {
    this.setOnRefreshLoadMoreListener(object : OnRefreshLoadMoreListener {
        override fun onRefresh(refreshLayout: RefreshLayout) {
            refresh()
        }

        override fun onLoadMore(refreshLayout: RefreshLayout) {
            loadMore()
        }
    })
}