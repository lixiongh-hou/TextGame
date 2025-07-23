package com.sq.common_module.common.bean;

import java.lang.System;

/**
 * create by apple on 2024/7/2 09:24
 * 说明：
 * 0-非会员，
 * 1-月费会员，
 * 3-年费会员，
 * 4-终身会员,
 * 6-周会员
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b4\b\u0086\b\u0018\u00002\u00020\u0001:\u0001FB\u0093\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0019J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\u000fH\u00c6\u0003J\t\u00102\u001a\u00020\u0006H\u00c6\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u00c6\u0003J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\u000fH\u00c6\u0003J\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\t\u00107\u001a\u00020\u0006H\u00c6\u0003J\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\t\u00109\u001a\u00020\u0003H\u00c6\u0003J\t\u0010:\u001a\u00020\u0006H\u00c6\u0003J\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\t\u0010=\u001a\u00020\u0006H\u00c6\u0003J\t\u0010>\u001a\u00020\u0006H\u00c6\u0003J\t\u0010?\u001a\u00020\fH\u00c6\u0003J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\u00b9\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00062\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010B\u001a\u00020\u00062\b\u0010C\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010D\u001a\u00020\u000fH\u00d6\u0001J\t\u0010E\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0018\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u001d\"\u0004\b#\u0010$R\u0011\u0010\u0017\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u001dR\u001a\u0010\u0010\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u001d\"\u0004\b%\u0010$R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0016\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001fR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001fR\u0011\u0010\u0015\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010)R\u0011\u0010\n\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001d\u00a8\u0006G"}, d2 = {"Lcom/sq/common_module/common/bean/UseVipBean;", "", "avatar", "", "defaultPayMode", "isBindPhone", "", "phone", "defaultPayType", "alipayStatus", "wechatStatus", "alipayReduction", "", "pwd", "uid", "", "isVip", "vipInfo", "", "Lcom/sq/common_module/common/bean/UseVipBean$VipInfo;", "vipTimeStr", "vipType", "vipDesc", "isNeedLogin", "customerServiceUrl", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZDLjava/lang/String;IZLjava/util/List;Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;)V", "getAlipayReduction", "()D", "getAlipayStatus", "()Z", "getAvatar", "()Ljava/lang/String;", "getCustomerServiceUrl", "getDefaultPayMode", "getDefaultPayType", "setBindPhone", "(Z)V", "setVip", "getPhone", "getPwd", "getUid", "()I", "getVipDesc", "getVipInfo", "()Ljava/util/List;", "getVipTimeStr", "getVipType", "getWechatStatus", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "VipInfo", "common_module_release"})
public final class UseVipBean {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String avatar = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String defaultPayMode = null;
    private boolean isBindPhone;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String phone = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String defaultPayType = null;
    private final boolean alipayStatus = false;
    private final boolean wechatStatus = false;
    private final double alipayReduction = 0.0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String pwd = null;
    private final int uid = 0;
    private boolean isVip;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.sq.common_module.common.bean.UseVipBean.VipInfo> vipInfo = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String vipTimeStr = null;
    private final int vipType = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String vipDesc = null;
    private final boolean isNeedLogin = false;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String customerServiceUrl = null;
    
    /**
     * create by apple on 2024/7/2 09:24
     * 说明：
     * 0-非会员，
     * 1-月费会员，
     * 3-年费会员，
     * 4-终身会员,
     * 6-周会员
     */
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.UseVipBean copy(@org.jetbrains.annotations.NotNull
    java.lang.String avatar, @org.jetbrains.annotations.NotNull
    java.lang.String defaultPayMode, boolean isBindPhone, @org.jetbrains.annotations.NotNull
    java.lang.String phone, @org.jetbrains.annotations.NotNull
    java.lang.String defaultPayType, boolean alipayStatus, boolean wechatStatus, double alipayReduction, @org.jetbrains.annotations.NotNull
    java.lang.String pwd, int uid, boolean isVip, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.UseVipBean.VipInfo> vipInfo, @org.jetbrains.annotations.NotNull
    java.lang.String vipTimeStr, int vipType, @org.jetbrains.annotations.NotNull
    java.lang.String vipDesc, boolean isNeedLogin, @org.jetbrains.annotations.NotNull
    java.lang.String customerServiceUrl) {
        return null;
    }
    
    /**
     * create by apple on 2024/7/2 09:24
     * 说明：
     * 0-非会员，
     * 1-月费会员，
     * 3-年费会员，
     * 4-终身会员,
     * 6-周会员
     */
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    /**
     * create by apple on 2024/7/2 09:24
     * 说明：
     * 0-非会员，
     * 1-月费会员，
     * 3-年费会员，
     * 4-终身会员,
     * 6-周会员
     */
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    /**
     * create by apple on 2024/7/2 09:24
     * 说明：
     * 0-非会员，
     * 1-月费会员，
     * 3-年费会员，
     * 4-终身会员,
     * 6-周会员
     */
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public UseVipBean(@org.jetbrains.annotations.NotNull
    java.lang.String avatar, @org.jetbrains.annotations.NotNull
    java.lang.String defaultPayMode, boolean isBindPhone, @org.jetbrains.annotations.NotNull
    java.lang.String phone, @org.jetbrains.annotations.NotNull
    java.lang.String defaultPayType, boolean alipayStatus, boolean wechatStatus, double alipayReduction, @org.jetbrains.annotations.NotNull
    java.lang.String pwd, int uid, boolean isVip, @org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.UseVipBean.VipInfo> vipInfo, @org.jetbrains.annotations.NotNull
    java.lang.String vipTimeStr, int vipType, @org.jetbrains.annotations.NotNull
    java.lang.String vipDesc, boolean isNeedLogin, @org.jetbrains.annotations.NotNull
    java.lang.String customerServiceUrl) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAvatar() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDefaultPayMode() {
        return null;
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean isBindPhone() {
        return false;
    }
    
    public final void setBindPhone(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPhone() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDefaultPayType() {
        return null;
    }
    
    public final boolean component6() {
        return false;
    }
    
    public final boolean getAlipayStatus() {
        return false;
    }
    
    public final boolean component7() {
        return false;
    }
    
    public final boolean getWechatStatus() {
        return false;
    }
    
    public final double component8() {
        return 0.0;
    }
    
    public final double getAlipayReduction() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPwd() {
        return null;
    }
    
    public final int component10() {
        return 0;
    }
    
    public final int getUid() {
        return 0;
    }
    
    public final boolean component11() {
        return false;
    }
    
    public final boolean isVip() {
        return false;
    }
    
    public final void setVip(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.UseVipBean.VipInfo> component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.sq.common_module.common.bean.UseVipBean.VipInfo> getVipInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getVipTimeStr() {
        return null;
    }
    
    public final int component14() {
        return 0;
    }
    
    public final int getVipType() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getVipDesc() {
        return null;
    }
    
    public final boolean component16() {
        return false;
    }
    
    public final boolean isNeedLogin() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCustomerServiceUrl() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f\u00a8\u0006\u001f"}, d2 = {"Lcom/sq/common_module/common/bean/UseVipBean$VipInfo;", "", "id", "", "name", "", "originPrice", "price", "tag", "type", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getId", "()I", "getName", "()Ljava/lang/String;", "getOriginPrice", "getPrice", "getTag", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "common_module_release"})
    public static final class VipInfo {
        private final int id = 0;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String name = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String originPrice = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String price = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String tag = null;
        private final int type = 0;
        
        @org.jetbrains.annotations.NotNull
        public final com.sq.common_module.common.bean.UseVipBean.VipInfo copy(int id, @org.jetbrains.annotations.NotNull
        java.lang.String name, @org.jetbrains.annotations.NotNull
        java.lang.String originPrice, @org.jetbrains.annotations.NotNull
        java.lang.String price, @org.jetbrains.annotations.NotNull
        java.lang.String tag, int type) {
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
        
        public VipInfo(int id, @org.jetbrains.annotations.NotNull
        java.lang.String name, @org.jetbrains.annotations.NotNull
        java.lang.String originPrice, @org.jetbrains.annotations.NotNull
        java.lang.String price, @org.jetbrains.annotations.NotNull
        java.lang.String tag, int type) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getOriginPrice() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getPrice() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getTag() {
            return null;
        }
        
        public final int component6() {
            return 0;
        }
        
        public final int getType() {
            return 0;
        }
    }
}