package com.sq.common_module.common.utils.http;

import java.io.IOException;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u00028\u0000X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/sq/common_module/common/utils/http/BaseResult;", "T", "", "code", "", "data", "msg", "", "(ILjava/lang/Object;Ljava/lang/String;)V", "getCode", "()I", "getData", "()Ljava/lang/Object;", "setData", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "getMsg", "()Ljava/lang/String;", "common_module_release"})
public final class BaseResult<T extends java.lang.Object> {
    private final int code = 0;
    private T data;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String msg = null;
    
    public BaseResult(int code, T data, @org.jetbrains.annotations.NotNull
    java.lang.String msg) {
        super();
    }
    
    public final int getCode() {
        return 0;
    }
    
    public final T getData() {
        return null;
    }
    
    public final void setData(T p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMsg() {
        return null;
    }
}