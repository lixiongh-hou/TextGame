package com.sq.common_module.common.utils.kt

import android.animation.*
import android.view.View

/**
 * Created by town
 * Date :  2022/9/1
 * Time : 16:12
 */
object AnimatorUtils {
    /**
     * 正面翻转
     */
    fun getRotationAnim(view: View): ObjectAnimator {
        return ObjectAnimator.ofFloat(view, "rotationY", 0f, 90f)
    }

    /**
     * 背面翻转
     */
    fun getRotationRevertAnim(view: View): ObjectAnimator {
        return ObjectAnimator.ofFloat(view, "rotationY", -90f, 0f)
    }

    /**
     * 旋转
     */
    fun getRotation(view: View): ObjectAnimator {
        return ObjectAnimator.ofFloat(view, "rotation", 0f, 720f)
    }

    /**
     * X轴平移回弹
     */
    fun getTranslationXAnimBack(view: View, tran: Float): ObjectAnimator {
        return ObjectAnimator.ofFloat(view, "translationX", 0f, tran, 0f)
    }

    /**
     * X轴平移
     */
    fun getTranslationXAnim(view: View, tran: Float): ObjectAnimator {
        return ObjectAnimator.ofFloat(view, "translationX", 0f, tran)
    }

    fun getTranslationXAnim(view: View, tranFrom: Float, tranEnd: Float): ObjectAnimator {
        return ObjectAnimator.ofFloat(view, "translationX", tranFrom, tranEnd)
    }

    /**
     * Y轴平移
     */
    fun getTranslationYAnim(view: View, tran: Float): ObjectAnimator {
        return ObjectAnimator.ofFloat(view, "translationY", 0f, tran)
    }

    fun getTranslationYAnim(view: View,tranFrom: Float, tranEnd: Float): ObjectAnimator {
        return ObjectAnimator.ofFloat(view, "translationY", tranFrom, tranEnd)
    }

    /**
     * Y轴平移回弹
     */
    fun getTranslationYAnimBack(view: View, tran: Float): ObjectAnimator {
        val objectAnimator = ObjectAnimator.ofFloat(view, "translationY", 0f, tran, 0f)
        objectAnimator.repeatCount = ValueAnimator.INFINITE
        return objectAnimator
    }

    /**
     * 放大
     */
    fun getScaleXAnim(view: View, scale: Float): ObjectAnimator =
        ObjectAnimator.ofFloat(view, "scaleX", 1f, scale)

    fun getScaleYAnim(view: View, scale: Float): ObjectAnimator =
        ObjectAnimator.ofFloat(view, "scaleY", 1f, scale)


    fun getScaleXBackAnim(view: View, scale: Float): ObjectAnimator =
        ObjectAnimator.ofFloat(view, "scaleX", 1f, scale, 1f)

    fun getScaleBackYAnim(view: View, scale: Float): ObjectAnimator =
        ObjectAnimator.ofFloat(view, "scaleY", 1f, scale, 1f)

    fun setAlphaVisibleAnim(view: View): ObjectAnimator =
        ObjectAnimator.ofFloat(view, "alpha", 0f, 1f)

    fun setAlphaGoneAnim(view: View): ObjectAnimator =
        ObjectAnimator.ofFloat(view, "alpha", 1f, 0f)

    fun setAlphaGoneAnim(view: View,start:Float = 1f,end:Float = 0f): ObjectAnimator =
        ObjectAnimator.ofFloat(view, "alpha", start, end)

