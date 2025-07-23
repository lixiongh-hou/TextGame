package com.sq.common_module.common.widget;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.sq.common_module.common.utils.kt.AnimatorListenerImpl;
import java.text.DecimalFormat;

/**
 * Created by town
 * Date :  2022/12/2
 * Time : 10:31
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u00020\fH\u0002J\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/sq/common_module/common/widget/RunTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mDf", "Ljava/text/DecimalFormat;", "mValueAnimator", "Landroid/animation/ValueAnimator;", "cancel", "", "initAnim", "setMoney", "money", "", "common_module_release"})
public final class RunTextView extends androidx.appcompat.widget.AppCompatTextView {
    private java.text.DecimalFormat mDf;
    private android.animation.ValueAnimator mValueAnimator;
    
    @kotlin.jvm.JvmOverloads
    public RunTextView(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public RunTextView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attributeSet) {
        super(null);
    }
    
    private final void initAnim() {
    }
    
    public final void setMoney(float money) {
    }
    
    /**
     * 取消动画和动画监听（优化内存）
     */
    public final void cancel() {
    }
}