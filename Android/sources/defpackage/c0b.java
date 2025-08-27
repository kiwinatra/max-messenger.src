package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import one.me.appearancesettings.AppearanceSettingsScreen;

/* renamed from: c0b  reason: default package */
public final class c0b extends View implements phf {
    public final int a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    public final xde b = new xde();
    public final aee c = new aee();
    public final Paint o;
    public int v;
    public float v0;
    public int w;
    public float w0;
    public final b0b x;
    public final Paint x0;
    public final b0b y;
    public final TextPaint y0;
    public boolean z;
    public final ArrayList z0;

    public c0b(Context context) {
        super(context);
        Paint paint = new Paint();
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(vo4.c().getDisplayMetrics().density * 4.0f);
        this.o = paint;
        this.x = new b0b(this, 0);
        this.y = new b0b(this, 1);
        this.w0 = -1.0f;
        Paint paint2 = new Paint();
        paint2.setShadowLayer(vo4.c().getDisplayMetrics().density * 4.0f, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, i8b.Y(0.12f, -16777216));
        this.x0 = paint2;
        TextPaint textPaint = new TextPaint();
        puf.i.a(textPaint, getResources().getDisplayMetrics(), uy4.b);
        this.y0 = textPaint;
        this.z0 = new ArrayList();
        float f = (float) 16;
        setPaddingRelative(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), getPaddingTop(), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), getPaddingBottom());
        onThemeChanged(fu4.k.e(getContext()).f());
    }

    private final void setLastThumbSnap(float f) {
        aee aee = this.c;
        float f2 = aee.d;
        KProperty kProperty = aee.g[2];
        zde zde = aee.c;
        float floatValue = ((Number) zde.getValue(aee, kProperty)).floatValue() / ((float) 2);
        int i = aee.e;
        for (int i2 = 0; i2 < i; i2++) {
            xde xde = this.b;
            RectF rectF = xde.b;
            float a2 = xde.q.a(i2);
            rectF.left = a2;
            rectF.right = a2;
            rectF.top = xde.n;
            rectF.bottom = xde.o;
            if (Math.abs(rectF.centerX() - f) <= floatValue) {
                aee.c((((Number) zde.getValue(aee, aee.g[2])).floatValue() * ((float) i2)) + aee.b());
                if (aee.d != f2) {
                    b0b b0b = this.x;
                    removeCallbacks(b0b);
                    removeCallbacks(this.y);
                    post(b0b);
                }
            }
        }
        this.v0 = f;
    }

    public final boolean a() {
        ViewParent parent = getParent();
        while (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }

    public final void b() {
        Iterator it = this.z0.iterator();
        while (it.hasNext()) {
            kr krVar = (kr) it.next();
            float f = this.c.d;
            krVar.getClass();
            krVar.a.setVisibility(((f > 1.0f ? 1 : (f == 1.0f ? 0 : -1)) == 0) ^ true ? 0 : 8);
            KProperty[] kPropertyArr = AppearanceSettingsScreen.y;
            int coerceIn = RangesKt.coerceIn(MathKt.roundToInt(f), 0, 5);
            pid pid = (pid) ((fq) krVar.b.x.getValue());
            pid.j(coerceIn, "app.extra.text.size.mode");
            pid.i.d(Integer.valueOf(coerceIn));
        }
    }

    public final float getValue() {
        return this.c.d;
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        TextPaint textPaint = this.y0;
        textPaint.setTextSize(TypedValue.applyDimension(2, 12.0f, vo4.c().getDisplayMetrics()));
        xde xde = this.b;
        PointF pointF = xde.a;
        float f = (float) xde.e;
        pointF.x = f;
        float f2 = (((float) xde.d) / 2.0f) + xde.j;
        pointF.y = f2;
        canvas.drawText("A", f, f2, textPaint);
        textPaint.setTextSize(TypedValue.applyDimension(2, 18.0f, vo4.c().getDisplayMetrics()));
        PointF pointF2 = xde.a;
        float f3 = ((float) (xde.c - xde.g)) - xde.l;
        pointF2.x = f3;
        float f4 = (((float) xde.d) / 2.0f) + xde.m;
        pointF2.y = f4;
        canvas.drawText("A", f3, f4, textPaint);
        RectF rectF = xde.r;
        pointF2.x = xde.s;
        pointF2.y = rectF.centerY();
        float f5 = pointF2.x;
        Paint paint = this.o;
        paint.setColor(this.v);
        canvas.drawLine(rectF.left, rectF.top, f5, rectF.bottom, paint);
        int i = this.c.e;
        for (int i2 = 0; i2 < i; i2++) {
            RectF rectF2 = xde.b;
            float a2 = xde.q.a(i2);
            rectF2.left = a2;
            rectF2.right = a2;
            rectF2.top = xde.n;
            rectF2.bottom = xde.o;
            if (a2 > f5) {
                paint.setColor(this.w);
            }
            canvas.drawLine(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, paint);
        }
        canvas.drawLine(f5, rectF.top, rectF.right, rectF.bottom, paint);
        pointF2.x = xde.s;
        float centerY = rectF.centerY();
        pointF2.y = centerY;
        canvas.drawCircle(pointF2.x, centerY, vo4.c().getDisplayMetrics().density * 12.0f, this.x0);
    }

    public final void onMeasure(int i, int i2) {
        TextPaint textPaint = this.y0;
        textPaint.setTextSize(vo4.c().getDisplayMetrics().density * 12.0f);
        textPaint.measureText("A");
        float f = (float) 20;
        MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        float measureText = textPaint.measureText("A");
        float f2 = textPaint.getFontMetrics().descent;
        xde xde = this.b;
        xde.getClass();
        xde.i = RangesKt.coerceAtLeast(measureText, (float) c44.DEFAULT_ASPECT_RATIO) + ((float) MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f));
        xde.j = f2;
        xde.d();
        xde.b(xde.p);
        textPaint.setTextSize(vo4.c().getDisplayMetrics().density * 18.0f);
        textPaint.measureText("A");
        MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        float measureText2 = textPaint.measureText("A");
        float f3 = textPaint.getFontMetrics().descent;
        float coerceAtLeast = RangesKt.coerceAtLeast(measureText2, (float) c44.DEFAULT_ASPECT_RATIO);
        xde.l = coerceAtLeast;
        xde.k = coerceAtLeast + ((float) MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        xde.m = f3;
        xde.d();
        xde.b(xde.p);
        setMeasuredDimension(View.MeasureSpec.getSize(i), MathKt.roundToInt(((float) 68) * vo4.c().getDisplayMetrics().density));
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        xde.c = RangesKt.coerceAtLeast(measuredWidth, 0);
        xde.d = RangesKt.coerceAtLeast(measuredHeight, 0);
        xde.e = RangesKt.coerceAtLeast(paddingLeft, 0);
        xde.f = RangesKt.coerceAtLeast(paddingTop, 0);
        xde.g = RangesKt.coerceAtLeast(paddingRight, 0);
        xde.h = RangesKt.coerceAtLeast(paddingBottom, 0);
        xde.d();
        xde.b(xde.p);
        xde.c(xde.s);
        aee aee = this.c;
        xde.b(aee.e);
        RectF rectF = xde.r;
        if (!this.z) {
            xde.c(xde.a((rectF.width() * aee.f) + rectF.left));
        }
    }

    public final void onThemeChanged(k2b k2b) {
        k2b.getIcon().getClass();
        this.v = -16745729;
        this.w = w53.f(k2b.h().j, k2b.c().f);
        this.o.setColor(this.v);
        k2b.getIcon().getClass();
        this.x0.setColor(-1);
        this.y0.setColor(k2b.getText().f);
        invalidate();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        if (r0 != 3) goto L_0x00a6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            boolean r0 = r5.isEnabled()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            int r0 = r6.getAction()
            xde r2 = r5.b
            r3 = 1
            if (r0 == 0) goto L_0x0076
            if (r0 == r3) goto L_0x0063
            r4 = 2
            if (r0 == r4) goto L_0x001b
            r4 = 3
            if (r0 == r4) goto L_0x0063
            goto L_0x00a6
        L_0x001b:
            boolean r0 = r5.z
            if (r0 != 0) goto L_0x003f
            boolean r0 = r5.a()
            if (r0 == 0) goto L_0x0038
            float r0 = r6.getX()
            float r4 = r5.w0
            float r0 = r0 - r4
            float r0 = java.lang.Math.abs(r0)
            int r4 = r5.a
            float r4 = (float) r4
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0038
            return r1
        L_0x0038:
            android.view.ViewParent r0 = r5.getParent()
            r0.requestDisallowInterceptTouchEvent(r3)
        L_0x003f:
            r5.z = r3
            float r6 = r6.getX()
            float r6 = r2.a(r6)
            float r0 = r5.v0
            float r0 = r6 - r0
            float r0 = java.lang.Math.abs(r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a6
            pw6 r0 = defpackage.pw6.CLOCK_TICK
            defpackage.b0h.K(r5, r0)
            r5.setLastThumbSnap(r6)
            r2.c(r6)
            goto L_0x00a6
        L_0x0063:
            r5.z = r1
            float r6 = r6.getX()
            float r6 = r2.a(r6)
            r5.setLastThumbSnap(r6)
            float r6 = r5.v0
            r2.c(r6)
            goto L_0x00a6
        L_0x0076:
            float r0 = r6.getX()
            r5.w0 = r0
            boolean r0 = r5.a()
            if (r0 == 0) goto L_0x0083
            goto L_0x00a6
        L_0x0083:
            android.view.ViewParent r0 = r5.getParent()
            r0.requestDisallowInterceptTouchEvent(r3)
            r5.requestFocus()
            r5.z = r3
            float r0 = r6.getX()
            float r0 = r2.a(r0)
            r5.setLastThumbSnap(r0)
            float r6 = r6.getX()
            r2.c(r6)
            qw6 r6 = defpackage.qw6.GESTURE_START
            defpackage.b0h.K(r5, r6)
        L_0x00a6:
            r5.invalidate()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c0b.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setStepSize(float f) {
        aee aee = this.c;
        float f2 = aee.d;
        aee.c.setValue(aee, aee.g[2], Float.valueOf(f));
        Unit unit = Unit.INSTANCE;
        int i = aee.e;
        xde xde = this.b;
        xde.b(i);
        RectF rectF = xde.r;
        xde.c(xde.a((rectF.width() * aee.f) + rectF.left));
        if (f2 != aee.d) {
            removeCallbacks(this.x);
            b0b b0b = this.y;
            removeCallbacks(b0b);
            post(b0b);
        }
        postInvalidate();
    }

    public final void setValue(float f) {
        aee aee = this.c;
        float f2 = aee.d;
        aee.c(f);
        Unit unit = Unit.INSTANCE;
        int i = aee.e;
        xde xde = this.b;
        xde.b(i);
        RectF rectF = xde.r;
        xde.c(xde.a((rectF.width() * aee.f) + rectF.left));
        if (f2 != aee.d) {
            removeCallbacks(this.x);
            b0b b0b = this.y;
            removeCallbacks(b0b);
            post(b0b);
        }
        postInvalidate();
    }

    public final void setValueFrom(float f) {
        aee aee = this.c;
        float f2 = aee.d;
        aee.a.setValue(aee, aee.g[0], Float.valueOf(f));
        Unit unit = Unit.INSTANCE;
        int i = aee.e;
        xde xde = this.b;
        xde.b(i);
        RectF rectF = xde.r;
        xde.c(xde.a((rectF.width() * aee.f) + rectF.left));
        if (f2 != aee.d) {
            removeCallbacks(this.x);
            b0b b0b = this.y;
            removeCallbacks(b0b);
            post(b0b);
        }
        postInvalidate();
    }

    public final void setValueTo(float f) {
        aee aee = this.c;
        float f2 = aee.d;
        aee.b.setValue(aee, aee.g[1], Float.valueOf(f));
        Unit unit = Unit.INSTANCE;
        int i = aee.e;
        xde xde = this.b;
        xde.b(i);
        RectF rectF = xde.r;
        xde.c(xde.a((rectF.width() * aee.f) + rectF.left));
        if (f2 != aee.d) {
            removeCallbacks(this.x);
            b0b b0b = this.y;
            removeCallbacks(b0b);
            post(b0b);
        }
        postInvalidate();
    }
}
