package com.zhl.customviewlearn.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.zhl.customviewlearn.R;

/**
 * 描述：
 * Created by zhaohl on 2017-11-7.
 */

public class CustomViewCavansLayer extends View {
    private Paint mPaint;
    public CustomViewCavansLayer(Context context) {
        this(context,null);
    }

    public CustomViewCavansLayer(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,-1);
    }

    public CustomViewCavansLayer(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint.setColor(Color.parseColor("#df652f"));
        canvas.save();
        canvas.clipRect(100,100,500,500);
        canvas.drawColor(Color.parseColor("#9e8f2e"));
        canvas.restore();

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.beauty_1);
        canvas.save();
        canvas.rotate(30,getWidth()/2,getHeight()/2);
        canvas.drawBitmap(bitmap,100,500,mPaint);
        canvas.restore();

        Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(), R.mipmap.icon_1);
        canvas.save();
        Camera camera = new Camera();
        camera.rotate(10f,10f,10f);
        camera.applyToCanvas(canvas);
        canvas.drawBitmap(bitmap1,100,800,mPaint);
        canvas.restore();


    }
}
