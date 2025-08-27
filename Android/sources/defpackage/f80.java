package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import kotlin.math.MathKt;

/* renamed from: f80  reason: default package */
public final class f80 extends View implements phf {
    public final Paint A0;
    public final Path B0 = new Path();
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public e80 F0;
    public final byte[] G0;
    public final int[] a = new int[2];
    public final float b;
    public final float c;
    public final float o;
    public final float v;
    public boolean v0;
    public byte[] w;
    public int w0;
    public byte[] x;
    public final Paint x0;
    public long y;
    public final Paint y0;
    public long z;
    public final Paint z0;

    public f80(Context context) {
        super(context, (AttributeSet) null, 0);
        setLayerType(1, (Paint) null);
        this.b = vo4.c().getDisplayMetrics().density * 5.0f;
        this.c = vo4.c().getDisplayMetrics().density * 2.0f;
        float f = vo4.c().getDisplayMetrics().density * 2.0f;
        this.o = f;
        this.v = vo4.c().getDisplayMetrics().density * 2.0f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(f);
        this.x0 = paint;
        Paint paint2 = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.z0 = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(style);
        this.A0 = paint3;
        this.y0 = new Paint(paint);
        ct.b(this);
        if (ct.y(getContext())) {
            setScaleX(-1.0f);
        }
        this.G0 = new byte[0];
    }

