package defpackage;

/* renamed from: zt7  reason: default package */
public final class zt7 {
    public static final String g = Integer.toString(0, 36);
    public static final String h = Integer.toString(1, 36);
    public static final String i = Integer.toString(2, 36);
    public static final String j = Integer.toString(3, 36);
    public static final String k = Integer.toString(4, 36);
    public static final String l = Integer.toString(5, 36);
    public final int a;
    public final long b;
    public final Object c;
    public final int d;
    public final ds8 e;
    public final iwd f;

    static {
        int i2 = v0g.a;
    }

    public zt7(int i2, long j2, ds8 ds8, iwd iwd, Object obj, int i3) {
        this.a = i2;
        this.b = j2;
        this.e = ds8;
        this.f = iwd;
        this.c = obj;
        this.d = i3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.zt7 a(android.os.Bundle r10) {
        /*
            java.lang.String r0 = g
            r1 = 0
            int r3 = r10.getInt(r0, r1)
            java.lang.String r0 = h
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r4 = r10.getLong(r0, r4)
            java.lang.String r0 = i
            android.os.Bundle r0 = r10.getBundle(r0)
            r2 = 0
            if (r0 != 0) goto L_0x001c
            r6 = r2
            goto L_0x0021
        L_0x001c:
            ds8 r0 = defpackage.ds8.a(r0)
            r6 = r0
        L_0x0021:
            java.lang.String r0 = l
            android.os.Bundle r0 = r10.getBundle(r0)
            if (r0 == 0) goto L_0x002f
            iwd r0 = defpackage.iwd.a(r0)
        L_0x002d:
            r7 = r0
            goto L_0x0038
        L_0x002f:
            if (r3 == 0) goto L_0x0037
            iwd r0 = new iwd
            r0.<init>(r3)
            goto L_0x002d
        L_0x0037:
            r7 = r2
        L_0x0038:
            java.lang.String r0 = k
            int r9 = r10.getInt(r0)
            r0 = 1
            if (r9 == r0) goto L_0x007f
            r0 = 2
            java.lang.String r8 = j
            if (r9 == r0) goto L_0x0081
            r0 = 3
            if (r9 == r0) goto L_0x0053
            r10 = 4
            if (r9 != r10) goto L_0x004d
            goto L_0x007f
        L_0x004d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>()
            throw r10
        L_0x0053:
            android.os.IBinder r10 = r10.getBinder(r8)
            if (r10 != 0) goto L_0x005a
            goto L_0x007f
        L_0x005a:
            tb7 r10 = defpackage.gv0.a(r10)
            qb7 r0 = defpackage.tb7.o()
        L_0x0062:
            int r2 = r10.size()
            if (r1 >= r2) goto L_0x007b
            java.lang.Object r2 = r10.get(r1)
            android.os.Bundle r2 = (android.os.Bundle) r2
            r2.getClass()
            ir8 r2 = defpackage.ir8.b(r2)
            r0.a(r2)
            int r1 = r1 + 1
            goto L_0x0062
        L_0x007b:
            k0d r2 = r0.j()
        L_0x007f:
            r8 = r2
            goto L_0x008d
        L_0x0081:
            android.os.Bundle r10 = r10.getBundle(r8)
            if (r10 != 0) goto L_0x0088
            goto L_0x007f
        L_0x0088:
            ir8 r2 = defpackage.ir8.b(r10)
            goto L_0x007f
        L_0x008d:
            zt7 r10 = new zt7
            r2 = r10
            r2.<init>(r3, r4, r6, r7, r8, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zt7.a(android.os.Bundle):zt7");
    }
}
