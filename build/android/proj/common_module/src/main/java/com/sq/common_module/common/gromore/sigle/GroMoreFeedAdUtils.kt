//package com.sq.common_module.common.gromore.sigle
//
//import android.app.Activity
//import android.app.Dialog
//import android.text.TextUtils
//import android.util.Log
//import android.view.Gravity
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.*
//import androidx.annotation.NonNull
//import androidx.appcompat.widget.AppCompatImageView
//import androidx.appcompat.widget.AppCompatTextView
//import androidx.constraintlayout.widget.ConstraintLayout
//import androidx.lifecycle.lifecycleScope
//import com.blankj.utilcode.util.SizeUtils
//import com.bytedance.msdk.api.AdError
//import com.bytedance.msdk.api.TToast
//import com.bytedance.msdk.api.UIUtils
//import com.bytedance.msdk.api.nativeAd.TTNativeAdAppInfo
//import com.bytedance.msdk.api.v2.GMAdConstant
//import com.bytedance.msdk.api.v2.GMAdDislike
//import com.bytedance.msdk.api.v2.GMAdSize
//import com.bytedance.msdk.api.v2.GMDislikeCallback
//import com.bytedance.msdk.api.v2.ad.GMAdAppDownloadListener
//import com.bytedance.msdk.api.v2.ad.GMShakeViewListener
//import com.bytedance.msdk.api.v2.ad.nativeAd.*
//import com.sq.common_module.R
//import com.sq.common_module.common.ad.ADPlatFromType
//import com.sq.common_module.common.ad.ADType
//import com.sq.common_module.common.ad.FeedAdInterface
//import com.sq.common_module.common.ad.getTransId
//import com.sq.common_module.common.gromore.preload.PreLoadFeedManager
//import com.sq.common_module.common.utils.http.SyncAdInfoUtils
//import com.sq.common_module.common.utils.java.L
//import com.sq.common_module.common.utils.kt.UserInfoManager
//import com.sq.common_module.common.utils.kt.getMMKVString
//import com.sq.common_module.common.utils.kt.loadImageUrl
//import com.sq.common_module.common.utils.kt.toast
//import java.lang.Exception
//import java.util.*
//import javax.inject.Inject
//
///**
// * Created by town
// * Date :  2022/11/15
// * Time : 17:15
// */
//class GroMoreFeedAdUtils @Inject constructor(private val syncAdInfoUtils: SyncAdInfoUtils) {
//    private var mAdUnitId = "102185703"
//    private var mStyleType = GMAdConstant.TYPE_EXPRESS_AD
//    private var mPreLoadFeedManager: PreLoadFeedManager? = null
//
//    private var flContainer: FrameLayout? = null
//    private var mActivity: Activity? = null
//
//    //是否展示过了
//    private var mIsShow = false
//
//    //是否load失败
//    private var mIsLoadFail = false
//
//    private var mActionName = ""
//    private var feedCallback: FeedAdInterface? = null
//    private var adWidth = 0
//
//    private var timeDate = ""
//    private var dialog: Dialog? = null
//    private var mIsDialog: Boolean? = true
//    fun loadFeedAd(
//        activity: Activity,
//        container: FrameLayout,
//        mWidth: Int,
//        mHeight: Int,
//        adId: String,
//        actionName: String,
//        feedAdInterface: FeedAdInterface,
//        feedType: Int? = null,
//        mDialog: Dialog? = null,
//        isDialog: Boolean? = null
//    ) {
//        feedType?.let {
//            mStyleType = it
//        }
//        adWidth = mWidth
//        feedCallback = feedAdInterface
//        flContainer = container
//        mActivity = activity
//        mAdUnitId = adId
//        mActionName = actionName
//        timeDate = Date().time.toString()
//        dialog = mDialog
//        mIsDialog = isDialog
//        mPreLoadFeedManager =
//            PreLoadFeedManager(
//                activity,
//                mWidth, mHeight,
//                mAdUnitId,
//                1,
//                mStyleType,
//                object : GMNativeAdLoadCallback {
//                    override fun onAdLoaded(ads: MutableList<GMNativeAd>) {
//                        if (ads.isEmpty()) {
//                            mIsLoadFail = true
//                            feedAdInterface.showAdBack(false)
//                        } else {
//                            showAd()
//                            feedAdInterface.showAdBack(true)
//                        }
//                    }
//
//                    override fun onAdLoadedFail(adError: AdError) {
//                        mIsLoadFail = true
//                        loadAdFailLog(adError.code.toString(), adError.message)
//                        feedAdInterface.showAdBack(false)
//                    }
//                })
//
//    }
//
//
//    /**
//     * 展示原生广告
//     */
//    private fun showAd() {
//        if (mPreLoadFeedManager != null) {
//            var view: View? = null
//            val nativeAd = mPreLoadFeedManager!!.gmNativeAd
//            if (nativeAd != null) {
////                L.i("wwb_native", "${nativeAd.isExpressAd}---${nativeAd.adImageMode}")
//                if (nativeAd.isExpressAd) { //模板
//                    view = getExpressAdView(flContainer!!, nativeAd)
//                } else {
//                    //自渲染 广告
//                    if (nativeAd.adImageMode == GMAdConstant.IMAGE_MODE_SMALL_IMG || nativeAd.adImageMode == GMAdConstant.IMAGE_MODE_LARGE_IMG || nativeAd.adImageMode == GMAdConstant.IMAGE_MODE_VIDEO) { //信息流自渲染广告渲染 ：小图广告
//                        view = getCustomAdView(flContainer!!, nativeAd)
//                    } else {
//                        "图片展示样式错误".toast()
//                    }
//                }
//                L.i("wwb_mIsDialog", "${mIsDialog.toString()}----")
//                var isShow = false
//                dialog?.let {
//                    if (it.isShowing) {
//                        isShow = true
//                    }
//                }
//                if (dialog == null && !mIsDialog!!) {
//                    isShow = true
//                }
//                if (isShow) {
//                    if (nativeAd.isExpressAd) {
//                        if (view != null) {
//                            view.layoutParams = ViewGroup.LayoutParams(
//                                ViewGroup.LayoutParams.MATCH_PARENT,
//                                ViewGroup.LayoutParams.MATCH_PARENT
//                            )
//                            flContainer?.removeAllViews()
//                            flContainer?.addView(view)
//                            flContainer?.setBackgroundResource(R.drawable.wihte_9_bg)
////                        val layoutParams = FrameLayout.LayoutParams(sWidth, sHeight)
////                        adViewHolder.mAdContainerView!!.removeAllViews()
////                        adViewHolder.mAdContainerView!!.addView(video, layoutParams)
//                        }
//                    } else {
//                        if (view != null) {
//                            view.layoutParams = FrameLayout.LayoutParams(
//                                ViewGroup.LayoutParams.MATCH_PARENT,
//                                SizeUtils.dp2px(70f)
//                            )
//                            flContainer?.removeAllViews()
//                            flContainer?.addView(view)
//                        }
//                    }
//                } else {
//                    flContainer?.removeAllViews()
//                    flContainer = null
//                }
//            }
//        }
//    }
//
//
//    fun onResume() {
//        mPreLoadFeedManager?.let {
//            it.gmNativeAd?.resume()
//        }
//    }
//
//    fun onDestroy() {
//        mPreLoadFeedManager?.destroy()
//        mPreLoadFeedManager = null
//        dialog = null
//        feedCallback = null
//        flContainer?.removeAllViews()
//        flContainer = null
//    }
//
//    private var mExpressAdWidth = 0
//    private var mExpressAdHeight = 0
//
//    //渲染模板广告
//    private fun getExpressAdView(parent: ViewGroup, @NonNull ad: GMNativeAd): View? {
//        val adViewHolder: ExpressAdViewHolder
//        var convertView: View? = null
//        try {
//            convertView = LayoutInflater.from(mActivity)
//                .inflate(R.layout.listitem_ad_native_express, parent, false)
//            adViewHolder = ExpressAdViewHolder()
//            adViewHolder.mAdContainerView =
//                convertView!!.findViewById<View>(R.id.iv_listitem_express) as FrameLayout
//            convertView.tag = adViewHolder
//
//            //判断是否存在dislike按钮
//            if (ad.hasDislike()) {
//                ad.setDislikeCallback(mActivity, object : GMDislikeCallback {
//                    override fun onSelected(position: Int, value: String?) {
////                        TToast.show(mActivity, "点击 $value")
//                        //用户选择不喜欢原因后，移除广告展示
//                        removeAdView()
//                        feedCallback?.closeFeedAd()
//                    }
//
//                    override fun onCancel() {
////                        TToast.show(mActivity, "dislike 点击了取消")
//
//                    }
//
//                    /**
//                     * 拒绝再次提交
//                     */
//                    override fun onRefuse() {}
//                    override fun onShow() {}
//                })
//            }
//
//            //设置点击展示回调监听
//            ad.setNativeAdListener(object : GMNativeExpressAdListener {
//                override fun onAdClick() {
////                    TToast.show(mActivity, "模板广告被点击")
//                    syncADInfo(1)
//                }
//
//                override fun onAdShow() {
//                    mIsShow = true
//                    L.i(
//                        "wwb_feed_Ecpm",
//                        mPreLoadFeedManager?.gmNativeAd?.showEcpm?.preEcpm + "-----"
//                    )
//                    syncADInfo(0)
//
////                    TToast.show(mActivity, "模板广告show")
//                }
//
//                override fun onRenderFail(view: View, msg: String, code: Int) {
////                    TToast.show(mActivity, "模板广告渲染失败code=$code,msg=$msg")
//
//                }
//
//                // ** 注意点 ** 不要在广告加载成功回调里进行广告view展示，要在onRenderSucces进行广告view展示，否则会导致广告无法展示。
//                override fun onRenderSuccess(width: Float, height: Float) {
//                    L.i("wwb_native_onRender", "$width----$height")
////                    TToast.show(mActivity, "模板广告渲染成功:width=$width,height=$height")
//                    //回调渲染成功后将模板布局添加的父View中
//                    if (adViewHolder.mAdContainerView != null) {
//                        //获取视频播放view,该view SDK内部渲染，在媒体平台可配置视频是否自动播放等设置。
//                        val sWidth: Int
//                        val sHeight: Int
//
//                        /**
//                         * 如果存在父布局，需要先从父布局中移除
//                         */
//                        val video = ad.expressView // 获取广告view  如果存在父布局，需要先从父布局中移除
////                        L.i(
////                            "wwb_native",
////                            "${width == GMAdSize.FULL_WIDTH.toFloat()}----${height == GMAdSize.AUTO_HEIGHT.toFloat()}"
////                        )
//                        if (width == GMAdSize.FULL_WIDTH.toFloat() && height == GMAdSize.AUTO_HEIGHT.toFloat()) {
//                            sWidth = FrameLayout.LayoutParams.MATCH_PARENT
//                            sHeight = FrameLayout.LayoutParams.WRAP_CONTENT
//                        } else {
////                            sWidth = UIUtils.getScreenWidth(mActivity)
////                            sHeight = (sWidth * height / width).toInt()
//                            sWidth = SizeUtils.dp2px(width)
//                            sHeight = SizeUtils.dp2px(height)
//                        }
//                        if (video != null) {
//                            /**
//                             * 如果存在父布局，需要先从父布局中移除
//                             */
////                            L.i(
////                                "wwb_native",
////                                "${sWidth}----${sHeight}----${UIUtils.getScreenWidth(mActivity)}---${(sWidth * height / width).toInt()}"
////                            )
//                            UIUtils.removeFromParent(video)
//                            mExpressAdWidth = sWidth
//                            mExpressAdHeight = sHeight
//                            val layoutParams = FrameLayout.LayoutParams(sWidth, sHeight)
//                            adViewHolder.mAdContainerView!!.removeAllViews()
//                            adViewHolder.mAdContainerView!!.addView(video, layoutParams)
//                        }
//                    }
//                }
//            })
//
//
//            //视频广告设置播放状态回调（可选）
//            ad.setVideoListener(object : GMVideoListener {
//                override fun onVideoStart() {
////                    TToast.show(mActivity, "模板广告视频开始播放")
//                }
//
//                override fun onVideoPause() {
////                    TToast.show(mActivity, "板广告视频暂停")
//                }
//
//                override fun onVideoResume() {
////                    TToast.show(mActivity, "模板广告视频继续播放")
//
//                }
//
//                override fun onVideoCompleted() {
////                    TToast.show(mActivity, "模板播放完成")
//
//                }
//
//                override fun onVideoError(adError: AdError) {
////                    TToast.show(mActivity, "模板广告视频播放出错")
//                }
//
//                override fun onProgressUpdate(current: Long, duration: Long) {
////                    TToast.show(mActivity, "模板广告视频播放进度")
//                    //                    Log.d(TAG, "onProgressUpdate");
//                }
//            })
//            ad.render()
//        } catch (e: Exception) {
//            e.printStackTrace()
//        }
//        return convertView
//    }
//
//
//    private fun getCustomAdView(parent: ViewGroup, @NonNull ad: GMNativeAd): View? {
////        L.i("wwb_native", "getCustomAdView--${ad.description}---${ad.downloadStatus}")
//        val view = LayoutInflater.from(mActivity)
//            .inflate(R.layout.layout_native_feed_ad, parent, false)
//        try {
//            val adViewHolder = AdViewHolder()
//            adViewHolder.mIcon = view.findViewById<AppCompatImageView>(R.id.iv_ad_icon)
//            adViewHolder.mDescription = view.findViewById<AppCompatTextView>(R.id.tv_ad_desc)
//            adViewHolder.mTitle = view.findViewById<AppCompatTextView>(R.id.tv_ad_name)
//            adViewHolder.mCreativeButton = view.findViewById<AppCompatTextView>(R.id.tv_ad_download)
//            adViewHolder.mDislike = view.findViewById<AppCompatImageView>(R.id.iv_close)
//            adViewHolder.mDescription?.text = ad.description
//            adViewHolder.mTitle?.text = ad.nativeAdAppInfo.appName
//            ad.iconUrl?.let { loadImageUrl(adViewHolder.mIcon!!, it) }
//            val viewBinder: GMViewBinder =
//                GMViewBinder.Builder(R.layout.layout_native_feed_ad).titleId(R.id.tv_ad_name)
////                .sourceId(R.id.tv_listitem_ad_source)
//                    .descriptionTextId(R.id.tv_ad_desc)
//                    .mainImageId(R.id.iv_ad_icon)
//                    .logoLayoutId(R.id.rl_logo)//logoView 建议传入GroupView类型
//                    .callToActionId(R.id.tv_ad_download)
//                    .build()
//            adViewHolder.viewBinder = viewBinder
//            //广告下载事件监听，仅下载类广告生效，可选
//            ad.setAppDownloadListener(object : GMAdAppDownloadListener {
//                override fun onIdle() {
//                    L.i("wwb_native", "未开始下载")
//                }
//
//                override fun onDownloadStarted() {
//                    L.i("wwb_native", "开始下载")
//                }
//
//                override fun onDownloadProgress(
//                    totalBytes: Long,
//                    currBytes: Long,
//                    progress: Int,
//                    adnType: Int
//                ) {
//                    L.i("wwb_native", "下载中回调--${totalBytes}--${progress}--${adnType}")
//                    //Log.d(TAG, "onDownloadActive");
//                    adViewHolder.mCreativeButton?.text = "下载中${progress}%"
//                }
//
//                override fun onDownloadPaused(
//                    totalBytes: Long,
//                    currBytes: Long,
//                    fileName: String?,
//                    appName: String
//                ) {
//                    L.i("wwb_native", "下载暂停回调")
//                    adViewHolder.mCreativeButton?.text = "下载暂停"
//                }
//
//                override fun onDownloadFailed(
//                    totalBytes: Long,
//                    currBytes: Long,
//                    fileName: String?,
//                    appName: String?
//                ) {
//                    L.i("wwb_native", "下载失败回调")
//                    adViewHolder.mCreativeButton?.text = "下载失败"
//                }
//
//                override fun onDownloadFinished(
//                    totalBytes: Long,
//                    fileName: String?,
//                    appName: String?
//                ) {
//                    L.i("wwb_native", "安装完成回调")
//                    adViewHolder.mCreativeButton?.text = "安装完成"
//                }
//
//                override fun onInstalled(fileName: String?, appName: String?) {
//                    L.i("wwb_native", "下载完成回调")
//                    adViewHolder.mCreativeButton?.text = "下载完成"
//                }
//            })
//
//            bindData(view, adViewHolder, ad, viewBinder)
//        } catch (e: Exception) {
//            e.printStackTrace()
//        }
//        return view
//    }
//
//    private fun bindData(
//        convertView: View,
//        adViewHolder: AdViewHolder,
//        ad: GMNativeAd,
//        viewBinder: GMViewBinder
//    ) {
//        L.i("wwb_dislike", ad.hasDislike().toString())
//        //设置dislike弹窗，如果有
//        if (ad.hasDislike()) {
//            val ttAdDislike = ad.getDislikeDialog(mActivity)
//            adViewHolder.mDislike!!.visibility = View.VISIBLE
//            adViewHolder.mDislike!!.setOnClickListener {
//                //使用接口来展示
//                ttAdDislike!!.showDislikeDialog()
//                ttAdDislike.setDislikeCallback(object : GMDislikeCallback {
//                    override fun onSelected(position: Int, value: String?) {
//                        "点击 $value".toast()
//                        //用户选择不喜欢原因后，移除广告展示
//                        removeAdView()
//                    }
//
//                    override fun onCancel() {
//                        "dislike 点击了取消".toast()
//                    }
//
//                    /**
//                     * 拒绝再次提交
//                     */
//                    override fun onRefuse() {}
//                    override fun onShow() {}
//                })
//            }
//        } else {
//            if (adViewHolder.mDislike != null) adViewHolder.mDislike!!.visibility = View.GONE
//        }
//
//        setDownLoadAppInfo(ad, adViewHolder)
//
//        //设置事件回调
//        ad.setNativeAdListener(mTTNativeAdListener)
//        ad.setGMShakeViewListener {
//        }
//
//
//        //可以被点击的view, 也可以把convertView放进来意味item可被点击
//        val clickViewList: MutableList<View?> = ArrayList()
//        clickViewList.add(convertView)
//        clickViewList.add(adViewHolder.mIcon)
//        clickViewList.add(adViewHolder.mTitle)
//        clickViewList.add(adViewHolder.mDescription)
//        //触发创意广告的view（点击下载或拨打电话）
//        val creativeViewList: MutableList<View?> = ArrayList()
//        creativeViewList.add(adViewHolder.mCreativeButton)
//        //重要! 这个涉及到广告计费，必须正确调用。**** convertView必须是com.bytedance.msdk.api.format.TTNativeAdView ****
//        ad.registerView(
//            mActivity!!,
//            (convertView as ViewGroup),
//            clickViewList,
//            creativeViewList,
//            viewBinder
//        )
//        val adCreativeButton: AppCompatTextView? = adViewHolder.mCreativeButton
//        when (ad.interactionType) {
//            GMAdConstant.INTERACTION_TYPE_DOWNLOAD -> {
//                adCreativeButton!!.visibility = View.VISIBLE
//                adCreativeButton.text =
//                    "立即下载"
//            }
//            GMAdConstant.INTERACTION_TYPE_DIAL -> {
//                adCreativeButton!!.visibility = View.VISIBLE
//                adCreativeButton.text = "立即拨打"
//            }
//            GMAdConstant.INTERACTION_TYPE_LANDING_PAGE, GMAdConstant.INTERACTION_TYPE_BROWSER -> {
//                adCreativeButton!!.visibility = View.VISIBLE
//                adCreativeButton.text =
//                    "查看详情"
//            }
//            else -> {
//                adCreativeButton!!.visibility = View.GONE
//                "交互类型异常".toast()
//            }
//        }
//
//
//    }
//
//    private val mTTNativeAdListener: GMNativeAdListener = object : GMNativeAdListener {
//        override fun onAdClick() {
//            L.i("wwb_native", "自渲染广告被点击")
//            syncADInfo(1)
//        }
//
//        override fun onAdShow() {
//            L.i("wwb_native", "广告展示")
//            syncADInfo(0)
//        }
//    }
//
//
//    private fun setDownLoadAppInfo(ttNativeAd: GMNativeAd?, adViewHolder: AdViewHolder?) {
//        if (adViewHolder == null) {
//            return
//        }
//        if (ttNativeAd == null || ttNativeAd.nativeAdAppInfo == null) {
////            adViewHolder.app_info!!.visibility = View.GONE
//        } else {
////            adViewHolder.app_info!!.visibility = View.VISIBLE
////            val appInfo: TTNativeAdAppInfo = ttNativeAd.nativeAdAppInfo
////            adViewHolder.app_name!!.text = "应用名称：" + appInfo.appName
////            adViewHolder.author_name!!.text = "开发者：" + appInfo.authorName
////            adViewHolder.package_size!!.text = "包大小：" + appInfo.packageSizeBytes
////            adViewHolder.permissions_url!!.text = "权限url:" + appInfo.permissionsUrl
////            adViewHolder.privacy_agreement!!.text = "隐私url：" + appInfo.privacyAgreement
////            adViewHolder.version_name!!.text = "版本号：" + appInfo.versionName
////            adViewHolder.permissions_content!!.text =
////                "权限内容:" + getPermissionsContent(appInfo.permissionsMap)
//        }
//    }
//
//    private fun getPermissionsContent(permissionsMap: Map<String, String>?): String? {
//        if (permissionsMap == null) {
//            return ""
//        }
//        val stringBuffer = StringBuffer()
//        val keyList = permissionsMap.keys
//        for (s in keyList) {
//            stringBuffer.append(
//                """$s : ${permissionsMap[s]}
//"""
//            )
//        }
//        return stringBuffer.toString()
//    }
//
//    private class ExpressAdViewHolder {
//        var mAdContainerView: FrameLayout? = null
//    }
//
//    private class AdViewHolder {
//        var viewBinder: GMViewBinder? = null
//        var mIcon: AppCompatImageView? = null
//        var mDislike: ImageView? = null
//        var mCreativeButton: AppCompatTextView? = null
//        var mTitle: TextView? = null
//        var mDescription: TextView? = null
//        var mSource: TextView? = null
//        var mLogo: RelativeLayout? = null
//        var app_info: LinearLayout? = null
//        var app_name: TextView? = null
//        var author_name: TextView? = null
//        var package_size: TextView? = null
//        var permissions_url: TextView? = null
//        var privacy_agreement: TextView? = null
//        var version_name: TextView? = null
//        var permissions_content: TextView? = null
//        var shakeViewContainer: FrameLayout? = null
//    }
//
//    private fun removeAdView() {
//        flContainer?.removeAllViews()
//    }
//
//    private fun syncADInfo(isClick: Int) {
//        mPreLoadFeedManager?.gmNativeAd?.showEcpm?.preEcpm?.let {
//            syncAdInfoUtils.toSyncAdInfoServer(
//                getTransId(ADPlatFromType.GROMORE_AD, mAdUnitId) + timeDate,
//                ADPlatFromType.GROMORE_AD,
//                ADType.FEED_LIST_AD,
//                it,
//                mActionName, isClick, getMMKVString(UserInfoManager.GROMORE_APP_ID), mAdUnitId
//            )
//        }
//    }
//
//    private fun loadAdFailLog(errCode: String, errMsg: String) {
//        syncAdInfoUtils.loadAdFailLog(ADPlatFromType.GROMORE_AD, mAdUnitId, errCode, errMsg)
//    }
//}