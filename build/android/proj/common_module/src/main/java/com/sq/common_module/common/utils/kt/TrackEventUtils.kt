package com.sq.common_module.common.utils.kt

import com.sq.common_module.common.repository.CommonRepository
import com.sq.common_module.common.utils.HttpHeaderUtils
import com.sq.common_module.common.utils.http.NetCallBack
import com.sq.common_module.common.utils.http.handleRequest
import com.sq.common_module.common.utils.java.L
import javax.inject.Inject

/**
 * Created by lsy
 * Date : 2023/11/2
 * Desc : 埋点工具（object不了>_<）
 * @see TrackEventConst 事件
 */
class TrackEventUtils @Inject constructor(private val repository: CommonRepository) {

    private val callback by lazy {
        object : NetCallBack<List<String>> {
            override fun onSuccess(data: List<String>?) {
            }
        }
    }

    /**
     * 埋点
     */
    fun onEvent(event: String) {
        L.w("wolf", "onEvent $event")
        repository.userTrace(event).handleRequest(null, callback)
    }
}