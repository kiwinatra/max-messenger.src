package defpackage;

import android.graphics.Bitmap;

/* renamed from: ynb  reason: default package */
public abstract class ynb {
    public static void a(int i, int i2) {
        boolean z = false;
        cvg.m("width must be > 0", i > 0);
        if (i2 > 0) {
            z = true;
        }
        cvg.m("height must be > 0", z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.jd4 b(android.graphics.Bitmap r10, int r11, int r12, int r13, int r14, android.graphics.Matrix r15) {
        /*
            r9 = this;
            java.lang.String r0 = "Source bitmap cannot be null"
            defpackage.cvg.p(r10, r0)
            r0 = 0
            r1 = 1
            if (r11 < 0) goto L_0x000b
            r2 = r1
            goto L_0x000c
        L_0x000b:
            r2 = r0
        L_0x000c:
            java.lang.String r3 = "x must be >= 0"
            defpackage.cvg.m(r3, r2)
            if (r12 < 0) goto L_0x0015
            r2 = r1
            goto L_0x0016
        L_0x0015:
            r2 = r0
        L_0x0016:
            java.lang.String r3 = "y must be >= 0"
            defpackage.cvg.m(r3, r2)
            a(r13, r14)
            int r2 = r11 + r13
            int r3 = r10.getWidth()
            if (r2 > r3) goto L_0x0028
            r3 = r1
            goto L_0x0029
        L_0x0028:
            r3 = r0
        L_0x0029:
            java.lang.String r4 = "x + width must be <= bitmap.width()"
            defpackage.cvg.m(r4, r3)
            int r3 = r12 + r14
            int r4 = r10.getHeight()
            if (r3 > r4) goto L_0x0038
            r4 = r1
            goto L_0x0039
        L_0x0038:
            r4 = r0
        L_0x0039:
            java.lang.String r5 = "y + height must be <= bitmap.height()"
            defpackage.cvg.m(r5, r4)
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>(r11, r12, r2, r3)
            android.graphics.RectF r11 = new android.graphics.RectF
            float r12 = (float) r13
            float r2 = (float) r14
            r3 = 0
            r11.<init>(r3, r3, r12, r2)
            android.graphics.Bitmap$Config r12 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap$Config r2 = r10.getConfig()
            if (r2 == 0) goto L_0x0060
            int[] r3 = defpackage.xnb.a
            int r2 = r2.ordinal()
            r2 = r3[r2]
            if (r2 == r1) goto L_0x0065
            r3 = 2
            if (r2 == r3) goto L_0x0062
        L_0x0060:
            r2 = r12
            goto L_0x0067
        L_0x0062:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ALPHA_8
            goto L_0x0067
        L_0x0065:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.RGB_565
        L_0x0067:
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r5 = 0
            if (r15 == 0) goto L_0x00f9
            boolean r6 = r15.isIdentity()
            if (r6 == 0) goto L_0x0074
            goto L_0x00f9
        L_0x0074:
            boolean r13 = r15.rectStaysRect()
            r13 = r13 ^ r1
            android.graphics.RectF r14 = new android.graphics.RectF
            r14.<init>()
            r15.mapRect(r14, r11)
            float r6 = r14.width()
            int r6 = java.lang.Math.round(r6)
            float r7 = r14.height()
            int r7 = java.lang.Math.round(r7)
            if (r13 == 0) goto L_0x0094
            r2 = r12
        L_0x0094:
            if (r13 != 0) goto L_0x009f
            boolean r8 = r10.hasAlpha()
            if (r8 == 0) goto L_0x009d
            goto L_0x009f
        L_0x009d:
            r8 = r0
            goto L_0x00a0
        L_0x009f:
            r8 = r1
        L_0x00a0:
            a(r6, r7)
            y33 r9 = r9.c(r6, r7, r2)
            java.lang.Object r6 = r9.e0()
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            r6.setHasAlpha(r8)
            if (r2 != r12) goto L_0x00b7
            if (r8 != 0) goto L_0x00b7
            r6.eraseColor(r3)
        L_0x00b7:
            jd4 r9 = (defpackage.jd4) r9
            java.lang.Object r12 = r9.e0()
            android.graphics.Bitmap r12 = (android.graphics.Bitmap) r12
            int r2 = r10.getDensity()
            r12.setDensity(r2)
            boolean r2 = r10.hasAlpha()
            r12.setHasAlpha(r2)
            boolean r2 = r10.isPremultiplied()
            r12.setPremultiplied(r2)
            android.graphics.Canvas r12 = new android.graphics.Canvas
            java.lang.Object r2 = r9.e0()
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            r12.<init>(r2)
            float r2 = r14.left
            float r2 = -r2
            float r14 = r14.top
            float r14 = -r14
            r12.translate(r2, r14)
            r12.concat(r15)
            android.graphics.Paint r14 = new android.graphics.Paint
            r14.<init>()
            r14.setFilterBitmap(r0)
            if (r13 == 0) goto L_0x013d
            r14.setAntiAlias(r1)
            goto L_0x013d
        L_0x00f9:
            boolean r15 = r10.hasAlpha()
            a(r13, r14)
            y33 r9 = r9.c(r13, r14, r2)
            java.lang.Object r13 = r9.e0()
            android.graphics.Bitmap r13 = (android.graphics.Bitmap) r13
            r13.setHasAlpha(r15)
            if (r2 != r12) goto L_0x0114
            if (r15 != 0) goto L_0x0114
            r13.eraseColor(r3)
        L_0x0114:
            jd4 r9 = (defpackage.jd4) r9
            java.lang.Object r12 = r9.e0()
            android.graphics.Bitmap r12 = (android.graphics.Bitmap) r12
            int r13 = r10.getDensity()
            r12.setDensity(r13)
            boolean r13 = r10.hasAlpha()
            r12.setHasAlpha(r13)
            boolean r13 = r10.isPremultiplied()
            r12.setPremultiplied(r13)
            android.graphics.Canvas r12 = new android.graphics.Canvas
            java.lang.Object r13 = r9.e0()
            android.graphics.Bitmap r13 = (android.graphics.Bitmap) r13
            r12.<init>(r13)
            r14 = r5
        L_0x013d:
            r12.drawBitmap(r10, r4, r11, r14)
            r12.setBitmap(r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ynb.b(android.graphics.Bitmap, int, int, int, int, android.graphics.Matrix):jd4");
    }

    public abstract y33 c(int i, int i2, Bitmap.Config config);
}
