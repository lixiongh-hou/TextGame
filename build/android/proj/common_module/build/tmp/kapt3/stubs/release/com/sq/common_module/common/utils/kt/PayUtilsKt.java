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

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u00000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0002\u001a \u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b\u001a\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u000e\u00a8\u0006\u000f"}, d2 = {"bundleToString", "", "bundle", "Landroid/os/Bundle;", "openAliAuthScheme", "", "view", "Landroid/view/View;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "aliLoginListener", "Lcom/sq/common_module/common/utils/kt/AliLoginListener;", "wxPayApi", "Lcom/tencent/mm/opensdk/openapi/IWXAPI;", "Landroid/content/Context;", "common_module_release"})
public final class PayUtilsKt {
    
    /**
     * 通用跳转授权业务 Demo
     */
    public static final void openAliAuthScheme(@org.jetbrains.annotations.Nullable
    android.view.View view, @org.jetbrains.annotations.NotNull
    androidx.appcompat.app.AppCompatActivity activity, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.utils.kt.AliLoginListener aliLoginListener) {
    }
    
    private static final java.lang.String bundleToString(android.os.Bundle bundle) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final com.tencent.mm.opensdk.openapi.IWXAPI wxPayApi(@org.jetbrains.annotations.NotNull
    android.content.Context activity) {
        return null;
    }
}