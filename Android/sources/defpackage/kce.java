package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: kce  reason: default package */
public final class kce extends jkf {
    public static final Object q = new Object();
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final Object n;
    public final ir8 o;
    public final wq8 p;

    static {
        oq8 oq8 = new oq8();
        gc4 gc4 = new gc4();
        List emptyList = Collections.emptyList();
        k0d k0d = k0d.v;
        uq8 uq8 = new uq8();
        ar8 ar8 = ar8.d;
        Uri uri = Uri.EMPTY;
        n79.n(((Uri) gc4.e) == null || ((UUID) gc4.d) != null);
        if (uri != null) {
            new xq8(uri, (String) null, ((UUID) gc4.d) != null ? new tq8(gc4) : null, (mq8) null, emptyList, (String) null, k0d, (Object) null, -9223372036854775807L);
        }
        oq8.c();
        uq8.a();
        us8 us8 = us8.J;
    }

    public kce(long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, v02 v02, ir8 ir8, wq8 wq8) {
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = j5;
        this.i = j6;
        this.j = j7;
        this.k = z;
        this.l = z2;
        this.m = z3;
        this.n = v02;
        ir8.getClass();
        this.o = ir8;
        this.p = wq8;
    }

    public final int b(Object obj) {
        return q.equals(obj) ? 0 : -1;
    }

    public final ekf g(int i2, ekf ekf, boolean z) {
        n79.i(i2, 1);
        Object obj = z ? q : null;
        long j2 = -this.i;
        ekf.getClass();
        ekf.j((Object) null, obj, 0, this.g, j2, q9.g, false);
        return ekf;
    }

    public final int i() {
        return 1;
    }

    public final Object m(int i2) {
        n79.i(i2, 1);
        return q;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (r1 > r3) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.hkf n(int r25, defpackage.hkf r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 1
            r2 = r25
            defpackage.n79.i(r2, r1)
            long r1 = r0.j
            boolean r14 = r0.l
            if (r14 == 0) goto L_0x002d
            boolean r3 = r0.m
            if (r3 != 0) goto L_0x002d
            r3 = 0
            int r3 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x002d
            long r3 = r0.h
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0026
        L_0x0023:
            r16 = r5
            goto L_0x002f
        L_0x0026:
            long r1 = r1 + r27
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x002d
            goto L_0x0023
        L_0x002d:
            r16 = r1
        L_0x002f:
            java.lang.Object r4 = defpackage.hkf.q
            long r1 = r0.h
            r18 = r1
            r20 = 0
            ir8 r5 = r0.o
            java.lang.Object r6 = r0.n
            long r7 = r0.e
            long r9 = r0.f
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            boolean r13 = r0.k
            wq8 r15 = r0.p
            r21 = 0
            long r0 = r0.i
            r22 = r0
            r3 = r26
            r3.b(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r26
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kce.n(int, hkf, long):hkf");
    }

    public final int p() {
        return 1;
    }
}
