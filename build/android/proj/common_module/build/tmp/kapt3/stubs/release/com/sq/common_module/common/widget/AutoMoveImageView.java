package com.sq.common_module.common.widget;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.View.MeasureSpec;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.sq.common_module.common.utils.java.L;
import java.lang.Exception;
import java.lang.ref.WeakReference;
import java.util.*;

/**
 * Created by town
 * Date :  2022/10/27
 * Time : 10:06
 * 自动移动view
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u0000 )2\u00020\u0001:\u0002)*B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0007H\u0002J\u0010\u0010\u001b\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\u0006\u0010\u001e\u001a\u00020\u001fJ\u0018\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0007H\u0014J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0007J\u0006\u0010$\u001a\u00020\u001fJ\b\u0010%\u001a\u00020\u001fH\u0002J\b\u0010&\u001a\u00020\u001fH\u0002J\b\u0010\'\u001a\u00020\u001fH\u0002J\u0006\u0010(\u001a\u00020\u001fR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/sq/common_module/common/widget/AutoMoveImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "everyMoveDistance", "fromBottomMoveToTop", "", "fromRightMoveToLeft", "isMove", "isStartTimer", "isStopMove", "mHandler", "Lcom/sq/common_module/common/widget/AutoMoveImageView$Companion$MyHandler;", "mStartBottom", "mStartRight", "mTimer", "Ljava/util/Timer;", "movePeriodTime", "viewHeight", "viewWidth", "dp2px", "i", "initFloating", "activity", "Landroid/app/Activity;", "initMove", "", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setHeightDistance", "startMove", "startTimer", "startViewMove", "stopTimer", "stopViewMove", "Companion", "MyTimerTask", "common_module_release"})
public final class AutoMoveImageView extends androidx.appcompat.widget.AppCompatImageView {
    private final android.util.AttributeSet attrs = null;
    private final int defStyleAttr = 0;
    private int movePeriodTime = 0;
    private int everyMoveDistance = 0;
    private boolean fromRightMoveToLeft = false;
    private boolean fromBottomMoveToTop = false;
    private boolean isStartTimer = false;
    private java.util.Timer mTimer;
    private boolean isStopMove = false;
    private boolean isMove = false;
    private int viewWidth = 0;
    private int mStartRight = 0;
    private int mStartBottom = 0;
    private int viewHeight = 0;
    private com.sq.common_module.common.widget.AutoMoveImageView.Companion.MyHandler mHandler;
    @org.jetbrains.annotations.NotNull
    public static final com.sq.common_module.common.widget.AutoMoveImageView.Companion Companion = null;
    
    @kotlin.jvm.JvmOverloads
    public AutoMoveImageView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public AutoMoveImageView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @java.lang.Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    }
    
    private final void startViewMove() {
    }
    
    public final void stopViewMove() {
    }
    
    private final void startTimer() {
    }
    
    private final void stopTimer() {
    }
    
    public final void startMove() {
    }
    
    private final int dp2px(int i) {
        return 0;
    }
    
    public final void initMove() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.widget.AutoMoveImageView setHeightDistance(int i) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.widget.AutoMoveImageView initFloating(@org.jetbrains.annotations.Nullable
    android.app.Activity activity) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0005"}, d2 = {"Lcom/sq/common_module/common/widget/AutoMoveImageView$MyTimerTask;", "Ljava/util/TimerTask;", "(Lcom/sq/common_module/common/widget/AutoMoveImageView;)V", "run", "", "common_module_release"})
    final class MyTimerTask extends java.util.TimerTask {
        
        public MyTimerTask() {
            super();
        }
        
        @java.lang.Override
        public void run() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/sq/common_module/common/widget/AutoMoveImageView$Companion;", "", "()V", "MyHandler", "common_module_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/sq/common_module/common/widget/AutoMoveImageView$Companion$MyHandler;", "Landroid/os/Handler;", "autoMoveImageView", "Lcom/sq/common_module/common/widget/AutoMoveImageView;", "(Lcom/sq/common_module/common/widget/AutoMoveImageView;)V", "weakReference", "Ljava/lang/ref/WeakReference;", "dispatchMessage", "", "msg", "Landroid/os/Message;", "common_module_release"})
        public static final class MyHandler extends android.os.Handler {
            private final java.lang.ref.WeakReference<com.sq.common_module.common.widget.AutoMoveImageView> weakReference = null;
            
            public MyHandler(@org.jetbrains.annotations.NotNull
            com.sq.common_module.common.widget.AutoMoveImageView autoMoveImageView) {
                super();
            }
            
            @java.lang.Override
            public void dispatchMessage(@org.jetbrains.annotations.NotNull
            android.os.Message msg) {
            }
        }
    }
}