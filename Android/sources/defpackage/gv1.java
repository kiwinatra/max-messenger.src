package defpackage;

import java.net.URL;

/* renamed from: gv1  reason: default package */
public final class gv1 {
    public int a;
    public long b;
    public Object c;

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Exception, code=java.lang.Throwable, for r5v0, types: [java.lang.Throwable, java.lang.Object, java.lang.Exception] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public gv1(long r3, java.lang.Throwable r5) {
        /*
            r2 = this;
            r2.<init>()
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 - r3
            r2.b = r0
            boolean r3 = r5 instanceof androidx.camera.core.impl.CameraValidator$CameraIdListIncorrectException
            r4 = 2
            if (r3 == 0) goto L_0x0014
            r2.a = r4
            r2.c = r5
            goto L_0x0038
        L_0x0014:
            boolean r3 = r5 instanceof androidx.camera.core.InitializationException
            r0 = 0
            if (r3 == 0) goto L_0x0034
            java.lang.Throwable r3 = r5.getCause()
            if (r3 == 0) goto L_0x0020
            r5 = r3
        L_0x0020:
            r2.c = r5
            boolean r3 = r5 instanceof androidx.camera.core.CameraUnavailableException
            if (r3 == 0) goto L_0x0029
            r2.a = r4
            goto L_0x0038
        L_0x0029:
            boolean r3 = r5 instanceof java.lang.IllegalArgumentException
            if (r3 == 0) goto L_0x0031
            r3 = 1
            r2.a = r3
            goto L_0x0038
        L_0x0031:
            r2.a = r0
            goto L_0x0038
        L_0x0034:
            r2.a = r0
            r2.c = r5
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gv1.<init>(long, java.lang.Exception):void");
    }

    public gv1(int i, URL url, long j) {
        this.a = i;
        this.c = url;
        this.b = j;
    }
}
