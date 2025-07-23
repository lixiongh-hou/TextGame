package com.sq.common_module.common.ui

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import com.sq.common_module.R
import com.sq.common_module.common.ad.SplashAdInterface
import com.sq.common_module.common.base.BaseMVVMActivity
import com.sq.common_module.common.base.SplashAdShowUtil
import com.sq.common_module.common.splash.SplashBottomUtils
import com.sq.common_module.common.utils.HttpHeaderUtils
import com.sq.common_module.common.utils.SplashConstant
import com.sq.common_module.common.utils.kt.AppCodeUtils
import com.sq.common_module.common.utils.kt.UserInfoManager
import com.sq.common_module.common.utils.kt.getMMKVString
import com.sq.common_module.common.utils.kt.hideView
import com.sq.common_module.databinding.LayoutSplashAdBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

/**
 * Created by town
 * Date :  2023/12/8
 * Time : 16:04
 * 后台进入前台
 */
@AndroidEntryPoint
class BackToForegroundActivity : BaseMVVMActivity<LayoutSplashAdBinding>() {
    @Inject
    lateinit var splashAdShowUtil: SplashAdShowUtil
    override fun setLayout(): Int = R.layout.layout_splash_ad

    override fun initView() {
        splashAdShowUtil.recordAdTrace(-1)
        setTransparentStatusBar()
        startProgress()
//        if (AppCodeUtils.isThirdModule() || AppCodeUtils.isFourModule() || AppCodeUtils.isEightModule()) {
//            mBindView.tvDesc.text = "充电统计中..."
//            if (AppCodeUtils.isEightModule()) {
//                mBindView.bottomSplash.hideView()
//            }
//        } else {
//            mBindView.tvDesc.text = "步数统计中..."
//        }
//        SplashBottomUtils.handleBottom(
//            mBindView.bottomSplash,
//            mBindView.tvBottom,
//            mBindView.ivTop,
//            mBindView.tvDesc,
//            mBindView.myProgress
//        )
        splashAdShowUtil.loadTTSplashAd(
            this, mBindView.splashContainer,
            getMMKVString(UserInfoManager.SPLASH_AD_ID), object : SplashAdInterface {
                override fun loadSplashAdCallBack(loadSuccess: Boolean) {
//                    setResult(100)
                    HttpHeaderUtils.isShowSplashAd = false
                    finish()
                }
            }
        )
    }

    override fun initClick() {

    }

    override fun initRequest() {

    }

    override fun initLiveData() {

    }

    private fun startProgress() {
        mBindView.myProgress.setProgress(
            100,
            SplashConstant.showSplashSeconds * 1000L,
            object : AnimatorListenerAdapter() {

                override fun onAnimationEnd(animation: Animator) {
//                    setResult(100)
                    HttpHeaderUtils.isShowSplashAd = false
                    finish()
                }

                override fun onAnimationStart(animation: Animator) {

                }
            })
    }

    override fun onDestroy() {
        super.onDestroy()
        splashAdShowUtil.onDestroy()
    }
}