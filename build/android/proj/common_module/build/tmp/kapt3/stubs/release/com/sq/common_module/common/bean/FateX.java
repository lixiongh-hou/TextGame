package com.sq.common_module.common.bean;

import android.os.Parcelable;
import com.sq.common_module.R;
import kotlinx.parcelize.Parcelize;
import java.util.stream.DoubleStream;

/**
 * 'aries' => '白羊座'
 * 'taurus' => '金牛座'
 * 'gemini' => '双子座'
 * 'cancer' => '巨蟹座'
 * 'leo' => '狮子座'
 * 'virgo' => '处女座'
 * 'libra' => '天秤座'
 * 'scorpio' => '天蝎座'
 * 'sagittarius' => '射手座'
 * 'capricorn' => '摩羯座'
 * 'aquarius' => '水瓶座'
 * 'pisces' => '双鱼座'
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\'\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B}\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0002\u0010\u001aJ\u000b\u00103\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\u0099\u0001\u0010?\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u00c6\u0001J\u0013\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010C\u001a\u00020DH\u00d6\u0001J\t\u0010E\u001a\u00020FH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u00102\u00a8\u0006G"}, d2 = {"Lcom/sq/common_module/common/bean/FateX;", "", "aquarius", "Lcom/sq/common_module/common/bean/Aquarius;", "aries", "Lcom/sq/common_module/common/bean/Aries;", "cancer", "Lcom/sq/common_module/common/bean/Cancer;", "capricorn", "Lcom/sq/common_module/common/bean/Capricorn;", "gemini", "Lcom/sq/common_module/common/bean/Gemini;", "leo", "Lcom/sq/common_module/common/bean/Leo;", "libra", "Lcom/sq/common_module/common/bean/Libra;", "pisces", "Lcom/sq/common_module/common/bean/Pisces;", "sagittarius", "Lcom/sq/common_module/common/bean/Sagittarius;", "scorpio", "Lcom/sq/common_module/common/bean/Scorpio;", "taurus", "Lcom/sq/common_module/common/bean/Taurus;", "virgo", "Lcom/sq/common_module/common/bean/Virgo;", "(Lcom/sq/common_module/common/bean/Aquarius;Lcom/sq/common_module/common/bean/Aries;Lcom/sq/common_module/common/bean/Cancer;Lcom/sq/common_module/common/bean/Capricorn;Lcom/sq/common_module/common/bean/Gemini;Lcom/sq/common_module/common/bean/Leo;Lcom/sq/common_module/common/bean/Libra;Lcom/sq/common_module/common/bean/Pisces;Lcom/sq/common_module/common/bean/Sagittarius;Lcom/sq/common_module/common/bean/Scorpio;Lcom/sq/common_module/common/bean/Taurus;Lcom/sq/common_module/common/bean/Virgo;)V", "getAquarius", "()Lcom/sq/common_module/common/bean/Aquarius;", "getAries", "()Lcom/sq/common_module/common/bean/Aries;", "getCancer", "()Lcom/sq/common_module/common/bean/Cancer;", "getCapricorn", "()Lcom/sq/common_module/common/bean/Capricorn;", "getGemini", "()Lcom/sq/common_module/common/bean/Gemini;", "getLeo", "()Lcom/sq/common_module/common/bean/Leo;", "getLibra", "()Lcom/sq/common_module/common/bean/Libra;", "getPisces", "()Lcom/sq/common_module/common/bean/Pisces;", "getSagittarius", "()Lcom/sq/common_module/common/bean/Sagittarius;", "getScorpio", "()Lcom/sq/common_module/common/bean/Scorpio;", "getTaurus", "()Lcom/sq/common_module/common/bean/Taurus;", "getVirgo", "()Lcom/sq/common_module/common/bean/Virgo;", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_module_release"})
public final class FateX {
    @org.jetbrains.annotations.Nullable
    private final com.sq.common_module.common.bean.Aquarius aquarius = null;
    @org.jetbrains.annotations.Nullable
    private final com.sq.common_module.common.bean.Aries aries = null;
    @org.jetbrains.annotations.Nullable
    private final com.sq.common_module.common.bean.Cancer cancer = null;
    @org.jetbrains.annotations.Nullable
    private final com.sq.common_module.common.bean.Capricorn capricorn = null;
    @org.jetbrains.annotations.Nullable
    private final com.sq.common_module.common.bean.Gemini gemini = null;
    @org.jetbrains.annotations.Nullable
    private final com.sq.common_module.common.bean.Leo leo = null;
    @org.jetbrains.annotations.Nullable
    private final com.sq.common_module.common.bean.Libra libra = null;
    @org.jetbrains.annotations.Nullable
    private final com.sq.common_module.common.bean.Pisces pisces = null;
    @org.jetbrains.annotations.Nullable
    private final com.sq.common_module.common.bean.Sagittarius sagittarius = null;
    @org.jetbrains.annotations.Nullable
    private final com.sq.common_module.common.bean.Scorpio scorpio = null;
    @org.jetbrains.annotations.Nullable
    private final com.sq.common_module.common.bean.Taurus taurus = null;
    @org.jetbrains.annotations.Nullable
    private final com.sq.common_module.common.bean.Virgo virgo = null;
    
    /**
     * 'aries' => '白羊座'
     * 'taurus' => '金牛座'
     * 'gemini' => '双子座'
     * 'cancer' => '巨蟹座'
     * 'leo' => '狮子座'
     * 'virgo' => '处女座'
     * 'libra' => '天秤座'
     * 'scorpio' => '天蝎座'
     * 'sagittarius' => '射手座'
     * 'capricorn' => '摩羯座'
     * 'aquarius' => '水瓶座'
     * 'pisces' => '双鱼座'
     */
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.bean.FateX copy(@org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Aquarius aquarius, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Aries aries, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Cancer cancer, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Capricorn capricorn, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Gemini gemini, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Leo leo, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Libra libra, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Pisces pisces, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Sagittarius sagittarius, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Scorpio scorpio, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Taurus taurus, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Virgo virgo) {
        return null;
    }
    
    /**
     * 'aries' => '白羊座'
     * 'taurus' => '金牛座'
     * 'gemini' => '双子座'
     * 'cancer' => '巨蟹座'
     * 'leo' => '狮子座'
     * 'virgo' => '处女座'
     * 'libra' => '天秤座'
     * 'scorpio' => '天蝎座'
     * 'sagittarius' => '射手座'
     * 'capricorn' => '摩羯座'
     * 'aquarius' => '水瓶座'
     * 'pisces' => '双鱼座'
     */
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    /**
     * 'aries' => '白羊座'
     * 'taurus' => '金牛座'
     * 'gemini' => '双子座'
     * 'cancer' => '巨蟹座'
     * 'leo' => '狮子座'
     * 'virgo' => '处女座'
     * 'libra' => '天秤座'
     * 'scorpio' => '天蝎座'
     * 'sagittarius' => '射手座'
     * 'capricorn' => '摩羯座'
     * 'aquarius' => '水瓶座'
     * 'pisces' => '双鱼座'
     */
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    /**
     * 'aries' => '白羊座'
     * 'taurus' => '金牛座'
     * 'gemini' => '双子座'
     * 'cancer' => '巨蟹座'
     * 'leo' => '狮子座'
     * 'virgo' => '处女座'
     * 'libra' => '天秤座'
     * 'scorpio' => '天蝎座'
     * 'sagittarius' => '射手座'
     * 'capricorn' => '摩羯座'
     * 'aquarius' => '水瓶座'
     * 'pisces' => '双鱼座'
     */
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public FateX(@org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Aquarius aquarius, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Aries aries, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Cancer cancer, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Capricorn capricorn, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Gemini gemini, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Leo leo, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Libra libra, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Pisces pisces, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Sagittarius sagittarius, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Scorpio scorpio, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Taurus taurus, @org.jetbrains.annotations.Nullable
    com.sq.common_module.common.bean.Virgo virgo) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Aquarius component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Aquarius getAquarius() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Aries component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Aries getAries() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Cancer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Cancer getCancer() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Capricorn component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Capricorn getCapricorn() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Gemini component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Gemini getGemini() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Leo component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Leo getLeo() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Libra component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Libra getLibra() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Pisces component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Pisces getPisces() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Sagittarius component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Sagittarius getSagittarius() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Scorpio component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Scorpio getScorpio() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Taurus component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Taurus getTaurus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Virgo component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.sq.common_module.common.bean.Virgo getVirgo() {
        return null;
    }
}