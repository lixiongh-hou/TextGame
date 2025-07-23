package com.sq.common_module.common.bean;

import android.os.Parcelable;
import kotlinx.parcelize.Parcelize;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J]\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u001f\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\"H\u00d6\u0001J\t\u0010#\u001a\u00020\u0003H\u00d6\u0001R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0011R\u0011\u0010\f\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0011R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010\u00a8\u0006$"}, d2 = {"Lcom/sq/common_module/common/bean/ShakeWithdrawalBean;", "", "shakeCoin", "", "shakeCoinAmount", "withdrawList", "", "Lcom/sq/common_module/common/bean/ShakeWithdrawalListBean;", "bullets", "Lcom/sq/common_module/common/bean/BulletsListBean;", "isBindWx", "", "isBindZfb", "rule", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZLjava/lang/String;)V", "getBullets", "()Ljava/util/List;", "()Z", "getRule", "()Ljava/lang/String;", "getShakeCoin", "getShakeCoinAmount", "getWithdrawList", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "common_module_release"})
public final class ShakeWithdrawalBean {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String shakeCoin = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String shakeCoinAmount = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.sq.common_module.common.bean.ShakeWithdrawalListBean> withdrawList = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.sq.common_module.common.bean.BulletsListBean> bullets = null;
    private final boolean isBindWx = false;
    private final boolean isBindZfb = false;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String rule = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.ShakeWithdrawalBean copy(@org.jetbrains.annotations.NotNull
    java.lang.String shakeCoin, @org.jetbrains.annotations.NotNull
    java.lang.String shakeCoinAmount, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.ShakeWithdrawalListBean> withdrawList, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.BulletsListBean> bullets, boolean isBindWx, boolean isBindZfb, @org.jetbrains.annotations.Nullable
    java.lang.String rule) {
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
    
    public ShakeWithdrawalBean(@org.jetbrains.annotations.NotNull
    java.lang.String shakeCoin, @org.jetbrains.annotations.NotNull
    java.lang.String shakeCoinAmount, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.ShakeWithdrawalListBean> withdrawList, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.BulletsListBean> bullets, boolean isBindWx, boolean isBindZfb, @org.jetbrains.annotations.Nullable
    java.lang.String rule) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getShakeCoin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getShakeCoinAmount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.ShakeWithdrawalListBean> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.ShakeWithdrawalListBean> getWithdrawList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.BulletsListBean> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.BulletsListBean> getBullets() {
        return null;
    }
    
    public final boolean component5() {
        return false;
    }
    
    public final boolean isBindWx() {
        return false;
    }
    
    public final boolean component6() {
        return false;
    }
    
    public final boolean isBindZfb() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getRule() {
        return null;
    }
}