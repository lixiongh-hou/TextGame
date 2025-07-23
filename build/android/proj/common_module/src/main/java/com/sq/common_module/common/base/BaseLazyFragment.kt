package com.sq.common_module.common.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import com.sq.common_module.R
import com.sq.common_module.common.widget.LoadingDialog
import com.sq.common_module.databinding.FragmentBaseBinding

/**
 * Created by town
 * Date :  2022/10/13
 * Time : 11:19
 */
abstract class BaseLazyFragment<VDB : ViewDataBinding> : Fragment() {
    lateinit var mBindView: VDB
    lateinit var mBaseBinding: FragmentBaseBinding

    private var isLazyLoaded = false//懒加载过
    private var isPrepared = false
    private var isFirst = true
    private var mLoadingDialog: LoadingDialog? = null
    var mBtnLoadFail: AppCompatButton? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBaseBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_base, container, false)
        mBindView = DataBindingUtil.inflate(
            LayoutInflater.from(requireContext()),
            setLayout(),
            mBaseBinding.fragmentContainer,
            true
        )
        mBindView.lifecycleOwner = this
        mBaseBinding.fragmentContainer

        return mBaseBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        isPrepared = true
    }

    override fun onResume() {
        super.onResume()
//        initLoadData()
        if (userVisibleHint) {
            userVisibleHint = true
        }
    }

    override fun setUserVisibleHint(isVisibleToUser: Boolean) {
        super.setUserVisibleHint(isVisibleToUser)
        if (isVisibleToUser) {
            lazyLoad()
        }
    }

    protected open fun lazyLoad() {
        if (userVisibleHint) {
            if (!isFirst) {
                isNotFirst()
            } else {
                if (isPrepared && userVisibleHint && !isLazyLoaded) {
                    mBtnLoadFail = view?.findViewById(R.id.btn_load_fail)
                    initView()
                    initClick()
                    initLiveData()
                    initRequest()
                    isLazyLoaded = true
                    isFirst = false
                }
            }

        }
    }

    open fun isNotFirst() {

    }

    abstract fun setLayout(): Int

    abstract fun initView()

    abstract fun initClick()

    abstract fun initRequest()

    abstract fun initLiveData()


    override fun onDestroy() {
        super.onDestroy()
        isPrepared = false
        dismissDialog()
//        DisposeManager.getInstance().clearDisposable()
    }

    fun showLoadingDialog(): LoadingDialog? {
        mLoadingDialog = LoadingDialog(requireContext())
        return mLoadingDialog
    }

    fun dismissDialog() {
        mLoadingDialog?.dismissDialog()
    }
}