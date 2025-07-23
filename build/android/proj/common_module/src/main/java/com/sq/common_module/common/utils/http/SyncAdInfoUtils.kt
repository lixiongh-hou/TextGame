package com.sq.common_module.common.utils.http


import com.sq.common_module.common.bean.CheckRiskBean
import com.sq.common_module.common.bean.ReportFlagBean
import com.sq.common_module.common.repository.CommonRepository
import com.sq.common_module.common.utils.kt.UserInfoManager

import com.sq.common_module.common.utils.kt.getMMKVString
import javax.inject.Inject
import org.json.JSONException

import org.json.JSONObject


/**
 * Created by town
 * Date :  2022/11/22
 * Time : 15:01
 */
class SyncAdInfoUtils @Inject constructor(val commonRepository: CommonRepository) {
    /**
     * 广告同步信息
     */
    fun toSyncAdInfoServer(
        transId: String,
        adFrom: Int,
        adType: Int,
        ecpm: String,
        activityName: String,
        isClick: Int,
        adSiteId: String,
        adUnitId: String,
        isEnd: Int? = null,
        status: Int,
        slotId: String? = null
    ) {
        commonRepository.syncAdInfo(
            transId,
            adFrom,
            adType,
            ecpm,
            activityName,
            isClick,
            adSiteId,
            adUnitId, isEnd, status, slotId
        )
            .handleRequest(null, object : NetCallBack<ReportFlagBean> {
                override fun onSuccess(data: ReportFlagBean?) {
                    data?.let {
                        val paramsObj = JSONObject()
                        try {
                            paramsObj.put("user_id", getMMKVString(UserInfoManager.USER_ID))
//                            paramsObj.put("key_int", 10)
                        } catch (e: JSONException) {
                            e.printStackTrace()
                        }
//                        if (it.keepFlag) {
//                            AppLog.onEventV3(GrownEventType.RETENTION_2D, paramsObj)
//                        }
//                        if (it.registerReportFlag) {
//                            AppLog.onEventV3(GrownEventType.REGISTER, paramsObj)
//                        }
//                        if (it.reportFlag) {
//                            AppLog.onEventV3(GrownEventType.CUSTOM_ACTIVITION, paramsObj)
//                        }
                    }
                }
            })
    }

    //上传请求广告失败信息
    fun loadAdFailLog(
        adNetwork: Int,
        adUnitId: String,
        errCode: String,
        errMsg: String
    ) {
        commonRepository.loadAdFailLog(adNetwork, adUnitId, errCode, errMsg)
            .handleRequest(null, object : NetCallBack<List<String>> {
                override fun onSuccess(data: List<String>?) {

                }
            })
    }


    //风控
    inline fun checkRisk(
        tdBlackBox: String,
        scene: String,
        crossinline block: (data: CheckRiskBean) -> Unit
    ) {
        commonRepository.checkRisk(tdBlackBox, scene)
            .handleRequest(null, object : NetCallBack<CheckRiskBean> {
                override fun onSuccess(data: CheckRiskBean?) {
                    data?.let {
//                        "风控类型${it.actionType}".toast()
                        block(it)
                    }
                }

            })
    }

    fun recordAdTrace(
        transId: String,
        adNetwork: Int,
        adUnitType: String,
        adSiteId: String,
        adUnitId: String,
        status: Int
    ) {
        commonRepository.recordAdTrace(transId, adNetwork, adUnitType, adSiteId, adUnitId, status)
            .handleRequest(null, object : NetCallBack<List<String>> {
                override fun onSuccess(data: List<String>?) {

                }
            })
    }

    fun appInfoLog(
        scene: String,
        des: String,
    ) {
        commonRepository.appInfoLog(scene, des)
            .handleRequest(null, object : NetCallBack<List<String>> {
                override fun onSuccess(data: List<String>?) {

                }
            })
    }
}