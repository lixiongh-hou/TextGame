package com.sq.common_module.common.base;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.sq.common_module.R;
import com.sq.common_module.common.utils.java.L;
import com.sq.common_module.common.utils.kt.DialogUtils;
import com.sq.common_module.databinding.FragmentBaseBinding;

/**
 * Created by town
 * Date :  2022/10/21
 * Time : 17:06
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H&J\b\u0010\u0014\u001a\u00020\u0012H&J\b\u0010\u0015\u001a\u00020\u0012H&J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J&\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\u0012H\u0016J\b\u0010\"\u001a\u00020#H&J\u001a\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u00028\u0000X\u0086.\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006)"}, d2 = {"Lcom/sq/common_module/common/base/BaseDialogFragment;", "VDB", "Landroidx/databinding/ViewDataBinding;", "Landroidx/fragment/app/DialogFragment;", "()V", "mBaseBinding", "Lcom/sq/common_module/databinding/FragmentBaseBinding;", "getMBaseBinding", "()Lcom/sq/common_module/databinding/FragmentBaseBinding;", "setMBaseBinding", "(Lcom/sq/common_module/databinding/FragmentBaseBinding;)V", "mBindView", "getMBindView", "()Landroidx/databinding/ViewDataBinding;", "setMBindView", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "dismissAllowingStateLoss", "", "initClick", "initRequest", "initView", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "setLayout", "", "show", "manager", "Landroidx/fragment/app/FragmentManager;", "tag", "", "common_module_release"})
public abstract class BaseDialogFragment<VDB extends androidx.databinding.ViewDataBinding> extends androidx.fragment.app.DialogFragment {
    public com.sq.common_module.databinding.FragmentBaseBinding mBaseBinding;
    public VDB mBindView;
    
    public BaseDialogFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.databinding.FragmentBaseBinding getMBaseBinding() {
        return null;
    }
    
    public final void setMBaseBinding(@org.jetbrains.annotations.NotNull
    com.sq.common_module.databinding.FragmentBaseBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final VDB getMBindView() {
        return null;
    }
    
    public final void setMBindView(@org.jetbrains.annotations.NotNull
    VDB p0) {
    }
    
    @java.lang.Override
    public void onAttach(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public abstract int setLayout();
    
    public abstract void initView();
    
    public abstract void initRequest();
    
    public abstract void initClick();
    
    @java.lang.Override
    public void onDestroy() {
    }
    
    @java.lang.Override
    public void show(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.FragmentManager manager, @org.jetbrains.annotations.Nullable
    java.lang.String tag) {
    }
    
    @java.lang.Override
    public void dismissAllowingStateLoss() {
    }
}