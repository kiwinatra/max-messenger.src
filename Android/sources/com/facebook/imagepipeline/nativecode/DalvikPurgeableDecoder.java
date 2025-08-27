package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import java.util.List;
import kotlin.Unit;

@cr4
public abstract class DalvikPurgeableDecoder implements znb {
    public static final byte[] b = {-1, -39};
    public final yn0 a;

    @br4
    public static class OreoUtils {
        private OreoUtils() {
        }
    }

    static {
        List list = fa7.a;
        o5a.P("imagepipeline");
    }

    public DalvikPurgeableDecoder() {
        if (zn0.c == null) {
            synchronized (zn0.class) {
                try {
                    if (zn0.c == null) {
                        zn0.c = new yn0(zn0.b, zn0.a);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.a = zn0.c;
    }

    public static boolean d(int i, y33 y33) {
        e69 e69 = (e69) y33.e0();
        return i >= 2 && e69.o(i + -2) == -1 && e69.o(i - 1) == -39;
    }

    @cr4
    private static native void nativePinBitmap(Bitmap bitmap);

    public final y33 a(j55 j55, Bitmap.Config config) {
        int i = j55.y;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i;
        options.inMutable = true;
        options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        y33 o = y33.o(j55.a);
        o.getClass();
        try {
            return f(b(o, options));
        } finally {
            y33.U(o);
        }
    }

    public abstract Bitmap b(y33 y33, BitmapFactory.Options options);

    public abstract Bitmap c(y33 y33, int i, BitmapFactory.Options options);

    public final y33 e(j55 j55, Bitmap.Config config, int i, ColorSpace colorSpace) {
        int i2 = j55.y;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i2;
        options.inMutable = true;
        if (colorSpace == null) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        options.inPreferredColorSpace = colorSpace;
        y33 o = y33.o(j55.a);
        o.getClass();
        try {
            return f(c(o, i, options));
        } finally {
            y33.U(o);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        r0 = defpackage.vo0.d(r8);
        r8.recycle();
        r8 = java.util.Locale.US;
        r8 = r7.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        monitor-enter(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r1 = r8.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
        monitor-exit(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
        r2 = r7.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0046, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r3 = r2.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0049, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004a, code lost:
        r8 = r7.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004c, code lost:
        monitor-enter(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r2 = r8.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004f, code lost:
        monitor-exit(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0050, code lost:
        r7 = r7.a.b();
        r8 = defpackage.a81.n("Attempted to pin a bitmap of size ", r0, " bytes. The current pool count is ", r1, ", the current pool size is ");
        r8.append(r3);
        r8.append(" bytes. The current pool max count is ");
        r8.append(r2);
        r8.append(", the current pool max size is ");
        r8.append(r7);
        r8.append(" bytes.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0081, code lost:
        throw new java.lang.RuntimeException(r8.toString());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.jd4 f(android.graphics.Bitmap r8) {
        /*
            r7 = this;
            r8.getClass()
            nativePinBitmap(r8)     // Catch:{ Exception -> 0x008d }
            yn0 r0 = r7.a
            monitor-enter(r0)
            int r1 = defpackage.vo0.d(r8)     // Catch:{ all -> 0x0032 }
            int r2 = r0.a     // Catch:{ all -> 0x0032 }
            int r3 = r0.b     // Catch:{ all -> 0x0032 }
            if (r2 >= r3) goto L_0x0034
            long r3 = r0.d     // Catch:{ all -> 0x0032 }
            long r5 = (long) r1     // Catch:{ all -> 0x0032 }
            long r3 = r3 + r5
            int r1 = r0.c     // Catch:{ all -> 0x0032 }
            long r5 = (long) r1     // Catch:{ all -> 0x0032 }
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 > 0) goto L_0x0034
            int r2 = r2 + 1
            r0.a = r2     // Catch:{ all -> 0x0032 }
            r0.d = r3     // Catch:{ all -> 0x0032 }
            monitor-exit(r0)
            yn0 r7 = r7.a
            java.lang.Object r7 = r7.e
            xv1 r7 = (defpackage.xv1) r7
            t9a r0 = defpackage.y33.w
            jd4 r7 = defpackage.y33.q0(r8, r7, r0)
            return r7
        L_0x0032:
            r7 = move-exception
            goto L_0x008b
        L_0x0034:
            monitor-exit(r0)
            int r0 = defpackage.vo0.d(r8)
            r8.recycle()
            java.util.Locale r8 = java.util.Locale.US
            yn0 r8 = r7.a
            monitor-enter(r8)
            int r1 = r8.a     // Catch:{ all -> 0x0088 }
            monitor-exit(r8)
            yn0 r2 = r7.a
            monitor-enter(r2)
            long r3 = r2.d     // Catch:{ all -> 0x0085 }
            monitor-exit(r2)
            yn0 r8 = r7.a
            monitor-enter(r8)
            int r2 = r8.b     // Catch:{ all -> 0x0082 }
            monitor-exit(r8)
            yn0 r7 = r7.a
            int r7 = r7.b()
            java.lang.String r8 = "Attempted to pin a bitmap of size "
            java.lang.String r5 = " bytes. The current pool count is "
            java.lang.String r6 = ", the current pool size is "
            java.lang.StringBuilder r8 = defpackage.a81.n(r8, r0, r5, r1, r6)
            r8.append(r3)
            java.lang.String r0 = " bytes. The current pool max count is "
            r8.append(r0)
            r8.append(r2)
            java.lang.String r0 = ", the current pool max size is "
            r8.append(r0)
            r8.append(r7)
            java.lang.String r7 = " bytes."
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            com.facebook.imagepipeline.common.TooManyBitmapsException r8 = new com.facebook.imagepipeline.common.TooManyBitmapsException
            r8.<init>(r7)
            throw r8
        L_0x0082:
            r7 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0082 }
            throw r7
        L_0x0085:
            r7 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0085 }
            throw r7
        L_0x0088:
            r7 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0088 }
            throw r7
        L_0x008b:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r7
        L_0x008d:
            r7 = move-exception
            r8.recycle()
            defpackage.n54.I(r7)
            r7 = 0
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder.f(android.graphics.Bitmap):jd4");
    }
}
