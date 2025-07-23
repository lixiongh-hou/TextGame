package com.sq.common_module.common.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * Created by town
 * Date :  2023/4/17
 * Time : 15:42
 */
open class BaseViewModel : ViewModel() {
    val _loadDataFail = MutableLiveData(false)
    val loadDataFail = _loadDataFail
}