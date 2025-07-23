package com.sq.common_module.common.widget;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sq.common_module.R;
import com.sq.common_module.common.utils.java.L;

/**
 * Created by town
 * Date :  2022/12/12
 * Time : 17:10
 * 猜成语 四种情况
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020%J\u0018\u0010&\u001a\u00020\"2\u0006\u0010\'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020%H\u0002J\u0010\u0010)\u001a\u00020\"2\u0006\u0010*\u001a\u00020\u0007H\u0002J\u001c\u0010+\u001a\u00020\"2\u0006\u0010,\u001a\u00020\u00072\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\f0.R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lcom/sq/common_module/common/widget/GuessIdiomsRandomWidgeThird;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "correctPosition", "mColumnList", "Ljava/util/ArrayList;", "", "mList", "mRowList", "mShowPosition", "mTvGuess1", "Landroidx/appcompat/widget/AppCompatTextView;", "mTvGuess10", "mTvGuess11", "mTvGuess12", "mTvGuess13", "mTvGuess14", "mTvGuess15", "mTvGuess16", "mTvGuess2", "mTvGuess3", "mTvGuess4", "mTvGuess5", "mTvGuess6", "mTvGuess7", "mTvGuess8", "mTvGuess9", "setCorrectAnswer", "", "s", "isCorrect", "", "setTextDrawable", "textView", "isInit", "showGuessView", "mPosition", "showView", "position", "list", "", "common_module_release"})
public final class GuessIdiomsRandomWidgeThird extends androidx.constraintlayout.widget.ConstraintLayout {
    private final android.util.AttributeSet attrs = null;
    private final int defStyleAttr = 0;
    private final java.util.ArrayList<java.lang.String> mList = null;
    private int correctPosition = 1;
    private androidx.appcompat.widget.AppCompatTextView mTvGuess1;
    private androidx.appcompat.widget.AppCompatTextView mTvGuess2;
    private androidx.appcompat.widget.AppCompatTextView mTvGuess3;
    private androidx.appcompat.widget.AppCompatTextView mTvGuess4;
    private androidx.appcompat.widget.AppCompatTextView mTvGuess5;
    private androidx.appcompat.widget.AppCompatTextView mTvGuess6;
    private androidx.appcompat.widget.AppCompatTextView mTvGuess7;
    private androidx.appcompat.widget.AppCompatTextView mTvGuess8;
    private androidx.appcompat.widget.AppCompatTextView mTvGuess9;
    private androidx.appcompat.widget.AppCompatTextView mTvGuess10;
    private androidx.appcompat.widget.AppCompatTextView mTvGuess11;
    private androidx.appcompat.widget.AppCompatTextView mTvGuess12;
    private androidx.appcompat.widget.AppCompatTextView mTvGuess13;
    private androidx.appcompat.widget.AppCompatTextView mTvGuess14;
    private androidx.appcompat.widget.AppCompatTextView mTvGuess15;
    private androidx.appcompat.widget.AppCompatTextView mTvGuess16;
    private int mShowPosition = 0;
    private java.util.ArrayList<java.lang.String> mRowList;
    private java.util.ArrayList<java.lang.String> mColumnList;
    
    @kotlin.jvm.JvmOverloads
    public GuessIdiomsRandomWidgeThird(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public GuessIdiomsRandomWidgeThird(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public final void showView(int position, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> list) {
    }
    
    private final void showGuessView(int mPosition) {
    }
    
    public final void setCorrectAnswer(@org.jetbrains.annotations.NotNull
    java.lang.String s, boolean isCorrect) {
    }
    
    private final void setTextDrawable(androidx.appcompat.widget.AppCompatTextView textView, boolean isInit) {
    }
}