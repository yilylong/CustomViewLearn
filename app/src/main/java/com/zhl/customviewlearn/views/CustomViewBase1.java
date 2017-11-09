package com.zhl.customviewlearn.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * 描述：
 * Created by zhaohl on 2017-10-31.
 */

public class CustomViewBase1 extends View {
    private Paint mPaint;

    public CustomViewBase1(Context context) {
        this(context,null);
    }

    public CustomViewBase1(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,-1);
    }

    public CustomViewBase1(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Path heartPath = new Path();
//        mPaint.setStyle(Paint.Style.STROKE);
        heartPath.moveTo(540,860);
        heartPath.addArc(340,760,540,960,0,-220);
        heartPath.lineTo(540,1140);
        heartPath.close();
        heartPath.addArc(540,760,740,960,180,220);
        heartPath.lineTo(540,1140);
        heartPath.close();
//        heartPath.lineTo(345,800);
        mPaint.setColor(Color.RED);
        canvas.drawPath(heartPath,mPaint);
//        canvas.drawLine(374,835,540,1060,mPaint);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(10);
        canvas.drawCircle(540,200,100,mPaint);
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawArc(new RectF(200,300,500,600),0,30,true,mPaint);
        mPaint.setColor(Color.BLUE);
        canvas.drawArc(new RectF(200,300,500,600),30,75,true,mPaint);
        mPaint.setColor(Color.GREEN);
        canvas.drawArc(new RectF(200,300,500,600),105,55,true,mPaint);
        mPaint.setColor(Color.parseColor("#ef3454"));
        canvas.drawArc(new RectF(200,300,500,600),160,90,true,mPaint);
        mPaint.setColor(Color.parseColor("#ef86e4"));
        canvas.drawArc(new RectF(210,290,510,590),250,110,true,mPaint);
        Path indicator = new Path();
        indicator.moveTo(450,400);
        indicator.lineTo(520,320);
        indicator.lineTo(600,320);
        mPaint.setColor(Color.GRAY);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(1);
        canvas.drawPath(indicator,mPaint);
        mPaint.setTextSize(15);
        canvas.drawText("30.5%",605,322,mPaint);
        super.onDraw(canvas);
    }
}
