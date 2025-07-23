package com.sq.common_module.common.bean;

import android.os.Parcelable;
import com.sq.common_module.R;
import kotlinx.parcelize.Parcelize;
import java.util.stream.DoubleStream;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\b\u0086\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0012\u00a2\u0006\u0002\u0010\u0017J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u000bH\u00c6\u0003J\t\u0010.\u001a\u00020\u000bH\u00c6\u0003J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00160\u0012H\u00c6\u0003J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\u0007H\u00c6\u0003J\t\u00106\u001a\u00020\u0007H\u00c6\u0003J\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\t\u00108\u001a\u00020\u000bH\u00c6\u0003J\t\u00109\u001a\u00020\u000bH\u00c6\u0003J\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\u00ad\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0012H\u00c6\u0001J\u0013\u0010<\u001a\u00020\u00072\b\u0010=\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010>\u001a\u00020\u000bH\u00d6\u0001J\t\u0010?\u001a\u00020\u0003H\u00d6\u0001R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0011\u0010\f\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001bR\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0019\u00a8\u0006@"}, d2 = {"Lcom/sq/common_module/common/bean/WithdrawalBean;", "", "userCoin", "", "userAmount", "rule", "userBindWx", "", "userBindZfb", "activityName", "unlockAdFrom", "", "unlockAdType", "unlockAdId", "adFrom", "adType", "adId", "OpSite", "", "tomorrowQuickWithdraw", "Lcom/sq/common_module/common/bean/TomorrowQuickWithdrawBean;", "withdrawGoods", "Lcom/sq/common_module/common/bean/WithdrawalListBean;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;IILjava/lang/String;IILjava/lang/String;Ljava/util/List;Lcom/sq/common_module/common/bean/TomorrowQuickWithdrawBean;Ljava/util/List;)V", "getOpSite", "()Ljava/util/List;", "getActivityName", "()Ljava/lang/String;", "getAdFrom", "()I", "getAdId", "getAdType", "getRule", "getTomorrowQuickWithdraw", "()Lcom/sq/common_module/common/bean/TomorrowQuickWithdrawBean;", "getUnlockAdFrom", "getUnlockAdId", "getUnlockAdType", "getUserAmount", "getUserBindWx", "()Z", "getUserBindZfb", "getUserCoin", "getWithdrawGoods", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "common_module_release"})
public final class WithdrawalBean {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String userCoin = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String userAmount = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String rule = null;
    private final boolean userBindWx = false;
    private final boolean userBindZfb = false;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String activityName = null;
    private final int unlockAdFrom = 0;
    private final int unlockAdType = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String unlockAdId = null;
    private final int adFrom = 0;
    private final int adType = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String adId = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> OpSite = null;
    @org.jetbrains.annotations.Nullable
    private final com.sq.common_module.common.bean.TomorrowQuickWithdrawBean tomorrowQuickWithdraw = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.sq.common_module.common.bean.WithdrawalListBean> withdrawGoods = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.WithdrawalBean copy(@org.jetbrains.annotations.NotNull
    java.lang.String userCoin, @org.jetbrains.annotations.NotNull
    java.lang.String userAmount, @org.jetbrains.annotations.NotNull
    java.lang.String rule, boolean userBindWx, boolean userBindZfb, @org.jetbrains.annotations.NotNull
    java.lang.String activityName, int unlockAdFrom, int unlockAdType, @org.jetbrains.annotations.NotNull
    java.lang.String unlockAdId, int adFrom, int adType, @org.jetbrains.annotations.NotNull
    java.lang.String adId, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> OpSite, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.TomorrowQuickWithdrawBean tomorrowQuickWithdraw, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.WithdrawalListBean> withdrawGoods) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public WithdrawalBean(@org.jetbrains.annotations.NotNull
    java.lang.String userCoin, @org.jetbrains.annotations.NotNull
    java.lang.String userAmount, @org.jetbrains.annotations.NotNull
    java.lang.String rule, boolean userBindWx, boolean userBindZfb, @org.jetbrains.annotations.NotNull
    java.lang.String activityName, int unlockAdFrom, int unlockAdType, @org.jetbrains.annotations.NotNull
    java.lang.String unlockAdId, int adFrom, int adType, @org.jetbrains.annotations.NotNull
    java.lang.String adId, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> OpSite, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.TomorrowQuickWithdrawBean tomorrowQuickWithdraw, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.WithdrawalListBean> withdrawGoods) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUserCoin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUserAmount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRule() {
        return null;
    }
    
    public final boolean component4() {
        return false;
    }
    
    public final boolean getUserBindWx() {
        return false;
    }
    
    public final boolean component5() {
        return false;
    }
    
    public final boolean getUserBindZfb() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getActivityName() {
        return null;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getUnlockAdFrom() {
        return 0;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int getUnlockAdType() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUnlockAdId() {
        return null;
    }
    
    public final int component10() {
        return 0;
    }
    
    public final int getAdFrom() {
        return 0;
    }
    
    public final int component11() {
        return 0;
    }
    
    public final int getAdType() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAdId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getOpSite() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.TomorrowQuickWithdrawBean component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.TomorrowQuickWithdrawBean getTomorrowQuickWithdraw() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.WithdrawalListBean> component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.WithdrawalListBean> getWithdrawGoods() {
        return null;
    }
}