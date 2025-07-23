package com.sq.common_module.common.utils

import android.speech.tts.TextToSpeech
import android.speech.tts.UtteranceProgressListener
import com.blankj.utilcode.util.Utils
import com.sq.common_module.common.utils.java.L
import java.util.*

/**
 * Created by lsy
 * Date : 2023/12/15
 * Desc : tts
 */
object TTSUtils : TextToSpeech.OnInitListener {
    private const val TAG = "wolf_tts"
    private val textToSpeech by lazy { TextToSpeech(Utils.getApp(), this) }

    /**
     * 加载慢，用的页面先调用一下
     */
    fun init() {
        textToSpeech
    }

    fun speak(text: String, listener: UtteranceProgressListener? = null) {
        textToSpeech.setOnUtteranceProgressListener(listener ?: object : UtteranceProgressListener() {
            override fun onStart(utteranceId: String?) {
                L.w("wolf", "onStart:$utteranceId")
            }

            override fun onDone(utteranceId: String?) {
                L.w("wolf", "onDone:$utteranceId")
            }

            override fun onError(utteranceId: String?) {
                L.w("wolf", "onError:$utteranceId")
            }

        })
        textToSpeech.speak(text, TextToSpeech.QUEUE_FLUSH, null, System.currentTimeMillis().toString())
    }

    fun stop() {
        textToSpeech.stop()
    }

    fun shutdown() {
        textToSpeech.shutdown()
    }

    override fun onInit(status: Int) {
        if (status == TextToSpeech.SUCCESS) {
            val languageCode = textToSpeech.setLanguage(Locale.CHINA)
            if (languageCode == TextToSpeech.LANG_MISSING_DATA || languageCode == TextToSpeech.LANG_NOT_SUPPORTED) {
                L.w(TAG, "语言不支持")
            }
            textToSpeech.setPitch(1.0f)
            textToSpeech.setSpeechRate(1.0f)
        } else {
            L.w(TAG, "初始化失败")
        }
    }
}