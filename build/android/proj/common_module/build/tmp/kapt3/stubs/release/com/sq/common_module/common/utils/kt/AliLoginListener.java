package com.sq.common_module.common.utils.kt;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.alipay.sdk.auth.OpenAuthTask;
import com.sq.common_module.common.utils.java.L;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import java.lang.StringBuilder;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import android.content.IntentFilter;
import android.content.Intent;
import android.content.BroadcastReceiver;
import com.sq.common_module.common.utils.HttpHeaderUtils;
import com.sq.common_module.common.widget.LoadingDialog;

/**
 * Created by town
 * Date :  2023/2/8
 * Time : 10:55
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"}, d2 = {"Lcom/sq/common_module/common/utils/kt/AliLoginListener;", "", "loginCallBack", "", "authCode", "", "common_module_release"})
public abstract interface AliLoginListener {
    
    public abstract void loginCallBack(@org.jetbrains.annotations.NotNull
    java.lang.String authCode);
    
    /**
     * Created by town
     * Date :  2023/2/8
     * Time : 10:55
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        public static void loginCallBack(@org.jetbrains.annotations.NotNull
        com.sq.common_module.common.utils.kt.AliLoginListener $this, @org.jetbrains.annotations.NotNull
        java.lang.String authCode) {
        }
    }
}