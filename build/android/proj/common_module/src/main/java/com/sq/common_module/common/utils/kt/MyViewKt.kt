package com.sq.common_module.common.utils.kt

import android.graphics.drawable.GradientDrawable
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatImageView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.scwang.smart.refresh.layout.SmartRefreshLayout
import com.scwang.smart.refresh.layout.api.RefreshLayout
import com.scwang.smart.refresh.layout.listener.OnRefreshLoadMoreListener

/**
 * Created by town
 * Date :  2022/10/12
 * Time : 14:09
 */
fun View.hideView() {
    visibility = View.GONE
}

fun View.showView() {
    visibility = View.VISIBLE
}

fun View.inVisibleView() {
    visibility = View.INVISIBLE
}

fun View.showOrHide(show: Boolean) {
    visibility = if (show) View.VISIBLE else View.GONE
}

fun View.setBackGroundRes(v: Boolean, r1: Int, r2: Int) {
    setBackgroundResource(if (v) r1 else r2)
}

fun TextView.setDrawableImg(type: Int, res: Int) {
    // 1 左边 2 顶部 3 右边 4 下边
    val drawable = ContextCompat.getDrawable(this.context, res)
    drawable?.setBounds(0, 0, drawable.minimumWidth, drawable.minimumHeight)
    when (type) {
        1 -> setCompoundDrawables(drawable, null, null, null)
        2 -> setCompoundDrawables(null, drawable, null, null)
        3 -> setCompoundDrawables(null, null, drawable, null)
        4 -> setCompoundDrawables(null, null, null, drawable)
    }
}

fun ImageView.loadNetImage(url: String, placeHolder: Int? = null) {
    if (this.context != null) {
        Glide.with(this.context).load(url)
            .placeholder(placeHolder?.let { ContextCompat.getDrawable(this.context, it) })
            .into(this)
    }
}

fun RecyclerView.initLinearRecycler(myBaseAdapter: MyBaseAdapter<*>) {
    layoutManager = LinearLayoutManager(this.context)
    adapter = myBaseAdapter
}

fun RecyclerView.initLinearRecycler(myBaseAdapter: MyBaseAdapter<*>, isHorizontal: Boolean) {
    layoutManager = LinearLayoutManager(this.context, if (isHorizontal) LinearLayoutManager.HORIZONTAL else LinearLayoutManager.VERTICAL, false)
    adapter = myBaseAdapter
}

fun RecyclerView.initGridRecycler(myBaseAdapter: MyBaseAdapter<*>, count: Int) {
    layoutManager = GridLayoutManager(this.context, count)
    adapter = myBaseAdapter
}


inline fun SmartRefreshLayout.startRefreshLoadMore(
    crossinline refresh: () -> Unit,
    crossinline loadMore: () -> Unit
) {
    setOnRefreshLoadMoreListener(object : OnRefreshLoadMoreListener {
        override fun onRefresh(refreshLayout: RefreshLayout) {
            refresh()
        }

        override fun onLoadMore(refreshLayout: RefreshLayout) {
            loadMore()
        }
    })
}

fun AppCompatImageView.setImageRes(v: Boolean, r1: Int, r2: Int) {
    setImageResource(if (v) r1 else r2)
}

fun getBgDrawable(v: Int): GradientDrawable {
    val itemLeft = GradientDrawable().apply {
        setColor(v)
        orientation = GradientDrawable.Orientation.TOP_BOTTOM
        shape = GradientDrawable.RECTANGLE
        gradientType = GradientDrawable.LINEAR_GRADIENT
    }
    return itemLeft
}

fun getTopGradientDrawable(v1: String, v2: String): GradientDrawable {
    return getTopGradientDrawable(IntArray(2).apply {
        set(0, v1.parseColor())
        set(1, v2.parseColor())
    })
}

fun getLeftGradientDrawable(v1: String, v2: String): GradientDrawable {
    return getLeftGradientDrawable(IntArray(2).apply {
        set(0, v1.parseColor())
        set(1, v2.parseColor())
    })
}

fun getLeftGradientDrawableR(v1: String, v2: String): GradientDrawable {
    return getLeftGradientDrawable(IntArray(2).apply {
        set(0, v1.parseColor())
        set(1, v2.parseColor())
    }, 99)
}

fun getLeftGradientDrawableR(v1: String, v2: String, radii: Int): GradientDrawable {
    return getLeftGradientDrawable(IntArray(2).apply {
        set(0, v1.parseColor())
        set(1, v2.parseColor())
    }, radii)
}

fun getTopGradientDrawable(array: IntArray): GradientDrawable {
    val itemLeft = GradientDrawable().apply {
        colors = array
        orientation = GradientDrawable.Orientation.TOP_BOTTOM
        shape = GradientDrawable.RECTANGLE
        gradientType = GradientDrawable.LINEAR_GRADIENT
    }
    return itemLeft
}

fun getLeftGradientDrawable(array: IntArray, radii: Int = 0): GradientDrawable {
    val itemLeft = GradientDrawable().apply {
        colors = array
        orientation = GradientDrawable.Orientation.LEFT_RIGHT
        shape = GradientDrawable.RECTANGLE
        gradientType = GradientDrawable.LINEAR_GRADIENT
        cornerRadius = radii.dp
    }
    return itemLeft
}

fun getAllRoundBg(v: Int, radii: Int = 10): GradientDrawable {
    val itemImage = GradientDrawable().apply {
        setColor(v)
        shape = GradientDrawable.RECTANGLE
        cornerRadius = radii.dp
    }
    return itemImage
}







