package com.sq.common_module.common.net.model

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.scopeNetLife
import com.alibaba.fastjson.JSON
import com.drake.net.Post
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.JsonParser
import com.google.gson.JsonSyntaxException
import com.sq.common_module.common.net.bean.Bean
import com.sq.common_module.common.net.bean.LoginBean
import org.json.JSONObject

class CocosViewModel : ViewModel() {
    private val _initData = MutableLiveData<LoginBean>()
    val initData = _initData

    fun a() = scopeNetLife {
        try {
            // 从网络获取JSON字符串
            val str = Post<String>("v1/login/submit").await()
            Log.e("测试11111", "原始JSON: ${str.replace("\n", "")}")

            LoginBean()
//            val loginBean = parseJson(str)

            val loginBean = Gson().fromJson(str, LoginBean::class.java)

            // 更新数据
            initData.value = loginBean
        } catch (e: JsonSyntaxException) {
            Log.e("JSON解析错误", "无效的JSON格式: ${e.message}")
            e.printStackTrace()
        } catch (e: Exception) {
            Log.e("其他错误", "处理JSON时出错: ${e.message}")
            e.printStackTrace()
        }

//        try {
//            Bean()
//
////            val a = Gson().toJson(string)
//            val a = "{a:1}"
//
//            val bean = Gson().fromJson(a, Bean::class.java)
//
//            Log.e("测试33333", "反序列化成功: ${bean.a}")
//
//            initData.value = LoginBean()
//        } catch (e: Exception) {
//            Log.e("其他错误", "处理JSON时出错: ${e.message}")
//            e.printStackTrace()
//        }

    }.catch {
        it.printStackTrace()
    }.finally {

    }

    private fun parseJson(jsonString: String): LoginBean? {
        try {
            val jsonObject = JSONObject(jsonString)
            val code = jsonObject.getInt("code")
            val msg = jsonObject.getString("msg")

            val dataObject = jsonObject.getJSONObject("data")
            val uid = dataObject.getString("uid")
            val token = dataObject.getString("token")
            val isCreatedOver24Hours = dataObject.getBoolean("isCreatedOver24Hours")
            val weatherFocus = dataObject.getInt("weatherFocus")

            val userData = LoginBean.DataBean()
            userData.uid = uid
            userData.token = token
            userData.isIsCreatedOver24Hours = isCreatedOver24Hours
            userData.weatherFocus = weatherFocus

            val bean = LoginBean()
            bean.code = code
            bean.msg = msg
            bean.data = userData
            return bean
        } catch (e: Exception) {
            e.printStackTrace()
            return null
        }
    }
}