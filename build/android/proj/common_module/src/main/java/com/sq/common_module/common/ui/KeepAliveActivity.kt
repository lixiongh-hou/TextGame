package com.sq.common_module.common.ui

import android.animation.Animator
import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatImageView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.lifecycle.lifecycleScope
import com.blankj.utilcode.util.ActivityUtils
import com.blankj.utilcode.util.AppUtils
import com.sq.common_module.R
import com.sq.common_module.common.repository.CommonRepository
import com.sq.common_module.common.utils.http.NetCallBack
import com.sq.common_module.common.utils.http.handleRequest
import com.sq.common_module.common.utils.java.L
import com.sq.common_module.common.utils.kt.*
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

//import com.sq.common_module.databinding.ActivityKeepAliveBinding

/**
 * Created by town
 * Date :  2023/2/15
 * Time : 17:30
 */
@AndroidEntryPoint
class KeepAliveActivity : AppCompatActivity() {
    @Inject
    lateinit var repository: CommonRepository
    private var animatorSet1: AnimatorSet? = null
    private var animatorSet: AnimatorSet? = null
    private var csKeep: ConstraintLayout? = null
    private var mTranY = 0f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_keep_alive)

        false.saveMMKVBool(UserInfoManager.IS_STARTING_ALIVE)
        csKeep = findViewById(R.id.cs_alive)
        animatorSet = AnimatorSet()
        animatorSet1 = AnimatorSet()
        animatorSet?.run {
            duration = 2000
            csKeep?.post {
                play(csKeep.let {
                    csKeep?.y?.let { y ->
                        L.i("wwb_life", y.toString())
                        mTranY = -y
                        ObjectAnimator.ofFloat(it, "translationY", 0f, -y)
                    }
                })
                start()
            }
        }

        animatorSet1?.run {
            duration = 1000
            csKeep?.post {
                play(csKeep.let {
                    csKeep?.y?.let { y ->
                        L.i("wwb_life", y.toString())
                        ObjectAnimator.ofFloat(it, "translationY", -y, 0f)
                    }
                })
            }
        }
        animatorSet1?.addListener(object :AnimatorListenerImpl(){

            override fun onAnimationStart(animation: Animator) {
            }

            override fun onAnimationEnd(p0: Animator) {
                super.onAnimationEnd(p0)
                finish()
            }

            override fun onAnimationCancel(animation: Animator) {

            }

            override fun onAnimationRepeat(animation: Animator) {
            }
        })
//        supportActionBar
//        actionBar!!.hide()
        postKeepLiveLog(1)
        findViewById<AppCompatImageView>(R.id.iv_close).singleClick {
            postKeepLiveLog(3)
//            Process.killProcess(Process.myPid())
//            System.exit(0)
        }

        findViewById<AppCompatImageView>(R.id.iv_confirm).singleClick {
            postKeepLiveLog(2)
        }
    }


    private fun postKeepLiveLog(actionType: Int) {
        repository.keepAliveLog(actionType).handleRequest(null, object : NetCallBack<List<String>> {
            override fun onSuccess(data: List<String>?) {
                handleResult(actionType)
            }

            override fun onFail(e: Throwable?) {
                handleResult(actionType)
            }
        })
    }


    private fun handleResult(actionType: Int) {
        when (actionType) {
            1 -> {
                lifecycleScope.launch {
                    getDownTimer(10).collect {
                        if (it == 0) {
                            animatorSet1?.start()
                        }
                    }
                }
            }
            2 -> {
                AppUtils.relaunchApp()
                finish()

            }
            3 -> {
                finish()
                ActivityUtils.finishAllActivities()
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        animatorSet?.cancel()
        animatorSet = null
        animatorSet1?.cancel()
        animatorSet1 = null
    }
}