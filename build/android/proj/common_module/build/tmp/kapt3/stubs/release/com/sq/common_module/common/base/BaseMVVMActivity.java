package com.sq.common_module.common.base;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.blankj.utilcode.util.AdaptScreenUtils;
import com.blankj.utilcode.util.BarUtils;
import com.blankj.utilcode.util.ScreenUtils;
import com.sq.common_module.common.widget.LoadingDialog;
import com.sq.common_module.R;
import com.sq.common_module.common.utils.HttpHeaderUtils;
import com.sq.common_module.common.utils.java.L;
import com.sq.common_module.common.utils.java.StatusBarUtil;
import com.sq.common_module.databinding.ActivityBaseBinding;

/**
 * Created by town
 * Date :  2022/10/9
 * Time : 17:42
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u001cJ\b\u0010\u001e\u001a\u00020\u0006H\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u001cH\u0016J\b\u0010$\u001a\u00020\u001cH\u0016J\b\u0010%\u001a\u00020\u001cH&J\b\u0010&\u001a\u00020\u001cH&J\b\u0010\'\u001a\u00020\u001cH\u0016J\b\u0010(\u001a\u00020\u001cH&J\b\u0010)\u001a\u00020\u001cH&J\u0012\u0010*\u001a\u00020\u001c2\b\u0010+\u001a\u0004\u0018\u00010,H\u0014J\b\u0010-\u001a\u00020\u001cH\u0014J\b\u0010.\u001a\u00020\u001cH\u0014J\b\u0010/\u001a\u00020\u001cH\u0014J\b\u00100\u001a\u00020\u0006H&J\u0012\u00101\u001a\u00020\u001c2\b\u00102\u001a\u0004\u0018\u000103H\u0016J\b\u00104\u001a\u00020\u001cH\u0016J\b\u00105\u001a\u00020\u001cH\u0016J\b\u00106\u001a\u0004\u0018\u00010\u001aJ\b\u00107\u001a\u00020\u001cH\u0016J\b\u00108\u001a\u00020\u001cH\u0016J\b\u00109\u001a\u00020\u001cH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u00028\u0000X\u0086.\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006:"}, d2 = {"Lcom/sq/common_module/common/base/BaseMVVMActivity;", "VDB", "Landroidx/databinding/ViewDataBinding;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "mActivityNum", "", "mBaseBinding", "Lcom/sq/common_module/databinding/ActivityBaseBinding;", "getMBaseBinding", "()Lcom/sq/common_module/databinding/ActivityBaseBinding;", "setMBaseBinding", "(Lcom/sq/common_module/databinding/ActivityBaseBinding;)V", "mBindView", "getMBindView", "()Landroidx/databinding/ViewDataBinding;", "setMBindView", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "mContext", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "mLoadingDialog", "Lcom/sq/common_module/common/widget/LoadingDialog;", "back", "", "dismissDialog", "getDesignWidth", "getFontScale", "", "getResources", "Landroid/content/res/Resources;", "hideBackArrow", "hideToolBar", "initClick", "initLiveData", "initOnResumeRequest", "initRequest", "initView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onResume", "onStop", "setLayout", "setTitle", "title", "", "setTransparentStatusBar", "showCloseView", "showLoadingDialog", "showOnlineView", "showRefreshView", "showRightTitle", "common_module_release"})
public abstract class BaseMVVMActivity<VDB extends androidx.databinding.ViewDataBinding> extends androidx.appcompat.app.AppCompatActivity {
    public com.sq.common_module.databinding.ActivityBaseBinding mBaseBinding;
    public android.content.Context mContext;
    public VDB mBindView;
    private com.sq.common_module.common.widget.LoadingDialog mLoadingDialog;
    private int mActivityNum = 0;
    
    public BaseMVVMActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.databinding.ActivityBaseBinding getMBaseBinding() {
        return null;
    }
    
    public final void setMBaseBinding(@org.jetbrains.annotations.NotNull
    com.sq.common_module.databinding.ActivityBaseBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getMContext() {
        return null;
    }
    
    public final void setMContext(@org.jetbrains.annotations.NotNull
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final VDB getMBindView() {
        return null;
    }
    
    public final void setMBindView(@org.jetbrains.annotations.NotNull
    VDB p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.content.res.Resources getResources() {
        return null;
    }
    
    /**
     * 屏幕适配
     * 获取设计宽度
     * 如果返回-1表示不做适配
     */
    public int getDesignWidth() {
        return 0;
    }
    
    /**
     * 字体大小适配
     * 获取字体比例
     * 如果返回-1f表示跟随系统改变字体大小
     * 默认1.0f
     */
    public float getFontScale() {
        return 0.0F;
    }
    
    @java.lang.Override
    protected void onResume() {
    }
    
    public abstract int setLayout();
    
    public abstract void initView();
    
    public abstract void initClick();
    
    public abstract void initRequest();
    
    public void initOnResumeRequest() {
    }
    
    public abstract void initLiveData();
    
    public final void back() {
    }
    
    /**
     * 设置透明状态栏（沉浸式状态栏）
     */
    public void setTransparentStatusBar() {
    }
    
    public void setTitle(@org.jetbrains.annotations.Nullable
    java.lang.String title) {
    }
    
    /**
     * 隐藏标题框
     */
    public void hideToolBar() {
    }
    
    /**
     * 隐藏返回箭头
     */
    public void hideBackArrow() {
    }
    
    /**
     * 展示关闭
     */
    public void showCloseView() {
    }
    
    /**
     * 展示刷新
     */
    public void showRefreshView() {
    }
    
    /**
     * 展示客服
     */
    public void showOnlineView() {
    }
    
    /**
     * 展示右侧文字
     */
    public void showRightTitle() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.widget.LoadingDialog showLoadingDialog() {
        return null;
    }
    
    public final void dismissDialog() {
    }
    
    @java.lang.Override
    protected void onStop() {
    }
    
    @java.lang.Override
    protected void onDestroy() {
    }
}