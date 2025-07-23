package com.sq.common_module.common.utils.kt;

import com.sq.common_module.common.repository.CommonRepository;
import com.sq.common_module.common.utils.HttpHeaderUtils;
import com.sq.common_module.common.utils.http.NetCallBack;
import com.sq.common_module.common.utils.java.L;
import javax.inject.Inject;

/**
 * Created by lsy
 * Date : 2023/11/2
 * Desc : 埋点工具（object不了>_<）
 * @see TrackEventConst 事件
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bR\'\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/sq/common_module/common/utils/kt/TrackEventUtils;", "", "repository", "Lcom/sq/common_module/common/repository/CommonRepository;", "(Lcom/sq/common_module/common/repository/CommonRepository;)V", "callback", "Lcom/sq/common_module/common/utils/http/NetCallBack;", "", "", "getCallback", "()Lcom/sq/common_module/common/utils/http/NetCallBack;", "callback$delegate", "Lkotlin/Lazy;", "onEvent", "", "event", "common_module_release"})
public final class TrackEventUtils {
    private final com.sq.common_module.common.repository.CommonRepository repository = null;
    private final kotlin.Lazy callback$delegate = null;
    
    @javax.inject.Inject
    public TrackEventUtils(@org.jetbrains.annotations.NotNull
    com.sq.common_module.common.repository.CommonRepository repository) {
        super();
    }
    
    private final com.sq.common_module.common.utils.http.NetCallBack<java.util.List<java.lang.String>> getCallback() {
        return null;
    }
    
    /**
     * 埋点
     */
    public final void onEvent(@org.jetbrains.annotations.NotNull
    java.lang.String event) {
    }
}