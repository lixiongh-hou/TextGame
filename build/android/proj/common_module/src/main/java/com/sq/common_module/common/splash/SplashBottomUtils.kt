package com.sq.common_module.common.splash

import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import com.sq.common_module.common.utils.HttpHeaderUtils
import com.sq.common_module.common.utils.kt.showView
import androidx.core.graphics.toColorInt
import com.sq.common_module.common.widget.rounde.RoundCornerProgressBar


/**
 * Created by town
 * Date :  2023/12/19
 * Time : 16:20
 */
object SplashBottomUtils {

    private var mIvBottom: AppCompatImageView? = null
    private var mIvTop: AppCompatImageView? = null
    private var mTvBottom: AppCompatTextView? = null
    private var mTvTop: AppCompatTextView? = null
    private var myProgress: RoundCornerProgressBar? = null
    fun handleBottom(
        ivBottom: AppCompatImageView,
        tvBottom: AppCompatTextView,
        ivTop: AppCompatImageView,
        tvTop: AppCompatTextView,
        progress: RoundCornerProgressBar
    ) {
        mIvBottom = ivBottom
        mIvTop = ivTop
        mTvTop = tvTop
        mTvBottom = tvBottom
        myProgress = progress
        when (HttpHeaderUtils.appCode) {

            "999999" -> handle470000()
        }
    }


    private fun handle470000() {
        myProgress?.setProgressColor("#FFD548", "#FFFFFF")
        mTvTop?.apply {
            showView()
            text = "加载中..."
            setTextColor("#333333".toColorInt())
        }
    }


}