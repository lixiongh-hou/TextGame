package com.sq.common_module.common.ad;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.sq.common_module.R;
import com.sq.common_module.common.base.BaseDialogFragment;
import com.sq.common_module.common.bean.GetRewardBean;
import com.sq.common_module.common.pange.TTRewardAdUtils;
import com.sq.common_module.common.utils.java.L;
import com.sq.common_module.common.utils.kt.DialogNumUtils;
import com.sq.common_module.common.utils.kt.UserInfoManager;
import com.sq.common_module.common.utils.kt.WiFiBaseUtils;
import com.sq.common_module.databinding.DialogRewardLoadingBinding;
import kotlinx.coroutines.Dispatchers;
import java.lang.ref.WeakReference;
import java.util.*;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0018\u0019B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J\u0006\u0010\u0011\u001a\u00020\rJ\b\u0010\u0012\u001a\u00020\u0007H\u0016J\u001a\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/sq/common_module/common/ad/RewardLoadingDialog;", "Lcom/sq/common_module/common/base/BaseDialogFragment;", "Lcom/sq/common_module/databinding/DialogRewardLoadingBinding;", "()V", "animatorSet", "Landroid/animation/AnimatorSet;", "currentProgress", "", "mTimer", "Ljava/util/Timer;", "myHandler", "Lcom/sq/common_module/common/ad/RewardLoadingDialog$Companion$MyHandler;", "initClick", "", "initRequest", "initView", "onDestroy", "onDialogMiss", "setLayout", "show", "manager", "Landroidx/fragment/app/FragmentManager;", "tag", "", "Companion", "MyTask", "common_module_release"})
public final class RewardLoadingDialog extends com.sq.common_module.common.base.BaseDialogFragment<com.sq.common_module.databinding.DialogRewardLoadingBinding> {
    private android.animation.AnimatorSet animatorSet;
    private int currentProgress = 0;
    private java.util.Timer mTimer;
    private com.sq.common_module.common.ad.RewardLoadingDialog.Companion.MyHandler myHandler;
    @org.jetbrains.annotations.NotNull
    public static final com.sq.common_module.common.ad.RewardLoadingDialog.Companion Companion = null;
    
    public RewardLoadingDialog() {
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
    
    public final void onDialogMiss() {
    }
    
    @java.lang.Override
    public void show(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.FragmentManager manager, @org.jetbrains.annotations.Nullable
    java.lang.String tag) {
    }
    
    @java.lang.Override
    public void onDestroy() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0005"}, d2 = {"Lcom/sq/common_module/common/ad/RewardLoadingDialog$MyTask;", "Ljava/util/TimerTask;", "(Lcom/sq/common_module/common/ad/RewardLoadingDialog;)V", "run", "", "common_module_release"})
    public final class MyTask extends java.util.TimerTask {
        
        public MyTask() {
            super();
        }
        
        @java.lang.Override
        public void run() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/sq/common_module/common/ad/RewardLoadingDialog$Companion;", "", "()V", "MyHandler", "common_module_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/sq/common_module/common/ad/RewardLoadingDialog$Companion$MyHandler;", "Landroid/os/Handler;", "rewardLoadingDialog", "Lcom/sq/common_module/common/ad/RewardLoadingDialog;", "(Lcom/sq/common_module/common/ad/RewardLoadingDialog;)V", "weakReference", "Ljava/lang/ref/WeakReference;", "dispatchMessage", "", "msg", "Landroid/os/Message;", "common_module_release"})
        public static final class MyHandler extends android.os.Handler {
            private final java.lang.ref.WeakReference<com.sq.common_module.common.ad.RewardLoadingDialog> weakReference = null;
            
            public MyHandler(@org.jetbrains.annotations.NotNull
            com.sq.common_module.common.ad.RewardLoadingDialog rewardLoadingDialog) {
                super();
            }
            
            @java.lang.Override
            public void dispatchMessage(@org.jetbrains.annotations.NotNull
            android.os.Message msg) {
            }
        }
    }
}