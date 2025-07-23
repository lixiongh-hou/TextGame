package com.sq.common_module.common.utils.kt;

import android.os.Build;
import com.sq.common_module.common.utils.java.L;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

/**
 * Created by lsy
 * Date : 2023/10/9
 * Desc : root检测工具
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u0006\u0010\b\u001a\u00020\u0004\u00a8\u0006\t"}, d2 = {"Lcom/sq/common_module/common/utils/kt/RootUtils;", "", "()V", "checkBusyBox", "", "checkRootMethod3", "checkSU", "checkUnOfficial", "isRoot", "common_module_release"})
public final class RootUtils {
    @org.jetbrains.annotations.NotNull
    public static final com.sq.common_module.common.utils.kt.RootUtils INSTANCE = null;
    
    private RootUtils() {
        super();
    }
    
    public final boolean isRoot() {
        return false;
    }
    
    /**
     * 非正式发布版
     */
    private final boolean checkUnOfficial() {
        return false;
    }
    
    /**
     * su
     */
    private final boolean checkSU() {
        return false;
    }
    
    /**
     * BusyBox（xp）
     */
    private final boolean checkBusyBox() {
        return false;
    }
    
    /**
     * su run
     */
    private final boolean checkRootMethod3() {
        return false;
    }
}