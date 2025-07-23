package com.sq.common_module.common.bean;

import android.os.Parcelable;
import com.sq.common_module.R;
import kotlinx.parcelize.Parcelize;
import java.util.stream.DoubleStream;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b+\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0012J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\u009f\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010,\u001a\u00020\u00032\b\u0010-\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010.\u001a\u00020/H\u00d6\u0001J\t\u00100\u001a\u000201H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0013R\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0013\"\u0004\b\u0016\u0010\u0015R\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0013\"\u0004\b\u001a\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0013\u00a8\u00062"}, d2 = {"Lcom/sq/common_module/common/bean/ToWIfiPageBean;", "", "isInformationFlow", "", "isUsedWifiEnhancedSignal", "isUsedWifiFlowProtection", "isUsedWifiFluency", "isUsedWifiGuard", "isUsedWifiPreventNetwork", "isUsedWifiStrengthNetwork", "isUsedWifiSystemNetwork", "isUsedCleanWechat", "isUsedCleanRubbish", "isUsedCleanVirusDetection", "isUsedCleanBatterySaving", "isUsedCleanSpeedUp", "isUsedCleanFluency", "isUsedCleanAdClean", "(ZZZZZZZZZZZZZZZ)V", "()Z", "setUsedCleanAdClean", "(Z)V", "setUsedCleanBatterySaving", "setUsedCleanFluency", "setUsedCleanRubbish", "setUsedCleanSpeedUp", "setUsedCleanVirusDetection", "setUsedCleanWechat", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "", "common_module_release"})
public final class ToWIfiPageBean {
    private final boolean isInformationFlow = false;
    private final boolean isUsedWifiEnhancedSignal = false;
    private final boolean isUsedWifiFlowProtection = false;
    private final boolean isUsedWifiFluency = false;
    private final boolean isUsedWifiGuard = false;
    private final boolean isUsedWifiPreventNetwork = false;
    private final boolean isUsedWifiStrengthNetwork = false;
    private final boolean isUsedWifiSystemNetwork = false;
    private boolean isUsedCleanWechat;
    private boolean isUsedCleanRubbish;
    private boolean isUsedCleanVirusDetection;
    private boolean isUsedCleanBatterySaving;
    private boolean isUsedCleanSpeedUp;
    private boolean isUsedCleanFluency;
    private boolean isUsedCleanAdClean;
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.ToWIfiPageBean copy(boolean isInformationFlow, boolean isUsedWifiEnhancedSignal, boolean isUsedWifiFlowProtection, boolean isUsedWifiFluency, boolean isUsedWifiGuard, boolean isUsedWifiPreventNetwork, boolean isUsedWifiStrengthNetwork, boolean isUsedWifiSystemNetwork, boolean isUsedCleanWechat, boolean isUsedCleanRubbish, boolean isUsedCleanVirusDetection, boolean isUsedCleanBatterySaving, boolean isUsedCleanSpeedUp, boolean isUsedCleanFluency, boolean isUsedCleanAdClean) {
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
    
    public ToWIfiPageBean(boolean isInformationFlow, boolean isUsedWifiEnhancedSignal, boolean isUsedWifiFlowProtection, boolean isUsedWifiFluency, boolean isUsedWifiGuard, boolean isUsedWifiPreventNetwork, boolean isUsedWifiStrengthNetwork, boolean isUsedWifiSystemNetwork, boolean isUsedCleanWechat, boolean isUsedCleanRubbish, boolean isUsedCleanVirusDetection, boolean isUsedCleanBatterySaving, boolean isUsedCleanSpeedUp, boolean isUsedCleanFluency, boolean isUsedCleanAdClean) {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final boolean isInformationFlow() {
        return false;
    }
    
    public final boolean component2() {
        return false;
    }
    
    public final boolean isUsedWifiEnhancedSignal() {
        return false;
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean isUsedWifiFlowProtection() {
        return false;
    }
    
    public final boolean component4() {
        return false;
    }
    
    public final boolean isUsedWifiFluency() {
        return false;
    }
    
    public final boolean component5() {
        return false;
    }
    
    public final boolean isUsedWifiGuard() {
        return false;
    }
    
    public final boolean component6() {
        return false;
    }
    
    public final boolean isUsedWifiPreventNetwork() {
        return false;
    }
    
    public final boolean component7() {
        return false;
    }
    
    public final boolean isUsedWifiStrengthNetwork() {
        return false;
    }
    
    public final boolean component8() {
        return false;
    }
    
    public final boolean isUsedWifiSystemNetwork() {
        return false;
    }
    
    public final boolean component9() {
        return false;
    }
    
    public final boolean isUsedCleanWechat() {
        return false;
    }
    
    public final void setUsedCleanWechat(boolean p0) {
    }
    
    public final boolean component10() {
        return false;
    }
    
    public final boolean isUsedCleanRubbish() {
        return false;
    }
    
    public final void setUsedCleanRubbish(boolean p0) {
    }
    
    public final boolean component11() {
        return false;
    }
    
    public final boolean isUsedCleanVirusDetection() {
        return false;
    }
    
    public final void setUsedCleanVirusDetection(boolean p0) {
    }
    
    public final boolean component12() {
        return false;
    }
    
    public final boolean isUsedCleanBatterySaving() {
        return false;
    }
    
    public final void setUsedCleanBatterySaving(boolean p0) {
    }
    
    public final boolean component13() {
        return false;
    }
    
    public final boolean isUsedCleanSpeedUp() {
        return false;
    }
    
    public final void setUsedCleanSpeedUp(boolean p0) {
    }
    
    public final boolean component14() {
        return false;
    }
    
    public final boolean isUsedCleanFluency() {
        return false;
    }
    
    public final void setUsedCleanFluency(boolean p0) {
    }
    
    public final boolean component15() {
        return false;
    }
    
    public final boolean isUsedCleanAdClean() {
        return false;
    }
    
    public final void setUsedCleanAdClean(boolean p0) {
    }
}