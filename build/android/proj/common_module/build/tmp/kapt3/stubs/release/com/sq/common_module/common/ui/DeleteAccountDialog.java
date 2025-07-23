package com.sq.common_module.common.ui;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.sq.common_module.R;
import com.sq.common_module.common.base.BaseDialogFragment;
import com.sq.common_module.common.repository.CommonRepository;
import com.sq.common_module.common.utils.kt.CommonDialogCallBack;
import com.sq.common_module.databinding.DialogDeleteAccountBinding;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;

/**
 * Created by town
 * Date :  2023/5/9
 * Time : 10:39
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0015"}, d2 = {"Lcom/sq/common_module/common/ui/DeleteAccountDialog;", "Lcom/sq/common_module/common/base/BaseDialogFragment;", "Lcom/sq/common_module/databinding/DialogDeleteAccountBinding;", "()V", "desc1", "", "desc2", "mType", "", "repository", "Lcom/sq/common_module/common/repository/CommonRepository;", "getRepository", "()Lcom/sq/common_module/common/repository/CommonRepository;", "setRepository", "(Lcom/sq/common_module/common/repository/CommonRepository;)V", "initClick", "", "initRequest", "initView", "setLayout", "Companion", "common_module_release"})
@dagger.hilt.android.AndroidEntryPoint
public final class DeleteAccountDialog extends com.sq.common_module.common.base.BaseDialogFragment<com.sq.common_module.databinding.DialogDeleteAccountBinding> {
    @javax.inject.Inject
    public com.sq.common_module.common.repository.CommonRepository repository;
    private final java.lang.String desc1 = "\u82e5\u5ba1\u6838\u901a\u8fc7,  15\u5929\u5185\u60a8\u7684\u8d26\u53f7\u5c06\u88ab\u6ce8\u9500\n\u6210\u529f\u3002\u6ce8\u9500\u5b8c\u6210\u540e,  \u8be5\u8bbe\u5907\u65e0\u6cd5\u518d\u6b21\u6ce8\n\u518c\u6216\u4f7f\u7528\u6b64APP,  \u8bf7\u60a8\u8c28\u614e\u64cd\u4f5c\n";
    private java.lang.String desc2 = "\u60a8\u5df2\u4e8e2023\u5e745\u67088\u65e5\u7533\u8bf7\u6ce8\u9500\u8d26\u53f7\n15\u5929\u5185\u53ef\u53d6\u6d88\u7533\u8bf7\n";
    private int mType = 1;
    @org.jetbrains.annotations.NotNull
    public static final com.sq.common_module.common.ui.DeleteAccountDialog.Companion Companion = null;
    private static com.sq.common_module.common.utils.kt.CommonDialogCallBack mCallBack;
    
    public DeleteAccountDialog() {
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
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/sq/common_module/common/ui/DeleteAccountDialog$Companion;", "", "()V", "mCallBack", "Lcom/sq/common_module/common/utils/kt/CommonDialogCallBack;", "showDeleteAccountDialog", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "type", "", "desc", "", "callback", "common_module_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void showDeleteAccountDialog(@org.jetbrains.annotations.NotNull
        androidx.fragment.app.FragmentManager fragmentManager, int type, @org.jetbrains.annotations.NotNull
        java.lang.String desc, @org.jetbrains.annotations.NotNull
        com.sq.common_module.common.utils.kt.CommonDialogCallBack callback) {
        }
    }
}