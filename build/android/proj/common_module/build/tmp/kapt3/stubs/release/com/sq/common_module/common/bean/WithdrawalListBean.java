package com.sq.common_module.common.bean;

import android.os.Parcelable;
import com.sq.common_module.R;
import kotlinx.parcelize.Parcelize;
import java.util.stream.DoubleStream;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001J\t\u0010!\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e\u00a8\u0006\""}, d2 = {"Lcom/sq/common_module/common/bean/WithdrawalListBean;", "", "withdrawRowId", "", "withdrawAmount", "", "isTodayCanWithdraw", "", "unlockStatus", "validDay", "withdrawType", "desc", "(ILjava/lang/String;ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDesc", "()Ljava/lang/String;", "()Z", "getUnlockStatus", "()I", "getValidDay", "getWithdrawAmount", "getWithdrawRowId", "getWithdrawType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "common_module_release"})
public final class WithdrawalListBean {
    private final int withdrawRowId = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String withdrawAmount = null;
    private final boolean isTodayCanWithdraw = false;
    private final int unlockStatus = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String validDay = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String withdrawType = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String desc = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.WithdrawalListBean copy(int withdrawRowId, @org.jetbrains.annotations.NotNull
    java.lang.String withdrawAmount, boolean isTodayCanWithdraw, int unlockStatus, @org.jetbrains.annotations.NotNull
    java.lang.String validDay, @org.jetbrains.annotations.NotNull
    java.lang.String withdrawType, @org.jetbrains.annotations.NotNull
    java.lang.String desc) {
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
    
    public WithdrawalListBean(int withdrawRowId, @org.jetbrains.annotations.NotNull
    java.lang.String withdrawAmount, boolean isTodayCanWithdraw, int unlockStatus, @org.jetbrains.annotations.NotNull
    java.lang.String validDay, @org.jetbrains.annotations.NotNull
    java.lang.String withdrawType, @org.jetbrains.annotations.NotNull
    java.lang.String desc) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getWithdrawRowId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getWithdrawAmount() {
        return null;
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean isTodayCanWithdraw() {
        return false;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getUnlockStatus() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValidDay() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getWithdrawType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDesc() {
        return null;
    }
}