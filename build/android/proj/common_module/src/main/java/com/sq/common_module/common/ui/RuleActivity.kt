package com.sq.common_module.common.ui

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.Window
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatTextView
import com.blankj.utilcode.util.ScreenUtils
import com.sq.common_module.R
import com.sq.common_module.common.utils.java.StatusBarUtil
import com.sq.common_module.common.utils.kt.singleClick


/**
 * Created by town
 * Date :  2023/2/8
 * Time : 16:57
 */
class RuleActivity : AppCompatActivity() {

    companion object {
        fun toRuleActivity(mContext: Context, title: String, rule: String) {
            val intent = Intent(mContext, RuleActivity::class.java)
            intent.putExtra("title", title)
            intent.putExtra("rule", rule)
            mContext.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rule)
//        requestWindowFeature(Window.FEATURE_NO_TITLE)
        ScreenUtils.setNonFullScreen(this)
        //设置标题栏背景颜色
        StatusBarUtil.setColor(this, Color.WHITE)
        StatusBarUtil.setDarkMode(this)
        ScreenUtils.setPortrait(this)
        findViewById<AppCompatTextView>(R.id.tv_rule).text = intent.getStringExtra("rule")
        findViewById<AppCompatTextView>(R.id.tv_title).text = intent.getStringExtra("title")
        findViewById<ImageButton>(R.id.btn_back).singleClick { finish() }
    }
}