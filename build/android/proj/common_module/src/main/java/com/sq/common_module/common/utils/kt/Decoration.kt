package com.sq.common_module.common.utils.kt

import android.graphics.Rect
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.chad.library.adapter.base.BaseQuickAdapter
import java.util.HashMap

/**
 * Created by Android Studio.
 * author: yhs
 * Date: 2023/4/18
 * Time: 09:26
 * 备注：
 */
object Decoration {
    /**
     * RecyclerView 线性布局
     *
     * @param top    上
     * @param bottom 下
     * @param left   左
     * @param right  右
     * @return
     */

    fun LinearDecoration(
        top: Int = 0,
        bottom: Int = 0,
        left: Int = 0,
        right: Int = 0
    ): RecyclerViewSpacesItemDecoration {
        val stringIntegerHashMap = HashMap<String, Int>()
        //top间距
        stringIntegerHashMap[RecyclerViewSpacesItemDecoration.TOP_DECORATION] = top.dp.toInt()
        //底部间距
        stringIntegerHashMap[RecyclerViewSpacesItemDecoration.BOTTOM_DECORATION] = bottom.dp.toInt()
        //左间距
        stringIntegerHashMap[RecyclerViewSpacesItemDecoration.LEFT_DECORATION] = left.dp.toInt()
        //右间距
        stringIntegerHashMap[RecyclerViewSpacesItemDecoration.RIGHT_DECORATION] = right.dp.toInt()
        return RecyclerViewSpacesItemDecoration(stringIntegerHashMap)
    }

    /**
     * RecyclerView 网格布局
     *
     * @param spanCount   一行几列
     * @param spacing     空格多少
     * @param includeEdge 是否判断最左边和最右边有空格
     * @return
     */
    fun GridDecoration(
        spanCount: Int,
        rowSpacing: Int,
        spacing: Int,
        includeEdge: Boolean = false
    ): RecyclerViewGridDecoration {
        return RecyclerViewGridDecoration(
            spanCount, rowSpacing.dp.toInt(),
            spacing.dp.toInt(), includeEdge
        )
    }
}

class RecyclerViewSpacesItemDecoration internal constructor(
    private val mSpaceValueMap: HashMap<String, Int>
) :
    RecyclerView.ItemDecoration() {
    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        val position = parent.getChildAdapterPosition(view)
        var maxCount = parent.childCount
        val direction = parent.layoutDirection
        parent.adapter

        if (parent.adapter is BaseQuickAdapter<*, *>){
            (parent.adapter as? BaseQuickAdapter<*, *>).also {
                if (it != null) {
                    maxCount = it.data.size
                }
            }
        }

        if (mSpaceValueMap[TOP_DECORATION] != null) outRect.top = mSpaceValueMap[TOP_DECORATION]!!
        if (mSpaceValueMap[LEFT_DECORATION] != null) outRect.left =
            mSpaceValueMap[LEFT_DECORATION]!!
        if (mSpaceValueMap[RIGHT_DECORATION] != null) outRect.right =
            mSpaceValueMap[RIGHT_DECORATION]!!
        if (mSpaceValueMap[BOTTOM_DECORATION] != null) outRect.bottom =
            mSpaceValueMap[BOTTOM_DECORATION]!!

//        if (direction == RecyclerView.VERTICAL) {
//            if (position == maxCount - 1){
//                outRect.bottom = 0
//            }
//        } else {
//            if (position == maxCount - 1){
//                outRect.right = 0
//            }
//        }
        Log.d("ItemDecoration"," $direction    maxCount${maxCount}    position${position}")
    }

    companion object {
        const val TOP_DECORATION = "top_decoration"
        const val BOTTOM_DECORATION = "bottom_decoration"
        const val LEFT_DECORATION = "left_decoration"
        const val RIGHT_DECORATION = "right_decoration"
    }

}

class RecyclerViewGridDecoration internal constructor(
    private val spanCount: Int,
    private val rowSpacing: Int,
    private val spacing: Int,
    private val includeEdge: Boolean
) : RecyclerView.ItemDecoration() {
    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        // item position
        val position = parent.getChildAdapterPosition(view)
        // item column
        val column = position % spanCount
        if (includeEdge) {
            // spacing - column * ((1f / spanCount) * spacing)
            outRect.left = spacing - column * spacing / spanCount
            // (column + 1) * ((1f / spanCount) * spacing)
            outRect.right = (column + 1) * spacing / spanCount
        } else {
            // column * ((1f / spanCount) * spacing)
            outRect.left = column * spacing / spanCount
            // spacing - (column + 1) * ((1f /    spanCount) * spacing)
            outRect.right = spacing - (column + 1) * spacing / spanCount
        }
        if (position < spanCount) {
            // item top
            outRect.top = 0
        } else {
            outRect.top = rowSpacing
        }
    }
}