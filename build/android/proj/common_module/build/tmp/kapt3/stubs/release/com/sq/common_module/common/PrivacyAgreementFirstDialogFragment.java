package com.sq.common_module.common;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Gravity;
import com.blankj.utilcode.util.SpanUtils;
import com.sq.common_module.R;
import com.sq.common_module.common.base.BaseDialogFragment;
import com.sq.common_module.common.event.AgreePrivacyEvent;
import com.sq.common_module.common.ui.BackAppDialogFragment;
import com.sq.common_module.common.utils.HttpHeaderUtils;
import com.sq.common_module.common.utils.UMConfigUtils;
import com.sq.common_module.common.utils.kt.*;
import com.sq.common_module.databinding.FragmentPrivacyAgreementFirstBinding;
import com.umeng.analytics.MobclickAgent;
import com.umeng.commonsdk.UMConfigure;
import dagger.hilt.android.AndroidEntryPoint;
import org.greenrobot.eventbus.EventBus;

/**
 * Created by town
 * Date :  2023/11/28
 * Time : 17:46
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\n"}, d2 = {"Lcom/sq/common_module/common/PrivacyAgreementFirstDialogFragment;", "Lcom/sq/common_module/common/base/BaseDialogFragment;", "Lcom/sq/common_module/databinding/FragmentPrivacyAgreementFirstBinding;", "()V", "initClick", "", "initRequest", "initView", "setLayout", "", "common_module_release"})
@dagger.hilt.android.AndroidEntryPoint
public final class PrivacyAgreementFirstDialogFragment extends com.sq.common_module.common.base.BaseDialogFragment<com.sq.common_module.databinding.FragmentPrivacyAgreementFirstBinding> {
    
    public PrivacyAgreementFirstDialogFragment() {
        super();
    }
    
    @java.lang.Override
    public int setLayout() {
        return 0;
    }
    
    @java.lang.Override
    public void initView() {
    }
    
    @java.lang.Override
    public void initRequest() {
    }
    
    @java.lang.Override
    public void initClick() {
    }
}