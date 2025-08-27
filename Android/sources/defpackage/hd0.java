package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;

/* renamed from: hd0  reason: default package */
public final class hd0 extends hk0 {
    public final dz9 c = new dz9(1);
    public final Paint d;
    public final Matrix e;

    public hd0() {
        Paint paint = new Paint(1);
        paint.setAntiAlias(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.d = paint;
        this.e = new Matrix();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x006e, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006f, code lost:
        kotlin.io.CloseableKt.closeFinally(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0072, code lost:
        throw r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.y33 a(android.graphics.Bitmap r8, defpackage.ynb r9) {
        /*
            r7 = this;
            int r0 = r8.getWidth()
            int r0 = r0 / 2
            dz9 r1 = r7.c
            java.lang.Object r2 = r1.a(r0)
            if (r2 != 0) goto L_0x0038
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            int r5 = r8.getHeight()
            float r5 = (float) r5
            float r5 = r5 / r4
            float r4 = (float) r0
            android.graphics.Path$Direction r6 = android.graphics.Path.Direction.CW
            r2.addCircle(r3, r5, r4, r6)
            android.graphics.Path$FillType r3 = android.graphics.Path.FillType.INVERSE_WINDING
            r2.setFillType(r3)
            int r3 = r1.b(r0)
            int[] r4 = r1.b
            r4[r3] = r0
            java.lang.Object[] r0 = r1.c
            r0[r3] = r2
        L_0x0038:
            android.graphics.Path r2 = (android.graphics.Path) r2
            int r0 = r8.getWidth()
            int r1 = r8.getHeight()
            r9.getClass()
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            y33 r9 = r9.c(r0, r1, r3)
            r0 = 0
            if (r9 == 0) goto L_0x0073
            android.graphics.Canvas r1 = new android.graphics.Canvas     // Catch:{ all -> 0x006c }
            java.lang.Object r3 = r9.e0()     // Catch:{ all -> 0x006c }
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3     // Catch:{ all -> 0x006c }
            r1.<init>(r3)     // Catch:{ all -> 0x006c }
            android.graphics.Matrix r3 = r7.e     // Catch:{ all -> 0x006c }
            r1.drawBitmap(r8, r3, r0)     // Catch:{ all -> 0x006c }
            android.graphics.Paint r7 = r7.d     // Catch:{ all -> 0x006c }
            r1.drawPath(r2, r7)     // Catch:{ all -> 0x006c }
            y33 r7 = r9.n()     // Catch:{ all -> 0x006c }
            kotlin.io.CloseableKt.closeFinally(r9, r0)
            r0 = r7
            goto L_0x0073
        L_0x006c:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x006e }
        L_0x006e:
            r8 = move-exception
            kotlin.io.CloseableKt.closeFinally(r9, r7)
            throw r8
        L_0x0073:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hd0.a(android.graphics.Bitmap, ynb):y33");
    }

    public final qx0 b() {
        return new uae("AvatarAsCirclePostProcessor");
    }
}
