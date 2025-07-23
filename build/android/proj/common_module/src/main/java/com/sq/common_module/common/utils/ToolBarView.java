package com.sq.common_module.common.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import com.sq.common_module.R;
import com.sq.common_module.common.utils.kt.CommonUtilsKt;


public class ToolBarView extends FrameLayout {
    private Action0 mLeftClick;
    private AppCompatTextView mTitle;
    private AppCompatImageView mHeadImg;
    private AppCompatTextView mRightTxt;
    private View base_top;


    public ToolBarView(@NonNull Context context) {
        super(context);
    }

    public ToolBarView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView(context, attrs);
    }

    public ToolBarView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context, attrs);
    }

    @SuppressLint("ResourceAsColor")
    private void initView(Context context, AttributeSet attrs) {
        LayoutInflater.from(context).inflate(R.layout.tool_bar_view, this);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.HeadView);
        mTitle = findViewById(R.id.head_title);
        mHeadImg = findViewById(R.id.head_img);
        mRightTxt = findViewById(R.id.head_right_text);

        base_top = findViewById(R.id.base_top);
        int leftTextColor = typedArray.getResourceId(R.styleable.HeadView_head_title_color, R.color.color_white);
        mTitle.setTextColor(context.getResources().getColor(leftTextColor));
        String title = typedArray.getString(R.styleable.HeadView_head_title);
        mTitle.setText(title);
        int leftImg = typedArray.getResourceId(R.styleable.HeadView_head_left_img, 0);
        if (leftImg != 0) {
            mHeadImg.setImageResource(leftImg);
            mHeadImg.setVisibility(VISIBLE);
        }
        int rightTextColor = typedArray.getResourceId(R.styleable.HeadView_head_right_text_color, R.color.color_white);
        mRightTxt.setTextColor(context.getResources().getColor(rightTextColor));
        String rightTxt = typedArray.getString(R.styleable.HeadView_head_right_text);
        if (!TextUtils.isEmpty(rightTxt)) {
            mRightTxt.setText(rightTxt);
            mRightTxt.setVisibility(VISIBLE);
        } else {
            mRightTxt.setVisibility(INVISIBLE);
        }
        initTitleBar();
        findViewById(R.id.ll_tool_bar).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mLeftClick != null && CommonUtilsKt.singleClick()) {
                    mLeftClick.call();
                }
            }
        });
        typedArray.recycle();
    }

    public void setLeftClick(Action0 leftClick) {
        mLeftClick = leftClick;
    }

    private void initTitleBar() {
        int navigationBarHeight = getNavigationBarHeight(getContext());

        int setHeight = dip2px(getContext(), 12);

        if (navigationBarHeight > setHeight) {

            setHeight = navigationBarHeight;
        }
        RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) base_top.getLayoutParams();
        params.height = setHeight;
    }

    public void setTitle(String title) {
        if (TextUtils.isEmpty(title) || title.length() <= 12) {
            mTitle.setText(title);
        } else {
            mTitle.setText(title.substring(0, 12) + "...");
        }
    }

    private int getNavigationBarHeight(Context context) {
        Resources resources = context.getResources();
        int resourceId = resources.getIdentifier("status_bar_height", "dimen", "android");
        int height = resources.getDimensionPixelSize(resourceId);
        return height;
    }

    private int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    public interface Action0 {
        /**
         * Consume the given value.
         */
        void call();
    }
}


