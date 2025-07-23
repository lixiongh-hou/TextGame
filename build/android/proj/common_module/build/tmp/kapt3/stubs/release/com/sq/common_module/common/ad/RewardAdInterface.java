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

/**
 * Created by town
 * Date :  2022/11/15
 * Time : 14:08
 * 统一处理激励视频类型广告
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016\u00a8\u0006\u000f"}, d2 = {"Lcom/sq/common_module/common/ad/RewardAdInterface;", "", "adVideoComplete", "", "getRewardFail", "getRewardInfo", "mTransId", "", "videoEcpm", "getRewardSuccess", "data", "Lcom/sq/common_module/common/bean/GetRewardBean;", "loadAdFail", "loadAdSuccess", "loadTimeOut", "common_module_release"})
public abstract interface RewardAdInterface {
    
    public abstract void getRewardInfo(@org.jetbrains.annotations.NotNull
    java.lang.String mTransId, @org.jetbrains.annotations.NotNull
    java.lang.String videoEcpm);
    
    public abstract void getRewardSuccess(@org.jetbrains.annotations.NotNull
    com.sq.common_module.common.bean.GetRewardBean data);
    
    public abstract void getRewardFail();
    
    public abstract void loadAdSuccess();
    
    public abstract void loadAdFail();
    
    public abstract void loadTimeOut();
    
    public abstract void adVideoComplete();
    
    /**
     * Created by town
     * Date :  2022/11/15
     * Time : 14:08
     * 统一处理激励视频类型广告
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        public static void getRewardInfo(@org.jetbrains.annotations.NotNull
        com.sq.common_module.common.ad.RewardAdInterface $this, @org.jetbrains.annotations.NotNull
        java.lang.String mTransId, @org.jetbrains.annotations.NotNull
        java.lang.String videoEcpm) {
        }
        
        public static void getRewardSuccess(@org.jetbrains.annotations.NotNull
        com.sq.common_module.common.ad.RewardAdInterface $this, @org.jetbrains.annotations.NotNull
        com.sq.common_module.common.bean.GetRewardBean data) {
        }
        
        public static void getRewardFail(@org.jetbrains.annotations.NotNull
        com.sq.common_module.common.ad.RewardAdInterface $this) {
        }
        
        public static void loadAdSuccess(@org.jetbrains.annotations.NotNull
        com.sq.common_module.common.ad.RewardAdInterface $this) {
        }
        
        public static void loadAdFail(@org.jetbrains.annotations.NotNull
        com.sq.common_module.common.ad.RewardAdInterface $this) {
        }
        
        public static void loadTimeOut(@org.jetbrains.annotations.NotNull
        com.sq.common_module.common.ad.RewardAdInterface $this) {
        }
        
        public static void adVideoComplete(@org.jetbrains.annotations.NotNull
        com.sq.common_module.common.ad.RewardAdInterface $this) {
        }
    }
}