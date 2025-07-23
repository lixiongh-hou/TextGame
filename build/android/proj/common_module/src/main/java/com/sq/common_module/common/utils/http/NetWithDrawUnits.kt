package com.sq.common_module.common.utils.http

import com.sq.common_module.common.bean.WfWithdrawBean
import com.sq.common_module.common.repository.CommonRepository
import com.sq.common_module.common.utils.kt.getDownTimer
import kotlinx.coroutines.flow.collect

/**
 * Created by Android Studio.
 * author: yhs
 * Date: 2023/9/8
 * Time: 10:49
 * 备注：
 */

//查询微分提现结果
inline fun queryWfWithdrawResult(
    thirdOrderId: String?,
    commonRepository: CommonRepository,
    crossinline block: (data: Int) -> Unit,
) {
    if (thirdOrderId == null || thirdOrderId.isEmpty()){
        block(-1)
        return
    }
    commonRepository.queryWfWithdrawResult(thirdOrderId!!)
        .handleRequest(null, object : NetCallBack<WfWithdrawBean> {
            override fun onSuccess(data: WfWithdrawBean?) {
                data?.let {
                    block(it.status)
                }
            }
        })
}