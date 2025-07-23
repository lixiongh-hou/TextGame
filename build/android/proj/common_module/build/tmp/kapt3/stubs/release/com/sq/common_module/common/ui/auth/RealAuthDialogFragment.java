package com.sq.common_module.common.ui.auth;

import com.sq.common_module.R;
import com.sq.common_module.common.base.BaseDialogFragment;
import com.sq.common_module.common.bean.InitData;
import com.sq.common_module.common.event.HomeRefreshEvent;
import com.sq.common_module.common.repository.CommonRepository;
import com.sq.common_module.common.utils.http.NetCallBack;
import com.sq.common_module.common.utils.kt.*;
import com.sq.common_module.common.widget.LoadingDialog;
import com.sq.common_module.databinding.DialogRealAuthBinding;
import dagger.hilt.android.AndroidEntryPoint;
import org.greenrobot.eventbus.EventBus;
import javax.inject.Inject;

/**
 * Created by town
 * Date :  2023/4/18
 * Time : 15:31
 * 实名认证
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0014"}, d2 = {"Lcom/sq/common_module/common/ui/auth/RealAuthDialogFragment;", "Lcom/sq/common_module/common/base/BaseDialogFragment;", "Lcom/sq/common_module/databinding/DialogRealAuthBinding;", "()V", "authSuccess", "", "repository", "Lcom/sq/common_module/common/repository/CommonRepository;", "getRepository", "()Lcom/sq/common_module/common/repository/CommonRepository;", "setRepository", "(Lcom/sq/common_module/common/repository/CommonRepository;)V", "getInitData", "", "initClick", "initRequest", "initView", "setLayout", "", "toAuth", "common_module_release"})
@dagger.hilt.android.AndroidEntryPoint
public final class RealAuthDialogFragment extends com.sq.common_module.common.base.BaseDialogFragment<com.sq.common_module.databinding.DialogRealAuthBinding> {
    @javax.inject.Inject
    public com.sq.common_module.common.repository.CommonRepository repository;
    private boolean authSuccess = false;
    
    public RealAuthDialogFragment() {
        super();
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
    public void initRequest() {
    }
    
    @java.lang.Override
    public void initClick() {
    }
    
    private final void toAuth() {
    }
    
    private final void getInitData() {
    }
}