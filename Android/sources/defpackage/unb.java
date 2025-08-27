package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;

/* renamed from: unb  reason: default package */
public final class unb extends Surface {
    public static int o;
    public static boolean v;
    public final boolean a;
    public final vx4 b;
    public boolean c;

    public unb(vx4 vx4, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.b = vx4;
        this.a = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0041 A[Catch:{ all -> 0x0053 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004d A[Catch:{ all -> 0x0053 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean a(android.content.Context r7) {
        /*
            java.lang.Class<unb> r0 = defpackage.unb.class
            monitor-enter(r0)
            boolean r1 = v     // Catch:{ all -> 0x0053 }
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0055
            int r1 = defpackage.v0g.a     // Catch:{ all -> 0x0053 }
            r4 = 24
            if (r1 >= r4) goto L_0x0011
        L_0x000f:
            r7 = r2
            goto L_0x003f
        L_0x0011:
            r4 = 26
            if (r1 >= r4) goto L_0x002a
            java.lang.String r5 = "samsung"
            java.lang.String r6 = defpackage.v0g.c     // Catch:{ all -> 0x0053 }
            boolean r5 = r5.equals(r6)     // Catch:{ all -> 0x0053 }
            if (r5 != 0) goto L_0x000f
            java.lang.String r5 = "XT1650"
            java.lang.String r6 = defpackage.v0g.d     // Catch:{ all -> 0x0053 }
            boolean r5 = r5.equals(r6)     // Catch:{ all -> 0x0053 }
            if (r5 == 0) goto L_0x002a
            goto L_0x000f
        L_0x002a:
            if (r1 >= r4) goto L_0x0039
            android.content.pm.PackageManager r7 = r7.getPackageManager()     // Catch:{ all -> 0x0053 }
            java.lang.String r1 = "android.hardware.vr.high_performance"
            boolean r7 = r7.hasSystemFeature(r1)     // Catch:{ all -> 0x0053 }
            if (r7 != 0) goto L_0x0039
            goto L_0x000f
        L_0x0039:
            java.lang.String r7 = "EGL_EXT_protected_content"
            boolean r7 = defpackage.ld8.V(r7)     // Catch:{ all -> 0x0053 }
        L_0x003f:
            if (r7 == 0) goto L_0x004d
            java.lang.String r7 = "EGL_KHR_surfaceless_context"
            boolean r7 = defpackage.ld8.V(r7)     // Catch:{ all -> 0x0053 }
            if (r7 == 0) goto L_0x004b
            r7 = r3
            goto L_0x004e
        L_0x004b:
            r7 = 2
            goto L_0x004e
        L_0x004d:
            r7 = r2
        L_0x004e:
            o = r7     // Catch:{ all -> 0x0053 }
            v = r3     // Catch:{ all -> 0x0053 }
            goto L_0x0055
        L_0x0053:
            r7 = move-exception
            goto L_0x005c
        L_0x0055:
            int r7 = o     // Catch:{ all -> 0x0053 }
            if (r7 == 0) goto L_0x005a
            r2 = r3
        L_0x005a:
            monitor-exit(r0)
            return r2
        L_0x005c:
            monitor-exit(r0)     // Catch:{ all -> 0x0053 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.unb.a(android.content.Context):boolean");
    }

    public static unb b(Context context, boolean z) {
        boolean z2 = false;
        n79.n(!z || a(context));
        vx4 vx4 = new vx4("ExoPlayer:PlaceholderSurface", 1);
        int i = z ? o : 0;
        vx4.start();
        Handler handler = new Handler(vx4.getLooper(), vx4);
        vx4.b = handler;
        vx4.v = new dz4(handler, 1);
        synchronized (vx4) {
            vx4.b.obtainMessage(1, i, 0).sendToTarget();
            while (((unb) vx4.w) == null && vx4.o == null && vx4.c == null) {
                try {
                    vx4.wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = vx4.o;
        if (runtimeException == null) {
            Error error = vx4.c;
            if (error == null) {
                unb unb = (unb) vx4.w;
                unb.getClass();
                return unb;
            }
            throw error;
        }
        throw runtimeException;
    }

    public final void release() {
        super.release();
        synchronized (this.b) {
            try {
                if (!this.c) {
                    vx4 vx4 = this.b;
                    vx4.b.getClass();
                    vx4.b.sendEmptyMessage(2);
                    this.c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
