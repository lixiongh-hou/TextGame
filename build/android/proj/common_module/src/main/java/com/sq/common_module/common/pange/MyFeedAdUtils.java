package com.sq.common_module.common.pange;

import static com.sq.common_module.common.ad.ADTypeKt.getTransId;
import static com.sq.common_module.common.utils.kt.MMKVManagerKt.getMMKVString;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.widget.FrameLayout;

import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTFeedAd;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.mediation.ad.MediationExpressRenderListener;
import com.bytedance.sdk.openadsdk.mediation.manager.MediationNativeManager;
import com.sq.common_module.common.ad.ADPlatFromType;
import com.sq.common_module.common.ad.ADType;
import com.sq.common_module.common.ad.AdIdRecord;
import com.sq.common_module.common.ad.AdRequestLimitUtils;
import com.sq.common_module.common.ad.FeedAdInterface;
import com.sq.common_module.common.utils.HttpHeaderUtils;
import com.sq.common_module.common.utils.http.SyncAdInfoUtils;
import com.sq.common_module.common.utils.java.L;
import com.sq.common_module.common.utils.java.UIUtils;
import com.sq.common_module.common.utils.kt.AppCodeConstant;
import com.sq.common_module.common.utils.kt.MMKVManagerKt;
import com.sq.common_module.common.utils.kt.UserInfoManager;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/**
 * Created by town
 * Date :  2023/8/15
 * Time : 13:58
 */
public class MyFeedAdUtils {
    @Inject
    public MyFeedAdUtils(SyncAdInfoUtils syncAdInfoUtils) {
        this.syncAdInfoUtils = syncAdInfoUtils;
    }

    SyncAdInfoUtils syncAdInfoUtils;
    private TTFeedAd mTTFeedAd; // Feed广告对象
    private TTAdNative.FeedAdListener mFeedAdListener; // 广告加载监听器
    private MediationExpressRenderListener mExpressAdInteractionListener; // 模板广告展示监听器
    private TTNativeAd.AdInteractionListener mAdInteractionListener; // 自渲染广告展示监听器
    private FrameLayout mFeedContainer;
    private Activity mActivity;
    private FeedAdInterface feedCallback;
    private String timeDate;
    private Dialog dialog;
    private boolean mIsDialog;
    private String mAdUnitId;
    private String feedEcpm = "";
    private String mActionName = "";

    public void loadFeedAd(Activity activity, FrameLayout container, int mWidth, int mHeight, String mediaId, String actionName
            , FeedAdInterface feedAdInterface) {
        AdRequestLimitUtils.INSTANCE.requestSystemRisk(ADType.FEED_LIST_AD, new Function1<String, Unit>() {
            @Override
            public Unit invoke(String s) {
                mFeedContainer = container;
                mActivity = activity;
                feedCallback = feedAdInterface;


                timeDate = new Date().getTime() + "";
                mAdUnitId = s;
                mActionName = actionName;
                mFeedContainer.removeAllViews();
                mFeedContainer.setVisibility(View.VISIBLE);
                L.d("feedCallback", " --------  1" + "---" + AdIdRecord.INSTANCE.getFeedId());
                if (mWidth == 0) {
                    String nameTest = "activityName:    " + mActivity.getClass().getName()
                            + "    mActionName:   " + actionName
                            + "  mAdUnitId  " + mAdUnitId + "   mWidth   " + mWidth;
                    syncAdInfoUtils.appInfoLog("test:   feedWidth", nameTest);
                }
                if (HttpHeaderUtils.INSTANCE.isRiskUser() == 1 || !TTAdSdk.isInitSuccess() || mWidth == 0 || mAdUnitId.equals(""))
                    return null;


                /** 1、创建AdSlot对象 */
                AdSlot adSlot = new AdSlot.Builder()
                        .setCodeId(mAdUnitId)
//                .setExpressViewAcceptedSize(mWidth,0f)
                        .setImageAcceptedSize(mWidth, 0) // 单位px
                        .setAdCount(1) // 请求广告数量为1到3条 （优先采用平台配置的数量）
                        .build();
                MMKVManagerKt.saveMMKVBool(true, UserInfoManager.REQUEST_AD);
                /** 2、创建TTAdNative对象 */
                TTAdNative adNativeLoader = TTAdSdk.getAdManager().createAdNative(activity);
                if (!mActivity.isFinishing()) syncADInfo(0, 0, 1, null);
                /** 3、创建加载、展示监听器 */
                initListeners();

                /** 4、加载广告 */
                if (mFeedAdListener != null) {
                    adNativeLoader.loadFeedAd(adSlot, mFeedAdListener);
                }
                return null;
            }
        });


    }

