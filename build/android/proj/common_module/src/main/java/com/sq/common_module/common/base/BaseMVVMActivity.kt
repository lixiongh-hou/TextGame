package com.sq.common_module.common.base

import android.content.Context
import android.content.res.Resources
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.Window
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.lifecycleScope
import com.blankj.utilcode.util.AdaptScreenUtils
import com.blankj.utilcode.util.BarUtils
import com.blankj.utilcode.util.ScreenUtils


import com.sq.common_module.common.widget.LoadingDialog
import com.sq.common_module.R
import com.sq.common_module.common.utils.HttpHeaderUtils
import com.sq.common_module.common.utils.java.L
import com.sq.common_module.common.utils.java.StatusBarUtil
import com.sq.common_module.common.utils.kt.getDownTimer
import com.sq.common_module.common.utils.kt.hideView
import com.sq.common_module.common.utils.kt.showView
import com.sq.common_module.common.utils.kt.singleClick
import com.sq.common_module.databinding.ActivityBaseBinding

/**
 * Created by town
 * Date :  2022/10/9
 * Time : 17:42
 */
abstract class BaseMVVMActivity<VDB : ViewDataBinding> : AppCompatActivity() {
    lateinit var mBaseBinding: ActivityBaseBinding
    lateinit var mContext: Context
    lateinit var mBindView: VDB
    private var mLoadingDialog: LoadingDialog? = null
    private var mActivityNum = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        //隐藏标题栏
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        super.onCreate(savedInstanceState)
//        setTheme(R.style.AppBlackTheme)

        ScreenUtils.setNonFullScreen(this)
        //设置标题栏背景颜色
        StatusBarUtil.setColor(this, Color.WHITE)
        StatusBarUtil.setDarkMode(this)
        ScreenUtils.setPortrait(this)
        mBaseBinding =
            DataBindingUtil.inflate(LayoutInflater.from(this), R.layout.activity_base, null, false)
        mBindView = DataBindingUtil.inflate(
            LayoutInflater.from(this),
            setLayout(),
            mBaseBinding.activityContainer,
            true
        )
        setContentView(mBaseBinding.root)
        mBindView.lifecycleOwner = this
        mContext = this

        initView()
        initClick()
        initRequest()
        initLiveData()
        back()
    }

//    override fun getResources(): Resources {
//        return AdaptScreenUtils.adaptWidth(super.getResources(), 1080)
//    }

    override fun getResources(): Resources {
        val designWidth = getDesignWidth()
        var resources = super.getResources()
        if (designWidth != -1) {
            resources = AdaptScreenUtils.adaptWidth(super.getResources(), designWidth)
        }
        //字体用sp单位用于适配字体大小
        var fontScale = getFontScale()
        if (fontScale == -1f) {
            fontScale = resources.configuration.fontScale//跟随系统改变字体大小
        }
        resources.displayMetrics.scaledDensity =
            resources.displayMetrics.xdpi * (1.0f / 72) * fontScale
        return resources
    }

    /**
     * 屏幕适配
     * 获取设计宽度
     * 如果返回-1表示不做适配
     */
    open fun getDesignWidth() = 360

    /**
     * 字体大小适配
     * 获取字体比例
     * 如果返回-1f表示跟随系统改变字体大小
     * 默认1.0f
     */
    open fun getFontScale() = 1.0f

    override fun onResume() {
        super.onResume()
        mActivityNum++
        initOnResumeRequest()
//        L.i(
//            "wwb_life_base",
//            "onActivityStarted-----${HttpHeaderUtils.mActivityCount}--${HttpHeaderUtils.homeSplashFinish}"
//        )
//        if (HttpHeaderUtils.mActivityCount > 0 && HttpHeaderUtils.homeSplashFinish) {
//            mBaseBinding.ivLogo.showView()
//            lifecycleScope.launch {
//                getDownTimer(3, true)
//                    .collect {
//                        if (it == 0) mBaseBinding.ivLogo.hideView()
//                    }
//            }
//        }
//        L.i("wwb_activity_num", HttpHeaderUtils.mActivityCount.toString())
//        if (HttpHeaderUtils.mActivityCount == 0) {
//
//        }
    }

    abstract fun setLayout(): Int

    abstract fun initView()

    abstract fun initClick()

    abstract fun initRequest()

    open fun initOnResumeRequest() {}

    abstract fun initLiveData()

    fun back() {
        mBaseBinding.commonBar.btnBack.singleClick { onBackPressed() }
    }

    /**
     * 设置透明状态栏（沉浸式状态栏）
     */
    open fun setTransparentStatusBar() {
        BarUtils.transparentStatusBar(this)
    }

    open fun setTitle(title: String?) {
        mBaseBinding.commonBar.tvTitle.text = title
    }

    /**
     *  隐藏标题框
     */
    open fun hideToolBar() {
        mBaseBinding.commonBar.csCommonTitle.hideView()
    }

    /**
     *  隐藏返回箭头
     */
    open fun hideBackArrow() {
        mBaseBinding.commonBar.btnBack.hideView()
    }

    /**
     *展示关闭
     */
    open fun showCloseView() {
        mBaseBinding.commonBar.btnClose.showView()
    }

    /**
     * 展示刷新
     */
    open fun showRefreshView() {
        mBaseBinding.commonBar.btnRefresh.showView()
    }

    /**
     * 展示客服
     */
    open fun showOnlineView() {
        mBaseBinding.commonBar.btnOnline.showView()
    }

    /**
     * 展示右侧文字
     */
    open fun showRightTitle() {
        mBaseBinding.commonBar.tvCommonRight.showView()
    }

    fun showLoadingDialog(): LoadingDialog? {
        mLoadingDialog = LoadingDialog(mContext)
        return mLoadingDialog
    }

    fun dismissDialog() {
        mLoadingDialog?.dismissDialog()
    }

    override fun onStop() {
        super.onStop()
        mActivityNum--
        L.i("wwb_activity", "onStop----${mActivityNum}")
    }

    override fun onDestroy() {
        super.onDestroy()
        L.i("wwb_des", "----onActivityDestroyed")
        dismissDialog()
    }
}