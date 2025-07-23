package com.sq.common_module.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import com.sq.common_module.R;

/**
 * Created by Android Studio.
 * author: yhs
 * Date: 2023/11/10
 * Time: 16:53
 * 备注：
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001cR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012\u00a8\u0006\u001d"}, d2 = {"Lcom/sq/common_module/common/widget/CustomNineTaskItem;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mProgress", "Landroidx/core/widget/ContentLoadingProgressBar;", "getMProgress", "()Landroidx/core/widget/ContentLoadingProgressBar;", "setMProgress", "(Landroidx/core/widget/ContentLoadingProgressBar;)V", "mProgressLabel", "Landroidx/appcompat/widget/AppCompatTextView;", "getMProgressLabel", "()Landroidx/appcompat/widget/AppCompatTextView;", "setMProgressLabel", "(Landroidx/appcompat/widget/AppCompatTextView;)V", "mSureLabel", "getMSureLabel", "setMSureLabel", "mTitleLabel", "getMTitleLabel", "setMTitleLabel", "singleClick", "", "block", "Lkotlin/Function0;", "common_module_release"})
public final class CustomNineTaskItem extends androidx.constraintlayout.widget.ConstraintLayout {
    @org.jetbrains.annotations.NotNull
    private androidx.appcompat.widget.AppCompatTextView mTitleLabel;
    @org.jetbrains.annotations.NotNull
    private androidx.core.widget.ContentLoadingProgressBar mProgress;
    @org.jetbrains.annotations.NotNull
    private androidx.appcompat.widget.AppCompatTextView mProgressLabel;
    @org.jetbrains.annotations.NotNull
    private androidx.appcompat.widget.AppCompatTextView mSureLabel;
    
    public CustomNineTaskItem(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.util.AttributeSet attributeSet) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.appcompat.widget.AppCompatTextView getMTitleLabel() {
        return null;
    }
    
    public final void setMTitleLabel(@org.jetbrains.annotations.NotNull
    androidx.appcompat.widget.AppCompatTextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.core.widget.ContentLoadingProgressBar getMProgress() {
        return null;
    }
    
    public final void setMProgress(@org.jetbrains.annotations.NotNull
    androidx.core.widget.ContentLoadingProgressBar p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.appcompat.widget.AppCompatTextView getMProgressLabel() {
        return null;
    }
    
    public final void setMProgressLabel(@org.jetbrains.annotations.NotNull
    androidx.appcompat.widget.AppCompatTextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.appcompat.widget.AppCompatTextView getMSureLabel() {
        return null;
    }
    
    public final void setMSureLabel(@org.jetbrains.annotations.NotNull
    androidx.appcompat.widget.AppCompatTextView p0) {
    }
    
    public final void singleClick(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> block) {
    }
}