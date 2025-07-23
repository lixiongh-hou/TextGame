package com.sq.common_module.common.event;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/sq/common_module/common/event/HomeShowFullAdEvent;", "", "type", "", "showDailySign", "", "showWithdrawSign", "(IZZ)V", "getShowDailySign", "()Z", "getShowWithdrawSign", "getType", "()I", "common_module_release"})
public final class HomeShowFullAdEvent {
    private final int type = 0;
    private final boolean showDailySign = false;
    private final boolean showWithdrawSign = false;
    
    public HomeShowFullAdEvent(int type, boolean showDailySign, boolean showWithdrawSign) {
        super();
    }
    
    public final int getType() {
        return 0;
    }
    
    public final boolean getShowDailySign() {
        return false;
    }
    
    public final boolean getShowWithdrawSign() {
        return false;
    }
}