    // 广告加载成功后，展示广告
    public void showFeedAd() {
        if (this.mTTFeedAd == null) {
//            Log.i(Const.TAG, "请先加载广告或等待广告加载完毕后再调用show方法");
            return;
        }
        /** 5、展示广告 */
        MediationNativeManager manager = mTTFeedAd.getMediationManager();
        mTTFeedAd.setDislikeCallback(mActivity, new TTAdDislike.DislikeInteractionCallback() {
            @Override
            public void onShow() {

            }

            @Override
            public void onSelected(int i, String s, boolean b) {
//                L.i("wwb_feed_dislike",i+"----"+s+"-----"+b);
//                CommonUtilsKt.toast("点击关闭信息流");
                mFeedContainer.setVisibility(View.GONE);
//                mFeedContainer.removeAllViews();
//                onDestroy();
                feedCallback.showAdBack(false);
                if (!mActivity.isFinishing()) syncADInfo(0, 1, 5, null);
            }

            @Override
            public void onCancel() {

            }
        });
        if (manager != null && mExpressAdInteractionListener != null) {
            if (manager.isExpress()) { // --- 模板feed流广告
                mTTFeedAd.setExpressRenderListener(mExpressAdInteractionListener);
                mTTFeedAd.render(); // 调用render方法进行渲染，在onRenderSuccess中展示广告
            } else {                   // --- 自渲染feed流广告

                // 自渲染广告返回的是广告素材，开发者自己将其渲染成view
//                View feedView = com.union_test.toutiao.mediation.java.utils.FeedAdUtils.getFeedAdFromFeedInfo(mTTFeedAd, ac, null, mAdInteractionListener);
//                if (feedView != null) {
//                    UIUtils.removeFromParent(feedView);
//                    mFeedContainer.removeAllViews();
//                    mFeedContainer.addView(feedView);
//                }
            }
        }
    }

    private void initListeners() {
        // 广告加载监听器
        this.mFeedAdListener = new TTAdNative.FeedAdListener() {
            @Override
            public void onError(int i, String s) {
//                Log.d(Const.TAG, "feed load fail, errCode: " + i + ", errMsg: " + s);
                if (feedCallback == null) {
                    return;
                }
                feedCallback.showAdBack(false);
                loadAdFailLog(i + "", s);
            }

            @Override
            public void onFeedAdLoad(List<TTFeedAd> list) {
                if (feedCallback == null) {
                    return;
                }
                if (list != null && list.size() > 0) {
//                    Log.d(Const.TAG, "feed load success");
                    mTTFeedAd = list.get(0);
                    if (!mActivity.isFinishing()) syncADInfo(0, 0, 2, null);
                    showFeedAd();
                    L.d("feedCallback", " --------  2");
                    feedCallback.showAdBack(true);
                } else {
                    feedCallback.showAdBack(false);
//                    Log.d(Const.TAG, "feed load success, but list is null");
                }
            }
        };
        // 模板广告展示监听器
        this.mExpressAdInteractionListener = new MediationExpressRenderListener() {
            @Override
            public void onRenderFail(View view, String s, int i) {
//                Log.d(Const.TAG, "feed express render fail, errCode: " + i + ", errMsg: " + s);
                loadAdFailLog(i + "", s);
            }

            @Override
            public void onAdClick() {
//                Log.d(Const.TAG, "feed express click");
                if (!mActivity.isFinishing()) syncADInfo(1, 0, 4, null);
            }


            @Override
            public void onAdShow() {
                feedEcpm = mTTFeedAd.getMediationManager().getShowEcpm().getEcpm();
                if (!mActivity.isFinishing()) syncADInfo(0, 0, 3, mTTFeedAd.getMediationManager().getShowEcpm().getSlotId());
                L.d("wwb_feed_ecpm", "feed express show" + mTTFeedAd.getMediationManager().getShowEcpm().getEcpm());
            }

            @Override
            public void onRenderSuccess(View view, float v, float v1, boolean b) {
//                Log.d(Const.TAG, "feed express render success");
                L.i("wwb_native_feed", v + "----" + v1);
                if (mTTFeedAd != null) {
                    View expressFeedView = mTTFeedAd.getAdView(); // *** 注意不要使用onRenderSuccess参数中的view ***
                    UIUtils.removeFromParent(expressFeedView);
                    mFeedContainer.removeAllViews();
                    mFeedContainer.addView(expressFeedView);
                }
            }
        };
        // 自渲染广告展示监听器
        this.mAdInteractionListener = new TTNativeAd.AdInteractionListener() {
            @Override
            public void onAdClicked(View view, TTNativeAd ttNativeAd) {
//                Log.d(Const.TAG, "feed click");
            }

            @Override
            public void onAdCreativeClick(View view, TTNativeAd ttNativeAd) {
//                Log.d(Const.TAG, "feed creative click");
            }

            @Override
            public void onAdShow(TTNativeAd ttNativeAd) {
//                Log.d(Const.TAG, "feed show");
            }
        };
    }

    private void syncADInfo(int isClick, int end, int status, String slotId) {
        syncAdInfoUtils.toSyncAdInfoServer(
                getTransId(ADPlatFromType.GROMORE_AD, mAdUnitId) + timeDate,
                ADPlatFromType.GROMORE_AD,
                ADType.FEED_LIST_AD,
                feedEcpm,
                mActionName, isClick, getMMKVString(UserInfoManager.GROMORE_APP_ID), mAdUnitId, (end == 0) ? null : end, status, slotId
        );

    }

    private void loadAdFailLog(String errCode, String errMsg) {
        syncAdInfoUtils.loadAdFailLog(ADPlatFromType.GROMORE_AD, mAdUnitId, errCode, errMsg);
    }

    public void onDestroy() {

        L.d("feedCallback", " --------  d");

        if (mTTFeedAd != null) {
            mTTFeedAd.destroy();
            mTTFeedAd = null;
        }
        if (feedCallback != null) {
            feedCallback = null;
        }
        if (mAdInteractionListener != null) {
            mAdInteractionListener = null;
        }
        if (mExpressAdInteractionListener != null) {
            mExpressAdInteractionListener = null;
        }
        if (mFeedAdListener != null) {
            mFeedAdListener = null;
        }
    }
}
