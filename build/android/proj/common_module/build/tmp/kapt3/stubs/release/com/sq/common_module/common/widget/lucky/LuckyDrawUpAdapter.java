package com.sq.common_module.common.widget.lucky;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sq.common_module.R;
import com.sq.common_module.common.bean.NineGridPrizeBean;
import com.sq.common_module.common.utils.java.L;

/**
 * @Author zlm
 * @Date 2020-11-26 15:52
 * @Desc 抽奖转盘的适配器
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001*B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\nH\u0016J\u001c\u0010\u0015\u001a\u00020\u00162\n\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\nH\u0016J\u001c\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\nH\u0016J\u0010\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\nH\u0002J\u001e\u0010\u001f\u001a\u00020\u00162\u0016\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`!J\u0014\u0010\"\u001a\u00020\u00162\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0$J\u000e\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\fJ\u000e\u0010\'\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\nJ\u000e\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\nR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/sq/common_module/common/widget/lucky/LuckyDrawUpAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/sq/common_module/common/widget/lucky/LuckyDrawUpAdapter$LuckyDrawItem;", "()V", "mDataListArr", "Ljava/util/ArrayList;", "Lcom/sq/common_module/common/widget/lucky/LuckyDrawUpView$LuckyDataBean;", "mList", "Lcom/sq/common_module/common/bean/NineGridPrizeBean;", "mType", "", "onClick", "Lcom/sq/common_module/common/widget/lucky/LuckyDrawUpView$DrawClickListener;", "posMap", "", "getPosMap", "()Ljava/util/Map;", "setPosMap", "(Ljava/util/Map;)V", "selectPosition", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "reversePosition", "selectPos", "setDataArr", "arr", "Lkotlin/collections/ArrayList;", "setDataList", "list", "", "setOnDrawClickListener", "click", "setSelectionPosition", "setType", "type", "LuckyDrawItem", "common_module_release"})
public final class LuckyDrawUpAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.sq.common_module.common.widget.lucky.LuckyDrawUpAdapter.LuckyDrawItem> {
    private com.sq.common_module.common.widget.lucky.LuckyDrawUpView.DrawClickListener onClick;
    private int mType = 1;
    private java.util.ArrayList<com.sq.common_module.common.widget.lucky.LuckyDrawUpView.LuckyDataBean> mDataListArr;
    @org.jetbrains.annotations.NotNull
    private java.util.Map<java.lang.Integer, java.lang.Integer> posMap;
    private int selectPosition = -1;
    private java.util.ArrayList<com.sq.common_module.common.bean.NineGridPrizeBean> mList;
    
    public LuckyDrawUpAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.Integer, java.lang.Integer> getPosMap() {
        return null;
    }
    
    public final void setPosMap(@org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.Integer, java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.sq.common_module.common.widget.lucky.LuckyDrawUpAdapter.LuckyDrawItem onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.sq.common_module.common.widget.lucky.LuckyDrawUpAdapter.LuckyDrawItem holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    public final void setOnDrawClickListener(@org.jetbrains.annotations.NotNull
    com.sq.common_module.common.widget.lucky.LuckyDrawUpView.DrawClickListener click) {
    }
    
    public final void setType(int type) {
    }
    
    public final void setDataArr(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.sq.common_module.common.widget.lucky.LuckyDrawUpView.LuckyDataBean> arr) {
    }
    
    public final void setSelectionPosition(int selectPos) {
    }
    
    public final void setDataList(@org.jetbrains.annotations.NotNull
    java.util.List<com.sq.common_module.common.bean.NineGridPrizeBean> list) {
    }
    
    /**
     * 获取真实坐标
     */
    private final int reversePosition(int selectPos) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/sq/common_module/common/widget/lucky/LuckyDrawUpAdapter$LuckyDrawItem;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/sq/common_module/common/widget/lucky/LuckyDrawUpAdapter;Landroid/view/View;)V", "ivBg", "Landroid/widget/ImageView;", "ivLottery", "tvName", "Landroid/widget/TextView;", "tvWxDesc", "viewShadow", "init", "", "fakePos", "", "dataBean", "Lcom/sq/common_module/common/widget/lucky/LuckyDrawUpView$LuckyDataBean;", "selectPos", "common_module_release"})
    public final class LuckyDrawItem extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private android.widget.ImageView ivBg;
        private android.widget.ImageView ivLottery;
        private android.widget.TextView tvName;
        private android.view.View viewShadow;
        private android.view.View tvWxDesc;
        
        public LuckyDrawItem(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
        
        /**
         * 将坐标传入，里面屏蔽adapter的内容，全部展示看到的坐标
         */
        public final void init(int fakePos, @org.jetbrains.annotations.NotNull
        com.sq.common_module.common.widget.lucky.LuckyDrawUpView.LuckyDataBean dataBean, int selectPos) {
        }
    }
}