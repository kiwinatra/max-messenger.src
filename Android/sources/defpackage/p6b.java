package defpackage;

import android.content.Context;
import android.net.Uri;

/* renamed from: p6b  reason: default package */
public final class p6b extends hk0 {
    public final Uri c;
    public final Context d;

    public p6b(Context context, Uri uri) {
        this.c = uri;
        this.d = context;
    }

    public final qx0 b() {
        return new uae(String.valueOf(this.c.hashCode()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x008e A[SYNTHETIC, Splitter:B:20:0x008e] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00be A[Catch:{ all -> 0x00ac, all -> 0x007f }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(android.graphics.Bitmap r17) {
        /*
            r16 = this;
            r0 = r16
            android.net.Uri r1 = r0.c
            int r2 = defpackage.j4b.A
            java.lang.String r2 = "r"
            android.content.Context r0 = r0.d
            android.content.ContentResolver r0 = r0.getContentResolver()
            r3 = 1
            r4 = 0
            android.os.ParcelFileDescriptor r5 = r0.openFileDescriptor(r1, r2)     // Catch:{ IOException -> 0x0086, all -> 0x0084 }
            java.io.FileDescriptor r6 = r5.getFileDescriptor()     // Catch:{ IOException -> 0x0082 }
            int r7 = defpackage.o5a.f     // Catch:{ IOException -> 0x0082 }
            ab5 r7 = new ab5     // Catch:{ IOException -> 0x0082 }
            r7.<init>((java.io.FileDescriptor) r6)     // Catch:{ IOException -> 0x0082 }
            java.lang.String r6 = "Orientation"
            int r6 = r7.e(r3, r6)     // Catch:{ IOException -> 0x0082 }
            r5.close()     // Catch:{ IOException -> 0x0082 }
            android.os.ParcelFileDescriptor r5 = r0.openFileDescriptor(r1, r2)     // Catch:{ IOException -> 0x0082 }
            java.io.FileDescriptor r7 = r5.getFileDescriptor()     // Catch:{ IOException -> 0x0082 }
            android.graphics.Point r7 = defpackage.o5a.l(r7, r6)     // Catch:{ IOException -> 0x0082 }
            r5.close()     // Catch:{ IOException -> 0x0082 }
            android.graphics.BitmapFactory$Options r8 = new android.graphics.BitmapFactory$Options     // Catch:{ IOException -> 0x0082 }
            r8.<init>()     // Catch:{ IOException -> 0x0082 }
            r9 = 2048(0x800, float:2.87E-42)
            int r7 = defpackage.o5a.q(r7, r9, r9)     // Catch:{ IOException -> 0x0082 }
            r8.inSampleSize = r7     // Catch:{ IOException -> 0x0082 }
            android.os.ParcelFileDescriptor r5 = r0.openFileDescriptor(r1, r2)     // Catch:{ IOException -> 0x0082 }
            java.io.FileDescriptor r0 = r5.getFileDescriptor()     // Catch:{ IOException -> 0x0082 }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFileDescriptor(r0, r4, r8)     // Catch:{ IOException -> 0x0082 }
            r5.close()     // Catch:{ IOException -> 0x0082 }
            int r2 = defpackage.o5a.w(r6)     // Catch:{ IOException -> 0x0082 }
            if (r2 != 0) goto L_0x005e
        L_0x0059:
            defpackage.j4b.j(r5)
            goto L_0x00c7
        L_0x005e:
            android.graphics.Matrix r14 = new android.graphics.Matrix     // Catch:{ IOException -> 0x0082 }
            r14.<init>()     // Catch:{ IOException -> 0x0082 }
            float r2 = (float) r2     // Catch:{ IOException -> 0x0082 }
            r14.setRotate(r2)     // Catch:{ IOException -> 0x0082 }
            int r12 = r0.getWidth()     // Catch:{ IOException -> 0x0082 }
            int r13 = r0.getHeight()     // Catch:{ IOException -> 0x0082 }
            r15 = 1
            r10 = 0
            r11 = 0
            r9 = r0
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ IOException -> 0x0082 }
            r0.recycle()     // Catch:{ IOException -> 0x0082 }
            defpackage.j4b.j(r5)
            r0 = r2
            goto L_0x00c7
        L_0x007f:
            r0 = move-exception
            r4 = r5
            goto L_0x00e3
        L_0x0082:
            r0 = move-exception
            goto L_0x0088
        L_0x0084:
            r0 = move-exception
            goto L_0x00e3
        L_0x0086:
            r0 = move-exception
            r5 = r4
        L_0x0088:
            boolean r2 = r0 instanceof java.io.FileNotFoundException     // Catch:{ all -> 0x007f }
            java.lang.String r6 = "j4b"
            if (r2 == 0) goto L_0x00be
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x007f }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x00ac }
            r1.<init>(r0)     // Catch:{ all -> 0x00ac }
            boolean r1 = r1.exists()     // Catch:{ all -> 0x00ac }
            if (r1 != 0) goto L_0x00ae
            java.lang.String r1 = "file by path %s not exists"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x00ac }
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)     // Catch:{ all -> 0x00ac }
            defpackage.z68.n(r6, r4, r1, r0)     // Catch:{ all -> 0x00ac }
        L_0x00aa:
            r0 = r4
            goto L_0x0059
        L_0x00ac:
            r0 = move-exception
            goto L_0x00b8
        L_0x00ae:
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x00ac }
            r1.<init>()     // Catch:{ all -> 0x00ac }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r0, r1)     // Catch:{ all -> 0x00ac }
            goto L_0x0059
        L_0x00b8:
            java.lang.String r1 = "getBitmapFromExternalStorage fail"
            defpackage.z68.o(r6, r1, r0)     // Catch:{ all -> 0x007f }
            goto L_0x00aa
        L_0x00be:
            java.lang.String r1 = "getBitmapFromPath: failed to get bitmap"
            defpackage.z68.f(r6, r1, r0)     // Catch:{ all -> 0x007f }
            defpackage.j4b.j(r5)
            r0 = r4
        L_0x00c7:
            if (r0 == 0) goto L_0x00e2
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r2 = r17
            r1.<init>(r2)
            int r2 = r17.getWidth()
            float r2 = (float) r2
            int r3 = r0.getWidth()
            float r3 = (float) r3
            float r2 = r2 / r3
            r1.scale(r2, r2)
            r2 = 0
            r1.drawBitmap(r0, r2, r2, r4)
        L_0x00e2:
            return
        L_0x00e3:
            defpackage.j4b.j(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p6b.c(android.graphics.Bitmap):void");
    }
}
