package com.sq.common_module.common.widget

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import com.sq.common_module.R
import androidx.core.content.withStyledAttributes

/**
 * Created by Android Studio.
 * author: yhs
 * Date: 2023/8/18
 * Time: 15:11
 * 备注：
 */
class CustomTabItem constructor(context: Context, attributeSet: AttributeSet) :
    RelativeLayout(context, attributeSet, 0) {
    init {
        val view = LayoutInflater.from(context).inflate(R.layout.layout_tab_item, this)

        val imageView = view.findViewById<AppCompatImageView>(R.id.img_tab)
        val textView = view.findViewById<AppCompatTextView>(R.id.tv_tab)

        context.withStyledAttributes(attributeSet, R.styleable.CustomTabItem) {
            imageView.setImageResource(getResourceId(R.styleable.CustomTabItem_tab_icon, 0))
            textView.setTextColor(getColorStateList(R.styleable.CustomTabItem_tab_text_color))
            textView.text = getString(R.styleable.CustomTabItem_tab_text)
        }
    }
}