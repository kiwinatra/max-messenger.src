package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;

/* renamed from: fub  reason: default package */
public final class fub {
    public Size a;
    public Rect b;
    public int c;
    public Matrix d;
    public int e;
    public boolean f;
    public boolean g;
    public iub h;

    public final Matrix a(Size size, int i, Rect rect) {
        Matrix matrix = null;
        if (!f()) {
            return null;
        }
        Matrix matrix2 = new Matrix();
        if (f()) {
            matrix = new Matrix(this.d);
            matrix.postConcat(c(size, i));
        }
        matrix.invert(matrix2);
        Matrix matrix3 = new Matrix();
        matrix3.setRectToRect(new RectF(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (float) rect.width(), (float) rect.height()), new RectF(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
        matrix2.postConcat(matrix3);
        return matrix2;
    }

    public final Size b() {
        return grf.c(this.c) ? new Size(this.b.height(), this.b.width()) : new Size(this.b.width(), this.b.height());
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Matrix c(android.util.Size r8, int r9) {
        /*
            r7 = this;
            boolean r0 = r7.f()
            r1 = 0
            defpackage.bs0.r(r1, r0)
            android.util.Size r0 = r7.b()
            r1 = 1
            boolean r0 = defpackage.grf.d(r8, r1, r0)
            r2 = 0
            if (r0 == 0) goto L_0x0025
            android.graphics.RectF r9 = new android.graphics.RectF
            int r0 = r8.getWidth()
            float r0 = (float) r0
            int r8 = r8.getHeight()
            float r8 = (float) r8
            r9.<init>(r2, r2, r0, r8)
            goto L_0x00a7
        L_0x0025:
            android.graphics.RectF r0 = new android.graphics.RectF
            int r3 = r8.getWidth()
            float r3 = (float) r3
            int r4 = r8.getHeight()
            float r4 = (float) r4
            r0.<init>(r2, r2, r3, r4)
            android.util.Size r3 = r7.b()
            android.graphics.RectF r4 = new android.graphics.RectF
            int r5 = r3.getWidth()
            float r5 = (float) r5
            int r3 = r3.getHeight()
            float r3 = (float) r3
            r4.<init>(r2, r2, r5, r3)
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>()
            iub r3 = r7.h
            int r5 = r3.ordinal()
            if (r5 == 0) goto L_0x006e
            if (r5 == r1) goto L_0x006b
            r6 = 2
            if (r5 == r6) goto L_0x0068
            r6 = 3
            if (r5 == r6) goto L_0x006e
            r6 = 4
            if (r5 == r6) goto L_0x006b
            r6 = 5
            if (r5 == r6) goto L_0x0068
            r3.toString()
            android.graphics.Matrix$ScaleToFit r5 = android.graphics.Matrix.ScaleToFit.FILL
            goto L_0x0070
        L_0x0068:
            android.graphics.Matrix$ScaleToFit r5 = android.graphics.Matrix.ScaleToFit.END
            goto L_0x0070
        L_0x006b:
            android.graphics.Matrix$ScaleToFit r5 = android.graphics.Matrix.ScaleToFit.CENTER
            goto L_0x0070
        L_0x006e:
            android.graphics.Matrix$ScaleToFit r5 = android.graphics.Matrix.ScaleToFit.START
        L_0x0070:
            iub r6 = defpackage.iub.FIT_CENTER
            if (r3 == r6) goto L_0x0084
            iub r6 = defpackage.iub.FIT_START
            if (r3 == r6) goto L_0x0084
            iub r6 = defpackage.iub.FIT_END
            if (r3 != r6) goto L_0x007d
            goto L_0x0084
        L_0x007d:
            r2.setRectToRect(r0, r4, r5)
            r2.invert(r2)
            goto L_0x0087
        L_0x0084:
            r2.setRectToRect(r4, r0, r5)
        L_0x0087:
            r2.mapRect(r4)
            if (r9 != r1) goto L_0x00a6
            int r8 = r8.getWidth()
            float r8 = (float) r8
            r9 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 / r9
            android.graphics.RectF r9 = new android.graphics.RectF
            float r8 = r8 + r8
            float r0 = r4.right
            float r0 = r8 - r0
            float r1 = r4.top
            float r2 = r4.left
            float r8 = r8 - r2
            float r2 = r4.bottom
            r9.<init>(r0, r1, r8, r2)
            goto L_0x00a7
        L_0x00a6:
            r9 = r4
        L_0x00a7:
            android.graphics.RectF r8 = new android.graphics.RectF
            android.graphics.Rect r0 = r7.b
            r8.<init>(r0)
            int r0 = r7.c
            r1 = 0
            android.graphics.Matrix r8 = defpackage.grf.a(r8, r9, r0, r1)
            boolean r9 = r7.f
            if (r9 == 0) goto L_0x00ec
            boolean r9 = r7.g
            if (r9 == 0) goto L_0x00ec
            int r9 = r7.c
            boolean r9 = defpackage.grf.c(r9)
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r9 == 0) goto L_0x00db
            android.graphics.Rect r9 = r7.b
            int r9 = r9.centerX()
            float r9 = (float) r9
            android.graphics.Rect r7 = r7.b
            int r7 = r7.centerY()
            float r7 = (float) r7
            r8.preScale(r1, r0, r9, r7)
            goto L_0x00ec
        L_0x00db:
            android.graphics.Rect r9 = r7.b
            int r9 = r9.centerX()
            float r9 = (float) r9
            android.graphics.Rect r7 = r7.b
            int r7 = r7.centerY()
            float r7 = (float) r7
            r8.preScale(r0, r1, r9, r7)
        L_0x00ec:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fub.c(android.util.Size, int):android.graphics.Matrix");
    }

    public final Matrix d() {
        bs0.r((String) null, f());
        RectF rectF = new RectF(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (float) this.a.getWidth(), (float) this.a.getHeight());
        return grf.a(rectF, rectF, !this.g ? this.c : -kne.N(this.e), false);
    }

    public final RectF e(Size size, int i) {
        bs0.r((String) null, f());
        Matrix c2 = c(size, i);
        RectF rectF = new RectF(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (float) this.a.getWidth(), (float) this.a.getHeight());
        c2.mapRect(rectF);
        return rectF;
    }

    public final boolean f() {
        return (this.b == null || this.a == null || !(!this.g || this.e != -1)) ? false : true;
    }
}
