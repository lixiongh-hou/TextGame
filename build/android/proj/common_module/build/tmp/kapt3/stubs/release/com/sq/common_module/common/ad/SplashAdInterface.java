package com.sq.common_module.common.ad;

import android.app.Activity;
import android.widget.FrameLayout;
import com.sq.common_module.common.pange.TTSplashAdUtils;
import com.sq.common_module.common.utils.java.L;
import com.sq.common_module.common.utils.kt.UserInfoManager;
import javax.inject.Inject;

/**
 * Created by town
 * Date :  2022/11/15
 * Time : 17:12
 * 开屏广告统一处理
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0007"}, d2 = {"Lcom/sq/common_module/common/ad/SplashAdInterface;", "", "goToMainActivity", "", "loadSuccess", "", "loadSplashAdCallBack", "common_module_release"})
public abstract interface SplashAdInterface {
    
    public abstract void goToMainActivity();
    
    public abstract void loadSplashAdCallBack(boolean loadSuccess);
    
    public abstract void goToMainActivity(boolean loadSuccess);
    
    /**
     * Created by town
     * Date :  2022/11/15
     * Time : 17:12
     * 开屏广告统一处理
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        public static void goToMainActivity(@org.jetbrains.annotations.NotNull
        com.sq.common_module.common.ad.SplashAdInterface $this) {
        }
        
        public static void loadSplashAdCallBack(@org.jetbrains.annotations.NotNull
        com.sq.common_module.common.ad.SplashAdInterface $this, boolean loadSuccess) {
        }
        
        public static void goToMainActivity(@org.jetbrains.annotations.NotNull
        com.sq.common_module.common.ad.SplashAdInterface $this, boolean loadSuccess) {
        }
    }
}