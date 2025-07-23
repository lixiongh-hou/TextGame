package com.sq.common_module.common.ad;

import android.app.Activity;
import android.widget.FrameLayout;
import com.kwad.sdk.core.b.a.it;
import com.sq.common_module.common.pange.MyFeedAdUtils;
import com.sq.common_module.common.utils.HttpHeaderUtils;
import com.sq.common_module.common.utils.java.L;
import com.sq.common_module.common.utils.kt.UserInfoManager;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0006\u0010\t\u001a\u00020\nJF\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017J \u0010\u0018\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u0014J.\u0010\u001a\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/sq/common_module/common/ad/FeedAdUtils;", "", "groMoreFeedAdUtils", "Lcom/sq/common_module/common/pange/MyFeedAdUtils;", "(Lcom/sq/common_module/common/pange/MyFeedAdUtils;)V", "mAdPlatformType", "", "isHiddenFeedAds", "", "onDestroy", "", "showFeedAd", "platform", "activity", "Landroid/app/Activity;", "container", "Landroid/widget/FrameLayout;", "mWidth", "mHeight", "adId", "", "actionName", "feedAdInterface", "Lcom/sq/common_module/common/ad/FeedAdInterface;", "showOtherSimpleFeed", "adView", "showSimpleFeedAd", "common_module_release"})
public final class FeedAdUtils {
    private final com.sq.common_module.common.pange.MyFeedAdUtils groMoreFeedAdUtils = null;
    private int mAdPlatformType = 0;
    
    @javax.inject.Inject
    public FeedAdUtils(@org.jetbrains.annotations.NotNull
    com.sq.common_module.common.pange.MyFeedAdUtils groMoreFeedAdUtils) {
        super();
    }
    
    public final void showSimpleFeedAd(@org.jetbrains.annotations.NotNull
    android.app.Activity activity, @org.jetbrains.annotations.NotNull
    android.widget.FrameLayout container, int mWidth, @org.jetbrains.annotations.NotNull
    java.lang.String actionName, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.ad.FeedAdInterface feedAdInterface) {
    }
    
    public final void showOtherSimpleFeed(@org.jetbrains.annotations.NotNull
    android.app.Activity activity, @org.jetbrains.annotations.NotNull
    android.widget.FrameLayout adView, @org.jetbrains.annotations.NotNull
    java.lang.String actionName) {
    }
    
    public final void showFeedAd(int platform, @org.jetbrains.annotations.NotNull
    android.app.Activity activity, @org.jetbrains.annotations.NotNull
    android.widget.FrameLayout container, int mWidth, int mHeight, @org.jetbrains.annotations.NotNull
    java.lang.String adId, @org.jetbrains.annotations.NotNull
    java.lang.String actionName, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.ad.FeedAdInterface feedAdInterface) {
    }
    
    public final void onDestroy() {
    }
    
    private final boolean isHiddenFeedAds() {
        return false;
    }
}