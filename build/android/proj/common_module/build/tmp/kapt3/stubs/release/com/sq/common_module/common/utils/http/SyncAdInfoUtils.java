package com.sq.common_module.common.utils.http;

import com.sq.common_module.common.bean.CheckRiskBean;
import com.sq.common_module.common.bean.ReportFlagBean;
import com.sq.common_module.common.repository.CommonRepository;
import com.sq.common_module.common.utils.kt.UserInfoManager;
import javax.inject.Inject;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by town
 * Date :  2022/11/22
 * Time : 15:01
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJA\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2#\b\u0004\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\b0\u000fH\u0086\b\u00f8\u0001\u0000J&\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\nJ6\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u0016Jk\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001e\u001a\u00020\u00162\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\'R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006("}, d2 = {"Lcom/sq/common_module/common/utils/http/SyncAdInfoUtils;", "", "commonRepository", "Lcom/sq/common_module/common/repository/CommonRepository;", "(Lcom/sq/common_module/common/repository/CommonRepository;)V", "getCommonRepository", "()Lcom/sq/common_module/common/repository/CommonRepository;", "appInfoLog", "", "scene", "", "des", "checkRisk", "tdBlackBox", "block", "Lkotlin/Function1;", "Lcom/sq/common_module/common/bean/CheckRiskBean;", "Lkotlin/ParameterName;", "name", "data", "loadAdFailLog", "adNetwork", "", "adUnitId", "errCode", "errMsg", "recordAdTrace", "transId", "adUnitType", "adSiteId", "status", "toSyncAdInfoServer", "adFrom", "adType", "ecpm", "activityName", "isClick", "isEnd", "slotId", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;)V", "common_module_release"})
public final class SyncAdInfoUtils {
    @org.jetbrains.annotations.NotNull
    private final com.sq.common_module.common.repository.CommonRepository commonRepository = null;
    
    @javax.inject.Inject
    public SyncAdInfoUtils(@org.jetbrains.annotations.NotNull
    com.sq.common_module.common.repository.CommonRepository commonRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.repository.CommonRepository getCommonRepository() {
        return null;
    }
    
    /**
     * 广告同步信息
     */
    public final void toSyncAdInfoServer(@org.jetbrains.annotations.NotNull
    java.lang.String transId, int adFrom, int adType, @org.jetbrains.annotations.NotNull
    java.lang.String ecpm, @org.jetbrains.annotations.NotNull
    java.lang.String activityName, int isClick, @org.jetbrains.annotations.NotNull
    java.lang.String adSiteId, @org.jetbrains.annotations.NotNull
    java.lang.String adUnitId, @org.jetbrains.annotations.Nullable
    java.lang.Integer isEnd, int status, @org.jetbrains.annotations.Nullable
    java.lang.String slotId) {
    }
    
    public final void loadAdFailLog(int adNetwork, @org.jetbrains.annotations.NotNull
    java.lang.String adUnitId, @org.jetbrains.annotations.NotNull
    java.lang.String errCode, @org.jetbrains.annotations.NotNull
    java.lang.String errMsg) {
    }
    
    public final void checkRisk(@org.jetbrains.annotations.NotNull
    java.lang.String tdBlackBox, @org.jetbrains.annotations.NotNull
    java.lang.String scene, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.sq.common_module.common.bean.CheckRiskBean, kotlin.Unit> block) {
    }
    
    public final void recordAdTrace(@org.jetbrains.annotations.NotNull
    java.lang.String transId, int adNetwork, @org.jetbrains.annotations.NotNull
    java.lang.String adUnitType, @org.jetbrains.annotations.NotNull
    java.lang.String adSiteId, @org.jetbrains.annotations.NotNull
    java.lang.String adUnitId, int status) {
    }
    
    public final void appInfoLog(@org.jetbrains.annotations.NotNull
    java.lang.String scene, @org.jetbrains.annotations.NotNull
    java.lang.String des) {
    }
}