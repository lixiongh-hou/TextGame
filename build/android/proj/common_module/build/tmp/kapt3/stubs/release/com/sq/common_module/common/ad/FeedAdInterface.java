package com.sq.common_module.common.ad;

import android.app.Activity;
import android.widget.FrameLayout;
import com.kwad.sdk.core.b.a.it;
import com.sq.common_module.common.pange.MyFeedAdUtils;
import com.sq.common_module.common.utils.HttpHeaderUtils;
import com.sq.common_module.common.utils.java.L;
import com.sq.common_module.common.utils.kt.UserInfoManager;
import javax.inject.Inject;

/**
 * Created by town
 * Date :  2022/11/15
 * Time : 16:52
 * 信息流广告统一处理
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/sq/common_module/common/ad/FeedAdInterface;", "", "closeFeedAd", "", "showAdBack", "loadSuccess", "", "common_module_release"})
public abstract interface FeedAdInterface {
    
    public abstract void showAdBack(boolean loadSuccess);
    
    public abstract void closeFeedAd();
    
    /**
     * Created by town
     * Date :  2022/11/15
     * Time : 16:52
     * 信息流广告统一处理
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        public static void closeFeedAd(@org.jetbrains.annotations.NotNull
        com.sq.common_module.common.ad.FeedAdInterface $this) {
        }
    }
}