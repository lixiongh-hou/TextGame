package com.sq.common_module.common;

import android.animation.AnimatorSet;
import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Gravity;
import android.view.animation.Animation;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.SpanUtils;
import com.sq.common_module.R;
import com.sq.common_module.common.base.BaseDialogFragment;
import com.sq.common_module.common.event.AgreePrivacyEvent;
import com.sq.common_module.common.ui.BackAppDialogFragment;
import com.sq.common_module.common.utils.HttpHeaderUtils;
import com.sq.common_module.common.utils.UMConfigUtils;
import com.sq.common_module.common.utils.kt.*;
import com.sq.common_module.databinding.FragmentPrivacyAgreement1Binding;
import com.umeng.commonsdk.UMConfigure;
import dagger.hilt.android.AndroidEntryPoint;
import org.greenrobot.eventbus.EventBus;

/**
 * Created by town
 * Date :  2022/10/26
 * Time : 18:03
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0017J\b\u0010\n\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/sq/common_module/common/PrivacyAgreementDialogFragment;", "Lcom/sq/common_module/common/base/BaseDialogFragment;", "Lcom/sq/common_module/databinding/FragmentPrivacyAgreement1Binding;", "()V", "aniSet", "Landroid/animation/AnimatorSet;", "initClick", "", "initRequest", "initView", "onDestroy", "setLayout", "", "common_module_release"})
@dagger.hilt.android.AndroidEntryPoint
public final class PrivacyAgreementDialogFragment extends com.sq.common_module.common.base.BaseDialogFragment<com.sq.common_module.databinding.FragmentPrivacyAgreement1Binding> {
    private android.animation.AnimatorSet aniSet;
    
    public PrivacyAgreementDialogFragment() {
        super();
    }
    
    @java.lang.Override
    public int setLayout() {
        return 0;
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override
    public void initView() {
    }
    
    @java.lang.Override
    public void initRequest() {
    }
    
    @java.lang.Override
    public void initClick() {
    }
    
    @java.lang.Override
    public void onDestroy() {
    }
}