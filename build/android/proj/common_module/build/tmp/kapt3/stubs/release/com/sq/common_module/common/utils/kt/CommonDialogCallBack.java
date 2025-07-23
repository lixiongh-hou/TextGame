package com.sq.common_module.common.utils.kt;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.PermissionUtils;
import com.blankj.utilcode.util.Utils;
import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.hjq.toast.Toaster;
import com.sq.common_module.common.utils.HttpHeaderUtils;
import com.sq.common_module.common.utils.java.UIUtils;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import kotlinx.coroutines.DelicateCoroutinesApi;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.flow.Flow;
import okhttp3.RequestBody;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016\u00a8\u0006\u0005"}, d2 = {"Lcom/sq/common_module/common/utils/kt/CommonDialogCallBack;", "", "cancel", "", "confirm", "common_module_release"})
public abstract interface CommonDialogCallBack {
    
    public abstract void confirm();
    
    public abstract void cancel();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        public static void confirm(@org.jetbrains.annotations.NotNull
        com.sq.common_module.common.utils.kt.CommonDialogCallBack $this) {
        }
        
        public static void cancel(@org.jetbrains.annotations.NotNull
        com.sq.common_module.common.utils.kt.CommonDialogCallBack $this) {
        }
    }
}