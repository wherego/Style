package com.boxuanjia.style.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;

import com.boxuanjia.style.R;

public class RatingView extends View {

    private float mPercent = 75;

    private float mStrokeWidth;

    private int mBgColor = 0xffe1e1e1;

    private float mStartAngle = 0;

    private int mFgColorStart = 0xffffe400;

    private int mFgColorEnd = 0xffff4800;

    private LinearGradient mShader;

    private RectF mOval;

    private Paint mPaint;

    public RatingView(Context context) {
        super(context);
        init(context, null);
    }

    public RatingView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public RatingView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint.setShader(null);
        mPaint.setColor(mBgColor);
        canvas.drawArc(mOval, 0, 360, false, mPaint);
        mPaint.setShader(mShader);
        canvas.drawArc(mOval, mStartAngle, mPercent * 3.6f, false, mPaint);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        updateOval();
        mShader = new LinearGradient(mOval.left, mOval.top, mOval.left, mOval.bottom, mFgColorStart, mFgColorEnd, Shader.TileMode.MIRROR);
    }

    public float getPercent() {
        return mPercent;
    }

    public void setPercent(float percent) {
        this.mPercent = percent;
        refreshTheLayout();
    }

    public float getStrokeWidth() {
        return mStrokeWidth;
    }

    public void setStrokeWidth(float strokeWidth) {
        this.mStrokeWidth = strokeWidth;
        mPaint.setStrokeWidth(strokeWidth);
        updateOval();
        refreshTheLayout();
    }

    public int getBgColor() {
        return mBgColor;
    }

    public void setBgColor(int bgColor) {
        this.mBgColor = bgColor;
        refreshTheLayout();
    }

    public int getFgColorStart() {
        return mFgColorStart;
    }

    public void setFgColorStart(int mFgColorStart) {
        this.mFgColorStart = mFgColorStart;
        mShader = new LinearGradient(
                mOval.left, mOval.top,
                mOval.left, mOval.bottom,
                mFgColorStart, mFgColorEnd,
                Shader.TileMode.MIRROR);
        refreshTheLayout();
    }

    public int getFgColorEnd() {
        return mFgColorEnd;
    }

    public void setFgColorEnd(int mFgColorEnd) {
        this.mFgColorEnd = mFgColorEnd;
        mShader = new LinearGradient(
                mOval.left, mOval.top,
                mOval.left, mOval.bottom,
                mFgColorStart, mFgColorEnd,
                Shader.TileMode.MIRROR);
        refreshTheLayout();
    }

    public float getStartAngle() {
        return mStartAngle;
    }

    public void setStartAngle(float mStartAngle) {
        this.mStartAngle = mStartAngle + 270;
        refreshTheLayout();
    }

    private void init(Context context, AttributeSet attrs) {
        TypedArray a = context.getTheme().obtainStyledAttributes(attrs, R.styleable.RatingView, 0, 0);
        try {
            mBgColor = a.getColor(R.styleable.RatingView_bgColor, 0xffe1e1e1);
            mFgColorEnd = a.getColor(R.styleable.RatingView_fgColorEnd, 0xffff4800);
            mFgColorStart = a.getColor(R.styleable.RatingView_fgColorStart, 0xffffe400);
            mPercent = a.getFloat(R.styleable.RatingView_percent, 75);
            mStartAngle = a.getFloat(R.styleable.RatingView_startAngle, 0) + 270;
            mStrokeWidth = a.getDimensionPixelSize(R.styleable.RatingView_strokeWidth, (int) (context.getResources().getDisplayMetrics().density * 21 + 0.5f));
        } finally {
            a.recycle();
        }

        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(mStrokeWidth);
        mPaint.setStrokeCap(Paint.Cap.ROUND);
    }

    private void updateOval() {
        int xp = getPaddingLeft() + getPaddingRight();
        int yp = getPaddingBottom() + getPaddingTop();
        mOval = new RectF(
                getPaddingLeft() + mStrokeWidth,
                getPaddingTop() + mStrokeWidth,
                getPaddingLeft() + (getWidth() - xp) - mStrokeWidth,
                getPaddingTop() + (getHeight() - yp) - mStrokeWidth);
    }

    private void refreshTheLayout() {
        invalidate();
        requestLayout();
    }
}
