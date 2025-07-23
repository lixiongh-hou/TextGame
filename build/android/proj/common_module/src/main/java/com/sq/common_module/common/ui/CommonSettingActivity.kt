package com.sq.common_module.common.ui

import com.sq.common_module.R
import com.sq.common_module.common.base.BaseMVVMActivity
import com.sq.common_module.common.utils.kt.UserInfoManager
import com.sq.common_module.common.utils.kt.getMMKVBool
import com.sq.common_module.common.utils.kt.saveMMKVBool
import com.sq.common_module.databinding.ActivityCommonSettingBinding

/**
 * Created by town
 * Date :  2023/7/27
 * Time : 11:51
 */
class CommonSettingActivity : BaseMVVMActivity<ActivityCommonSettingBinding>() {
    private var falg = getMMKVBool(UserInfoManager.SPECIAL_REC)
    override fun setLayout(): Int = R.layout.activity_common_setting

    override fun initView() {
        setTitle("设置")
        if (falg) {
            mBindView.ivSwitch.setImageResource(R.drawable.img_privacy_personalization_on)
        } else {
            mBindView.ivSwitch.setImageResource(R.drawable.img_privacy_personalization_off)
        }
    }

    override fun initClick() {
        mBindView.ivSwitch.setOnClickListener {
            falg = if (falg) {
                mBindView.ivSwitch.setImageResource(R.drawable.img_privacy_personalization_off)
                false
            } else {
                mBindView.ivSwitch.setImageResource(R.drawable.img_privacy_personalization_on)
                true
            }
            falg.saveMMKVBool(UserInfoManager.SPECIAL_REC)
        }
    }

    override fun initRequest() {

    }

    override fun initLiveData() {

    }
}