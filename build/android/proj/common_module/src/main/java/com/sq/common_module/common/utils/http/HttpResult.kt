package com.sq.common_module.common.utils.http

import java.io.IOException

class BaseResult< T>(
    val code: Int,
    var `data`: T,
    val msg: String
)

data class ErrorResult(
    val code: Int,
    val `data`: List<Any>,
    val msg: String
): IOException()