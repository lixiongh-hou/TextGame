package com.sq.common_module.common.utils.java;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

/**
 * Created by town
 * Date :  2023/1/30
 * Time : 17:09
 */
public class MyView extends View {
    private Paint mPaint;

    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initPaint();
    }

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private void initPaint() {
        mPaint = new Paint();
        mPaint.setColor(Color.BLUE);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(10f);
    }

    private int mWidth;
    private int mHeight;

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mWidth = w;
        mHeight = h;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//
//        RectF rect = new RectF(100, 100, 800, 400);
//        mPaint.setColor(Color.GRAY);
//        canvas.drawRect(rect, mPaint);
//
//        mPaint.setColor(Color.BLUE);
//        canvas.drawArc(rect,0,90,false,mPaint);

        canvas.translate(mWidth / 2, mHeight / 2);
        Path path = new Path();
//        path.lineTo(200,200);
////        path.moveTo(200,100); //移动之后起点位置改变
//        path.setLastPoint(200,100);
//        path.lineTo(200,0);
//        path.close();
//        canvas.drawPath(path,mPaint);

//        path.addRect(-200,-200,200,200,Path.Direction.CW);
//
//        Path path1 = new Path();
//        path1.addCircle(0,0,100, Path.Direction.CW);
//
//        path.addPath(path1,100,100);
//        canvas.drawPath(path,mPaint);

        path.lineTo(100,100);
        RectF rectF = new RectF(0, 0, 300, 300);
        path.arcTo(rectF,0,270);
        canvas.drawPath(path,mPaint);
    }
}
