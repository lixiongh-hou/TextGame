package com.sq.common_module.common.utils.http

import java.io.IOException

data class BaseResult<T>(
    val code: Int = 0,
    val data: T? = null, // 可空类型以支持默认值
    val msg: String = "",
)

data class ErrorResult(
    val code: Int,
    val `data`: List<Any>,
    val msg: String,
) : IOException()