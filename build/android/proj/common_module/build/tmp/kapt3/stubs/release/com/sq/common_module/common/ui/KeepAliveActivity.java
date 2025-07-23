package com.sq.common_module.common.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blankj.utilcode.util.ActivityUtils;
import com.blankj.utilcode.util.AppUtils;
import com.sq.common_module.R;
import com.sq.common_module.common.repository.CommonRepository;
import com.sq.common_module.common.utils.http.NetCallBack;
import com.sq.common_module.common.utils.java.L;
import com.sq.common_module.common.utils.kt.*;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;

/**
 * Created by town
 * Date :  2023/2/15
 * Time : 17:30
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0012\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0011H\u0014J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0019"}, d2 = {"Lcom/sq/common_module/common/ui/KeepAliveActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "animatorSet", "Landroid/animation/AnimatorSet;", "animatorSet1", "csKeep", "Landroidx/constraintlayout/widget/ConstraintLayout;", "mTranY", "", "repository", "Lcom/sq/common_module/common/repository/CommonRepository;", "getRepository", "()Lcom/sq/common_module/common/repository/CommonRepository;", "setRepository", "(Lcom/sq/common_module/common/repository/CommonRepository;)V", "handleResult", "", "actionType", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "postKeepLiveLog", "common_module_release"})
@dagger.hilt.android.AndroidEntryPoint
public final class KeepAliveActivity extends androidx.appcompat.app.AppCompatActivity {
    @javax.inject.Inject
    public com.sq.common_module.common.repository.CommonRepository repository;
    private android.animation.AnimatorSet animatorSet1;
    private android.animation.AnimatorSet animatorSet;
    private androidx.constraintlayout.widget.ConstraintLayout csKeep;
    private float mTranY = 0.0F;
    
    public KeepAliveActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.sq.common_module.common.repository.CommonRepository getRepository() {
        return null;
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull
    com.sq.common_module.common.repository.CommonRepository p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void postKeepLiveLog(int actionType) {
    }
    
    private final void handleResult(int actionType) {
    }
    
    @java.lang.Override
    protected void onDestroy() {
    }
}