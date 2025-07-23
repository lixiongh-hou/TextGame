package com.sq.common_module.common.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import com.sq.common_module.R;
import com.sq.common_module.common.widget.LoadingDialog;
import com.sq.common_module.databinding.FragmentBaseBinding;

/**
 * Created by town
 * Date :  2022/10/13
 * Time : 11:19
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u001d\u001a\u00020\u001eJ\b\u0010\u001f\u001a\u00020\u001eH&J\b\u0010 \u001a\u00020\u001eH&J\b\u0010!\u001a\u00020\u001eH&J\b\u0010\"\u001a\u00020\u001eH&J\b\u0010#\u001a\u00020\u001eH\u0016J\b\u0010$\u001a\u00020\u001eH\u0014J\u0012\u0010%\u001a\u00020\u001e2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J&\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\b\u0010.\u001a\u00020\u001eH\u0016J\b\u0010/\u001a\u00020\u001eH\u0016J\b\u00100\u001a\u000201H&J\u0010\u00102\u001a\u00020\u001e2\u0006\u00103\u001a\u00020\u0006H\u0016J\b\u00104\u001a\u0004\u0018\u00010\u001cR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u00028\u0000X\u0086.\u00a2\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Lcom/sq/common_module/common/base/BaseLazyFragment;", "VDB", "Landroidx/databinding/ViewDataBinding;", "Landroidx/fragment/app/Fragment;", "()V", "isFirst", "", "isLazyLoaded", "isPrepared", "mBaseBinding", "Lcom/sq/common_module/databinding/FragmentBaseBinding;", "getMBaseBinding", "()Lcom/sq/common_module/databinding/FragmentBaseBinding;", "setMBaseBinding", "(Lcom/sq/common_module/databinding/FragmentBaseBinding;)V", "mBindView", "getMBindView", "()Landroidx/databinding/ViewDataBinding;", "setMBindView", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "mBtnLoadFail", "Landroidx/appcompat/widget/AppCompatButton;", "getMBtnLoadFail", "()Landroidx/appcompat/widget/AppCompatButton;", "setMBtnLoadFail", "(Landroidx/appcompat/widget/AppCompatButton;)V", "mLoadingDialog", "Lcom/sq/common_module/common/widget/LoadingDialog;", "dismissDialog", "", "initClick", "initLiveData", "initRequest", "initView", "isNotFirst", "lazyLoad", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onResume", "setLayout", "", "setUserVisibleHint", "isVisibleToUser", "showLoadingDialog", "common_module_release"})
public abstract class BaseLazyFragment<VDB extends androidx.databinding.ViewDataBinding> extends androidx.fragment.app.Fragment {
    public VDB mBindView;
    public com.sq.common_module.databinding.FragmentBaseBinding mBaseBinding;
    private boolean isLazyLoaded = false;
    private boolean isPrepared = false;
    private boolean isFirst = true;
    private com.sq.common_module.common.widget.LoadingDialog mLoadingDialog;
    @org.jetbrains.annotations.Nullable
    private androidx.appcompat.widget.AppCompatButton mBtnLoadFail;
    
    public BaseLazyFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final VDB getMBindView() {
        return null;
    }
    
    public final void setMBindView(@org.jetbrains.annotations.NotNull
    VDB p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.databinding.FragmentBaseBinding getMBaseBinding() {
        return null;
    }
    
    public final void setMBaseBinding(@org.jetbrains.annotations.NotNull
    com.sq.common_module.databinding.FragmentBaseBinding p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final androidx.appcompat.widget.AppCompatButton getMBtnLoadFail() {
        return null;
    }
    
    public final void setMBtnLoadFail(@org.jetbrains.annotations.Nullable
    androidx.appcompat.widget.AppCompatButton p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onActivityCreated(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    @java.lang.Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
    }
    
    protected void lazyLoad() {
    }
    
    public void isNotFirst() {
    }
    
    public abstract int setLayout();
    
    public abstract void initView();
    
    public abstract void initClick();
    
    public abstract void initRequest();
    
    public abstract void initLiveData();
    
    @java.lang.Override
    public void onDestroy() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.widget.LoadingDialog showLoadingDialog() {
        return null;
    }
    
    public final void dismissDialog() {
    }
}