    private final int getDataWidth() {
        byte[] bArr = this.x;
        if (bArr == null) {
            return 0;
        }
        return (int) ((((float) (bArr.length - 1)) * this.c) + (((float) bArr.length) * this.o));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float a(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int[] r0 = r5.a
            r5.getLocationOnScreen(r0)
            r1 = 0
            r0 = r0[r1]
            float r6 = r6.getRawX()
            int r1 = r5.getWidth()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            if (r1 != 0) goto L_0x0017
        L_0x0015:
            r6 = r3
            goto L_0x0029
        L_0x0017:
            int r4 = r0 + r1
            float r4 = (float) r4
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 < 0) goto L_0x0020
            r6 = r2
            goto L_0x0029
        L_0x0020:
            float r0 = (float) r0
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 > 0) goto L_0x0026
            goto L_0x0015
        L_0x0026:
            float r6 = r6 - r0
            float r0 = (float) r1
            float r6 = r6 / r0
        L_0x0029:
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0035
            long r5 = r5.y
            r0 = 1
            long r5 = r5 - r0
            float r5 = (float) r5
            float r6 = r2 / r5
        L_0x0035:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f80.a(android.view.MotionEvent):float");
    }

    public final void b(long j, byte[] bArr) {
        this.w = bArr;
        this.x = null;
        this.y = j;
        this.z = 0;
        this.w0 = 0;
        onThemeChanged(fu4.k.e(getContext()).f());
        Path path = this.B0;
        if (!path.isEmpty()) {
            path.reset();
        }
        requestLayout();
        postInvalidate();
    }

    public final void c(float f, boolean z2) {
        this.z = (long) (f * ((float) this.y));
        this.v0 = z2;
        if (!z2) {
            this.E0 = false;
        }
        invalidate();
    }

    /* JADX INFO: finally extract failed */
    public final void onDraw(Canvas canvas) {
        float f;
        Path path = this.B0;
        if (!path.isEmpty()) {
            float measuredHeight = ((float) getMeasuredHeight()) / 2.0f;
            float f2 = (float) 6;
            float f3 = ((((float) this.z) / ((float) this.y)) * ((float) a81.f(f2, vo4.c().getDisplayMetrics().density, 2, getWidth()))) + ((float) MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
            boolean z2 = this.v0 || this.E0;
            float f4 = vo4.c().getDisplayMetrics().density * 4.0f;
            if (this.E0) {
                f4 += vo4.c().getDisplayMetrics().density * 2.0f;
            }
            if (z2) {
                canvas.save();
                float f5 = (vo4.c().getDisplayMetrics().density * 2.0f) + f4;
                f = f3 < f5 ? f5 : f3;
                if (f > ((float) getWidth()) - f5) {
                    f = ((float) getWidth()) - f5;
                }
            } else {
                f = 0.0f;
            }
            Paint paint = this.x0;
            if (!z2) {
                canvas.drawPath(path, paint);
                return;
            }
            int save = canvas.save();
            try {
                canvas.clipRect(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, f3, (float) canvas.getHeight());
                canvas.drawPath(path, this.y0);
                canvas.restoreToCount(save);
                int save2 = canvas.save();
                try {
                    canvas.clipRect(f3, c44.DEFAULT_ASPECT_RATIO, (float) canvas.getWidth(), (float) canvas.getHeight());
                    canvas.drawPath(path, paint);
                    canvas.restoreToCount(save2);
                    canvas.drawCircle(f, measuredHeight, this.v + f4, this.A0);
                    canvas.drawCircle(f, measuredHeight, f4, this.z0);
                } catch (Throwable th) {
                    canvas.restoreToCount(save2);
                    throw th;
                }
            } catch (Throwable th2) {
                canvas.restoreToCount(save);
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v25, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = 1
            byte[] r2 = r0.w
            if (r2 != 0) goto L_0x000b
            super.onMeasure(r17, r18)
            return
        L_0x000b:
            int r3 = android.view.View.MeasureSpec.getSize(r17)
            byte[] r4 = r0.x
            r5 = 6
            r6 = 0
            float r7 = r0.o
            float r8 = r0.c
            if (r4 == 0) goto L_0x001d
            int r4 = r0.w0
            if (r4 == r3) goto L_0x00a7
        L_0x001d:
            float r4 = (float) r3
            float r4 = r4 + r8
            float r9 = (float) r5
            android.content.res.Resources r10 = defpackage.vo4.c()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            float r10 = r10.density
            float r9 = r9 * r10
            int r9 = kotlin.math.MathKt.roundToInt((float) r9)
            int r9 = r9 * 2
            float r9 = (float) r9
            float r4 = r4 - r9
            float r9 = r8 + r7
            float r4 = r4 / r9
            int r4 = (int) r4
            if (r4 >= 0) goto L_0x004f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Width is very small "
            r2.<init>(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "f80"
            defpackage.z68.p(r4, r2)
            byte[] r2 = r0.G0
            goto L_0x00a3
        L_0x004f:
            int r9 = r2.length
            if (r9 != 0) goto L_0x0053
            goto L_0x00a3
        L_0x0053:
            android.animation.IntEvaluator r9 = new android.animation.IntEvaluator
            r9.<init>()
            byte[] r10 = new byte[r4]
            r11 = r6
        L_0x005b:
            if (r11 >= r4) goto L_0x00a2
            if (r11 == 0) goto L_0x009b
            int r12 = r2.length
            if (r12 != r1) goto L_0x0063
            goto L_0x009b
        L_0x0063:
            int r12 = r4 + -1
            if (r11 != r12) goto L_0x006c
            int r12 = r2.length
            int r12 = r12 - r1
            byte r12 = r2[r12]
            goto L_0x009d
        L_0x006c:
            float r12 = (float) r11
            float r13 = (float) r4
            float r12 = r12 / r13
            int r13 = r2.length
            int r13 = r13 - r1
            float r13 = (float) r13
            float r12 = r12 * r13
            int r13 = (int) r12
            int r14 = r13 + 1
            int r15 = kotlin.collections.ArraysKt.getLastIndex((byte[]) r2)
            if (r13 >= r15) goto L_0x0099
            int r15 = kotlin.collections.ArraysKt.getLastIndex((byte[]) r2)
            if (r14 >= r15) goto L_0x0099
            float r15 = (float) r13
            float r12 = r12 - r15
            byte r13 = r2[r13]
            byte r14 = r2[r14]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.Integer r12 = r9.evaluate(r12, r13, r14)
            int r12 = r12.intValue()
            goto L_0x009d
        L_0x0099:
            r12 = r6
            goto L_0x009d
        L_0x009b:
            byte r12 = r2[r6]
        L_0x009d:
            byte r12 = (byte) r12
            r10[r11] = r12
            int r11 = r11 + r1
            goto L_0x005b
        L_0x00a2:
            r2 = r10
        L_0x00a3:
            r0.x = r2
            r0.w0 = r3
        L_0x00a7:
            int r2 = r16.getDataWidth()
            float r3 = (float) r5
            android.content.res.Resources r4 = defpackage.vo4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            int r2 = defpackage.g63.b(r3, r4, r2)
            int r4 = android.view.View.MeasureSpec.getSize(r18)
            r0.setMeasuredDimension(r2, r4)
            byte[] r2 = r0.x
            int r4 = r16.getMeasuredHeight()
            float r4 = (float) r4
            r5 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r5
            android.graphics.Path r9 = r0.B0
            r9.reset()
            if (r2 == 0) goto L_0x0112
            int r10 = r2.length
            if (r10 != 0) goto L_0x00d7
            r10 = r1
            goto L_0x00d8
        L_0x00d7:
            r10 = r6
        L_0x00d8:
            r10 = r10 ^ r1
            if (r10 == 0) goto L_0x0112
            float r10 = r7 / r5
            android.content.res.Resources r11 = defpackage.vo4.c()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            float r11 = r11.density
            float r3 = r3 * r11
            int r3 = kotlin.math.MathKt.roundToInt((float) r3)
            float r3 = (float) r3
            float r10 = r10 + r3
            int r3 = r2.length
        L_0x00ef:
            if (r6 >= r3) goto L_0x0112
            byte r11 = r2[r6]
            float r11 = (float) r11
            int r12 = r16.getMeasuredHeight()
            float r12 = (float) r12
            r13 = 1123942400(0x42fe0000, float:127.0)
            float r12 = r12 / r13
            float r12 = r12 * r11
            float r11 = r0.b
            int r13 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            if (r13 >= 0) goto L_0x0104
            r12 = r11
        L_0x0104:
            float r12 = r12 / r5
            float r11 = r4 - r12
            float r12 = r12 + r4
            r9.moveTo(r10, r11)
            r9.lineTo(r10, r12)
            float r10 = r10 + r7
            float r10 = r10 + r8
            int r6 = r6 + r1
            goto L_0x00ef
        L_0x0112:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f80.onMeasure(int, int):void");
    }

    public final void onThemeChanged(k2b k2b) {
        boolean z2 = this.D0;
        js9 js9 = fu4.k;
        ws0 e = z2 ? js9.e(getContext()).f().a().e() : js9.e(getContext()).f().a().i();
        Paint paint = this.x0;
        qs0 qs0 = e.a;
        paint.setColor(qs0.f);
        this.z0.setColor(qs0.e);
        this.A0.setColor(e.d.b);
        this.y0.setColor(qs0.e);
        invalidate();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        if (r0 != 3) goto L_0x0088;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            boolean r0 = r11.v0
            if (r0 != 0) goto L_0x000e
            boolean r0 = r11.E0
            if (r0 == 0) goto L_0x0009
            goto L_0x000e
        L_0x0009:
            boolean r11 = super.onTouchEvent(r12)
            return r11
        L_0x000e:
            int r0 = r12.getAction()
            r1 = 1
            if (r0 == 0) goto L_0x0076
            r2 = 0
            if (r0 == r1) goto L_0x003e
            r3 = 2
            if (r0 == r3) goto L_0x001f
            r3 = 3
            if (r0 == r3) goto L_0x003e
            goto L_0x0088
        L_0x001f:
            boolean r0 = r11.E0
            if (r0 != 0) goto L_0x0024
            goto L_0x0088
        L_0x0024:
            boolean r0 = r11.C0
            if (r0 == 0) goto L_0x002a
            r11.C0 = r2
        L_0x002a:
            e80 r0 = r11.F0
            if (r0 == 0) goto L_0x0088
            float r11 = r11.a(r12)
            wie r0 = (defpackage.wie) r0
            java.lang.Object r12 = r0.b
            q50 r12 = (defpackage.q50) r12
            f80 r12 = r12.A0
            r12.c(r11, r1)
            goto L_0x0088
        L_0x003e:
            r11.C0 = r2
            r11.E0 = r2
            e80 r0 = r11.F0
            if (r0 == 0) goto L_0x006e
            float r12 = r11.a(r12)
            wie r0 = (defpackage.wie) r0
            java.lang.Object r0 = r0.b
            q50 r0 = (defpackage.q50) r0
            java.lang.Long r3 = r0.M0
            if (r3 == 0) goto L_0x006e
            long r9 = r3.longValue()
            java.lang.Long r3 = r0.L0
            if (r3 == 0) goto L_0x006e
            long r5 = r3.longValue()
            si9 r3 = new si9
            float r4 = (float) r9
            float r12 = r12 * r4
            long r7 = (long) r12
            r4 = r3
            r4.<init>(r5, r7, r9)
            kotlin.jvm.functions.Function1 r12 = r0.a
            r12.invoke(r3)
        L_0x006e:
            android.view.ViewParent r11 = r11.getParent()
            r11.requestDisallowInterceptTouchEvent(r2)
            goto L_0x0088
        L_0x0076:
            r11.C0 = r1
            r11.E0 = r1
            android.view.ViewParent r0 = r11.getParent()
            r0.requestDisallowInterceptTouchEvent(r1)
            e80 r0 = r11.F0
            if (r0 == 0) goto L_0x0088
            r11.a(r12)
        L_0x0088:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f80.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setInInput(boolean z2) {
    }

    public final void setIncomingMessage(boolean z2) {
        this.D0 = z2;
    }

    public final void setListener(e80 e80) {
        this.F0 = e80;
    }
}
