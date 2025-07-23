package com.sq.common_module.common.ui

import com.alibaba.android.arouter.facade.annotation.Route
import com.blankj.utilcode.util.AppUtils
import com.sq.common_module.R
import com.sq.common_module.common.base.BaseMVVMActivity
import com.sq.common_module.databinding.ActivityAboutUsBinding

/**
 * Created by town
 * Date :  2023/3/6
 * Time : 18:05
 */
@Route(path = "/audit/AboutUsActivity")
class AboutUsActivity : BaseMVVMActivity<ActivityAboutUsBinding>() {
    override fun setLayout(): Int = R.layout.activity_about_us

    override fun initView() {
        setTitle("关于我们")
        mBindView.tvContent.text = AppUtils.getAppName() + " " + AppUtils.getAppVersionName()
    }

    override fun initClick() {

    }

    override fun initRequest() {

    }

    override fun initLiveData() {

    }
}