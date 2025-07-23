package com.sq.common_module.common.utils.kt

import android.content.Context
import android.view.WindowManager
import androidx.annotation.StyleRes
import androidx.appcompat.app.AlertDialog
import com.sq.common_module.R


/**
 * Created by town
 * Date :  2022/10/17
 * Time : 15:34
 */
object DialogUtils {

    var dialogList = 0


    fun createCommonDialog(
        mContext: Context,
        layout: Int,
        @StyleRes themeResId: Int? = R.style.customDialog
    ): AlertDialog {
        val alertDialog = AlertDialog.Builder(mContext, themeResId!!).create()
        alertDialog.show()
        return alertDialog.apply {
            window?.setContentView(layout)
            setCancelable(false)
            setCanceledOnTouchOutside(false)
            window?.apply {
                val lp = attributes // 获取对话框当前的参数值
                lp.width = mContext.resources.displayMetrics.widthPixels // 宽度
                lp.height = WindowManager.LayoutParams.WRAP_CONTENT // 高度
                attributes = lp
            }
        }
    }
}