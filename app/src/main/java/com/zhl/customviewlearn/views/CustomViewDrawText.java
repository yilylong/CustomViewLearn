package com.zhl.customviewlearn.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;

/**
 * 描述：
 * Created by zhaohl on 2017-11-7.
 */

public class CustomViewDrawText extends View {
    private Paint mPaint;
    public CustomViewDrawText(Context context) {
        this(context,null);
    }

    public CustomViewDrawText(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,-1);
    }

    public CustomViewDrawText(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        mPaint.setColor(Color.parseColor("#4d4e3e"));
        mPaint.setTextSize(50);
        canvas.drawText("Hello Android",100,100,mPaint);

        Path path = new Path();
        path.moveTo(100,200);
        path.lineTo(300,200);
        path.lineTo(350,300);
        path.lineTo(400,300);
        path.lineTo(450,300);
        path.lineTo(500,300);
        mPaint.setPathEffect(new CornerPathEffect(5));
        mPaint.setColor(Color.parseColor("#3462dd"));
//        canvas.drawPath(path,mPaint);
        canvas.drawTextOnPath("DrawText on path",path,2,2,mPaint);

        String text="this is static layout text it can turndown by itself!!!";

        TextPaint textPaint = new TextPaint(mPaint);
        textPaint.setTypeface(Typeface.SANS_SERIF);
        textPaint.setTextSkewX(-0.3f);
        StaticLayout staticLayout = new StaticLayout(text, textPaint,600, Layout.Alignment.ALIGN_NORMAL,1,0,true);

        canvas.save();
        canvas.translate(20,400);
        staticLayout.draw(canvas);
        canvas.restore();


        canvas.save();
        canvas.clipRect(200,600,600,1000);
        canvas.drawColor(Color.parseColor("#de8238"));
        canvas.restore();



        super.onDraw(canvas);
    }
}
