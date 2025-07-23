package com.sq.common_module.common.ui;

import com.blankj.utilcode.util.AppUtils;
import com.sq.common_module.R;
import com.sq.common_module.common.base.BaseMVVMActivity;
import com.sq.common_module.common.event.WXLoginEvent;
import com.sq.common_module.common.repository.CommonRepository;
import com.sq.common_module.common.utils.http.NetCallBack;
import com.sq.common_module.common.utils.kt.*;
import com.sq.common_module.common.widget.LoadingDialog;
import com.sq.common_module.databinding.ActivityBindWxBinding;
import com.tencent.mm.opensdk.modelmsg.SendAuth;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import dagger.hilt.android.AndroidEntryPoint;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import javax.inject.Inject;

/**
 * Created by town
 * Date :  2023/4/3
 * Time : 15:11
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0018H\u0016J\b\u0010\u001c\u001a\u00020\u0018H\u0016J\b\u0010\u001d\u001a\u00020\u0018H\u0016J\b\u0010\u001e\u001a\u00020\u0018H\u0016J\b\u0010\u001f\u001a\u00020\u0018H\u0014J\b\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020$H\u0007R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006%"}, d2 = {"Lcom/sq/common_module/common/ui/BindWxActivity;", "Lcom/sq/common_module/common/base/BaseMVVMActivity;", "Lcom/sq/common_module/databinding/ActivityBindWxBinding;", "()V", "bindWxPost", "", "getBindWxPost", "()Z", "setBindWxPost", "(Z)V", "isChecked", "mWXApi", "Lcom/tencent/mm/opensdk/openapi/IWXAPI;", "getMWXApi", "()Lcom/tencent/mm/opensdk/openapi/IWXAPI;", "mWXApi$delegate", "Lkotlin/Lazy;", "repository", "Lcom/sq/common_module/common/repository/CommonRepository;", "getRepository", "()Lcom/sq/common_module/common/repository/CommonRepository;", "setRepository", "(Lcom/sq/common_module/common/repository/CommonRepository;)V", "bindWx", "", "code", "", "initClick", "initLiveData", "initRequest", "initView", "onDestroy", "setLayout", "", "wxLoginCallBack", "event", "Lcom/sq/common_module/common/event/WXLoginEvent;", "common_module_release"})
@dagger.hilt.android.AndroidEntryPoint
public final class BindWxActivity extends com.sq.common_module.common.base.BaseMVVMActivity<com.sq.common_module.databinding.ActivityBindWxBinding> {
    private boolean isChecked = false;
    private final kotlin.Lazy mWXApi$delegate = null;
    @javax.inject.Inject
    public com.sq.common_module.common.repository.CommonRepository repository;
    private boolean bindWxPost = false;
    
    public BindWxActivity() {
        super();
    }
    
    private final com.tencent.mm.opensdk.openapi.IWXAPI getMWXApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.repository.CommonRepository getRepository() {
        return null;
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull
    com.sq.common_module.common.repository.CommonRepository p0) {
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
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void wxLoginCallBack(@org.jetbrains.annotations.NotNull
    com.sq.common_module.common.event.WXLoginEvent event) {
    }
    
    public final boolean getBindWxPost() {
        return false;
    }
    
    public final void setBindWxPost(boolean p0) {
    }
    
    private final void bindWx(java.lang.String code) {
    }
    
    @java.lang.Override
    protected void onDestroy() {
    }
}