    /**
     * 抖动动画
     */
    fun getShakeAnimator(view: View, f: Float): ObjectAnimator {
        val f2 = -3.0f * f
        val f3 = 3.0f * f
        return ObjectAnimator.ofPropertyValuesHolder(
            view,
//            PropertyValuesHolder.ofKeyframe(
//                View.SCALE_X,
//                Keyframe.ofFloat(0.0f, 1.0f),
//                Keyframe.ofFloat(0.1f, 0.9f),
//                Keyframe.ofFloat(0.2f, 0.9f),
//                Keyframe.ofFloat(0.3f, 1.1f),
//                Keyframe.ofFloat(0.4f, 1.1f),
//                Keyframe.ofFloat(0.5f, 1.1f),
//                Keyframe.ofFloat(0.6f, 1.1f),
//                Keyframe.ofFloat(0.7f, 1.1f),
//                Keyframe.ofFloat(0.8f, 1.1f),
//                Keyframe.ofFloat(0.9f, 1.1f),
//                Keyframe.ofFloat(1.0f, 1.0f)
//            ),
//            PropertyValuesHolder.ofKeyframe(
//                View.SCALE_Y,
//                Keyframe.ofFloat(0.0f, 1.0f),
//                Keyframe.ofFloat(0.1f, 0.9f),
//                Keyframe.ofFloat(0.2f, 0.9f),
//                Keyframe.ofFloat(0.3f, 1.1f),
//                Keyframe.ofFloat(0.4f, 1.1f),
//                Keyframe.ofFloat(0.5f, 1.1f),
//                Keyframe.ofFloat(0.6f, 1.1f),
//                Keyframe.ofFloat(0.7f, 1.1f),
//                Keyframe.ofFloat(0.8f, 1.1f),
//                Keyframe.ofFloat(0.9f, 1.1f),
//                Keyframe.ofFloat(1.0f, 1.0f)
//            ),
            PropertyValuesHolder.ofKeyframe(
                View.ROTATION,
                Keyframe.ofFloat(0.0f, 0.0f),
                Keyframe.ofFloat(0.1f, f2),
                Keyframe.ofFloat(0.2f, f2),
                Keyframe.ofFloat(0.3f, f3),
                Keyframe.ofFloat(0.4f, f2),
                Keyframe.ofFloat(0.5f, f3),
                Keyframe.ofFloat(0.6f, f2),
                Keyframe.ofFloat(0.7f, f3),
                Keyframe.ofFloat(0.8f, f2),
                Keyframe.ofFloat(0.9f, f3),
                Keyframe.ofFloat(1.0f, 0.0f)
            )
        ).setDuration(500L)
    }


    fun shakeAnimator2(view: View, f: Float): ObjectAnimator {
        val f2 = -8.0f * f
        val f3 = 8.0f * f
//        return ObjectAnimator.ofFloat(view, "rotation", f2, 0f, f3, 0f, f2).setDuration(800L)
        return ObjectAnimator.ofPropertyValuesHolder(
            view,
            PropertyValuesHolder.ofKeyframe(
                View.ROTATION,
                Keyframe.ofFloat(0.0f, 0f),
                Keyframe.ofFloat(0.1f, f2),
                Keyframe.ofFloat(0.2f, 0f),
                Keyframe.ofFloat(0.3f, f3),
                Keyframe.ofFloat(0.4f, 0f),
                Keyframe.ofFloat(0.5f, f2),
                Keyframe.ofFloat(0.6f, 0f),
                Keyframe.ofFloat(0.7f, f3),
                Keyframe.ofFloat(0.8f, 0f),
                Keyframe.ofFloat(0.9f, f2),
                Keyframe.ofFloat(1.0f, 0f)
            ), PropertyValuesHolder.ofKeyframe(
                View.TRANSLATION_Y,
                Keyframe.ofFloat(0.0f, 0f),
                Keyframe.ofFloat(0.1f, 2.5f),
                Keyframe.ofFloat(0.2f, 5f),
                Keyframe.ofFloat(0.3f, 5f),
                Keyframe.ofFloat(0.4f, 10f),
                Keyframe.ofFloat(0.4f, 10f),
                Keyframe.ofFloat(0.5f, 10f),
                Keyframe.ofFloat(0.6f, 10f),
                Keyframe.ofFloat(0.7f, 5f),
                Keyframe.ofFloat(0.8f, 5f),
                Keyframe.ofFloat(0.9f, 2.5f),
                Keyframe.ofFloat(1.0f, 0f),
                )
        )
    }
}


open class AnimatorListenerImpl : Animator.AnimatorListener {
    override fun onAnimationStart(p0: Animator) {

    }

    override fun onAnimationEnd(p0: Animator) {

    }

    override fun onAnimationCancel(p0: Animator) {

    }

    override fun onAnimationRepeat(p0: Animator) {

    }

}