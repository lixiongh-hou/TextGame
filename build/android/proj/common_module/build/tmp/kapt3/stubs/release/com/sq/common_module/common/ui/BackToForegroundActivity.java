package com.sq.common_module.common.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.sq.common_module.R;
import com.sq.common_module.common.ad.SplashAdInterface;
import com.sq.common_module.common.base.BaseMVVMActivity;
import com.sq.common_module.common.base.SplashAdShowUtil;
import com.sq.common_module.common.splash.SplashBottomUtils;
import com.sq.common_module.common.utils.HttpHeaderUtils;
import com.sq.common_module.common.utils.SplashConstant;
import com.sq.common_module.common.utils.kt.AppCodeUtils;
import com.sq.common_module.common.utils.kt.UserInfoManager;
import com.sq.common_module.databinding.LayoutSplashAdBinding;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;

/**
 * Created by town
 * Date :  2023/12/8
 * Time : 16:04
 * 后台进入前台
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0014J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000bH\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u0013"}, d2 = {"Lcom/sq/common_module/common/ui/BackToForegroundActivity;", "Lcom/sq/common_module/common/base/BaseMVVMActivity;", "Lcom/sq/common_module/databinding/LayoutSplashAdBinding;", "()V", "splashAdShowUtil", "Lcom/sq/common_module/common/base/SplashAdShowUtil;", "getSplashAdShowUtil", "()Lcom/sq/common_module/common/base/SplashAdShowUtil;", "setSplashAdShowUtil", "(Lcom/sq/common_module/common/base/SplashAdShowUtil;)V", "initClick", "", "initLiveData", "initRequest", "initView", "onDestroy", "setLayout", "", "startProgress", "common_module_release"})
@dagger.hilt.android.AndroidEntryPoint
public final class BackToForegroundActivity extends com.sq.common_module.common.base.BaseMVVMActivity<com.sq.common_module.databinding.LayoutSplashAdBinding> {
    @javax.inject.Inject
    public com.sq.common_module.common.base.SplashAdShowUtil splashAdShowUtil;
    
    public BackToForegroundActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.base.SplashAdShowUtil getSplashAdShowUtil() {
        return null;
    }
    
    public final void setSplashAdShowUtil(@org.jetbrains.annotations.NotNull
    com.sq.common_module.common.base.SplashAdShowUtil p0) {
    }
    
    @java.lang.Override
    public int setLayout() {
        return 0;
    }
    
    @java.lang.Override
    public void initView() {
    }
    
    @java.lang.Override
    public void initClick() {
    }
    
    @java.lang.Override
    public void initRequest() {
    }
    
    @java.lang.Override
    public void initLiveData() {
    }
    
    private final void startProgress() {
    }
    
    @java.lang.Override
    protected void onDestroy() {
    }
}