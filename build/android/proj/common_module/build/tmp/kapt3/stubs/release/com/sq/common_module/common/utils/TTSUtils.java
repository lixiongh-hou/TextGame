package com.sq.common_module.common.utils;

import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import com.blankj.utilcode.util.Utils;
import com.sq.common_module.common.utils.java.L;
import java.util.*;

/**
 * Created by lsy
 * Date : 2023/12/15
 * Desc : tts
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0006\u0010\u0010\u001a\u00020\fJ\u001a\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0006\u0010\u0015\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0016"}, d2 = {"Lcom/sq/common_module/common/utils/TTSUtils;", "Landroid/speech/tts/TextToSpeech$OnInitListener;", "()V", "TAG", "", "textToSpeech", "Landroid/speech/tts/TextToSpeech;", "getTextToSpeech", "()Landroid/speech/tts/TextToSpeech;", "textToSpeech$delegate", "Lkotlin/Lazy;", "init", "", "onInit", "status", "", "shutdown", "speak", "text", "listener", "Landroid/speech/tts/UtteranceProgressListener;", "stop", "common_module_release"})
public final class TTSUtils implements android.speech.tts.TextToSpeech.OnInitListener {
    @org.jetbrains.annotations.NotNull
    public static final com.sq.common_module.common.utils.TTSUtils INSTANCE = null;
    private static final java.lang.String TAG = "wolf_tts";
    private static final kotlin.Lazy textToSpeech$delegate = null;
    
    private TTSUtils() {
        super();
    }
    
    private final android.speech.tts.TextToSpeech getTextToSpeech() {
        return null;
    }
    
    /**
     * 加载慢，用的页面先调用一下
     */
    public final void init() {
    }
    
    public final void speak(@org.jetbrains.annotations.NotNull
    java.lang.String text, @org.jetbrains.annotations.Nullable
    android.speech.tts.UtteranceProgressListener listener) {
    }
    
    public final void stop() {
    }
    
    public final void shutdown() {
    }
    
    @java.lang.Override
    public void onInit(int status) {
    }
}