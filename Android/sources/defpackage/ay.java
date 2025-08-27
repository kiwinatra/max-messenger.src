package defpackage;

import java.io.IOException;
import java.io.InputStream;
import kotlin.Unit;

/* renamed from: ay  reason: default package */
public final class ay implements yfe {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ ay(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void close() {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                cy cyVar = (cy) obj;
                cyVar.i();
                try {
                    ((yfe) this.c).close();
                    Unit unit = Unit.INSTANCE;
                    if (cyVar.j()) {
                        throw cyVar.k((IOException) null);
                    }
                    return;
                } catch (IOException e) {
                    e = e;
                    if (cyVar.j()) {
                        e = cyVar.k(e);
                    }
                    throw e;
                } finally {
                    cyVar.j();
                }
            default:
                ((InputStream) obj).close();
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006b, code lost:
        if (r6 != false) goto L_0x006f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long e(defpackage.rt0 r5, long r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.b
            java.lang.Object r1 = r4.c
            int r4 = r4.a
            switch(r4) {
                case 0: goto L_0x0088;
                default: goto L_0x0009;
            }
        L_0x0009:
            r2 = 0
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0010
            goto L_0x0053
        L_0x0010:
            if (r4 < 0) goto L_0x0078
            r4 = 1
            lkf r1 = (defpackage.lkf) r1     // Catch:{ AssertionError -> 0x0043 }
            r1.f()     // Catch:{ AssertionError -> 0x0043 }
            hod r1 = r5.s0(r4)     // Catch:{ AssertionError -> 0x0043 }
            int r2 = r1.c     // Catch:{ AssertionError -> 0x0043 }
            int r2 = 8192 - r2
            long r2 = (long) r2     // Catch:{ AssertionError -> 0x0043 }
            long r6 = java.lang.Math.min(r6, r2)     // Catch:{ AssertionError -> 0x0043 }
            int r6 = (int) r6     // Catch:{ AssertionError -> 0x0043 }
            java.io.InputStream r0 = (java.io.InputStream) r0     // Catch:{ AssertionError -> 0x0043 }
            byte[] r7 = r1.a     // Catch:{ AssertionError -> 0x0043 }
            int r2 = r1.c     // Catch:{ AssertionError -> 0x0043 }
            int r6 = r0.read(r7, r2, r6)     // Catch:{ AssertionError -> 0x0043 }
            r7 = -1
            if (r6 != r7) goto L_0x0048
            int r6 = r1.b     // Catch:{ AssertionError -> 0x0043 }
            int r7 = r1.c     // Catch:{ AssertionError -> 0x0043 }
            if (r6 != r7) goto L_0x0045
            hod r6 = r1.a()     // Catch:{ AssertionError -> 0x0043 }
            r5.a = r6     // Catch:{ AssertionError -> 0x0043 }
            defpackage.zod.a(r1)     // Catch:{ AssertionError -> 0x0043 }
            goto L_0x0045
        L_0x0043:
            r5 = move-exception
            goto L_0x0054
        L_0x0045:
            r2 = -1
            goto L_0x0053
        L_0x0048:
            int r7 = r1.c     // Catch:{ AssertionError -> 0x0043 }
            int r7 = r7 + r6
            r1.c = r7     // Catch:{ AssertionError -> 0x0043 }
            long r0 = r5.b     // Catch:{ AssertionError -> 0x0043 }
            long r2 = (long) r6     // Catch:{ AssertionError -> 0x0043 }
            long r0 = r0 + r2
            r5.b = r0     // Catch:{ AssertionError -> 0x0043 }
        L_0x0053:
            return r2
        L_0x0054:
            java.util.logging.Logger r6 = defpackage.ula.a
            java.lang.Throwable r6 = r5.getCause()
            r7 = 0
            if (r6 == 0) goto L_0x006e
            java.lang.String r6 = r5.getMessage()
            if (r6 == 0) goto L_0x006a
            java.lang.String r0 = "getsockname failed"
            boolean r6 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r6, (java.lang.CharSequence) r0, false, 2, (java.lang.Object) null)
            goto L_0x006b
        L_0x006a:
            r6 = r7
        L_0x006b:
            if (r6 == 0) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            r4 = r7
        L_0x006f:
            if (r4 == 0) goto L_0x0077
            java.io.IOException r4 = new java.io.IOException
            r4.<init>(r5)
            throw r4
        L_0x0077:
            throw r5
        L_0x0078:
            java.lang.String r4 = "byteCount < 0: "
            java.lang.String r4 = defpackage.wj6.i(r6, r4)
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        L_0x0088:
            cy r0 = (defpackage.cy) r0
            r0.i()
            yfe r1 = (defpackage.yfe) r1     // Catch:{ IOException -> 0x00a2 }
            long r4 = r1.e(r5, r6)     // Catch:{ IOException -> 0x00a2 }
            boolean r6 = r0.j()
            if (r6 != 0) goto L_0x009a
            return r4
        L_0x009a:
            r4 = 0
            java.io.IOException r4 = r0.k(r4)
            throw r4
        L_0x00a0:
            r4 = move-exception
            goto L_0x00af
        L_0x00a2:
            r4 = move-exception
            boolean r5 = r0.j()     // Catch:{ all -> 0x00a0 }
            if (r5 != 0) goto L_0x00aa
            goto L_0x00ae
        L_0x00aa:
            java.io.IOException r4 = r0.k(r4)     // Catch:{ all -> 0x00a0 }
        L_0x00ae:
            throw r4     // Catch:{ all -> 0x00a0 }
        L_0x00af:
            r0.j()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ay.e(rt0, long):long");
    }

    public final lkf q() {
        switch (this.a) {
            case 0:
                return (cy) this.b;
            default:
                return (lkf) this.c;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "AsyncTimeout.source(" + ((yfe) this.c) + ')';
            default:
                return "source(" + ((InputStream) this.b) + ')';
        }
    }
}
