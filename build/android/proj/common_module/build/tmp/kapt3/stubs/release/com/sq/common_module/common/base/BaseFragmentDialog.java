package com.sq.common_module.common.base;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.*;
import androidx.annotation.FloatRange;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.sq.common_module.R;
import com.sq.common_module.databinding.FragmentBaseBinding;
import java.lang.reflect.ParameterizedType;

/**
 * @author 李雄厚
 *
 * @features DialogFragment基类
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\tJ\b\u0010 \u001a\u00020\u001fH\u0002J\u0010\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u0010H\u0016J\u0012\u0010#\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J&\u0010&\u001a\u0004\u0018\u00010\'2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010,\u001a\u00020\u001fH\u0016J\u0010\u0010-\u001a\u00020\u001f2\b\b\u0001\u0010.\u001a\u00020\u000eJ\u0010\u0010/\u001a\u00020\u001f2\b\b\u0001\u00100\u001a\u00020\u0016J\u000e\u00101\u001a\u00020\u001f2\u0006\u00102\u001a\u00020\u000eJ\b\u00103\u001a\u00020\u000eH&J\u0010\u00104\u001a\u00020\u001f2\u0006\u00105\u001a\u00020\u000eH\u0016J\u000e\u00106\u001a\u00020\u001f2\u0006\u00107\u001a\u00020\fJ\u001a\u00108\u001a\u00020\u001f2\b\b\u0002\u00109\u001a\u00020\u000e2\b\b\u0002\u0010:\u001a\u00020\u000eJ\u001a\u0010;\u001a\u00020\u001f2\u0006\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\u0010\u0010;\u001a\u00020\u001f2\b\u0010<\u001a\u0004\u0018\u00010=J\u001a\u0010;\u001a\u00020\u000e2\u0006\u0010@\u001a\u00020A2\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\u001a\u0010B\u001a\u00020\u001f2\u0006\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?H\u0016R\u001c\u0010\u0005\u001a\u00028\u0000X\u0086.\u00a2\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006C"}, d2 = {"Lcom/sq/common_module/common/base/BaseFragmentDialog;", "Binding", "Landroidx/databinding/ViewDataBinding;", "Landroidx/appcompat/app/AppCompatDialogFragment;", "()V", "binding", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "setBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "created", "", "mAnimStyle", "", "mContext", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "mDimAmount", "", "mGravity", "mHeight", "mMargin", "mOutCancel", "mWidth", "params", "Landroid/view/WindowManager$LayoutParams;", "convertView", "", "initParams", "onAttach", "context", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onStart", "setAnimStyle", "animStyle", "setDimAmount", "dimAmount", "setGravity", "gravity", "setLayout", "setMargin", "margin", "setOutCancel", "outCancel", "setSize", "width", "height", "show", "manager", "Landroidx/fragment/app/FragmentManager;", "tag", "", "transaction", "Landroidx/fragment/app/FragmentTransaction;", "showNow", "common_module_release"})
public abstract class BaseFragmentDialog<Binding extends androidx.databinding.ViewDataBinding> extends androidx.appcompat.app.AppCompatDialogFragment {
    public Binding binding;
    
    /**
     * 背景昏暗度
     */
    private float mDimAmount = 0.5F;
    
    /**
     * 左右边距
     */
    private int mMargin = 0;
    
    /**
     * 进入退出动画
     */
    private int mAnimStyle = 0;
    private int mGravity = android.view.Gravity.CENTER;
    
    /**
     * 点击外部取消
     */
    private boolean mOutCancel = true;
    private android.view.WindowManager.LayoutParams params;
    @org.jetbrains.annotations.Nullable
    private android.content.Context mContext;
    private int mWidth = 0;
    private int mHeight = 0;
    private boolean created = false;
    
    public BaseFragmentDialog() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final Binding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull
    Binding p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.content.Context getMContext() {
        return null;
    }
    
    public final void setMContext(@org.jetbrains.annotations.Nullable
    android.content.Context p0) {
    }
    
    @java.lang.Override
    public void onAttach(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
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
    public void onStart() {
    }
    
    private final void initParams() {
    }
    
    /**
     * 设置背景昏暗度
     *
     * @param dimAmount
     * @return
     */
    public final void setDimAmount(@androidx.annotation.FloatRange(from = 0.0, to = 1.0)
    float dimAmount) {
    }
    
    /**
     * 弹出框位置
     */
    public final void setGravity(int gravity) {
    }
    
    /**
     * 设置宽高
     *
     * @param width 固定宽度，默认为0，自适应宽度 当设置宽度 >0 {setMargin()} 无效
     * @param height 固定高度，默认为0,自适应高度
     * @return
     */
    public final void setSize(int width, int height) {
    }
    
    /**
     * 设置左右margin
     */
    public void setMargin(int margin) {
    }
    
    /**
     * 设置进入退出动画
     */
    public final void setAnimStyle(@androidx.annotation.StyleRes
    int animStyle) {
    }
    
    /**
     * 设置是否点击外部取消
     * @return
     */
    public final void setOutCancel(boolean outCancel) {
    }
    
    public final void show(@org.jetbrains.annotations.Nullable
    androidx.fragment.app.FragmentManager manager) {
    }
    
    /**
     * 操作dialog布局
     */
    public abstract void convertView(@org.jetbrains.annotations.NotNull
    Binding binding);
    
    public abstract int setLayout();
    
    @java.lang.Override
    public void show(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.FragmentManager manager, @org.jetbrains.annotations.Nullable
    java.lang.String tag) {
    }
    
    @java.lang.Override
    public int show(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.FragmentTransaction transaction, @org.jetbrains.annotations.Nullable
    java.lang.String tag) {
        return 0;
    }
    
    @java.lang.Override
    public void showNow(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.FragmentManager manager, @org.jetbrains.annotations.Nullable
    java.lang.String tag) {
    }
}