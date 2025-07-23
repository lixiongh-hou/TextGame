package com.sq.common_module.common.utils.kt

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.alipay.sdk.auth.OpenAuthTask
import com.sq.common_module.common.utils.java.L
import com.tencent.mm.opensdk.openapi.IWXAPI
import com.tencent.mm.opensdk.openapi.WXAPIFactory
import java.lang.StringBuilder
import java.lang.ref.WeakReference
import java.util.HashMap
import com.tencent.mm.opensdk.constants.ConstantsAPI
import android.content.IntentFilter
import android.content.Intent
import android.content.BroadcastReceiver
import com.sq.common_module.common.utils.HttpHeaderUtils
import com.sq.common_module.common.widget.LoadingDialog


/**
 * Created by town
 * Date :  2023/2/8
 * Time : 10:55
 */


interface AliLoginListener {
    fun loginCallBack(authCode: String) {}
}

/**
 * 通用跳转授权业务 Demo
 */
fun openAliAuthScheme(
    view: View?,
    activity: AppCompatActivity,
    aliLoginListener: AliLoginListener
) {
    HttpHeaderUtils.isWxOrZfb = true
    val loadingDialog = LoadingDialog(activity)
    // 传递给支付宝应用的业务参数
    val bizParams: MutableMap<String, String> = HashMap()
    //2021003175683011
    //		bizParams.put("url", "alipays://platformapi/startapp?appId=60000157&appClearTop=false&startMultApp=YES&sign_params=biz_content%3D%257B%2522access_params%2522%253A%257B%2522channel%2522%253A%2522ALIPAYAPP%2522%257D%252C%2522external_agreement_no%2522%253A%2522shiyun20191231_08%2522%252C%2522external_logon_id%2522%253A%2522%25E5%25A4%2596%25E9%2583%25A8%25E7%2599%25BB%25E9%2599%2586%25E5%25A5%25BD%2522%252C%2522personal_product_code%2522%253A%2522GENERAL_WITHHOLDING_P%2522%252C%2522sign_scene%2522%253A%2522INDUSTRY%257CMULTI_MEDIA%2522%257D%26sign%3DFIQnneyCyigONOb1vZnBtTF7c80pUiETOvEL4GXbQOJNyysZ0EhjPhT1dGWLgsBYw5nCtKy1nw4Bt2st89LAsq9LB9gQ2%252FiRyYwWvKkfmhIZcMTv9WF198KNOOVhK5BsHlVXA5Q99NnzF5iFdPt7N%252BDpKlraohg8papDgiudimwd1B5ByA0UMWgEJKZxzkOy4m%252F0KGc5I3TuRynp3nbzRoFzrBJuqUzEjLwlDtf1%252Brxl%252BqNBgYvYSNgctm6fyNqP%252Bm%252FDoEYl6Nr9BfAaUyxcD60dBBhKXLqaN3B1fkq7C2p9JygV3IyZDh12bUIC6pAFdbPdYEsh5fVVpEPD79xD5A%253D%253D%26timestamp%3D2020-01-08%2B18%253A08%253A57%26sign_type%3DRSA2%26charset%3DUTF-8%26app_id%3D2017090501336035%26method%3Dalipay.user.agreement.page.sign%26version%3D1.0");
    bizParams["url"] =
        "https://authweb.alipay.com/auth?auth_type=PURE_OAUTH_SDK&app_id=${
            getMMKVString(
                UserInfoManager.ALI_APP_ID
            )
        }&scope=auth_user&state=init"

    // 支付宝回跳到你的应用时使用的 Intent Scheme。请设置为不和其它应用冲突的值。
    // 如果不设置，将无法使用 H5 中间页的方法(OpenAuthTask.execute() 的最后一个参数)回跳至
    // 你的应用。
    //
    // 参见 AndroidManifest 中 <AlipayResultActivity> 的 android:scheme，此两处
    // 必须设置为相同的值。
    val scheme = "__alipaysdkdemo__"

    // 防止在支付宝 App 被强行退出等情况下，OpenAuthTask.Callback 一定时间内无法释放导致
    // Activity 泄漏。
    val ctxRef: WeakReference<AppCompatActivity> = WeakReference(activity)
//OpenAuthTask.OK =  9000               - 调用成功
//OpenAuthTask.Duplex =  5000           -  3 s 内快速发起了多次支付 / 授权调用。稍后重试即可。
//OpenAuthTask.NOT_INSTALLED =  4001    - 用户未安装支付宝客户端。
//OpenAuthTask.SYS_ERR =  4000          - 其它错误，如参数传递错误。
    // 唤起授权业务
    val task = OpenAuthTask(activity)
    task.execute(
        scheme,  // Intent Scheme
        OpenAuthTask.BizType.AccountAuth,  // 业务类型
        bizParams,  // 业务参数
        { i, s, bundle ->
            val ref: Context? = ctxRef.get()
            if (ref != null) {
//                    com.alipay.sdk.pay.demo.PayDemoActivity.showAlert(
//                        ref,
//                        String.format(
//                            "结果码: %s\n结果信息: %s\n结果数据: %s",
//                            i,
//                            s,
//                            com.alipay.sdk.pay.demo.PayDemoActivity.bundleToString(bundle)
//                        )
//                    )
                L.i("wwb_ali", "$i---$s---${bundleToString(bundle)}")

                when (i) {
                    OpenAuthTask.OK -> {
//                        L.i("wwb_ali", bundle.getString("auth_code"))
                        aliLoginListener.loginCallBack(bundle.getString("auth_code", ""))
                    }
                    OpenAuthTask.NOT_INSTALLED -> {
                        "请您先安装支付宝".toast()
                        aliLoginListener.loginCallBack("")
                    }
                    else -> {
                        aliLoginListener.loginCallBack("")
                    }
                }
            }
        },  // 业务结果回调
        true
    ) // 是否需要在用户未安装支付宝 App 时，使用 H5 中间页中转
    loadingDialog.dismissDialog()
}

private fun bundleToString(bundle: Bundle?): String? {
    if (bundle == null) {
        return "null"
    }
    val sb = StringBuilder()
    for (key in bundle.keySet()) {
        sb.append(key).append("=>").append(bundle[key]).append("\n")
    }
    return sb.toString()
}


fun wxPayApi(activity: Context): IWXAPI {
    HttpHeaderUtils.isWxOrZfb = true
    val wxAppId = getMMKVString(UserInfoManager.WX_APP_ID)
    L.i("wwb_wx_pay_id", getMMKVString(UserInfoManager.WX_APP_ID))
    val createWXAPI = WXAPIFactory.createWXAPI(activity, wxAppId, false)
    val registerApp = createWXAPI?.registerApp(wxAppId)
    return createWXAPI
}