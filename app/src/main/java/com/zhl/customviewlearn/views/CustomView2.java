package com.zhl.customviewlearn.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.zhl.customviewlearn.R;

/**
 * 描述：
 * Created by zhaohl on 2017-11-1.
 */

public class CustomView2 extends View {
    private Paint mPaint;
    public CustomView2(Context context) {
        this(context, null);
    }

    public CustomView2(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, -1);
    }

    public CustomView2(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Shader shader = new LinearGradient(100,100,300,300, Color.parseColor("#efdeed"),Color.parseColor("#56dfe3"), Shader.TileMode.CLAMP);
        mPaint.setShader(shader);
        canvas.drawCircle(150,150,100,mPaint);

        Shader shader2 = new RadialGradient(400,150,100,Color.parseColor("#efceed"),Color.parseColor("#6647ed"), Shader.TileMode.CLAMP);
        mPaint.setShader(shader2);
        canvas.drawCircle(400,150,100,mPaint);

        Shader shader3 = new SweepGradient(650,150,Color.parseColor("#346efe"),Color.parseColor("#9f23dc"));
        mPaint.setShader(shader3);
        canvas.drawCircle(650,150,100,mPaint);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.beauty_1);
        Shader shader4 = new BitmapShader(bitmap, Shader.TileMode.MIRROR,Shader.TileMode.MIRROR);
        mPaint.setShader(shader4);
        canvas.drawCircle(900,150,500,mPaint);

//        canvas.drawBitmap(bitmap,0,0,mPaint);

        super.onDraw(canvas);
    }
}
