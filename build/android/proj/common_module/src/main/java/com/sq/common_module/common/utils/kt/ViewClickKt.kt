package com.sq.common_module.common.utils.kt

import android.view.View
import androidx.constraintlayout.widget.Group
import com.sq.common_module.R

/**
 * Created by town
 * Date :  2022/10/12
 * Time : 16:32
 */
inline fun MyBaseAdapter<*>.setOnItemSingleClick(crossinline click: (view: View, position: Int) -> Unit) {
    this.setOnItemClickListener { _, view, position ->
        view.singleClick { click(view, position) }
    }
}

inline fun MyBaseAdapter<*>.setOnChildItemSingleClick(crossinline click: (view: View, position: Int) -> Unit) {
    this.setOnItemChildClickListener { _, view, position ->
        view.singleClick { click(view, position) }
    }
}

inline fun MyDelegateMultiAdapter<*>.setOnItemSingleClick(crossinline click: (view: View, position: Int) -> Unit) {
    this.setOnItemClickListener { _, view, position ->
        view.singleClick { click(view, position) }
    }
}

inline fun MyDelegateMultiAdapter<*>.setOnChildItemSingleClick(crossinline click: (view: View, position: Int) -> Unit) {
    this.setOnItemChildClickListener { _, view, position ->
        view.singleClick { click(view, position) }
    }
}


fun View.singleClick(block: (View) -> Unit) {
    setOnClickListener(throttleClick(1000, block))
}

fun View.singleDelayClick(block: (View) -> Unit) {
    setOnClickListener(throttleClick(2000, block))
}


fun throttleClick(wait: Long = 1000, block: ((View) -> Unit)): View.OnClickListener {
    return View.OnClickListener { v ->
        val current = System.currentTimeMillis()
        val lastClickTime = (v.getTag(R.id.click_timestamp) as? Long) ?: 0
        if (current - lastClickTime > wait) {
            v.setTag(R.id.click_timestamp, current)
            block(v)
        }
    }
}

fun Group.groupSingleClick(block: (View) -> Unit) {
    referencedIds.forEach { id ->
        rootView.findViewById<View>(id).setOnClickListener(throttleClick(1000, block))
    }
}