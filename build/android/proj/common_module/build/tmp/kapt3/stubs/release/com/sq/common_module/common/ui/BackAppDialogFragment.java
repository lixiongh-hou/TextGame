package com.sq.common_module.common.ui;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.blankj.utilcode.util.SpanUtils;
import com.sq.common_module.R;
import com.sq.common_module.common.base.BaseDialogFragment;
import com.sq.common_module.common.event.AgreePrivacyEvent;
import com.sq.common_module.common.utils.UMConfigUtils;
import com.sq.common_module.common.utils.kt.*;
import com.sq.common_module.databinding.FragmentBackAppBinding;
import org.greenrobot.eventbus.EventBus;

/**
 * Created by town
 * Date :  2023/12/20
 * Time : 11:46
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\fB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\nH\u0016\u00a8\u0006\r"}, d2 = {"Lcom/sq/common_module/common/ui/BackAppDialogFragment;", "Lcom/sq/common_module/common/base/BaseDialogFragment;", "Lcom/sq/common_module/databinding/FragmentBackAppBinding;", "()V", "initClick", "", "initRequest", "initView", "onStart", "setLayout", "", "BackAppCallBack", "Companion", "common_module_release"})
public final class BackAppDialogFragment extends com.sq.common_module.common.base.BaseDialogFragment<com.sq.common_module.databinding.FragmentBackAppBinding> {
    @org.jetbrains.annotations.NotNull
    public static final com.sq.common_module.common.ui.BackAppDialogFragment.Companion Companion = null;
    private static com.sq.common_module.common.ui.BackAppDialogFragment.BackAppCallBack mCallBack;
    
    public BackAppDialogFragment() {
        super();
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
    
    @java.lang.Override
    public void onStart() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/sq/common_module/common/ui/BackAppDialogFragment$BackAppCallBack;", "", "close", "", "common_module_release"})
    public static abstract interface BackAppCallBack {
        
        public abstract void close();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/sq/common_module/common/ui/BackAppDialogFragment$Companion;", "", "()V", "mCallBack", "Lcom/sq/common_module/common/ui/BackAppDialogFragment$BackAppCallBack;", "showBackAppDialog", "", "fragment", "Landroidx/fragment/app/FragmentManager;", "callBack", "common_module_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void showBackAppDialog(@org.jetbrains.annotations.NotNull
        androidx.fragment.app.FragmentManager fragment, @org.jetbrains.annotations.NotNull
        com.sq.common_module.common.ui.BackAppDialogFragment.BackAppCallBack callBack) {
        }
    }
}