package com.sq.common_module.common.widget

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Color
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.sq.common_module.R
import com.sq.common_module.common.utils.kt.singleClick

/**
 * Created by Android Studio.
 * author: yhs
 * Date: 2023/9/18
 * Time: 10:37
 * 备注：
 */
class CustomNavView constructor(context: Context, attributeSet: AttributeSet) :
    ConstraintLayout(context, attributeSet, 0) {

    private var navBtn:AppCompatImageView
    init {
        val view = LayoutInflater.from(context).inflate(R.layout.layout_nav_view, this)

        navBtn = view.findViewById<AppCompatImageView>(R.id.btn_back)
        val textView = view.findViewById<AppCompatTextView>(R.id.title_label)
//
        val obtain = context.obtainStyledAttributes(attributeSet, R.styleable.CustomNavView)
        textView.text = obtain.getString(R.styleable.CustomNavView_nav_text)
        val isWhite = obtain.getBoolean(R.styleable.CustomNavView_nav_is_white,true)
        if (isWhite){
            navBtn.setImageResource(R.drawable.ic_white_back)
            textView.setTextColor(Color.parseColor("#FFFFFF"))
        }else{
            navBtn.setImageResource(R.drawable.img_return_back)
            textView.setTextColor(Color.parseColor("#000000"))
        }
        obtain.recycle()
    }

    fun initClick(block:()->Unit){
        navBtn.singleClick {
            block.invoke()
        }
    }
}