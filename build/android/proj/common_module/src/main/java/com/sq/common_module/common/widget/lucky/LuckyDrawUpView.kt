package com.sq.common_module.common.widget.lucky

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.ValueAnimator
import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.animation.AccelerateDecelerateInterpolator
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sq.common_module.R
import com.sq.common_module.common.bean.NineGridPrizeBean
import com.sq.common_module.common.utils.kt.Decoration
import com.sq.common_module.common.widget.lucky.LuckyDrawView.AnimatorEndListener

/**
 * @Author xylitol
 * @Date 2020-11-26 15:47
 * @Desc 继承RecyclerView完成一个3X3的抽奖转盘
 */
class LuckyDrawUpView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0,
) : RecyclerView(context, attrs, defStyleAttr) {

    private val animator = ValueAnimator()
    private var luckyIndex = 4//最终抽中的位置
    private var lotteryStatus = 0//当前可以抽奖状态

    //    private var onDrawClick: DrawClickListener
    private val adapter: LuckyDrawUpAdapter
    private var animatorEndClick: AnimatorEndListener? = null

    private var isFistInit = true

    private var dataLiStArr:ArrayList<LuckyDataBean> = arrayListOf()

    init {
        val obtain = context.obtainStyledAttributes(attrs, R.styleable.LuckyDrawUpView)
        val selelctRes = obtain.getResourceId(R.styleable.LuckyDrawUpView_lucky_select_res,0)
        val unSelelctRes = obtain.getResourceId(R.styleable.LuckyDrawUpView_lucky_unselect_res,0)
        val selelctColor = obtain.getColor(R.styleable.LuckyDrawUpView_lucky_select_color,0)
        val unSelelctColor = obtain.getColor(R.styleable.LuckyDrawUpView_lucky_unselect_color,0)

        val isHuawei = obtain.getBoolean(R.styleable.LuckyDrawUpView_lucky_is_huawei,false)

        dataLiStArr.clear()
        for (index in 0..8){
            val dataBean = LuckyDataBean()
            dataBean.isHuawei = isHuawei
            dataBean.selectColor = selelctColor
            dataBean.unSelectColor = unSelelctColor

            if (selelctRes != 0) {
                dataBean.selectRes = selelctRes
            }
            if (unSelelctRes != 0) {
                dataBean.unSelectRes = unSelelctRes
            }
            if (index == 0){
                val differenceSelelct = obtain.getResourceId(R.styleable.LuckyDrawUpView_lucky_select_left_top_res,0)
                val differenceUnSelelct = obtain.getResourceId(R.styleable.LuckyDrawUpView_lucky_unselect_left_top_res,0)
                if (differenceSelelct != 0){
                    dataBean.selectRes = differenceSelelct
                }
                if (differenceSelelct != 0){
                    dataBean.unSelectRes = differenceUnSelelct
                }
            }else if (index == 2){
                val differenceSelelct = obtain.getResourceId(R.styleable.LuckyDrawUpView_lucky_select_right_top_res,0)
                val differenceUnSelelct = obtain.getResourceId(R.styleable.LuckyDrawUpView_lucky_unselect_right_top_res,0)
                if (differenceSelelct != 0){
                    dataBean.selectRes = differenceSelelct
                }
                if (differenceSelelct != 0){
                    dataBean.unSelectRes = differenceUnSelelct
                }
            }else if (index == 6){
                val differenceSelelct = obtain.getResourceId(R.styleable.LuckyDrawUpView_lucky_select_left_bottom_res,0)
                val differenceUnSelelct = obtain.getResourceId(R.styleable.LuckyDrawUpView_lucky_unselect_left_bottom_res,0)
                if (differenceSelelct != 0){
                    dataBean.selectRes = differenceSelelct
                }
                if (differenceSelelct != 0){
                    dataBean.unSelectRes = differenceUnSelelct
                }
            }else if (index == 8){
                val differenceSelelct = obtain.getResourceId(R.styleable.LuckyDrawUpView_lucky_select_right_bottom_res,0)
                val differenceUnSelelct = obtain.getResourceId(R.styleable.LuckyDrawUpView_lucky_unselect_right_bottom_res,0)
                if (differenceSelelct != 0){
                    dataBean.selectRes = differenceSelelct
                }
                if (differenceSelelct != 0){
                    dataBean.unSelectRes = differenceUnSelelct
                }
            }else if (index == 4){
                val midRes = obtain.getResourceId(R.styleable.LuckyDrawUpView_lucky_mid_res,0)
                val midColor = obtain.getColor(R.styleable.LuckyDrawUpView_lucky_mid_color,0)
                if (midRes != 0){
                    dataBean.midRes = midRes
                }
                if (midColor != 0){
                    dataBean.midColor = midColor
                }
            }
            dataLiStArr.add(dataBean)
        }
        obtain.recycle()

        animator.duration = 2000
        animator.setIntValues(0, 2 * 8 + luckyIndex)
        animator.interpolator = AccelerateDecelerateInterpolator()
        animator.addUpdateListener {
            val position = it.animatedValue as Int
            setCurrentPosition(position % 8)
        }

//        onDrawClick = object : DrawClickListener {
//            override fun onClickDraw() {
//
//            }
//        }
        adapter = LuckyDrawUpAdapter()
        setAdapter(adapter)
//        adapter.setDataArr(dataLiStArr)
        layoutManager = object : GridLayoutManager(context, 3) {
            override fun canScrollVertically(): Boolean {
                return false
            }
        }
    }

    fun setLastPosition(position: Int) {
        luckyIndex = position
        animator.setIntValues(0, 2 * 8 + luckyIndex)
        if (lotteryStatus == 0) {
            animator.start()
            lotteryStatus = 1
        }
    }

    fun setOnClick(click: DrawClickListener) {
        adapter.setOnDrawClickListener(click)
    }

    fun setType(type: Int) {
        adapter.setDataArr(dataLiStArr)
        adapter.setType(type)
        if (type == 5 && isFistInit) {
            isFistInit = false
            addItemDecoration(Decoration.GridDecoration(3, 10, 10))
        }
    }

    fun setDataList(list: List<NineGridPrizeBean>) {
        adapter.setDataList(list)
    }

    fun setOnAnimatorListener(endListener: AnimatorEndListener) {
        animatorEndClick = endListener
        animator.addListener(object : AnimatorListenerAdapter() {
            override fun onAnimationEnd(animation: Animator) {
                super.onAnimationEnd(animation)
                setCurrentPosition(luckyIndex)
                lotteryStatus = 0
                animatorEndClick?.onEnd()
            }
        })
    }

    private fun setCurrentPosition(position: Int) {
        //刷新当前所在位置
        adapter.setSelectionPosition(position)
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        animator.cancel()
    }

    interface DrawClickListener {
        fun onClickDraw()
    }

    interface AnimatorEndListener {
        fun onEnd()
    }

    data class LuckyDataBean(
        var unSelectRes: Int = R.drawable.ic_lucky_selected,
        var selectRes: Int = R.drawable.ic_lucky_selected_2,
        var midRes: Int = R.drawable.ic_start_lucky_draw,
        var midColor: Int = Color.parseColor("#ffffff"),
        var unSelectColor: Int = 0,
        var selectColor: Int = 0,
        var isHuawei: Boolean = false,
        )

}