package com.sq.common_module.common.ui;

import android.graphics.Color;
import com.sq.common_module.R;
import com.sq.common_module.common.base.BaseMVVMActivity;
import com.sq.common_module.common.repository.CommonRepository;
import com.sq.common_module.common.utils.http.NetCallBack;
import com.sq.common_module.common.utils.kt.CommonDialogCallBack;
import com.sq.common_module.common.widget.LoadingDialog;
import com.sq.common_module.databinding.ActivityDeleteAccountBinding;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;

/**
 * Created by town
 * Date :  2023/5/8
 * Time : 16:08
 * 注销账号
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J\b\u0010\u0011\u001a\u00020\rH\u0016J\b\u0010\u0012\u001a\u00020\rH\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0015"}, d2 = {"Lcom/sq/common_module/common/ui/DeleteAccountActivity;", "Lcom/sq/common_module/common/base/BaseMVVMActivity;", "Lcom/sq/common_module/databinding/ActivityDeleteAccountBinding;", "()V", "isSelected", "", "repository", "Lcom/sq/common_module/common/repository/CommonRepository;", "getRepository", "()Lcom/sq/common_module/common/repository/CommonRepository;", "setRepository", "(Lcom/sq/common_module/common/repository/CommonRepository;)V", "deleteAccount", "", "initClick", "initLiveData", "initRequest", "initView", "selectedImg", "setLayout", "", "common_module_release"})
@dagger.hilt.android.AndroidEntryPoint
public final class DeleteAccountActivity extends com.sq.common_module.common.base.BaseMVVMActivity<com.sq.common_module.databinding.ActivityDeleteAccountBinding> {
    @javax.inject.Inject
    public com.sq.common_module.common.repository.CommonRepository repository;
    private boolean isSelected = false;
    
    public DeleteAccountActivity() {
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
    public void initClick() {
    }
    
    @java.lang.Override
    public void initRequest() {
    }
    
    @java.lang.Override
    public void initLiveData() {
    }
    
    private final void selectedImg() {
    }
    
    private final void deleteAccount() {
    }
}