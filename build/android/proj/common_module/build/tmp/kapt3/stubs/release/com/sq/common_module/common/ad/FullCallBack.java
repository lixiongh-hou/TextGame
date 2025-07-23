package com.sq.common_module.common.ad;

import android.app.Activity;
import com.blankj.utilcode.util.ActivityUtils;
import com.sq.common_module.common.pange.TTFullAdUtils;
import com.sq.common_module.common.utils.HttpHeaderUtils;
import com.sq.common_module.common.utils.java.L;
import com.sq.common_module.common.utils.kt.UserInfoManager;
import javax.inject.Inject;

/**
 * Created by town
 * Date :  2022/11/15
 * Time : 15:55
 * 插全屏统一处理
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0012\u0010\u0005\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/sq/common_module/common/ad/FullCallBack;", "", "closeFullAd", "", "loadFullFail", "showFullSuccess", "ecpm", "", "common_module_release"})
public abstract interface FullCallBack {
    
    public abstract void showFullSuccess(@org.jetbrains.annotations.Nullable
    java.lang.String ecpm);
    
    public abstract void closeFullAd();
    
    public abstract void loadFullFail();
    
    /**
     * Created by town
     * Date :  2022/11/15
     * Time : 15:55
     * 插全屏统一处理
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        public static void showFullSuccess(@org.jetbrains.annotations.NotNull
        com.sq.common_module.common.ad.FullCallBack $this, @org.jetbrains.annotations.Nullable
        java.lang.String ecpm) {
        }
        
        public static void closeFullAd(@org.jetbrains.annotations.NotNull
        com.sq.common_module.common.ad.FullCallBack $this) {
        }
        
        public static void loadFullFail(@org.jetbrains.annotations.NotNull
        com.sq.common_module.common.ad.FullCallBack $this) {
        }
    }
}