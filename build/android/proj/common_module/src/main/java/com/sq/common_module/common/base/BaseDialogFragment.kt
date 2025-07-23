package com.sq.common_module.common.base

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentManager
import com.sq.common_module.R
import com.sq.common_module.common.utils.java.L
import com.sq.common_module.common.utils.kt.DialogUtils
import com.sq.common_module.databinding.FragmentBaseBinding

/**
 * Created by town
 * Date :  2022/10/21
 * Time : 17:06
 */
abstract class BaseDialogFragment<VDB : ViewDataBinding> : DialogFragment() {
    lateinit var mBaseBinding: FragmentBaseBinding
    lateinit var mBindView: VDB

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        DialogUtils.dialogList++
        mBaseBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_base, container, false)
        mBindView = DataBindingUtil.inflate(
            LayoutInflater.from(context),
            setLayout(),
            mBaseBinding.fragmentContainer,
            true
        )
        mBindView.lifecycleOwner = this
        initView()
        initClick()
        initRequest()
        isCancelable = false
        return mBaseBinding.root
    }

    abstract fun setLayout(): Int

    abstract fun initView()

    abstract fun initRequest()

    abstract fun initClick()

    override fun onDestroy() {
        super.onDestroy()
        DialogUtils.dialogList--
    }


//    override fun show(manager: FragmentManager, tag: String?) {
////        L.i("wwb_dialog", "show: ")
//        val mClass = DialogFragment::class.java
//        val dismissed = mClass.getDeclaredField("mDismissed")
//        dismissed.isAccessible = true
//        dismissed.set(this,false)
//        val shownByMe = mClass.getDeclaredField("mShownByMe")
//        shownByMe.isAccessible = true
//        shownByMe.set(this,true)
//        val ft = manager?.beginTransaction()
//        ft?.add(this, tag)
//        ft?.commitAllowingStateLoss()
////        //提前判断
//////注意这里是 FragmentManager#isStateSaved 不是 Fragment#isStateSaved，因为此时 FragmentManager 和 Fragment 还未关联起来，所以 Fragment#mFragmentManager 为 null
////        if (manager.isStateSaved) {
////            L.i("wwb_dialog", "show: 原本要抛异常")
////            return
////        }
////        super.show(manager, tag)
//    }

    override fun show(manager: FragmentManager, tag: String?) {
        try {
            manager.beginTransaction().remove(this).commit()
            super.show(manager, tag)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    override fun dismissAllowingStateLoss() {
        if (activity?.isFinishing == false) super.dismissAllowingStateLoss()
    }


}