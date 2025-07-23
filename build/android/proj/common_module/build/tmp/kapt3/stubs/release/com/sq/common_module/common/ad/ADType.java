package com.sq.common_module.common.ad;

import com.sq.common_module.common.utils.kt.UserInfoManager;
import java.util.*;

/**
 * Created by town
 * Date :  2022/11/22
 * Time : 15:40
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/sq/common_module/common/ad/ADType;", "", "()V", "FEED_LIST_AD", "", "FULL_AD", "REWARD_AD", "SPLASH_AD", "common_module_release"})
public final class ADType {
    @org.jetbrains.annotations.NotNull
    public static final com.sq.common_module.common.ad.ADType INSTANCE = null;
    public static final int SPLASH_AD = 0;
    public static final int FEED_LIST_AD = 1;
    public static final int FULL_AD = 2;
    public static final int REWARD_AD = 3;
    
    private ADType() {
        super();
    }
}