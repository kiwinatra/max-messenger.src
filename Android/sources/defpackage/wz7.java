package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;

/* renamed from: wz7  reason: default package */
public final class wz7 implements View.OnTouchListener {
    public static final int A0 = ViewConfiguration.getTapTimeout();
    public final float[] X;
    public final float[] Y;
    public boolean Z;
    public final t90 a;
    public final AccelerateInterpolator b = new AccelerateInterpolator();
    public final View c;
    public cf o;
    public final float[] v;
    public boolean v0;
    public final float[] w;
    public boolean w0;
    public final int x;
    public boolean x0;
    public final int y;
    public boolean y0;
    public final float[] z;
    public final ListView z0;

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, t90] */
    public wz7(ListView listView) {
        ? obj = new Object();
        obj.e = Long.MIN_VALUE;
        obj.g = -1;
        obj.f = 0;
        this.a = obj;
        float[] fArr = {c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO};
        this.v = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.w = fArr2;
        float[] fArr3 = {c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO};
        this.z = fArr3;
        float[] fArr4 = {c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO};
        this.X = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.Y = fArr5;
        this.c = listView;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((float) ((int) ((1575.0f * f) + 0.5f))) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((float) ((int) ((f * 315.0f) + 0.5f))) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.x = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.y = A0;
        obj.a = 500;
        obj.b = 500;
        this.z0 = listView;
    }

    public static float b(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.v
            r0 = r0[r4]
            float[] r1 = r3.w
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.b
            if (r6 >= 0) goto L_0x0025
            float r5 = -r5
            float r5 = r0.getInterpolation(r5)
            float r5 = -r5
            goto L_0x002d
        L_0x0025:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x0036
            float r5 = r0.getInterpolation(r5)
        L_0x002d:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = b(r5, r6, r0)
            goto L_0x0037
        L_0x0036:
            r5 = r2
        L_0x0037:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x003c
            return r2
        L_0x003c:
            float[] r0 = r3.z
            r0 = r0[r4]
            float[] r1 = r3.X
            r1 = r1[r4]
            float[] r3 = r3.Y
            r3 = r3[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L_0x0051
            float r5 = r5 * r0
            float r3 = b(r5, r1, r3)
            return r3
        L_0x0051:
            float r4 = -r5
            float r4 = r4 * r0
            float r3 = b(r4, r1, r3)
            float r3 = -r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wz7.a(int, float, float, float):float");
    }

    public final float c(float f, float f2) {
        if (f2 == c44.DEFAULT_ASPECT_RATIO) {
            return c44.DEFAULT_ASPECT_RATIO;
        }
        int i = this.x;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= c44.DEFAULT_ASPECT_RATIO) {
                    return 1.0f - (f / f2);
                }
                if (!this.x0 || i != 1) {
                    return c44.DEFAULT_ASPECT_RATIO;
                }
                return 1.0f;
            }
        } else if (i == 2 && f < c44.DEFAULT_ASPECT_RATIO) {
            return f / (-f2);
        }
        return c44.DEFAULT_ASPECT_RATIO;
    }

    public final void d() {
        int i = 0;
        if (this.v0) {
            this.x0 = false;
            return;
        }
        t90 t90 = this.a;
        t90.getClass();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (currentAnimationTimeMillis - t90.e);
        int i3 = t90.b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        t90.i = i;
        t90.h = t90.a(currentAnimationTimeMillis);
        t90.g = currentAnimationTimeMillis;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
        r7 = r7.z0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e() {
        /*
            r7 = this;
            t90 r0 = r7.a
            float r1 = r0.d
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.c
            java.lang.Math.abs(r0)
            r0 = 0
            if (r1 == 0) goto L_0x004a
            android.widget.ListView r7 = r7.z0
            int r2 = r7.getCount()
            if (r2 != 0) goto L_0x001b
            goto L_0x004a
        L_0x001b:
            int r3 = r7.getChildCount()
            int r4 = r7.getFirstVisiblePosition()
            int r5 = r4 + r3
            r6 = 1
            if (r1 <= 0) goto L_0x003a
            if (r5 < r2) goto L_0x0049
            int r3 = r3 - r6
            android.view.View r1 = r7.getChildAt(r3)
            int r1 = r1.getBottom()
            int r7 = r7.getHeight()
            if (r1 > r7) goto L_0x0049
            goto L_0x004a
        L_0x003a:
            if (r1 >= 0) goto L_0x004a
            if (r4 > 0) goto L_0x0049
            android.view.View r7 = r7.getChildAt(r0)
            int r7 = r7.getTop()
            if (r7 < 0) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r0 = r6
        L_0x004a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wz7.e():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x007c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.y0
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r8 = 3
            if (r0 == r8) goto L_0x0016
            goto L_0x007c
        L_0x0016:
            r7.d()
            goto L_0x007c
        L_0x001a:
            r7.w0 = r2
            r7.Z = r1
        L_0x001e:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r7.c
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r1, r0, r3, r5)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r2, r9, r8, r3)
            t90 r9 = r7.a
            r9.c = r0
            r9.d = r8
            boolean r8 = r7.x0
            if (r8 != 0) goto L_0x007c
            boolean r8 = r7.e()
            if (r8 == 0) goto L_0x007c
            cf r8 = r7.o
            if (r8 != 0) goto L_0x0060
            cf r8 = new cf
            r9 = 4
            r8.<init>(r9, r7)
            r7.o = r8
        L_0x0060:
            r7.x0 = r2
            r7.v0 = r2
            boolean r8 = r7.Z
            if (r8 != 0) goto L_0x0075
            int r8 = r7.y
            if (r8 <= 0) goto L_0x0075
            cf r9 = r7.o
            long r5 = (long) r8
            java.util.WeakHashMap r8 = defpackage.gag.a
            r4.postOnAnimationDelayed(r9, r5)
            goto L_0x007a
        L_0x0075:
            cf r8 = r7.o
            r8.run()
        L_0x007a:
            r7.Z = r2
        L_0x007c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wz7.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
