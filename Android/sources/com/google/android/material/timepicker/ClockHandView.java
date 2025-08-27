package com.google.android.material.timepicker;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

class ClockHandView extends View {
    public static final /* synthetic */ int H0 = 0;
    public final int A0;
    public float B0;
    public boolean C0;
    public e D0;
    public double E0;
    public int F0;
    public int G0;
    public final int a;
    public final TimeInterpolator b;
    public final ValueAnimator c = new ValueAnimator();
    public boolean o;
    public float v;
    public final ArrayList v0 = new ArrayList();
    public float w;
    public final int w0;
    public boolean x;
    public final float x0;
    public final int y;
    public final Paint y0;
    public boolean z;
    public final RectF z0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ClockHandView(android.content.Context r6, android.util.AttributeSet r7) {
        /*
            r5 = this;
            int r0 = defpackage.edc.materialClockStyle
            r5.<init>(r6, r7, r0)
            android.animation.ValueAnimator r1 = new android.animation.ValueAnimator
            r1.<init>()
            r5.c = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.v0 = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r5.y0 = r1
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r5.z0 = r2
            r2 = 1
            r5.G0 = r2
            int[] r3 = defpackage.tnc.ClockHandView
            int r4 = defpackage.hnc.Widget_MaterialComponents_TimePicker_Clock
            android.content.res.TypedArray r7 = r6.obtainStyledAttributes(r7, r3, r0, r4)
            int r0 = defpackage.edc.motionDurationLong2
            r3 = 200(0xc8, float:2.8E-43)
            int r0 = defpackage.ld8.n0(r0, r3, r6)
            r5.a = r0
            int r0 = defpackage.edc.motionEasingEmphasizedInterpolator
            gh5 r3 = defpackage.xg.b
            android.animation.TimeInterpolator r0 = defpackage.ld8.o0(r6, r0, r3)
            r5.b = r0
            int r0 = defpackage.tnc.ClockHandView_materialCircleRadius
            r3 = 0
            int r0 = r7.getDimensionPixelSize(r0, r3)
            r5.F0 = r0
            int r0 = defpackage.tnc.ClockHandView_selectorSize
            int r0 = r7.getDimensionPixelSize(r0, r3)
            r5.w0 = r0
            android.content.res.Resources r0 = r5.getResources()
            int r4 = defpackage.iec.material_clock_hand_stroke_width
            int r4 = r0.getDimensionPixelSize(r4)
            r5.A0 = r4
            int r4 = defpackage.iec.material_clock_hand_center_dot_radius
            int r0 = r0.getDimensionPixelSize(r4)
            float r0 = (float) r0
            r5.x0 = r0
            int r0 = defpackage.tnc.ClockHandView_clockHandColor
            int r0 = r7.getColor(r0, r3)
            r1.setAntiAlias(r2)
            r1.setColor(r0)
            r0 = 0
            r5.c(r0, r3)
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r6)
            int r6 = r6.getScaledTouchSlop()
            r5.y = r6
            java.util.WeakHashMap r6 = defpackage.gag.a
            r6 = 2
            r5.setImportantForAccessibility(r6)
            r7.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.timepicker.ClockHandView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int a(float f, float f2) {
        int degrees = (int) Math.toDegrees(Math.atan2((double) (f2 - ((float) (getHeight() / 2))), (double) (f - ((float) (getWidth() / 2)))));
        int i = degrees + 90;
        return i < 0 ? degrees + 450 : i;
    }

    public final int b(int i) {
        int i2 = this.F0;
        return i == 2 ? Math.round(((float) i2) * 0.66f) : i2;
    }

    public final void c(float f, boolean z2) {
        ValueAnimator valueAnimator = this.c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z2) {
            d(f, false);
            return;
        }
        float f2 = this.B0;
        if (Math.abs(f2 - f) > 180.0f) {
            if (f2 > 180.0f && f < 180.0f) {
                f += 360.0f;
            }
            if (f2 < 180.0f && f > 180.0f) {
                f2 += 360.0f;
            }
        }
        Pair pair = new Pair(Float.valueOf(f2), Float.valueOf(f));
        valueAnimator.setFloatValues(new float[]{((Float) pair.first).floatValue(), ((Float) pair.second).floatValue()});
        valueAnimator.setDuration((long) this.a);
        valueAnimator.setInterpolator(this.b);
        valueAnimator.addUpdateListener(new d(this));
        valueAnimator.addListener(new n33(0));
        valueAnimator.start();
    }

    public final void d(float f, boolean z2) {
        float f2 = f % 360.0f;
        this.B0 = f2;
        this.E0 = Math.toRadians((double) (f2 - 90.0f));
        float b2 = (float) b(this.G0);
        float cos = (((float) Math.cos(this.E0)) * b2) + ((float) (getWidth() / 2));
        float sin = (b2 * ((float) Math.sin(this.E0))) + ((float) (getHeight() / 2));
        float f3 = (float) this.w0;
        this.z0.set(cos - f3, sin - f3, cos + f3, sin + f3);
        Iterator it = this.v0.iterator();
        while (it.hasNext()) {
            ((o33) it.next()).j(f2, z2);
        }
        invalidate();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int b2 = b(this.G0);
        float f = (float) width;
        float f2 = (float) b2;
        float f3 = (float) height;
        Paint paint = this.y0;
        paint.setStrokeWidth(c44.DEFAULT_ASPECT_RATIO);
        int i = this.w0;
        canvas.drawCircle((((float) Math.cos(this.E0)) * f2) + f, (f2 * ((float) Math.sin(this.E0))) + f3, (float) i, paint);
        double sin = Math.sin(this.E0);
        double d = (double) ((float) (b2 - i));
        paint.setStrokeWidth((float) this.A0);
        canvas.drawLine(f, f3, (float) (width + ((int) (Math.cos(this.E0) * d))), (float) (height + ((int) (d * sin))), paint);
        canvas.drawCircle(f, f3, this.x0, paint);
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        if (!this.c.isRunning()) {
            c(this.B0, false);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getActionMasked()
            float r1 = r12.getX()
            float r12 = r12.getY()
            r2 = 12
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x006b
            r5 = 2
            if (r0 == r3) goto L_0x001b
            if (r0 == r5) goto L_0x001b
            r0 = r4
            r5 = r0
            r6 = r5
            goto L_0x0076
        L_0x001b:
            float r6 = r11.v
            float r6 = r1 - r6
            int r6 = (int) r6
            float r7 = r11.w
            float r7 = r12 - r7
            int r7 = (int) r7
            int r6 = r6 * r6
            int r7 = r7 * r7
            int r7 = r7 + r6
            int r6 = r11.y
            if (r7 <= r6) goto L_0x002e
            r6 = r3
            goto L_0x002f
        L_0x002e:
            r6 = r4
        L_0x002f:
            r11.x = r6
            boolean r6 = r11.C0
            if (r0 != r3) goto L_0x0037
            r0 = r3
            goto L_0x0038
        L_0x0037:
            r0 = r4
        L_0x0038:
            boolean r7 = r11.z
            if (r7 == 0) goto L_0x0069
            int r7 = r11.getWidth()
            int r7 = r7 / r5
            int r8 = r11.getHeight()
            int r8 = r8 / r5
            float r7 = (float) r7
            float r8 = (float) r8
            float r7 = r1 - r7
            float r8 = r12 - r8
            double r9 = (double) r7
            double r7 = (double) r8
            double r7 = java.lang.Math.hypot(r9, r7)
            float r7 = (float) r7
            int r8 = r11.b(r5)
            android.content.Context r9 = r11.getContext()
            float r9 = defpackage.ct.j(r2, r9)
            float r8 = (float) r8
            float r8 = r8 + r9
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 > 0) goto L_0x0066
            goto L_0x0067
        L_0x0066:
            r5 = r3
        L_0x0067:
            r11.G0 = r5
        L_0x0069:
            r5 = r4
            goto L_0x0076
        L_0x006b:
            r11.v = r1
            r11.w = r12
            r11.x = r3
            r11.C0 = r4
            r5 = r3
            r0 = r4
            r6 = r0
        L_0x0076:
            boolean r7 = r11.C0
            int r8 = r11.a(r1, r12)
            float r9 = r11.B0
            float r8 = (float) r8
            int r9 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r9 == 0) goto L_0x0085
            r9 = r3
            goto L_0x0086
        L_0x0085:
            r9 = r4
        L_0x0086:
            if (r5 == 0) goto L_0x008c
            if (r9 == 0) goto L_0x008c
        L_0x008a:
            r5 = r3
            goto L_0x00a0
        L_0x008c:
            if (r9 != 0) goto L_0x0093
            if (r6 == 0) goto L_0x0091
            goto L_0x0093
        L_0x0091:
            r5 = r4
            goto L_0x00a0
        L_0x0093:
            if (r0 == 0) goto L_0x009b
            boolean r5 = r11.o
            if (r5 == 0) goto L_0x009b
            r5 = r3
            goto L_0x009c
        L_0x009b:
            r5 = r4
        L_0x009c:
            r11.c(r8, r5)
            goto L_0x008a
        L_0x00a0:
            r5 = r5 | r7
            r11.C0 = r5
            if (r5 == 0) goto L_0x0110
            if (r0 == 0) goto L_0x0110
            com.google.android.material.timepicker.e r0 = r11.D0
            if (r0 == 0) goto L_0x0110
            int r12 = r11.a(r1, r12)
            float r12 = (float) r12
            boolean r11 = r11.x
            r0.v = r3
            ijf r1 = r0.b
            int r5 = r1.v
            int r6 = r1.o
            int r7 = r1.w
            r8 = 10
            com.google.android.material.timepicker.TimePickerView r9 = r0.a
            if (r7 != r8) goto L_0x00e2
            float r11 = r0.o
            com.google.android.material.timepicker.ClockHandView r12 = r9.G0
            r12.c(r11, r4)
            android.content.Context r11 = r9.getContext()
            java.lang.Class<android.view.accessibility.AccessibilityManager> r12 = android.view.accessibility.AccessibilityManager.class
            java.lang.Object r11 = defpackage.fw3.b(r11, r12)
            android.view.accessibility.AccessibilityManager r11 = (android.view.accessibility.AccessibilityManager) r11
            if (r11 == 0) goto L_0x00de
            boolean r11 = r11.isTouchExplorationEnabled()
            if (r11 == 0) goto L_0x00de
            goto L_0x00ff
        L_0x00de:
            r0.d(r2, r3)
            goto L_0x00ff
        L_0x00e2:
            int r12 = java.lang.Math.round(r12)
            if (r11 != 0) goto L_0x00f8
            int r12 = r12 + 15
            int r12 = r12 / 30
            int r12 = r12 * 5
            r1.d(r12)
            int r12 = r1.v
            int r12 = r12 * 6
            float r12 = (float) r12
            r0.c = r12
        L_0x00f8:
            float r12 = r0.c
            com.google.android.material.timepicker.ClockHandView r2 = r9.G0
            r2.c(r12, r11)
        L_0x00ff:
            r0.v = r4
            r0.e()
            int r11 = r1.v
            if (r11 != r5) goto L_0x010c
            int r11 = r1.o
            if (r11 == r6) goto L_0x0110
        L_0x010c:
            r11 = 4
            r9.performHapticFeedback(r11)
        L_0x0110:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.timepicker.ClockHandView.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
