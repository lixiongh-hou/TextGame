package com.sq.common_module.common.ad;

import android.app.Activity;
import com.blankj.utilcode.util.ActivityUtils;
import com.sq.common_module.common.pange.TTFullAdUtils;
import com.sq.common_module.common.utils.HttpHeaderUtils;
import com.sq.common_module.common.utils.java.L;
import com.sq.common_module.common.utils.kt.UserInfoManager;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ8\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/sq/common_module/common/ad/FullAdUtils;", "", "groMoreFullAdUtils", "Lcom/sq/common_module/common/pange/TTFullAdUtils;", "(Lcom/sq/common_module/common/pange/TTFullAdUtils;)V", "mAdPlatformType", "", "onDestroy", "", "showFullAd", "adPlatformType", "activity", "Landroid/app/Activity;", "fullId", "", "actionName", "fullCallBack", "Lcom/sq/common_module/common/ad/FullCallBack;", "ignoreLessAdMode", "", "showOtherSimpleFullAd", "common_module_release"})
public final class FullAdUtils {
    private final com.sq.common_module.common.pange.TTFullAdUtils groMoreFullAdUtils = null;
    private int mAdPlatformType = 0;
    
    @javax.inject.Inject
    public FullAdUtils(@org.jetbrains.annotations.NotNull
    com.sq.common_module.common.pange.TTFullAdUtils groMoreFullAdUtils) {
        super();
    }
    
    public final void showOtherSimpleFullAd(@org.jetbrains.annotations.NotNull
    android.app.Activity activity) {
    }
    
    public final void showFullAd(int adPlatformType, @org.jetbrains.annotations.NotNull
    android.app.Activity activity, @org.jetbrains.annotations.NotNull
    java.lang.String fullId, @org.jetbrains.annotations.NotNull
    java.lang.String actionName, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.ad.FullCallBack fullCallBack, boolean ignoreLessAdMode) {
    }
    
    public final void onDestroy() {
    }
}