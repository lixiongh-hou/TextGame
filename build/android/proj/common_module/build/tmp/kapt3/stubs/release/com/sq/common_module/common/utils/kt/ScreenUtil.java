package com.sq.common_module.common.utils.kt;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.os.Build;

/**
 * @author 李雄厚
 *
 * @features 屏幕工具类
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0003R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lcom/sq/common_module/common/utils/kt/ScreenUtil;", "", "()V", "realStatusBarHeight", "", "getRealStatusBarHeight", "()I", "screenHeight", "getScreenHeight", "screenWidth", "getScreenWidth", "getStatusBarHeight", "common_module_release"})
public final class ScreenUtil {
    @org.jetbrains.annotations.NotNull
    public static final com.sq.common_module.common.utils.kt.ScreenUtil INSTANCE = null;
    
    private ScreenUtil() {
        super();
    }
    
    public final int getScreenWidth() {
        return 0;
    }
    
    public final int getScreenHeight() {
        return 0;
    }
    
    /**
     * 获取状态栏高度
     */
    @android.annotation.SuppressLint(value = {"InternalInsetResource"})
    private final int getStatusBarHeight() {
        return 0;
    }
    
    public final int getRealStatusBarHeight() {
        return 0;
    }
}