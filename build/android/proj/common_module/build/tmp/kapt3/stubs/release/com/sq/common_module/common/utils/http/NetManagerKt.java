package com.sq.common_module.common.utils.http;

import com.sq.common_module.common.widget.LoadingDialog;
import io.reactivex.rxjava3.core.Observable;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000&\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a6\u0010\u0006\u001a\u00020\u0007\"\u0004\b\u0000\u0010\b*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\n0\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\b0\u000e\"\u001a\u0010\u0000\u001a\u00020\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0004\b\u0004\u0010\u0005\u00a8\u0006\u000f"}, d2 = {"postNum", "", "getPostNum", "()I", "setPostNum", "(I)V", "handleRequest", "", "T", "Lio/reactivex/rxjava3/core/Observable;", "Lcom/sq/common_module/common/utils/http/BaseResult;", "loadingDialog", "Lcom/sq/common_module/common/widget/LoadingDialog;", "callBack", "Lcom/sq/common_module/common/utils/http/NetCallBack;", "common_module_release"})
public final class NetManagerKt {
    private static int postNum = 1;
    
    public static final int getPostNum() {
        return 0;
    }
    
    public static final void setPostNum(int p0) {
    }
    
    public static final <T extends java.lang.Object>void handleRequest(@org.jetbrains.annotations.NotNull
    io.reactivex.rxjava3.core.Observable<com.sq.common_module.common.utils.http.BaseResult<T>> $this$handleRequest, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.widget.LoadingDialog loadingDialog, @org.jetbrains.annotations.NotNull
    com.sq.common_module.common.utils.http.NetCallBack<T> callBack) {
    }
}