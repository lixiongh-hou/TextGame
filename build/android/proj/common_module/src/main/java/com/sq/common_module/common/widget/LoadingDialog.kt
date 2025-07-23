package com.sq.common_module.common.widget

import android.content.Context
import androidx.appcompat.app.AlertDialog
import com.airbnb.lottie.LottieAnimationView
import com.sq.common_module.R
import com.sq.common_module.common.utils.kt.DialogUtils

/**
 * Created by town
 * Date :  2022/10/17
 * Time : 15:55
 */
open class LoadingDialog(mContext: Context) {
    private var mDialog: AlertDialog? = null
    private var mLoadingView: LottieAnimationView? = null

    init {
        mDialog =
            DialogUtils.createCommonDialog(mContext, R.layout.dialog_loading, R.style.customDialog2)
        mLoadingView = mDialog?.window?.findViewById(R.id.loading)
    }

    fun isShowing() = mDialog?.isShowing

    fun dismissDialog() {
        mLoadingView?.cancelAnimation()
        mDialog?.dismiss()
//        mLoadingView = null
//        mDialog = null
    }

    fun showDialog(){
        mLoadingView?.playAnimation()
        mDialog?.show()
    }

}

open class DrawLoadingDialog(mContext: Context) {
    private var mDialog: AlertDialog? = null
    private var mLoadingView: LottieAnimationView? = null

    init {
        mDialog =
            DialogUtils.createCommonDialog(
                mContext,
                R.layout.draw_dialog_loading,
                R.style.customDialog2
            )
        mLoadingView = mDialog?.window?.findViewById(R.id.loading)
    }

    fun dismissDialog() {
        mLoadingView?.cancelAnimation()
        mDialog?.dismiss()
        mLoadingView = null
        mDialog = null
    }
}

