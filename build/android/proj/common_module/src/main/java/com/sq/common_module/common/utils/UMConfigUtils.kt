package com.sq.common_module.common.utils

import android.content.Context
import com.umeng.commonsdk.UMConfigure

/**
 * Created by town
 * Date :  2023/12/19
 * Time : 13:35
 */
object UMConfigUtils {
    var mUMInfoList = HashMap<String, String>()

    init {
        mUMInfoList["20001"] = "65812f4ca7208a5af189fdcd"
        mUMInfoList["20003"] = "65812f7e95b14f599d02c92a"
        mUMInfoList["20004"] = "65812f9895b14f599d02c92b"
        mUMInfoList["20006"] = "65812fb295b14f599d02c92c"
        mUMInfoList["20008"] = "65812fcd95b14f599d02c96c"
        mUMInfoList["20009"] = "6581302495b14f599d02c9ec"
        mUMInfoList["20010"] = "65813040a7208a5af189fec7"
        mUMInfoList["20011"] = "65813076a7208a5af189fedb"
        mUMInfoList["20012"] = "658131c4a7208a5af189ff9f"
        mUMInfoList["20019"] = "6581334da7208a5af18a00c1"
        mUMInfoList["20020"] = "65813365a7208a5af18a00c3"
        mUMInfoList["20023"] = "65813378a7208a5af18a00c5"
        mUMInfoList["20031"] = "65f2ca01cac2a664de0649a5"
        mUMInfoList["20044"] = "65fa86bd8d21b86a184368c3"
        mUMInfoList["20063"] = "65fa86bd8d21b86a184368c3"
        mUMInfoList["20015"] = "66120bd4cac2a664de148494"
    }

    fun getUMKey(): String? {
        return if (mUMInfoList.containsKey(HttpHeaderUtils.appCode)) {
            mUMInfoList[HttpHeaderUtils.appCode]
        } else ""
    }

    fun initUMSdk(context: Context, umengKey: String) {
        if (umengKey != "") {
            UMConfigure.init(
                context,
                umengKey,
                HttpHeaderUtils.channelCode,
                UMConfigure.DEVICE_TYPE_PHONE,
                ""
            )
        }
    }
    fun initUMSdk(context: Context) {
        if (getUMKey()!=""){
            UMConfigure.init(
                context,
                getUMKey(),
                HttpHeaderUtils.channelCode,
                UMConfigure.DEVICE_TYPE_PHONE,
                ""
            )
        }
    }

    fun submitPolicyGrantResult(context: Context?, grant: Boolean) {
        UMConfigure.submitPolicyGrantResult(context, grant)
    }
}