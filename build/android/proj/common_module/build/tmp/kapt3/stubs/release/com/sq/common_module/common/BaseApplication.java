package com.sq.common_module.common;

import android.app.Application;
import android.content.Context;
import androidx.multidex.MultiDexApplication;
import com.blankj.utilcode.util.Utils;
import com.tencent.mmkv.MMKV;

/**
 * Created by town
 * Date :  2022/10/11
 * Time : 15:35
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0006"}, d2 = {"Lcom/sq/common_module/common/BaseApplication;", "Landroidx/multidex/MultiDexApplication;", "()V", "onCreate", "", "Companion", "common_module_release"})
public class BaseApplication extends androidx.multidex.MultiDexApplication {
    @org.jetbrains.annotations.NotNull
    public static final com.sq.common_module.common.BaseApplication.Companion Companion = null;
    public static com.sq.common_module.common.BaseApplication instance;
    
    public BaseApplication() {
        super();
    }
    
    @java.lang.Override
    public void onCreate() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/sq/common_module/common/BaseApplication$Companion;", "", "()V", "instance", "Lcom/sq/common_module/common/BaseApplication;", "getInstance", "()Lcom/sq/common_module/common/BaseApplication;", "setInstance", "(Lcom/sq/common_module/common/BaseApplication;)V", "common_module_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.sq.common_module.common.BaseApplication getInstance() {
            return null;
        }
        
        public final void setInstance(@org.jetbrains.annotations.NotNull
        com.sq.common_module.common.BaseApplication p0) {
        }
    }
}