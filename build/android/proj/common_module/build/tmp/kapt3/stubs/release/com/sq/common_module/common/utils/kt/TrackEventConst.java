package com.sq.common_module.common.utils.kt;

import java.lang.System;

/**
 * Created by lsy
 * Date : 2023/11/3
 * Desc : 埋点事件&构建工具
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0019R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/sq/common_module/common/utils/kt/TrackEventConst;", "", "()V", "E_CONNECT_WIFI", "", "E_CONNECT_WIFI_AD", "E_ENTRY_WIFI_PAGE", "E_GUIDE_ACC", "E_GUIDE_ACC_5G_1", "E_GUIDE_ACC_5G_2", "E_GUIDE_ACC_5G_3", "E_GUIDE_ACC_5G_4", "E_GUIDE_ACC_RESULT", "E_GUIDE_ACC_RESULT_ITEM", "E_GUIDE_ACC_RESULT_ITEM_HOME", "E_GUIDE_ACC_WIFI_1", "E_GUIDE_ACC_WIFI_2", "E_GUIDE_ACC_WIFI_3", "E_GUIDE_ACC_WIFI_4", "E_NETWORK_SPEED_UP_PAGE", "E_OPEN_SCREEN", "E_OPEN_SCREEN_AD", "E_UNDEFINED", "build4ItemConst", "isWifi", "", "pos", "", "isPre", "common_module_release"})
public final class TrackEventConst {
    @org.jetbrains.annotations.NotNull
    public static final com.sq.common_module.common.utils.kt.TrackEventConst INSTANCE = null;
    
    /**
     * 未定义 占位符
     */
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String E_UNDEFINED = "undefined";
    
    /**
     * 开屏
     */
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String E_OPEN_SCREEN = "openScreen";
    
    /**
     * 开屏广告
     */
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String E_OPEN_SCREEN_AD = "openScreenAd";
    
    /**
     * 加速页面
     */
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String E_GUIDE_ACC = "networkSpeedUpPage";
    
    /**
     * 加速-加速结果页面
     */
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String E_GUIDE_ACC_RESULT = "networkSpeedUpFinishPage";
    
    /**
     * 加速-加速结果-4项页面
     */
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String E_GUIDE_ACC_RESULT_ITEM = "networkSpeedUpListPage";
    
    /**
     * 加速-加速结果-4项-首页
     */
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String E_GUIDE_ACC_RESULT_ITEM_HOME = "home";
    
    /**
     * 4项-wifi-防蹭保护
     */
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String E_GUIDE_ACC_WIFI_1 = "wifiPreventNetwork";
    
    /**
     * 4项-wifi-信号加强
     */
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String E_GUIDE_ACC_WIFI_2 = "wifiEnhancedSignal";
    
    /**
     * 4项-wifi-网络加固
     */
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String E_GUIDE_ACC_WIFI_3 = "wifiStrengthNetwork";
    
    /**
     * 4项-wifi-WIFI卫士
     */
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String E_GUIDE_ACC_WIFI_4 = "wifiGuard";
    
    /**
     * 4项-5g-流量保护
     */
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String E_GUIDE_ACC_5G_1 = "wifiFlowProtection";
    
    /**
     * 4项-5g-防蹭保护
     */
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String E_GUIDE_ACC_5G_2 = "wifiPreventNetwork";
    
    /**
     * 4项-5g-系统网络
     */
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String E_GUIDE_ACC_5G_3 = "wifiSystemNetwork";
    
    /**
     * 4项-5g-WIFI卫士
     */
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String E_GUIDE_ACC_5G_4 = "wifiGuard";
    
    /**
     * 链接wifi
     */
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String E_CONNECT_WIFI = "ConnectWifi";
    
    /**
     * 链接wifi-ad
     */
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String E_CONNECT_WIFI_AD = "ConnectWifiAd";
    
    /**
     * wifi tab
     */
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String E_ENTRY_WIFI_PAGE = "entryWifiPage";
    
    /**
     * 加速页面视频
     */
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String E_NETWORK_SPEED_UP_PAGE = "networkSpeedUpPage";
    
    private TrackEventConst() {
        super();
    }
    
    /**
     * 构建4项事件
     * @param isWifi wifi or 5g
     * @param pos item pos
     * @param isPre start or end
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String build4ItemConst(boolean isWifi, int pos, boolean isPre) {
        return null;
    }
}