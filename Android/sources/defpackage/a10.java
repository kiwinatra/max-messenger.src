package defpackage;

import android.animation.ValueAnimator;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import kotlin.math.MathKt;

/* renamed from: a10  reason: default package */
public final class a10 extends Drawable {
    public Drawable a;
    public boolean b;
    public int c = MathKt.roundToInt(((float) 56) * vo4.c().getDisplayMetrics().density);
    public boolean d = true;
    public boolean e = true;
    public int f;
    public final float g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public long l;
    public final RectF m;
    public ValueAnimator n;
    public long o;
    public final Paint p;

    public a10() {
        float f2 = vo4.c().getDisplayMetrics().density * 2.0f;
        this.g = f2;
        this.i = 270;
        this.m = new RectF();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStrokeWidth(f2);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.p = paint;
    }

    public final boolean a() {
        return (this.f != 0 && this.j == this.h && this.i == 270) ? false : true;
    }

    public final void b(int i2) {
        this.p.setColor(i2);
        invalidateSelf();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bc, code lost:
        if (r9 < r4) goto L_0x00be;
     */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0113  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r19) {
        /*
            r18 = this;
            r0 = r18
            boolean r1 = r0.d
            if (r1 == 0) goto L_0x0194
            int r1 = r0.f
            r2 = 10000(0x2710, float:1.4013E-41)
            if (r1 != r2) goto L_0x0012
            boolean r1 = r0.e
            if (r1 != 0) goto L_0x0012
            goto L_0x0194
        L_0x0012:
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r0.o
            long r3 = r3 - r5
            r5 = 150(0x96, double:7.4E-322)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x0024
            r18.invalidateSelf()
            goto L_0x0194
        L_0x0024:
            android.graphics.Rect r1 = r18.getBounds()
            int r1 = r1.centerX()
            android.graphics.Rect r3 = r18.getBounds()
            int r3 = r3.centerY()
            boolean r4 = r18.a()
            android.graphics.Paint r10 = r0.p
            android.graphics.RectF r6 = r0.m
            float r7 = r0.g
            if (r4 == 0) goto L_0x013a
            boolean r4 = r0.d
            r9 = 1
            r11 = 0
            if (r4 != 0) goto L_0x004a
            r13 = r6
        L_0x0047:
            r4 = r9
            goto L_0x00fb
        L_0x004a:
            long r12 = android.os.SystemClock.elapsedRealtime()
            long r14 = r0.l
            long r14 = r12 - r14
            r0.l = r12
            int r4 = r0.i
            float r12 = (float) r4
            r13 = 10
            float r13 = (float) r13
            float r14 = (float) r14
            r15 = 1106247680(0x41f00000, float:30.0)
            float r14 = r14 / r15
            float r13 = r13 * r14
            float r13 = r13 + r12
            int r12 = (int) r13
            int r4 = r12 - r4
            r13 = r6
            double r5 = (double) r4
            double r4 = java.lang.Math.abs(r5)
            r16 = 4645040803167600640(0x4076800000000000, double:360.0)
            int r4 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r4 <= 0) goto L_0x0079
            r0.k = r9
            r0.i = r11
            r0.h = r11
            goto L_0x0047
        L_0x0079:
            boolean r4 = r0.k
            r5 = 200(0xc8, float:2.8E-43)
            if (r4 == 0) goto L_0x0087
            int r6 = r0.h
            float r6 = (float) r6
            float r5 = (float) r5
            float r5 = r5 * r14
            float r5 = r5 + r6
            int r5 = (int) r5
            goto L_0x008e
        L_0x0087:
            int r6 = r0.h
            float r6 = (float) r6
            float r5 = (float) r5
            float r5 = r5 * r14
            float r6 = r6 - r5
            int r5 = (int) r6
        L_0x008e:
            int r6 = r0.f
            if (r6 == 0) goto L_0x009a
            int r14 = r0.h
            int r15 = r0.j
            if (r14 != r15) goto L_0x009a
            r14 = r9
            goto L_0x009b
        L_0x009a:
            r14 = r11
        L_0x009b:
            r15 = 270(0x10e, float:3.78E-43)
            if (r14 == 0) goto L_0x00a5
            int r8 = r0.i
            if (r8 != r15) goto L_0x00a5
            r8 = r9
            goto L_0x00a6
        L_0x00a5:
            r8 = r11
        L_0x00a6:
            if (r6 == 0) goto L_0x00d9
            if (r14 != 0) goto L_0x00c3
            if (r4 == 0) goto L_0x00b6
            int r4 = r0.h
            int r4 = r4 + r9
            int r9 = r0.j
            if (r4 > r9) goto L_0x00b6
            if (r9 > r5) goto L_0x00b6
            goto L_0x00be
        L_0x00b6:
            int r4 = r0.h
            int r9 = r0.j
            if (r5 > r9) goto L_0x00c3
            if (r9 >= r4) goto L_0x00c3
        L_0x00be:
            int r4 = r0.j
            r0.h = r4
            r14 = 1
        L_0x00c3:
            if (r14 == 0) goto L_0x00ce
            int r4 = r0.i
            if (r4 >= r15) goto L_0x00ce
            if (r12 < r15) goto L_0x00ce
            r0.i = r15
            r8 = 1
        L_0x00ce:
            if (r8 == 0) goto L_0x00d9
            int r4 = r0.j
            r0.f = r4
            r0.onLevelChange(r6)
            r4 = 1
            goto L_0x00fb
        L_0x00d9:
            if (r14 != 0) goto L_0x00dd
            r0.h = r5
        L_0x00dd:
            r0.i = r12
            int r4 = r0.h
            if (r4 <= r2) goto L_0x00ec
            int r4 = r4 - r2
            int r4 = 10000 - r4
            r0.h = r4
            r0.k = r11
        L_0x00ea:
            r4 = 1
            goto L_0x00f4
        L_0x00ec:
            if (r4 >= 0) goto L_0x00ea
            int r4 = -r4
            r0.h = r4
            r4 = 1
            r0.k = r4
        L_0x00f4:
            r5 = 360(0x168, float:5.04E-43)
            if (r12 < r5) goto L_0x00fb
            int r12 = r12 - r5
            r0.i = r12
        L_0x00fb:
            int r5 = r0.h
            int r5 = r5 / r2
            float r2 = (float) r5
            r5 = 1135869952(0x43b40000, float:360.0)
            float r2 = r2 * r5
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x0109
            r2 = 1135837184(0x43b38000, float:359.0)
        L_0x0109:
            r5 = 0
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x0110
            r9 = r4
            goto L_0x0111
        L_0x0110:
            r9 = r11
        L_0x0111:
            if (r9 == 0) goto L_0x0115
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x0115:
            r8 = r2
            int r2 = r0.c
            int r2 = r2 / 2
            int r4 = r1 - r2
            float r4 = (float) r4
            r5 = 4
            float r5 = (float) r5
            float r7 = r7 * r5
            float r4 = r4 + r7
            int r5 = r3 - r2
            float r5 = (float) r5
            float r5 = r5 + r7
            int r6 = r2 + r1
            float r6 = (float) r6
            float r6 = r6 - r7
            int r2 = r2 + r3
            float r2 = (float) r2
            float r2 = r2 - r7
            r13.set(r4, r5, r6, r2)
            int r2 = r0.i
            float r7 = (float) r2
            r9 = 0
            r5 = r19
            r6 = r13
            r5.drawArc(r6, r7, r8, r9, r10)
            goto L_0x0168
        L_0x013a:
            r13 = r6
            int r2 = r0.c
            int r2 = r2 / 2
            int r4 = r1 - r2
            float r4 = (float) r4
            r5 = 4
            float r5 = (float) r5
            float r7 = r7 * r5
            float r4 = r4 + r7
            int r5 = r3 - r2
            float r5 = (float) r5
            float r5 = r5 + r7
            int r6 = r2 + r1
            float r6 = (float) r6
            float r6 = r6 - r7
            int r2 = r2 + r3
            float r2 = (float) r2
            float r2 = r2 - r7
            r13.set(r4, r5, r6, r2)
            int r2 = r0.f
            float r2 = (float) r2
            r4 = 1176256512(0x461c4000, float:10000.0)
            float r2 = r2 / r4
            r4 = 1135869952(0x43b40000, float:360.0)
            float r8 = r2 * r4
            r9 = 0
            r7 = 1132920832(0x43870000, float:270.0)
            r5 = r19
            r6 = r13
            r5.drawArc(r6, r7, r8, r9, r10)
        L_0x0168:
            android.graphics.drawable.Drawable r2 = r0.a
            if (r2 == 0) goto L_0x018b
            int r4 = r2.getIntrinsicWidth()
            int r5 = r0.c
            int r5 = r5 / 2
            if (r4 <= r5) goto L_0x0177
            goto L_0x017b
        L_0x0177:
            int r5 = r2.getIntrinsicWidth()
        L_0x017b:
            int r5 = r5 / 2
            int r4 = r1 - r5
            int r6 = r3 - r5
            int r1 = r1 + r5
            int r3 = r3 + r5
            r2.setBounds(r4, r6, r1, r3)
            r1 = r19
            r2.draw(r1)
        L_0x018b:
            boolean r1 = r18.a()
            if (r1 == 0) goto L_0x0194
            r18.invalidateSelf()
        L_0x0194:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a10.draw(android.graphics.Canvas):void");
    }

    public final int getIntrinsicHeight() {
        return this.c;
    }

    public final int getIntrinsicWidth() {
        return this.c;
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean onLevelChange(int i2) {
        if (this.f == 0 && i2 != 0) {
            this.j = i2;
            this.h = i2;
        }
        float f2 = ((float) i2) / 10000.0f;
        if (f2 == -0.1f) {
            this.d = false;
        } else if (f2 == -0.2f) {
            this.d = true;
        } else {
            if (i2 == 0) {
                this.o = System.currentTimeMillis() + ((long) 150);
            }
            if (a() || i2 < this.f || i2 == 10000) {
                this.f = i2;
                ValueAnimator valueAnimator = this.n;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
            } else {
                ValueAnimator valueAnimator2 = this.n;
                if (valueAnimator2 == null) {
                    ValueAnimator valueAnimator3 = new ValueAnimator();
                    valueAnimator3.addUpdateListener(new z00(0, (Object) this));
                    valueAnimator3.setDuration(200);
                    this.n = valueAnimator3;
                } else if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator valueAnimator4 = this.n;
                if (valueAnimator4 != null) {
                    valueAnimator4.setIntValues(new int[]{this.f, i2});
                }
                ValueAnimator valueAnimator5 = this.n;
                if (valueAnimator5 != null) {
                    valueAnimator5.start();
                }
            }
        }
        invalidateSelf();
        return true;
    }

    public final void setAlpha(int i2) {
    }

    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        if (!this.b && rect.width() > 0 && rect.width() < MathKt.roundToInt(((float) 56) * vo4.c().getDisplayMetrics().density)) {
            this.c = rect.width();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void setBounds(int i2, int i3, int i4, int i5) {
        super.setBounds(i2, i3, i4, i5);
        if (!this.b && getBounds().width() > 0 && getBounds().width() < MathKt.roundToInt(((float) 56) * vo4.c().getDisplayMetrics().density)) {
            this.c = getBounds().width();
        }
    }
}
